package junit.org.rapidpm.demo.reflection;


public class TestImplStaticLoggingProxy extends TestImpl {

  private TestImpl delegator;

  public TestImplStaticLoggingProxy() {
    super();
  }

  public TestImplStaticLoggingProxy withDelegator(final TestImpl delegator) {
    this.delegator = delegator;
    return this;
  }

  public String doWork() {
    return delegator.doWork();
  }

  public int hashCode() {
    return delegator.hashCode();
  }

  public boolean equals(final Object arg0) {
    return delegator.equals(arg0);
  }

  public String toString() {
    return delegator.toString();
  }
}
