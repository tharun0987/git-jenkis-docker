package com.test.dockertest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DockertestApplicationTests {

	@Autowired
	Controller controller;
	@Test
	void contextLoads() {
		String to ="maulishreeparuriya@gmail.com";
		String subject="Good Night";
		String htmlBody="<!DOCTYPE html>\n" +
				"<html lang=\"en\">\n" +
				"<head>\n" +
				"  <meta charset=\"UTF-8\">\n" +
				"  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
				"  <title>Goodnight Message for My Wife</title>\n" +
				"  <style>\n" +
				"    body {\n" +
				"      font-family: Arial, sans-serif;\n" +
				"      margin: 0;\n" +
				"      overflow: hidden;\n" +
				"      background-color: #000;\n" +
				"    }\n" +
				"\n" +
				"    .stars {\n" +
				"      background-image: url('https://images.unsplash.com/photo-1506748686214-e9df14d4d9d0');\n" +
				"      background-size: cover;\n" +
				"      background-position: center;\n" +
				"      position: fixed;\n" +
				"      top: 0;\n" +
				"      left: 0;\n" +
				"      width: 100%;\n" +
				"      height: 100%;\n" +
				"      z-index: -1;\n" +
				"      animation: twinkling 20s linear infinite;\n" +
				"    }\n" +
				"\n" +
				"    @keyframes twinkling {\n" +
				"      0% { opacity: 0.1; }\n" +
				"      50% { opacity: 0.3; }\n" +
				"      100% { opacity: 0.1; }\n" +
				"    }\n" +
				"\n" +
				"    .container {\n" +
				"      max-width: 600px;\n" +
				"      margin: 20px auto;\n" +
				"      padding: 20px;\n" +
				"      background-color: rgba(255, 255, 255, 0.9); /* Semi-transparent white background */\n" +
				"      border-radius: 10px;\n" +
				"      box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n" +
				"    }\n" +
				"\n" +
				"    h1 {\n" +
				"      color: #333;\n" +
				"      text-align: center;\n" +
				"    }\n" +
				"\n" +
				"    p {\n" +
				"      color: #333;\n" +
				"      line-height: 1.6;\n" +
				"    }\n" +
				"  </style>\n" +
				"</head>\n" +
				"<body>\n" +
				"  <div class=\"stars\"></div>\n" +
				"  <div class=\"container\">\n" +
				"    <h1>Sweet Dreams, My Love \uD83D\uDC96</h1>\n" +
				"    <p>My Dearest Maulishree,</p>\n" +
				"    <p>As the day comes to a close and the stars begin to sparkle in the night sky, I find myself overwhelmed with gratitude for having you in my life. Your presence brings warmth to my heart and joy to my soul.</p>\n" +
				"    <p>As you lay your head upon your pillow tonight, I want you to know just how much you mean to me. You are the light of my life, the one who fills my days with laughter and love. Each moment spent with you is a treasure I hold dear.</p>\n" +
				"    <p>May your dreams be as beautiful as you are, filled with happiness, peace, and all the things that make your heart smile. And as you drift off to sleep, remember that you are cherished beyond measure.</p>\n" +
				"    <p>Rest well, my love, for tomorrow awaits with new adventures and endless possibilities. I'll be here, holding you close in my thoughts and heart until the morning light.</p>\n" +
				"    <p>Goodnight, my darling. Sleep tight and dream of us together.</p>\n" +
				"    <p>With all my love,</p>\n" +
				"    <p>[Your Name]</p>\n" +
				"  </div>\n" +
				"</body>\n" +
				"</html>\n";
controller.sendHtmlMessage(to,subject,htmlBody);

	}

}
