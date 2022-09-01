package com.fastcampus.web.dto;

import com.fastcampus.domain.Product;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Data
public class ProductDto {

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Request {
        // 검색 관련 변수
        @ApiModelProperty(value = "검색조건", example = "TITLE", required = true)
        @Enumerated(value = EnumType.STRING)
        private SearchCondition searchCondition;
        @ApiModelProperty(value = "검색키워드", example = "특별경영안정자금", required = false)
        private String searchKeyword;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @Builder
    @NoArgsConstructor
    public static class Response {

        @ApiModelProperty(value = "상품이름", example = "특별경영안전자금")
        private Long id;
        @ApiModelProperty(value = "상품이름", example = "특별경영안전자금")
        private String productName; // 상품 이름
        @ApiModelProperty(value = "상품 내용", example = "경기침체, 재해피해 소상공인 지원")
        private String productContent; //
        @ApiModelProperty(value = "지원 은행", example = "정부")
        private String supporterName; //
        @ApiModelProperty(value = "지원 지역", example = "서울")
        private String supporterRegion; // 지원 지역
        @ApiModelProperty(value = "지원 금액", example = "3500000")
        private int supporterAmount; //
        @ApiModelProperty(value = "관심상품 여부",example = "true")
        private boolean bookmarkProduct;

    }

    @Getter
    @Setter
    @AllArgsConstructor
    @Builder
    @NoArgsConstructor
    public static class CartResponse {
        @ApiModelProperty(value = "cartProductId", example = "1")
        private Long cartProductId;
        @ApiModelProperty(value = "상품인덱스", example = "1")
        private Long id;
        @ApiModelProperty(value = "상품이름", example = "특별경영안전자금")
        private String productName; // 상품 이름
        @ApiModelProperty(value = "상품 내용", example = "경기침체, 재해피해 소상공인 지원")
        private String productContent; //
        @ApiModelProperty(value = "지원 은행", example = "정부")
        private String supporterName; //
        @ApiModelProperty(value = "지원 지역", example = "서울")
        private String supporterRegion; // 지원 지역
        @ApiModelProperty(value = "지원 금액", example = "3500000")
        private int supporterAmount; //
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @Builder
    @NoArgsConstructor
    public static class bookmarkResponse {
        @ApiModelProperty(value = "bookmarkProductId", example = "1")
        private Long bookmarkProductId;
        @ApiModelProperty(value = "상품인덱스", example = "1")
        private Long id;
        @ApiModelProperty(value = "상품이름", example = "특별경영안전자금")
        private String productName; // 상품 이름
        @ApiModelProperty(value = "상품 내용", example = "경기침체, 재해피해 소상공인 지원")
        private String productContent; //
        @ApiModelProperty(value = "지원 은행", example = "정부")
        private String supporterName; //
        @ApiModelProperty(value = "지원 지역", example = "서울")
        private String supporterRegion; // 지원 지역
        @ApiModelProperty(value = "지원 금액", example = "3500000")
        private int supporterAmount; //

    }

    public static ProductDto.Response res(Product product) {
        return ProductDto.Response.builder()
                .id(product.getId())
                .productName(product.getProductName())
                .productContent(product.getProductContent())
                .supporterName(product.getSupporterName())
                .supporterRegion(product.getSupporterRegion())
                .supporterAmount(product.getSupporterAmount())
                .build();
    }

}
