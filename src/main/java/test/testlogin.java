package test;

import java.util.ArrayList;

import org.apache.tomcat.jakartaee.commons.compress.archivers.zip.X000A_NTFS;

import controller.student;
import controller.tracuu;
import dao.student_dao;

public class testlogin {
	public static void main(String[] args) {
		student student1 = tracuu.getInstance().getStudent();
		System.out.print(student1);
	}
}
