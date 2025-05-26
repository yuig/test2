package ac;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import i2.o0;
import i2.y3;
import k1.z1;

/* loaded from: classes3.dex */
public final class j implements b {

    /* renamed from: a, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f1821a;

    /* renamed from: b, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f1822b;

    /* renamed from: c, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f1823c;

    /* renamed from: d, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f1824d;

    /* renamed from: e, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f1825e;

    /* renamed from: f, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f1826f;

    /* renamed from: g, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f1827g;

    /* renamed from: h, reason: collision with root package name */
    public final o0 f1828h;

    /* renamed from: i, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f1829i;

    /* renamed from: j, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f1830j;

    /* renamed from: k, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f1831k;

    /* renamed from: l, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f1832l;

    /* renamed from: m, reason: collision with root package name */
    public final o0 f1833m;

    /* renamed from: n, reason: collision with root package name */
    public final z1 f1834n;

    public j() {
        Boolean bool = Boolean.FALSE;
        y3 y3Var = y3.f71400a;
        this.f1821a = bs1.c.u1(bool, y3Var);
        this.f1822b = bs1.c.u1(1, y3Var);
        this.f1823c = bs1.c.u1(1, y3Var);
        this.f1824d = bs1.c.u1(bool, y3Var);
        this.f1825e = bs1.c.u1(null, y3Var);
        this.f1826f = bs1.c.u1(Float.valueOf(1.0f), y3Var);
        this.f1827g = bs1.c.u1(bool, y3Var);
        this.f1828h = bs1.c.S(new h(this, 1));
        this.f1829i = bs1.c.u1(null, y3Var);
        Float valueOf = Float.valueOf(0.0f);
        this.f1830j = bs1.c.u1(valueOf, y3Var);
        this.f1831k = bs1.c.u1(valueOf, y3Var);
        this.f1832l = bs1.c.u1(Long.MIN_VALUE, y3Var);
        this.f1833m = bs1.c.S(new h(this, 0));
        bs1.c.S(new h(this, 2));
        this.f1834n = new z1();
    }

    public static final boolean b(j jVar, int i13, long j13) {
        com.airbnb.lottie.h hVar = (com.airbnb.lottie.h) jVar.f1829i.getValue();
        if (hVar == null) {
            return true;
        }
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = jVar.f1832l;
        long longValue = ((Number) parcelableSnapshotMutableState.getValue()).longValue() == Long.MIN_VALUE ? 0L : j13 - ((Number) parcelableSnapshotMutableState.getValue()).longValue();
        parcelableSnapshotMutableState.setValue(Long.valueOf(j13));
        ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = jVar.f1825e;
        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(parcelableSnapshotMutableState2.getValue());
        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(parcelableSnapshotMutableState2.getValue());
        float b13 = (longValue / 1000000) / hVar.b();
        o0 o0Var = jVar.f1828h;
        float floatValue = ((Number) o0Var.getValue()).floatValue() * b13;
        float floatValue2 = ((Number) o0Var.getValue()).floatValue();
        ParcelableSnapshotMutableState parcelableSnapshotMutableState3 = jVar.f1830j;
        float floatValue3 = floatValue2 < 0.0f ? 0.0f - (((Number) parcelableSnapshotMutableState3.getValue()).floatValue() + floatValue) : (((Number) parcelableSnapshotMutableState3.getValue()).floatValue() + floatValue) - 1.0f;
        if (floatValue3 < 0.0f) {
            jVar.g(ql2.s.f(((Number) parcelableSnapshotMutableState3.getValue()).floatValue(), 0.0f, 1.0f) + floatValue);
            return true;
        }
        int i14 = (int) (floatValue3 / 1.0f);
        int i15 = i14 + 1;
        if (jVar.e() + i15 > i13) {
            jVar.g(jVar.d());
            jVar.f(i13);
            return false;
        }
        jVar.f(jVar.e() + i15);
        float f13 = floatValue3 - (i14 * 1.0f);
        jVar.g(((Number) o0Var.getValue()).floatValue() < 0.0f ? 1.0f - f13 : 0.0f + f13);
        return true;
    }

    public static final void c(j jVar, boolean z13) {
        jVar.f1821a.setValue(Boolean.valueOf(z13));
    }

    public final float d() {
        return ((Number) this.f1833m.getValue()).floatValue();
    }

    public final int e() {
        return ((Number) this.f1822b.getValue()).intValue();
    }

    public final void f(int i13) {
        this.f1822b.setValue(Integer.valueOf(i13));
    }

    public final void g(float f13) {
        com.airbnb.lottie.h hVar;
        this.f1830j.setValue(Float.valueOf(f13));
        if (((Boolean) this.f1827g.getValue()).booleanValue() && (hVar = (com.airbnb.lottie.h) this.f1829i.getValue()) != null) {
            f13 -= f13 % (1 / hVar.f28409n);
        }
        this.f1831k.setValue(Float.valueOf(f13));
    }

    @Override // i2.v3
    public final Object getValue() {
        return Float.valueOf(((Number) this.f1831k.getValue()).floatValue());
    }
}
