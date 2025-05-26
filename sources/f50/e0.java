package f50;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e0 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final e0 f61128a = new e0();

    /* renamed from: b, reason: collision with root package name */
    public static final List f61129b = kotlin.collections.f0.j("__typename", "appliedFilterOptions", "filterComponentType", "label", "productFilterType", "title", "trackingParams", "requestParams", "filterOptions");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        e50.f0 value = (e50.f0) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        pc.c.f99520a.d(writer, customScalarAdapters, value.f57336a);
        writer.M0("appliedFilterOptions");
        pc.c.b(pc.c.a(pc.c.b(pc.c.c(b0.f61112a)))).d(writer, customScalarAdapters, value.f57337b);
        writer.M0("filterComponentType");
        pc.k0 k0Var = pc.c.f99526g;
        k0Var.d(writer, customScalarAdapters, value.f57338c);
        writer.M0("label");
        pc.k0 k0Var2 = pc.c.f99524e;
        k0Var2.d(writer, customScalarAdapters, value.f57339d);
        writer.M0("productFilterType");
        k0Var.d(writer, customScalarAdapters, value.f57340e);
        writer.M0("title");
        k0Var2.d(writer, customScalarAdapters, value.f57341f);
        writer.M0("trackingParams");
        k0Var2.d(writer, customScalarAdapters, value.f57342g);
        writer.M0("requestParams");
        pc.c.b(pc.c.c(d0.f61123a)).d(writer, customScalarAdapters, value.f57343h);
        writer.M0("filterOptions");
        pc.c.b(pc.c.a(pc.c.b(pc.c.c(c0.f61118a)))).d(writer, customScalarAdapters, value.f57344i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        return new e50.f0(r2, r3, r4, r5, r6, r7, r8, r9, r10);
     */
    @Override // pc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(tc.f r12, pc.v r13) {
        /*
            r11 = this;
            java.lang.String r0 = "reader"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "customScalarAdapters"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            r0 = 0
            r2 = r0
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
        L14:
            java.util.List r0 = f50.e0.f61129b
            int r0 = r12.V1(r0)
            switch(r0) {
                case 0: goto La0;
                case 1: goto L85;
                case 2: goto L7b;
                case 3: goto L71;
                case 4: goto L67;
                case 5: goto L5d;
                case 6: goto L53;
                case 7: goto L41;
                case 8: goto L27;
                default: goto L1d;
            }
        L1d:
            e50.f0 r12 = new e50.f0
            kotlin.jvm.internal.Intrinsics.f(r2)
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r12
        L27:
            f50.c0 r0 = f50.c0.f61118a
            pc.l0 r0 = pc.c.c(r0)
            pc.k0 r0 = pc.c.b(r0)
            pc.d r0 = pc.c.a(r0)
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r12, r13)
            r10 = r0
            java.util.List r10 = (java.util.List) r10
            goto L14
        L41:
            f50.d0 r0 = f50.d0.f61123a
            pc.l0 r0 = pc.c.c(r0)
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r12, r13)
            r9 = r0
            e50.e0 r9 = (e50.e0) r9
            goto L14
        L53:
            pc.k0 r0 = pc.c.f99524e
            java.lang.Object r0 = r0.f(r12, r13)
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8
            goto L14
        L5d:
            pc.k0 r0 = pc.c.f99524e
            java.lang.Object r0 = r0.f(r12, r13)
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            goto L14
        L67:
            pc.k0 r0 = pc.c.f99526g
            java.lang.Object r0 = r0.f(r12, r13)
            r6 = r0
            java.lang.Integer r6 = (java.lang.Integer) r6
            goto L14
        L71:
            pc.k0 r0 = pc.c.f99524e
            java.lang.Object r0 = r0.f(r12, r13)
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
            goto L14
        L7b:
            pc.k0 r0 = pc.c.f99526g
            java.lang.Object r0 = r0.f(r12, r13)
            r4 = r0
            java.lang.Integer r4 = (java.lang.Integer) r4
            goto L14
        L85:
            f50.b0 r0 = f50.b0.f61112a
            pc.l0 r0 = pc.c.c(r0)
            pc.k0 r0 = pc.c.b(r0)
            pc.d r0 = pc.c.a(r0)
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r12, r13)
            r3 = r0
            java.util.List r3 = (java.util.List) r3
            goto L14
        La0:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r12, r13)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: f50.e0.f(tc.f, pc.v):java.lang.Object");
    }
}
