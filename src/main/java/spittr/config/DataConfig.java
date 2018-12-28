package spittr.config;

import java.io.PrintWriter;
import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class DataConfig {

	public Properties properties() {
		Properties prop = new Properties();
		prop.setProperty("dataSourceClassName", "com.microsoft.sqlserver.jdbc.SQLServerDataSource");
		prop.setProperty("dataSource.user", "leon3");
		prop.setProperty("dataSource.password", "Qwerty123$");
		prop.setProperty("dataSource.databaseName", "DataCenterGKKD");
		prop.put("dataSource.logWriter", new PrintWriter(System.out));
		return prop;
	}

//	@Profile("development")
	@Bean
	public HikariDataSource hikariDataSource() {
		HikariConfig config = new HikariConfig(properties());
		return new HikariDataSource(config);
	}
	
	@Bean
	public DataSource dataSource() {
		return hikariDataSource();
	}

	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}

}
