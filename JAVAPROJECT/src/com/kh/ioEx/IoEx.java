package com.kh.ioEx;

/*
    Input && Output

    Standard IO (표준 입출력)
        콘솔이나 키보드에서 데이터를 입력 받거나 출력
        ex) System.in // System.out
 */

/*
    특성          IO          NIO
    데이터 단위    스트림기반    버퍼기반
    작업 방식      동기적 작업   비동기적 작업 지원
    처리 속도      느림         상대적으로 빠름
    유연성         비교적 단순   더 복잡한 구조 지원
 */

/*
    Synchronized : 동기화
    단순하고 이해하기 쉬움, 시간이 오래 걸리는 작업에서 효율이 떨어질 수 있음
    호출한 쪽을 기다려야 하므로 작업이 순차적으로 실행

    ASychronizerd : 비동기
    작업이 완료되면 알림을 통해 결과를 전달받음 *알림 : 콜백 이벤ㅇ트
    호출한 쪽은 작업이 끝날 때 까지 가다리지 않아도 되므로 병렬 처리 가능
    효율적이지만 구조가 복잡해질 수 있음

 */
public class IoEx {

}
