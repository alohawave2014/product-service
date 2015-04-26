package sample.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.slf4j.*;

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
        ApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");
        
        ProductService producService = ctx.getBean(ProductService.class);
        Product product = producService.findProduct("hoge");
        log.info(product.toString());
        
        MessageService messageService = ctx.getBean(MessageService.class);
        log.info("MessageService : {}", messageService.getMessage());
        
        ((ClassPathXmlApplicationContext)ctx).close();
    }

}
