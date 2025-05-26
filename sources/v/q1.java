package v;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class q1 implements g0.c, aq.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123607a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f123608b;

    public /* synthetic */ q1(Object obj, int i13) {
        this.f123607a = i13;
        this.f123608b = obj;
    }

    public void a(Throwable throwable) {
        int i13 = this.f123607a;
        Object obj = this.f123608b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                zp.d1 d1Var = (zp.d1) obj;
                d1Var.getEventManager().d(new of0.b());
                d1Var.r0().h(m60.x0.generic_error);
                break;
            default:
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                t11.f fVar = (t11.f) obj;
                fVar.f115802b.d(new of0.b());
                if (fVar.isBound()) {
                    ((u11.c) ((q11.d) fVar.getView())).T8(m60.x0.generic_error);
                    break;
                }
                break;
        }
    }

    @Override // g0.c
    public void onFailure(Throwable th3) {
        v2 v2Var;
        switch (this.f123607a) {
            case 0:
                synchronized (((t1) this.f123608b).f123661a) {
                    try {
                        ((t1) this.f123608b).f123664d.p();
                        int ordinal = ((t1) this.f123608b).f123669i.ordinal();
                        if ((ordinal == 3 || ordinal == 5 || ordinal == 6) && !(th3 instanceof CancellationException)) {
                            kh2.m0.Y0("CaptureSession", "Opening session with fail " + ((t1) this.f123608b).f123669i, th3);
                            ((t1) this.f123608b).c();
                        }
                    } finally {
                    }
                }
                return;
            default:
                v2 v2Var2 = (v2) this.f123608b;
                w2 w2Var = (w2) v2Var2;
                synchronized (w2Var.f123697a) {
                    try {
                        List list = w2Var.f123707k;
                        if (list != null) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                ((androidx.camera.core.impl.z0) it.next()).b();
                            }
                            w2Var.f123707k = null;
                        }
                    } finally {
                    }
                }
                w2Var.f123728u.i();
                w1 w1Var = v2Var2.f123698b;
                Iterator it2 = w1Var.d().iterator();
                while (it2.hasNext() && (v2Var = (v2) it2.next()) != v2Var2) {
                    w2 w2Var2 = (w2) v2Var;
                    synchronized (w2Var2.f123697a) {
                        try {
                            List list2 = w2Var2.f123707k;
                            if (list2 != null) {
                                Iterator it3 = list2.iterator();
                                while (it3.hasNext()) {
                                    ((androidx.camera.core.impl.z0) it3.next()).b();
                                }
                                w2Var2.f123707k = null;
                            }
                        } finally {
                        }
                    }
                    w2Var2.f123728u.i();
                }
                synchronized (w1Var.f123717b) {
                    ((Set) w1Var.f123720e).remove(v2Var2);
                }
                return;
        }
    }

    @Override // g0.c
    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        switch (this.f123607a) {
            case 0:
                break;
            default:
                break;
        }
    }
}
