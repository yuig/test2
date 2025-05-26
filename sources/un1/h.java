package un1;

import kotlin.jvm.internal.Intrinsics;
import u50.i0;

/* loaded from: classes5.dex */
public final class h extends j {

    /* renamed from: b, reason: collision with root package name */
    public final f f122885b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f122886c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public h(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r0 = "expandedSuffixString"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "string"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            u50.f0 r0 = new u50.f0
            r0.<init>(r3)
            un1.d r3 = un1.d.f122882a
            java.lang.String r1 = "ellipsisMode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r1)
            r2.<init>(r3)
            r2.f122885b = r3
            r2.f122886c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: un1.h.<init>(java.lang.String):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.f122885b, hVar.f122885b) && Intrinsics.d(this.f122886c, hVar.f122886c);
    }

    public final int hashCode() {
        int hashCode = this.f122885b.hashCode() * 31;
        i0 i0Var = this.f122886c;
        return hashCode + (i0Var == null ? 0 : i0Var.hashCode());
    }

    public final String toString() {
        return "AlwaysWhenExpandable(ellipsisMode=" + this.f122885b + ", expandedSuffix=" + this.f122886c + ")";
    }
}
