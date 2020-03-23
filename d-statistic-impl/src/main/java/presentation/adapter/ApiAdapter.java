package presentation.adapter;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

/**
 * ApiAdapter class.
 */
public class ApiAdapter {

  private Client client = ClientBuilder.newClient();

  public String getStatsData() {

    WebTarget target = client.target("http://api.e-stat.go.jp")
        .path("/rest/2.1/app/getStatsData")
        .queryParam("statsDataId", "0003288322");
    //http://api.e-stat.go.jp/rest/2.1/app/getStatsData?appId=&lang=J&statsDataId=0003288322&metaGetFlg=Y&cntGetFlg=N&sectionHeaderFlg=1
    return null;
  }
}
