package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ja implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final ja f137190a = new ja();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137191b = kotlin.collections.f0.j("__typename", "id", "entityId", "user", "pin", "details", "images");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.db value = (x40.db) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, value.f132237a);
        writer.M0("id");
        eVar.d(writer, customScalarAdapters, value.f132238b);
        writer.M0("entityId");
        eVar.d(writer, customScalarAdapters, value.f132239c);
        writer.M0("user");
        pc.c.b(pc.c.c(ia.f137158a)).d(writer, customScalarAdapters, value.f132240d);
        writer.M0("pin");
        pc.c.b(pc.c.c(ga.f137094a)).d(writer, customScalarAdapters, value.f132241e);
        writer.M0("details");
        pc.c.f99524e.d(writer, customScalarAdapters, value.f132242f);
        writer.M0("images");
        pc.c.b(pc.c.a(pc.c.c(t9.f137506a))).d(writer, customScalarAdapters, value.f132243g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r2);
        kotlin.jvm.internal.Intrinsics.f(r3);
        kotlin.jvm.internal.Intrinsics.f(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002a, code lost:
    
        return new x40.db(r2, r3, r4, r5, r6, r7, r8);
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
            java.util.List r0 = y40.ja.f137191b
            int r0 = r10.V1(r0)
            switch(r0) {
                case 0: goto L83;
                case 1: goto L79;
                case 2: goto L6f;
                case 3: goto L5d;
                case 4: goto L4b;
                case 5: goto L41;
                case 6: goto L2b;
                default: goto L1b;
            }
        L1b:
            x40.db r10 = new x40.db
            kotlin.jvm.internal.Intrinsics.f(r2)
            kotlin.jvm.internal.Intrinsics.f(r3)
            kotlin.jvm.internal.Intrinsics.f(r4)
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r10
        L2b:
            y40.t9 r0 = y40.t9.f137506a
            pc.l0 r0 = pc.c.c(r0)
            pc.d r0 = pc.c.a(r0)
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r10, r11)
            r8 = r0
            java.util.List r8 = (java.util.List) r8
            goto L12
        L41:
            pc.k0 r0 = pc.c.f99524e
            java.lang.Object r0 = r0.f(r10, r11)
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            goto L12
        L4b:
            y40.ga r0 = y40.ga.f137094a
            pc.l0 r0 = pc.c.c(r0)
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r10, r11)
            r6 = r0
            x40.ab r6 = (x40.ab) r6
            goto L12
        L5d:
            y40.ia r0 = y40.ia.f137158a
            pc.l0 r0 = pc.c.c(r0)
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r10, r11)
            r5 = r0
            x40.cb r5 = (x40.cb) r5
            goto L12
        L6f:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r10, r11)
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
            goto L12
        L79:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r10, r11)
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            goto L12
        L83:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r10, r11)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: y40.ja.f(tc.f, pc.v):java.lang.Object");
    }
}
