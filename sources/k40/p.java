package k40;

import java.util.List;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import pc.k0;

/* loaded from: classes5.dex */
public final class p implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final p f78286a = new p();

    /* renamed from: b, reason: collision with root package name */
    public static final List f78287b = f0.j("__typename", "id", "entityId", "isFollowed", "backgroundColor", "name", "images");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        j40.q value = (j40.q) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, value.f74616a);
        writer.M0("id");
        eVar.d(writer, customScalarAdapters, value.f74617b);
        writer.M0("entityId");
        eVar.d(writer, customScalarAdapters, value.f74618c);
        writer.M0("isFollowed");
        pc.c.f99527h.d(writer, customScalarAdapters, value.f74619d);
        writer.M0("backgroundColor");
        k0 k0Var = pc.c.f99524e;
        k0Var.d(writer, customScalarAdapters, value.f74620e);
        writer.M0("name");
        k0Var.d(writer, customScalarAdapters, value.f74621f);
        writer.M0("images");
        pc.c.b(pc.c.c(o.f78284a)).d(writer, customScalarAdapters, value.f74622g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r2);
        kotlin.jvm.internal.Intrinsics.f(r3);
        kotlin.jvm.internal.Intrinsics.f(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002a, code lost:
    
        return new j40.q(r2, r3, r4, r5, r6, r7, r8);
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
            java.util.List r0 = k40.p.f78287b
            int r0 = r10.V1(r0)
            switch(r0) {
                case 0: goto L6f;
                case 1: goto L65;
                case 2: goto L5b;
                case 3: goto L51;
                case 4: goto L47;
                case 5: goto L3d;
                case 6: goto L2b;
                default: goto L1b;
            }
        L1b:
            j40.q r10 = new j40.q
            kotlin.jvm.internal.Intrinsics.f(r2)
            kotlin.jvm.internal.Intrinsics.f(r3)
            kotlin.jvm.internal.Intrinsics.f(r4)
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r10
        L2b:
            k40.o r0 = k40.o.f78284a
            pc.l0 r0 = pc.c.c(r0)
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r10, r11)
            r8 = r0
            j40.p r8 = (j40.p) r8
            goto L12
        L3d:
            pc.k0 r0 = pc.c.f99524e
            java.lang.Object r0 = r0.f(r10, r11)
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            goto L12
        L47:
            pc.k0 r0 = pc.c.f99524e
            java.lang.Object r0 = r0.f(r10, r11)
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            goto L12
        L51:
            pc.k0 r0 = pc.c.f99527h
            java.lang.Object r0 = r0.f(r10, r11)
            r5 = r0
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            goto L12
        L5b:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r10, r11)
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
            goto L12
        L65:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r10, r11)
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            goto L12
        L6f:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r10, r11)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: k40.p.f(tc.f, pc.v):java.lang.Object");
    }
}
