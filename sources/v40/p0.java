package v40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import u40.h1;

/* loaded from: classes5.dex */
public final class p0 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final p0 f124081a = new p0();

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        u40.t0 value = (u40.t0) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof h1) {
            List list = d1.f124043a;
            h1 value2 = (h1) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value2, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value2.f120333d);
            writer.M0("data");
            pc.c.b(pc.c.c(c1.f124039a)).d(writer, customScalarAdapters, value2.f120334e);
            return;
        }
        if (value instanceof u40.r0) {
            List list2 = n0.f124075a;
            u40.r0 value3 = (u40.r0) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value3, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value3.f120421d);
            writer.M0("error");
            pc.c.c(m0.f124071a).d(writer, customScalarAdapters, value3.f120422e);
            return;
        }
        if (value instanceof u40.s0) {
            List list3 = o0.f124078a;
            u40.s0 value4 = (u40.s0) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value4, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value4.f120424d);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00be, code lost:
    
        if (r0 == 1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00cc, code lost:
    
        r5 = (u40.q0) pc.c.c(v40.m0.f124071a).f(r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00c0, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r2);
        kotlin.jvm.internal.Intrinsics.f(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00cb, code lost:
    
        return new u40.r0(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0024, code lost:
    
        if (r2.equals("InvalidParameters") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002d, code lost:
    
        if (r2.equals("AccessDenied") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007a, code lost:
    
        if (r2.equals("ClientError") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0083, code lost:
    
        if (r2.equals("UserNotFound") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (r2.equals("AuthorizationFailed") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x00ab, code lost:
    
        r3 = v40.n0.f124075a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, "reader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, "customScalarAdapters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x00b6, code lost:
    
        r0 = r8.V1(v40.n0.f124075a);
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
                case 949711226: goto L7d;
                case 1470119133: goto L74;
                case 1663107014: goto L30;
                case 1733482047: goto L27;
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
            java.lang.String r3 = "AccessDenied"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto Lab
            goto L85
        L30:
            java.lang.String r3 = "V3GetUserHandler"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L39
            goto L85
        L39:
            java.util.List r3 = v40.d1.f124043a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
        L44:
            java.util.List r0 = v40.d1.f124043a
            int r0 = r8.V1(r0)
            if (r0 == 0) goto L6a
            if (r0 == r4) goto L58
            u40.h1 r8 = new u40.h1
            kotlin.jvm.internal.Intrinsics.f(r2)
            r8.<init>(r2, r5)
            goto Lcb
        L58:
            v40.c1 r0 = v40.c1.f124039a
            pc.l0 r0 = pc.c.c(r0)
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r8, r9)
            r5 = r0
            u40.g1 r5 = (u40.g1) r5
            goto L44
        L6a:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r8, r9)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L44
        L74:
            java.lang.String r3 = "ClientError"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto Lab
            goto L85
        L7d:
            java.lang.String r3 = "UserNotFound"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto Lab
        L85:
            java.util.List r3 = v40.o0.f124078a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
        L90:
            java.util.List r0 = v40.o0.f124078a
            int r0 = r8.V1(r0)
            if (r0 != 0) goto La2
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r8, r9)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L90
        La2:
            u40.s0 r8 = new u40.s0
            kotlin.jvm.internal.Intrinsics.f(r2)
            r8.<init>(r2)
            goto Lcb
        Lab:
            java.util.List r3 = v40.n0.f124075a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
        Lb6:
            java.util.List r0 = v40.n0.f124075a
            int r0 = r8.V1(r0)
            if (r0 == 0) goto Lda
            if (r0 == r4) goto Lcc
            u40.r0 r8 = new u40.r0
            kotlin.jvm.internal.Intrinsics.f(r2)
            kotlin.jvm.internal.Intrinsics.f(r5)
            r8.<init>(r2, r5)
        Lcb:
            return r8
        Lcc:
            v40.m0 r0 = v40.m0.f124071a
            pc.l0 r0 = pc.c.c(r0)
            java.lang.Object r0 = r0.f(r8, r9)
            r5 = r0
            u40.q0 r5 = (u40.q0) r5
            goto Lb6
        Lda:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r8, r9)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto Lb6
        */
        throw new UnsupportedOperationException("Method not decompiled: v40.p0.f(tc.f, pc.v):java.lang.Object");
    }
}
