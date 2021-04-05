package com.titles.dao;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;


@ExtendWith(SpringExtension.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
@ContextConfiguration(classes = {TestDbConfig.class})
class DirectorDaoAggregatorTest {

    @Autowired
    private DirectorDtoDao directorDtoDao;
//    @Test
//    void findAllCalculatingProfit() {
//        var directorDto = directorDtoDao.findByIdCalculatingProfit(3).orElseThrow();
//        Assertions.assertEquals(4.0, directorDto.getProfitMultiplier());
//        Assertions.assertEquals(450, directorDto.getProfitAverage());
//    }
}