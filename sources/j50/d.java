package j50;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import pc.v;

/* loaded from: classes5.dex */
public final class d implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final d f74687a = new d();

    @Override // pc.a
    public final void d(tc.g writer, v customScalarAdapters, Object obj) {
        i50.d value = (i50.d) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof i50.f) {
            List list = f.f74690a;
            i50.f value2 = (i50.f) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value2, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value2.f71545d);
            writer.M0("data");
            pc.c.b(pc.c.c(e.f74688a)).d(writer, customScalarAdapters, value2.f71546e);
            return;
        }
        if (value instanceof i50.b) {
            List list2 = b.f74685a;
            i50.b value3 = (i50.b) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value3, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value3.f71539d);
            writer.M0("error");
            pc.c.c(a.f74683a).d(writer, customScalarAdapters, value3.f71540e);
            return;
        }
        if (value instanceof i50.c) {
            List list3 = c.f74686a;
            i50.c value4 = (i50.c) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value4, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value4.f71541d);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00bd, code lost:
    
        if (r0 == 1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00cb, code lost:
    
        r5 = (i50.a) pc.c.c(j50.a.f74683a).f(r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00bf, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r2);
        kotlin.jvm.internal.Intrinsics.f(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ca, code lost:
    
        return new i50.b(r2, r5);
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
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0082, code lost:
    
        if (r2.equals("PinNotFound") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (r2.equals("AuthorizationFailed") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x00aa, code lost:
    
        r3 = j50.b.f74685a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, "reader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, "customScalarAdapters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x00b5, code lost:
    
        r0 = r8.V1(j50.b.f74685a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x00bb, code lost:
    
        if (r0 == 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00d9, code lost:
    
        r2 = (java.lang.String) pc.c.f99520a.f(r8, r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0097 A[LOOP:2: B:45:0x008f->B:47:0x0097, LOOP_END] */
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
                case -814800636: goto L7c;
                case 1208920345: goto L39;
                case 1470119133: goto L30;
                case 1733482047: goto L27;
                case 1877804833: goto L1e;
                case 1996696054: goto L15;
                default: goto L13;
            }
        L13:
            goto L84
        L15:
            java.lang.String r3 = "AuthorizationFailed"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto Laa
            goto L84
        L1e:
            java.lang.String r3 = "InvalidParameters"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto Laa
            goto L84
        L27:
            java.lang.String r3 = "AccessDenied"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto Laa
            goto L84
        L30:
            java.lang.String r3 = "ClientError"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto Laa
            goto L84
        L39:
            java.lang.String r3 = "V3DownloadIdeaPin"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L42
            goto L84
        L42:
            java.util.List r3 = j50.f.f74690a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
        L4d:
            java.util.List r0 = j50.f.f74690a
            int r0 = r8.V1(r0)
            if (r0 == 0) goto L72
            if (r0 == r4) goto L60
            i50.f r8 = new i50.f
            kotlin.jvm.internal.Intrinsics.f(r2)
            r8.<init>(r2, r5)
            goto Lca
        L60:
            j50.e r0 = j50.e.f74688a
            pc.l0 r0 = pc.c.c(r0)
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r8, r9)
            r5 = r0
            i50.e r5 = (i50.e) r5
            goto L4d
        L72:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r8, r9)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L4d
        L7c:
            java.lang.String r3 = "PinNotFound"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto Laa
        L84:
            java.util.List r3 = j50.c.f74686a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
        L8f:
            java.util.List r0 = j50.c.f74686a
            int r0 = r8.V1(r0)
            if (r0 != 0) goto La1
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r8, r9)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L8f
        La1:
            i50.c r8 = new i50.c
            kotlin.jvm.internal.Intrinsics.f(r2)
            r8.<init>(r2)
            goto Lca
        Laa:
            java.util.List r3 = j50.b.f74685a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
        Lb5:
            java.util.List r0 = j50.b.f74685a
            int r0 = r8.V1(r0)
            if (r0 == 0) goto Ld9
            if (r0 == r4) goto Lcb
            i50.b r8 = new i50.b
            kotlin.jvm.internal.Intrinsics.f(r2)
            kotlin.jvm.internal.Intrinsics.f(r5)
            r8.<init>(r2, r5)
        Lca:
            return r8
        Lcb:
            j50.a r0 = j50.a.f74683a
            pc.l0 r0 = pc.c.c(r0)
            java.lang.Object r0 = r0.f(r8, r9)
            r5 = r0
            i50.a r5 = (i50.a) r5
            goto Lb5
        Ld9:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r8, r9)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto Lb5
        */
        throw new UnsupportedOperationException("Method not decompiled: j50.d.f(tc.f, pc.v):java.lang.Object");
    }
}
