package org.motechproject.openlmiscore.service.it;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.motechproject.openlmiscore.domain.Product;
import org.motechproject.openlmiscore.repository.ProductDataService;
import org.motechproject.openlmiscore.service.ProductService;
import org.motechproject.testing.osgi.BasePaxIT;
import org.motechproject.testing.osgi.container.MotechNativeTestContainerFactory;
import org.ops4j.pax.exam.ExamFactory;
import org.ops4j.pax.exam.junit.PaxExam;
import org.ops4j.pax.exam.spi.reactors.ExamReactorStrategy;
import org.ops4j.pax.exam.spi.reactors.PerSuite;

import javax.inject.Inject;

import static org.junit.Assert.assertEquals;

@RunWith(PaxExam.class)
@ExamReactorStrategy(PerSuite.class)
@ExamFactory(MotechNativeTestContainerFactory.class)
public class ProductServiceBundleIT extends BasePaxIT {

    @Inject
    private ProductService productService;

    @Inject
    private ProductDataService productDataService;

    @Test
    public void testCreateProduct() {
        Product product = new Product();
        product.setCode("testCode");
        productDataService.create(product);
        assertEquals(1, productDataService.count());
    }
}
