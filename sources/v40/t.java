package v40;

import com.appsflyer.AdRevenueScheme;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final t f124089a = new t();

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        u40.u value = (u40.u) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!(value instanceof u40.z)) {
            if (value instanceof u40.v) {
                List list = u.f124091a;
                u40.v value2 = (u40.v) value;
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
                Intrinsics.checkNotNullParameter(value2, "value");
                writer.M0("__typename");
                pc.c.f99520a.d(writer, customScalarAdapters, value2.f120427a);
                return;
            }
            return;
        }
        List list2 = y.f124106a;
        u40.z value3 = (u40.z) value;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value3, "value");
        writer.M0("__typename");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, value3.f120450a);
        writer.M0("id");
        eVar.d(writer, customScalarAdapters, value3.f120451b);
        writer.M0("entityId");
        eVar.d(writer, customScalarAdapters, value3.f120452c);
        writer.M0("firstName");
        pc.k0 k0Var = pc.c.f99524e;
        k0Var.d(writer, customScalarAdapters, value3.f120453d);
        writer.M0("lastName");
        k0Var.d(writer, customScalarAdapters, value3.f120454e);
        writer.M0("fullName");
        k0Var.d(writer, customScalarAdapters, value3.f120455f);
        writer.M0("username");
        k0Var.d(writer, customScalarAdapters, value3.f120456g);
        writer.M0("ageInYears");
        pc.c.f99526g.d(writer, customScalarAdapters, value3.f120457h);
        writer.M0("email");
        k0Var.d(writer, customScalarAdapters, value3.f120458i);
        writer.M0("imageLargeUrl");
        pc.c.b(eVar).d(writer, customScalarAdapters, value3.f120459j);
        writer.M0("isPartner");
        pc.k0 k0Var2 = pc.c.f99527h;
        k0Var2.d(writer, customScalarAdapters, value3.f120460k);
        writer.M0("isVerifiedMerchant");
        k0Var2.d(writer, customScalarAdapters, value3.f120461l);
        writer.M0("websiteUrl");
        pc.c.b(eVar).d(writer, customScalarAdapters, value3.f120462m);
        writer.M0("about");
        k0Var.d(writer, customScalarAdapters, value3.f120463n);
        writer.M0("pronouns");
        pc.c.b(pc.c.a(eVar)).d(writer, customScalarAdapters, value3.f120464o);
        writer.M0("verifiedIdentity");
        pc.c.b(pc.c.c(x.f124102a)).d(writer, customScalarAdapters, value3.f120465p);
        writer.M0(AdRevenueScheme.COUNTRY);
        k0Var.d(writer, customScalarAdapters, value3.f120466q);
        writer.M0("bizPartner");
        pc.c.b(pc.c.c(w.f124098a)).d(writer, customScalarAdapters, value3.f120467r);
        writer.M0("showAllPins");
        k0Var2.d(writer, customScalarAdapters, value3.f120468s);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0047, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r6);
        kotlin.jvm.internal.Intrinsics.f(r7);
        kotlin.jvm.internal.Intrinsics.f(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:?, code lost:
    
        return new u40.z(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24);
     */
    @Override // pc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(tc.f r26, pc.v r27) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v40.t.f(tc.f, pc.v):java.lang.Object");
    }
}
