package im2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class z {

    /* renamed from: c, reason: collision with root package name */
    public static final z f72793c;

    /* renamed from: a, reason: collision with root package name */
    public final b0 f72794a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f72795b;

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    static {
        /*
            im2.z r0 = new im2.z
            ym2.c r1 = im2.w.f72784a
            xk2.j r1 = xk2.j.f135215f
            java.lang.String r2 = "configuredKotlinVersion"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            im2.x r2 = im2.w.f72787d
            xk2.j r3 = r2.f72790b
            if (r3 == 0) goto L22
            java.lang.String r4 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r4)
            int r3 = r3.f135219d
            int r1 = r1.f135219d
            int r3 = r3 - r1
            if (r3 > 0) goto L22
            im2.j0 r1 = r2.a()
            goto L24
        L22:
            im2.j0 r1 = r2.f72789a
        L24:
            java.lang.String r2 = "globalReportLevel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            im2.j0 r2 = im2.j0.WARN
            if (r1 != r2) goto L2f
            r2 = 0
            goto L30
        L2f:
            r2 = r1
        L30:
            im2.b0 r3 = new im2.b0
            r3.<init>(r1, r2)
            im2.y r1 = im2.y.f72792a
            r0.<init>(r3)
            im2.z.f72793c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: im2.z.<clinit>():void");
    }

    public z(b0 jsr305) {
        y getReportLevelForAnnotation = y.f72792a;
        Intrinsics.checkNotNullParameter(jsr305, "jsr305");
        Intrinsics.checkNotNullParameter(getReportLevelForAnnotation, "getReportLevelForAnnotation");
        this.f72794a = jsr305;
        this.f72795b = jsr305.f72690d || getReportLevelForAnnotation.invoke(w.f72784a) == j0.IGNORE;
    }

    public final String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.f72794a + ", getReportLevelForAnnotation=" + y.f72792a + ')';
    }
}
