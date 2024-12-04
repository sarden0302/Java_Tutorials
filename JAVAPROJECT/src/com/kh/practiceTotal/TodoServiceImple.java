package com.kh.practiceTotal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// TodoService에서 간략하게 작성한 기능들의 설명을 참조해서 기능 구현
// 특정 기능을 참조해서 구현할 때는 이름 뒤에 Impl까지만 붙여줌
public class TodoServiceImple implements TodoService {

    @Override
    public Map<String, String> todoListFullView() {
        //for 문 이용해서 Map의 value 값 모두 출력

        return Map.of();
    }

    @Override
    public int todoAdd(String title, String detail) {
        int startId = 1; // 할 일 ID를 관리하는 변수명 할 일 시작 번호는 1
        Map<String, String> todoList = new HashMap<>();
        todoList.put("카페가기", "카페가서 코딩할 것");
        // todoList.put("잠자기", "최소 7시간 이상 수면 유지할 것");


        return startId++;
    }

    @Override
    public boolean todoUpdate(int index, String title, String detail) {
        Map<String, String> taskDetails = new HashMap<>();
        taskDetails.get(index);

        taskDetails.put("title", "저목 수정하기");
        taskDetails.put("detail", "상세 내용 수정하기");
        return false;
    }
}
