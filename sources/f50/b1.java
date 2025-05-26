package f50;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b1 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final b1 f61114a = new b1();

    /* renamed from: b, reason: collision with root package name */
    public static final List f61115b = kotlin.collections.f0.j("clientTrackingParams", "edges", "modeIcon", "oneBarModules", "oneBarFilters", "pageInfo", "searchfeedTabs", "sensitivity");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        e50.c1 value = (e50.c1) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("clientTrackingParams");
        pc.c.f99524e.d(writer, customScalarAdapters, value.f57287a);
        writer.M0("edges");
        pc.c.b(pc.c.a(pc.c.b(pc.c.c(z.f61201a)))).d(writer, customScalarAdapters, value.f57288b);
        writer.M0("modeIcon");
        pc.c.b(pc.c.c(a0.f61107a)).d(writer, customScalarAdapters, value.f57289c);
        writer.M0("oneBarModules");
        pc.c.b(pc.c.a(pc.c.b(pc.c.c(k0.f61150a)))).d(writer, customScalarAdapters, value.f57290d);
        writer.M0("oneBarFilters");
        pc.c.b(pc.c.a(pc.c.b(pc.c.c(e0.f61128a)))).d(writer, customScalarAdapters, value.f57291e);
        writer.M0("pageInfo");
        pc.c.c(l0.f61153a).d(writer, customScalarAdapters, value.f57292f);
        writer.M0("searchfeedTabs");
        pc.c.b(pc.c.c(n0.f61160a)).d(writer, customScalarAdapters, value.f57293g);
        writer.M0("sensitivity");
        pc.c.b(pc.c.c(a1.f61109a)).d(writer, customScalarAdapters, value.f57294h);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0025, code lost:
    
        return new e50.c1(r2, r3, r4, r5, r6, r7, r8, r9);
     */
    @Override // pc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(tc.f r11, pc.v r12) {
        /*
            r10 = this;
            java.lang.String r0 = "reader"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "customScalarAdapters"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = 0
            r2 = r0
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
        L13:
            java.util.List r0 = f50.b1.f61115b
            int r0 = r11.V1(r0)
            switch(r0) {
                case 0: goto Lba;
                case 1: goto L9f;
                case 2: goto L8c;
                case 3: goto L72;
                case 4: goto L58;
                case 5: goto L4a;
                case 6: goto L38;
                case 7: goto L26;
                default: goto L1c;
            }
        L1c:
            e50.c1 r11 = new e50.c1
            kotlin.jvm.internal.Intrinsics.f(r7)
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r11
        L26:
            f50.a1 r0 = f50.a1.f61109a
            pc.l0 r0 = pc.c.c(r0)
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r11, r12)
            r9 = r0
            e50.b1 r9 = (e50.b1) r9
            goto L13
        L38:
            f50.n0 r0 = f50.n0.f61160a
            pc.l0 r0 = pc.c.c(r0)
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r11, r12)
            r8 = r0
            e50.o0 r8 = (e50.o0) r8
            goto L13
        L4a:
            f50.l0 r0 = f50.l0.f61153a
            pc.l0 r0 = pc.c.c(r0)
            java.lang.Object r0 = r0.f(r11, r12)
            r7 = r0
            e50.m0 r7 = (e50.m0) r7
            goto L13
        L58:
            f50.e0 r0 = f50.e0.f61128a
            pc.l0 r0 = pc.c.c(r0)
            pc.k0 r0 = pc.c.b(r0)
            pc.d r0 = pc.c.a(r0)
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r11, r12)
            r6 = r0
            java.util.List r6 = (java.util.List) r6
            goto L13
        L72:
            f50.k0 r0 = f50.k0.f61150a
            pc.l0 r0 = pc.c.c(r0)
            pc.k0 r0 = pc.c.b(r0)
            pc.d r0 = pc.c.a(r0)
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r11, r12)
            r5 = r0
            java.util.List r5 = (java.util.List) r5
            goto L13
        L8c:
            f50.a0 r0 = f50.a0.f61107a
            pc.l0 r0 = pc.c.c(r0)
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r11, r12)
            r4 = r0
            e50.b0 r4 = (e50.b0) r4
            goto L13
        L9f:
            f50.z r0 = f50.z.f61201a
            pc.l0 r0 = pc.c.c(r0)
            pc.k0 r0 = pc.c.b(r0)
            pc.d r0 = pc.c.a(r0)
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r11, r12)
            r3 = r0
            java.util.List r3 = (java.util.List) r3
            goto L13
        Lba:
            pc.k0 r0 = pc.c.f99524e
            java.lang.Object r0 = r0.f(r11, r12)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: f50.b1.f(tc.f, pc.v):java.lang.Object");
    }
}
