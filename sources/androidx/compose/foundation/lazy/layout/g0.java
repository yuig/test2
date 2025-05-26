package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import i2.v3;
import i2.y3;
import kotlin.ranges.IntRange;

/* loaded from: classes2.dex */
public final class g0 implements v3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f17240a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17241b;

    /* renamed from: c, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f17242c;

    /* renamed from: d, reason: collision with root package name */
    public int f17243d;

    public g0(int i13, int i14, int i15) {
        this.f17240a = i14;
        this.f17241b = i15;
        int i16 = (i13 / i14) * i14;
        this.f17242c = bs1.c.u1(ql2.s.q(Math.max(i16 - i15, 0), i16 + i14 + i15), y3.f71400a);
        this.f17243d = i13;
    }

    public final void b(int i13) {
        if (i13 != this.f17243d) {
            this.f17243d = i13;
            int i14 = this.f17240a;
            int i15 = (i13 / i14) * i14;
            int i16 = this.f17241b;
            this.f17242c.setValue(ql2.s.q(Math.max(i15 - i16, 0), i15 + i14 + i16));
        }
    }

    @Override // i2.v3
    public final Object getValue() {
        return (IntRange) this.f17242c.getValue();
    }
}
