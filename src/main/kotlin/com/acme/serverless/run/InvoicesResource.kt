package com.acme.serverless.run

import org.apache.poi.xssf.usermodel.XSSFWorkbook
import java.io.ByteArrayOutputStream
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/hello")
class InvoicesResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun hello(): String {
        val workbook = XSSFWorkbook()
        workbook.createSheet("sheet one")
                .createRow(1)
                .createCell(1)
                .setCellValue("one")

        ByteArrayOutputStream().also { output ->
            workbook.write(output)
        }.toByteArray()
        return "hello"
    }
}