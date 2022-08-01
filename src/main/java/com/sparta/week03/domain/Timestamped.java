package com.sparta.week03.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

// Entity가 자동으로 컬럼으로 인식합니다.
//Timestamped를 상속하는 클래스가 자동으로 생성시간, 수정시간을 자동으로 열로 인식하게함
@Getter // 조회해야하는 대상이면 꼭 추가해야함
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class) // 생성/변경 시간을 변동시에 자동으로 업데이트합니다.
public abstract class Timestamped { //abstract 추상클래스 - 상속이 되었을 때 사용이 가능, 왜냐면 구현을 해줘야하니까

    @CreatedDate //생성시간
    private LocalDateTime createdAt; //LocalDateTime 시간을 나타내는 자료형

    @LastModifiedDate//수정시간
    private LocalDateTime modifiedAt;
}
