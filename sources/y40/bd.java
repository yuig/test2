package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class bd implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final bd f136935a = new bd();

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.be value = (x40.be) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof x40.de) {
            List list = dd.f136996a;
            x40.de value2 = (x40.de) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value2, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value2.f132247d);
            writer.M0("data");
            pc.c.a(pc.c.b(pc.c.c(cd.f136964a))).b(writer, customScalarAdapters, value2.f132248e);
            return;
        }
        if (value instanceof x40.zd) {
            List list2 = zc.f137694a;
            x40.zd value3 = (x40.zd) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value3, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value3.f133823d);
            writer.M0("error");
            pc.c.c(yc.f137664a).d(writer, customScalarAdapters, value3.f133824e);
            return;
        }
        if (value instanceof x40.ae) {
            List list3 = ad.f136904a;
            x40.ae value4 = (x40.ae) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value4, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value4.f131965d);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
    
        if (r0 == 1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:
    
        r5 = (x40.yd) pc.c.c(y40.yc.f137664a).f(r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r2);
        kotlin.jvm.internal.Intrinsics.f(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return new x40.zd(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0024, code lost:
    
        if (r2.equals("InvalidParameters") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002d, code lost:
    
        if (r2.equals("AccessDenied") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0036, code lost:
    
        if (r2.equals("ClientError") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003f, code lost:
    
        if (r2.equals("BoardNotFound") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (r2.equals("AuthorizationFailed") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0042, code lost:
    
        r3 = y40.zc.f137694a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, "reader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, "customScalarAdapters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x004d, code lost:
    
        r0 = r8.V1(y40.zc.f137694a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0053, code lost:
    
        if (r0 == 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0071, code lost:
    
        r2 = (java.lang.String) pc.c.f99520a.f(r8, r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0096 A[LOOP:2: B:45:0x008e->B:47:0x0096, LOOP_END] */
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
                case 1313208470: goto L7b;
                case 1381369173: goto L39;
                case 1470119133: goto L30;
                case 1733482047: goto L27;
                case 1877804833: goto L1e;
                case 1996696054: goto L15;
                default: goto L13;
            }
        L13:
            goto L83
        L15:
            java.lang.String r3 = "AuthorizationFailed"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L42
            goto L83
        L1e:
            java.lang.String r3 = "InvalidParameters"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L42
            goto L83
        L27:
            java.lang.String r3 = "AccessDenied"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L42
            goto L83
        L30:
            java.lang.String r3 = "ClientError"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L42
            goto L83
        L39:
            java.lang.String r3 = "BoardNotFound"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L42
            goto L83
        L42:
            java.util.List r3 = y40.zc.f137694a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
        L4d:
            java.util.List r0 = y40.zc.f137694a
            int r0 = r8.V1(r0)
            if (r0 == 0) goto L71
            if (r0 == r4) goto L63
            x40.zd r8 = new x40.zd
            kotlin.jvm.internal.Intrinsics.f(r2)
            kotlin.jvm.internal.Intrinsics.f(r5)
            r8.<init>(r2, r5)
            goto Lc9
        L63:
            y40.yc r0 = y40.yc.f137664a
            pc.l0 r0 = pc.c.c(r0)
            java.lang.Object r0 = r0.f(r8, r9)
            r5 = r0
            x40.yd r5 = (x40.yd) r5
            goto L4d
        L71:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r8, r9)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L4d
        L7b:
            java.lang.String r3 = "V3InviteBoardCollaboratorEmail"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto La9
        L83:
            java.util.List r3 = y40.ad.f136904a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
        L8e:
            java.util.List r0 = y40.ad.f136904a
            int r0 = r8.V1(r0)
            if (r0 != 0) goto La0
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r8, r9)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L8e
        La0:
            x40.ae r8 = new x40.ae
            kotlin.jvm.internal.Intrinsics.f(r2)
            r8.<init>(r2)
            goto Lc9
        La9:
            java.util.List r3 = y40.dd.f136996a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
        Lb4:
            java.util.List r0 = y40.dd.f136996a
            int r0 = r8.V1(r0)
            if (r0 == 0) goto Ldd
            if (r0 == r4) goto Lca
            x40.de r8 = new x40.de
            kotlin.jvm.internal.Intrinsics.f(r2)
            kotlin.jvm.internal.Intrinsics.f(r5)
            r8.<init>(r2, r5)
        Lc9:
            return r8
        Lca:
            y40.cd r0 = y40.cd.f136964a
            pc.l0 r0 = pc.c.c(r0)
            pc.k0 r0 = pc.c.b(r0)
            pc.d r0 = pc.c.a(r0)
            java.util.ArrayList r5 = r0.a(r8, r9)
            goto Lb4
        Ldd:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r8, r9)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto Lb4
        */
        throw new UnsupportedOperationException("Method not decompiled: y40.bd.f(tc.f, pc.v):java.lang.Object");
    }
}
