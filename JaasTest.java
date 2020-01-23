import javax.security.auth.Subject;
import javax.security.auth.login.LoginContext;

public class JaasTest {

  public static void main(String[] args) throws Exception
  {
    if(args.length != 2){
      System.err.println("ERROR : JaasTest would need Login context Name and jaas file path as argument.");
      System.err.println("Note: Login Context Name should match the name mentioned jaas file");
      System.err.println("java JaasTest <jaasFilePath> <contextName>");
      System.exit(1);
    }
    System.setProperty("java.security.auth.login.config", args[0]);
    LoginContext lc = new LoginContext(args[1]);

    lc.login();

    Subject subject = lc.getSubject();
    System.out.println("subject: "+subject.toString());

    lc.logout();
  }
}
