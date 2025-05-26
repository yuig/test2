package i2;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v0 implements z3 {

    /* renamed from: a, reason: collision with root package name */
    public final q1 f71317a;

    public v0(ParcelableSnapshotMutableState parcelableSnapshotMutableState) {
        this.f71317a = parcelableSnapshotMutableState;
    }

    @Override // i2.z3
    public final Object a(z1 z1Var) {
        return this.f71317a.getValue();
    }

    public final q1 b() {
        return this.f71317a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v0) && Intrinsics.d(this.f71317a, ((v0) obj).f71317a);
    }

    public final int hashCode() {
        return this.f71317a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.f71317a + ')';
    }
}
