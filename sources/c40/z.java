package c40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final z f25763a = new z();

    /* renamed from: b, reason: collision with root package name */
    public static final List f25764b = kotlin.collections.f0.j("__typename", "id", "entityId", "displayMode", "encodedDisplayMode", "detailHeader", "headerText", "headerIconObjectIds", "objectMap", "textMapping", "newsType");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        b40.b0 value = (b40.b0) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, value.f21689a);
        writer.M0("id");
        eVar.d(writer, customScalarAdapters, value.f21690b);
        writer.M0("entityId");
        eVar.d(writer, customScalarAdapters, value.f21691c);
        writer.M0("displayMode");
        pc.k0 k0Var = pc.c.f99526g;
        k0Var.d(writer, customScalarAdapters, value.f21692d);
        writer.M0("encodedDisplayMode");
        k0Var.d(writer, customScalarAdapters, value.f21693e);
        writer.M0("detailHeader");
        pc.k0 k0Var2 = pc.c.f99524e;
        k0Var2.d(writer, customScalarAdapters, value.f21694f);
        writer.M0("headerText");
        k0Var2.d(writer, customScalarAdapters, value.f21695g);
        writer.M0("headerIconObjectIds");
        pc.c.b(pc.c.a(eVar)).d(writer, customScalarAdapters, value.f21696h);
        writer.M0("objectMap");
        pc.c.b(pc.c.c(x.f25759a)).d(writer, customScalarAdapters, value.f21697i);
        writer.M0("textMapping");
        pc.c.b(pc.c.a(pc.c.c(y.f25761a))).d(writer, customScalarAdapters, value.f21698j);
        writer.M0("newsType");
        k0Var.d(writer, customScalarAdapters, value.f21699k);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001f, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r2);
        kotlin.jvm.internal.Intrinsics.f(r3);
        kotlin.jvm.internal.Intrinsics.f(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002e, code lost:
    
        return new b40.b0(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12);
     */
    @Override // pc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(tc.f r14, pc.v r15) {
        /*
            r13 = this;
            java.lang.String r0 = "reader"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "customScalarAdapters"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
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
            r11 = r10
            r12 = r11
        L16:
            java.util.List r0 = c40.z.f25764b
            int r0 = r14.V1(r0)
            switch(r0) {
                case 0: goto Lb2;
                case 1: goto La7;
                case 2: goto L9c;
                case 3: goto L91;
                case 4: goto L87;
                case 5: goto L7d;
                case 6: goto L73;
                case 7: goto L61;
                case 8: goto L4f;
                case 9: goto L39;
                case 10: goto L2f;
                default: goto L1f;
            }
        L1f:
            b40.b0 r14 = new b40.b0
            kotlin.jvm.internal.Intrinsics.f(r2)
            kotlin.jvm.internal.Intrinsics.f(r3)
            kotlin.jvm.internal.Intrinsics.f(r4)
            r1 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r14
        L2f:
            pc.k0 r0 = pc.c.f99526g
            java.lang.Object r0 = r0.f(r14, r15)
            r12 = r0
            java.lang.Integer r12 = (java.lang.Integer) r12
            goto L16
        L39:
            c40.y r0 = c40.y.f25761a
            pc.l0 r0 = pc.c.c(r0)
            pc.d r0 = pc.c.a(r0)
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r14, r15)
            r11 = r0
            java.util.List r11 = (java.util.List) r11
            goto L16
        L4f:
            c40.x r0 = c40.x.f25759a
            pc.l0 r0 = pc.c.c(r0)
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r14, r15)
            r10 = r0
            b40.z r10 = (b40.z) r10
            goto L16
        L61:
            a10.e r0 = pc.c.f99520a
            pc.d r0 = pc.c.a(r0)
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r14, r15)
            r9 = r0
            java.util.List r9 = (java.util.List) r9
            goto L16
        L73:
            pc.k0 r0 = pc.c.f99524e
            java.lang.Object r0 = r0.f(r14, r15)
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8
            goto L16
        L7d:
            pc.k0 r0 = pc.c.f99524e
            java.lang.Object r0 = r0.f(r14, r15)
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            goto L16
        L87:
            pc.k0 r0 = pc.c.f99526g
            java.lang.Object r0 = r0.f(r14, r15)
            r6 = r0
            java.lang.Integer r6 = (java.lang.Integer) r6
            goto L16
        L91:
            pc.k0 r0 = pc.c.f99526g
            java.lang.Object r0 = r0.f(r14, r15)
            r5 = r0
            java.lang.Integer r5 = (java.lang.Integer) r5
            goto L16
        L9c:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r14, r15)
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
            goto L16
        La7:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r14, r15)
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            goto L16
        Lb2:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r14, r15)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: c40.z.f(tc.f, pc.v):java.lang.Object");
    }
}
