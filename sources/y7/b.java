package y7;

import a.z0;
import a7.k0;
import a7.m0;
import a7.n0;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.lifecycle.n1;
import g8.e0;
import java.util.ArrayList;
import m7.h;
import m7.i0;
import m7.l0;
import qq2.c;
import v4.f;

/* loaded from: classes.dex */
public final class b extends h implements Handler.Callback {
    public long A;

    /* renamed from: r, reason: collision with root package name */
    public final a f137956r;

    /* renamed from: s, reason: collision with root package name */
    public final i0 f137957s;

    /* renamed from: t, reason: collision with root package name */
    public final Handler f137958t;

    /* renamed from: u, reason: collision with root package name */
    public final y8.a f137959u;

    /* renamed from: v, reason: collision with root package name */
    public dl2.b f137960v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f137961w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f137962x;

    /* renamed from: y, reason: collision with root package name */
    public long f137963y;

    /* renamed from: z, reason: collision with root package name */
    public n0 f137964z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(i0 i0Var, Looper looper) {
        super(5);
        n1 n1Var = a.f137955hp;
        this.f137957s = i0Var;
        this.f137958t = looper == null ? null : new Handler(looper, this);
        this.f137956r = n1Var;
        this.f137959u = new y8.a(1);
        this.A = -9223372036854775807L;
    }

    @Override // m7.h
    public final void A(long j13, long j14) {
        boolean z13;
        do {
            z13 = false;
            if (!this.f137961w && this.f137964z == null) {
                y8.a aVar = this.f137959u;
                aVar.n();
                c cVar = this.f86172c;
                cVar.c();
                int z14 = z(cVar, aVar, 0);
                if (z14 == -4) {
                    if (aVar.i(4)) {
                        this.f137961w = true;
                    } else if (aVar.f78456g >= this.f86181l) {
                        aVar.f138022k = this.f137963y;
                        aVar.q();
                        dl2.b bVar = this.f137960v;
                        int i13 = d7.n0.f53866a;
                        n0 d03 = bVar.d0(aVar);
                        if (d03 != null) {
                            ArrayList arrayList = new ArrayList(d03.f1152a.length);
                            H(d03, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.f137964z = new n0(I(aVar.f78456g), (m0[]) arrayList.toArray(new m0[0]));
                            }
                        }
                    }
                } else if (z14 == -5) {
                    androidx.media3.common.b bVar2 = (androidx.media3.common.b) cVar.f104884c;
                    bVar2.getClass();
                    this.f137963y = bVar2.f18770t;
                }
            }
            n0 n0Var = this.f137964z;
            if (n0Var != null && n0Var.f1153b <= I(j13)) {
                n0 n0Var2 = this.f137964z;
                Handler handler = this.f137958t;
                if (handler != null) {
                    handler.obtainMessage(1, n0Var2).sendToTarget();
                } else {
                    J(n0Var2);
                }
                this.f137964z = null;
                z13 = true;
            }
            if (this.f137961w && this.f137964z == null) {
                this.f137962x = true;
            }
        } while (z13);
    }

    @Override // m7.h
    public final int F(androidx.media3.common.b bVar) {
        if (((n1) this.f137956r).j(bVar)) {
            return h.f(bVar.N == 0 ? 4 : 2, 0, 0, 0);
        }
        return h.f(0, 0, 0, 0);
    }

    public final void H(n0 n0Var, ArrayList arrayList) {
        int i13 = 0;
        while (true) {
            m0[] m0VarArr = n0Var.f1152a;
            if (i13 >= m0VarArr.length) {
                return;
            }
            androidx.media3.common.b a13 = m0VarArr[i13].a();
            if (a13 != null) {
                n1 n1Var = (n1) this.f137956r;
                if (n1Var.j(a13)) {
                    dl2.b g13 = n1Var.g(a13);
                    byte[] c13 = m0VarArr[i13].c();
                    c13.getClass();
                    y8.a aVar = this.f137959u;
                    aVar.n();
                    aVar.p(c13.length);
                    aVar.f78454e.put(c13);
                    aVar.q();
                    n0 d03 = g13.d0(aVar);
                    if (d03 != null) {
                        H(d03, arrayList);
                    }
                    i13++;
                }
            }
            arrayList.add(m0VarArr[i13]);
            i13++;
        }
    }

    public final long I(long j13) {
        bf.b.t(j13 != -9223372036854775807L);
        bf.b.t(this.A != -9223372036854775807L);
        return j13 - this.A;
    }

    public final void J(n0 n0Var) {
        i0 i0Var = this.f137957s;
        l0 l0Var = i0Var.f86205a;
        k0 a13 = l0Var.f86274l0.a();
        int i13 = 0;
        while (true) {
            m0[] m0VarArr = n0Var.f1152a;
            if (i13 >= m0VarArr.length) {
                break;
            }
            m0VarArr[i13].b(a13);
            i13++;
        }
        l0Var.f86274l0 = new a7.l0(a13);
        a7.l0 h03 = l0Var.h0();
        boolean equals = h03.equals(l0Var.R);
        f fVar = l0Var.f86277n;
        if (!equals) {
            l0Var.R = h03;
            fVar.j(14, new z0(i0Var, 23));
        }
        fVar.j(28, new z0(n0Var, 24));
        fVar.g();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        J((n0) message.obj);
        return true;
    }

    @Override // m7.h
    public final String m() {
        return "MetadataRenderer";
    }

    @Override // m7.h
    public final boolean o() {
        return this.f137962x;
    }

    @Override // m7.h
    public final boolean q() {
        return true;
    }

    @Override // m7.h
    public final void r() {
        this.f137964z = null;
        this.f137960v = null;
        this.A = -9223372036854775807L;
    }

    @Override // m7.h
    public final void t(long j13, boolean z13) {
        this.f137964z = null;
        this.f137961w = false;
        this.f137962x = false;
    }

    @Override // m7.h
    public final void y(androidx.media3.common.b[] bVarArr, long j13, long j14, e0 e0Var) {
        this.f137960v = ((n1) this.f137956r).g(bVarArr[0]);
        n0 n0Var = this.f137964z;
        if (n0Var != null) {
            long j15 = this.A;
            long j16 = n0Var.f1153b;
            long j17 = (j15 + j16) - j14;
            if (j16 != j17) {
                n0Var = new n0(j17, n0Var.f1152a);
            }
            this.f137964z = n0Var;
        }
        this.A = j14;
    }
}
