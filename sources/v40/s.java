package v40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final s f124087a = new s();

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        u40.t value = (u40.t) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof u40.a0) {
            List list = z.f124109a;
            u40.a0 value2 = (u40.a0) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value2, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value2.f120287d);
            writer.M0("commerceEnvConfig");
            pc.c.f99528i.d(writer, customScalarAdapters, value2.f120288e);
            writer.M0("data");
            pc.c.b(pc.c.c(t.f124089a)).d(writer, customScalarAdapters, value2.f120289f);
            return;
        }
        if (value instanceof u40.r) {
            List list2 = q.f124082a;
            u40.r value3 = (u40.r) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value3, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value3.f120419d);
            writer.M0("error");
            pc.c.c(p.f124079a).d(writer, customScalarAdapters, value3.f120420e);
            return;
        }
        if (value instanceof u40.s) {
            List list3 = r.f124085a;
            u40.s value4 = (u40.s) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value4, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value4.f120423d);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (r0 == 1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        r5 = (u40.q) pc.c.c(v40.p.f124079a).f(r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r2);
        kotlin.jvm.internal.Intrinsics.f(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return new u40.r(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0023, code lost:
    
        if (r2.equals("AccessDenied") == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002c, code lost:
    
        if (r2.equals("ClientError") == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (r2.equals("AuthorizationFailed") == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002f, code lost:
    
        r3 = v40.q.f124082a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, "reader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, "customScalarAdapters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003a, code lost:
    
        r0 = r8.V1(v40.q.f124082a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0040, code lost:
    
        if (r0 == 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005e, code lost:
    
        r2 = (java.lang.String) pc.c.f99520a.f(r8, r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083 A[LOOP:2: B:47:0x007b->B:49:0x0083, LOOP_END] */
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
                case 574982431: goto L68;
                case 1470119133: goto L26;
                case 1733482047: goto L1d;
                case 1996696054: goto L14;
                default: goto L13;
            }
        L13:
            goto L70
        L14:
            java.lang.String r3 = "AuthorizationFailed"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L2f
            goto L70
        L1d:
            java.lang.String r3 = "AccessDenied"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L2f
            goto L70
        L26:
            java.lang.String r3 = "ClientError"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L2f
            goto L70
        L2f:
            java.util.List r3 = v40.q.f124082a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
        L3a:
            java.util.List r0 = v40.q.f124082a
            int r0 = r8.V1(r0)
            if (r0 == 0) goto L5e
            if (r0 == r4) goto L50
            u40.r r8 = new u40.r
            kotlin.jvm.internal.Intrinsics.f(r2)
            kotlin.jvm.internal.Intrinsics.f(r5)
            r8.<init>(r2, r5)
            goto Lb7
        L50:
            v40.p r0 = v40.p.f124079a
            pc.l0 r0 = pc.c.c(r0)
            java.lang.Object r0 = r0.f(r8, r9)
            r5 = r0
            u40.q r5 = (u40.q) r5
            goto L3a
        L5e:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r8, r9)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L3a
        L68:
            java.lang.String r3 = "V3GetCurrentUserHandler"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L96
        L70:
            java.util.List r3 = v40.r.f124085a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
        L7b:
            java.util.List r0 = v40.r.f124085a
            int r0 = r8.V1(r0)
            if (r0 != 0) goto L8d
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r8, r9)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L7b
        L8d:
            u40.s r8 = new u40.s
            kotlin.jvm.internal.Intrinsics.f(r2)
            r8.<init>(r2)
            goto Lb7
        L96:
            java.util.List r3 = v40.z.f124109a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
            r0 = r5
        La2:
            java.util.List r1 = v40.z.f124109a
            int r1 = r8.V1(r1)
            if (r1 == 0) goto Ld0
            if (r1 == r4) goto Lc9
            r3 = 2
            if (r1 == r3) goto Lb8
            u40.a0 r8 = new u40.a0
            kotlin.jvm.internal.Intrinsics.f(r2)
            r8.<init>(r2, r5, r0)
        Lb7:
            return r8
        Lb8:
            v40.t r0 = v40.t.f124089a
            pc.l0 r0 = pc.c.c(r0)
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r8, r9)
            u40.u r0 = (u40.u) r0
            goto La2
        Lc9:
            pc.k0 r1 = pc.c.f99528i
            java.lang.Object r5 = r1.f(r8, r9)
            goto La2
        Ld0:
            a10.e r1 = pc.c.f99520a
            java.lang.Object r1 = r1.f(r8, r9)
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            goto La2
        */
        throw new UnsupportedOperationException("Method not decompiled: v40.s.f(tc.f, pc.v):java.lang.Object");
    }
}
