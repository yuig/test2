package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import x40.wh;
import x40.xh;
import x40.yh;

/* loaded from: classes5.dex */
public final class rg implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final rg f137455a = new rg();

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        yh value = (yh) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof x40.uh) {
            List list = ng.f137330a;
            x40.uh value2 = (x40.uh) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value2, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value2.f133515d);
            return;
        }
        if (value instanceof wh) {
            List list2 = pg.f137394a;
            wh value3 = (wh) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value3, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value3.f133630d);
            writer.M0("error");
            pc.c.c(og.f137361a).d(writer, customScalarAdapters, value3.f133631e);
            return;
        }
        if (value instanceof xh) {
            List list3 = qg.f137425a;
            xh value4 = (xh) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value4, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value4.f133711d);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
    
        if (r1 == 1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0063, code lost:
    
        r0 = (x40.vh) pc.c.c(y40.og.f137361a).f(r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r2);
        kotlin.jvm.internal.Intrinsics.f(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return new x40.wh(r2, r0);
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
    
        r3 = y40.pg.f137394a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, "reader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, "customScalarAdapters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "typename");
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x004c, code lost:
    
        r1 = r6.V1(y40.pg.f137394a);
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
                case -512274137: goto L7a;
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
            java.util.List r3 = y40.pg.f137394a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            r0 = 0
        L4c:
            java.util.List r1 = y40.pg.f137394a
            int r1 = r6.V1(r1)
            if (r1 == 0) goto L70
            r3 = 1
            if (r1 == r3) goto L63
            x40.wh r6 = new x40.wh
            kotlin.jvm.internal.Intrinsics.f(r2)
            kotlin.jvm.internal.Intrinsics.f(r0)
            r6.<init>(r2, r0)
            goto Lcd
        L63:
            y40.og r0 = y40.og.f137361a
            pc.l0 r0 = pc.c.c(r0)
            java.lang.Object r0 = r0.f(r6, r7)
            x40.vh r0 = (x40.vh) r0
            goto L4c
        L70:
            a10.e r1 = pc.c.f99520a
            java.lang.Object r1 = r1.f(r6, r7)
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            goto L4c
        L7a:
            java.lang.String r3 = "BoardResponse"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto La8
        L82:
            java.util.List r3 = y40.qg.f137425a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
        L8d:
            java.util.List r0 = y40.qg.f137425a
            int r0 = r6.V1(r0)
            if (r0 != 0) goto L9f
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r6, r7)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L8d
        L9f:
            x40.xh r6 = new x40.xh
            kotlin.jvm.internal.Intrinsics.f(r2)
            r6.<init>(r2)
            goto Lcd
        La8:
            java.util.List r3 = y40.ng.f137330a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
        Lb3:
            java.util.List r0 = y40.ng.f137330a
            int r0 = r6.V1(r0)
            if (r0 != 0) goto Lc5
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r6, r7)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto Lb3
        Lc5:
            x40.uh r6 = new x40.uh
            kotlin.jvm.internal.Intrinsics.f(r2)
            r6.<init>(r2)
        Lcd:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: y40.rg.f(tc.f, pc.v):java.lang.Object");
    }
}
