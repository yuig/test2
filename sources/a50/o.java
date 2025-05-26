package a50;

import c50.a1;
import c50.d4;
import c50.k5;
import c50.r1;
import c50.s4;
import c50.t1;
import java.util.List;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import pc.m0;

/* loaded from: classes5.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final List f763a;

    /* renamed from: b, reason: collision with root package name */
    public static final List f764b;

    /* renamed from: c, reason: collision with root package name */
    public static final List f765c;

    /* renamed from: d, reason: collision with root package name */
    public static final List f766d;

    /* renamed from: e, reason: collision with root package name */
    public static final List f767e;

    /* renamed from: f, reason: collision with root package name */
    public static final List f768f;

    /* renamed from: g, reason: collision with root package name */
    public static final List f769g;

    /* renamed from: h, reason: collision with root package name */
    public static final List f770h;

    static {
        a10.e eVar = r1.f26261a;
        pc.r s13 = ep.b.s(eVar, "__typename", "name", "type");
        q0 q0Var = q0.f80391a;
        pc.m mVar = new pc.m("__typename", s13, null, q0Var, q0Var, q0Var);
        List q13 = ep.b.q("StoryPinData", "StoryPinData", "typeCondition", "possibleTypes");
        List selections = p.f771a;
        Intrinsics.checkNotNullParameter(selections, "selections");
        List selections2 = f0.j(mVar, new pc.n("StoryPinData", q13, q0Var, selections));
        f763a = selections2;
        pc.m mVar2 = new pc.m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        List q14 = ep.b.q("User", "User", "typeCondition", "possibleTypes");
        List selections3 = q.f773b;
        Intrinsics.checkNotNullParameter(selections3, "selections");
        List selections4 = f0.j(mVar2, new pc.n("User", q14, q0Var, selections3));
        f764b = selections4;
        pc.m mVar3 = new pc.m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        List q15 = ep.b.q("User", "User", "typeCondition", "possibleTypes");
        Intrinsics.checkNotNullParameter(selections3, "selections");
        List selections5 = f0.j(mVar3, new pc.n("User", q15, q0Var, selections3));
        f765c = selections5;
        pc.m mVar4 = new pc.m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        List q16 = ep.b.q("User", "User", "typeCondition", "possibleTypes");
        Intrinsics.checkNotNullParameter(selections3, "selections");
        List selections6 = f0.j(mVar4, new pc.n("User", q16, q0Var, selections3));
        f766d = selections6;
        t1 t1Var = s4.f26288a;
        m0 w13 = ep.b.w(t1Var, "officialUser", "name", "type");
        Intrinsics.checkNotNullParameter(selections6, "selections");
        List selections7 = e0.b(new pc.m("officialUser", w13, null, q0Var, q0Var, selections6));
        f767e = selections7;
        pc.m mVar5 = new pc.m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        List q17 = ep.b.q("User", "User", "typeCondition", "possibleTypes");
        Intrinsics.checkNotNullParameter(selections3, "selections");
        List selections8 = f0.j(mVar5, new pc.n("User", q17, q0Var, selections3));
        f768f = selections8;
        m0 w14 = ep.b.w(t1Var, "officialUser", "name", "type");
        Intrinsics.checkNotNullParameter(selections8, "selections");
        List selections9 = e0.b(new pc.m("officialUser", w14, null, q0Var, q0Var, selections8));
        f769g = selections9;
        pc.m mVar6 = new pc.m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        List q18 = ep.b.q("Pin", "Pin", "typeCondition", "possibleTypes");
        List selections10 = m.f759l;
        Intrinsics.checkNotNullParameter(selections10, "selections");
        pc.n nVar = new pc.n("Pin", q18, q0Var, selections10);
        m0 w15 = ep.b.w(d4.f25946a, "storyPinData", "name", "type");
        Intrinsics.checkNotNullParameter(selections2, "selections");
        pc.m mVar7 = new pc.m("storyPinData", w15, null, q0Var, q0Var, selections2);
        m0 w16 = ep.b.w(t1Var, "nativeCreator", "name", "type");
        Intrinsics.checkNotNullParameter(selections4, "selections");
        pc.m mVar8 = new pc.m("nativeCreator", w16, null, q0Var, q0Var, selections4);
        m0 w17 = ep.b.w(t1Var, "thirdPartyPinOwner", "name", "type");
        Intrinsics.checkNotNullParameter(selections5, "selections");
        pc.m mVar9 = new pc.m("thirdPartyPinOwner", w17, null, q0Var, q0Var, selections5);
        m0 w18 = ep.b.w(k5.f26110a, "linkUserWebsite", "name", "type");
        Intrinsics.checkNotNullParameter(selections7, "selections");
        pc.m mVar10 = new pc.m("linkUserWebsite", w18, null, q0Var, q0Var, selections7);
        m0 type = a1.f25870a.j();
        Intrinsics.checkNotNullParameter("linkDomain", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(selections9, "selections");
        f770h = f0.j(mVar6, nVar, mVar7, mVar8, mVar9, mVar10, new pc.m("linkDomain", type, null, q0Var, q0Var, selections9));
    }
}
