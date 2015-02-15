package com.rainy.sneaker;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.markdown4j.Markdown4jProcessor;
import org.pegdown.PegDownProcessor;
import org.xhtmlrenderer.simple.Graphics2DRenderer;
import org.xhtmlrenderer.swing.Java2DRenderer;
import org.xhtmlrenderer.util.FSImageWriter;

import com.rainy.common.tools.FileUtil;

public class MarkDownTest {
	public static void main(String[] args) throws IOException {
		String mdText = FileUtil.readString(
				"E:\\桌面\\法国跑车的新靴 -- Tony Parker Ⅱ测评.md",
				FileUtil.DEFAULT_CHARSET);
		String html = new Markdown4jProcessor().process(mdText);
		//String html = pegDown(mdText);
		System.out.println(html);
		FileUtil.writeString("<html>"+html+"</html>","E:\\桌面\\test.html",FileUtil.DEFAULT_CHARSET);
		render(new File("E:\\桌面\\test.html"));
	}

	private static void render(File htmlFile) throws IOException {
		if (htmlFile.exists()) {
			Java2DRenderer renderer = new Java2DRenderer(htmlFile, 1024);
			renderer.setBufferedImageType(BufferedImage.TYPE_INT_RGB);
			BufferedImage image = renderer.getImage();

			FSImageWriter imageWriter = new FSImageWriter();
			String path = htmlFile.getAbsolutePath();
			path = path.substring(0, path.lastIndexOf("."));
			imageWriter.write(image, path + ".png");

			// compare to old
			BufferedImage img = Graphics2DRenderer.renderToImageAutoSize(htmlFile
					.toURI().toURL().toExternalForm(), 1024,
					BufferedImage.TYPE_INT_ARGB);
			ImageIO.write(img, "png", new File(path + "-G2DR.png"));

		} else {
			usage("File to render is not found: " + htmlFile.getAbsolutePath());
		}
	}
	
	/**
	 * prints out usage information, with optional error message
	 */
	private static void usage(String err) {
		if (err != null && err.length() > 0) {
			System.err.println("==>" + err);
		}
		System.err.println("Usage: ... [url]");
		System.exit(1);
	}
	
	private static String pegDown(String source){
		PegDownProcessor pg = new PegDownProcessor();
		return pg.markdownToHtml(source);
	}
}
