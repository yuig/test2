package ac;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import i2.o0;
import i2.v3;
import i2.y3;

/* loaded from: classes3.dex */
public final class p implements v3 {

    /* renamed from: a, reason: collision with root package name */
    public final ao2.w f1875a = ue.c.a();

    /* renamed from: b, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f1876b;

    /* renamed from: c, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f1877c;

    /* renamed from: d, reason: collision with root package name */
    public final o0 f1878d;

    /* renamed from: e, reason: collision with root package name */
    public final o0 f1879e;

    public p() {
        y3 y3Var = y3.f71400a;
        this.f1876b = bs1.c.u1(null, y3Var);
        this.f1877c = bs1.c.u1(null, y3Var);
        bs1.c.S(new o(this, 2));
        this.f1878d = bs1.c.S(new o(this, 0));
        bs1.c.S(new o(this, 1));
        this.f1879e = bs1.c.S(new o(this, 3));
    }

    @Override // i2.v3
    public final Object getValue() {
        return (com.airbnb.lottie.h) this.f1876b.getValue();
    }
}
