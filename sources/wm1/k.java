package wm1;

/* loaded from: classes5.dex */
public final class k extends n {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f130307c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f130308d;

    /* renamed from: e, reason: collision with root package name */
    public final fm1.c f130309e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public k(boolean r2, boolean r3, int r4) {
        /*
            r1 = this;
            r0 = r4 & 1
            if (r0 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 2
            if (r4 == 0) goto La
            r3 = 1
        La:
            fm1.c r4 = fm1.c.VISIBLE
            java.lang.String r0 = "visibility"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            wm1.o r0 = wm1.o.SWITCH
            r1.<init>(r0, r3)
            r1.f130307c = r2
            r1.f130308d = r3
            r1.f130309e = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wm1.k.<init>(boolean, boolean, int):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f130307c == kVar.f130307c && this.f130308d == kVar.f130308d && this.f130309e == kVar.f130309e;
    }

    public final int hashCode() {
        return this.f130309e.hashCode() + ep.b.e(this.f130308d, Boolean.hashCode(this.f130307c) * 31, 31);
    }

    public final String toString() {
        return "SwitchDisplayState(checked=" + this.f130307c + ", enabled=" + this.f130308d + ", visibility=" + this.f130309e + ")";
    }
}
