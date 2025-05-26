package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ef implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final ef f137031a = new ef();

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.kg value = (x40.kg) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof x40.qh) {
            List list = kg.f137231a;
            x40.qh value2 = (x40.qh) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value2, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value2.f133127d);
            writer.M0("connection");
            pc.c.b(pc.c.c(jg.f137200a)).d(writer, customScalarAdapters, value2.f133128e);
            return;
        }
        if (value instanceof x40.mg) {
            List list2 = gf.f137103a;
            x40.mg value3 = (x40.mg) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value3, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value3.f132828d);
            writer.M0("error");
            pc.c.c(ff.f137067a).d(writer, customScalarAdapters, value3.f132829e);
            return;
        }
        if (value instanceof x40.ng) {
            List list3 = hf.f137135a;
            x40.ng value4 = (x40.ng) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value4, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value4.f132899d);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00aa, code lost:
    
        if (r0 == 1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b8, code lost:
    
        r5 = (x40.lg) pc.c.c(y40.ff.f137067a).f(r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ac, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r2);
        kotlin.jvm.internal.Intrinsics.f(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b7, code lost:
    
        return new x40.mg(r2, r5);
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
    
        r3 = y40.gf.f137103a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, "reader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, "customScalarAdapters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x00a2, code lost:
    
        r0 = r8.V1(y40.gf.f137103a);
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
                case 589937209: goto L26;
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
            java.lang.String r3 = "V3RelatedPinsForConversationDataConnectionContainer"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L2f
            goto L71
        L2f:
            java.util.List r3 = y40.kg.f137231a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
        L3a:
            java.util.List r0 = y40.kg.f137231a
            int r0 = r8.V1(r0)
            if (r0 == 0) goto L5f
            if (r0 == r4) goto L4d
            x40.qh r8 = new x40.qh
            kotlin.jvm.internal.Intrinsics.f(r2)
            r8.<init>(r2, r5)
            goto Lb7
        L4d:
            y40.jg r0 = y40.jg.f137200a
            pc.l0 r0 = pc.c.c(r0)
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r8, r9)
            r5 = r0
            x40.ph r5 = (x40.ph) r5
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
            java.util.List r3 = y40.hf.f137135a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
        L7c:
            java.util.List r0 = y40.hf.f137135a
            int r0 = r8.V1(r0)
            if (r0 != 0) goto L8e
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r8, r9)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L7c
        L8e:
            x40.ng r8 = new x40.ng
            kotlin.jvm.internal.Intrinsics.f(r2)
            r8.<init>(r2)
            goto Lb7
        L97:
            java.util.List r3 = y40.gf.f137103a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
        La2:
            java.util.List r0 = y40.gf.f137103a
            int r0 = r8.V1(r0)
            if (r0 == 0) goto Lc6
            if (r0 == r4) goto Lb8
            x40.mg r8 = new x40.mg
            kotlin.jvm.internal.Intrinsics.f(r2)
            kotlin.jvm.internal.Intrinsics.f(r5)
            r8.<init>(r2, r5)
        Lb7:
            return r8
        Lb8:
            y40.ff r0 = y40.ff.f137067a
            pc.l0 r0 = pc.c.c(r0)
            java.lang.Object r0 = r0.f(r8, r9)
            r5 = r0
            x40.lg r5 = (x40.lg) r5
            goto La2
        Lc6:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r8, r9)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto La2
        */
        throw new UnsupportedOperationException("Method not decompiled: y40.ef.f(tc.f, pc.v):java.lang.Object");
    }
}
