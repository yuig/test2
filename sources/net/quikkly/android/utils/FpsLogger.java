package net.quikkly.android.utils;

import android.os.SystemClock;
import android.util.Log;
import java.util.Locale;

/* loaded from: classes4.dex */
public class FpsLogger {
    private volatile long count;
    private volatile long lastLog;
    private long logInterval;
    private volatile long startTime;
    private String tag;

    public FpsLogger(String str, long j13) {
        this.tag = str;
        this.logInterval = j13;
        stop();
    }

    public void ping() {
        if (this.startTime > 0) {
            this.count++;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.lastLog + this.logInterval < elapsedRealtime) {
                double d2 = ((elapsedRealtime - this.startTime) * 1.0d) / this.count;
                Log.d(this.tag, String.format(Locale.US, "%.1f ms per frame, %.2f FPS", Double.valueOf(d2), Double.valueOf(d2 > 0.0d ? 1000.0d / d2 : 0.0d)));
                this.lastLog = elapsedRealtime;
            }
        }
    }

    public void start() {
        stop();
        this.startTime = SystemClock.elapsedRealtime();
        this.lastLog = this.startTime;
        Log.d(this.tag, "FPS logging started.");
    }

    public void stop() {
        this.startTime = 0L;
        this.count = 0L;
        this.lastLog = 0L;
        Log.d(this.tag, "FPS logging stopped.");
    }
}
