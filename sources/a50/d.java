package a50;

import c50.q1;
import c50.r1;
import c50.t0;
import java.util.List;
import kotlin.collections.f0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final List f719a;

    /* renamed from: b, reason: collision with root package name */
    public static final List f720b;

    static {
        a10.e eVar = r1.f26261a;
        pc.r s13 = ep.b.s(eVar, "__typename", "name", "type");
        q0 q0Var = q0.f80391a;
        List selections = f0.j(new pc.m("__typename", s13, null, q0Var, q0Var, q0Var), new pc.m("time", n60.o.l(eVar, "time", "name", "type"), null, q0Var, q0Var, q0Var), new pc.m("userId", n60.o.l(eVar, "userId", "name", "type"), null, q0Var, q0Var, q0Var));
        f719a = selections;
        pc.m mVar = new pc.m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        List q13 = ep.b.q("Conversation", "Conversation", "typeCondition", "possibleTypes");
        List selections2 = h.f739a;
        Intrinsics.checkNotNullParameter(selections2, "selections");
        pc.n nVar = new pc.n("Conversation", q13, q0Var, selections2);
        pc.p type = pc.o.a(pc.o.b(eVar.y()));
        Intrinsics.checkNotNullParameter("emails", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        pc.m mVar2 = new pc.m("emails", type, null, q0Var, q0Var, q0Var);
        pc.m mVar3 = new pc.m("unread", ep.b.u(q1.f26239a, "unread", "name", "type"), null, q0Var, q0Var, q0Var);
        pc.p type2 = pc.o.a(pc.o.b(t0.f26302a.d()));
        Intrinsics.checkNotNullParameter("readTimesMs", "name");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(selections, "selections");
        f720b = f0.j(mVar, nVar, mVar2, mVar3, new pc.m("readTimesMs", type2, null, q0Var, q0Var, selections));
    }
}
