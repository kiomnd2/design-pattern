# Design-pattern

## 6. 어댑터 패턴과 파사드 패턴
 
 


#### 어댑터 ?
* 어댑터는 클라이언트로부터 요청을 받아서 새로운 업체에서 제공하는 클래스에서 받아들일 수 있는 형태의 요청으로 변환시켜줌

#### 클라이언트에서 어댑터를 사용하는 방법
* 클라이언트에서 타겟 인터페이스를 사용하여 메소드를 호출함으로써 어댑터에 요청함
* 어댑터에서는 어댑티 인터페이스를 사용하여 그 요청을 어댑티에 대한 메소드 호출로 변환
* 클라이언트에서는 호출 결과를 받긴 하지만중간에 어댑터가 껴 있는지는 전혀 알지 못함


#### 어댑터 패턴

```text
어댑터패턴은 한 클래스의 이너페이스를 클라이언트에서 사용하고자 하는 다른 인터페이스로 변환. 
어댑터를 이용하면 인터페이스 인터페이스 호환성 문제 때문에 같이 쓸수 없는 클래스들을 연결하여 쓸 수 있음
```
CLIENT -> TARGET(interface) <- Adapter -> Adaptee


#### 어댑터의 종류
* 객체 어댑터
    * 이장 끝까지 배우는 어댑터
* 클래스 어댑터
    * 다중상속이 필요.. java에서는 다중 상속을 지원하지 않음

#### enumeration 과 Iterator간의 어댑터
* enumeration은 초기의 컬랙션 
* Iterator 과 호환시키기 위해선 adapter가 필요함
```java
public class EnumerationIterator implements Iterator {
    Enumeration enumeration;

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }
}
```



#### 퍼사드 패턴
```text
퍼사드패턴은 어떤 서브시스템의 일련의 인터페이스에 대한 통합된 인터페이스를 제공함. 
퍼사드에서는 고수준 인터페이스를 정의하기 때문에 서브시스템을 더 쉽게 사용 할 수 있음
```


* 홈시어터
```java
public class HomeTheaterFacade{
    Amplifier amp;
    Tuner tuner;
    DvdPlayer dvd;
    
    HomeTheaterFacade(Amplifiler amp, Tuner tuner, DvdPlayer dvd) {
        this.amp = amp;
        this.tuner = tuner;
        this.dvd = dvd ;
    }
    
    public void watchMovie(String movie) {
        System.out.println("영화볼 준비가 됐어요");
        amp.on();
        tuner.on();
        dvd.on();
        dvd.play();
    }
    
    public void endMovie(){
        amp.off();
        tuner.off();
        dvd.stop();
        dvd.off(); 
    }
}
```


#### 최소 지식 원칙
```text
최소지식 원칙 정말 친한 친구하고만 얘기하라
```

* 모는 객체간 의존성이 없을순 없다.
* 그의존성을 최소화하며 객체를 디자인 해야 한다.

