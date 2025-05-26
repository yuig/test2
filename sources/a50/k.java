package a50;

import c50.n1;
import c50.o4;
import c50.oa;
import c50.p1;
import c50.q1;
import c50.r1;
import c50.v1;
import java.util.List;
import kotlin.collections.f0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import pc.m0;
import t3.s1;
import zy.b0;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final List f743a;

    /* renamed from: b, reason: collision with root package name */
    public static final List f744b;

    /* renamed from: c, reason: collision with root package name */
    public static final List f745c;

    /* renamed from: d, reason: collision with root package name */
    public static final List f746d;

    static {
        a10.e eVar = r1.f26261a;
        pc.r s13 = ep.b.s(eVar, "__typename", "name", "type");
        q0 q0Var = q0.f80391a;
        pc.m mVar = new pc.m("__typename", s13, null, q0Var, q0Var, q0Var);
        List q13 = ep.b.q("VerifiedIdentity", "VerifiedIdentity", "typeCondition", "possibleTypes");
        List selections = t.f781a;
        Intrinsics.checkNotNullParameter(selections, "selections");
        List selections2 = f0.j(mVar, new pc.n("VerifiedIdentity", q13, q0Var, selections));
        f743a = selections2;
        pc.m mVar2 = new pc.m("dominantColor", n60.o.l(eVar, "dominantColor", "name", "type"), null, q0Var, q0Var, q0Var);
        bz.h hVar = q1.f26239a;
        List selections3 = f0.j(mVar2, new pc.m("height", ep.b.u(hVar, "height", "name", "type"), null, q0Var, q0Var, q0Var), new pc.m("type", n60.o.l(eVar, "type", "name", "type"), null, q0Var, q0Var, q0Var), new pc.m("url", n60.o.l(eVar, "url", "name", "type"), null, q0Var, q0Var, q0Var), new pc.m("width", ep.b.u(hVar, "width", "name", "type"), null, q0Var, q0Var, q0Var));
        f744b = selections3;
        List selections4 = f0.j(new pc.m("dominantColor", n60.o.l(eVar, "dominantColor", "name", "type"), null, q0Var, q0Var, q0Var), new pc.m("height", ep.b.u(hVar, "height", "name", "type"), null, q0Var, q0Var, q0Var), new pc.m("type", n60.o.l(eVar, "type", "name", "type"), null, q0Var, q0Var, q0Var), new pc.m("url", n60.o.l(eVar, "url", "name", "type"), null, q0Var, q0Var, q0Var), new pc.m("width", ep.b.u(hVar, "width", "name", "type"), null, q0Var, q0Var, q0Var));
        f745c = selections4;
        pc.r type = pc.o.b(eVar.y());
        Intrinsics.checkNotNullParameter("__typename", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        pc.m mVar3 = new pc.m("__typename", type, null, q0Var, q0Var, q0Var);
        pc.m mVar4 = new pc.m("id", s1.g(p1.f26217a, "id", "name", "type"), null, q0Var, q0Var, q0Var);
        pc.m mVar5 = new pc.m("entityId", ep.b.s(eVar, "entityId", "name", "type"), null, q0Var, q0Var, q0Var);
        b0 b0Var = n1.f26170a;
        pc.m mVar6 = new pc.m("explicitlyFollowedByMe", n60.o.m(b0Var, "explicitlyFollowedByMe", "name", "type"), null, q0Var, q0Var, q0Var);
        pc.m mVar7 = new pc.m("followerCount", ep.b.u(hVar, "followerCount", "name", "type"), null, q0Var, q0Var, q0Var);
        pc.m mVar8 = new pc.m("fullName", n60.o.l(eVar, "fullName", "name", "type"), null, q0Var, q0Var, q0Var);
        pc.m mVar9 = new pc.m("imageMediumUrl", n60.o.l(o4.f26199a, "imageMediumUrl", "name", "type"), null, q0Var, q0Var, q0Var);
        pc.m mVar10 = new pc.m("username", n60.o.l(eVar, "username", "name", "type"), null, q0Var, q0Var, q0Var);
        pc.m mVar11 = new pc.m("isVerifiedMerchant", n60.o.m(b0Var, "isVerifiedMerchant", "name", "type"), null, q0Var, q0Var, q0Var);
        pc.m mVar12 = new pc.m("blockedByMe", n60.o.m(b0Var, "blockedByMe", "name", "type"), null, q0Var, q0Var, q0Var);
        pc.m mVar13 = new pc.m("isPrivateProfile", n60.o.m(b0Var, "isPrivateProfile", "name", "type"), null, q0Var, q0Var, q0Var);
        m0 v13 = ep.b.v(oa.f26211a, "verifiedIdentity", "name", "type");
        Intrinsics.checkNotNullParameter(selections2, "selections");
        pc.m mVar14 = new pc.m("verifiedIdentity", v13, null, q0Var, q0Var, selections2);
        a10.e eVar2 = v1.f26394a;
        pc.p type2 = pc.o.a(pc.o.b(eVar2.z()));
        Intrinsics.checkNotNullParameter("contextualPinImageUrls", "name");
        Intrinsics.checkNotNullParameter(type2, "type");
        pc.t tVar = new pc.t("imageSpec");
        Intrinsics.checkNotNullParameter("spec", "name");
        List r13 = ep.b.r("spec", tVar, false, "arguments");
        Intrinsics.checkNotNullParameter(selections3, "selections");
        pc.m mVar15 = new pc.m("contextualPinImageUrls", type2, null, q0Var, r13, selections3);
        pc.p type3 = pc.o.a(pc.o.b(eVar2.z()));
        Intrinsics.checkNotNullParameter("recentPinImages", "name");
        Intrinsics.checkNotNullParameter(type3, "type");
        List r14 = ep.b.r("spec", ep.b.t("imageSpec", "spec", "name"), false, "arguments");
        Intrinsics.checkNotNullParameter(selections4, "selections");
        f746d = f0.j(mVar3, mVar4, mVar5, mVar6, mVar7, mVar8, mVar9, mVar10, mVar11, mVar12, mVar13, mVar14, mVar15, new pc.m("recentPinImages", type3, null, q0Var, r14, selections4), new pc.m("showCreatorProfile", n60.o.m(b0Var, "showCreatorProfile", "name", "type"), null, q0Var, q0Var, q0Var));
    }
}
