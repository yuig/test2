package z30;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import pc.k0;
import pc.v;

/* loaded from: classes5.dex */
public final class g implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final g f140771a = new g();

    @Override // pc.a
    public final void d(tc.g writer, v customScalarAdapters, Object obj) {
        y30.g value = (y30.g) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!(value instanceof y30.i)) {
            if (value instanceof y30.h) {
                List list = h.f140772a;
                y30.h value2 = (y30.h) value;
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
                Intrinsics.checkNotNullParameter(value2, "value");
                writer.M0("__typename");
                pc.c.f99520a.d(writer, customScalarAdapters, value2.f136739a);
                return;
            }
            return;
        }
        List list2 = i.f140773a;
        y30.i value3 = (y30.i) value;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value3, "value");
        writer.M0("__typename");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, value3.f136740a);
        writer.M0("id");
        eVar.d(writer, customScalarAdapters, value3.f136741b);
        writer.M0("imageUrls");
        pc.c.b(pc.c.a(eVar)).d(writer, customScalarAdapters, value3.f136742c);
        writer.M0("title");
        k0 k0Var = pc.c.f99524e;
        k0Var.d(writer, customScalarAdapters, value3.f136743d);
        writer.M0("subtitle");
        k0Var.d(writer, customScalarAdapters, value3.f136744e);
        writer.M0("entityId");
        eVar.d(writer, customScalarAdapters, value3.f136745f);
        writer.M0("feedSource");
        pc.c.f99528i.d(writer, customScalarAdapters, value3.f136746g);
        writer.M0("isProductPinFeed");
        pc.c.f99527h.d(writer, customScalarAdapters, value3.f136747h);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x002f, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r4);
        kotlin.jvm.internal.Intrinsics.f(r5);
        kotlin.jvm.internal.Intrinsics.f(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:?, code lost:
    
        return new y30.i(r4, r5, r6, r7, r8, r9, r10, r11);
     */
    @Override // pc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(tc.f r13, pc.v r14) {
        /*
            r12 = this;
            java.lang.String r0 = "reader"
            java.lang.String r1 = "customScalarAdapters"
            java.lang.String r2 = ep.b.m(r13, r0, r14, r1, r13)
            java.lang.String r3 = "TodayArticle"
            boolean r3 = kotlin.jvm.internal.Intrinsics.d(r2, r3)
            java.lang.String r4 = "typename"
            if (r3 == 0) goto L95
            java.util.List r3 = z30.i.f140773a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            r0 = 0
            r5 = r0
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r4 = r2
        L26:
            java.util.List r0 = z30.i.f140773a
            int r0 = r13.V1(r0)
            switch(r0) {
                case 0: goto L8b;
                case 1: goto L81;
                case 2: goto L6f;
                case 3: goto L65;
                case 4: goto L5b;
                case 5: goto L51;
                case 6: goto L4a;
                case 7: goto L40;
                default: goto L2f;
            }
        L2f:
            y30.i r13 = new y30.i
            kotlin.jvm.internal.Intrinsics.f(r4)
            kotlin.jvm.internal.Intrinsics.f(r5)
            kotlin.jvm.internal.Intrinsics.f(r9)
            r3 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            goto Lba
        L40:
            pc.k0 r0 = pc.c.f99527h
            java.lang.Object r0 = r0.f(r13, r14)
            r11 = r0
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            goto L26
        L4a:
            pc.k0 r0 = pc.c.f99528i
            java.lang.Object r10 = r0.f(r13, r14)
            goto L26
        L51:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r13, r14)
            r9 = r0
            java.lang.String r9 = (java.lang.String) r9
            goto L26
        L5b:
            pc.k0 r0 = pc.c.f99524e
            java.lang.Object r0 = r0.f(r13, r14)
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8
            goto L26
        L65:
            pc.k0 r0 = pc.c.f99524e
            java.lang.Object r0 = r0.f(r13, r14)
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            goto L26
        L6f:
            a10.e r0 = pc.c.f99520a
            pc.d r0 = pc.c.a(r0)
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r13, r14)
            r6 = r0
            java.util.List r6 = (java.util.List) r6
            goto L26
        L81:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r13, r14)
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
            goto L26
        L8b:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r13, r14)
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
            goto L26
        L95:
            java.util.List r3 = z30.h.f140772a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
        La0:
            java.util.List r0 = z30.h.f140772a
            int r0 = r13.V1(r0)
            if (r0 != 0) goto Lb2
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r13, r14)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto La0
        Lb2:
            y30.h r13 = new y30.h
            kotlin.jvm.internal.Intrinsics.f(r2)
            r13.<init>(r2)
        Lba:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: z30.g.f(tc.f, pc.v):java.lang.Object");
    }
}
