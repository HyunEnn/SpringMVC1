package hello.servlet.web.springmvc.old;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

@Component("/springmvc/old-controller")
public class OldController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("OldController.handleRequest");
        return new ModelAndView("new-form");
    }
}

/***
 * 1. 핸들러를 조회하고
 * 2. 조회한 핸들러를 처리하기 위해서 핸들러 어뎁터를 조회하고
 * 3. 어뎁터를 통해서 핸들러를 호출하고
 * 4. ModelAndView를 반환한다.
 * 5. viewResolver를 호출하고
 * 6. 뷰를 반환한다.
 * 7. 반환한 뷰를 통해서 render를 통해서 화면 출력
 */