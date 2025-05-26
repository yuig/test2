package r1;

import androidx.compose.runtime.ParcelableSnapshotMutableIntState;

/* loaded from: classes2.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final ParcelableSnapshotMutableIntState f105888a;

    /* renamed from: b, reason: collision with root package name */
    public final ParcelableSnapshotMutableIntState f105889b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f105890c;

    /* renamed from: d, reason: collision with root package name */
    public Object f105891d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.g0 f105892e;

    public f0(int i13, int i14) {
        this.f105888a = tb.f.X(i13);
        this.f105889b = tb.f.X(i14);
        this.f105892e = new androidx.compose.foundation.lazy.layout.g0(i13, 90, 200);
    }

    public final int a() {
        return this.f105888a.h();
    }

    public final void b(int i13, int i14) {
        if (i13 >= 0.0f) {
            this.f105888a.i(i13);
            this.f105892e.b(i13);
            this.f105889b.i(i14);
        } else {
            throw new IllegalArgumentException(("Index should be non-negative (" + i13 + ')').toString());
        }
    }
}
