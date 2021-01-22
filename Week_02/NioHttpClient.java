package my.nio;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class NioHttpClient {
    static CloseableHttpClient httpClient = HttpClientBuilder.create().build();

    public static void main(String[] args) {
        HttpGet httpGet = new HttpGet("http://127.0.0.1:8801");
        try {
            CloseableHttpResponse response = httpClient.execute(httpGet);
            HttpEntity entity = response.getEntity();
            System.out.println("响应状态为:" + response.getStatusLine());
            if (entity != null) {
                System.out.println("响应内容长度为:" + entity.getContentLength());
                System.out.println("响应内容为:" + EntityUtils.toString(entity));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
