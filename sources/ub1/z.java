package ub1;

import com.pinterest.api.model.wy0;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;

/* loaded from: classes5.dex */
public final class z implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final wy0.a f121748a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f121749b;

    public z(wy0.a autoTaggingStatus, boolean z13) {
        Intrinsics.checkNotNullParameter(autoTaggingStatus, "autoTaggingStatus");
        this.f121748a = autoTaggingStatus;
        this.f121749b = z13;
    }

    public static z b(z zVar, wy0.a autoTaggingStatus, boolean z13, int i13) {
        if ((i13 & 1) != 0) {
            autoTaggingStatus = zVar.f121748a;
        }
        if ((i13 & 2) != 0) {
            z13 = zVar.f121749b;
        }
        zVar.getClass();
        Intrinsics.checkNotNullParameter(autoTaggingStatus, "autoTaggingStatus");
        return new z(autoTaggingStatus, z13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f121748a == zVar.f121748a && this.f121749b == zVar.f121749b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f121749b) + (this.f121748a.hashCode() * 31);
    }

    public final String toString() {
        return "ContentPermissionsVMState(autoTaggingStatus=" + this.f121748a + ", shouldDeletePreviousAutoTags=" + this.f121749b + ")";
    }
}
