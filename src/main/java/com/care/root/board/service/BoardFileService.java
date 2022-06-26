package com.care.root.board.service;

import org.springframework.web.multipart.MultipartFile;

public interface BoardFileService {
	public String IMAGE_REPO = "C:/images";
	public String getMessage(String msg, String url);
	public String saveFile(MultipartFile file);
	public void deleteImage(String fileName);
}
