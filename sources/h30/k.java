package h30;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import pc.v;

/* loaded from: classes2.dex */
public final class k implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final k f66789a = new k();

    @Override // pc.a
    public final void d(tc.g writer, v customScalarAdapters, Object obj) {
        g30.l value = (g30.l) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof g30.k) {
            List list = j.f66788a;
            g30.k value2 = (g30.k) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value2, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value2.f63429d);
            return;
        }
        if (value instanceof g30.i) {
            List list2 = h.f66786a;
            g30.i value3 = (g30.i) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value3, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value3.f63426d);
            writer.M0("error");
            pc.c.c(g.f66784a).d(writer, customScalarAdapters, value3.f63427e);
            return;
        }
        if (value instanceof g30.j) {
            List list3 = i.f66787a;
            g30.j value4 = (g30.j) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value4, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value4.f63428d);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        if (r1 == 1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        r0 = (g30.h) pc.c.c(h30.g.f66784a).f(r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r2);
        kotlin.jvm.internal.Intrinsics.f(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return new g30.i(r2, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0022, code lost:
    
        if (r2.equals("InvalidParameters") == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002b, code lost:
    
        if (r2.equals("AccessDenied") == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0034, code lost:
    
        if (r2.equals("ClientError") == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r2.equals("AuthorizationFailed") == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0037, code lost:
    
        r3 = h30.h.f66786a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, "reader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, "customScalarAdapters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "typename");
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0043, code lost:
    
        r1 = r6.V1(h30.h.f66786a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0049, code lost:
    
        if (r1 == 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0067, code lost:
    
        r2 = (java.lang.String) pc.c.f99520a.f(r6, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008c A[LOOP:2: B:37:0x0084->B:39:0x008c, LOOP_END] */
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
                case -943932084: goto L71;
                case 1470119133: goto L2e;
                case 1733482047: goto L25;
                case 1877804833: goto L1c;
                case 1996696054: goto L13;
                default: goto L12;
            }
        L12:
            goto L79
        L13:
            java.lang.String r3 = "AuthorizationFailed"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L37
            goto L79
        L1c:
            java.lang.String r3 = "InvalidParameters"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L37
            goto L79
        L25:
            java.lang.String r3 = "AccessDenied"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L37
            goto L79
        L2e:
            java.lang.String r3 = "ClientError"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L37
            goto L79
        L37:
            java.util.List r3 = h30.h.f66786a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            r0 = 0
        L43:
            java.util.List r1 = h30.h.f66786a
            int r1 = r6.V1(r1)
            if (r1 == 0) goto L67
            r3 = 1
            if (r1 == r3) goto L5a
            g30.i r6 = new g30.i
            kotlin.jvm.internal.Intrinsics.f(r2)
            kotlin.jvm.internal.Intrinsics.f(r0)
            r6.<init>(r2, r0)
            goto Lc4
        L5a:
            h30.g r0 = h30.g.f66784a
            pc.l0 r0 = pc.c.c(r0)
            java.lang.Object r0 = r0.f(r6, r7)
            g30.h r0 = (g30.h) r0
            goto L43
        L67:
            a10.e r1 = pc.c.f99520a
            java.lang.Object r1 = r1.f(r6, r7)
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            goto L43
        L71:
            java.lang.String r3 = "UserResponse"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L9f
        L79:
            java.util.List r3 = h30.i.f66787a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
        L84:
            java.util.List r0 = h30.i.f66787a
            int r0 = r6.V1(r0)
            if (r0 != 0) goto L96
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r6, r7)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L84
        L96:
            g30.j r6 = new g30.j
            kotlin.jvm.internal.Intrinsics.f(r2)
            r6.<init>(r2)
            goto Lc4
        L9f:
            java.util.List r3 = h30.j.f66788a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
        Laa:
            java.util.List r0 = h30.j.f66788a
            int r0 = r6.V1(r0)
            if (r0 != 0) goto Lbc
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r6, r7)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto Laa
        Lbc:
            g30.k r6 = new g30.k
            kotlin.jvm.internal.Intrinsics.f(r2)
            r6.<init>(r2)
        Lc4:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: h30.k.f(tc.f, pc.v):java.lang.Object");
    }
}
