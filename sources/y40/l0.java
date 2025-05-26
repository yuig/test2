package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l0 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final l0 f137235a = new l0();

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.r0 value = (x40.r0) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof x40.n0) {
            List list = h0.f137109a;
            x40.n0 value2 = (x40.n0) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value2, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value2.f132857d);
            return;
        }
        if (value instanceof x40.p0) {
            List list2 = j0.f137173a;
            x40.p0 value3 = (x40.p0) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value3, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value3.f133014d);
            writer.M0("error");
            pc.c.c(i0.f137141a).d(writer, customScalarAdapters, value3.f133015e);
            return;
        }
        if (value instanceof x40.q0) {
            List list3 = k0.f137205a;
            x40.q0 value4 = (x40.q0) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value4, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value4.f133059d);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005f, code lost:
    
        if (r1 == 1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006d, code lost:
    
        r0 = (x40.o0) pc.c.c(y40.i0.f137141a).f(r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r2);
        kotlin.jvm.internal.Intrinsics.f(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return new x40.p0(r2, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0023, code lost:
    
        if (r2.equals("InvalidParameters") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002c, code lost:
    
        if (r2.equals("AccessDenied") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0035, code lost:
    
        if (r2.equals("ClientError") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003e, code lost:
    
        if (r2.equals("BoardNotFound") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0047, code lost:
    
        if (r2.equals("UserNotFound") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r2.equals("AuthorizationFailed") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x004a, code lost:
    
        r3 = y40.j0.f137173a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, "reader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, "customScalarAdapters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "typename");
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0056, code lost:
    
        r1 = r6.V1(y40.j0.f137173a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005c, code lost:
    
        if (r1 == 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x007a, code lost:
    
        r2 = (java.lang.String) pc.c.f99520a.f(r6, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009f A[LOOP:2: B:41:0x0097->B:43:0x009f, LOOP_END] */
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
                case -1225563088: goto L84;
                case 949711226: goto L41;
                case 1381369173: goto L38;
                case 1470119133: goto L2f;
                case 1733482047: goto L26;
                case 1877804833: goto L1d;
                case 1996696054: goto L13;
                default: goto L11;
            }
        L11:
            goto L8c
        L13:
            java.lang.String r3 = "AuthorizationFailed"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L4a
            goto L8c
        L1d:
            java.lang.String r3 = "InvalidParameters"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L4a
            goto L8c
        L26:
            java.lang.String r3 = "AccessDenied"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L4a
            goto L8c
        L2f:
            java.lang.String r3 = "ClientError"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L4a
            goto L8c
        L38:
            java.lang.String r3 = "BoardNotFound"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L4a
            goto L8c
        L41:
            java.lang.String r3 = "UserNotFound"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L4a
            goto L8c
        L4a:
            java.util.List r3 = y40.j0.f137173a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            r0 = 0
        L56:
            java.util.List r1 = y40.j0.f137173a
            int r1 = r6.V1(r1)
            if (r1 == 0) goto L7a
            r3 = 1
            if (r1 == r3) goto L6d
            x40.p0 r6 = new x40.p0
            kotlin.jvm.internal.Intrinsics.f(r2)
            kotlin.jvm.internal.Intrinsics.f(r0)
            r6.<init>(r2, r0)
            goto Ld7
        L6d:
            y40.i0 r0 = y40.i0.f137141a
            pc.l0 r0 = pc.c.c(r0)
            java.lang.Object r0 = r0.f(r6, r7)
            x40.o0 r0 = (x40.o0) r0
            goto L56
        L7a:
            a10.e r1 = pc.c.f99520a
            java.lang.Object r1 = r1.f(r6, r7)
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            goto L56
        L84:
            java.lang.String r3 = "CollaboratorInviteResponse"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto Lb2
        L8c:
            java.util.List r3 = y40.k0.f137205a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
        L97:
            java.util.List r0 = y40.k0.f137205a
            int r0 = r6.V1(r0)
            if (r0 != 0) goto La9
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r6, r7)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L97
        La9:
            x40.q0 r6 = new x40.q0
            kotlin.jvm.internal.Intrinsics.f(r2)
            r6.<init>(r2)
            goto Ld7
        Lb2:
            java.util.List r3 = y40.h0.f137109a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
        Lbd:
            java.util.List r0 = y40.h0.f137109a
            int r0 = r6.V1(r0)
            if (r0 != 0) goto Lcf
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r6, r7)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto Lbd
        Lcf:
            x40.n0 r6 = new x40.n0
            kotlin.jvm.internal.Intrinsics.f(r2)
            r6.<init>(r2)
        Ld7:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: y40.l0.f(tc.f, pc.v):java.lang.Object");
    }
}
