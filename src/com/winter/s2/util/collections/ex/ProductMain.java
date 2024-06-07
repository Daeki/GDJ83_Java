package com.winter.s2.util.collections.ex;

import java.util.ArrayList;

public class ProductMain {

	public static void main(String[] args) {
		// 데이터 핸들링
		// 숫자형, 문자열, 논리형
		// 신규 통장 개설 - 계좌번호, 예금주, 은행명, 비밀번호, 잔고, 상품명

		ProductService productService = new ProductService();
		ArrayList<ProductDTO> ar = productService.init();
		// productService.addProduct(ar);
		int result = productService.removeProduct(ar);

		if (result > 0) {
			System.out.println("삭제 성공");
		} else {
			System.out.println("삭제 실패");
		}

//		for (int i = 0; i < ar.size(); i++) {
//			System.out.println(ar.get(i).getPrice());
//			System.out.println(ar.get(i).getName());
//			System.out.println(ar.get(i).getStock());
//		}

	}

}
