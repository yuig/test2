package k62;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f78434a;

    /* renamed from: b, reason: collision with root package name */
    public final List f78435b;

    public f(String displayName, List fontVariants) {
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(fontVariants, "fontVariants");
        this.f78434a = displayName;
        this.f78435b = fontVariants;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f78434a, fVar.f78434a) && Intrinsics.d(this.f78435b, fVar.f78435b);
    }

    public final int hashCode() {
        return this.f78435b.hashCode() + (this.f78434a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FontListing(displayName=");
        sb3.append(this.f78434a);
        sb3.append(", fontVariants=");
        return a.c.j(sb3, this.f78435b, ")");
    }
}
