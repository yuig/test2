package z30;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import pc.v;

/* loaded from: classes.dex */
public final class t implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final t f140789a = new t();

    @Override // pc.a
    public final void d(tc.g writer, v customScalarAdapters, Object obj) {
        y30.u value = (y30.u) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!(value instanceof y30.t)) {
            if (value instanceof y30.r) {
                List list = q.f140786a;
                q.b(writer, customScalarAdapters, (y30.r) value);
                return;
            } else {
                if (value instanceof y30.s) {
                    List list2 = r.f140787a;
                    r.b(writer, customScalarAdapters, (y30.s) value);
                    return;
                }
                return;
            }
        }
        List list3 = s.f140788a;
        y30.t value2 = (y30.t) value;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value2, "value");
        writer.M0("__typename");
        pc.c.f99520a.d(writer, customScalarAdapters, value2.f136767d);
        writer.M0("data");
        pc.c.f99524e.d(writer, customScalarAdapters, value2.f136768e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if (r2.equals("AccessDenied") == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006f, code lost:
    
        if (r2.equals("ClientError") == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (r2.equals("AuthorizationFailed") == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x007a, code lost:
    
        return z30.q.a(r5, r6, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if (r2.equals("InvalidParameters") == false) goto L27;
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
                case 1470119133: goto L69;
                case 1540948882: goto L2b;
                case 1733482047: goto L22;
                case 1877804833: goto L19;
                case 1996696054: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L71
        L10:
            java.lang.String r0 = "AuthorizationFailed"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L76
            goto L71
        L19:
            java.lang.String r0 = "InvalidParameters"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L76
            goto L71
        L22:
            java.lang.String r0 = "AccessDenied"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L76
            goto L71
        L2b:
            java.lang.String r3 = "StringResponse"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L34
            goto L71
        L34:
            java.util.List r3 = z30.s.f140788a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)
            java.lang.String r0 = "typename"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
        L42:
            java.util.List r1 = z30.s.f140788a
            int r1 = r5.V1(r1)
            if (r1 == 0) goto L5f
            r3 = 1
            if (r1 == r3) goto L56
            y30.t r5 = new y30.t
            kotlin.jvm.internal.Intrinsics.f(r2)
            r5.<init>(r2, r0)
            goto L7a
        L56:
            pc.k0 r0 = pc.c.f99524e
            java.lang.Object r0 = r0.f(r5, r6)
            java.lang.String r0 = (java.lang.String) r0
            goto L42
        L5f:
            a10.e r1 = pc.c.f99520a
            java.lang.Object r1 = r1.f(r5, r6)
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            goto L42
        L69:
            java.lang.String r0 = "ClientError"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L76
        L71:
            y30.s r5 = z30.r.a(r5, r6, r2)
            goto L7a
        L76:
            y30.r r5 = z30.q.a(r5, r6, r2)
        L7a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: z30.t.f(tc.f, pc.v):java.lang.Object");
    }
}
