package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final l f137234a = new l();

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.m value = (x40.m) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof x40.i) {
            List list = h.f137108a;
            x40.i value2 = (x40.i) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value2, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value2.f132514d);
            writer.M0("data");
            pc.c.b(pc.c.c(g.f137073a)).d(writer, customScalarAdapters, value2.f132515e);
            return;
        }
        if (value instanceof x40.k) {
            List list2 = j.f137172a;
            x40.k value3 = (x40.k) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value3, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value3.f132625d);
            writer.M0("error");
            pc.c.c(i.f137139a).d(writer, customScalarAdapters, value3.f132626e);
            return;
        }
        if (value instanceof x40.l) {
            List list3 = k.f137204a;
            x40.l value4 = (x40.l) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value4, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value4.f132684d);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00be, code lost:
    
        if (r0 == 1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00cc, code lost:
    
        r5 = (x40.j) pc.c.c(y40.i.f137139a).f(r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00c0, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r2);
        kotlin.jvm.internal.Intrinsics.f(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00cb, code lost:
    
        return new x40.k(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0024, code lost:
    
        if (r2.equals("InvalidParameters") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0071, code lost:
    
        if (r2.equals("AccessDenied") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007a, code lost:
    
        if (r2.equals("ClientError") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0083, code lost:
    
        if (r2.equals("ContactRequestNotFound") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (r2.equals("AuthorizationFailed") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x00ab, code lost:
    
        r3 = y40.j.f137172a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, "reader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, "customScalarAdapters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x00b6, code lost:
    
        r0 = r8.V1(y40.j.f137172a);
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
                case 43686910: goto L7d;
                case 1470119133: goto L74;
                case 1733482047: goto L6b;
                case 1759335940: goto L27;
                case 1877804833: goto L1e;
                case 1996696054: goto L15;
                default: goto L13;
            }
        L13:
            goto L85
        L15:
            java.lang.String r3 = "AuthorizationFailed"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto Lab
            goto L85
        L1e:
            java.lang.String r3 = "InvalidParameters"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto Lab
            goto L85
        L27:
            java.lang.String r3 = "ConversationResponse"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L30
            goto L85
        L30:
            java.util.List r3 = y40.h.f137108a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
        L3b:
            java.util.List r0 = y40.h.f137108a
            int r0 = r8.V1(r0)
            if (r0 == 0) goto L61
            if (r0 == r4) goto L4f
            x40.i r8 = new x40.i
            kotlin.jvm.internal.Intrinsics.f(r2)
            r8.<init>(r2, r5)
            goto Lcb
        L4f:
            y40.g r0 = y40.g.f137073a
            pc.l0 r0 = pc.c.c(r0)
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r8, r9)
            r5 = r0
            x40.h r5 = (x40.h) r5
            goto L3b
        L61:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r8, r9)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L3b
        L6b:
            java.lang.String r3 = "AccessDenied"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto Lab
            goto L85
        L74:
            java.lang.String r3 = "ClientError"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto Lab
            goto L85
        L7d:
            java.lang.String r3 = "ContactRequestNotFound"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto Lab
        L85:
            java.util.List r3 = y40.k.f137204a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
        L90:
            java.util.List r0 = y40.k.f137204a
            int r0 = r8.V1(r0)
            if (r0 != 0) goto La2
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r8, r9)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L90
        La2:
            x40.l r8 = new x40.l
            kotlin.jvm.internal.Intrinsics.f(r2)
            r8.<init>(r2)
            goto Lcb
        Lab:
            java.util.List r3 = y40.j.f137172a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
        Lb6:
            java.util.List r0 = y40.j.f137172a
            int r0 = r8.V1(r0)
            if (r0 == 0) goto Lda
            if (r0 == r4) goto Lcc
            x40.k r8 = new x40.k
            kotlin.jvm.internal.Intrinsics.f(r2)
            kotlin.jvm.internal.Intrinsics.f(r5)
            r8.<init>(r2, r5)
        Lcb:
            return r8
        Lcc:
            y40.i r0 = y40.i.f137139a
            pc.l0 r0 = pc.c.c(r0)
            java.lang.Object r0 = r0.f(r8, r9)
            r5 = r0
            x40.j r5 = (x40.j) r5
            goto Lb6
        Lda:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r8, r9)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto Lb6
        */
        throw new UnsupportedOperationException("Method not decompiled: y40.l.f(tc.f, pc.v):java.lang.Object");
    }
}
