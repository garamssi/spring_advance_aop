package hello.aop.member;

import java.lang.annotation.*;

@Target( ElementType.TYPE )
@Retention( RetentionPolicy.RUNTIME)
public @interface ClassAop {
}