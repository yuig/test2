package a50;

import c50.n1;
import c50.o4;
import c50.oa;
import c50.p1;
import c50.q1;
import c50.r1;
import com.appsflyer.AdRevenueScheme;
import java.util.List;
import kotlin.collections.f0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import pc.m0;
import pc.w;
import t3.s1;
import zy.b0;

/* loaded from: classes5.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final List f778a;

    /* renamed from: b, reason: collision with root package name */
    public static final List f779b;

    /* renamed from: c, reason: collision with root package name */
    public static final List f780c;

    static {
        a10.e eVar = r1.f26261a;
        pc.r s13 = ep.b.s(eVar, "__typename", "name", "type");
        q0 q0Var = q0.f80391a;
        pc.m mVar = new pc.m("__typename", s13, null, q0Var, q0Var, q0Var);
        List q13 = ep.b.q("VerifiedIdentity", "VerifiedIdentity", "typeCondition", "possibleTypes");
        List selections = t.f781a;
        Intrinsics.checkNotNullParameter(selections, "selections");
        List selections2 = f0.j(mVar, new pc.n("VerifiedIdentity", q13, q0Var, selections));
        f778a = selections2;
        pc.m mVar2 = new pc.m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        List q14 = ep.b.q("BizPartner", "BizPartner", "typeCondition", "possibleTypes");
        List selections3 = a.f714b;
        Intrinsics.checkNotNullParameter(selections3, "selections");
        List selections4 = f0.j(mVar2, new pc.n("BizPartner", q14, q0Var, selections3));
        f779b = selections4;
        pc.m mVar3 = new pc.m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        pc.m mVar4 = new pc.m("id", s1.g(p1.f26217a, "id", "name", "type"), null, q0Var, q0Var, q0Var);
        pc.m mVar5 = new pc.m("entityId", ep.b.s(eVar, "entityId", "name", "type"), null, q0Var, q0Var, q0Var);
        pc.m mVar6 = new pc.m("firstName", n60.o.l(eVar, "firstName", "name", "type"), null, q0Var, q0Var, q0Var);
        pc.m mVar7 = new pc.m("lastName", n60.o.l(eVar, "lastName", "name", "type"), null, q0Var, q0Var, q0Var);
        pc.m mVar8 = new pc.m("fullName", n60.o.l(eVar, "fullName", "name", "type"), null, q0Var, q0Var, q0Var);
        pc.m mVar9 = new pc.m("username", n60.o.l(eVar, "username", "name", "type"), null, q0Var, q0Var, q0Var);
        w type = q1.f26239a.i();
        Intrinsics.checkNotNullParameter("ageInYears", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        pc.m mVar10 = new pc.m("ageInYears", type, null, q0Var, q0Var, q0Var);
        pc.m mVar11 = new pc.m("email", n60.o.l(eVar, "email", "name", "type"), null, q0Var, q0Var, q0Var);
        a10.e eVar2 = o4.f26199a;
        pc.m mVar12 = new pc.m("imageLargeUrl", n60.o.l(eVar2, "imageLargeUrl", "name", "type"), null, q0Var, q0Var, q0Var);
        b0 b0Var = n1.f26170a;
        pc.m mVar13 = new pc.m("isPartner", n60.o.m(b0Var, "isPartner", "name", "type"), null, q0Var, q0Var, q0Var);
        pc.m mVar14 = new pc.m("isVerifiedMerchant", n60.o.m(b0Var, "isVerifiedMerchant", "name", "type"), null, q0Var, q0Var, q0Var);
        pc.m mVar15 = new pc.m("websiteUrl", n60.o.l(eVar2, "websiteUrl", "name", "type"), null, q0Var, q0Var, q0Var);
        pc.m mVar16 = new pc.m("about", n60.o.l(eVar, "about", "name", "type"), null, q0Var, q0Var, q0Var);
        pc.p type2 = pc.o.a(pc.o.b(eVar.y()));
        Intrinsics.checkNotNullParameter("pronouns", "name");
        Intrinsics.checkNotNullParameter(type2, "type");
        pc.m mVar17 = new pc.m("pronouns", type2, null, q0Var, q0Var, q0Var);
        m0 v13 = ep.b.v(oa.f26211a, "verifiedIdentity", "name", "type");
        Intrinsics.checkNotNullParameter(selections2, "selections");
        pc.m mVar18 = new pc.m("verifiedIdentity", v13, null, q0Var, q0Var, selections2);
        pc.m mVar19 = new pc.m(AdRevenueScheme.COUNTRY, n60.o.l(eVar, AdRevenueScheme.COUNTRY, "name", "type"), null, q0Var, q0Var, q0Var);
        m0 type3 = c50.s.f26279a.j();
        Intrinsics.checkNotNullParameter("bizPartner", "name");
        Intrinsics.checkNotNullParameter(type3, "type");
        Intrinsics.checkNotNullParameter(selections4, "selections");
        f780c = f0.j(mVar3, mVar4, mVar5, mVar6, mVar7, mVar8, mVar9, mVar10, mVar11, mVar12, mVar13, mVar14, mVar15, mVar16, mVar17, mVar18, mVar19, new pc.m("bizPartner", type3, null, q0Var, q0Var, selections4), new pc.m("showAllPins", n60.o.m(b0Var, "showAllPins", "name", "type"), null, q0Var, q0Var, q0Var));
    }
}
