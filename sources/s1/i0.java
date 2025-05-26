package s1;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;

/* loaded from: classes2.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final o0 f110448a;

    /* renamed from: b, reason: collision with root package name */
    public final ParcelableSnapshotMutableIntState f110449b;

    /* renamed from: c, reason: collision with root package name */
    public final ParcelableSnapshotMutableFloatState f110450c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f110451d;

    /* renamed from: e, reason: collision with root package name */
    public Object f110452e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.g0 f110453f;

    public i0(int i13, float f13, o0 o0Var) {
        this.f110448a = o0Var;
        this.f110449b = tb.f.X(i13);
        this.f110450c = b7.c.J(f13);
        this.f110453f = new androidx.compose.foundation.lazy.layout.g0(i13, 30, 100);
    }

    public final float a() {
        return this.f110450c.h();
    }
}
