package n3;

import androidx.compose.ui.input.pointer.PointerInputResetException;
import ao2.k2;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o0 extends u2.p implements h0, w, n4.b {

    /* renamed from: n, reason: collision with root package name */
    public Object f89096n;

    /* renamed from: o, reason: collision with root package name */
    public Object f89097o;

    /* renamed from: p, reason: collision with root package name */
    public Object[] f89098p;

    /* renamed from: q, reason: collision with root package name */
    public Function2 f89099q;

    /* renamed from: r, reason: collision with root package name */
    public k2 f89100r;

    /* renamed from: v, reason: collision with root package name */
    public j f89104v;

    /* renamed from: s, reason: collision with root package name */
    public j f89101s = f0.f89054a;

    /* renamed from: t, reason: collision with root package name */
    public final k2.e f89102t = new k2.e(new l0[16]);

    /* renamed from: u, reason: collision with root package name */
    public final k2.e f89103u = new k2.e(new l0[16]);

    /* renamed from: w, reason: collision with root package name */
    public long f89105w = 0;

    public o0(Object obj, Object obj2, Object[] objArr, Function2 function2) {
        this.f89096n = obj;
        this.f89097o = obj2;
        this.f89098p = objArr;
        this.f89099q = function2;
    }

    @Override // u2.p
    public final void E0() {
        O0();
    }

    public final Object M0(Function2 function2, bl2.c frame) {
        cl2.a aVar;
        ao2.o oVar = new ao2.o(1, cl2.h.b(frame));
        oVar.v();
        l0 completion = new l0(this, oVar);
        synchronized (this.f89102t) {
            this.f89102t.b(completion);
            Intrinsics.checkNotNullParameter(function2, "<this>");
            Intrinsics.checkNotNullParameter(completion, "completion");
            bl2.c b13 = cl2.h.b(cl2.h.a(function2, completion, completion));
            aVar = cl2.a.COROUTINE_SUSPENDED;
            bl2.f fVar = new bl2.f(aVar, b13);
            xk2.q qVar = xk2.s.f135225b;
            fVar.resumeWith(Unit.f80348a);
        }
        oVar.e(new q0.e(completion, 25));
        Object u13 = oVar.u();
        if (u13 == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return u13;
    }

    public final void N0(j jVar, k kVar) {
        ao2.m mVar;
        k2.e eVar;
        int i13;
        ao2.m mVar2;
        synchronized (this.f89102t) {
            k2.e eVar2 = this.f89103u;
            eVar2.d(eVar2.f78184c, this.f89102t);
        }
        try {
            int i14 = m0.f89090a[kVar.ordinal()];
            if (i14 == 1 || i14 == 2) {
                k2.e eVar3 = this.f89103u;
                int i15 = eVar3.f78184c;
                if (i15 > 0) {
                    Object[] objArr = eVar3.f78182a;
                    int i16 = 0;
                    do {
                        l0 l0Var = (l0) objArr[i16];
                        if (kVar == l0Var.f89086d && (mVar = l0Var.f89085c) != null) {
                            l0Var.f89085c = null;
                            xk2.q qVar = xk2.s.f135225b;
                            mVar.resumeWith(jVar);
                        }
                        i16++;
                    } while (i16 < i15);
                }
            } else if (i14 == 3 && (i13 = (eVar = this.f89103u).f78184c) > 0) {
                int i17 = i13 - 1;
                Object[] objArr2 = eVar.f78182a;
                do {
                    l0 l0Var2 = (l0) objArr2[i17];
                    if (kVar == l0Var2.f89086d && (mVar2 = l0Var2.f89085c) != null) {
                        l0Var2.f89085c = null;
                        xk2.q qVar2 = xk2.s.f135225b;
                        mVar2.resumeWith(jVar);
                    }
                    i17--;
                } while (i17 >= 0);
            }
        } finally {
            this.f89103u.h();
        }
    }

    public final void O0() {
        k2 k2Var = this.f89100r;
        if (k2Var != null) {
            k2Var.cancel((CancellationException) new PointerInputResetException());
            this.f89100r = null;
        }
    }

    @Override // s3.f2
    public final void W(j jVar, k kVar, long j13) {
        this.f89105w = j13;
        if (kVar == k.Initial) {
            this.f89101s = jVar;
        }
        if (this.f89100r == null) {
            this.f89100r = kotlin.jvm.internal.j.z(z0(), null, ao2.l0.UNDISPATCHED, new n0(this, null), 1);
        }
        N0(jVar, kVar);
        List list = jVar.f89070a;
        int size = list.size();
        boolean z13 = false;
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                z13 = true;
                break;
            } else if (!c0.d.u((q) list.get(i13))) {
                break;
            } else {
                i13++;
            }
        }
        if (!(!z13)) {
            jVar = null;
        }
        this.f89104v = jVar;
    }

    @Override // n4.b
    public final float b() {
        return com.bumptech.glide.c.U0(this).f110830r.b();
    }

    @Override // s3.f2
    public final void c0() {
        j jVar = this.f89104v;
        if (jVar == null) {
            return;
        }
        List list = jVar.f89070a;
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            if (!(!((q) list.get(i13)).f())) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    q qVar = (q) list.get(i14);
                    arrayList.add(new q(qVar.d(), qVar.l(), qVar.e(), qVar.g(), qVar.l(), qVar.e(), qVar.f(), qVar.f()));
                }
                j jVar2 = new j(arrayList, null);
                this.f89101s = jVar2;
                N0(jVar2, k.Initial);
                N0(jVar2, k.Main);
                N0(jVar2, k.Final);
                this.f89104v = null;
                return;
            }
        }
    }

    @Override // s3.f2
    public final void i0() {
        O0();
    }

    @Override // n4.b
    public final float j0() {
        return com.bumptech.glide.c.U0(this).f110830r.j0();
    }

    @Override // s3.f2
    public final void w0() {
        O0();
    }
}
