package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class vc implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final vc f137573a = new vc();

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.ud value = (x40.ud) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof x40.vd) {
            List list = wc.f137603a;
            x40.vd value2 = (x40.vd) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value2, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value2.f133554d);
            return;
        }
        if (value instanceof x40.sd) {
            List list2 = tc.f137512a;
            x40.sd value3 = (x40.sd) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value3, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value3.f133267d);
            writer.M0("error");
            pc.c.c(sc.f137477a).d(writer, customScalarAdapters, value3.f133268e);
            return;
        }
        if (value instanceof x40.td) {
            List list3 = uc.f137543a;
            x40.td value4 = (x40.td) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value4, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value4.f133380d);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00a8, code lost:
    
        if (r1 == 1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00b6, code lost:
    
        r0 = (x40.rd) pc.c.c(y40.sc.f137477a).f(r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00aa, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r2);
        kotlin.jvm.internal.Intrinsics.f(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b5, code lost:
    
        return new x40.sd(r2, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0021, code lost:
    
        if (r2.equals("InvalidParameters") == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002a, code lost:
    
        if (r2.equals("AccessDenied") == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0033, code lost:
    
        if (r2.equals("ClientError") == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006b, code lost:
    
        if (r2.equals("ConversationNotFound") == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r2.equals("AuthorizationFailed") == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0093, code lost:
    
        r3 = y40.tc.f137512a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, "reader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, "customScalarAdapters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "typename");
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x009f, code lost:
    
        r1 = r6.V1(y40.tc.f137512a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x00a5, code lost:
    
        if (r1 == 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00c3, code lost:
    
        r2 = (java.lang.String) pc.c.f99520a.f(r6, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0080 A[LOOP:2: B:39:0x0078->B:41:0x0080, LOOP_END] */
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
                case -641988046: goto L65;
                case -249843806: goto L36;
                case 1470119133: goto L2d;
                case 1733482047: goto L24;
                case 1877804833: goto L1b;
                case 1996696054: goto L12;
                default: goto L11;
            }
        L11:
            goto L6d
        L12:
            java.lang.String r3 = "AuthorizationFailed"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L93
            goto L6d
        L1b:
            java.lang.String r3 = "InvalidParameters"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L93
            goto L6d
        L24:
            java.lang.String r3 = "AccessDenied"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L93
            goto L6d
        L2d:
            java.lang.String r3 = "ClientError"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L93
            goto L6d
        L36:
            java.lang.String r3 = "V3HideConversation"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L3f
            goto L6d
        L3f:
            java.util.List r3 = y40.wc.f137603a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
        L4a:
            java.util.List r0 = y40.wc.f137603a
            int r0 = r6.V1(r0)
            if (r0 != 0) goto L5c
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r6, r7)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L4a
        L5c:
            x40.vd r6 = new x40.vd
            kotlin.jvm.internal.Intrinsics.f(r2)
            r6.<init>(r2)
            goto Lb5
        L65:
            java.lang.String r3 = "ConversationNotFound"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L93
        L6d:
            java.util.List r3 = y40.uc.f137543a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
        L78:
            java.util.List r0 = y40.uc.f137543a
            int r0 = r6.V1(r0)
            if (r0 != 0) goto L8a
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r6, r7)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L78
        L8a:
            x40.td r6 = new x40.td
            kotlin.jvm.internal.Intrinsics.f(r2)
            r6.<init>(r2)
            goto Lb5
        L93:
            java.util.List r3 = y40.tc.f137512a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            r0 = 0
        L9f:
            java.util.List r1 = y40.tc.f137512a
            int r1 = r6.V1(r1)
            if (r1 == 0) goto Lc3
            r3 = 1
            if (r1 == r3) goto Lb6
            x40.sd r6 = new x40.sd
            kotlin.jvm.internal.Intrinsics.f(r2)
            kotlin.jvm.internal.Intrinsics.f(r0)
            r6.<init>(r2, r0)
        Lb5:
            return r6
        Lb6:
            y40.sc r0 = y40.sc.f137477a
            pc.l0 r0 = pc.c.c(r0)
            java.lang.Object r0 = r0.f(r6, r7)
            x40.rd r0 = (x40.rd) r0
            goto L9f
        Lc3:
            a10.e r1 = pc.c.f99520a
            java.lang.Object r1 = r1.f(r6, r7)
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            goto L9f
        */
        throw new UnsupportedOperationException("Method not decompiled: y40.vc.f(tc.f, pc.v):java.lang.Object");
    }
}
