package j1;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableLongState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import i2.f3;
import i2.v3;
import i2.y3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b2 implements v3 {

    /* renamed from: a, reason: collision with root package name */
    public final p2 f73995a;

    /* renamed from: b, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f73996b;

    /* renamed from: c, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f73997c;

    /* renamed from: d, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f73998d;

    /* renamed from: e, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f73999e;

    /* renamed from: f, reason: collision with root package name */
    public final ParcelableSnapshotMutableFloatState f74000f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f74001g;

    /* renamed from: h, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f74002h;

    /* renamed from: i, reason: collision with root package name */
    public t f74003i;

    /* renamed from: j, reason: collision with root package name */
    public final ParcelableSnapshotMutableLongState f74004j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f74005k;

    /* renamed from: l, reason: collision with root package name */
    public final o1 f74006l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g2 f74007m;

    public b2(g2 g2Var, Object obj, t tVar, p2 p2Var) {
        this.f74007m = g2Var;
        this.f73995a = p2Var;
        y3 y3Var = y3.f71400a;
        ParcelableSnapshotMutableState u13 = bs1.c.u1(obj, y3Var);
        this.f73996b = u13;
        Object obj2 = null;
        ParcelableSnapshotMutableState u14 = bs1.c.u1(e.q(0.0f, 0.0f, null, 7), y3Var);
        this.f73997c = u14;
        this.f73998d = bs1.c.u1(new w1((h0) u14.getValue(), p2Var, obj, u13.getValue(), tVar), y3Var);
        this.f73999e = bs1.c.u1(Boolean.TRUE, y3Var);
        this.f74000f = b7.c.J(-1.0f);
        this.f74002h = bs1.c.u1(obj, y3Var);
        this.f74003i = tVar;
        long d2 = b().d();
        int i13 = i2.c.f71081b;
        this.f74004j = new ParcelableSnapshotMutableLongState(d2);
        Float f13 = (Float) e3.f74054a.get(p2Var);
        if (f13 != null) {
            float floatValue = f13.floatValue();
            t tVar2 = (t) p2Var.f74197a.invoke(obj);
            int b13 = tVar2.b();
            for (int i14 = 0; i14 < b13; i14++) {
                tVar2.e(i14, floatValue);
            }
            obj2 = this.f73995a.f74198b.invoke(tVar2);
        }
        this.f74006l = e.q(0.0f, 0.0f, obj2, 3);
    }

    public final w1 b() {
        return (w1) this.f73998d.getValue();
    }

    public final long c() {
        ParcelableSnapshotMutableLongState parcelableSnapshotMutableLongState = this.f74004j;
        return ((f3) s2.p.t(parcelableSnapshotMutableLongState.f71120b, parcelableSnapshotMutableLongState)).f71117c;
    }

    public final void d() {
        this.f74000f.i(-2.0f);
    }

    public final void e(long j13) {
        if (this.f74000f.h() == -1.0f) {
            this.f74005k = true;
            boolean d2 = Intrinsics.d(b().f74292c, b().f74293d);
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.f74002h;
            if (d2) {
                parcelableSnapshotMutableState.setValue(b().f74292c);
            } else {
                parcelableSnapshotMutableState.setValue(b().f(j13));
                this.f74003i = b().b(j13);
            }
        }
    }

    public final void f(Object obj, boolean z13) {
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.f73996b;
        boolean d2 = Intrinsics.d(null, parcelableSnapshotMutableState.getValue());
        ParcelableSnapshotMutableLongState parcelableSnapshotMutableLongState = this.f74004j;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = this.f73998d;
        h0 h0Var = this.f74006l;
        if (d2) {
            parcelableSnapshotMutableState2.setValue(new w1(h0Var, this.f73995a, obj, obj, this.f74003i.c()));
            this.f74001g = true;
            parcelableSnapshotMutableLongState.h(b().d());
            return;
        }
        ParcelableSnapshotMutableState parcelableSnapshotMutableState3 = this.f73997c;
        if (!z13 || this.f74005k) {
            h0Var = (h0) parcelableSnapshotMutableState3.getValue();
        } else if (((h0) parcelableSnapshotMutableState3.getValue()) instanceof o1) {
            h0Var = (h0) parcelableSnapshotMutableState3.getValue();
        }
        g2 g2Var = this.f74007m;
        long j13 = 0;
        parcelableSnapshotMutableState2.setValue(new w1(g2Var.e() <= 0 ? h0Var : new p1(h0Var, g2Var.e()), this.f73995a, obj, parcelableSnapshotMutableState.getValue(), this.f74003i));
        parcelableSnapshotMutableLongState.h(b().d());
        this.f74001g = false;
        Boolean bool = Boolean.TRUE;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState4 = g2Var.f74082h;
        parcelableSnapshotMutableState4.setValue(bool);
        if (g2Var.g()) {
            s2.t tVar = g2Var.f74083i;
            int size = tVar.size();
            for (int i13 = 0; i13 < size; i13++) {
                b2 b2Var = (b2) tVar.get(i13);
                j13 = Math.max(j13, b2Var.c());
                b2Var.e(g2Var.f74086l);
            }
            parcelableSnapshotMutableState4.setValue(Boolean.FALSE);
        }
    }

    public final void g(Object obj, Object obj2, h0 h0Var) {
        this.f73996b.setValue(obj2);
        this.f73997c.setValue(h0Var);
        if (Intrinsics.d(b().f74293d, obj) && Intrinsics.d(b().f74292c, obj2)) {
            return;
        }
        f(obj, false);
    }

    @Override // i2.v3
    public final Object getValue() {
        return this.f74002h.getValue();
    }

    public final void h(Object obj, h0 h0Var) {
        if (this.f74001g && Intrinsics.d(obj, null)) {
            return;
        }
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.f73996b;
        boolean d2 = Intrinsics.d(parcelableSnapshotMutableState.getValue(), obj);
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = this.f74000f;
        if (d2 && parcelableSnapshotMutableFloatState.h() == -1.0f) {
            return;
        }
        parcelableSnapshotMutableState.setValue(obj);
        this.f73997c.setValue(h0Var);
        float h10 = parcelableSnapshotMutableFloatState.h();
        ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = this.f74002h;
        Object value = h10 == -3.0f ? obj : parcelableSnapshotMutableState2.getValue();
        ParcelableSnapshotMutableState parcelableSnapshotMutableState3 = this.f73999e;
        f(value, !((Boolean) parcelableSnapshotMutableState3.getValue()).booleanValue());
        parcelableSnapshotMutableState3.setValue(Boolean.valueOf(parcelableSnapshotMutableFloatState.h() == -3.0f));
        if (parcelableSnapshotMutableFloatState.h() >= 0.0f) {
            parcelableSnapshotMutableState2.setValue(b().f((long) (parcelableSnapshotMutableFloatState.h() * b().d())));
        } else if (parcelableSnapshotMutableFloatState.h() == -3.0f) {
            parcelableSnapshotMutableState2.setValue(obj);
        }
        this.f74001g = false;
        parcelableSnapshotMutableFloatState.i(-1.0f);
    }

    public final String toString() {
        return "current value: " + this.f74002h.getValue() + ", target: " + this.f73996b.getValue() + ", spec: " + ((h0) this.f73997c.getValue());
    }
}
