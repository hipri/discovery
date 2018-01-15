package com.acn.acit.watsonservices.discovery;

import com.ibm.watson.developer_cloud.discovery.v1.Discovery;
import com.ibm.watson.developer_cloud.discovery.v1.model.query.QueryRequest;
import com.ibm.watson.developer_cloud.discovery.v1.model.query.QueryResponse;

public class DiscoveryDemo {

	public static void main(String[] args) {
		Discovery discovery = new Discovery("2017-11-07");
		discovery.setEndPoint("https://gateway.watsonplatform.net/discovery/api/");
		discovery.setUsernameAndPassword("b27ca3a2-ccee-43c0-ab97-90b758a480d3", "UTfvlaUg1DlZ");
		String environmentId = "5f4d2912-39c4-4f8d-b38a-ee5c228457f8";
		String collectionId = "16de0c9d-d456-457b-92d9-4075cae65f2c";

		QueryRequest.Builder queryBuilder = new QueryRequest.Builder(environmentId, collectionId);
		queryBuilder.query("enriched_text.entities.text:IBM");
		QueryResponse queryResponse = discovery.query(queryBuilder.build()).execute();
		System.out.println(queryResponse);
	}
}
