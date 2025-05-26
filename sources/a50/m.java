package a50;

import c50.d4;
import c50.e4;
import c50.g1;
import c50.n1;
import c50.n3;
import c50.o3;
import c50.o4;
import c50.p1;
import c50.p3;
import c50.q1;
import c50.r1;
import c50.s4;
import c50.t1;
import c50.w1;
import java.util.List;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import pc.m0;
import t3.s1;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final List f748a;

    /* renamed from: b, reason: collision with root package name */
    public static final List f749b;

    /* renamed from: c, reason: collision with root package name */
    public static final List f750c;

    /* renamed from: d, reason: collision with root package name */
    public static final List f751d;

    /* renamed from: e, reason: collision with root package name */
    public static final List f752e;

    /* renamed from: f, reason: collision with root package name */
    public static final List f753f;

    /* renamed from: g, reason: collision with root package name */
    public static final List f754g;

    /* renamed from: h, reason: collision with root package name */
    public static final List f755h;

    /* renamed from: i, reason: collision with root package name */
    public static final List f756i;

    /* renamed from: j, reason: collision with root package name */
    public static final List f757j;

    /* renamed from: k, reason: collision with root package name */
    public static final List f758k;

    /* renamed from: l, reason: collision with root package name */
    public static final List f759l;

    static {
        a10.e eVar = r1.f26261a;
        pc.r s13 = ep.b.s(eVar, "__typename", "name", "type");
        q0 q0Var = q0.f80391a;
        List selections = e0.b(new pc.m("__typename", s13, null, q0Var, q0Var, q0Var));
        f748a = selections;
        List selections2 = e0.b(new pc.m("compatibleVersion", n60.o.l(eVar, "compatibleVersion", "name", "type"), null, q0Var, q0Var, q0Var));
        f749b = selections2;
        bz.h hVar = q1.f26239a;
        pc.m mVar = new pc.m("pageCount", ep.b.u(hVar, "pageCount", "name", "type"), null, q0Var, q0Var, q0Var);
        m0 v13 = ep.b.v(e4.f25970a, "metadata", "name", "type");
        Intrinsics.checkNotNullParameter(selections2, "selections");
        List selections3 = f0.j(mVar, new pc.m("metadata", v13, null, q0Var, q0Var, selections2), new pc.m("isDeleted", n60.o.m(n1.f26170a, "isDeleted", "name", "type"), null, q0Var, q0Var, q0Var));
        f750c = selections3;
        pc.m mVar2 = new pc.m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        List q13 = ep.b.q("User", "User", "typeCondition", "possibleTypes");
        List selections4 = q.f773b;
        Intrinsics.checkNotNullParameter(selections4, "selections");
        List selections5 = f0.j(mVar2, new pc.n("User", q13, q0Var, selections4));
        f751d = selections5;
        List selections6 = f0.j(new pc.m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var), new pc.m("type", n60.o.l(eVar, "type", "name", "type"), null, q0Var, q0Var, q0Var), new pc.m("src", n60.o.l(eVar, "src", "name", "type"), null, q0Var, q0Var, q0Var));
        f752e = selections6;
        List selections7 = e0.b(new pc.m("itemId", n60.o.l(eVar, "itemId", "name", "type"), null, q0Var, q0Var, q0Var));
        f753f = selections7;
        a10.e eVar2 = p3.f26221a;
        pc.p type = pc.o.a(pc.o.b(eVar2.z()));
        Intrinsics.checkNotNullParameter("products", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(selections7, "selections");
        List selections8 = f0.j(new pc.m("products", type, null, q0Var, q0Var, selections7), new pc.m("typeName", n60.o.l(eVar, "typeName", "name", "type"), null, q0Var, q0Var, q0Var), new pc.m("displayName", n60.o.l(eVar, "displayName", "name", "type"), null, q0Var, q0Var, q0Var));
        f754g = selections8;
        List selections9 = e0.b(new pc.m("itemId", n60.o.l(eVar, "itemId", "name", "type"), null, q0Var, q0Var, q0Var));
        f755h = selections9;
        pc.p type2 = pc.o.a(pc.o.b(eVar2.z()));
        Intrinsics.checkNotNullParameter("products", "name");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(selections9, "selections");
        List selections10 = e0.b(new pc.m("products", type2, null, q0Var, q0Var, selections9));
        f756i = selections10;
        List selections11 = f0.j(new pc.m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var), new pc.m("width", ep.b.u(hVar, "width", "name", "type"), null, q0Var, q0Var, q0Var), new pc.m("height", ep.b.u(hVar, "height", "name", "type"), null, q0Var, q0Var, q0Var));
        f757j = selections11;
        List selections12 = f0.j(new pc.m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var), new pc.m("width", ep.b.u(hVar, "width", "name", "type"), null, q0Var, q0Var, q0Var), new pc.m("height", ep.b.u(hVar, "height", "name", "type"), null, q0Var, q0Var, q0Var));
        f758k = selections12;
        pc.r type3 = pc.o.b(eVar.y());
        Intrinsics.checkNotNullParameter("__typename", "name");
        Intrinsics.checkNotNullParameter(type3, "type");
        pc.m mVar3 = new pc.m("__typename", type3, null, q0Var, q0Var, q0Var);
        pc.m mVar4 = new pc.m("id", s1.g(p1.f26217a, "id", "name", "type"), null, q0Var, q0Var, q0Var);
        pc.m mVar5 = new pc.m("title", n60.o.l(eVar, "title", "name", "type"), null, q0Var, q0Var, q0Var);
        pc.m mVar6 = new pc.m("entityId", ep.b.s(eVar, "entityId", "name", "type"), null, q0Var, q0Var, q0Var);
        m0 type4 = c50.t.f26300a.d();
        Intrinsics.checkNotNullParameter("pinnedToBoard", "name");
        Intrinsics.checkNotNullParameter(type4, "type");
        Intrinsics.checkNotNullParameter(selections, "selections");
        pc.m mVar7 = new pc.m("pinnedToBoard", type4, null, q0Var, q0Var, selections);
        m0 w13 = ep.b.w(d4.f25946a, "storyPinData", "name", "type");
        Intrinsics.checkNotNullParameter(selections3, "selections");
        pc.m mVar8 = new pc.m("storyPinData", w13, null, q0Var, q0Var, selections3);
        m0 w14 = ep.b.w(s4.f26288a, "pinner", "name", "type");
        Intrinsics.checkNotNullParameter(selections5, "selections");
        pc.m mVar9 = new pc.m("pinner", w14, null, q0Var, q0Var, selections5);
        pc.m mVar10 = new pc.m("storyPinDataId", n60.o.l(eVar, "storyPinDataId", "name", "type"), null, q0Var, q0Var, q0Var);
        m0 type5 = g1.f26011a.d();
        Intrinsics.checkNotNullParameter("embed", "name");
        Intrinsics.checkNotNullParameter(type5, "type");
        Intrinsics.checkNotNullParameter(selections6, "selections");
        pc.m mVar11 = new pc.m("embed", type5, null, q0Var, q0Var, selections6);
        m0 w15 = ep.b.w(o3.f26197a, "richSummary", "name", "type");
        Intrinsics.checkNotNullParameter(selections8, "selections");
        pc.m mVar12 = new pc.m("richSummary", w15, null, q0Var, q0Var, selections8);
        m0 v14 = ep.b.v(n3.f26174a, "richMetadata", "name", "type");
        Intrinsics.checkNotNullParameter(selections10, "selections");
        pc.m mVar13 = new pc.m("richMetadata", v14, null, q0Var, q0Var, selections10);
        t1 t1Var = w1.f26416a;
        m0 w16 = ep.b.w(t1Var, "imageMediumSizePixels", "name", "type");
        Intrinsics.checkNotNullParameter(selections11, "selections");
        pc.m mVar14 = new pc.m("imageMediumSizePixels", w16, null, q0Var, q0Var, selections11);
        m0 w17 = ep.b.w(t1Var, "imageLargeSizePixels", "name", "type");
        Intrinsics.checkNotNullParameter(selections12, "selections");
        pc.m mVar15 = new pc.m("imageLargeSizePixels", w17, null, q0Var, q0Var, selections12);
        pc.m mVar16 = new pc.m("imageSignature", n60.o.l(eVar, "imageSignature", "name", "type"), null, q0Var, q0Var, q0Var);
        pc.m mVar17 = new pc.m("commentCount", ep.b.u(hVar, "commentCount", "name", "type"), null, q0Var, q0Var, q0Var);
        a10.e eVar3 = o4.f26199a;
        f759l = f0.j(mVar3, mVar4, mVar5, mVar6, mVar7, mVar8, mVar9, mVar10, mVar11, mVar12, mVar13, mVar14, mVar15, mVar16, mVar17, new pc.m("imageMediumUrl", n60.o.l(eVar3, "imageMediumUrl", "name", "type"), null, q0Var, q0Var, q0Var), new pc.m("imageLargeUrl", n60.o.l(eVar3, "imageLargeUrl", "name", "type"), null, q0Var, q0Var, q0Var));
    }
}
