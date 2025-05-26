package k40;

import j40.c0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final z f78302a = new z();

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        j40.b0 value = (j40.b0) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof c0) {
            List list = a0.f78265a;
            c0 value2 = (c0) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value2, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value2.f74597d);
            writer.M0("data");
            pc.c.f99527h.d(writer, customScalarAdapters, value2.f74598e);
            return;
        }
        if (value instanceof j40.z) {
            List list2 = x.f78300a;
            j40.z value3 = (j40.z) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value3, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value3.f74637d);
            writer.M0("error");
            pc.c.c(w.f78298a).d(writer, customScalarAdapters, value3.f74638e);
            return;
        }
        if (value instanceof j40.a0) {
            List list3 = y.f78301a;
            j40.a0 value4 = (j40.a0) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value4, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value4.f74593d);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        if (r0 == 1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005f, code lost:
    
        r5 = (j40.y) pc.c.c(k40.w.f78298a).f(r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r2);
        kotlin.jvm.internal.Intrinsics.f(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return new j40.z(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0025, code lost:
    
        if (r2.equals("InvalidParameters") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        if (r2.equals("AccessDenied") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0039, code lost:
    
        if (r2.equals("ClientError") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (r2.equals("AuthorizationFailed") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003d, code lost:
    
        r3 = k40.x.f78300a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, "reader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, "customScalarAdapters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0048, code lost:
    
        r0 = r8.V1(k40.x.f78300a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004e, code lost:
    
        if (r0 == 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x006d, code lost:
    
        r2 = (java.lang.String) pc.c.f99520a.f(r8, r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c4 A[LOOP:2: B:43:0x00bc->B:45:0x00c4, LOOP_END] */
    @Override // pc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(tc.f r8, pc.v r9) {
        /*
            r7 = this;
            java.lang.String r0 = "reader"
            java.lang.String r1 = "customScalarAdapters"
            java.lang.String r2 = ep.b.m(r8, r0, r9, r1, r8)
            int r3 = r2.hashCode()
            r4 = 1
            r5 = 0
            java.lang.String r6 = "typename"
            switch(r3) {
                case -843368251: goto L77;
                case 1470119133: goto L33;
                case 1733482047: goto L29;
                case 1877804833: goto L1f;
                case 1996696054: goto L15;
                default: goto L13;
            }
        L13:
            goto Lb1
        L15:
            java.lang.String r3 = "AuthorizationFailed"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L3d
            goto Lb1
        L1f:
            java.lang.String r3 = "InvalidParameters"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L3d
            goto Lb1
        L29:
            java.lang.String r3 = "AccessDenied"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L3d
            goto Lb1
        L33:
            java.lang.String r3 = "ClientError"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L3d
            goto Lb1
        L3d:
            java.util.List r3 = k40.x.f78300a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
        L48:
            java.util.List r0 = k40.x.f78300a
            int r0 = r8.V1(r0)
            if (r0 == 0) goto L6d
            if (r0 == r4) goto L5f
            j40.z r8 = new j40.z
            kotlin.jvm.internal.Intrinsics.f(r2)
            kotlin.jvm.internal.Intrinsics.f(r5)
            r8.<init>(r2, r5)
            goto Ld6
        L5f:
            k40.w r0 = k40.w.f78298a
            pc.l0 r0 = pc.c.c(r0)
            java.lang.Object r0 = r0.f(r8, r9)
            r5 = r0
            j40.y r5 = (j40.y) r5
            goto L48
        L6d:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r8, r9)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L48
        L77:
            java.lang.String r3 = "V3OrientationStatus"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto Lb1
            java.util.List r3 = k40.a0.f78265a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
        L8a:
            java.util.List r0 = k40.a0.f78265a
            int r0 = r8.V1(r0)
            if (r0 == 0) goto La7
            if (r0 == r4) goto L9d
            j40.c0 r8 = new j40.c0
            kotlin.jvm.internal.Intrinsics.f(r2)
            r8.<init>(r2, r5)
            goto Ld6
        L9d:
            pc.k0 r0 = pc.c.f99527h
            java.lang.Object r0 = r0.f(r8, r9)
            r5 = r0
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            goto L8a
        La7:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r8, r9)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L8a
        Lb1:
            java.util.List r3 = k40.y.f78301a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
        Lbc:
            java.util.List r0 = k40.y.f78301a
            int r0 = r8.V1(r0)
            if (r0 != 0) goto Lce
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r8, r9)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto Lbc
        Lce:
            j40.a0 r8 = new j40.a0
            kotlin.jvm.internal.Intrinsics.f(r2)
            r8.<init>(r2)
        Ld6:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: k40.z.f(tc.f, pc.v):java.lang.Object");
    }
}
