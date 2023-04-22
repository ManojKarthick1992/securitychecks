import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Keyvaltconnection {

    private static void getAccessToken(String authorization, String resource) throws InterruptedException, ExecutionException, MalformedURLException {

        String clientId = System.getProperty("dbClientID"); // Client ID
        String clientKey = System.getProperty("dbSecretID");  //Client Secret
        clientKey = "123456";

    }
}
