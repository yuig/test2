package org.chromium.base.task;

import android.os.Handler;
import gp2.b;
import gp2.d;
import gp2.e;
import gp2.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kv0.p;
import org.chromium.base.ThreadUtils;
import org.chromium.base.annotations.CalledByNative;
import t72.j;

/* loaded from: classes4.dex */
public class PostTask {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f97324a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static ArrayList f97325b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public static volatile boolean f97326c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f97327d;

    /* renamed from: e, reason: collision with root package name */
    public static final j f97328e;

    /* renamed from: f, reason: collision with root package name */
    public static p f97329f;

    static {
        b bVar = new b(b.f65942a, b.f65943b, 30L, TimeUnit.SECONDS, b.f65945d, b.f65944c);
        bVar.allowCoreThreadTimeOut(true);
        f97327d = bVar;
        f97328e = new j(11);
    }

    public static void a(Handler handler) {
        p pVar = new p();
        pVar.f80994a = new d(6, handler);
        pVar.f80995b = new d(7, handler);
        pVar.f80996c = new d(8, handler);
        f97329f = pVar;
    }

    public static void b(int i13, Runnable runnable) {
        e eVar;
        if (i13 >= 6) {
            if (f97329f == null) {
                ThreadUtils.a();
            }
            eVar = f97329f;
        } else {
            eVar = f97328e;
        }
        eVar.a(i13, runnable);
    }

    public static void c(Runnable runnable) {
        if (f97329f == null) {
            ThreadUtils.a();
        }
        if (f97329f.c()) {
            runnable.run();
        } else {
            b(7, runnable);
        }
    }

    @CalledByNative
    public static void onNativeSchedulerReady() {
        ArrayList arrayList;
        if (f97326c) {
            return;
        }
        f97326c = true;
        synchronized (f97324a) {
            arrayList = f97325b;
            f97325b = null;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((h) it.next()).b();
        }
    }
}
