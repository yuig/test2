package e40;

import bz.h;
import c50.i3;
import c50.p1;
import c50.p2;
import c50.q1;
import c50.r1;
import c50.r2;
import c50.s4;
import c50.t;
import c50.v4;
import c50.x1;
import java.util.List;
import kotlin.collections.f0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import pc.m;
import pc.m0;
import pc.n;
import pc.o;
import pc.p;
import pc.r;
import t3.s1;

/* loaded from: classes5.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final List f57169a;

    /* renamed from: b, reason: collision with root package name */
    public static final List f57170b;

    /* renamed from: c, reason: collision with root package name */
    public static final List f57171c;

    /* renamed from: d, reason: collision with root package name */
    public static final List f57172d;

    /* renamed from: e, reason: collision with root package name */
    public static final List f57173e;

    /* renamed from: f, reason: collision with root package name */
    public static final List f57174f;

    /* renamed from: g, reason: collision with root package name */
    public static final List f57175g;

    /* renamed from: h, reason: collision with root package name */
    public static final List f57176h;

    static {
        a10.e eVar = r1.f26261a;
        r s13 = ep.b.s(eVar, "__typename", "name", "type");
        q0 q0Var = q0.f80391a;
        m mVar = new m("__typename", s13, null, q0Var, q0Var, q0Var);
        List q13 = ep.b.q("Pin", "Pin", "typeCondition", "possibleTypes");
        List selections = d.f57177a;
        Intrinsics.checkNotNullParameter(selections, "selections");
        List selections2 = f0.j(mVar, new n("Pin", q13, q0Var, selections));
        f57169a = selections2;
        m mVar2 = new m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        List q14 = ep.b.q("User", "User", "typeCondition", "possibleTypes");
        List selections3 = f.f57179a;
        Intrinsics.checkNotNullParameter(selections3, "selections");
        List selections4 = f0.j(mVar2, new n("User", q14, q0Var, selections3));
        f57170b = selections4;
        m mVar3 = new m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        List q15 = ep.b.q("Interest", "Interest", "typeCondition", "possibleTypes");
        List selections5 = b.f57168a;
        Intrinsics.checkNotNullParameter(selections5, "selections");
        List selections6 = f0.j(mVar3, new n("Interest", q15, q0Var, selections5));
        f57171c = selections6;
        m mVar4 = new m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        List q16 = ep.b.q("UserDidItData", "UserDidItData", "typeCondition", "possibleTypes");
        List selections7 = e.f57178a;
        Intrinsics.checkNotNullParameter(selections7, "selections");
        List selections8 = f0.j(mVar4, new n("UserDidItData", q16, q0Var, selections7));
        f57172d = selections8;
        m mVar5 = new m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        List q17 = ep.b.q("Board", "Board", "typeCondition", "possibleTypes");
        List selections9 = a.f57167a;
        Intrinsics.checkNotNullParameter(selections9, "selections");
        List selections10 = f0.j(mVar5, new n("Board", q17, q0Var, selections9));
        f57173e = selections10;
        p type = o.a(o.b(i3.f26061a.a()));
        Intrinsics.checkNotNullParameter("pins", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(selections2, "selections");
        m mVar6 = new m("pins", type, null, q0Var, q0Var, selections2);
        p type2 = o.a(o.b(s4.f26288a.a()));
        Intrinsics.checkNotNullParameter("users", "name");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(selections4, "selections");
        m mVar7 = new m("users", type2, null, q0Var, q0Var, selections4);
        p type3 = o.a(o.b(x1.f26437a.n()));
        Intrinsics.checkNotNullParameter("interests", "name");
        Intrinsics.checkNotNullParameter(type3, "type");
        Intrinsics.checkNotNullParameter(selections6, "selections");
        m mVar8 = new m("interests", type3, null, q0Var, q0Var, selections6);
        p type4 = o.a(o.b(v4.f26400a.z()));
        Intrinsics.checkNotNullParameter("usersDidItData", "name");
        Intrinsics.checkNotNullParameter(type4, "type");
        Intrinsics.checkNotNullParameter(selections8, "selections");
        m mVar9 = new m("usersDidItData", type4, null, q0Var, q0Var, selections8);
        p type5 = o.a(o.b(t.f26300a.d()));
        Intrinsics.checkNotNullParameter("boards", "name");
        Intrinsics.checkNotNullParameter(type5, "type");
        Intrinsics.checkNotNullParameter(selections10, "selections");
        List selections11 = f0.j(mVar6, mVar7, mVar8, mVar9, new m("boards", type5, null, q0Var, q0Var, selections10));
        f57174f = selections11;
        m mVar10 = new m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        List q18 = ep.b.q("NewsTextMapping", "NewsTextMapping", "typeCondition", "possibleTypes");
        List selections12 = g.f57180a;
        Intrinsics.checkNotNullParameter(selections12, "selections");
        List selections13 = f0.j(mVar10, new n("NewsTextMapping", q18, q0Var, selections12));
        f57175g = selections13;
        m mVar11 = new m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        m mVar12 = new m("id", s1.g(p1.f26217a, "id", "name", "type"), null, q0Var, q0Var, q0Var);
        m mVar13 = new m("entityId", ep.b.s(eVar, "entityId", "name", "type"), null, q0Var, q0Var, q0Var);
        h hVar = q1.f26239a;
        m mVar14 = new m("displayMode", ep.b.u(hVar, "displayMode", "name", "type"), null, q0Var, q0Var, q0Var);
        m mVar15 = new m("encodedDisplayMode", ep.b.u(hVar, "encodedDisplayMode", "name", "type"), null, q0Var, q0Var, q0Var);
        m mVar16 = new m("detailHeader", n60.o.l(eVar, "detailHeader", "name", "type"), null, q0Var, q0Var, q0Var);
        m mVar17 = new m("headerText", n60.o.l(eVar, "headerText", "name", "type"), null, q0Var, q0Var, q0Var);
        p type6 = o.a(o.b(eVar.y()));
        Intrinsics.checkNotNullParameter("headerIconObjectIds", "name");
        Intrinsics.checkNotNullParameter(type6, "type");
        m mVar18 = new m("headerIconObjectIds", type6, null, q0Var, q0Var, q0Var);
        m0 type7 = p2.f26219a.n();
        Intrinsics.checkNotNullParameter("objectMap", "name");
        Intrinsics.checkNotNullParameter(type7, "type");
        Intrinsics.checkNotNullParameter(selections11, "selections");
        m mVar19 = new m("objectMap", type7, null, q0Var, q0Var, selections11);
        p type8 = o.a(o.b(r2.f26263a.n()));
        Intrinsics.checkNotNullParameter("textMapping", "name");
        Intrinsics.checkNotNullParameter(type8, "type");
        Intrinsics.checkNotNullParameter(selections13, "selections");
        f57176h = f0.j(mVar11, mVar12, mVar13, mVar14, mVar15, mVar16, mVar17, mVar18, mVar19, new m("textMapping", type8, null, q0Var, q0Var, selections13), new m("newsType", ep.b.u(hVar, "newsType", "name", "type"), null, q0Var, q0Var, q0Var));
    }
}
