package b50;

import c50.p1;
import c50.r1;
import c50.s2;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import t3.s1;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final List f21873a;

    /* renamed from: b, reason: collision with root package name */
    public static final List f21874b;

    /* renamed from: c, reason: collision with root package name */
    public static final List f21875c;

    static {
        a10.e eVar = r1.f26261a;
        pc.r s13 = ep.b.s(eVar, "__typename", "name", "type");
        q0 q0Var = q0.f80391a;
        List selections = kotlin.collections.f0.j(new pc.m("__typename", s13, null, q0Var, q0Var, q0Var), new pc.m("id", s1.g(p1.f26217a, "id", "name", "type"), null, q0Var, q0Var, q0Var), new pc.m("name", n60.o.l(eVar, "name", "name", "type"), null, q0Var, q0Var, q0Var));
        f21873a = selections;
        pc.m mVar = new pc.m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        List q13 = ep.b.q("Board", "Board", "typeCondition", "possibleTypes");
        Intrinsics.checkNotNullParameter(selections, "selections");
        List selections2 = kotlin.collections.f0.j(mVar, new pc.n("Board", q13, q0Var, selections));
        f21874b = selections2;
        pc.g0 type = s2.f26285a;
        Intrinsics.checkNotNullParameter("node", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        pc.t tVar = new pc.t("id");
        Intrinsics.checkNotNullParameter("id", "name");
        List arguments = kotlin.collections.e0.b(new pc.j("id", tVar, false));
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(selections2, "selections");
        f21875c = kotlin.collections.e0.b(new pc.m("node", type, null, q0Var, arguments, selections2));
    }
}
