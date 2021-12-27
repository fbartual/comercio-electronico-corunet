package com.corunet.comercioelectronico.rest.controllers;

import java.time.LocalDateTime;

import com.corunet.comercioelectronico.rest.dtos.PricesDto;
import com.corunet.comercioelectronico.rest.dtos.PricesParamsDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class PricesControllerTest {

	@Mock
	PricesController pricesController;

	@Autowired
	private MockMvc mockMvc;

	Long brandId = Long.valueOf(1);
	Long productId = Long.valueOf(35455);
	LocalDateTime date;
	PricesParamsDto pricesParamsDto;
	MockHttpSession mockHttpSession;
	ObjectMapper objectMapper;
	ResultActions resultActions;
	PricesDto pricesDto;


	@Test
	public void testGetPrice1() throws Exception {
		date = LocalDateTime.parse("2020-06-14T10:00:00");

		pricesParamsDto = new PricesParamsDto(brandId, date, productId);

		mockHttpSession = new MockHttpSession();

		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.registerModule(new JavaTimeModule());
		objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS,
				false);

		resultActions = mockMvc.perform(MockMvcRequestBuilders.get("/api/prices/")
				.session(mockHttpSession).characterEncoding("utf-8")
				.contentType(MediaType.APPLICATION_JSON).content(objectMapper.writeValueAsString(pricesParamsDto)));

		resultActions.andExpect(MockMvcResultMatchers.status().isOk());

		pricesDto = new PricesDto(Long.valueOf(1),
				LocalDateTime.parse("2020-06-14T00:00:00"),
				LocalDateTime.parse("2020-12-31T23:59:59"), Long.valueOf(1),
				Long.valueOf(35455), 35.50, "EUR");

		resultActions.andExpect(MockMvcResultMatchers.content().json(objectMapper.writeValueAsString(pricesDto)));
	}

	@Test
	public void testGetPrice2() throws Exception {
		date = LocalDateTime.parse("2020-06-14T16:00:00");

		pricesParamsDto = new PricesParamsDto(brandId, date, productId);

		mockHttpSession = new MockHttpSession();

		objectMapper = new ObjectMapper();
		objectMapper.registerModule(new JavaTimeModule());
		objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS,
				false);

		resultActions = mockMvc.perform(MockMvcRequestBuilders.get("/api/prices/")
				.session(mockHttpSession).characterEncoding("utf-8")
				.contentType(MediaType.APPLICATION_JSON).content(objectMapper.writeValueAsString(pricesParamsDto)));

		resultActions.andExpect(MockMvcResultMatchers.status().isOk());

		pricesDto = new PricesDto(Long.valueOf(1),
				LocalDateTime.parse("2020-06-14T15:00:00"),
				LocalDateTime.parse("2020-06-14T18:30:00"), Long.valueOf(2),
				Long.valueOf(35455), 25.45, "EUR");

		resultActions.andExpect(MockMvcResultMatchers.content().json(objectMapper.writeValueAsString(pricesDto)));
	}

	@Test
	public void testGetPrice3() throws Exception {
		date = LocalDateTime.parse("2020-06-14T21:00:00");

		pricesParamsDto = new PricesParamsDto(brandId, date, productId);

		mockHttpSession = new MockHttpSession();

		objectMapper = new ObjectMapper();
		objectMapper.registerModule(new JavaTimeModule());
		objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS,
				false);

		resultActions = mockMvc.perform(MockMvcRequestBuilders.get("/api/prices/")
				.session(mockHttpSession).characterEncoding("utf-8")
				.contentType(MediaType.APPLICATION_JSON).content(objectMapper.writeValueAsString(pricesParamsDto)));

		resultActions.andExpect(MockMvcResultMatchers.status().isOk());

		pricesDto = new PricesDto(Long.valueOf(1),
				LocalDateTime.parse("2020-06-14T00:00:00"),
				LocalDateTime.parse("2020-12-31T23:59:59"), Long.valueOf(1),
				Long.valueOf(35455), 35.50, "EUR");

		resultActions.andExpect(MockMvcResultMatchers.content().json(objectMapper.writeValueAsString(pricesDto)));
	}

	@Test
	public void testGetPrice4() throws Exception {
		date = LocalDateTime.parse("2020-06-15T10:00:00");

		pricesParamsDto = new PricesParamsDto(brandId, date, productId);

		mockHttpSession = new MockHttpSession();

		objectMapper = new ObjectMapper();
		objectMapper.registerModule(new JavaTimeModule());
		objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS,
				false);

		resultActions = mockMvc.perform(MockMvcRequestBuilders.get("/api/prices/")
				.session(mockHttpSession).characterEncoding("utf-8")
				.contentType(MediaType.APPLICATION_JSON).content(objectMapper.writeValueAsString(pricesParamsDto)));

		resultActions.andExpect(MockMvcResultMatchers.status().isOk());

		pricesDto = new PricesDto(Long.valueOf(1),
				LocalDateTime.parse("2020-06-15T00:00:00"),
				LocalDateTime.parse("2020-06-15T11:00:00"), Long.valueOf(3),
				Long.valueOf(35455), 30.50, "EUR");

		resultActions.andExpect(MockMvcResultMatchers.content().json(objectMapper.writeValueAsString(pricesDto)));
	}

	@Test
	public void testGetPrice5() throws Exception {
		date = LocalDateTime.parse("2020-06-16T21:00:00");

		pricesParamsDto = new PricesParamsDto(brandId, date, productId);

		mockHttpSession = new MockHttpSession();

		objectMapper = new ObjectMapper();
		objectMapper.registerModule(new JavaTimeModule());
		objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS,
				false);

		ResultActions resultActions = mockMvc.perform(MockMvcRequestBuilders.get("/api/prices/")
				.session(mockHttpSession).characterEncoding("utf-8")
				.contentType(MediaType.APPLICATION_JSON).content(objectMapper.writeValueAsString(pricesParamsDto)));

		resultActions.andExpect(MockMvcResultMatchers.status().isOk());

		pricesDto = new PricesDto(Long.valueOf(1),
				LocalDateTime.parse("2020-06-15T16:00:00"),
				LocalDateTime.parse("2020-12-31T23:59:59"), Long.valueOf(4),
				Long.valueOf(35455), 38.95, "EUR");

		resultActions.andExpect(MockMvcResultMatchers.content().json(objectMapper.writeValueAsString(pricesDto)));
	}

}