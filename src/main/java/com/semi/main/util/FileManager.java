package com.semi.main.util;


import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.view.AbstractView;

import com.semi.main.file.FileDTO;

@Component
public class FileManager extends AbstractView{
	
	//filedown
	@Override
	protected void renderMergedOutputModel(Map<String, Object> model, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("fileManager");
		String b = (String)model.get("notice");
		FileDTO fileDTO = (FileDTO)model.get("file");
		
		//1. 파일 경로준비
		String path = "/resources/upload/"+b;
		path = request.getSession().getServletContext().getRealPath(path);
		
		//2. 파일객체 생성
		File file = new File(path, fileDTO.getFileName());
		
		//3. 총 파일의 크기
		response.setContentLength((int)file.length());
		
		//4. 다운시 파일이름을 지정 및 인코딩 설정
		String downName = fileDTO.getOriginalName();
		downName = URLEncoder.encode(downName, "UTF-8");
		
		//5.header 정보 설정
		response.setHeader("Content-Disposition", "attachment;fileName=\""+downName+"\"");
		response.setHeader("Content-Transfer-Encoding", "binary");
		
		//6. 전송
		FileInputStream is = new FileInputStream(file); //서버로 읽어들여라
		OutputStream os = response.getOutputStream(); //
		
		FileCopyUtils.copy(is, os);
		
		//7. 자원해제 연결된 역순으로 해제 해야함
		os.close();
		is.close();
		
		
	}
		
	
	
	
	//fileSave
	public String fileSave(String path, HttpSession session, MultipartFile multipartFile)throws Exception{
		//파일의 정보를 이용해서 HDD에 파일을 저장
		
		//1. 어디에 저장??
		
		
		//2. 실제 경로 알아오기
		//jsp : application
		//java : ServletContext
		String realPath = session.getServletContext().getRealPath(path);
		System.out.println(realPath);
		
		File file = new File(realPath);
		
		if(!file.exists()) {
			file.mkdirs();
		}
		
		//3. 어떤이름으로 저장??
		//1. 시간을 이용
//		Calendar ca = Calendar.getInstance();
//		long result = ca.getTimeInMillis();
//		file = new File(file, result+"_"+multipartFile.getOriginalFilename());
		//2. API 사용 
		String uId =UUID.randomUUID().toString();
		uId = uId+"_"+multipartFile.getOriginalFilename();
		System.out.println(uId);
		file = new File(file, uId);
		
		
		
		//4. 파일을 저장
		//A. Spring에서 제공하는 API FileCopyUtils copy메서드
		//FileCopyUtils.copy(multipartFile.getBytes(), file);
		
		//B. MultipartFile의 transferTo메서드
		multipartFile.transferTo(file);
		
		return uId;
		
	}

}