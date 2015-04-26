package sample.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.slf4j.*;

import sample.di.business.config.AppConfig;
import sample.di.business.domain.Product;
import sample.di.business.service.MessageService;
import sample.di.business.service.ProductService;

/**
 * 
 * @author aloha.wave
 *
 */
public class ProductServiceRun {

    private static Logger log = LoggerFactory.getLogger(ProductServiceRun.class);    
    
    public static void main(String[] args) {
        log.info("start");
        
        ProductServiceRun productServiceRun = new ProductServiceRun();
        productServiceRun.execute();
        log.info("end");
    }

    private void execute() {
        // java annotation based の場合
        //AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        
        // appliactionContext.xml　で宣言した場合
        ApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");
        
        // inject to property sample
        ProductService producService = ctx.getBean(ProductService.class);
        Product product = producService.findProduct("hoge");
        log.info(product.toString());
        
        // define message in config file sample
        MessageService messageService = ctx.getBean(MessageService.class);
        log.info("MessageService : {}", messageService.getMessage());
        
        ((ClassPathXmlApplicationContext)ctx).close();
        //ctx.close();
    }

}
