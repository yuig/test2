package f50;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i0 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final i0 f61144a = new i0();

    /* renamed from: b, reason: collision with root package name */
    public static final List f61145b = kotlin.collections.f0.j("feedUrl", "oneBarFilters", "filterType", "filterKeys", "searchParameters", "searchQuery", "title");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        e50.j0 value = (e50.j0) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("feedUrl");
        pc.k0 k0Var = pc.c.f99524e;
        k0Var.d(writer, customScalarAdapters, value.f57370a);
        writer.M0("oneBarFilters");
        pc.c.b(pc.c.a(pc.c.b(pc.c.c(h0.f61141a)))).d(writer, customScalarAdapters, value.f57371b);
        writer.M0("filterType");
        pc.c.f99526g.d(writer, customScalarAdapters, value.f57372c);
        writer.M0("filterKeys");
        pc.c.b(pc.c.a(k0Var)).d(writer, customScalarAdapters, value.f57373d);
        writer.M0("searchParameters");
        pc.c.b(pc.c.a(pc.c.f99520a)).d(writer, customScalarAdapters, value.f57374e);
        writer.M0("searchQuery");
        k0Var.d(writer, customScalarAdapters, value.f57375f);
        writer.M0("title");
        k0Var.d(writer, customScalarAdapters, value.f57376g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        return new e50.j0(r2, r3, r4, r5, r6, r7, r8);
     */
    @Override // pc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(tc.f r10, pc.v r11) {
        /*
            r9 = this;
            java.lang.String r0 = "reader"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "customScalarAdapters"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = 0
            r2 = r0
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
        L12:
            java.util.List r0 = f50.i0.f61145b
            int r0 = r10.V1(r0)
            switch(r0) {
                case 0: goto L7e;
                case 1: goto L64;
                case 2: goto L5a;
                case 3: goto L48;
                case 4: goto L36;
                case 5: goto L2c;
                case 6: goto L22;
                default: goto L1b;
            }
        L1b:
            e50.j0 r10 = new e50.j0
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r10
        L22:
            pc.k0 r0 = pc.c.f99524e
            java.lang.Object r0 = r0.f(r10, r11)
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8
            goto L12
        L2c:
            pc.k0 r0 = pc.c.f99524e
            java.lang.Object r0 = r0.f(r10, r11)
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            goto L12
        L36:
            a10.e r0 = pc.c.f99520a
            pc.d r0 = pc.c.a(r0)
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r10, r11)
            r6 = r0
            java.util.List r6 = (java.util.List) r6
            goto L12
        L48:
            pc.k0 r0 = pc.c.f99524e
            pc.d r0 = pc.c.a(r0)
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r10, r11)
            r5 = r0
            java.util.List r5 = (java.util.List) r5
            goto L12
        L5a:
            pc.k0 r0 = pc.c.f99526g
            java.lang.Object r0 = r0.f(r10, r11)
            r4 = r0
            java.lang.Integer r4 = (java.lang.Integer) r4
            goto L12
        L64:
            f50.h0 r0 = f50.h0.f61141a
            pc.l0 r0 = pc.c.c(r0)
            pc.k0 r0 = pc.c.b(r0)
            pc.d r0 = pc.c.a(r0)
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r10, r11)
            r3 = r0
            java.util.List r3 = (java.util.List) r3
            goto L12
        L7e:
            pc.k0 r0 = pc.c.f99524e
            java.lang.Object r0 = r0.f(r10, r11)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: f50.i0.f(tc.f, pc.v):java.lang.Object");
    }
}
