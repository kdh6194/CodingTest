자바는 List 인터페이스의 구현 클래스로 ArrayList와 LinkedList 클래스를 제공합니다.


응용 프로그램에 따라 LinkedList 클래스가 빠를때가 있고, ArrayList 클래스가 빠를때가 있다.


어떤 응용 프로그램에 어느 클래스가 더 좋을지 결정하는 한 가지 방법은 둘 다 시도해 보고 각각 얼마나 걸리는지

알아보는 것입니다.


이러한 접근법을 프로파일링이라고 합니다.


프로파일링의 문제점

1. 알고리즘을 비교하려면 사전에 그것을 모두 구현해봐야 합니다.

2. 결과는 사용하는 컴퓨터의 성능에 의존하기 때문에 한 알고리즘이 어떤 컴퓨터에서는 더 좋고, 나쁠 수가 있다.

3. 결과는 문제의 크기나 입력으로 사용하는 데이터에 의존하기도 합니다.



문제점의 해결 방법 : 알고리즘 분석

알고리즘 분석의 정의 : 그것을 구현하지 않고도 알고리즘을 비교할 수 있게 합니다.


알고리즘 분석을 하기위한 가정

1. 컴퓨터 하드웨어의 세부사항을 다루지 않기 위해 보통 알고리즘을 이루는 더하기와 곱하기, 숫자 비교 등의 기본 연산을 식별합니다.

   그리고 각 알고리즘에 필요한 연산 수를 셉니다.

2. 입력 데이터의 세부사항을 다루지 않으려면 가장 좋은 선택은 기대하는 입력 데이터에 대한 평균 성능을 분석하는 것입니다.

   이것이 가능하지 않을 때는 일반적인 대안으로 최악의 시나리오를 분석하기도 합니다.

3. 마지막으로, 한 알고리즘이 작은 문제에서는 최상의 성능을 보이지만 큰 문제에서는 다른 알고리즘이 더 좋을 수 있다는 가능성을 배제하면

   안됩니다. 이 때는 보통 큰 문제에 초점을 맞춥니다.

   작은 문제에서는 알고리즘의 차이가 크지 않지만, 큰 문제에서는 그 차이가 훨씬 거대해질수 있기 때문입니다.



이러한 종류의 분석은 간단한 알고리즘 분류에 적합합니다.



-간단한 알고리즘의 범주-

1. 상수 시간

실행 시간이 입력크기에 의존하지 않으면 알고리즘은 상수 시간을 따른다고 합니다.

예를 들어, n개의 배열에서 브래킷 연산 ([ ])을 사용하여 요소 중 하나에 접근할 때 이 연산은 배열의 크기와 관계없이 같은 수의 동작을

수행합니다.

(즉, 어떤 문제를 풀때 필요한 풀이 시간이 내가 풀고있는 문제의 난이도와 상관없이 일정하다는 의미)

2. 선형

실행시간이 입력의 크기에 비례하면 알고리즘은 선형이라고 합니다.

예를 들어, 배열에 있는 요소를 더한다면 n개 요소에 접근하여 n-1번 더하기 연산을 해야 합니다.

연산 (요소 접근과 더하기)의 총 횟수는 2n-1이고 n에 비례합니다.

(즉, 어떤 문제를 풀때 필요한 풀이 시간은 내가 풀고 있는 문제에 난이도에 따라 달라진다는 의미, 어려운 문제일수록 풀이 시간이 증가)

3. 아차

실행시간이 n2에 비례하면 알고리즘은 이차라고 합니다.

예를 들어, 리스트에 있는 어떤 요소가 두 번 이상 나타나는지를 알고 싶다고 가정합시다.

간단한 알고리즘은 각 요소를 다른 모든 요소와 비교하는 것입니다.

n개의 요소가 있고 각각 n-1 개의 다른 요소와 비교하면 총 비교 횟수는 n2-n이 되어 n이 커지면서 n2에 비례하게 됩니다.

-선택 정렬-

public class SelectionSort {

    // i와 j의 위치에 있는 값을 바꿉니다.
// 즉 요소를 읽고 쓰는 것은 상수 시간 연산입니다.
// 요소의 크기와 첫 번째 위치를 알고 있다면 어떤 요소의 위치라도
// 알 수 있기 때문입니다.
// swapElements 메소드에 있는 모든 연산이 상수 시간이므로 전체
// 메소드는 상수 시간이 됩니다.

