package f50;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final l f61152a = new l();

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        e50.m value = (e50.m) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof e50.d1) {
            List list = c1.f61120a;
            e50.d1 value2 = (e50.d1) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value2, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value2.f57312d);
            writer.M0("connection");
            pc.c.b(pc.c.c(b1.f61114a)).d(writer, customScalarAdapters, value2.f57313e);
            return;
        }
        if (value instanceof e50.o) {
            List list2 = n.f61159a;
            e50.o value3 = (e50.o) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value3, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value3.f57399d);
            writer.M0("error");
            pc.c.c(m.f61155a).d(writer, customScalarAdapters, value3.f57400e);
            return;
        }
        if (value instanceof e50.p) {
            List list3 = o.f61162a;
            e50.p value4 = (e50.p) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value4, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value4.f57402d);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00aa, code lost:
    
        if (r0 == 1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b8, code lost:
    
        r5 = (e50.n) pc.c.c(f50.m.f61155a).f(r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ac, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r2);
        kotlin.jvm.internal.Intrinsics.f(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b7, code lost:
    
        return new e50.o(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0023, code lost:
    
        if (r2.equals("BookmarkDoesNotExist") == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006f, code lost:
    
        if (r2.equals("IllegalBookmarkCharacter") == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (r2.equals("BookmarkPageSizeExceedsMaximum") == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0097, code lost:
    
        r3 = f50.n.f61159a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, "reader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, "customScalarAdapters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x00a2, code lost:
    
        r0 = r8.V1(f50.n.f61159a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x00a8, code lost:
    
        if (r0 == 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00c6, code lost:
    
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
                case -1668571683: goto L69;
                case -534777457: goto L26;
                case 706192883: goto L1d;
                case 1822377511: goto L14;
                default: goto L13;
            }
        L13:
            goto L71
        L14:
            java.lang.String r3 = "BookmarkPageSizeExceedsMaximum"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L97
            goto L71
        L1d:
            java.lang.String r3 = "BookmarkDoesNotExist"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L97
            goto L71
        L26:
            java.lang.String r3 = "V3SearchUsersWithStoriesDataConnectionContainer"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L2f
            goto L71
        L2f:
            java.util.List r3 = f50.c1.f61120a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
        L3a:
            java.util.List r0 = f50.c1.f61120a
            int r0 = r8.V1(r0)
            if (r0 == 0) goto L5f
            if (r0 == r4) goto L4d
            e50.d1 r8 = new e50.d1
            kotlin.jvm.internal.Intrinsics.f(r2)
            r8.<init>(r2, r5)
            goto Lb7
        L4d:
            f50.b1 r0 = f50.b1.f61114a
            pc.l0 r0 = pc.c.c(r0)
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r8, r9)
            r5 = r0
            e50.c1 r5 = (e50.c1) r5
            goto L3a
        L5f:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r8, r9)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L3a
        L69:
            java.lang.String r3 = "IllegalBookmarkCharacter"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L97
        L71:
            java.util.List r3 = f50.o.f61162a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
        L7c:
            java.util.List r0 = f50.o.f61162a
            int r0 = r8.V1(r0)
            if (r0 != 0) goto L8e
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r8, r9)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L7c
        L8e:
            e50.p r8 = new e50.p
            kotlin.jvm.internal.Intrinsics.f(r2)
            r8.<init>(r2)
            goto Lb7
        L97:
            java.util.List r3 = f50.n.f61159a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
        La2:
            java.util.List r0 = f50.n.f61159a
            int r0 = r8.V1(r0)
            if (r0 == 0) goto Lc6
            if (r0 == r4) goto Lb8
            e50.o r8 = new e50.o
            kotlin.jvm.internal.Intrinsics.f(r2)
            kotlin.jvm.internal.Intrinsics.f(r5)
            r8.<init>(r2, r5)
        Lb7:
            return r8
        Lb8:
            f50.m r0 = f50.m.f61155a
            pc.l0 r0 = pc.c.c(r0)
            java.lang.Object r0 = r0.f(r8, r9)
            r5 = r0
            e50.n r5 = (e50.n) r5
            goto La2
        Lc6:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r8, r9)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto La2
        */
        throw new UnsupportedOperationException("Method not decompiled: f50.l.f(tc.f, pc.v):java.lang.Object");
    }
}
