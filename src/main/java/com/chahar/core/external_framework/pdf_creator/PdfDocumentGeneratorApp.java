package com.chahar.core.external_framework.pdf_creator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Chapter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.CMYKColor;
import com.itextpdf.text.pdf.PdfWriter;

public class PdfDocumentGeneratorApp {
	private static Font blueFont = FontFactory.getFont(FontFactory.HELVETICA, 8, Font.NORMAL, new CMYKColor(255, 0, 0, 0));
	private static Font redFont = FontFactory.getFont(FontFactory.COURIER, 12, Font.BOLD, new CMYKColor(0, 255, 0, 0));
	private static Font yellowFont = FontFactory.getFont(FontFactory.COURIER, 14, Font.BOLD, new CMYKColor(0, 0, 255, 0));
	
	public static void main(String[] args) {
		String USER_PASSWORD = "yashpal";
		String OWNER_PASSWORD = "chahar";
		
		Document document = new Document();
	      try
	      {
	         PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("HelloWorld.pdf"));
	         
	         writer.setEncryption(USER_PASSWORD.getBytes(), OWNER_PASSWORD.getBytes(), PdfWriter.ALLOW_PRINTING, PdfWriter.ENCRYPTION_AES_256);
	         
	         //META DATA
	         createMetadata(document);
	         
	         document.open();
	         document.add(new Paragraph("A Hello World PDF document. This document is password protected."));
	         
	         //Paragraph with color and font styles
	         colorfulFontContent(document);
	         
	         //Alignment Paragraph
	         paragraphAlignmentContent(document);
	            
	         
	         document.close();
	         writer.close();
	      } catch (DocumentException e)
	      {
	         e.printStackTrace();
	      } catch (FileNotFoundException e)
	      {
	         e.printStackTrace();
	      }
	}

	private static void paragraphAlignmentContent(Document document) throws DocumentException {
		// RIGHT
		Paragraph paragraph = new Paragraph("This is right aligned text");
		paragraph.setAlignment(Element.ALIGN_RIGHT);
		document.add(paragraph);
         
		// Centered
		paragraph = new Paragraph("This is centered text");
		paragraph.setAlignment(Element.ALIGN_CENTER);
		document.add(paragraph);
		
		// Left
		paragraph = new Paragraph("This is left aligned text");
		paragraph.setAlignment(Element.ALIGN_LEFT);
		document.add(paragraph);
         
		// Left with indentation
		paragraph = new Paragraph("This is left aligned text with indentation");
		paragraph.setAlignment(Element.ALIGN_LEFT);
		paragraph.setIndentationLeft(50);
		document.add(paragraph);
	}

	private static void colorfulFontContent(Document document) throws DocumentException {
		Paragraph paragraphOne = new Paragraph("Some colored paragraph text", redFont);
		document.add(paragraphOne);
     
		 //Create chapter and sections
		 Paragraph chapterTitle = new Paragraph("Chapter Title", yellowFont);
		 Chapter chapter1 = new Chapter(chapterTitle, 1);
		 chapter1.setNumberDepth(0);
     
		 Paragraph sectionTitle = new Paragraph("Section Title", redFont);
		 Section section1 = chapter1.addSection(sectionTitle);
     
		 Paragraph sectionContent = new Paragraph("Section Text content", blueFont);
		 section1.add(sectionContent);
     
		 document.add(chapter1);
	}

	private static void createMetadata(Document document) {
		 document.addTitle("My first PDF");
		 document.addSubject("Using iText");
		 document.addKeywords("Java, PDF, iText");
		 document.addAuthor("Lars Vogel");
		 document.addCreator("Lars Vogel");
	}

}
