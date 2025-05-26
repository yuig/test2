package q40;

import a10.e;
import c50.n1;
import c50.p1;
import c50.r1;
import c50.v1;
import ep.b;
import java.util.List;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import n60.o;
import pc.m;
import pc.m0;
import pc.w;
import t3.s1;

/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final List f102391a;

    /* renamed from: b, reason: collision with root package name */
    public static final List f102392b;

    static {
        e eVar = r1.f26261a;
        w l13 = o.l(eVar, "url", "name", "type");
        q0 q0Var = q0.f80391a;
        List selections = e0.b(new m("url", l13, null, q0Var, q0Var, q0Var));
        f102391a = selections;
        m mVar = new m("__typename", b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        m mVar2 = new m("id", s1.g(p1.f26217a, "id", "name", "type"), null, q0Var, q0Var, q0Var);
        m mVar3 = new m("entityId", b.s(eVar, "entityId", "name", "type"), null, q0Var, q0Var, q0Var);
        m mVar4 = new m("isFollowed", o.m(n1.f26170a, "isFollowed", "name", "type"), null, q0Var, q0Var, q0Var);
        m mVar5 = new m("backgroundColor", o.l(eVar, "backgroundColor", "name", "type"), null, q0Var, q0Var, q0Var);
        m mVar6 = new m("name", o.l(eVar, "name", "name", "type"), null, q0Var, q0Var, q0Var);
        m0 v13 = b.v(v1.f26394a, "images", "name", "type");
        List r13 = b.r("spec", b.t("imageSpec", "spec", "name"), false, "arguments");
        Intrinsics.checkNotNullParameter(selections, "selections");
        f102392b = f0.j(mVar, mVar2, mVar3, mVar4, mVar5, mVar6, new m("images", v13, null, q0Var, r13, selections));
    }
}
