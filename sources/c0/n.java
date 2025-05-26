package c0;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes2.dex */
public final /* synthetic */ class n implements RejectedExecutionHandler {
    @Override // java.util.concurrent.RejectedExecutionHandler
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        kh2.m0.s("CameraExecutor", "A rejected execution occurred in CameraExecutor!");
    }
}
