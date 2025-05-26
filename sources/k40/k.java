package k40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final k f78279a = new k();

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        j40.l value = (j40.l) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof j40.u) {
            List list = t.f78294a;
            j40.u value2 = (j40.u) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value2, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value2.f74627d);
            writer.M0("connection");
            pc.c.b(pc.c.c(s.f78292a)).d(writer, customScalarAdapters, value2.f74628e);
            return;
        }
        if (value instanceof j40.n) {
            List list2 = m.f78282a;
            j40.n value3 = (j40.n) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value3, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value3.f74612d);
            writer.M0("error");
            pc.c.c(l.f78280a).d(writer, customScalarAdapters, value3.f74613e);
            return;
        }
        if (value instanceof j40.o) {
            List list3 = n.f78283a;
            j40.o value4 = (j40.o) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value4, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value4.f74614d);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00ab, code lost:
    
        if (r0 == 1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b9, code lost:
    
        r5 = (j40.m) pc.c.c(k40.l.f78280a).f(r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ad, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r2);
        kotlin.jvm.internal.Intrinsics.f(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b8, code lost:
    
        return new j40.n(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0067, code lost:
    
        if (r2.equals("BookmarkDoesNotExist") == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0070, code lost:
    
        if (r2.equals("IllegalBookmarkCharacter") == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (r2.equals("BookmarkPageSizeExceedsMaximum") == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0098, code lost:
    
        r3 = k40.m.f78282a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, "reader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, "customScalarAdapters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x00a3, code lost:
    
        r0 = r8.V1(k40.m.f78282a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x00a9, code lost:
    
        if (r0 == 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00c7, code lost:
    
        r2 = (java.lang.String) pc.c.f99520a.f(r8, r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0085 A[LOOP:2: B:41:0x007d->B:43:0x0085, LOOP_END] */
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
                case -1668571683: goto L6a;
                case 706192883: goto L61;
                case 1590815554: goto L1d;
                case 1822377511: goto L14;
                default: goto L13;
            }
        L13:
            goto L72
        L14:
            java.lang.String r3 = "BookmarkPageSizeExceedsMaximum"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L98
            goto L72
        L1d:
            java.lang.String r3 = "V3OrientationTopicsDataConnectionContainer"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L26
            goto L72
        L26:
            java.util.List r3 = k40.t.f78294a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
        L31:
            java.util.List r0 = k40.t.f78294a
            int r0 = r8.V1(r0)
            if (r0 == 0) goto L57
            if (r0 == r4) goto L45
            j40.u r8 = new j40.u
            kotlin.jvm.internal.Intrinsics.f(r2)
            r8.<init>(r2, r5)
            goto Lb8
        L45:
            k40.s r0 = k40.s.f78292a
            pc.l0 r0 = pc.c.c(r0)
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r8, r9)
            r5 = r0
            j40.t r5 = (j40.t) r5
            goto L31
        L57:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r8, r9)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L31
        L61:
            java.lang.String r3 = "BookmarkDoesNotExist"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L98
            goto L72
        L6a:
            java.lang.String r3 = "IllegalBookmarkCharacter"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L98
        L72:
            java.util.List r3 = k40.n.f78283a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
        L7d:
            java.util.List r0 = k40.n.f78283a
            int r0 = r8.V1(r0)
            if (r0 != 0) goto L8f
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r8, r9)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L7d
        L8f:
            j40.o r8 = new j40.o
            kotlin.jvm.internal.Intrinsics.f(r2)
            r8.<init>(r2)
            goto Lb8
        L98:
            java.util.List r3 = k40.m.f78282a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
        La3:
            java.util.List r0 = k40.m.f78282a
            int r0 = r8.V1(r0)
            if (r0 == 0) goto Lc7
            if (r0 == r4) goto Lb9
            j40.n r8 = new j40.n
            kotlin.jvm.internal.Intrinsics.f(r2)
            kotlin.jvm.internal.Intrinsics.f(r5)
            r8.<init>(r2, r5)
        Lb8:
            return r8
        Lb9:
            k40.l r0 = k40.l.f78280a
            pc.l0 r0 = pc.c.c(r0)
            java.lang.Object r0 = r0.f(r8, r9)
            r5 = r0
            j40.m r5 = (j40.m) r5
            goto La3
        Lc7:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r8, r9)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto La3
        */
        throw new UnsupportedOperationException("Method not decompiled: k40.k.f(tc.f, pc.v):java.lang.Object");
    }
}
