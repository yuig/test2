package h30;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import pc.v;

/* loaded from: classes.dex */
public final class e implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final e f66781a = new e();

    @Override // pc.a
    public final void d(tc.g writer, v customScalarAdapters, Object obj) {
        g30.e value = (g30.e) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof g30.d) {
            List list = d.f66780a;
            d.b(writer, customScalarAdapters, (g30.d) value);
        } else if (value instanceof g30.b) {
            List list2 = b.f66778a;
            b.b(writer, customScalarAdapters, (g30.b) value);
        } else if (value instanceof g30.c) {
            List list3 = c.f66779a;
            c.b(writer, customScalarAdapters, (g30.c) value);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if (r0.equals("AccessDenied") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r0.equals("ClientError") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (r0.equals("AuthorizationFailed") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:?, code lost:
    
        return h30.b.a(r3, r4, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if (r0.equals("InvalidParameters") == false) goto L20;
     */
    @Override // pc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(tc.f r3, pc.v r4) {
        /*
            r2 = this;
            java.lang.String r0 = "reader"
            java.lang.String r1 = "customScalarAdapters"
            java.lang.String r0 = ep.b.m(r3, r0, r4, r1, r3)
            int r1 = r0.hashCode()
            switch(r1) {
                case -943932084: goto L39;
                case 1470119133: goto L2b;
                case 1733482047: goto L22;
                case 1877804833: goto L19;
                case 1996696054: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L41
        L10:
            java.lang.String r1 = "AuthorizationFailed"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L34
            goto L41
        L19:
            java.lang.String r1 = "InvalidParameters"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L34
            goto L41
        L22:
            java.lang.String r1 = "AccessDenied"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L34
            goto L41
        L2b:
            java.lang.String r1 = "ClientError"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L34
            goto L41
        L34:
            g30.b r3 = h30.b.a(r3, r4, r0)
            goto L4a
        L39:
            java.lang.String r1 = "UserResponse"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L46
        L41:
            g30.c r3 = h30.c.a(r3, r4, r0)
            goto L4a
        L46:
            g30.d r3 = h30.d.a(r3, r4, r0)
        L4a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: h30.e.f(tc.f, pc.v):java.lang.Object");
    }
}
