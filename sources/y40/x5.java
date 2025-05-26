package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x5 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final x5 f137621a = new x5();

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.n6 value = (x40.n6) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof x40.l6) {
            List list = v5.f137561a;
            x40.l6 value2 = (x40.l6) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value2, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value2.f132703d);
            writer.M0("error");
            pc.c.c(u5.f137530a).d(writer, customScalarAdapters, value2.f132704e);
            return;
        }
        if (value instanceof x40.m6) {
            List list2 = w5.f137591a;
            x40.m6 value3 = (x40.m6) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value3, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value3.f132809d);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0079, code lost:
    
        if (r1 == 1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0087, code lost:
    
        r0 = (x40.k6) pc.c.c(y40.u5.f137530a).f(r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007b, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r2);
        kotlin.jvm.internal.Intrinsics.f(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0086, code lost:
    
        return new x40.l6(r2, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0021, code lost:
    
        if (r2.equals("InvalidParameters") == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002a, code lost:
    
        if (r2.equals("AccessDenied") == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0033, code lost:
    
        if (r2.equals("ClientError") != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003c, code lost:
    
        if (r2.equals("ContactRequestNotFound") == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r2.equals("AuthorizationFailed") == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0064, code lost:
    
        r3 = y40.v5.f137561a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, "reader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, "customScalarAdapters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "typename");
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0070, code lost:
    
        r1 = r6.V1(y40.v5.f137561a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0076, code lost:
    
        if (r1 == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0094, code lost:
    
        r2 = (java.lang.String) pc.c.f99520a.f(r6, r7);
     */
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
                case 43686910: goto L36;
                case 1470119133: goto L2d;
                case 1733482047: goto L24;
                case 1877804833: goto L1b;
                case 1996696054: goto L12;
                default: goto L11;
            }
        L11:
            goto L3e
        L12:
            java.lang.String r3 = "AuthorizationFailed"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L64
            goto L3e
        L1b:
            java.lang.String r3 = "InvalidParameters"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L64
            goto L3e
        L24:
            java.lang.String r3 = "AccessDenied"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L64
            goto L3e
        L2d:
            java.lang.String r3 = "ClientError"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L3e
            goto L64
        L36:
            java.lang.String r3 = "ContactRequestNotFound"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L64
        L3e:
            java.util.List r3 = y40.w5.f137591a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
        L49:
            java.util.List r0 = y40.w5.f137591a
            int r0 = r6.V1(r0)
            if (r0 != 0) goto L5b
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r6, r7)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L49
        L5b:
            x40.m6 r6 = new x40.m6
            kotlin.jvm.internal.Intrinsics.f(r2)
            r6.<init>(r2)
            goto L86
        L64:
            java.util.List r3 = y40.v5.f137561a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            r0 = 0
        L70:
            java.util.List r1 = y40.v5.f137561a
            int r1 = r6.V1(r1)
            if (r1 == 0) goto L94
            r3 = 1
            if (r1 == r3) goto L87
            x40.l6 r6 = new x40.l6
            kotlin.jvm.internal.Intrinsics.f(r2)
            kotlin.jvm.internal.Intrinsics.f(r0)
            r6.<init>(r2, r0)
        L86:
            return r6
        L87:
            y40.u5 r0 = y40.u5.f137530a
            pc.l0 r0 = pc.c.c(r0)
            java.lang.Object r0 = r0.f(r6, r7)
            x40.k6 r0 = (x40.k6) r0
            goto L70
        L94:
            a10.e r1 = pc.c.f99520a
            java.lang.Object r1 = r1.f(r6, r7)
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            goto L70
        */
        throw new UnsupportedOperationException("Method not decompiled: y40.x5.f(tc.f, pc.v):java.lang.Object");
    }
}
