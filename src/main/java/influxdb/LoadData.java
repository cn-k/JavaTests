package influxdb;

import org.influxdb.InfluxDB;
import org.influxdb.InfluxDBFactory;
import org.influxdb.dto.Point;

import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class LoadData {
    public static void main(String[] args) {
        // You can generate a Token from the "Tokens Tab" in the UI
        String token = "oznKpWffpHAAJLoroW1OUe_fRy9UKM00WxzlEA9SSZ41-KKKQfbex1u3IYGRjJq5suCFz6cO2SGRBELsV5BQhw==";
        String bucket = "crypto-bucket";
        String org = "crypto-workspace";

        InfluxDB influxDB = InfluxDBFactory.connect("http://localhost:8086", "crypto-user", "password");
        /*
        InfluxDBClient client = InfluxDBClientFactory.create("http://localhost:8086", token.toCharArray());

        Mem mem = new Mem();
        mem.host = "host1";
        mem.used_percent = 23.43234543;
        mem.time = Instant.now();

        try (WriteApi writeApi = client.getWriteApi()) {
            writeApi.writeMeasurement(bucket, org, WritePrecision.NS, mem);
        }

         */
        /*
        String data = "mem,host=host1 used_percent=23.43234543";
        try (WriteApi writeApi = client.getWriteApi()) {
            writeApi.writeRecord(bucket, org, WritePrecision.NS, data);
        }
         */
        Point point = Point.measurement("memory")
                .time(System.currentTimeMillis(), TimeUnit.MILLISECONDS)
                .addField("name", "server1")
                .addField("free", 4743656L)
                .addField("used", 1015096L)
                .addField("buffer", 1010467L)
                .build();

    }

}
