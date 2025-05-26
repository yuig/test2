package g50;

import a10.e;
import bz.h;
import c50.a3;
import c50.c1;
import c50.l1;
import c50.n1;
import c50.o1;
import c50.o4;
import c50.q1;
import c50.q3;
import c50.r1;
import c50.w2;
import java.util.List;
import kotlin.collections.f0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import n60.o;
import pc.m;
import pc.m0;
import pc.p;
import pc.w;
import zy.b0;

/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final List f63550a;

    /* renamed from: b, reason: collision with root package name */
    public static final List f63551b;

    /* renamed from: c, reason: collision with root package name */
    public static final List f63552c;

    /* renamed from: d, reason: collision with root package name */
    public static final List f63553d;

    static {
        e eVar = r1.f26261a;
        w l13 = o.l(eVar, "id", "name", "type");
        q0 q0Var = q0.f80391a;
        m mVar = new m("id", l13, null, q0Var, q0Var, q0Var);
        e eVar2 = o4.f26199a;
        m mVar2 = new m("imageUrl", o.l(eVar2, "imageUrl", "name", "type"), null, q0Var, q0Var, q0Var);
        b0 b0Var = n1.f26170a;
        m mVar3 = new m("isSelected", o.m(b0Var, "isSelected", "name", "type"), null, q0Var, q0Var, q0Var);
        m mVar4 = new m("isVerified", o.m(b0Var, "isVerified", "name", "type"), null, q0Var, q0Var, q0Var);
        m mVar5 = new m("label", o.l(eVar, "label", "name", "type"), null, q0Var, q0Var, q0Var);
        h hVar = o1.f26193a;
        m mVar6 = new m("numericValue", ep.b.u(hVar, "numericValue", "name", "type"), null, q0Var, q0Var, q0Var);
        h hVar2 = q1.f26239a;
        p type = pc.o.a(pc.o.b(hVar2.i()));
        Intrinsics.checkNotNullParameter("rules", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        m mVar7 = new m("rules", type, null, q0Var, q0Var, q0Var);
        w2 w2Var = q3.f26243a;
        w type2 = w2Var.b();
        Intrinsics.checkNotNullParameter("searchType", "name");
        Intrinsics.checkNotNullParameter(type2, "type");
        List selections = f0.j(mVar, mVar2, mVar3, mVar4, mVar5, mVar6, mVar7, new m("searchType", type2, null, q0Var, q0Var, q0Var), new m("stringValue", o.l(eVar, "stringValue", "name", "type"), null, q0Var, q0Var, q0Var), new m("trackingParams", o.l(eVar, "trackingParams", "name", "type"), null, q0Var, q0Var, q0Var), new m("type", o.l(eVar, "type", "name", "type"), null, q0Var, q0Var, q0Var), new m("unit", o.l(eVar, "unit", "name", "type"), null, q0Var, q0Var, q0Var));
        f63550a = selections;
        List selections2 = f0.j(new m("journeyDepth", ep.b.u(hVar2, "journeyDepth", "name", "type"), null, q0Var, q0Var, q0Var), new m("sourceModuleId", o.l(eVar, "sourceModuleId", "name", "type"), null, q0Var, q0Var, q0Var));
        f63551b = selections2;
        m mVar8 = new m("id", o.l(eVar, "id", "name", "type"), null, q0Var, q0Var, q0Var);
        m mVar9 = new m("imageUrl", o.l(eVar2, "imageUrl", "name", "type"), null, q0Var, q0Var, q0Var);
        m mVar10 = new m("isSelected", o.m(b0Var, "isSelected", "name", "type"), null, q0Var, q0Var, q0Var);
        m mVar11 = new m("isVerified", o.m(b0Var, "isVerified", "name", "type"), null, q0Var, q0Var, q0Var);
        m mVar12 = new m("label", o.l(eVar, "label", "name", "type"), null, q0Var, q0Var, q0Var);
        m mVar13 = new m("numericValue", ep.b.u(hVar, "numericValue", "name", "type"), null, q0Var, q0Var, q0Var);
        p type3 = pc.o.a(pc.o.b(hVar2.i()));
        Intrinsics.checkNotNullParameter("rules", "name");
        Intrinsics.checkNotNullParameter(type3, "type");
        m mVar14 = new m("rules", type3, null, q0Var, q0Var, q0Var);
        w type4 = w2Var.b();
        Intrinsics.checkNotNullParameter("searchType", "name");
        Intrinsics.checkNotNullParameter(type4, "type");
        List selections3 = f0.j(mVar8, mVar9, mVar10, mVar11, mVar12, mVar13, mVar14, new m("searchType", type4, null, q0Var, q0Var, q0Var), new m("stringValue", o.l(eVar, "stringValue", "name", "type"), null, q0Var, q0Var, q0Var), new m("trackingParams", o.l(eVar, "trackingParams", "name", "type"), null, q0Var, q0Var, q0Var), new m("type", o.l(eVar, "type", "name", "type"), null, q0Var, q0Var, q0Var), new m("unit", o.l(eVar, "unit", "name", "type"), null, q0Var, q0Var, q0Var));
        f63552c = selections3;
        c1 c1Var = l1.f26123a;
        p type5 = pc.o.a(c1Var.n());
        Intrinsics.checkNotNullParameter("appliedFilterOptions", "name");
        Intrinsics.checkNotNullParameter(type5, "type");
        Intrinsics.checkNotNullParameter(selections, "selections");
        m mVar15 = new m("appliedFilterOptions", type5, null, q0Var, q0Var, selections);
        m mVar16 = new m("filterComponentType", ep.b.u(hVar2, "filterComponentType", "name", "type"), null, q0Var, q0Var, q0Var);
        m mVar17 = new m("label", o.l(eVar, "label", "name", "type"), null, q0Var, q0Var, q0Var);
        m mVar18 = new m("productFilterType", ep.b.u(hVar2, "productFilterType", "name", "type"), null, q0Var, q0Var, q0Var);
        m mVar19 = new m("title", o.l(eVar, "title", "name", "type"), null, q0Var, q0Var, q0Var);
        m mVar20 = new m("trackingParams", o.l(eVar, "trackingParams", "name", "type"), null, q0Var, q0Var, q0Var);
        m0 type6 = a3.f25874a.c();
        Intrinsics.checkNotNullParameter("requestParams", "name");
        Intrinsics.checkNotNullParameter(type6, "type");
        Intrinsics.checkNotNullParameter(selections2, "selections");
        m mVar21 = new m("requestParams", type6, null, q0Var, q0Var, selections2);
        p type7 = pc.o.a(c1Var.n());
        Intrinsics.checkNotNullParameter("filterOptions", "name");
        Intrinsics.checkNotNullParameter(type7, "type");
        Intrinsics.checkNotNullParameter(selections3, "selections");
        f63553d = f0.j(mVar15, mVar16, mVar17, mVar18, mVar19, mVar20, mVar21, new m("filterOptions", type7, null, q0Var, q0Var, selections3));
    }

    public static List a() {
        return f63553d;
    }
}
