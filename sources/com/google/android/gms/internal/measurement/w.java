package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final m.h f31678a;

    /* renamed from: b, reason: collision with root package name */
    public m.h f31679b;

    /* renamed from: c, reason: collision with root package name */
    public final gi.m f31680c;

    /* renamed from: d, reason: collision with root package name */
    public final bh.b f31681d;

    public w() {
        m.h hVar = new m.h(10);
        this.f31678a = hVar;
        this.f31679b = ((m.h) hVar.f85198c).S();
        this.f31680c = new gi.m(2);
        this.f31681d = new bh.b(3);
        final int i13 = 0;
        ((androidx.lifecycle.k0) hVar.f85200e).f18655a.put("internal.registerCallback", new Callable(this) { // from class: com.google.android.gms.internal.measurement.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f31280b;

            {
                this.f31280b = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                w wVar = this.f31280b;
                switch (i13) {
                    case 0:
                        return new t6(wVar.f31681d);
                    default:
                        return new t6(wVar.f31680c);
                }
            }
        });
        final int i14 = 1;
        ((androidx.lifecycle.k0) hVar.f85200e).f18655a.put("internal.eventLogger", new Callable(this) { // from class: com.google.android.gms.internal.measurement.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f31280b;

            {
                this.f31280b = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                w wVar = this.f31280b;
                switch (i14) {
                    case 0:
                        return new t6(wVar.f31681d);
                    default:
                        return new t6(wVar.f31680c);
                }
            }
        });
    }

    public final void a(f4 f4Var) {
        j jVar;
        m.h hVar = this.f31678a;
        try {
            this.f31679b = ((m.h) hVar.f85198c).S();
            if (hVar.R(this.f31679b, (h4[]) f4Var.t().toArray(new h4[0])) instanceof h) {
                throw new IllegalStateException("Program loading failed");
            }
            for (e4 e4Var : f4Var.r().u()) {
                i6 t13 = e4Var.t();
                String s13 = e4Var.s();
                Iterator it = t13.iterator();
                while (it.hasNext()) {
                    n R = hVar.R(this.f31679b, (h4) it.next());
                    if (!(R instanceof m)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    m.h hVar2 = this.f31679b;
                    if (hVar2.V(s13)) {
                        n Q = hVar2.Q(s13);
                        if (!(Q instanceof j)) {
                            throw new IllegalStateException("Invalid function name: " + s13);
                        }
                        jVar = (j) Q;
                    } else {
                        jVar = null;
                    }
                    if (jVar == null) {
                        throw new IllegalStateException("Rule function is undefined: " + s13);
                    }
                    jVar.a(this.f31679b, Collections.singletonList(R));
                }
            }
        } catch (Throwable th3) {
            throw new zzc(th3);
        }
    }

    public final boolean b(c cVar) {
        gi.m mVar = this.f31680c;
        try {
            mVar.f65093b = cVar;
            mVar.f65095d = (c) cVar.clone();
            ((List) mVar.f65094c).clear();
            ((m.h) this.f31678a.f85199d).W("runtime.counter", new g(Double.valueOf(0.0d)));
            this.f31681d.x(this.f31679b.S(), mVar);
            gi.m mVar2 = this.f31680c;
            if (!(!((c) mVar2.f65095d).equals((c) mVar2.f65093b))) {
                if (!(!((List) this.f31680c.f65094c).isEmpty())) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th3) {
            throw new zzc(th3);
        }
    }
}
