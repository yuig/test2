package r50;

import c50.ka;
import c50.n1;
import c50.r1;
import d7.g;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.collections.q0;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import n60.o;
import pc.m;
import pc.n;
import pc.t;
import pc.v0;
import pc.w;

/* loaded from: classes5.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final List f106247a;

    /* renamed from: b, reason: collision with root package name */
    public static final List f106248b;

    /* renamed from: c, reason: collision with root package name */
    public static final List f106249c;

    static {
        w m13 = o.m(n1.f26170a, "data", "name", "type");
        q0 q0Var = q0.f80391a;
        List selections = e0.b(new m("data", m13, null, q0Var, q0Var, q0Var));
        f106247a = selections;
        m mVar = new m("__typename", ep.b.s(r1.f26261a, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        List q13 = ep.b.q("BooleanResponse", "BooleanResponse", "typeCondition", "possibleTypes");
        Intrinsics.checkNotNullParameter(selections, "selections");
        List selections2 = f0.j(mVar, new n("BooleanResponse", q13, q0Var, selections));
        f106248b = selections2;
        v0 type = ka.f26119a.c();
        Intrinsics.checkNotNullParameter("v3WidgetTapsMutation", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        List arguments = g.m("input", "name", "input", z0.g(new Pair("widgetContentSource", new t("widgetContentSource")), new Pair("widgetName", new t("widgetName")), new Pair("widgetId", new t("widgetId"))), false);
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(selections2, "selections");
        f106249c = e0.b(new m("v3WidgetTapsMutation", type, null, q0Var, arguments, selections2));
    }
}
