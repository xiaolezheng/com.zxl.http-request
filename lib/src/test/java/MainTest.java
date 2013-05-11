import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.kevinsawicki.http.HttpRequest;


public class MainTest {
  private static Logger log = LoggerFactory.getLogger(MainTest.class);
  /**
   * @param args
   */
  public static void main(String[] args) {
    // Perform a GET request and get the status of the response
    /*int code = HttpRequest.get("http://google.com").code();
    log.debug("code is {}",code);*/

    //Perform a GET request and get the body of the response
    /*String response = HttpRequest.get("http://google.com").body();
    log.debug("body is {}",response);*/


    log.debug("-----------------------------------------------------");
    //Print the response of a GET request to standard out
    /*HttpRequest.get("http://google.com").receive(System.out);

    HttpRequest request = HttpRequest.get("http://google.com", true, 'q', "baseball gloves", "size", 100);
    log.debug("body is {}",request.toString());*/


    //Working with request/response headers
    /*HttpRequest request = HttpRequest.get("http://google.com")
                                    .accept("application/json"); //Sets request header

    log.debug("contetType is {}",request.contentType());
    log.debug("lastModified is {}",request.lastModified());
    log.debug("contentLength is {}",request.contentLength());
    log.debug("headers is {}",request.headers());
    log.debug("body is {}",request.body());*/

    //Authenticate using Basic authentication
    /*int code = HttpRequest.get("http://google.com").basic("username", "p4ssw0rd").code();
    log.debug("code is {}",code);*/

    //Perform a POST request with some data and get the status of the response
    /*int code = HttpRequest.post("http://google.com").send("name=kevin").code();
    log.debug("code is {}",code);*/


    //Perform a multipart POST request

    HttpRequest request = HttpRequest.post("http://google.com");
    request.part("status[body]", "Making a multipart request");
    request.part("status[image]", new File("/home/kevin/Pictures/ide.png"));
    if (request.ok())
      System.out.println("Status was updated");
  }

}
