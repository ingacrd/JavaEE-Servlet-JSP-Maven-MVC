package com.ingaru;

import java.io.IOException;
import java.util.List;
import java.io.File;

import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import org.apache.commons.io.FileCleaningTracker;

import jakarta.servlet.annotation.WebServlet;


import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import org.apache.commons.fileupload2.core.*;
import org.apache.commons.fileupload2.jakarta.servlet6.*;

@WebServlet("/upload")
public class FileUpload extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		//JakartaServletFileUpload sf = new JakartaServletFileUpload(new DiskFileItemFactory());
		JakartaServletFileUpload sf = new JakartaServletFileUpload(
			    DiskFileItemFactory.builder().get()
			);

		List<FileItem> multifiles = sf.parseRequest(request);

		for(FileItem item: multifiles) {
			File file = new File("C:\\Users\\carolina.ruiz\\eclipse-workspace\\servlet\\ServletJSPMaven\\" + item.getName());
			item.write(file.toPath());
		}

		System.out.println("FILE UPLOADED");
	}

}
