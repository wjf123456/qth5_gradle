package initilalizer;

import config.HttpSessionConfig;
import config.RootConfig;
import config.WebConfig;
import config.WebSecurityConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class WebAppInitializer
        extends AbstractAnnotationConfigDispatcherServletInitializer {

        @Override
        protected Class<?>[] getRootConfigClasses() {
            return new Class<?>[]{
                    RootConfig.class,
                    WebSecurityConfig.class,
                    HttpSessionConfig.class,
            };
        }

        @Override
        protected Class<?>[] getServletConfigClasses() {
            return new Class<?>[]{WebConfig.class};
        }

        @Override
        protected String[] getServletMappings() {
            return new String[]{"/"};
        }


}
