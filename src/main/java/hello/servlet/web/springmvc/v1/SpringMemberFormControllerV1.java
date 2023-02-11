package hello.servlet.web.springmvc.v1;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@Component
//@RequestMapping
public class SpringMemberFormControllerV1 {

    @RequestMapping("/springmvc/v1/members/new-form") // 구현될 view 위치
    public ModelAndView process() {
        return new ModelAndView("new-form"); // ModelAndView에 view 이름을 넣어서 반환
    }
}

/**
 * @Controller 는 컴포넌트를 가지고 있기에 자동으로 컴포넌트 스캔 대상이 되고
 * 핸들러매핑에 대한 대상이 된다.
 * @Controller 또는 @Component가 있으면 핸들러 매핑의 대상이 된다.
 * @Component 를 쓰려면 @RequestMapping이 메소드 단위가 아닌 클래스 단위에 적혀있어야 함.
 *
 */