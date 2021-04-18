package lv.lu.finalwork;

import lv.lu.finalwork.ui.ConsulUI;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProductAccountingApplication {

    public static void main(String[] args) {

//        Map<Long, Product> repository = new HashMap<>();
//        ProductRepository productRepository = new ProductRepository(repository);
//        ProductMapper productMapper = new ProductMapper();
//        ProductService service = new ProductService(productRepository, productMapper);
//        Scanner scanner = new Scanner(System.in);
//        ConsulUI consulUI = new ConsulUI(service, scanner);
//
//        consulUI.startUi();

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ConsulUI consulUI = context.getBean(ConsulUI.class);
        consulUI.startUi();
    }

}
