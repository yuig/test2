package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import i2.c2;
import i2.f2;
import i2.q1;
import i2.r1;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes2.dex */
public abstract class o {
    public static final void c(Function0 function0, u2.q qVar, l0 l0Var, Function2 function2, i2.o oVar, int i13, int i14) {
        int i15;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(2002163445);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (sVar.j(function0) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= sVar.h(qVar) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= sVar.h(l0Var) ? RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER : RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        }
        if ((i14 & 8) != 0) {
            i15 |= 3072;
        } else if ((i13 & 3072) == 0) {
            i15 |= sVar.j(function2) ? 2048 : 1024;
        }
        if ((i15 & 1171) == 1170 && sVar.z()) {
            sVar.Q();
        } else {
            if (i16 != 0) {
                qVar = u2.n.f120041b;
            }
            if (i17 != 0) {
                l0Var = null;
            }
            e(q2.i.c(-1488997347, new i1.l(l0Var, qVar, function2, bs1.c.K1(function0, sVar), 1), sVar), sVar, 6);
        }
        u2.q qVar2 = qVar;
        l0 l0Var2 = l0Var;
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new l1.r(function0, qVar2, l0Var2, function2, i13, i14);
        }
    }

    public static final void d(Object obj, int i13, i0 i0Var, Function2 function2, i2.o oVar, int i14) {
        int i15;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-2079116560);
        if ((i14 & 6) == 0) {
            i15 = (sVar.j(obj) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= sVar.f(i13) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= sVar.j(i0Var) ? RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER : RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        }
        if ((i14 & 3072) == 0) {
            i15 |= sVar.j(function2) ? 2048 : 1024;
        }
        if ((i15 & 1171) == 1170 && sVar.z()) {
            sVar.Q();
        } else {
            boolean h10 = sVar.h(obj) | sVar.h(i0Var);
            Object J2 = sVar.J();
            am.d dVar = i2.n.f71185a;
            if (h10 || J2 == dVar) {
                J2 = new h0(obj, i0Var);
                sVar.g0(J2);
            }
            h0 h0Var = (h0) J2;
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = h0Var.f17248c;
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = h0Var.f17250e;
            ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = h0Var.f17251f;
            parcelableSnapshotMutableIntState.i(i13);
            i2.u0 u0Var = q3.a1.f102167a;
            h0 h0Var2 = (h0) sVar.m(u0Var);
            s2.i P = bk.f.P();
            Function1 f13 = P != null ? P.f() : null;
            s2.i X = bk.f.X(P);
            try {
                if (h0Var2 != ((h0) parcelableSnapshotMutableState2.getValue())) {
                    parcelableSnapshotMutableState2.setValue(h0Var2);
                    if (h0Var.f17249d.h() > 0) {
                        h0 h0Var3 = (h0) parcelableSnapshotMutableState.getValue();
                        if (h0Var3 != null) {
                            h0Var3.b();
                        }
                        if (h0Var2 != null) {
                            h0Var2.a();
                        } else {
                            h0Var2 = null;
                        }
                        parcelableSnapshotMutableState.setValue(h0Var2);
                    }
                }
                Unit unit = Unit.f80348a;
                bk.f.c0(P, X, f13);
                boolean h13 = sVar.h(h0Var);
                Object J3 = sVar.J();
                if (h13 || J3 == dVar) {
                    J3 = new q0.e(h0Var, 15);
                    sVar.g0(J3);
                }
                i2.u.b(h0Var, (Function1) J3, sVar);
                com.bumptech.glide.d.a(u0Var.c(h0Var), function2, sVar, ((i15 >> 6) & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) | 8);
            } catch (Throwable th3) {
                bk.f.c0(P, X, f13);
                throw th3;
            }
        }
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new l1.p(obj, i13, i0Var, function2, i14);
        }
    }

    public static final void e(kl2.l lVar, i2.o oVar, int i13) {
        int i14;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(674185128);
        int i15 = 2;
        if ((i13 & 6) == 0) {
            i14 = (sVar.j(lVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i14 & 3) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            c2 c2Var = r2.o.f106060a;
            r2.k kVar = (r2.k) sVar.m(c2Var);
            Object[] objArr = {kVar};
            t0 t0Var = t0.f17292i;
            s0 s0Var = new s0(kVar, 1);
            r2.s sVar2 = r2.t.f106065a;
            r2.s sVar3 = new r2.s(t0Var, s0Var);
            boolean j13 = sVar.j(kVar);
            Object J2 = sVar.J();
            if (j13 || J2 == i2.n.f71185a) {
                J2 = new j1.q0(kVar, 6);
                sVar.g0(J2);
            }
            Object obj = (v0) so.a.i(objArr, sVar3, (Function0) J2, sVar, 0, 4);
            com.bumptech.glide.d.a(c2Var.c(obj), q2.i.c(1863926504, new v(i15, obj, lVar), sVar), sVar, 56);
        }
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new j1.t0(lVar, i13, i15);
        }
    }

    public static final void f(y yVar, Object obj, int i13, Object obj2, i2.o oVar, int i14) {
        int i15;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(1439843069);
        if ((i14 & 6) == 0) {
            i15 = (sVar.h(yVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= sVar.h(obj) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= sVar.f(i13) ? RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER : RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        }
        if ((i14 & 3072) == 0) {
            i15 |= sVar.h(obj2) ? 2048 : 1024;
        }
        if ((i15 & 1171) == 1170 && sVar.z()) {
            sVar.Q();
        } else {
            ((r2.d) obj).e(obj2, q2.i.c(980966366, new k1.z(i13, yVar, obj2), sVar), sVar, 48);
        }
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new l1.p(yVar, obj, i13, obj2, i14);
        }
    }

    public static final int g(int i13, k2.e eVar) {
        int i14 = eVar.f78184c - 1;
        int i15 = 0;
        while (i15 < i14) {
            int b13 = a.a.b(i14, i15, 2, i15);
            Object[] objArr = eVar.f78182a;
            int i16 = ((f) objArr[b13]).f17236a;
            if (i16 != i13) {
                if (i16 < i13) {
                    i15 = b13 + 1;
                    if (i13 < ((f) objArr[i15]).f17236a) {
                    }
                } else {
                    i14 = b13 - 1;
                }
            }
            return b13;
        }
        return i15;
    }

    public static final List h(y yVar, i0 i0Var, i iVar) {
        IntRange intRange;
        if (!iVar.f17252a.m() && i0Var.f17253a.isEmpty()) {
            return kotlin.collections.q0.f80391a;
        }
        ArrayList arrayList = new ArrayList();
        k2.e eVar = iVar.f17252a;
        if (!eVar.m()) {
            IntRange.f80450e.getClass();
            intRange = IntRange.f80451f;
        } else {
            if (eVar.l()) {
                throw new NoSuchElementException("MutableVector is empty.");
            }
            Object[] objArr = eVar.f78182a;
            int i13 = ((h) objArr[0]).f17244a;
            int i14 = eVar.f78184c;
            if (i14 > 0) {
                int i15 = 0;
                do {
                    int i16 = ((h) objArr[i15]).f17244a;
                    if (i16 < i13) {
                        i13 = i16;
                    }
                    i15++;
                } while (i15 < i14);
            }
            if (i13 < 0) {
                throw new IllegalArgumentException("negative minIndex".toString());
            }
            if (eVar.l()) {
                throw new NoSuchElementException("MutableVector is empty.");
            }
            Object[] objArr2 = eVar.f78182a;
            int i17 = ((h) objArr2[0]).f17245b;
            int i18 = eVar.f78184c;
            if (i18 > 0) {
                int i19 = 0;
                do {
                    int i23 = ((h) objArr2[i19]).f17245b;
                    if (i23 > i17) {
                        i17 = i23;
                    }
                    i19++;
                } while (i19 < i18);
            }
            intRange = new IntRange(i13, Math.min(i17, yVar.a() - 1), 1);
        }
        int size = i0Var.f17253a.size();
        for (int i24 = 0; i24 < size; i24++) {
            h0 h0Var = (h0) i0Var.get(i24);
            int j13 = j(h0Var.f17248c.h(), yVar, h0Var.f17246a);
            int i25 = intRange.f80453a;
            if ((j13 > intRange.f80454b || i25 > j13) && j13 >= 0 && j13 < yVar.a()) {
                arrayList.add(Integer.valueOf(j13));
            }
        }
        int i26 = intRange.f80453a;
        int i27 = intRange.f80454b;
        if (i26 <= i27) {
            while (true) {
                arrayList.add(Integer.valueOf(i26));
                if (i26 == i27) {
                    break;
                }
                i26++;
            }
        }
        return arrayList;
    }

    public static q1 i() {
        return bs1.c.u1(Unit.f80348a, r1.f71258a);
    }

    public static final int j(int i13, y yVar, Object obj) {
        int b13;
        return (obj == null || yVar.a() == 0 || (i13 < yVar.a() && Intrinsics.d(obj, yVar.c(i13))) || (b13 = yVar.b(obj)) == -1) ? i13 : b13;
    }

    public static final Object l(int i13) {
        return new DefaultLazyKey(i13);
    }

    public static final void o(q1 q1Var) {
        q1Var.setValue(Unit.f80348a);
    }

    public static final u2.q p(u2.q qVar, n nVar, i iVar, boolean z13, n4.k kVar, m1.f1 f1Var, boolean z14, i2.o oVar, int i13) {
        if (!z14) {
            i2.s sVar = (i2.s) oVar;
            sVar.W(-1890658823);
            sVar.r(false);
            return qVar;
        }
        i2.s sVar2 = (i2.s) oVar;
        sVar2.W(-1890632411);
        boolean z15 = true;
        boolean z16 = ((((i13 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) ^ 48) > 32 && sVar2.h(nVar)) || (i13 & 48) == 32) | ((((i13 & 896) ^ 384) > 256 && sVar2.h(iVar)) || (i13 & 384) == 256) | ((((i13 & 7168) ^ 3072) > 2048 && sVar2.i(z13)) || (i13 & 3072) == 2048) | ((((57344 & i13) ^ 24576) > 16384 && sVar2.h(kVar)) || (i13 & 24576) == 16384);
        if ((((458752 & i13) ^ 196608) <= 131072 || !sVar2.h(f1Var)) && (i13 & 196608) != 131072) {
            z15 = false;
        }
        boolean z17 = z16 | z15;
        Object J2 = sVar2.J();
        if (z17 || J2 == i2.n.f71185a) {
            J2 = new m(nVar, iVar, z13, kVar, f1Var);
            sVar2.g0(J2);
        }
        u2.q j13 = qVar.j((m) J2);
        sVar2.r(false);
        return j13;
    }

    public static final u2.q q(u2.q qVar, rl2.r rVar, n0 n0Var, m1.f1 f1Var, boolean z13, boolean z14) {
        return qVar.j(new LazyLayoutSemanticsModifier(rVar, n0Var, f1Var, z13, z14));
    }

    public Object k(int i13) {
        f c13 = m().c(i13);
        return ((q) c13.f17238c).getType().invoke(Integer.valueOf(i13 - c13.f17236a));
    }

    public abstract w0 m();

    public Object n(int i13) {
        Object invoke;
        f c13 = m().c(i13);
        int i14 = i13 - c13.f17236a;
        Function1 key = ((q) c13.f17238c).getKey();
        return (key == null || (invoke = key.invoke(Integer.valueOf(i14))) == null) ? new DefaultLazyKey(i13) : invoke;
    }

    public abstract void r();
}
