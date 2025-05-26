package r50;

import a10.e;
import c50.c6;
import c50.i3;
import c50.o4;
import c50.r1;
import java.util.List;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import n60.o;
import pc.j;
import pc.m;
import pc.n;
import pc.r;
import pc.v0;

/* loaded from: classes5.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final List f106243a;

    /* renamed from: b, reason: collision with root package name */
    public static final List f106244b;

    /* renamed from: c, reason: collision with root package name */
    public static final List f106245c;

    /* renamed from: d, reason: collision with root package name */
    public static final List f106246d;

    static {
        e eVar = r1.f26261a;
        r s13 = ep.b.s(eVar, "entityId", "name", "type");
        q0 q0Var = q0.f80391a;
        List selections = f0.j(new m("entityId", s13, null, q0Var, q0Var, q0Var), new m("imageMediumUrl", o.l(o4.f26199a, "imageMediumUrl", "name", "type"), null, q0Var, q0Var, q0Var));
        f106243a = selections;
        m mVar = new m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        r type = pc.o.b(pc.o.a(i3.f26061a.a()));
        Intrinsics.checkNotNullParameter("data", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(selections, "selections");
        List selections2 = f0.j(mVar, new m("data", type, null, q0Var, q0Var, selections));
        f106244b = selections2;
        m mVar2 = new m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        List q13 = ep.b.q("V3AndroidWidgetGetHomefeedPins", "V3AndroidWidgetGetHomefeedPins", "typeCondition", "possibleTypes");
        Intrinsics.checkNotNullParameter(selections2, "selections");
        List selections3 = f0.j(mVar2, new n("V3AndroidWidgetGetHomefeedPins", q13, q0Var, selections2));
        f106245c = selections3;
        v0 type2 = c6.f25927a.c();
        Intrinsics.checkNotNullParameter("v3AndroidWidgetGetHomefeedPinsQuery", "name");
        Intrinsics.checkNotNullParameter(type2, "type");
        List arguments = f0.j(new j("pinRequestSize", ep.b.t("pinRequestSize", "pinRequestSize", "name"), false), new j("widgetCountForStyle", ep.b.t("widgetCountForStyle", "widgetCountForStyle", "name"), false), new j("widgetStyle", ep.b.t("widgetStyle", "widgetStyle", "name"), false));
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(selections3, "selections");
        f106246d = e0.b(new m("v3AndroidWidgetGetHomefeedPinsQuery", type2, null, q0Var, arguments, selections3));
    }
}
