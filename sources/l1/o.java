package l1;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import i2.y3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f81353a = bs1.c.u1(l.f81351a, y3.f71400a);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            return Intrinsics.d((n) ((o) obj).f81353a.getValue(), (n) this.f81353a.getValue());
        }
        return false;
    }

    public final int hashCode() {
        return ((n) this.f81353a.getValue()).hashCode();
    }

    public final String toString() {
        return "ContextMenuState(status=" + ((n) this.f81353a.getValue()) + ')';
    }
}
