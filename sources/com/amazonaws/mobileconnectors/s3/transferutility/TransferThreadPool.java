package com.amazonaws.mobileconnectors.s3.transferutility;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
abstract class TransferThreadPool {

    /* renamed from: a, reason: collision with root package name */
    public static final Log f28712a = LogFactory.a(TransferService.class);

    /* renamed from: b, reason: collision with root package name */
    public static ThreadPoolExecutor f28713b;

    /* renamed from: c, reason: collision with root package name */
    public static ThreadPoolExecutor f28714c;

    public static synchronized void a(int i13) {
        synchronized (TransferThreadPool.class) {
            f28712a.f("Initializing the thread pool of size: " + i13);
            int max = Math.max((int) Math.ceil(((double) i13) / 2.0d), 1);
            if (f28713b == null) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(max, max, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                threadPoolExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.DiscardPolicy());
                threadPoolExecutor.allowCoreThreadTimeOut(true);
                f28713b = threadPoolExecutor;
            }
            if (f28714c == null) {
                ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(max, max, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                threadPoolExecutor2.setRejectedExecutionHandler(new ThreadPoolExecutor.DiscardPolicy());
                threadPoolExecutor2.allowCoreThreadTimeOut(true);
                f28714c = threadPoolExecutor2;
            }
        }
    }

    public static Future b(Callable callable) {
        Log log = TransferUtilityOptions.f28728d;
        a((Runtime.getRuntime().availableProcessors() + 1) * 2);
        return callable instanceof UploadPartTask ? f28714c.submit(callable) : f28713b.submit(callable);
    }
}
