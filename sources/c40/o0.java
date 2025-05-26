package c40;

import b40.r0;
import b40.s0;
import b40.t0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o0 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final o0 f25740a = new o0();

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        s0 value = (s0) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof t0) {
            List list = p0.f25743a;
            t0 value2 = (t0) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value2, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value2.f21748d);
            return;
        }
        if (value instanceof b40.q0) {
            List list2 = m0.f25736a;
            b40.q0 value3 = (b40.q0) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value3, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value3.f21740d);
            writer.M0("error");
            pc.c.c(l0.f25732a).d(writer, customScalarAdapters, value3.f21741e);
            return;
        }
        if (value instanceof r0) {
            List list3 = n0.f25738a;
            r0 value4 = (r0) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value4, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value4.f21743d);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        if (r1 == 1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005d, code lost:
    
        r0 = (b40.p0) pc.c.c(c40.l0.f25732a).f(r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r2);
        kotlin.jvm.internal.Intrinsics.f(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return new b40.q0(r2, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0023, code lost:
    
        if (r2.equals("InvalidParameters") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002d, code lost:
    
        if (r2.equals("AccessDenied") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0037, code lost:
    
        if (r2.equals("ClientError") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r2.equals("AuthorizationFailed") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003a, code lost:
    
        r3 = c40.m0.f25736a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, "reader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, "customScalarAdapters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "typename");
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0046, code lost:
    
        r1 = r6.V1(c40.m0.f25736a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004c, code lost:
    
        if (r1 == 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x006a, code lost:
    
        r2 = (java.lang.String) pc.c.f99520a.f(r6, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b5 A[LOOP:2: B:37:0x00ad->B:39:0x00b5, LOOP_END] */
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
                case -886609223: goto L74;
                case 1470119133: goto L31;
                case 1733482047: goto L27;
                case 1877804833: goto L1d;
                case 1996696054: goto L13;
                default: goto L11;
            }
        L11:
            goto La2
        L13:
            java.lang.String r3 = "AuthorizationFailed"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L3a
            goto La2
        L1d:
            java.lang.String r3 = "InvalidParameters"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L3a
            goto La2
        L27:
            java.lang.String r3 = "AccessDenied"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L3a
            goto La2
        L31:
            java.lang.String r3 = "ClientError"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L3a
            goto La2
        L3a:
            java.util.List r3 = c40.m0.f25736a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            r0 = 0
        L46:
            java.util.List r1 = c40.m0.f25736a
            int r1 = r6.V1(r1)
            if (r1 == 0) goto L6a
            r3 = 1
            if (r1 == r3) goto L5d
            b40.q0 r6 = new b40.q0
            kotlin.jvm.internal.Intrinsics.f(r2)
            kotlin.jvm.internal.Intrinsics.f(r0)
            r6.<init>(r2, r0)
            goto Lc7
        L5d:
            c40.l0 r0 = c40.l0.f25732a
            pc.l0 r0 = pc.c.c(r0)
            java.lang.Object r0 = r0.f(r6, r7)
            b40.p0 r0 = (b40.p0) r0
            goto L46
        L6a:
            a10.e r1 = pc.c.f99520a
            java.lang.Object r1 = r1.f(r6, r7)
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            goto L46
        L74:
            java.lang.String r3 = "V3UpdateObjectSubscriptionsForNotificationsGraphql"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto La2
            java.util.List r3 = c40.p0.f25743a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
        L87:
            java.util.List r0 = c40.p0.f25743a
            int r0 = r6.V1(r0)
            if (r0 != 0) goto L99
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r6, r7)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L87
        L99:
            b40.t0 r6 = new b40.t0
            kotlin.jvm.internal.Intrinsics.f(r2)
            r6.<init>(r2)
            goto Lc7
        La2:
            java.util.List r3 = c40.n0.f25738a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
        Lad:
            java.util.List r0 = c40.n0.f25738a
            int r0 = r6.V1(r0)
            if (r0 != 0) goto Lbf
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r6, r7)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto Lad
        Lbf:
            b40.r0 r6 = new b40.r0
            kotlin.jvm.internal.Intrinsics.f(r2)
            r6.<init>(r2)
        Lc7:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: c40.o0.f(tc.f, pc.v):java.lang.Object");
    }
}
