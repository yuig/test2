package c40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final j f25726a = new j();

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        b40.k value = (b40.k) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!(value instanceof b40.p)) {
            if (value instanceof b40.i) {
                List list = h.f25722a;
                h.b(writer, customScalarAdapters, (b40.i) value);
                return;
            } else {
                if (value instanceof b40.j) {
                    List list2 = i.f25724a;
                    i.b(writer, customScalarAdapters, (b40.j) value);
                    return;
                }
                return;
            }
        }
        List list3 = o.f25739a;
        b40.p value2 = (b40.p) value;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value2, "value");
        writer.M0("__typename");
        pc.c.f99520a.d(writer, customScalarAdapters, value2.f21735d);
        writer.M0("data");
        pc.c.b(pc.c.c(k.f25728a)).d(writer, customScalarAdapters, value2.f21736e);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if (r2.equals("ClientError") == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (r2.equals("AuthorizationFailed") == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:?, code lost:
    
        return c40.h.a(r5, r6, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if (r2.equals("AccessDenied") == false) goto L17;
     */
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
                case 574982431: goto L30;
                case 1470119133: goto L22;
                case 1733482047: goto L19;
                case 1996696054: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L38
        L10:
            java.lang.String r0 = "AuthorizationFailed"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L2b
            goto L38
        L19:
            java.lang.String r0 = "AccessDenied"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L2b
            goto L38
        L22:
            java.lang.String r0 = "ClientError"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L2b
            goto L38
        L2b:
            b40.i r5 = c40.h.a(r5, r6, r2)
            goto L5e
        L30:
            java.lang.String r3 = "V3GetCurrentUserHandler"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L3d
        L38:
            b40.j r5 = c40.i.a(r5, r6, r2)
            goto L5e
        L3d:
            java.util.List r3 = c40.o.f25739a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)
            java.lang.String r0 = "typename"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
        L4b:
            java.util.List r1 = c40.o.f25739a
            int r1 = r5.V1(r1)
            if (r1 == 0) goto L70
            r3 = 1
            if (r1 == r3) goto L5f
            b40.p r5 = new b40.p
            kotlin.jvm.internal.Intrinsics.f(r2)
            r5.<init>(r2, r0)
        L5e:
            return r5
        L5f:
            c40.k r0 = c40.k.f25728a
            pc.l0 r0 = pc.c.c(r0)
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r5, r6)
            b40.l r0 = (b40.l) r0
            goto L4b
        L70:
            a10.e r1 = pc.c.f99520a
            java.lang.Object r1 = r1.f(r5, r6)
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            goto L4b
        */
        throw new UnsupportedOperationException("Method not decompiled: c40.j.f(tc.f, pc.v):java.lang.Object");
    }
}
