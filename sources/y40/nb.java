package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class nb implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final nb f137322a = new nb();

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.jc value = (x40.jc) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof x40.yc) {
            List list = bc.f136934a;
            x40.yc value2 = (x40.yc) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value2, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value2.f133738d);
            writer.M0("connection");
            pc.c.b(pc.c.c(ac.f136902a)).d(writer, customScalarAdapters, value2.f133739e);
            return;
        }
        if (value instanceof x40.lc) {
            List list2 = pb.f137386a;
            x40.lc value3 = (x40.lc) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value3, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value3.f132749d);
            writer.M0("error");
            pc.c.c(ob.f137353a).d(writer, customScalarAdapters, value3.f132750e);
            return;
        }
        if (value instanceof x40.mc) {
            List list3 = qb.f137417a;
            x40.mc value4 = (x40.mc) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value4, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value4.f132820d);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a9, code lost:
    
        if (r0 == 1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b7, code lost:
    
        r5 = (x40.kc) pc.c.c(y40.ob.f137353a).f(r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ab, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r2);
        kotlin.jvm.internal.Intrinsics.f(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b6, code lost:
    
        return new x40.lc(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0023, code lost:
    
        if (r2.equals("BookmarkDoesNotExist") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006e, code lost:
    
        if (r2.equals("IllegalBookmarkCharacter") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (r2.equals("BookmarkPageSizeExceedsMaximum") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0096, code lost:
    
        r3 = y40.pb.f137386a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, "reader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, "customScalarAdapters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x00a1, code lost:
    
        r0 = r8.V1(y40.pb.f137386a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x00a7, code lost:
    
        if (r0 == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00c5, code lost:
    
        r2 = (java.lang.String) pc.c.f99520a.f(r8, r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0083 A[LOOP:2: B:41:0x007b->B:43:0x0083, LOOP_END] */
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
                case -1668571683: goto L68;
                case 532601719: goto L26;
                case 706192883: goto L1d;
                case 1822377511: goto L14;
                default: goto L13;
            }
        L13:
            goto L70
        L14:
            java.lang.String r3 = "BookmarkPageSizeExceedsMaximum"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L96
            goto L70
        L1d:
            java.lang.String r3 = "BookmarkDoesNotExist"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L96
            goto L70
        L26:
            java.lang.String r3 = "V3GetUserContactRequestsByUserDataConnectionContainer"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L70
            java.util.List r3 = y40.bc.f136934a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
        L39:
            java.util.List r0 = y40.bc.f136934a
            int r0 = r8.V1(r0)
            if (r0 == 0) goto L5e
            if (r0 == r4) goto L4c
            x40.yc r8 = new x40.yc
            kotlin.jvm.internal.Intrinsics.f(r2)
            r8.<init>(r2, r5)
            goto Lb6
        L4c:
            y40.ac r0 = y40.ac.f136902a
            pc.l0 r0 = pc.c.c(r0)
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r8, r9)
            r5 = r0
            x40.xc r5 = (x40.xc) r5
            goto L39
        L5e:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r8, r9)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L39
        L68:
            java.lang.String r3 = "IllegalBookmarkCharacter"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L96
        L70:
            java.util.List r3 = y40.qb.f137417a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
        L7b:
            java.util.List r0 = y40.qb.f137417a
            int r0 = r8.V1(r0)
            if (r0 != 0) goto L8d
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r8, r9)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L7b
        L8d:
            x40.mc r8 = new x40.mc
            kotlin.jvm.internal.Intrinsics.f(r2)
            r8.<init>(r2)
            goto Lb6
        L96:
            java.util.List r3 = y40.pb.f137386a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
        La1:
            java.util.List r0 = y40.pb.f137386a
            int r0 = r8.V1(r0)
            if (r0 == 0) goto Lc5
            if (r0 == r4) goto Lb7
            x40.lc r8 = new x40.lc
            kotlin.jvm.internal.Intrinsics.f(r2)
            kotlin.jvm.internal.Intrinsics.f(r5)
            r8.<init>(r2, r5)
        Lb6:
            return r8
        Lb7:
            y40.ob r0 = y40.ob.f137353a
            pc.l0 r0 = pc.c.c(r0)
            java.lang.Object r0 = r0.f(r8, r9)
            r5 = r0
            x40.kc r5 = (x40.kc) r5
            goto La1
        Lc5:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r8, r9)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto La1
        */
        throw new UnsupportedOperationException("Method not decompiled: y40.nb.f(tc.f, pc.v):java.lang.Object");
    }
}
