package r72;

import a.cb;

/* loaded from: classes4.dex */
public final class i1 {

    /* renamed from: c, reason: collision with root package name */
    public static final i1 f106497c = new i1(null, null);

    /* renamed from: a, reason: collision with root package name */
    public final String f106498a;

    /* renamed from: b, reason: collision with root package name */
    public final a f106499b;

    public i1(String str, a aVar) {
        this.f106498a = str;
        this.f106499b = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0012, code lost:
    
        if (r1 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r5.f106499b, r6.f106499b) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x001e, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r3, r1) == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof r72.i1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            r72.i1 r6 = (r72.i1) r6
            java.lang.String r1 = r6.f106498a
            java.lang.String r3 = r5.f106498a
            if (r3 != 0) goto L15
            if (r1 != 0) goto L20
            goto L21
        L15:
            if (r1 != 0) goto L18
            goto L20
        L18:
            int r4 = r72.g2.f106487b
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r3, r1)
            if (r1 != 0) goto L21
        L20:
            return r2
        L21:
            r72.a r1 = r5.f106499b
            r72.a r6 = r6.f106499b
            boolean r6 = kotlin.jvm.internal.Intrinsics.d(r1, r6)
            if (r6 != 0) goto L2c
            return r2
        L2c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r72.i1.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode;
        String str = this.f106498a;
        if (str == null) {
            hashCode = 0;
        } else {
            int i13 = g2.f106487b;
            hashCode = str.hashCode();
        }
        int i14 = hashCode * 31;
        a aVar = this.f106499b;
        return i14 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f106498a;
        if (str == null) {
            str = null;
        }
        StringBuilder o13 = cb.o("Mask(svgMask=", kh2.r.l1(str), ", bitmapMask=");
        o13.append(this.f106499b);
        o13.append(")");
        return o13.toString();
    }
}
