package e2;

import c2.n1;
import c2.o1;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d extends z {

    /* renamed from: x, reason: collision with root package name */
    public final g1.c0 f56842x;

    public d(o1.k kVar, boolean z13, float f13, n1 n1Var, o1 o1Var) {
        super(kVar, z13, f13, n1Var, o1Var);
        this.f56842x = new g1.c0();
    }

    @Override // u2.p
    public final void E0() {
        this.f56842x.a();
    }

    @Override // e2.z
    public final void M0(o1.n nVar, long j13, float f13) {
        g1.c0 c0Var = this.f56842x;
        Object[] objArr = c0Var.f63239b;
        Object[] objArr2 = c0Var.f63240c;
        long[] jArr = c0Var.f63238a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i13 = 0;
            while (true) {
                long j14 = jArr[i13];
                if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((255 & j14) < 128) {
                            int i16 = (i13 << 3) + i15;
                            Object obj = objArr[i16];
                            q qVar = (q) objArr2[i16];
                            qVar.f56899k.setValue(Boolean.TRUE);
                            qVar.f56897i.Q(Unit.f80348a);
                        }
                        j14 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                }
                if (i13 == length) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        boolean z13 = this.f56922o;
        q qVar2 = new q(z13 ? new a3.c(nVar.f92766a) : null, f13, z13);
        c0Var.l(nVar, qVar2);
        kotlin.jvm.internal.j.z(z0(), null, null, new c(qVar2, this, nVar, null), 3);
        com.bumptech.glide.c.k0(this);
    }

    @Override // e2.z
    public final void N0(d3.h hVar) {
        float f13;
        long[] jArr;
        Object[] objArr;
        Object[] objArr2;
        float f14;
        long[] jArr2;
        Object[] objArr3;
        Object[] objArr4;
        int i13;
        d dVar = this;
        float f15 = ((i) dVar.f56925r.invoke()).f56868d;
        if (f15 == 0.0f) {
            return;
        }
        g1.c0 c0Var = dVar.f56842x;
        Object[] objArr5 = c0Var.f63239b;
        Object[] objArr6 = c0Var.f63240c;
        long[] jArr3 = c0Var.f63238a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i14 = 0;
        while (true) {
            long j13 = jArr3[i14];
            if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i15 = 8;
                int i16 = 8 - ((~(i14 - length)) >>> 31);
                int i17 = 0;
                while (i17 < i16) {
                    if ((255 & j13) < 128) {
                        int i18 = (i14 << 3) + i17;
                        Object obj = objArr5[i18];
                        q qVar = (q) objArr6[i18];
                        long b13 = b3.w.b(dVar.f56924q.a(), f15);
                        if (qVar.f56892d == null) {
                            long g13 = hVar.g();
                            float f16 = r.f56900a;
                            qVar.f56892d = Float.valueOf(Math.max(a3.f.d(g13), a3.f.b(g13)) * 0.3f);
                        }
                        if (qVar.f56889a == null) {
                            f14 = f15;
                            qVar.f56889a = new a3.c(hVar.t0());
                        } else {
                            f14 = f15;
                        }
                        if (qVar.f56893e == null) {
                            qVar.f56893e = new a3.c(com.bumptech.glide.c.d(a3.f.d(hVar.g()) / 2.0f, a3.f.b(hVar.g()) / 2.0f));
                        }
                        float floatValue = (!((Boolean) qVar.f56899k.getValue()).booleanValue() || ((Boolean) qVar.f56898j.getValue()).booleanValue()) ? ((Number) qVar.f56894f.d()).floatValue() : 1.0f;
                        Float f17 = qVar.f56892d;
                        Intrinsics.f(f17);
                        jArr2 = jArr3;
                        float U = tb.f.U(f17.floatValue(), qVar.f56890b, ((Number) qVar.f56895g.d()).floatValue());
                        a3.c cVar = qVar.f56889a;
                        Intrinsics.f(cVar);
                        float d2 = a3.c.d(cVar.f482a);
                        a3.c cVar2 = qVar.f56893e;
                        Intrinsics.f(cVar2);
                        objArr3 = objArr5;
                        float d13 = a3.c.d(cVar2.f482a);
                        j1.d dVar2 = qVar.f56896h;
                        objArr4 = objArr6;
                        float U2 = tb.f.U(d2, d13, ((Number) dVar2.d()).floatValue());
                        a3.c cVar3 = qVar.f56889a;
                        Intrinsics.f(cVar3);
                        i13 = length;
                        float e13 = a3.c.e(cVar3.f482a);
                        a3.c cVar4 = qVar.f56893e;
                        Intrinsics.f(cVar4);
                        long d14 = com.bumptech.glide.c.d(U2, tb.f.U(e13, a3.c.e(cVar4.f482a), ((Number) dVar2.d()).floatValue()));
                        long b14 = b3.w.b(b13, b3.w.d(b13) * floatValue);
                        if (qVar.f56891c) {
                            float d15 = a3.f.d(hVar.g());
                            float b15 = a3.f.b(hVar.g());
                            d3.b p03 = hVar.p0();
                            long e14 = p03.e();
                            p03.a().j();
                            try {
                                p03.f53648a.f53655a.a().e(0.0f, 0.0f, d15, b15, 1);
                                d3.h.O(hVar, b14, U, d14, 0.0f, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL);
                            } finally {
                                ep.b.z(p03, e14);
                            }
                        } else {
                            d3.h.O(hVar, b14, U, d14, 0.0f, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL);
                        }
                    } else {
                        f14 = f15;
                        jArr2 = jArr3;
                        objArr3 = objArr5;
                        objArr4 = objArr6;
                        i13 = length;
                    }
                    j13 >>= 8;
                    i17++;
                    dVar = this;
                    objArr5 = objArr3;
                    jArr3 = jArr2;
                    length = i13;
                    objArr6 = objArr4;
                    i15 = 8;
                    f15 = f14;
                }
                f13 = f15;
                jArr = jArr3;
                objArr2 = objArr6;
                int i19 = length;
                int i23 = i15;
                objArr = objArr5;
                if (i16 != i23) {
                    return;
                } else {
                    length = i19;
                }
            } else {
                f13 = f15;
                jArr = jArr3;
                objArr = objArr5;
                objArr2 = objArr6;
            }
            if (i14 == length) {
                return;
            }
            i14++;
            dVar = this;
            f15 = f13;
            objArr5 = objArr;
            jArr3 = jArr;
            objArr6 = objArr2;
        }
    }

    @Override // e2.z
    public final void P0(o1.n nVar) {
        q qVar = (q) this.f56842x.g(nVar);
        if (qVar != null) {
            qVar.f56899k.setValue(Boolean.TRUE);
            qVar.f56897i.Q(Unit.f80348a);
        }
    }
}
