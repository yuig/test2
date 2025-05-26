package hb0;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: b, reason: collision with root package name */
    public static ScheduledExecutorService f68513b;

    /* renamed from: c, reason: collision with root package name */
    public static final Handler f68514c = new Handler(Looper.getMainLooper());

    /* renamed from: a, reason: collision with root package name */
    public final a f68515a;

    public c() {
        this(a.PRIORITY_BACKGROUND);
    }

    public static void a(ExecutorService executorService) {
        if (executorService instanceof ThreadPoolExecutor) {
            BlockingQueue<Runnable> queue = ((ThreadPoolExecutor) executorService).getQueue();
            ArrayList arrayList = new ArrayList();
            queue.drainTo(arrayList);
            HashMap hashMap = new HashMap();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Runnable runnable = (Runnable) it.next();
                if (runnable instanceof b) {
                    c cVar = ((b) runnable).f68511a;
                    String simpleName = cVar.getClass().getSimpleName();
                    String name = cVar.getClass().getName();
                    if ("".equals(simpleName)) {
                        simpleName = name.substring(name.lastIndexOf(".") + 1);
                    }
                    hashMap.put(simpleName, Integer.valueOf(hashMap.containsKey(simpleName) ? 1 + ((Integer) hashMap.get(simpleName)).intValue() : 1));
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry : hashMap.entrySet()) {
                arrayList2.add(new Pair((String) entry.getKey(), ((Integer) entry.getValue()).toString()));
            }
            ((tb0.h) ob0.b.f93978b).h("background_exe_queue: " + arrayList2);
            ((tb0.h) ob0.b.f93978b).k("background_exe_queue", arrayList2);
        }
    }

    public void b() {
        a aVar = this.f68515a;
        b bVar = new b(this, aVar);
        ExecutorService executorService = null;
        try {
            executorService = aVar == a.PRIORITY_MAX ? h.f68524b : h.f68525c;
            executorService.execute(bVar);
        } catch (RejectedExecutionException e13) {
            a(executorService);
            throw e13;
        }
    }

    public abstract void c();

    public final void d(long j13) {
        ScheduledExecutorService scheduledExecutorService = f68513b;
        if (scheduledExecutorService == null || scheduledExecutorService.isShutdown()) {
            f68513b = Executors.newScheduledThreadPool(h.f68523a + 1);
        }
        f68513b.schedule(new b(this, this.f68515a), j13, TimeUnit.MILLISECONDS);
    }

    public c(a aVar) {
        this.f68515a = aVar;
    }
}
