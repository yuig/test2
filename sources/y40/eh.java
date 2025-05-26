package y40;

import com.appsflyer.AdRevenueScheme;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import x40.ni;

/* loaded from: classes.dex */
public final class eh implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final eh f137034a = new eh();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137035b = kotlin.collections.f0.j("__typename", "id", "entityId", "extraStreet", "postalCode", AdRevenueScheme.COUNTRY, "street", "latitude", "longitude", "locality", "region");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        ni value = (ni) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, value.k());
        writer.M0("id");
        eVar.d(writer, customScalarAdapters, value.d());
        writer.M0("entityId");
        eVar.d(writer, customScalarAdapters, value.b());
        writer.M0("extraStreet");
        pc.k0 k0Var = pc.c.f99524e;
        k0Var.d(writer, customScalarAdapters, value.c());
        writer.M0("postalCode");
        k0Var.d(writer, customScalarAdapters, value.h());
        writer.M0(AdRevenueScheme.COUNTRY);
        k0Var.d(writer, customScalarAdapters, value.a());
        writer.M0("street");
        k0Var.d(writer, customScalarAdapters, value.j());
        writer.M0("latitude");
        pc.k0 k0Var2 = pc.c.f99525f;
        k0Var2.d(writer, customScalarAdapters, value.e());
        writer.M0("longitude");
        k0Var2.d(writer, customScalarAdapters, value.g());
        writer.M0("locality");
        k0Var.d(writer, customScalarAdapters, value.f());
        writer.M0("region");
        k0Var.d(writer, customScalarAdapters, value.i());
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001f, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r2);
        kotlin.jvm.internal.Intrinsics.f(r3);
        kotlin.jvm.internal.Intrinsics.f(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002e, code lost:
    
        return new x40.ni(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12);
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
            java.util.List r0 = y40.eh.f137035b
            int r0 = r14.V1(r0)
            switch(r0) {
                case 0: goto L93;
                case 1: goto L89;
                case 2: goto L7f;
                case 3: goto L75;
                case 4: goto L6b;
                case 5: goto L61;
                case 6: goto L57;
                case 7: goto L4d;
                case 8: goto L43;
                case 9: goto L39;
                case 10: goto L2f;
                default: goto L1f;
            }
        L1f:
            x40.ni r14 = new x40.ni
            kotlin.jvm.internal.Intrinsics.f(r2)
            kotlin.jvm.internal.Intrinsics.f(r3)
            kotlin.jvm.internal.Intrinsics.f(r4)
            r1 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r14
        L2f:
            pc.k0 r0 = pc.c.f99524e
            java.lang.Object r0 = r0.f(r14, r15)
            r12 = r0
            java.lang.String r12 = (java.lang.String) r12
            goto L16
        L39:
            pc.k0 r0 = pc.c.f99524e
            java.lang.Object r0 = r0.f(r14, r15)
            r11 = r0
            java.lang.String r11 = (java.lang.String) r11
            goto L16
        L43:
            pc.k0 r0 = pc.c.f99525f
            java.lang.Object r0 = r0.f(r14, r15)
            r10 = r0
            java.lang.Double r10 = (java.lang.Double) r10
            goto L16
        L4d:
            pc.k0 r0 = pc.c.f99525f
            java.lang.Object r0 = r0.f(r14, r15)
            r9 = r0
            java.lang.Double r9 = (java.lang.Double) r9
            goto L16
        L57:
            pc.k0 r0 = pc.c.f99524e
            java.lang.Object r0 = r0.f(r14, r15)
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8
            goto L16
        L61:
            pc.k0 r0 = pc.c.f99524e
            java.lang.Object r0 = r0.f(r14, r15)
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            goto L16
        L6b:
            pc.k0 r0 = pc.c.f99524e
            java.lang.Object r0 = r0.f(r14, r15)
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            goto L16
        L75:
            pc.k0 r0 = pc.c.f99524e
            java.lang.Object r0 = r0.f(r14, r15)
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
            goto L16
        L7f:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r14, r15)
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
            goto L16
        L89:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r14, r15)
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            goto L16
        L93:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r14, r15)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: y40.eh.f(tc.f, pc.v):java.lang.Object");
    }
}
