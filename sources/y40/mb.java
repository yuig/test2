package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class mb implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final mb f137288a = new mb();

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.ic value = (x40.ic) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof x40.zc) {
            List list = cc.f136963a;
            x40.zc value2 = (x40.zc) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value2, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value2.f133821d);
            writer.M0("data");
            pc.c.b(pc.c.c(nb.f137322a)).d(writer, customScalarAdapters, value2.f133822e);
            return;
        }
        if (value instanceof x40.gc) {
            List list2 = kb.f137223a;
            x40.gc value3 = (x40.gc) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value3, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value3.f132448d);
            writer.M0("error");
            pc.c.c(jb.f137192a).d(writer, customScalarAdapters, value3.f132449e);
            return;
        }
        if (value instanceof x40.hc) {
            List list3 = lb.f137253a;
            x40.hc value4 = (x40.hc) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value4, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value4.f132500d);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        if (r0 == 1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
    
        r5 = (x40.fc) pc.c.c(y40.jb.f137192a).f(r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r2);
        kotlin.jvm.internal.Intrinsics.f(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return new x40.gc(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0023, code lost:
    
        if (r2.equals("InvalidParameters") == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002c, code lost:
    
        if (r2.equals("AccessDenied") == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0035, code lost:
    
        if (r2.equals("ClientError") == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (r2.equals("AuthorizationFailed") == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0038, code lost:
    
        r3 = y40.kb.f137223a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, "reader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, "customScalarAdapters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0043, code lost:
    
        r0 = r8.V1(y40.kb.f137223a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0049, code lost:
    
        if (r0 == 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0067, code lost:
    
        r2 = (java.lang.String) pc.c.f99520a.f(r8, r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008c A[LOOP:2: B:43:0x0084->B:45:0x008c, LOOP_END] */
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
                case -717870750: goto L71;
                case 1470119133: goto L2f;
                case 1733482047: goto L26;
                case 1877804833: goto L1d;
                case 1996696054: goto L14;
                default: goto L13;
            }
        L13:
            goto L79
        L14:
            java.lang.String r3 = "AuthorizationFailed"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L38
            goto L79
        L1d:
            java.lang.String r3 = "InvalidParameters"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L38
            goto L79
        L26:
            java.lang.String r3 = "AccessDenied"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L38
            goto L79
        L2f:
            java.lang.String r3 = "ClientError"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L38
            goto L79
        L38:
            java.util.List r3 = y40.kb.f137223a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
        L43:
            java.util.List r0 = y40.kb.f137223a
            int r0 = r8.V1(r0)
            if (r0 == 0) goto L67
            if (r0 == r4) goto L59
            x40.gc r8 = new x40.gc
            kotlin.jvm.internal.Intrinsics.f(r2)
            kotlin.jvm.internal.Intrinsics.f(r5)
            r8.<init>(r2, r5)
            goto Lbc
        L59:
            y40.jb r0 = y40.jb.f137192a
            pc.l0 r0 = pc.c.c(r0)
            java.lang.Object r0 = r0.f(r8, r9)
            r5 = r0
            x40.fc r5 = (x40.fc) r5
            goto L43
        L67:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r8, r9)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L43
        L71:
            java.lang.String r3 = "V3GetUserContactRequestsByUser"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L9f
        L79:
            java.util.List r3 = y40.lb.f137253a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
        L84:
            java.util.List r0 = y40.lb.f137253a
            int r0 = r8.V1(r0)
            if (r0 != 0) goto L96
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r8, r9)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L84
        L96:
            x40.hc r8 = new x40.hc
            kotlin.jvm.internal.Intrinsics.f(r2)
            r8.<init>(r2)
            goto Lbc
        L9f:
            java.util.List r3 = y40.cc.f136963a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
        Laa:
            java.util.List r0 = y40.cc.f136963a
            int r0 = r8.V1(r0)
            if (r0 == 0) goto Lcf
            if (r0 == r4) goto Lbd
            x40.zc r8 = new x40.zc
            kotlin.jvm.internal.Intrinsics.f(r2)
            r8.<init>(r2, r5)
        Lbc:
            return r8
        Lbd:
            y40.nb r0 = y40.nb.f137322a
            pc.l0 r0 = pc.c.c(r0)
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r8, r9)
            r5 = r0
            x40.jc r5 = (x40.jc) r5
            goto Laa
        Lcf:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r8, r9)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto Laa
        */
        throw new UnsupportedOperationException("Method not decompiled: y40.mb.f(tc.f, pc.v):java.lang.Object");
    }
}
