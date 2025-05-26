package w30;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import pc.v;

/* loaded from: classes3.dex */
public final class d implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final d f127899a = new d();

    @Override // pc.a
    public final void d(tc.g writer, v customScalarAdapters, Object obj) {
        v30.d value = (v30.d) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof v30.f) {
            List list = f.f127902a;
            v30.f value2 = (v30.f) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value2, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value2.f123928d);
            writer.M0("data");
            pc.c.b(pc.c.c(e.f127900a)).d(writer, customScalarAdapters, value2.f123929e);
            return;
        }
        if (value instanceof v30.b) {
            List list2 = b.f127897a;
            v30.b value3 = (v30.b) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value3, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value3.f123920d);
            writer.M0("error");
            pc.c.c(a.f127895a).d(writer, customScalarAdapters, value3.f123921e);
            return;
        }
        if (value instanceof v30.c) {
            List list3 = c.f127898a;
            v30.c value4 = (v30.c) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value4, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value4.f123922d);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005f, code lost:
    
        if (r0 == 1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006d, code lost:
    
        r5 = (v30.a) pc.c.c(w30.a.f127895a).f(r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r2);
        kotlin.jvm.internal.Intrinsics.f(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return new v30.b(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0025, code lost:
    
        if (r2.equals("InvalidParameters") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002e, code lost:
    
        if (r2.equals("AccessDenied") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0037, code lost:
    
        if (r2.equals("ClientError") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0040, code lost:
    
        if (r2.equals("UserFollowFailure") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0049, code lost:
    
        if (r2.equals("UserNotFound") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (r2.equals("AuthorizationFailed") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x004c, code lost:
    
        r3 = w30.b.f127897a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, "reader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, "customScalarAdapters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0057, code lost:
    
        r0 = r8.V1(w30.b.f127897a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005d, code lost:
    
        if (r0 == 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x007b, code lost:
    
        r2 = (java.lang.String) pc.c.f99520a.f(r8, r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a0 A[LOOP:2: B:47:0x0098->B:49:0x00a0, LOOP_END] */
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
                case -21706790: goto L85;
                case 949711226: goto L43;
                case 1214282350: goto L3a;
                case 1470119133: goto L31;
                case 1733482047: goto L28;
                case 1877804833: goto L1f;
                case 1996696054: goto L15;
                default: goto L13;
            }
        L13:
            goto L8d
        L15:
            java.lang.String r3 = "AuthorizationFailed"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L4c
            goto L8d
        L1f:
            java.lang.String r3 = "InvalidParameters"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L4c
            goto L8d
        L28:
            java.lang.String r3 = "AccessDenied"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L4c
            goto L8d
        L31:
            java.lang.String r3 = "ClientError"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L4c
            goto L8d
        L3a:
            java.lang.String r3 = "UserFollowFailure"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L4c
            goto L8d
        L43:
            java.lang.String r3 = "UserNotFound"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L4c
            goto L8d
        L4c:
            java.util.List r3 = w30.b.f127897a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
        L57:
            java.util.List r0 = w30.b.f127897a
            int r0 = r8.V1(r0)
            if (r0 == 0) goto L7b
            if (r0 == r4) goto L6d
            v30.b r8 = new v30.b
            kotlin.jvm.internal.Intrinsics.f(r2)
            kotlin.jvm.internal.Intrinsics.f(r5)
            r8.<init>(r2, r5)
            goto Ld0
        L6d:
            w30.a r0 = w30.a.f127895a
            pc.l0 r0 = pc.c.c(r0)
            java.lang.Object r0 = r0.f(r8, r9)
            r5 = r0
            v30.a r5 = (v30.a) r5
            goto L57
        L7b:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r8, r9)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L57
        L85:
            java.lang.String r3 = "V3FollowUserMethod"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto Lb3
        L8d:
            java.util.List r3 = w30.c.f127898a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
        L98:
            java.util.List r0 = w30.c.f127898a
            int r0 = r8.V1(r0)
            if (r0 != 0) goto Laa
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r8, r9)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L98
        Laa:
            v30.c r8 = new v30.c
            kotlin.jvm.internal.Intrinsics.f(r2)
            r8.<init>(r2)
            goto Ld0
        Lb3:
            java.util.List r3 = w30.f.f127902a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
        Lbe:
            java.util.List r0 = w30.f.f127902a
            int r0 = r8.V1(r0)
            if (r0 == 0) goto Le3
            if (r0 == r4) goto Ld1
            v30.f r8 = new v30.f
            kotlin.jvm.internal.Intrinsics.f(r2)
            r8.<init>(r2, r5)
        Ld0:
            return r8
        Ld1:
            w30.e r0 = w30.e.f127900a
            pc.l0 r0 = pc.c.c(r0)
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r8, r9)
            r5 = r0
            v30.e r5 = (v30.e) r5
            goto Lbe
        Le3:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r8, r9)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto Lbe
        */
        throw new UnsupportedOperationException("Method not decompiled: w30.d.f(tc.f, pc.v):java.lang.Object");
    }
}
