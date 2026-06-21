package org.webservices.testrunner.suites

import io.ktor.http.HttpStatusCode
import org.webservices.testrunner.framework.*

suspend fun TestRunner.alertmanagerMonitoringTests() = suite("Alertmanager Monitoring Tests") {
test("AlertManager status endpoint") {
        
        val response = client.getRawResponse("http://alertmanager:9093/-/ready")
        response.status shouldBe HttpStatusCode.OK
        println("      ✓ AlertManager ready endpoint accessible")
    }

    test("AlertManager alerts endpoint") {
        
        val response = client.getRawResponse("http://alertmanager:9093/api/v2/alerts")
        response.status shouldBe HttpStatusCode.OK
        println("      ✓ AlertManager alerts API accessible")
    }
}
