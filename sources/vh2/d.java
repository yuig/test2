package vh2;

import android.os.Build;
import android.os.Trace;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nf2.p;
import xk2.k;
import xk2.m;
import xk2.q;
import xk2.s;
import xk2.v;

/* loaded from: classes4.dex */
public final class d implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f125848a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final v f125849b = m.b(new a(this, 2));

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f125850c = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public final v f125851d = m.b(new a(this, 1));

    /* renamed from: e, reason: collision with root package name */
    public final v f125852e = m.b(new a(this, 3));

    /* renamed from: f, reason: collision with root package name */
    public final v f125853f = m.b(new a(this, 4));

    /* renamed from: g, reason: collision with root package name */
    public final v f125854g = m.b(new a(this, 0));

    /* renamed from: h, reason: collision with root package name */
    public final v f125855h = m.b(new a(this, 5));

    public static void a(List list, Function1 function1) {
        for (Object obj : list) {
            try {
                q qVar = s.f135225b;
                function1.invoke(obj);
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                q qVar2 = s.f135225b;
                ue.c.m(th3);
            }
        }
    }

    public final void c(k service) {
        Intrinsics.checkNotNullParameter(service, "service");
        if (this.f125850c.get()) {
            throw new IllegalStateException("Cannot register a service - already initialized.".toString());
        }
        this.f125848a.add(service);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a((List) this.f125851d.getValue(), b.f125846a);
    }

    public final void d(k... services) {
        p instance;
        Intrinsics.checkNotNullParameter(services, "services");
        try {
            instance = c0.d.L2();
        } catch (Throwable th3) {
            th = th3;
            instance = null;
        }
        try {
            for (k kVar : services) {
                c(kVar);
            }
            Unit unit = Unit.f80348a;
        } catch (Throwable th4) {
            th = th4;
            try {
                throw th;
            } finally {
                if (instance != null) {
                    Intrinsics.checkNotNullParameter(instance, "instance");
                    if (Build.VERSION.SDK_INT >= 29) {
                        Trace.endAsyncSection(instance.f90515a, instance.f90516b);
                    }
                }
            }
        }
    }
}
