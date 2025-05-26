package bi2;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.b0;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import androidx.lifecycle.x;
import androidx.lifecycle.z;
import di2.j;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kh2.e3;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import xk2.s;

/* loaded from: classes4.dex */
public final class e implements h, x {

    /* renamed from: a, reason: collision with root package name */
    public final og2.a f22893a;

    /* renamed from: b, reason: collision with root package name */
    public final lh2.b f22894b;

    /* renamed from: c, reason: collision with root package name */
    public final z f22895c;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f22896d;

    /* renamed from: e, reason: collision with root package name */
    public di2.c f22897e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f22898f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f22899g;

    public e(og2.a clock, lh2.b logger, z lifecycleOwner) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.f22893a = clock;
        this.f22894b = logger;
        this.f22895c = lifecycleOwner;
        this.f22896d = new CopyOnWriteArrayList();
        this.f22898f = true;
        this.f22899g = true ^ ((b0) lifecycleOwner.getLifecycle()).f18588d.isAtLeast(r.STARTED);
        Looper looper = ii2.c.f72333a;
        e3 runnable = new e3(this, 2);
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        f0.a aVar = new f0.a(2, runnable);
        if (Thread.currentThread() != ii2.c.f72334b) {
            new Handler(ii2.c.f72333a).post(aVar);
        } else {
            aVar.run();
        }
    }

    @Override // androidx.lifecycle.x
    public final void c(z source, q event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        int i13 = d.f22892a[event.ordinal()];
        if (i13 != 1) {
            if (i13 != 2) {
                return;
            }
            this.f22899g = true;
            long now = this.f22893a.now();
            try {
                di2.c cVar = this.f22897e;
                if (cVar != null) {
                    ((j) cVar).o(now);
                }
            } catch (Exception e13) {
                ((lh2.e) this.f22894b).b(lh2.g.PROCESS_STATE_CALLBACK_FAIL, e13);
            }
            Iterator it = CollectionsKt.F0(this.f22896d).iterator();
            while (it.hasNext()) {
                try {
                    ((g) it.next()).o(now);
                } catch (Exception e14) {
                    ((lh2.e) this.f22894b).b(lh2.g.PROCESS_STATE_CALLBACK_FAIL, e14);
                }
            }
            return;
        }
        this.f22899g = false;
        long now2 = this.f22893a.now();
        try {
            di2.c cVar2 = this.f22897e;
            if (cVar2 != null) {
                ((j) cVar2).e(now2, this.f22898f);
            }
        } catch (Exception e15) {
            ((lh2.e) this.f22894b).b(lh2.g.PROCESS_STATE_CALLBACK_FAIL, e15);
        }
        Iterator it2 = CollectionsKt.F0(this.f22896d).iterator();
        while (it2.hasNext()) {
            try {
                ((g) it2.next()).e(now2, this.f22898f);
            } catch (Exception e16) {
                ((lh2.e) this.f22894b).b(lh2.g.PROCESS_STATE_CALLBACK_FAIL, e16);
            }
        }
        this.f22898f = false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            xk2.q qVar = s.f135225b;
            this.f22896d.clear();
            this.f22897e = null;
            Unit unit = Unit.f80348a;
        } catch (Throwable th3) {
            xk2.q qVar2 = s.f135225b;
            ue.c.m(th3);
        }
    }
}
