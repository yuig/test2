package r50;

import a10.e;
import c50.a6;
import c50.i3;
import c50.o4;
import c50.r1;
import c50.w5;
import c50.y5;
import c50.z5;
import java.util.List;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import n60.o;
import pc.j;
import pc.m;
import pc.m0;
import pc.n;
import pc.p;
import pc.r;
import pc.v0;

/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final List f106235a;

    /* renamed from: b, reason: collision with root package name */
    public static final List f106236b;

    /* renamed from: c, reason: collision with root package name */
    public static final List f106237c;

    /* renamed from: d, reason: collision with root package name */
    public static final List f106238d;

    /* renamed from: e, reason: collision with root package name */
    public static final List f106239e;

    /* renamed from: f, reason: collision with root package name */
    public static final List f106240f;

    /* renamed from: g, reason: collision with root package name */
    public static final List f106241g;

    /* renamed from: h, reason: collision with root package name */
    public static final List f106242h;

    static {
        e eVar = r1.f26261a;
        r s13 = ep.b.s(eVar, "entityId", "name", "type");
        q0 q0Var = q0.f80391a;
        List selections = f0.j(new m("entityId", s13, null, q0Var, q0Var, q0Var), new m("imageMediumUrl", o.l(o4.f26199a, "imageMediumUrl", "name", "type"), null, q0Var, q0Var, q0Var));
        f106235a = selections;
        m0 w13 = ep.b.w(i3.f26061a, "node", "name", "type");
        Intrinsics.checkNotNullParameter(selections, "selections");
        List selections2 = e0.b(new m("node", w13, null, q0Var, q0Var, selections));
        f106236b = selections2;
        p type = pc.o.a(z5.f26489a.b());
        Intrinsics.checkNotNullParameter("edges", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(selections2, "selections");
        List selections3 = e0.b(new m("edges", type, null, q0Var, q0Var, selections2));
        f106237c = selections3;
        m mVar = new m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        m0 type2 = w5.f26423a.b();
        Intrinsics.checkNotNullParameter("connection", "name");
        Intrinsics.checkNotNullParameter(type2, "type");
        List r13 = ep.b.r("first", ep.b.t("pageSize", "first", "name"), false, "arguments");
        Intrinsics.checkNotNullParameter(selections3, "selections");
        List selections4 = f0.j(mVar, new m("connection", type2, null, q0Var, r13, selections3));
        f106238d = selections4;
        m mVar2 = new m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        List q13 = ep.b.q("V3AndroidWidgetGetBoardPinsDataConnectionContainer", "V3AndroidWidgetGetBoardPinsDataConnectionContainer", "typeCondition", "possibleTypes");
        Intrinsics.checkNotNullParameter(selections4, "selections");
        List selections5 = f0.j(mVar2, new n("V3AndroidWidgetGetBoardPinsDataConnectionContainer", q13, q0Var, selections4));
        f106239e = selections5;
        r type3 = pc.o.b(eVar.y());
        Intrinsics.checkNotNullParameter("__typename", "name");
        Intrinsics.checkNotNullParameter(type3, "type");
        m mVar3 = new m("__typename", type3, null, q0Var, q0Var, q0Var);
        v0 type4 = y5.f26467a.c();
        Intrinsics.checkNotNullParameter("data", "name");
        Intrinsics.checkNotNullParameter(type4, "type");
        Intrinsics.checkNotNullParameter(selections5, "selections");
        List selections6 = f0.j(mVar3, new m("data", type4, null, q0Var, q0Var, selections5));
        f106240f = selections6;
        m mVar4 = new m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        List q14 = ep.b.q("V3AndroidWidgetGetBoardPins", "V3AndroidWidgetGetBoardPins", "typeCondition", "possibleTypes");
        Intrinsics.checkNotNullParameter(selections6, "selections");
        List selections7 = f0.j(mVar4, new n("V3AndroidWidgetGetBoardPins", q14, q0Var, selections6));
        f106241g = selections7;
        v0 type5 = a6.f25880a.c();
        Intrinsics.checkNotNullParameter("v3AndroidWidgetGetBoardPinsQuery", "name");
        Intrinsics.checkNotNullParameter(type5, "type");
        List arguments = f0.j(new j("board", ep.b.t("board", "board", "name"), false), new j("pageSize", ep.b.t("pageSize", "pageSize", "name"), false), new j("widgetCountForStyle", ep.b.t("widgetCountForStyle", "widgetCountForStyle", "name"), false), new j("widgetStyle", ep.b.t("widgetStyle", "widgetStyle", "name"), false));
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(selections7, "selections");
        f106242h = e0.b(new m("v3AndroidWidgetGetBoardPinsQuery", type5, null, q0Var, arguments, selections7));
    }
}
