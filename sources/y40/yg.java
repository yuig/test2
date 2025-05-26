package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import x40.ci;
import x40.ei;
import x40.fi;
import x40.gi;

/* loaded from: classes5.dex */
public final class yg implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final yg f137670a = new yg();

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        gi value = (gi) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof ci) {
            List list = ug.f137550a;
            ci value2 = (ci) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value2, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value2.f132172d);
            writer.M0("data");
            pc.c.b(pc.c.c(tg.f137518a)).d(writer, customScalarAdapters, value2.f132173e);
            return;
        }
        if (value instanceof ei) {
            List list2 = wg.f137609a;
            ei value3 = (ei) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value3, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value3.f132362d);
            writer.M0("error");
            pc.c.c(vg.f137580a).d(writer, customScalarAdapters, value3.f132363e);
            return;
        }
        if (value instanceof fi) {
            List list3 = xg.f137639a;
            fi value4 = (fi) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value4, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value4.f132419d);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
    
        if (r0 == 1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:
    
        r5 = (x40.di) pc.c.c(y40.vg.f137580a).f(r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r2);
        kotlin.jvm.internal.Intrinsics.f(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return new x40.ei(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0024, code lost:
    
        if (r2.equals("InvalidParameters") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002d, code lost:
    
        if (r2.equals("AccessDenied") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0036, code lost:
    
        if (r2.equals("ClientError") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003f, code lost:
    
        if (r2.equals("ContactRequestNotFound") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (r2.equals("AuthorizationFailed") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0042, code lost:
    
        r3 = y40.wg.f137609a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, "reader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, "customScalarAdapters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x004d, code lost:
    
        r0 = r8.V1(y40.wg.f137609a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0053, code lost:
    
        if (r0 == 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0071, code lost:
    
        r2 = (java.lang.String) pc.c.f99520a.f(r8, r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0096 A[LOOP:2: B:45:0x008e->B:47:0x0096, LOOP_END] */
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
                case -1849956400: goto L7b;
                case 43686910: goto L39;
                case 1470119133: goto L30;
                case 1733482047: goto L27;
                case 1877804833: goto L1e;
                case 1996696054: goto L15;
                default: goto L13;
            }
        L13:
            goto L83
        L15:
            java.lang.String r3 = "AuthorizationFailed"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L42
            goto L83
        L1e:
            java.lang.String r3 = "InvalidParameters"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L42
            goto L83
        L27:
            java.lang.String r3 = "AccessDenied"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L42
            goto L83
        L30:
            java.lang.String r3 = "ClientError"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L42
            goto L83
        L39:
            java.lang.String r3 = "ContactRequestNotFound"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L42
            goto L83
        L42:
            java.util.List r3 = y40.wg.f137609a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
        L4d:
            java.util.List r0 = y40.wg.f137609a
            int r0 = r8.V1(r0)
            if (r0 == 0) goto L71
            if (r0 == r4) goto L63
            x40.ei r8 = new x40.ei
            kotlin.jvm.internal.Intrinsics.f(r2)
            kotlin.jvm.internal.Intrinsics.f(r5)
            r8.<init>(r2, r5)
            goto Lc6
        L63:
            y40.vg r0 = y40.vg.f137580a
            pc.l0 r0 = pc.c.c(r0)
            java.lang.Object r0 = r0.f(r8, r9)
            r5 = r0
            x40.di r5 = (x40.di) r5
            goto L4d
        L71:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r8, r9)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L4d
        L7b:
            java.lang.String r3 = "ContactRequestResponse"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto La9
        L83:
            java.util.List r3 = y40.xg.f137639a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
        L8e:
            java.util.List r0 = y40.xg.f137639a
            int r0 = r8.V1(r0)
            if (r0 != 0) goto La0
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r8, r9)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L8e
        La0:
            x40.fi r8 = new x40.fi
            kotlin.jvm.internal.Intrinsics.f(r2)
            r8.<init>(r2)
            goto Lc6
        La9:
            java.util.List r3 = y40.ug.f137550a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
        Lb4:
            java.util.List r0 = y40.ug.f137550a
            int r0 = r8.V1(r0)
            if (r0 == 0) goto Ld9
            if (r0 == r4) goto Lc7
            x40.ci r8 = new x40.ci
            kotlin.jvm.internal.Intrinsics.f(r2)
            r8.<init>(r2, r5)
        Lc6:
            return r8
        Lc7:
            y40.tg r0 = y40.tg.f137518a
            pc.l0 r0 = pc.c.c(r0)
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r8, r9)
            r5 = r0
            x40.bi r5 = (x40.bi) r5
            goto Lb4
        Ld9:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r8, r9)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto Lb4
        */
        throw new UnsupportedOperationException("Method not decompiled: y40.yg.f(tc.f, pc.v):java.lang.Object");
    }
}
