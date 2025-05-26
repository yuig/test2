package k40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final d f78270a = new d();

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        j40.d value = (j40.d) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof j40.e) {
            List list = e.f78271a;
            j40.e value2 = (j40.e) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value2, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value2.f74600d);
            return;
        }
        if (value instanceof j40.b) {
            List list2 = b.f78266a;
            j40.b value3 = (j40.b) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value3, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value3.f74594d);
            writer.M0("error");
            pc.c.c(a.f78263a).d(writer, customScalarAdapters, value3.f74595e);
            return;
        }
        if (value instanceof j40.c) {
            List list3 = c.f78269a;
            j40.c value4 = (j40.c) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value4, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value4.f74596d);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (r1 == 1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0059, code lost:
    
        r0 = (j40.a) pc.c.c(k40.a.f78263a).f(r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r2);
        kotlin.jvm.internal.Intrinsics.f(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return new j40.b(r2, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0021, code lost:
    
        if (r2.equals("InvalidParameters") == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002a, code lost:
    
        if (r2.equals("AccessDenied") == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0033, code lost:
    
        if (r2.equals("ClientError") == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r2.equals("AuthorizationFailed") == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0036, code lost:
    
        r3 = k40.b.f78266a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, "reader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, "customScalarAdapters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "typename");
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0042, code lost:
    
        r1 = r6.V1(k40.b.f78266a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0048, code lost:
    
        if (r1 == 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0066, code lost:
    
        r2 = (java.lang.String) pc.c.f99520a.f(r6, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008b A[LOOP:2: B:37:0x0083->B:39:0x008b, LOOP_END] */
    @Override // pc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(tc.f r6, pc.v r7) {
        /*
            r5 = this;
            java.lang.String r0 = "reader"
            java.lang.String r1 = "customScalarAdapters"
            java.lang.String r2 = ep.b.m(r6, r0, r7, r1, r6)
            int r3 = r2.hashCode()
            java.lang.String r4 = "typename"
            switch(r3) {
                case -684189608: goto L70;
                case 1470119133: goto L2d;
                case 1733482047: goto L24;
                case 1877804833: goto L1b;
                case 1996696054: goto L12;
                default: goto L11;
            }
        L11:
            goto L78
        L12:
            java.lang.String r3 = "AuthorizationFailed"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L36
            goto L78
        L1b:
            java.lang.String r3 = "InvalidParameters"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L36
            goto L78
        L24:
            java.lang.String r3 = "AccessDenied"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L36
            goto L78
        L2d:
            java.lang.String r3 = "ClientError"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L36
            goto L78
        L36:
            java.util.List r3 = k40.b.f78266a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            r0 = 0
        L42:
            java.util.List r1 = k40.b.f78266a
            int r1 = r6.V1(r1)
            if (r1 == 0) goto L66
            r3 = 1
            if (r1 == r3) goto L59
            j40.b r6 = new j40.b
            kotlin.jvm.internal.Intrinsics.f(r2)
            kotlin.jvm.internal.Intrinsics.f(r0)
            r6.<init>(r2, r0)
            goto Lc3
        L59:
            k40.a r0 = k40.a.f78263a
            pc.l0 r0 = pc.c.c(r0)
            java.lang.Object r0 = r0.f(r6, r7)
            j40.a r0 = (j40.a) r0
            goto L42
        L66:
            a10.e r1 = pc.c.f99520a
            java.lang.Object r1 = r1.f(r6, r7)
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            goto L42
        L70:
            java.lang.String r3 = "V3OrientationSignals"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L9e
        L78:
            java.util.List r3 = k40.c.f78269a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
        L83:
            java.util.List r0 = k40.c.f78269a
            int r0 = r6.V1(r0)
            if (r0 != 0) goto L95
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r6, r7)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L83
        L95:
            j40.c r6 = new j40.c
            kotlin.jvm.internal.Intrinsics.f(r2)
            r6.<init>(r2)
            goto Lc3
        L9e:
            java.util.List r3 = k40.e.f78271a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
        La9:
            java.util.List r0 = k40.e.f78271a
            int r0 = r6.V1(r0)
            if (r0 != 0) goto Lbb
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r6, r7)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto La9
        Lbb:
            j40.e r6 = new j40.e
            kotlin.jvm.internal.Intrinsics.f(r2)
            r6.<init>(r2)
        Lc3:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: k40.d.f(tc.f, pc.v):java.lang.Object");
    }
}
