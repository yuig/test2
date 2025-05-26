package t30;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import pc.v;

/* loaded from: classes2.dex */
public final class g implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final g f116302a = new g();

    @Override // pc.a
    public final void d(tc.g writer, v customScalarAdapters, Object obj) {
        s30.g value = (s30.g) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof s30.c) {
            List list = c.f116297a;
            s30.c value2 = (s30.c) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value2, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value2.f111026d);
            writer.M0("data");
            pc.c.b(pc.c.c(b.f116295a)).d(writer, customScalarAdapters, value2.f111027e);
            return;
        }
        if (value instanceof s30.e) {
            List list2 = e.f116300a;
            s30.e value3 = (s30.e) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value3, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value3.f111030d);
            writer.M0("error");
            pc.c.c(d.f116298a).d(writer, customScalarAdapters, value3.f111031e);
            return;
        }
        if (value instanceof s30.f) {
            List list3 = f.f116301a;
            s30.f value4 = (s30.f) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value4, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value4.f111032d);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        if (r0 == 1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        r5 = (s30.d) pc.c.c(t30.d.f116298a).f(r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r2);
        kotlin.jvm.internal.Intrinsics.f(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return new s30.e(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0024, code lost:
    
        if (r2.equals("AccessDenied") == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002d, code lost:
    
        if (r2.equals("ClientError") == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (r2.equals("AuthorizationFailed") == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0030, code lost:
    
        r3 = t30.e.f116300a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, "reader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, "customScalarAdapters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003b, code lost:
    
        r0 = r8.V1(t30.e.f116300a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0041, code lost:
    
        if (r0 == 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005f, code lost:
    
        r2 = (java.lang.String) pc.c.f99520a.f(r8, r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0084 A[LOOP:2: B:41:0x007c->B:43:0x0084, LOOP_END] */
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
                case -1656736638: goto L69;
                case 1470119133: goto L27;
                case 1733482047: goto L1e;
                case 1996696054: goto L15;
                default: goto L14;
            }
        L14:
            goto L71
        L15:
            java.lang.String r3 = "AuthorizationFailed"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L30
            goto L71
        L1e:
            java.lang.String r3 = "AccessDenied"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L30
            goto L71
        L27:
            java.lang.String r3 = "ClientError"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L30
            goto L71
        L30:
            java.util.List r3 = t30.e.f116300a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
        L3b:
            java.util.List r0 = t30.e.f116300a
            int r0 = r8.V1(r0)
            if (r0 == 0) goto L5f
            if (r0 == r4) goto L51
            s30.e r8 = new s30.e
            kotlin.jvm.internal.Intrinsics.f(r2)
            kotlin.jvm.internal.Intrinsics.f(r5)
            r8.<init>(r2, r5)
            goto Lb4
        L51:
            t30.d r0 = t30.d.f116298a
            pc.l0 r0 = pc.c.c(r0)
            java.lang.Object r0 = r0.f(r8, r9)
            r5 = r0
            s30.d r5 = (s30.d) r5
            goto L3b
        L5f:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r8, r9)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L3b
        L69:
            java.lang.String r3 = "AndroidCubesSignInCardResponse"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L97
        L71:
            java.util.List r3 = t30.f.f116301a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
        L7c:
            java.util.List r0 = t30.f.f116301a
            int r0 = r8.V1(r0)
            if (r0 != 0) goto L8e
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r8, r9)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L7c
        L8e:
            s30.f r8 = new s30.f
            kotlin.jvm.internal.Intrinsics.f(r2)
            r8.<init>(r2)
            goto Lb4
        L97:
            java.util.List r3 = t30.c.f116297a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
        La2:
            java.util.List r0 = t30.c.f116297a
            int r0 = r8.V1(r0)
            if (r0 == 0) goto Lc7
            if (r0 == r4) goto Lb5
            s30.c r8 = new s30.c
            kotlin.jvm.internal.Intrinsics.f(r2)
            r8.<init>(r2, r5)
        Lb4:
            return r8
        Lb5:
            t30.b r0 = t30.b.f116295a
            pc.l0 r0 = pc.c.c(r0)
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r8, r9)
            r5 = r0
            s30.b r5 = (s30.b) r5
            goto La2
        Lc7:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r8, r9)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto La2
        */
        throw new UnsupportedOperationException("Method not decompiled: t30.g.f(tc.f, pc.v):java.lang.Object");
    }
}
