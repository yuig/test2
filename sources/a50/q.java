package a50;

import c50.n1;
import c50.o4;
import c50.oa;
import c50.p1;
import c50.q1;
import c50.r1;
import java.util.List;
import kotlin.collections.f0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import pc.m0;
import pc.w;
import t3.s1;
import zy.b0;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final List f772a;

    /* renamed from: b, reason: collision with root package name */
    public static final List f773b;

    static {
        a10.e eVar = r1.f26261a;
        pc.r s13 = ep.b.s(eVar, "__typename", "name", "type");
        q0 q0Var = q0.f80391a;
        pc.m mVar = new pc.m("__typename", s13, null, q0Var, q0Var, q0Var);
        b0 b0Var = n1.f26170a;
        List selections = f0.j(mVar, new pc.m("verified", n60.o.m(b0Var, "verified", "name", "type"), null, q0Var, q0Var, q0Var));
        f772a = selections;
        pc.m mVar2 = new pc.m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        pc.m mVar3 = new pc.m("id", s1.g(p1.f26217a, "id", "name", "type"), null, q0Var, q0Var, q0Var);
        pc.m mVar4 = new pc.m("entityId", ep.b.s(eVar, "entityId", "name", "type"), null, q0Var, q0Var, q0Var);
        m0 v13 = ep.b.v(oa.f26211a, "verifiedIdentity", "name", "type");
        Intrinsics.checkNotNullParameter(selections, "selections");
        pc.m mVar5 = new pc.m("verifiedIdentity", v13, null, q0Var, q0Var, selections);
        pc.m mVar6 = new pc.m("blockedByMe", n60.o.m(b0Var, "blockedByMe", "name", "type"), null, q0Var, q0Var, q0Var);
        pc.m mVar7 = new pc.m("isVerifiedMerchant", n60.o.m(b0Var, "isVerifiedMerchant", "name", "type"), null, q0Var, q0Var, q0Var);
        pc.m mVar8 = new pc.m("isDefaultImage", n60.o.m(b0Var, "isDefaultImage", "name", "type"), null, q0Var, q0Var, q0Var);
        a10.e eVar2 = o4.f26199a;
        pc.m mVar9 = new pc.m("imageXlargeUrl", n60.o.l(eVar2, "imageXlargeUrl", "name", "type"), null, q0Var, q0Var, q0Var);
        pc.m mVar10 = new pc.m("imageLargeUrl", n60.o.l(eVar2, "imageLargeUrl", "name", "type"), null, q0Var, q0Var, q0Var);
        pc.m mVar11 = new pc.m("imageMediumUrl", n60.o.l(eVar2, "imageMediumUrl", "name", "type"), null, q0Var, q0Var, q0Var);
        w type = eVar2.y();
        Intrinsics.checkNotNullParameter("imageSmallUrl", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        pc.m mVar12 = new pc.m("imageSmallUrl", type, null, q0Var, q0Var, q0Var);
        pc.m mVar13 = new pc.m("firstName", n60.o.l(eVar, "firstName", "name", "type"), null, q0Var, q0Var, q0Var);
        pc.m mVar14 = new pc.m("lastName", n60.o.l(eVar, "lastName", "name", "type"), null, q0Var, q0Var, q0Var);
        pc.m mVar15 = new pc.m("fullName", n60.o.l(eVar, "fullName", "name", "type"), null, q0Var, q0Var, q0Var);
        pc.m mVar16 = new pc.m("username", n60.o.l(eVar, "username", "name", "type"), null, q0Var, q0Var, q0Var);
        bz.h hVar = q1.f26239a;
        f773b = f0.j(mVar2, mVar3, mVar4, mVar5, mVar6, mVar7, mVar8, mVar9, mVar10, mVar11, mVar12, mVar13, mVar14, mVar15, mVar16, new pc.m("followerCount", ep.b.u(hVar, "followerCount", "name", "type"), null, q0Var, q0Var, q0Var), new pc.m("followingCount", ep.b.u(hVar, "followingCount", "name", "type"), null, q0Var, q0Var, q0Var), new pc.m("explicitlyFollowedByMe", n60.o.m(b0Var, "explicitlyFollowedByMe", "name", "type"), null, q0Var, q0Var, q0Var), new pc.m("isPrivateProfile", n60.o.m(b0Var, "isPrivateProfile", "name", "type"), null, q0Var, q0Var, q0Var), new pc.m("avatarColorIndex", ep.b.u(hVar, "avatarColorIndex", "name", "type"), null, q0Var, q0Var, q0Var));
    }
}
