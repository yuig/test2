package n30;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import pc.v;

/* loaded from: classes2.dex */
public final class d implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final d f89150a = new d();

    @Override // pc.a
    public final void d(tc.g writer, v customScalarAdapters, Object obj) {
        m30.d value = (m30.d) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof m30.g) {
            List list = g.f89155a;
            m30.g value2 = (m30.g) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value2, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value2.f85752d);
            writer.M0("data");
            pc.c.b(pc.c.c(f.f89153a)).d(writer, customScalarAdapters, value2.f85753e);
            return;
        }
        if (value instanceof m30.b) {
            List list2 = b.f89148a;
            m30.b value3 = (m30.b) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value3, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value3.f85745d);
            writer.M0("error");
            pc.c.c(a.f89146a).d(writer, customScalarAdapters, value3.f85746e);
            return;
        }
        if (value instanceof m30.c) {
            List list3 = c.f89149a;
            m30.c value4 = (m30.c) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value4, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value4.f85747d);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00be, code lost:
    
        if (r0 == 1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00cc, code lost:
    
        r5 = (m30.a) pc.c.c(n30.a.f89146a).f(r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00c0, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r2);
        kotlin.jvm.internal.Intrinsics.f(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00cb, code lost:
    
        return new m30.b(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0025, code lost:
    
        if (r2.equals("InvalidParameters") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002e, code lost:
    
        if (r2.equals("AccessDenied") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0037, code lost:
    
        if (r2.equals("ClientError") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0083, code lost:
    
        if (r2.equals("PinNotFound") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (r2.equals("AuthorizationFailed") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x00ab, code lost:
    
        r3 = n30.b.f89148a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, "reader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, "customScalarAdapters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x00b6, code lost:
    
        r0 = r8.V1(n30.b.f89148a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x00bc, code lost:
    
        if (r0 == 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00da, code lost:
    
        r2 = (java.lang.String) pc.c.f99520a.f(r8, r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0098 A[LOOP:2: B:45:0x0090->B:47:0x0098, LOOP_END] */
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
                case -814800636: goto L7d;
                case -294637732: goto L3a;
                case 1470119133: goto L31;
                case 1733482047: goto L28;
                case 1877804833: goto L1f;
                case 1996696054: goto L16;
                default: goto L14;
            }
        L14:
            goto L85
        L16:
            java.lang.String r3 = "AuthorizationFailed"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto Lab
            goto L85
        L1f:
            java.lang.String r3 = "InvalidParameters"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto Lab
            goto L85
        L28:
            java.lang.String r3 = "AccessDenied"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto Lab
            goto L85
        L31:
            java.lang.String r3 = "ClientError"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto Lab
            goto L85
        L3a:
            java.lang.String r3 = "V3GetPin"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L43
            goto L85
        L43:
            java.util.List r3 = n30.g.f89155a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
        L4e:
            java.util.List r0 = n30.g.f89155a
            int r0 = r8.V1(r0)
            if (r0 == 0) goto L73
            if (r0 == r4) goto L61
            m30.g r8 = new m30.g
            kotlin.jvm.internal.Intrinsics.f(r2)
            r8.<init>(r2, r5)
            goto Lcb
        L61:
            n30.f r0 = n30.f.f89153a
            pc.l0 r0 = pc.c.c(r0)
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r8, r9)
            r5 = r0
            m30.f r5 = (m30.f) r5
            goto L4e
        L73:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r8, r9)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L4e
        L7d:
            java.lang.String r3 = "PinNotFound"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto Lab
        L85:
            java.util.List r3 = n30.c.f89149a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
        L90:
            java.util.List r0 = n30.c.f89149a
            int r0 = r8.V1(r0)
            if (r0 != 0) goto La2
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r8, r9)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L90
        La2:
            m30.c r8 = new m30.c
            kotlin.jvm.internal.Intrinsics.f(r2)
            r8.<init>(r2)
            goto Lcb
        Lab:
            java.util.List r3 = n30.b.f89148a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
        Lb6:
            java.util.List r0 = n30.b.f89148a
            int r0 = r8.V1(r0)
            if (r0 == 0) goto Lda
            if (r0 == r4) goto Lcc
            m30.b r8 = new m30.b
            kotlin.jvm.internal.Intrinsics.f(r2)
            kotlin.jvm.internal.Intrinsics.f(r5)
            r8.<init>(r2, r5)
        Lcb:
            return r8
        Lcc:
            n30.a r0 = n30.a.f89146a
            pc.l0 r0 = pc.c.c(r0)
            java.lang.Object r0 = r0.f(r8, r9)
            r5 = r0
            m30.a r5 = (m30.a) r5
            goto Lb6
        Lda:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r8, r9)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto Lb6
        */
        throw new UnsupportedOperationException("Method not decompiled: n30.d.f(tc.f, pc.v):java.lang.Object");
    }
}
