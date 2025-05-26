package q30;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p30.t;
import pc.v;

/* loaded from: classes2.dex */
public final class r implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final r f102301a = new r();

    @Override // pc.a
    public final void d(tc.g writer, v customScalarAdapters, Object obj) {
        t value = (t) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof p30.r) {
            List list = p.f102299a;
            p30.r value2 = (p30.r) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value2, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value2.f98755d);
            writer.M0("data");
            pc.c.b(pc.c.c(o.f102297a)).d(writer, customScalarAdapters, value2.f98756e);
            return;
        }
        if (value instanceof p30.p) {
            List list2 = n.f102296a;
            p30.p value3 = (p30.p) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value3, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value3.f98749d);
            writer.M0("error");
            pc.c.c(m.f102294a).d(writer, customScalarAdapters, value3.f98750e);
            return;
        }
        if (value instanceof p30.s) {
            List list3 = q.f102300a;
            p30.s value4 = (p30.s) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value4, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value4.f98757d);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00bf, code lost:
    
        if (r0 == 1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00cd, code lost:
    
        r5 = (p30.o) pc.c.c(q30.m.f102294a).f(r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00c1, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r2);
        kotlin.jvm.internal.Intrinsics.f(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00cc, code lost:
    
        return new p30.p(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0025, code lost:
    
        if (r2.equals("InvalidParameters") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0072, code lost:
    
        if (r2.equals("AccessDenied") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007b, code lost:
    
        if (r2.equals("ClientError") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0084, code lost:
    
        if (r2.equals("InviteCodeNotFound") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (r2.equals("AuthorizationFailed") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x00ac, code lost:
    
        r3 = q30.n.f102296a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, "reader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, "customScalarAdapters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x00b7, code lost:
    
        r0 = r8.V1(q30.n.f102296a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x00bd, code lost:
    
        if (r0 == 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00db, code lost:
    
        r2 = (java.lang.String) pc.c.f99520a.f(r8, r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0099 A[LOOP:2: B:45:0x0091->B:47:0x0099, LOOP_END] */
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
                case -607479995: goto L7e;
                case 1470119133: goto L75;
                case 1733482047: goto L6c;
                case 1793843991: goto L28;
                case 1877804833: goto L1f;
                case 1996696054: goto L16;
                default: goto L14;
            }
        L14:
            goto L86
        L16:
            java.lang.String r3 = "AuthorizationFailed"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto Lac
            goto L86
        L1f:
            java.lang.String r3 = "InvalidParameters"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto Lac
            goto L86
        L28:
            java.lang.String r3 = "InviteCodeResponse"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L31
            goto L86
        L31:
            java.util.List r3 = q30.p.f102299a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
        L3c:
            java.util.List r0 = q30.p.f102299a
            int r0 = r8.V1(r0)
            if (r0 == 0) goto L62
            if (r0 == r4) goto L50
            p30.r r8 = new p30.r
            kotlin.jvm.internal.Intrinsics.f(r2)
            r8.<init>(r2, r5)
            goto Lcc
        L50:
            q30.o r0 = q30.o.f102297a
            pc.l0 r0 = pc.c.c(r0)
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r8, r9)
            r5 = r0
            p30.q r5 = (p30.q) r5
            goto L3c
        L62:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r8, r9)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L3c
        L6c:
            java.lang.String r3 = "AccessDenied"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto Lac
            goto L86
        L75:
            java.lang.String r3 = "ClientError"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto Lac
            goto L86
        L7e:
            java.lang.String r3 = "InviteCodeNotFound"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto Lac
        L86:
            java.util.List r3 = q30.q.f102300a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
        L91:
            java.util.List r0 = q30.q.f102300a
            int r0 = r8.V1(r0)
            if (r0 != 0) goto La3
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r8, r9)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L91
        La3:
            p30.s r8 = new p30.s
            kotlin.jvm.internal.Intrinsics.f(r2)
            r8.<init>(r2)
            goto Lcc
        Lac:
            java.util.List r3 = q30.n.f102296a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
        Lb7:
            java.util.List r0 = q30.n.f102296a
            int r0 = r8.V1(r0)
            if (r0 == 0) goto Ldb
            if (r0 == r4) goto Lcd
            p30.p r8 = new p30.p
            kotlin.jvm.internal.Intrinsics.f(r2)
            kotlin.jvm.internal.Intrinsics.f(r5)
            r8.<init>(r2, r5)
        Lcc:
            return r8
        Lcd:
            q30.m r0 = q30.m.f102294a
            pc.l0 r0 = pc.c.c(r0)
            java.lang.Object r0 = r0.f(r8, r9)
            r5 = r0
            p30.o r5 = (p30.o) r5
            goto Lb7
        Ldb:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r8, r9)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto Lb7
        */
        throw new UnsupportedOperationException("Method not decompiled: q30.r.f(tc.f, pc.v):java.lang.Object");
    }
}
