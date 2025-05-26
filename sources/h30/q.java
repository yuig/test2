package h30;

import g30.s;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import pc.v;

/* loaded from: classes2.dex */
public final class q implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final q f66797a = new q();

    @Override // pc.a
    public final void d(tc.g writer, v customScalarAdapters, Object obj) {
        s value = (s) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof g30.r) {
            List list = p.f66796a;
            g30.r value2 = (g30.r) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value2, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value2.f63438d);
            return;
        }
        if (value instanceof g30.p) {
            List list2 = n.f66794a;
            g30.p value3 = (g30.p) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value3, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value3.f63435d);
            writer.M0("error");
            pc.c.c(m.f66792a).d(writer, customScalarAdapters, value3.f63436e);
            return;
        }
        if (value instanceof g30.q) {
            List list3 = o.f66795a;
            g30.q value4 = (g30.q) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value4, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value4.f63437d);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (r1 == 1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        r0 = (g30.o) pc.c.c(h30.m.f66792a).f(r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r2);
        kotlin.jvm.internal.Intrinsics.f(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return new g30.p(r2, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0022, code lost:
    
        if (r2.equals("AccessDenied") == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002b, code lost:
    
        if (r2.equals("ClientError") == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r2.equals("AuthorizationFailed") == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002e, code lost:
    
        r3 = h30.n.f66794a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, "reader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, "customScalarAdapters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "typename");
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003a, code lost:
    
        r1 = r6.V1(h30.n.f66794a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0040, code lost:
    
        if (r1 == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005e, code lost:
    
        r2 = (java.lang.String) pc.c.f99520a.f(r6, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0083 A[LOOP:2: B:35:0x007b->B:37:0x0083, LOOP_END] */
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
                case -943932084: goto L68;
                case 1470119133: goto L25;
                case 1733482047: goto L1c;
                case 1996696054: goto L13;
                default: goto L12;
            }
        L12:
            goto L70
        L13:
            java.lang.String r3 = "AuthorizationFailed"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L2e
            goto L70
        L1c:
            java.lang.String r3 = "AccessDenied"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L2e
            goto L70
        L25:
            java.lang.String r3 = "ClientError"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L2e
            goto L70
        L2e:
            java.util.List r3 = h30.n.f66794a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            r0 = 0
        L3a:
            java.util.List r1 = h30.n.f66794a
            int r1 = r6.V1(r1)
            if (r1 == 0) goto L5e
            r3 = 1
            if (r1 == r3) goto L51
            g30.p r6 = new g30.p
            kotlin.jvm.internal.Intrinsics.f(r2)
            kotlin.jvm.internal.Intrinsics.f(r0)
            r6.<init>(r2, r0)
            goto Lbb
        L51:
            h30.m r0 = h30.m.f66792a
            pc.l0 r0 = pc.c.c(r0)
            java.lang.Object r0 = r0.f(r6, r7)
            g30.o r0 = (g30.o) r0
            goto L3a
        L5e:
            a10.e r1 = pc.c.f99520a
            java.lang.Object r1 = r1.f(r6, r7)
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            goto L3a
        L68:
            java.lang.String r3 = "UserResponse"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L96
        L70:
            java.util.List r3 = h30.o.f66795a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
        L7b:
            java.util.List r0 = h30.o.f66795a
            int r0 = r6.V1(r0)
            if (r0 != 0) goto L8d
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r6, r7)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L7b
        L8d:
            g30.q r6 = new g30.q
            kotlin.jvm.internal.Intrinsics.f(r2)
            r6.<init>(r2)
            goto Lbb
        L96:
            java.util.List r3 = h30.p.f66796a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
        La1:
            java.util.List r0 = h30.p.f66796a
            int r0 = r6.V1(r0)
            if (r0 != 0) goto Lb3
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r6, r7)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto La1
        Lb3:
            g30.r r6 = new g30.r
            kotlin.jvm.internal.Intrinsics.f(r2)
            r6.<init>(r2)
        Lbb:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: h30.q.f(tc.f, pc.v):java.lang.Object");
    }
}
