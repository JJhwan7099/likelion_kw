package com.example.demo;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Tag(name = "Data-Controller", description = "Data API 엔드포인트")
@Controller
@RequestMapping("/data")
public class DataController {
    @GetMapping("/{dataId}")
    @Operation(summary = "데이터 조회", description = "데이터를 조회합니다.")
    @ApiResponse(responseCode = "200", description = "조회 성공")
    public ResponseEntity<?> readData(
            @PathVariable(value = "dataId") String dataId) {
            return ResponseEntity.status(HttpStatus.OK).body(Map.of("message","데이터 조회 요청이 발생했습니다."));
    }
    @GetMapping("/")
    @Operation(summary = "데이터 검색", description = "데이터를 검색합니다.")
    @ApiResponse(responseCode = "200", description = "검색 성공")
    public ResponseEntity<?> searchData(
        @RequestParam(value="content") String content) {
        return ResponseEntity.status(HttpStatus.OK).body(Map.of("message","데이터 검색 요청이 발생했습니다."));
    }
    @PostMapping("/")
    @Operation(summary = "데이터 생성", description = "데이터를 생성합니다.")
    @ApiResponse(responseCode = "200", description = "생성 성공")
    public ResponseEntity<?> createData(
            @RequestBody String content ) {
        return ResponseEntity.status(HttpStatus.CREATED).body(Map.of("message","데이터 생성 요청이 발생했습니다."));
    }
    @PutMapping("/{dataId}")
    @Operation(summary = "데이터 덮어쓰기 및 생성", description = "데이터를 덮어쓰기 및 생성합니다.")
    @ApiResponse(responseCode = "200", description = "덮어쓰기 및 생성 성공")
    public ResponseEntity<?> updateData(
            @PathVariable(value = "dataId") String dataId,
            @RequestBody String content) {
        return ResponseEntity.status(HttpStatus.OK).body(Map.of("message","데이터 덮어쓰기 또는 생성 요청이 발생했습니다."));
    }
    @PatchMapping("/{dataId}")
    @Operation(summary = "데이터 부분 수정", description = "데이터를 부분 수정합니다.")
    @ApiResponse(responseCode = "200", description = "부분 수정 성공")
    public ResponseEntity<?> modifyData(
            @PathVariable(value="dataId") String dataId,
            @RequestBody String content) {
        return ResponseEntity.status(HttpStatus.OK).body(Map.of("message","데이터의 부분 수정 요청이 발생했습니다."));
    }
    @DeleteMapping("/{dataId}")
    @Operation(summary = "데이터 삭제", description = "데이터를 삭제합니다.")
    @ApiResponse(responseCode = "200", description = "삭제 성공")
    public ResponseEntity<?> deleteData(
            @PathVariable(value = "dataId") String dataId) {
        return ResponseEntity.status(HttpStatus.OK).body(Map.of("message","데이터 삭제 요청이 발생했습니다."));
    }
}