    public static void swapElements(int [] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
   

        // start로 부터 시작하는 최솟값의 위치를 찾고 (start 포함)
        // 배열의 마지막 위치로 갑니다.
        // 두 번째 메소드 indexLowest는 주어진 위치인 start에서 시작하여
        // 배열에 있는 가장 작은 요소인 인덱스를 찾습니다.
        // 반복문을 돌 때마다 배열의 두 요소에 접근하고 한 번의 비교 연산을 합니다.
        // 이들은 모두 상수 시간 연산이므로 어느 것을 세든지 중요하지 않습니다.

        public static int indexLowest(int[] array, int start) {
            int lowIndex = start;
            for (int i = start; i < array.length; i++) {
                if(array[i] < array[lowindex]) {
                    lowIndex = i;
                }
            }
            return lowIndex;
        }
        
        //선택 정렬을 사용하여 요소를 정렬합니다.
        //selection메소드는 배열을 정렬합니다.
        // 0 에서 n-1까지 반복하므로 n번 실행됩니다.
        // 매번 indexLowest 메소드를 호출한 후 상수 시간 연산인 
        // swapElements 메소드를 실행합니다.
        //indexLowest 메소드가 처음 호출되면 n번 비교 연산을 합니다.
        // 두번째는 n-1번 비교연산을 합니다.
        // 이렇게 하였을 때 총 비교 횟수는 n + n -1 + n -2 + ... + 1 + 0 입니다.
        // 이 수열의 합은 n(n+1) 이고 , n2에 비례합니다. 이것은 selection 메소드가
        // 이차라는 것을 의미합니다.
         public static void selectionSort(int[] array) {
            for (int i = 0; i < array.length; i++) {
                 int j = indexLowest(array, i);
                 swapElemts(array, i, j);

            }
        }
       
    } 

}

Colored by Color Scripter
cs


-빅오 표기법-

모든 상수 시간 알고리즘은 O(1) 이라는 집합에 속합니다.

따라서 어떤 알고리즘이 상수 시간임을 다르게 말하고 싶다면 그것이 O(1)에 있다고 말하면 됩니다.

마찬가지로 모든 선형 알고리즘은 O(n)에 속하며 모든 이차 알고리즘은 O(n2)에 속합니다.

이렇게 알고리즘을 분류하는 방식을 빅오 표기법 (big O notation)이라고 합니다.


이 표기법은 알고리즘을 작성할 때 알고리즘이 어떻게 동작하는지에 관한 일반적인 법칙을 표현하는 간편한 방법을 제공합니다.

예를 들어, 상수 시간 알고리즘에 이어 선형 시간 알고리즘을 수행하면 총 실행시간은 선형이 됩니다.


이를 '~의 요소' 라는 의미의 ∈ 기호를 사용하여 표현하면 f∈O(n) 고 g∈O(1) 이면 f+g∈O(n) 가 됩니다.


두개의 선형 연산을 수행하면 합은 여전히 선형입니다.

이를 빅오 표기법으로 표현하면 f∈O(n) 이고 g∈O(n) 면 f+g∈O(n) 가 됩니다.

사실 k가 n에 의존하지 않는 상수인 한 선형 연산을 k번 수행하면 합은 선형입니다.

이를 빅오 표기법으로 표현하면 f∈O(n) 고 k가 상수라면 kf∈O(n)가 됩니다.

하지만 선형 연산을 n번 반복하면 결과는 이차가됩니다.

이를 빅오 표기법으로 표현하면 f∈O(n) 이면 nf∈O(n2) 가 됩니다.

일반적으로 n의 가장 큰 지수만 신경 쓰기 때문에 총 연산 횟수가 2n+1이라면

실행시간은 O(n)입니다. 선행 상수 2와 덧셈 항 1은 이러한 종류의 분석에서 중요하지 않습니다.

마찬가지로 n2 + 100n + 1000도  O(n2)이 됩니다.

증가차수는 같은 개념의 다른 이름입니다.

증가 차수는 실행시간이 같은 빅오 범주에 해당하는 알고리즘 집합니다. 예를 들어, 모든 선형 알고리즘은 실행시간이 O(n)에 있으므로

같은 증가 차수에 속합니다.

이 문맥에서 차수는 집단의 의미로, 원탁의 기사단처럼 기사들의 집단을 가리키지 그들의 순서를 말하는 것이 아닙니다.

