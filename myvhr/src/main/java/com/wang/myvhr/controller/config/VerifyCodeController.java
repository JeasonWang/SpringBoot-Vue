package com.wang.myvhr.controller.config;

import com.wang.myvhr.common.VerifyCodeUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;

@RestController
public class VerifyCodeController {
    @GetMapping("/verifyCode")
    public void code(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        VerifyCodeUtils vc = new VerifyCodeUtils();
        BufferedImage image = vc.getImage();
        String text = vc.getText();
        HttpSession session = req.getSession();
        session.setAttribute("index_code", text);
        VerifyCodeUtils.output(image, resp.getOutputStream());
    }
}
