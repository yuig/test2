package a50;

import c50.o0;
import c50.p1;
import c50.r0;
import c50.r1;
import java.util.List;
import kotlin.collections.f0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import pc.m0;
import t3.s1;

/* loaded from: classes5.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final List f740a;

    /* renamed from: b, reason: collision with root package name */
    public static final List f741b;

    static {
        a10.e eVar = r1.f26261a;
        pc.r s13 = ep.b.s(eVar, "__typename", "name", "type");
        q0 q0Var = q0.f80391a;
        List selections = f0.j(new pc.m("__typename", s13, null, q0Var, q0Var, q0Var), new pc.m("type", ep.b.u(r0.f26259a, "type", "name", "type"), null, q0Var, q0Var, q0Var), new pc.m("id", s1.g(p1.f26217a, "id", "name", "type"), null, q0Var, q0Var, q0Var), new pc.m("entityId", ep.b.s(eVar, "entityId", "name", "type"), null, q0Var, q0Var, q0Var));
        f740a = selections;
        pc.m mVar = new pc.m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        List q13 = ep.b.q("Conversation", "Conversation", "typeCondition", "possibleTypes");
        List selections2 = h.f739a;
        Intrinsics.checkNotNullParameter(selections2, "selections");
        pc.n nVar = new pc.n("Conversation", q13, q0Var, selections2);
        m0 type = o0.f26191a.d();
        Intrinsics.checkNotNullParameter("lastMessage", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(selections, "selections");
        f741b = f0.j(mVar, nVar, new pc.m("lastMessage", type, null, q0Var, q0Var, selections));
    }
}
