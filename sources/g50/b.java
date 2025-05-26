package g50;

import a10.e;
import bz.h;
import c50.n1;
import c50.q1;
import c50.r1;
import c50.u2;
import c50.w2;
import c50.y2;
import c50.z2;
import java.util.List;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import pc.m;
import pc.m0;
import pc.o;
import pc.p;

/* loaded from: classes5.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final List f63554a;

    /* renamed from: b, reason: collision with root package name */
    public static final List f63555b;

    /* renamed from: c, reason: collision with root package name */
    public static final List f63556c;

    /* renamed from: d, reason: collision with root package name */
    public static final List f63557d;

    /* renamed from: e, reason: collision with root package name */
    public static final List f63558e;

    /* renamed from: f, reason: collision with root package name */
    public static final List f63559f;

    static {
        e eVar = r1.f26261a;
        p type = o.a(eVar.y());
        Intrinsics.checkNotNullParameter("backgroundColorHex", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        q0 q0Var = q0.f80391a;
        m mVar = new m("backgroundColorHex", type, null, q0Var, q0Var, q0Var);
        m mVar2 = new m("displayText", n60.o.l(eVar, "displayText", "name", "type"), null, q0Var, q0Var, q0Var);
        h hVar = q1.f26239a;
        m mVar3 = new m("icon", ep.b.u(hVar, "icon", "name", "type"), null, q0Var, q0Var, q0Var);
        m mVar4 = new m("iconUrl", n60.o.l(eVar, "iconUrl", "name", "type"), null, q0Var, q0Var, q0Var);
        p type2 = o.a(eVar.y());
        Intrinsics.checkNotNullParameter("selectedBackgroundColorHex", "name");
        Intrinsics.checkNotNullParameter(type2, "type");
        m mVar5 = new m("selectedBackgroundColorHex", type2, null, q0Var, q0Var, q0Var);
        p type3 = o.a(eVar.y());
        Intrinsics.checkNotNullParameter("selectedTextColorHex", "name");
        Intrinsics.checkNotNullParameter(type3, "type");
        m mVar6 = new m("selectedTextColorHex", type3, null, q0Var, q0Var, q0Var);
        p type4 = o.a(eVar.y());
        Intrinsics.checkNotNullParameter("textColorHex", "name");
        Intrinsics.checkNotNullParameter(type4, "type");
        List selections = f0.j(mVar, mVar2, mVar3, mVar4, mVar5, mVar6, new m("textColorHex", type4, null, q0Var, q0Var, q0Var));
        f63554a = selections;
        List selections2 = e0.b(new m("feedUrl", n60.o.l(eVar, "feedUrl", "name", "type"), null, q0Var, q0Var, q0Var));
        f63555b = selections2;
        m mVar7 = new m("isSelected", n60.o.m(n1.f26170a, "isSelected", "name", "type"), null, q0Var, q0Var, q0Var);
        w2 w2Var = z2.f26483a;
        m0 type5 = w2Var.c();
        Intrinsics.checkNotNullParameter("display", "name");
        Intrinsics.checkNotNullParameter(type5, "type");
        Intrinsics.checkNotNullParameter(selections, "selections");
        m mVar8 = new m("display", type5, null, q0Var, q0Var, selections);
        m mVar9 = new m("entityId", n60.o.l(eVar, "entityId", "name", "type"), null, q0Var, q0Var, q0Var);
        w2 w2Var2 = y2.f26461a;
        m0 type6 = w2Var2.c();
        Intrinsics.checkNotNullParameter("action", "name");
        Intrinsics.checkNotNullParameter(type6, "type");
        Intrinsics.checkNotNullParameter(selections2, "selections");
        List selections3 = f0.j(mVar7, mVar8, mVar9, new m("action", type6, null, q0Var, q0Var, selections2));
        f63556c = selections3;
        m mVar10 = new m("feedUrl", n60.o.l(eVar, "feedUrl", "name", "type"), null, q0Var, q0Var, q0Var);
        p type7 = o.a(u2.f26374a.n());
        Intrinsics.checkNotNullParameter("oneBarFilters", "name");
        Intrinsics.checkNotNullParameter(type7, "type");
        Intrinsics.checkNotNullParameter(selections3, "selections");
        m mVar11 = new m("oneBarFilters", type7, null, q0Var, q0Var, selections3);
        m mVar12 = new m("filterType", ep.b.u(hVar, "filterType", "name", "type"), null, q0Var, q0Var, q0Var);
        p type8 = o.a(eVar.y());
        Intrinsics.checkNotNullParameter("filterKeys", "name");
        Intrinsics.checkNotNullParameter(type8, "type");
        m mVar13 = new m("filterKeys", type8, null, q0Var, q0Var, q0Var);
        p type9 = o.a(o.b(eVar.y()));
        Intrinsics.checkNotNullParameter("searchParameters", "name");
        Intrinsics.checkNotNullParameter(type9, "type");
        List selections4 = f0.j(mVar10, mVar11, mVar12, mVar13, new m("searchParameters", type9, null, q0Var, q0Var, q0Var), new m("searchQuery", n60.o.l(eVar, "searchQuery", "name", "type"), null, q0Var, q0Var, q0Var), new m("title", n60.o.l(eVar, "title", "name", "type"), null, q0Var, q0Var, q0Var));
        f63557d = selections4;
        p type10 = o.a(eVar.y());
        Intrinsics.checkNotNullParameter("backgroundColorHex", "name");
        Intrinsics.checkNotNullParameter(type10, "type");
        m mVar14 = new m("backgroundColorHex", type10, null, q0Var, q0Var, q0Var);
        m mVar15 = new m("displayText", n60.o.l(eVar, "displayText", "name", "type"), null, q0Var, q0Var, q0Var);
        m mVar16 = new m("icon", ep.b.u(hVar, "icon", "name", "type"), null, q0Var, q0Var, q0Var);
        m mVar17 = new m("iconUrl", n60.o.l(eVar, "iconUrl", "name", "type"), null, q0Var, q0Var, q0Var);
        p type11 = o.a(eVar.y());
        Intrinsics.checkNotNullParameter("selectedBackgroundColorHex", "name");
        Intrinsics.checkNotNullParameter(type11, "type");
        m mVar18 = new m("selectedBackgroundColorHex", type11, null, q0Var, q0Var, q0Var);
        p type12 = o.a(eVar.y());
        Intrinsics.checkNotNullParameter("selectedTextColorHex", "name");
        Intrinsics.checkNotNullParameter(type12, "type");
        m mVar19 = new m("selectedTextColorHex", type12, null, q0Var, q0Var, q0Var);
        p type13 = o.a(eVar.y());
        Intrinsics.checkNotNullParameter("textColorHex", "name");
        Intrinsics.checkNotNullParameter(type13, "type");
        List selections5 = f0.j(mVar14, mVar15, mVar16, mVar17, mVar18, mVar19, new m("textColorHex", type13, null, q0Var, q0Var, q0Var));
        f63558e = selections5;
        m0 type14 = w2Var2.c();
        Intrinsics.checkNotNullParameter("action", "name");
        Intrinsics.checkNotNullParameter(type14, "type");
        Intrinsics.checkNotNullParameter(selections4, "selections");
        m mVar20 = new m("action", type14, null, q0Var, q0Var, selections4);
        m mVar21 = new m("animation", ep.b.u(hVar, "animation", "name", "type"), null, q0Var, q0Var, q0Var);
        m0 type15 = w2Var.c();
        Intrinsics.checkNotNullParameter("display", "name");
        Intrinsics.checkNotNullParameter(type15, "type");
        Intrinsics.checkNotNullParameter(selections5, "selections");
        f63559f = f0.j(mVar20, mVar21, new m("display", type15, null, q0Var, q0Var, selections5), new m("id", n60.o.l(eVar, "id", "name", "type"), null, q0Var, q0Var, q0Var), new m("moduleType", ep.b.u(hVar, "moduleType", "name", "type"), null, q0Var, q0Var, q0Var));
    }

    public static List a() {
        return f63559f;
    }
}
