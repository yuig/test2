package v40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import u40.f1;

/* loaded from: classes5.dex */
public final class s0 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final s0 f124088a = new s0();

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        u40.w0 value = (u40.w0) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof f1) {
            List list = b1.f124036a;
            f1 value2 = (f1) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value2, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value2.f120325d);
            writer.M0("connection");
            pc.c.b(pc.c.c(a1.f124032a)).d(writer, customScalarAdapters, value2.f120326e);
            return;
        }
        if (value instanceof u40.v0) {
            List list2 = r0.f124086a;
            u40.v0 value3 = (u40.v0) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value3, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value3.f120428d);
            writer.M0("error");
            pc.c.c(q0.f124083a).d(writer, customScalarAdapters, value3.f120429e);
            return;
        }
        if (value instanceof u40.x0) {
            List list3 = t0.f124090a;
            u40.x0 value4 = (u40.x0) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value4, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value4.f120441d);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        if (r0 == 1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
    
        r5 = (u40.u0) pc.c.c(v40.q0.f124083a).f(r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r2);
        kotlin.jvm.internal.Intrinsics.f(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return new u40.v0(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0025, code lost:
    
        if (r2.equals("BookmarkDoesNotExist") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        if (r2.equals("IllegalBookmarkCharacter") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (r2.equals("BookmarkPageSizeExceedsMaximum") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0033, code lost:
    
        r3 = v40.r0.f124086a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, "reader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, "customScalarAdapters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003e, code lost:
    
        r0 = r8.V1(v40.r0.f124086a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0044, code lost:
    
        if (r0 == 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0063, code lost:
    
        r2 = (java.lang.String) pc.c.f99520a.f(r8, r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c2 A[LOOP:2: B:41:0x00ba->B:43:0x00c2, LOOP_END] */
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
                case -1783138695: goto L6d;
                case -1668571683: goto L29;
                case 706192883: goto L1f;
                case 1822377511: goto L15;
                default: goto L13;
            }
        L13:
            goto Laf
        L15:
            java.lang.String r3 = "BookmarkPageSizeExceedsMaximum"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L33
            goto Laf
        L1f:
            java.lang.String r3 = "BookmarkDoesNotExist"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L33
            goto Laf
        L29:
            java.lang.String r3 = "IllegalBookmarkCharacter"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L33
            goto Laf
        L33:
            java.util.List r3 = v40.r0.f124086a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
        L3e:
            java.util.List r0 = v40.r0.f124086a
            int r0 = r8.V1(r0)
            if (r0 == 0) goto L63
            if (r0 == r4) goto L55
            u40.v0 r8 = new u40.v0
            kotlin.jvm.internal.Intrinsics.f(r2)
            kotlin.jvm.internal.Intrinsics.f(r5)
            r8.<init>(r2, r5)
            goto Ld4
        L55:
            v40.q0 r0 = v40.q0.f124083a
            pc.l0 r0 = pc.c.c(r0)
            java.lang.Object r0 = r0.f(r8, r9)
            r5 = r0
            u40.u0 r5 = (u40.u0) r5
            goto L3e
        L63:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r8, r9)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L3e
        L6d:
            java.lang.String r3 = "UserFollowersConnectionContainer"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto Laf
            java.util.List r3 = v40.b1.f124036a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
        L80:
            java.util.List r0 = v40.b1.f124036a
            int r0 = r8.V1(r0)
            if (r0 == 0) goto La5
            if (r0 == r4) goto L93
            u40.f1 r8 = new u40.f1
            kotlin.jvm.internal.Intrinsics.f(r2)
            r8.<init>(r2, r5)
            goto Ld4
        L93:
            v40.a1 r0 = v40.a1.f124032a
            pc.l0 r0 = pc.c.c(r0)
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r8, r9)
            r5 = r0
            u40.e1 r5 = (u40.e1) r5
            goto L80
        La5:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r8, r9)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L80
        Laf:
            java.util.List r3 = v40.t0.f124090a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
        Lba:
            java.util.List r0 = v40.t0.f124090a
            int r0 = r8.V1(r0)
            if (r0 != 0) goto Lcc
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r8, r9)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto Lba
        Lcc:
            u40.x0 r8 = new u40.x0
            kotlin.jvm.internal.Intrinsics.f(r2)
            r8.<init>(r2)
        Ld4:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: v40.s0.f(tc.f, pc.v):java.lang.Object");
    }
}
