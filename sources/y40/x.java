package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final x f137610a = new x();

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.a0 value = (x40.a0) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof x40.y) {
            List list = v.f137553a;
            x40.y value2 = (x40.y) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value2, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value2.f133714d);
            writer.M0("error");
            pc.c.c(u.f137521a).d(writer, customScalarAdapters, value2.f133715e);
            return;
        }
        if (value instanceof x40.z) {
            List list2 = w.f137582a;
            x40.z value3 = (x40.z) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value3, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value3.f133757d);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x008b, code lost:
    
        if (r1 == 1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0099, code lost:
    
        r0 = (x40.x) pc.c.c(y40.u.f137521a).f(r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008d, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r2);
        kotlin.jvm.internal.Intrinsics.f(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0098, code lost:
    
        return new x40.y(r2, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0021, code lost:
    
        if (r2.equals("InvalidParameters") == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002a, code lost:
    
        if (r2.equals("AccessDenied") == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0033, code lost:
    
        if (r2.equals("ClientError") == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003c, code lost:
    
        if (r2.equals("UserNotFound") == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0045, code lost:
    
        if (r2.equals("ConversationNotFound") != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004e, code lost:
    
        if (r2.equals("PinNotFound") == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r2.equals("AuthorizationFailed") == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0076, code lost:
    
        r3 = y40.v.f137553a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, "reader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, "customScalarAdapters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "typename");
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0082, code lost:
    
        r1 = r6.V1(y40.v.f137553a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0088, code lost:
    
        if (r1 == 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00a6, code lost:
    
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
                case -814800636: goto L48;
                case -641988046: goto L3f;
                case 949711226: goto L36;
                case 1470119133: goto L2d;
                case 1733482047: goto L24;
                case 1877804833: goto L1b;
                case 1996696054: goto L12;
                default: goto L11;
            }
        L11:
            goto L50
        L12:
            java.lang.String r3 = "AuthorizationFailed"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L76
            goto L50
        L1b:
            java.lang.String r3 = "InvalidParameters"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L76
            goto L50
        L24:
            java.lang.String r3 = "AccessDenied"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L76
            goto L50
        L2d:
            java.lang.String r3 = "ClientError"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L76
            goto L50
        L36:
            java.lang.String r3 = "UserNotFound"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L76
            goto L50
        L3f:
            java.lang.String r3 = "ConversationNotFound"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L50
            goto L76
        L48:
            java.lang.String r3 = "PinNotFound"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L76
        L50:
            java.util.List r3 = y40.w.f137582a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
        L5b:
            java.util.List r0 = y40.w.f137582a
            int r0 = r6.V1(r0)
            if (r0 != 0) goto L6d
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r6, r7)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L5b
        L6d:
            x40.z r6 = new x40.z
            kotlin.jvm.internal.Intrinsics.f(r2)
            r6.<init>(r2)
            goto L98
        L76:
            java.util.List r3 = y40.v.f137553a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            r0 = 0
        L82:
            java.util.List r1 = y40.v.f137553a
            int r1 = r6.V1(r1)
            if (r1 == 0) goto La6
            r3 = 1
            if (r1 == r3) goto L99
            x40.y r6 = new x40.y
            kotlin.jvm.internal.Intrinsics.f(r2)
            kotlin.jvm.internal.Intrinsics.f(r0)
            r6.<init>(r2, r0)
        L98:
            return r6
        L99:
            y40.u r0 = y40.u.f137521a
            pc.l0 r0 = pc.c.c(r0)
            java.lang.Object r0 = r0.f(r6, r7)
            x40.x r0 = (x40.x) r0
            goto L82
        La6:
            a10.e r1 = pc.c.f99520a
            java.lang.Object r1 = r1.f(r6, r7)
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            goto L82
        */
        throw new UnsupportedOperationException("Method not decompiled: y40.x.f(tc.f, pc.v):java.lang.Object");
    }
}
