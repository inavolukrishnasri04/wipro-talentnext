package MiniProject.com.mile1.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({

    TestGradeA.class,
    TestGradeD.class,
    TestGradeF.class,
    TestNullStudentObject.class,
    TestNullName.class,
    TestNullMarksArray.class,
    TestFindNumberOfNullNames.class,
    TestFindNumberOfNullObjects.class,
    TestFindNumberOfNullMarks.class

})

public class TestSuite {

}
