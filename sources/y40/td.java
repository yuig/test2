package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class td implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final td f137513a = new td();

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.we value = (x40.we) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof x40.ue) {
            List list = rd.f137450a;
            x40.ue value2 = (x40.ue) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value2, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value2.f133473d);
            writer.M0("error");
            pc.c.c(qd.f137419a).d(writer, customScalarAdapters, value2.f133474e);
            return;
        }
        if (value instanceof x40.ve) {
            List list2 = sd.f137479a;
            x40.ve value3 = (x40.ve) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value3, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value3.f133555d);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        if (r1 == 1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
    
        r0 = (x40.te) pc.c.c(y40.qd.f137419a).f(r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r2);
        kotlin.jvm.internal.Intrinsics.f(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return new x40.ue(r2, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0021, code lost:
    
        if (r2.equals("InvalidParameters") == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002a, code lost:
    
        if (r2.equals("AccessDenied") == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0033, code lost:
    
        if (r2.equals("ClientError") != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r2.equals("AuthorizationFailed") == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0035, code lost:
    
        r3 = y40.rd.f137450a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, "reader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, "customScalarAdapters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "typename");
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0041, code lost:
    
        r1 = r6.V1(y40.rd.f137450a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0047, code lost:
    
        if (r1 == 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0065, code lost:
    
        r2 = (java.lang.String) pc.c.f99520a.f(r6, r7);
     */
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
                case 1470119133: goto L2d;
                case 1733482047: goto L24;
                case 1877804833: goto L1b;
                case 1996696054: goto L12;
                default: goto L11;
            }
        L11:
            goto L6f
        L12:
            java.lang.String r3 = "AuthorizationFailed"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L35
            goto L6f
        L1b:
            java.lang.String r3 = "InvalidParameters"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L35
            goto L6f
        L24:
            java.lang.String r3 = "AccessDenied"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L35
            goto L6f
        L2d:
            java.lang.String r3 = "ClientError"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L6f
        L35:
            java.util.List r3 = y40.rd.f137450a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            r0 = 0
        L41:
            java.util.List r1 = y40.rd.f137450a
            int r1 = r6.V1(r1)
            if (r1 == 0) goto L65
            r3 = 1
            if (r1 == r3) goto L58
            x40.ue r6 = new x40.ue
            kotlin.jvm.internal.Intrinsics.f(r2)
            kotlin.jvm.internal.Intrinsics.f(r0)
            r6.<init>(r2, r0)
            goto L94
        L58:
            y40.qd r0 = y40.qd.f137419a
            pc.l0 r0 = pc.c.c(r0)
            java.lang.Object r0 = r0.f(r6, r7)
            x40.te r0 = (x40.te) r0
            goto L41
        L65:
            a10.e r1 = pc.c.f99520a
            java.lang.Object r1 = r1.f(r6, r7)
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            goto L41
        L6f:
            java.util.List r3 = y40.sd.f137479a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
        L7a:
            java.util.List r0 = y40.sd.f137479a
            int r0 = r6.V1(r0)
            if (r0 != 0) goto L8c
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r6, r7)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L7a
        L8c:
            x40.ve r6 = new x40.ve
            kotlin.jvm.internal.Intrinsics.f(r2)
            r6.<init>(r2)
        L94:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: y40.td.f(tc.f, pc.v):java.lang.Object");
    }
}
