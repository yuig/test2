package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final e f137004a = new e();

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.e value = (x40.e) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof x40.a) {
            List list = a.f136880a;
            x40.a value2 = (x40.a) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value2, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value2.f131893d);
            return;
        }
        if (value instanceof x40.c) {
            List list2 = c.f136941a;
            x40.c value3 = (x40.c) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value3, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value3.f132064d);
            writer.M0("error");
            pc.c.c(b.f136911a).d(writer, customScalarAdapters, value3.f132065e);
            return;
        }
        if (value instanceof x40.d) {
            List list3 = d.f136973a;
            x40.d value4 = (x40.d) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value4, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value4.f132201d);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
    
        if (r1 == 1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0063, code lost:
    
        r0 = (x40.b) pc.c.c(y40.b.f136911a).f(r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r2);
        kotlin.jvm.internal.Intrinsics.f(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return new x40.c(r2, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0022, code lost:
    
        if (r2.equals("InvalidParameters") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002b, code lost:
    
        if (r2.equals("AccessDenied") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0034, code lost:
    
        if (r2.equals("ClientError") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003d, code lost:
    
        if (r2.equals("BoardNotFound") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r2.equals("AuthorizationFailed") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0040, code lost:
    
        r3 = y40.c.f136941a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, "reader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, "customScalarAdapters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "typename");
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x004c, code lost:
    
        r1 = r6.V1(y40.c.f136941a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0052, code lost:
    
        if (r1 == 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0070, code lost:
    
        r2 = (java.lang.String) pc.c.f99520a.f(r6, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0095 A[LOOP:2: B:39:0x008d->B:41:0x0095, LOOP_END] */
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
                case -1225563088: goto L7a;
                case 1381369173: goto L37;
                case 1470119133: goto L2e;
                case 1733482047: goto L25;
                case 1877804833: goto L1c;
                case 1996696054: goto L13;
                default: goto L11;
            }
        L11:
            goto L82
        L13:
            java.lang.String r3 = "AuthorizationFailed"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L40
            goto L82
        L1c:
            java.lang.String r3 = "InvalidParameters"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L40
            goto L82
        L25:
            java.lang.String r3 = "AccessDenied"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L40
            goto L82
        L2e:
            java.lang.String r3 = "ClientError"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L40
            goto L82
        L37:
            java.lang.String r3 = "BoardNotFound"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L40
            goto L82
        L40:
            java.util.List r3 = y40.c.f136941a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            r0 = 0
        L4c:
            java.util.List r1 = y40.c.f136941a
            int r1 = r6.V1(r1)
            if (r1 == 0) goto L70
            r3 = 1
            if (r1 == r3) goto L63
            x40.c r6 = new x40.c
            kotlin.jvm.internal.Intrinsics.f(r2)
            kotlin.jvm.internal.Intrinsics.f(r0)
            r6.<init>(r2, r0)
            goto Lcd
        L63:
            y40.b r0 = y40.b.f136911a
            pc.l0 r0 = pc.c.c(r0)
            java.lang.Object r0 = r0.f(r6, r7)
            x40.b r0 = (x40.b) r0
            goto L4c
        L70:
            a10.e r1 = pc.c.f99520a
            java.lang.Object r1 = r1.f(r6, r7)
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            goto L4c
        L7a:
            java.lang.String r3 = "CollaboratorInviteResponse"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto La8
        L82:
            java.util.List r3 = y40.d.f136973a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
        L8d:
            java.util.List r0 = y40.d.f136973a
            int r0 = r6.V1(r0)
            if (r0 != 0) goto L9f
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r6, r7)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L8d
        L9f:
            x40.d r6 = new x40.d
            kotlin.jvm.internal.Intrinsics.f(r2)
            r6.<init>(r2)
            goto Lcd
        La8:
            java.util.List r3 = y40.a.f136880a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
        Lb3:
            java.util.List r0 = y40.a.f136880a
            int r0 = r6.V1(r0)
            if (r0 != 0) goto Lc5
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r6, r7)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto Lb3
        Lc5:
            x40.a r6 = new x40.a
            kotlin.jvm.internal.Intrinsics.f(r2)
            r6.<init>(r2)
        Lcd:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: y40.e.f(tc.f, pc.v):java.lang.Object");
    }
}
