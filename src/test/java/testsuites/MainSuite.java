package testsuites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import testscripts.HomePageTests;

@RunWith(Suite.class)
@Suite.SuiteClasses({ HomePageTests.class, HomePageTests.class })
public class MainSuite {
}