따라서 선형 알고리즘 차수는 용감하고 예의 바르고 특히 효율적인 알고리즘 집합이라고 생각하면 된다.

=============================================
-자바 interface-

자바 interface는 메서드 집합을 의미.

이 interface를 구현하는 클래스는 이러한 메서드를 제공해야 합니다.

예를 들어,  java.lang 패키지에 정의된 Comparable interface 의 소스코드는 다음과 같다.


public interface Comparable<T>{

public int compareTo(T o);

}


이러한 interface는 타입 파라미터인 T를 사용하여 Comparable라는 제네릭 타입을 정의합니다.

interface를 구현하려면 클래스는 T 타입을 명시해야 하고, T 타입의 객체를 인자로 받고 int를 반환하는 compareTo() 메서드를 제공해야 합니다.


예를 들어,  java.lang.Integer 클래스의 소스 코드는 다음과 같습니다.


public final class Integer extends Number implements Comparable<Integer>    {

public int compareTo(Integer antherInteger) {

int thisVal = this.value;

int anogherVal = anotherInteger.value;

return (thisVal<anotherVal ? -1 : (thisVal == anotherVal ? 0 : 1 ));

}

//다른 메서드 생략함

}


-제네릭-


자바에서 제네릭(Generic)이란 데이터의 타입(Data Type)을 일반화한다(Generalize)는 것을 의미한다.

제네릭은 클래스나 메소드에서 사용할 내부 데이터 타입을 컴파일 시에 미리 지정하는 방법이다.


이렇게 컴파일 시에 미리 타입 검사(Type Check)를 수행하면 다음과 같은 장점을 가진다.


1. 클래스나 메소드 내부에서 사용되는 객체의 타입 안정성을 높일 수 있다.

2. 반환값에 대한 타입 변환 및 타입 검사에 들어가는 노력을 줄일 수 있다.


JDK 1.5 이전에서는 여러 타입을 사용하는 대부분의 클래스나 메소드에서 인수나 반환값으로 Object 타입을 사용했다.

하지만 이 경우에는 반환된 Object 객체를 다시 원하는 타입으로 타입 변환해야 하며, 이때 오류가 발생할 가능성도 존재한다.

JDK 1.5부터 도입된 제네릭을 사용하면 컴파일 시에 미리 타입이 정해지므로, 타입 검사나 타입 변환과 같은 번거로운 작업을 생략할 수 있다.


-List interface-

JCF는 List라는 interface를 정의하고 ArrayList와 LinkedList라는 두 구현 클래스를 제공합니다.

interface는 List가 된다는 의미가 무엇인지를 정의합니다.

이 interface를 구현하는 클래스는 add, get, remove와 약 20가지 메서드를 포함한 특정 메서드 집합을 제공해야 합니다.

ArrayList와 LinkedList 클래스는 이러한 메서드를 제공하므로 상호교환할 수 있습니다.

List로 동작하는 메서드는 ArrayList와 LinkedList 또는 List를 구현하는 어떤 객체와도 잘 동작합니다.

다음은 이러한 내용을 보여주는 예제 코드이다. (파일명 : ListClientExample.java).

public class ListClientExample {

private List list;

public ListClientExample() {

list = new LinkedList( );

}

private List getList() {

return list;

}

public static void main(String[ ] args) {

        ListClientExample Ice = new ListClientExample( );

        List list = Ice.getList( );

        System.out.println(list);

}


-Java Collction Framework (JCF)-

Java 에서 데이터를 저장하는 기본적인 자료구조들을 한 곳에 모아 관리하고 편하게 사용하기 위해서 제공하는 것을 의미한다.

다음은 JCF 의 상속 구조이며 사용 용도에 따라 List, Set, Map 3가지로 요약할 수 있다.

1. Map

키 (Key) 값과 밸류 (Value) 값을 받아 저장하는 함수이다.

map<Key,Value>변수 = new HashMap<>( );

2. Set

String 값으로 저장하는 함수이고, 순서가 없는게 특징이다.

-예제 및 출력결과-

package ch01;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;


public class ListClientExample {

    //list 인스턴스 변수를 선언
    private List list;
    
    public ListClientExample() {
        list = new List();
    }
    
    public List getList() {
        return list;
    }
    
    public static void main(String[] args) {
        ListClientExample Ice = new ListClientExample();
        List list = Ice.getList();
        System.out.println(list);
 
    }

}