/**
 * 
 */
/**
 * @author DELL
 *
 */
module AimsProject {
	requires java.desktop;
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.controls;

	requires javafx.media;
	requires javafx.swing;
	requires javafx.base;
	requires java.naming;

	opens hust.soict.globalict.aims.screen to javafx.graphics, javafx.fxml,javafx.embed.swing,javafx.application;
	opens hust.soict.globalict.aims.media to javafx.base;
}