package f2;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import i2.y3;
import j1.q0;
import k1.v1;
import k1.z1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import m1.b1;
import m1.x0;

/* loaded from: classes2.dex */
public final class e0 implements b1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f60834a;

    /* renamed from: b, reason: collision with root package name */
    public Function0 f60835b;

    /* renamed from: c, reason: collision with root package name */
    public final ql2.h f60836c;

    /* renamed from: d, reason: collision with root package name */
    public final ParcelableSnapshotMutableFloatState f60837d;

    /* renamed from: e, reason: collision with root package name */
    public Function1 f60838e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f60839f;

    /* renamed from: g, reason: collision with root package name */
    public final ParcelableSnapshotMutableIntState f60840g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f60841h;

    /* renamed from: i, reason: collision with root package name */
    public final ParcelableSnapshotMutableFloatState f60842i;

    /* renamed from: j, reason: collision with root package name */
    public final ParcelableSnapshotMutableFloatState f60843j;

    /* renamed from: k, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f60844k;

    /* renamed from: l, reason: collision with root package name */
    public final q0 f60845l;

    /* renamed from: m, reason: collision with root package name */
    public final ParcelableSnapshotMutableFloatState f60846m;

    /* renamed from: n, reason: collision with root package name */
    public final ParcelableSnapshotMutableFloatState f60847n;

    /* renamed from: o, reason: collision with root package name */
    public final c2.s f60848o;

    /* renamed from: p, reason: collision with root package name */
    public final z1 f60849p;

    public e0(float f13, int i13, Function0 function0, ql2.h hVar) {
        float[] fArr;
        this.f60834a = i13;
        this.f60835b = function0;
        this.f60836c = hVar;
        this.f60837d = b7.c.J(f13);
        if (i13 == 0) {
            fArr = new float[0];
        } else {
            int i14 = i13 + 2;
            float[] fArr2 = new float[i14];
            for (int i15 = 0; i15 < i14; i15++) {
                fArr2[i15] = i15 / (i13 + 1);
            }
            fArr = fArr2;
        }
        this.f60839f = fArr;
        this.f60840g = tb.f.X(0);
        this.f60842i = b7.c.J(0.0f);
        this.f60843j = b7.c.J(0.0f);
        this.f60844k = bs1.c.u1(Boolean.FALSE, y3.f71400a);
        this.f60845l = new q0(this, 20);
        ql2.h hVar2 = this.f60836c;
        float floatValue = ((Number) hVar2.c()).floatValue();
        float floatValue2 = ((Number) hVar2.d()).floatValue() - floatValue;
        this.f60846m = b7.c.J(tb.f.U(0.0f, 0.0f, ql2.s.f(floatValue2 == 0.0f ? 0.0f : (f13 - floatValue) / floatValue2, 0.0f, 1.0f)));
        this.f60847n = b7.c.J(0.0f);
        this.f60848o = new c2.s(this, 1);
        this.f60849p = new z1();
    }

    @Override // m1.b1
    public final Object a(v1 v1Var, x0 x0Var, bl2.c cVar) {
        Object O = dl2.b.O(new d0(this, v1Var, x0Var, null), cVar);
        return O == cl2.a.COROUTINE_SUSPENDED ? O : Unit.f80348a;
    }

    public final void b(float f13) {
        float h10 = this.f60840g.h();
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = this.f60843j;
        float f14 = 2;
        float max = Math.max(h10 - (parcelableSnapshotMutableFloatState.h() / f14), 0.0f);
        float min = Math.min(parcelableSnapshotMutableFloatState.h() / f14, max);
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState2 = this.f60846m;
        float h13 = parcelableSnapshotMutableFloatState2.h() + f13;
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState3 = this.f60847n;
        parcelableSnapshotMutableFloatState2.i(parcelableSnapshotMutableFloatState3.h() + h13);
        parcelableSnapshotMutableFloatState3.i(0.0f);
        float d2 = c0.d(this.f60839f, parcelableSnapshotMutableFloatState2.h(), min, max);
        ql2.h hVar = this.f60836c;
        float f15 = max - min;
        float U = tb.f.U(((Number) hVar.c()).floatValue(), ((Number) hVar.d()).floatValue(), ql2.s.f(f15 == 0.0f ? 0.0f : (d2 - min) / f15, 0.0f, 1.0f));
        if (U == this.f60837d.h()) {
            return;
        }
        Function1 function1 = this.f60838e;
        if (function1 != null) {
            function1.invoke(Float.valueOf(U));
        } else {
            d(U);
        }
    }

    public final float c() {
        ql2.h hVar = this.f60836c;
        float floatValue = ((Number) hVar.c()).floatValue();
        float floatValue2 = ((Number) hVar.d()).floatValue() - floatValue;
        return ql2.s.f(floatValue2 == 0.0f ? 0.0f : (ql2.s.f(this.f60837d.h(), ((Number) hVar.c()).floatValue(), ((Number) hVar.d()).floatValue()) - floatValue) / floatValue2, 0.0f, 1.0f);
    }

    public final void d(float f13) {
        ql2.h hVar = this.f60836c;
        this.f60837d.i(c0.d(this.f60839f, ql2.s.f(f13, ((Number) hVar.c()).floatValue(), ((Number) hVar.d()).floatValue()), ((Number) hVar.c()).floatValue(), ((Number) hVar.d()).floatValue()));
    }
}
