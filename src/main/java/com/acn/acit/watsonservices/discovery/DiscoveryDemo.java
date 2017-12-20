package com.acn.acit.watsonservices.discovery;

import com.ibm.watson.developer_cloud.discovery.v1.Discovery;
import com.ibm.watson.developer_cloud.discovery.v1.model.query.QueryRequest;
import com.ibm.watson.developer_cloud.discovery.v1.model.query.QueryResponse;

public class DiscoveryDemo {

	public static void main(String[] args) {
		Discovery discovery = new Discovery("2017-11-07");
		discovery.setEndPoint("https://gateway.watsonplatform.net/discovery/api/");
		discovery.setUsernameAndPassword("6780436a-0ed6-4b16-80e7-7e6ac8bc2942", "azLpDfMj07MM");
		String environmentId = "18564e33-0ab0-46ed-860f-7b2e9d93cc14";
		String collectionId = "0026cbdc-9e9a-4d4e-8f1f-ef1f39f5fd53";

		QueryRequest.Builder queryBuilder = new QueryRequest.Builder(environmentId, collectionId);
		queryBuilder.query("enriched_text.entities.text:IBM");
		QueryResponse queryResponse = discovery.query(queryBuilder.build()).execute();
		System.out.println(queryResponse);
	}
}
