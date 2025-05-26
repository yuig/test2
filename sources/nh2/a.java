package nh2;

import java.util.Map;

/* loaded from: classes4.dex */
public final class a extends gb2.d {

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f90555b;

    /* renamed from: c, reason: collision with root package name */
    public final c f90556c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f90557d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(byte[] r4, nh2.d r5) {
        /*
            r3 = this;
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "counter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "randomUUID().toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r3.<init>(r0)
            r3.f90555b = r4
            int r4 = r4.length
            long r1 = (long) r4
            java.lang.Object r4 = r5.invoke()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L2d
            nh2.c r4 = nh2.c.OVER_MAX_ATTACHMENTS
            goto L38
        L2d:
            r4 = 1048576(0x100000, double:5.180654E-318)
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 <= 0) goto L37
            nh2.c r4 = nh2.c.ATTACHMENT_TOO_LARGE
            goto L38
        L37:
            r4 = 0
        L38:
            r3.f90556c = r4
            java.util.LinkedHashMap r4 = gb2.d.a(r0, r4)
            xf2.d0 r5 = sh2.h.f112970s
            java.lang.String r0 = java.lang.String.valueOf(r1)
            kotlin.Pair r1 = new kotlin.Pair
            r1.<init>(r5, r0)
            java.util.Map r4 = kotlin.collections.z0.k(r4, r1)
            r3.f90557d = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nh2.a.<init>(byte[], nh2.d):void");
    }

    @Override // gb2.d
    public final Map b() {
        return this.f90557d;
    }

    @Override // gb2.d
    public final c c() {
        return this.f90556c;
    }
}
