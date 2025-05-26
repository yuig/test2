package net.quikkly.android.scan;

import a.a;
import android.util.Log;
import net.quikkly.android.PipelineThreadListener;
import net.quikkly.android.Quikkly;
import net.quikkly.core.Pipeline;
import net.quikkly.core.ScanResult;

/* loaded from: classes4.dex */
public class PipelineThread extends Thread {
    private long frameDelayMillis;
    private int frameHeight;
    private int frameWidth;
    private volatile PipelineThreadListener listener;
    private ConcurrentHolder<byte[]> nextFrameWaitingForScan;
    private Pipeline pipeline;

    public PipelineThread(int i13, Pipeline pipeline, int i14, int i15, ConcurrentHolder<byte[]> concurrentHolder, PipelineThreadListener pipelineThreadListener, long j13) {
        super(a.d("PipelineThread", i13));
        this.pipeline = pipeline;
        this.frameWidth = i14;
        this.frameHeight = i15;
        this.nextFrameWaitingForScan = concurrentHolder;
        this.listener = pipelineThreadListener;
        this.frameDelayMillis = j13;
    }

    public void requestQuit() {
        this.listener = null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (this.listener != null) {
            byte[] take = this.nextFrameWaitingForScan.take();
            if (take != null) {
                ScanResult scanFrame = this.pipeline.scanFrame(take, 3, this.frameWidth, this.frameHeight, -1, false);
                if (this.listener != null) {
                    this.listener.onScanResult(scanFrame);
                }
                if (this.listener != null) {
                    this.listener.onFreeBuffer(take);
                }
                long j13 = this.frameDelayMillis;
                if (j13 > 0) {
                    try {
                        Thread.sleep(j13);
                    } catch (InterruptedException unused) {
                    }
                }
            } else {
                Log.i(Quikkly.TAG, "Got null from ConcurrentHolder.take() - PipelineThread should exit.");
                this.listener = null;
            }
        }
    }
}
