package a50;

import c50.i3;
import c50.k4;
import c50.p1;
import c50.r1;
import c50.s4;
import java.util.List;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import pc.m0;
import t3.s1;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final List f774a;

    /* renamed from: b, reason: collision with root package name */
    public static final List f775b;

    /* renamed from: c, reason: collision with root package name */
    public static final List f776c;

    /* renamed from: d, reason: collision with root package name */
    public static final List f777d;

    static {
        a10.e eVar = r1.f26261a;
        pc.r s13 = ep.b.s(eVar, "__typename", "name", "type");
        q0 q0Var = q0.f80391a;
        pc.m mVar = new pc.m("__typename", s13, null, q0Var, q0Var, q0Var);
        List q13 = ep.b.q("User", "User", "typeCondition", "possibleTypes");
        List selections = q.f773b;
        Intrinsics.checkNotNullParameter(selections, "selections");
        List selections2 = f0.j(mVar, new pc.n("User", q13, q0Var, selections));
        f774a = selections2;
        pc.m mVar2 = new pc.m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        List q14 = ep.b.q("Pin", "Pin", "typeCondition", "possibleTypes");
        List selections3 = m.f759l;
        Intrinsics.checkNotNullParameter(selections3, "selections");
        List selections4 = f0.j(mVar2, new pc.n("Pin", q14, q0Var, selections3));
        f775b = selections4;
        List selections5 = e0.b(new pc.m("url", n60.o.l(eVar, "url", "name", "type"), null, q0Var, q0Var, q0Var));
        f776c = selections5;
        pc.m mVar3 = new pc.m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        pc.m mVar4 = new pc.m("id", s1.g(p1.f26217a, "id", "name", "type"), null, q0Var, q0Var, q0Var);
        pc.m mVar5 = new pc.m("entityId", ep.b.s(eVar, "entityId", "name", "type"), null, q0Var, q0Var, q0Var);
        m0 w13 = ep.b.w(s4.f26288a, "user", "name", "type");
        Intrinsics.checkNotNullParameter(selections2, "selections");
        pc.m mVar6 = new pc.m("user", w13, null, q0Var, q0Var, selections2);
        m0 w14 = ep.b.w(i3.f26061a, "pin", "name", "type");
        Intrinsics.checkNotNullParameter(selections4, "selections");
        pc.m mVar7 = new pc.m("pin", w14, null, q0Var, q0Var, selections4);
        pc.m mVar8 = new pc.m("details", n60.o.l(eVar, "details", "name", "type"), null, q0Var, q0Var, q0Var);
        pc.p type = pc.o.a(pc.o.b(k4.f26108a.z()));
        Intrinsics.checkNotNullParameter("images", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        List r13 = ep.b.r("spec", ep.b.t("imageSpec", "spec", "name"), false, "arguments");
        Intrinsics.checkNotNullParameter(selections5, "selections");
        f777d = f0.j(mVar3, mVar4, mVar5, mVar6, mVar7, mVar8, new pc.m("images", type, null, q0Var, r13, selections5));
    }
}
