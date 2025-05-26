package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: e, reason: collision with root package name */
    public static final ExecutorService f28384e = Executors.newCachedThreadPool(new jc.c());

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f28385a = new LinkedHashSet(1);

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f28386b = new LinkedHashSet(1);

    /* renamed from: c, reason: collision with root package name */
    public final Handler f28387c = new Handler(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    public volatile z f28388d = null;

    public b0(h hVar) {
        e(new z(hVar));
    }

    public final synchronized void a(x xVar) {
        Throwable th3;
        try {
            z zVar = this.f28388d;
            if (zVar != null && (th3 = zVar.f28506b) != null) {
                xVar.onResult(th3);
            }
            this.f28386b.add(xVar);
        } catch (Throwable th4) {
            throw th4;
        }
    }

    public final synchronized void b(x xVar) {
        Object obj;
        try {
            z zVar = this.f28388d;
            if (zVar != null && (obj = zVar.f28505a) != null) {
                xVar.onResult(obj);
            }
            this.f28385a.add(xVar);
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized void c(Throwable th3) {
        ArrayList arrayList = new ArrayList(this.f28386b);
        if (arrayList.isEmpty()) {
            jc.b.d("Lottie encountered an error but no failure listener was added:", th3);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((x) it.next()).onResult(th3);
        }
    }

    public final void d() {
        z zVar = this.f28388d;
        if (zVar == null) {
            return;
        }
        Object obj = zVar.f28505a;
        if (obj == null) {
            c(zVar.a());
            return;
        }
        synchronized (this) {
            Iterator it = new ArrayList(this.f28385a).iterator();
            while (it.hasNext()) {
                ((x) it.next()).onResult(obj);
            }
        }
    }

    public final void e(z zVar) {
        if (this.f28388d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.f28388d = zVar;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            d();
        } else {
            this.f28387c.post(new androidx.activity.d(this, 17));
        }
    }

    public b0(Callable callable, boolean z13) {
        if (z13) {
            try {
                e((z) callable.call());
                return;
            } catch (Throwable th3) {
                e(new z(th3));
                return;
            }
        }
        ExecutorService executorService = f28384e;
        a0 a0Var = new a0(callable);
        a0Var.f28380a = this;
        executorService.execute(a0Var);
    }
}
