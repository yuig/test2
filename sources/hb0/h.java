package hb0;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final int f68523a;

    /* renamed from: b, reason: collision with root package name */
    public static final ExecutorService f68524b;

    /* renamed from: c, reason: collision with root package name */
    public static final ThreadPoolExecutor f68525c;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f68523a = availableProcessors;
        dm.c cVar = new dm.c(2);
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool(new dm.c(1));
        Intrinsics.checkNotNullExpressionValue(newCachedThreadPool, "newCachedThreadPool(...)");
        f68524b = newCachedThreadPool;
        f68525c = new ThreadPoolExecutor(availableProcessors + 1, 1 + (availableProcessors * 2), 1L, TimeUnit.SECONDS, linkedBlockingQueue, cVar);
    }
}
