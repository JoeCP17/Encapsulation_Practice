package example_3;

import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.*;

public class Service {

    // 개선전
//    Timer t = new Timer();
//
//    t.startTime = System.currentTimeMillis();
//
//    // ...
//
//    t.stopTime = System.currentTimeMillis();
//
//    long elaspedTime = t.stopTime - t.startTime;


    // 개선 후

    Timer t = new Timer();

    t.start();
    // ...

    t.stop();

    long time = t.elapsedTime(MILLISECONDS);

}
