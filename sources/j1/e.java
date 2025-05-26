package j1;

import com.google.android.gms.ads.AdSize;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final p f74043a = new p(Float.POSITIVE_INFINITY);

    /* renamed from: b, reason: collision with root package name */
    public static final q f74044b = new q(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: c, reason: collision with root package name */
    public static final r f74045c = new r(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: d, reason: collision with root package name */
    public static final s f74046d = new s(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: e, reason: collision with root package name */
    public static final p f74047e = new p(Float.NEGATIVE_INFINITY);

    /* renamed from: f, reason: collision with root package name */
    public static final q f74048f = new q(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: g, reason: collision with root package name */
    public static final r f74049g = new r(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: h, reason: collision with root package name */
    public static final s f74050h = new s(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f74051i = 0;

    public static d a(float f13) {
        return new d(Float.valueOf(f13), q2.f74205a, Float.valueOf(0.01f), 8);
    }

    public static o b(float f13, float f14) {
        return new o(q2.f74205a, Float.valueOf(f13), new p(f14), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static final Object c(float f13, float f14, float f15, n nVar, Function2 function2, bl2.c cVar) {
        p2 p2Var = q2.f74205a;
        Float f16 = new Float(f13);
        Float f17 = new Float(f14);
        t tVar = (t) i2.f74104n.invoke(new Float(f15));
        Object d2 = d(new o(p2Var, f16, tVar, 56), new w1(nVar, p2Var, f16, f17, tVar), Long.MIN_VALUE, new r1(0, function2, p2Var), cVar);
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        if (d2 != aVar) {
            d2 = Unit.f80348a;
        }
        return d2 == aVar ? d2 : Unit.f80348a;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0104 A[Catch: CancellationException -> 0x003c, TryCatch #1 {CancellationException -> 0x003c, blocks: (B:13:0x0038, B:16:0x00ef, B:18:0x0104, B:20:0x0130, B:27:0x0135), top: B:12:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0149 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(j1.o r24, j1.j r25, long r26, kotlin.jvm.functions.Function1 r28, bl2.c r29) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.e.d(j1.o, j1.j, long, kotlin.jvm.functions.Function1, bl2.c):java.lang.Object");
    }

    public static /* synthetic */ Object e(float f13, float f14, n nVar, Function2 function2, bl2.c cVar, int i13) {
        if ((i13 & 8) != 0) {
            nVar = q(0.0f, 0.0f, null, 7);
        }
        return c(f13, f14, 0.0f, nVar, function2, cVar);
    }

    public static final Object f(o oVar, a0 a0Var, boolean z13, Function1 function1, bl2.c cVar) {
        Object d2 = d(oVar, new z(a0Var, oVar.f74168a, oVar.f74169b.getValue(), oVar.f74170c), z13 ? oVar.f74171d : Long.MIN_VALUE, function1, cVar);
        return d2 == cl2.a.COROUTINE_SUSPENDED ? d2 : Unit.f80348a;
    }

    public static final Object g(o oVar, Float f13, n nVar, boolean z13, Function1 function1, bl2.c cVar) {
        Object d2 = d(oVar, new w1(nVar, oVar.f74168a, oVar.f74169b.getValue(), f13, oVar.f74170c), z13 ? oVar.f74171d : Long.MIN_VALUE, function1, cVar);
        return d2 == cl2.a.COROUTINE_SUSPENDED ? d2 : Unit.f80348a;
    }

    public static int i(g1.t tVar, int i13) {
        int i14 = tVar.f63324b;
        int i15 = 0;
        if (i14 < 0) {
            throw new IllegalArgumentException("fromIndex(0) > toIndex(" + i14 + ')');
        }
        int i16 = i14 - 1;
        while (i15 <= i16) {
            int i17 = (i15 + i16) >>> 1;
            int e13 = tVar.e(i17);
            if (e13 < i13) {
                i15 = i17 + 1;
            } else {
                if (e13 <= i13) {
                    return i17;
                }
                i16 = i17 - 1;
            }
        }
        return -(i15 + 1);
    }

    public static final long j(u2 u2Var, long j13) {
        return ql2.s.i(j13 - u2Var.n(), 0L, u2Var.r());
    }

    public static final t k(t tVar) {
        t c13 = tVar.c();
        int b13 = c13.b();
        for (int i13 = 0; i13 < b13; i13++) {
            c13.e(i13, tVar.a(i13));
        }
        return c13;
    }

    public static o l(o oVar, float f13, float f14, int i13) {
        if ((i13 & 1) != 0) {
            f13 = ((Number) oVar.f74169b.getValue()).floatValue();
        }
        if ((i13 & 2) != 0) {
            f14 = ((p) oVar.f74170c).f74189a;
        }
        return new o(oVar.f74168a, Float.valueOf(f13), new p(f14), oVar.f74171d, oVar.f74172e, oVar.f74173f);
    }

    public static final void m(m mVar, long j13, float f13, j jVar, o oVar, Function1 function1) {
        long d2 = f13 == 0.0f ? jVar.d() : (long) ((j13 - mVar.f74146c) / f13);
        mVar.f74150g = j13;
        mVar.f74148e.setValue(jVar.f(d2));
        mVar.f74149f = jVar.b(d2);
        if (jVar.c(d2)) {
            mVar.f74151h = mVar.f74150g;
            mVar.f74152i.setValue(Boolean.FALSE);
        }
        s(mVar, oVar);
        function1.invoke(mVar);
    }

    public static final float n(CoroutineContext coroutineContext) {
        u2.r rVar = (u2.r) coroutineContext.get(u2.b.f120028p);
        float c13 = rVar != null ? rVar.c() : 1.0f;
        if (c13 >= 0.0f) {
            return c13;
        }
        throw new IllegalStateException("negative scale factor");
    }

    public static n0 o(b0 b0Var, l1 l1Var, int i13) {
        if ((i13 & 2) != 0) {
            l1Var = l1.Restart;
        }
        return new n0(b0Var, l1Var, 0);
    }

    public static m1 p() {
        return new m1(0);
    }

    public static o1 q(float f13, float f14, Object obj, int i13) {
        if ((i13 & 1) != 0) {
            f13 = 1.0f;
        }
        if ((i13 & 2) != 0) {
            f14 = 1500.0f;
        }
        if ((i13 & 4) != 0) {
            obj = null;
        }
        return new o1(f13, f14, obj);
    }

    public static o2 r(int i13, int i14, c0 c0Var, int i15) {
        if ((i15 & 1) != 0) {
            i13 = AdSize.MEDIUM_RECTANGLE_WIDTH;
        }
        if ((i15 & 2) != 0) {
            i14 = 0;
        }
        if ((i15 & 4) != 0) {
            c0Var = g0.f74070a;
        }
        return new o2(i13, i14, c0Var);
    }

    public static final void s(m mVar, o oVar) {
        oVar.f74169b.setValue(mVar.f74148e.getValue());
        t tVar = oVar.f74170c;
        t tVar2 = mVar.f74149f;
        int b13 = tVar.b();
        for (int i13 = 0; i13 < b13; i13++) {
            tVar.e(i13, tVar2.a(i13));
        }
        oVar.f74172e = mVar.f74151h;
        oVar.f74171d = mVar.f74150g;
        oVar.f74173f = ((Boolean) mVar.f74152i.getValue()).booleanValue();
    }

    public static final Object t(Function1 function1, bl2.c cVar) {
        t3.r2 r2Var = (t3.r2) cVar.getContext().get(t3.q2.f116171a);
        if (r2Var == null) {
            return bs1.c.K0(cVar.getContext()).d(function1, cVar);
        }
        new m0(function1, null);
        return r2Var.q();
    }
}
