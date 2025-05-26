package k30;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import pc.v;

/* loaded from: classes.dex */
public final class d implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final d f78229a = new d();

    @Override // pc.a
    public final void d(tc.g writer, v customScalarAdapters, Object obj) {
        j30.d value = (j30.d) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!(value instanceof j30.f)) {
            if (value instanceof j30.b) {
                List list = b.f78227a;
                b.b(writer, customScalarAdapters, (j30.b) value);
                return;
            } else {
                if (value instanceof j30.c) {
                    List list2 = c.f78228a;
                    c.b(writer, customScalarAdapters, (j30.c) value);
                    return;
                }
                return;
            }
        }
        List list3 = f.f78232a;
        j30.f value2 = (j30.f) value;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value2, "value");
        writer.M0("__typename");
        pc.c.f99520a.d(writer, customScalarAdapters, value2.f74550d);
        writer.M0("data");
        pc.c.b(pc.c.c(e.f78230a)).d(writer, customScalarAdapters, value2.f74551e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        if (r2.equals("AccessDenied") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0079, code lost:
    
        if (r2.equals("ClientError") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
    
        if (r2.equals("UserNotFound") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r2.equals("AuthorizationFailed") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x008d, code lost:
    
        return k30.b.a(r5, r6, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        if (r2.equals("InvalidParameters") == false) goto L30;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // pc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(tc.f r5, pc.v r6) {
        /*
            r4 = this;
            java.lang.String r0 = "reader"
            java.lang.String r1 = "customScalarAdapters"
            java.lang.String r2 = ep.b.m(r5, r0, r6, r1, r5)
            int r3 = r2.hashCode()
            switch(r3) {
                case 949711226: goto L7c;
                case 1470119133: goto L73;
                case 1663107014: goto L2d;
                case 1733482047: goto L24;
                case 1877804833: goto L1b;
                case 1996696054: goto L11;
                default: goto Lf;
            }
        Lf:
            goto L84
        L11:
            java.lang.String r0 = "AuthorizationFailed"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L89
            goto L84
        L1b:
            java.lang.String r0 = "InvalidParameters"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L89
            goto L84
        L24:
            java.lang.String r0 = "AccessDenied"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L89
            goto L84
        L2d:
            java.lang.String r3 = "V3GetUserHandler"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L36
            goto L84
        L36:
            java.util.List r3 = k30.f.f78232a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)
            java.lang.String r0 = "typename"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
        L44:
            java.util.List r1 = k30.f.f78232a
            int r1 = r5.V1(r1)
            if (r1 == 0) goto L69
            r3 = 1
            if (r1 == r3) goto L58
            j30.f r5 = new j30.f
            kotlin.jvm.internal.Intrinsics.f(r2)
            r5.<init>(r2, r0)
            goto L8d
        L58:
            k30.e r0 = k30.e.f78230a
            pc.l0 r0 = pc.c.c(r0)
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r5, r6)
            j30.e r0 = (j30.e) r0
            goto L44
        L69:
            a10.e r1 = pc.c.f99520a
            java.lang.Object r1 = r1.f(r5, r6)
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            goto L44
        L73:
            java.lang.String r0 = "ClientError"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L89
            goto L84
        L7c:
            java.lang.String r0 = "UserNotFound"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L89
        L84:
            j30.c r5 = k30.c.a(r5, r6, r2)
            goto L8d
        L89:
            j30.b r5 = k30.b.a(r5, r6, r2)
        L8d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: k30.d.f(tc.f, pc.v):java.lang.Object");
    }
}
