package ru.iteco.micro.persistence;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by FilatovNA(rogowasya@gmail.com) on 05.03.19.
 */

@Configuration
@PropertySource(value = "classpath:micro.pg.local.yaml")
@ConfigurationProperties(prefix = "micro.datasource")
@Getter
@Setter
@NoArgsConstructor
@ToString(exclude = {"password"})
@Slf4j
public class PgLocalDbConfig {
    private String url;
    private String username;
    private String password;
    private String driver;

    private boolean polled;
    private int maxActiveConnections;
    private int maxCheckoutTime;
    private int maxIdleConnections;
    private int maxLocalBadConnectionTolerance;
    private int pingConnectionsNotUsedFor;
    private boolean pingEnabled;
    private String pingQuery;
    private int timeToWait;

//    protected DataSource buildDataSource() {
//        DataSource ds = new DataSource();
//        List<DataSource.Property> properties = ds.getProperty();
//        properties.add(property("driver", getDriver()));
//        properties.add(property("url", getUrl()));
//        properties.add(property("username", getUsername()));
//        properties.add(property("password", getPassword()));
//        if (polled) {
//            properties.add(property("poolMaximumActiveConnections", "" + getMaxActiveConnections()));
//            properties.add(property("poolMaximumCheckoutTime", "" + getMaxCheckoutTime()));
//            properties.add(property("poolMaximumIdleConnections", "" + getMaxIdleConnections()));
//            properties.add(property("poolPingConnectionsNotUsedFor", "" + getPingConnectionsNotUsedFor()));
//            properties.add(property("poolPingEnabled", "" + isPingEnabled()));
//            properties.add(property("poolPingQuery", getPingQuery()));
//            properties.add(property("poolTimeToWait", "" + getTimeToWait()));
//            ds.setType("POOLED");
//        } else
//            ds.setType("UNPOOLED");
//        return ds;
//    }
//
//    private static DataSource.Property property(final String name, final String value) {
//        DataSource.Property p = new DataSource.Property();
//        p.setName(name);
//        p.setValue(value);
//        return p;
//    }
}
