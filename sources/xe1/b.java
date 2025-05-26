package xe1;

import c0.s0;

/* loaded from: classes5.dex */
public final class b extends s0 {

    /* renamed from: b, reason: collision with root package name */
    public final h f134675b;

    /* renamed from: c, reason: collision with root package name */
    public final rm1.q f134676c;

    /* renamed from: d, reason: collision with root package name */
    public final rm1.c f134677d;

    /* renamed from: e, reason: collision with root package name */
    public final rm1.i f134678e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(rm1.c r5) {
        /*
            r4 = this;
            xe1.h r0 = xe1.h.ICON
            rm1.q r1 = rm1.q.ARROW_FORWARD
            rm1.i r2 = rm1.i.XS
            java.lang.String r3 = "viewType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            java.lang.String r3 = "actionIcon"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            java.lang.String r3 = "color"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r3)
            java.lang.String r3 = "size"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            r4.<init>(r0)
            r4.f134675b = r0
            r4.f134676c = r1
            r4.f134677d = r5
            r4.f134678e = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xe1.b.<init>(rm1.c):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f134675b == bVar.f134675b && this.f134676c == bVar.f134676c && this.f134677d == bVar.f134677d && this.f134678e == bVar.f134678e;
    }

    public final int hashCode() {
        return this.f134678e.hashCode() + ((this.f134677d.hashCode() + ((this.f134676c.hashCode() + (this.f134675b.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ActionIconViewModel(viewType=" + this.f134675b + ", actionIcon=" + this.f134676c + ", color=" + this.f134677d + ", size=" + this.f134678e + ")";
    }
}
