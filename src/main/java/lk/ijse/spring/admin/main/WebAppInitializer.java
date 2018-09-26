package lk.ijse.spring.admin.main;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{WebRootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebAppConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    @Override
    protected void customizeRegistration(ServletRegistration.Dynamic registration) {
        registration.setMultipartConfig(getMultipartConfigElement());
    }

    private MultipartConfigElement getMultipartConfigElement() {
        MultipartConfigElement multipartConfigElement = new MultipartConfigElement(LOCATION, MAX_FILE_SIZE, MAX_REQUEST_SIZE, FILE_SIZE_THRESHOLD);
        return multipartConfigElement;
    }

    private static final String LOCATION = "E:\\3rdSemFinal\\AFC Family Restaurant\\images\\"; // Temporary location where files will be stored

    private static final long MAX_FILE_SIZE = 104857600; // 5MB : Max file size.
    // Beyond that size spring will throw exception.
    private static final long MAX_REQUEST_SIZE = 104857600; // 20MB : Total request size containing Multi part.

    private static final int FILE_SIZE_THRESHOLD = 0; // Size threshold after which files will be written to disk

}
