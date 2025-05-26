package q1;

import androidx.compose.runtime.ParcelableSnapshotMutableIntState;

/* loaded from: classes2.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final ParcelableSnapshotMutableIntState f102035a;

    /* renamed from: b, reason: collision with root package name */
    public final ParcelableSnapshotMutableIntState f102036b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f102037c;

    /* renamed from: d, reason: collision with root package name */
    public Object f102038d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.g0 f102039e;

    public y(int i13, int i14) {
        this.f102035a = tb.f.X(i13);
        this.f102036b = tb.f.X(i14);
        this.f102039e = new androidx.compose.foundation.lazy.layout.g0(i13, 30, 100);
    }

    public final int a() {
        return this.f102035a.h();
    }

    public final int b() {
        return this.f102036b.h();
    }

    public final void c(int i13, int i14) {
        if (i13 >= 0.0f) {
            this.f102035a.i(i13);
            this.f102039e.b(i13);
            this.f102036b.i(i14);
        } else {
            throw new IllegalArgumentException(("Index should be non-negative (" + i13 + ')').toString());
        }
    }
}
