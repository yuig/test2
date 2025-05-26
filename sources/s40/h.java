package s40;

import com.appsflyer.AdRevenueScheme;
import java.util.List;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import pc.k0;
import pc.v;

/* loaded from: classes5.dex */
public final class h implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final h f111123a = new h();

    /* renamed from: b, reason: collision with root package name */
    public static final List f111124b = f0.j("__typename", "id", "entityId", "firstName", "lastName", "fullName", "username", "ageInYears", "email", "imageLargeUrl", "isPartner", "isVerifiedMerchant", "websiteUrl", "about", "pronouns", "verifiedIdentity", AdRevenueScheme.COUNTRY, "bizPartner", "showAllPins");

    @Override // pc.a
    public final void d(tc.g writer, v customScalarAdapters, Object obj) {
        r40.h value = (r40.h) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, value.f106148a);
        writer.M0("id");
        eVar.d(writer, customScalarAdapters, value.f106149b);
        writer.M0("entityId");
        eVar.d(writer, customScalarAdapters, value.f106150c);
        writer.M0("firstName");
        k0 k0Var = pc.c.f99524e;
        k0Var.d(writer, customScalarAdapters, value.f106151d);
        writer.M0("lastName");
        k0Var.d(writer, customScalarAdapters, value.f106152e);
        writer.M0("fullName");
        k0Var.d(writer, customScalarAdapters, value.f106153f);
        writer.M0("username");
        k0Var.d(writer, customScalarAdapters, value.f106154g);
        writer.M0("ageInYears");
        pc.c.f99526g.d(writer, customScalarAdapters, value.f106155h);
        writer.M0("email");
        k0Var.d(writer, customScalarAdapters, value.f106156i);
        writer.M0("imageLargeUrl");
        pc.c.b(eVar).d(writer, customScalarAdapters, value.f106157j);
        writer.M0("isPartner");
        k0 k0Var2 = pc.c.f99527h;
        k0Var2.d(writer, customScalarAdapters, value.f106158k);
        writer.M0("isVerifiedMerchant");
        k0Var2.d(writer, customScalarAdapters, value.f106159l);
        writer.M0("websiteUrl");
        pc.c.b(eVar).d(writer, customScalarAdapters, value.f106160m);
        writer.M0("about");
        k0Var.d(writer, customScalarAdapters, value.f106161n);
        writer.M0("pronouns");
        pc.c.b(pc.c.a(eVar)).d(writer, customScalarAdapters, value.f106162o);
        writer.M0("verifiedIdentity");
        pc.c.b(pc.c.c(g.f111121a)).d(writer, customScalarAdapters, value.f106163p);
        writer.M0(AdRevenueScheme.COUNTRY);
        k0Var.d(writer, customScalarAdapters, value.f106164q);
        writer.M0("bizPartner");
        pc.c.b(pc.c.c(f.f111119a)).d(writer, customScalarAdapters, value.f106165r);
        writer.M0("showAllPins");
        k0Var2.d(writer, customScalarAdapters, value.f106166s);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0032, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r4);
        kotlin.jvm.internal.Intrinsics.f(r5);
        kotlin.jvm.internal.Intrinsics.f(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0041, code lost:
    
        return new r40.h(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22);
     */
    @Override // pc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(tc.f r24, pc.v r25) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s40.h.f(tc.f, pc.v):java.lang.Object");
    }
}
