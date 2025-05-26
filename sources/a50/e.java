package a50;

import c50.n0;
import c50.n1;
import c50.p1;
import c50.r1;
import c50.s4;
import c50.z0;
import java.util.List;
import kotlin.collections.f0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import pc.m0;
import t3.s1;

/* loaded from: classes5.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final List f721a;

    /* renamed from: b, reason: collision with root package name */
    public static final List f722b;

    /* renamed from: c, reason: collision with root package name */
    public static final List f723c;

    /* renamed from: d, reason: collision with root package name */
    public static final List f724d;

    static {
        a10.e eVar = r1.f26261a;
        pc.r s13 = ep.b.s(eVar, "__typename", "name", "type");
        q0 q0Var = q0.f80391a;
        pc.m mVar = new pc.m("__typename", s13, null, q0Var, q0Var, q0Var);
        List q13 = ep.b.q("Board", "Board", "typeCondition", "possibleTypes");
        List selections = b.f716b;
        Intrinsics.checkNotNullParameter(selections, "selections");
        List selections2 = f0.j(mVar, new pc.n("Board", q13, q0Var, selections));
        f721a = selections2;
        pc.m mVar2 = new pc.m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        List q14 = ep.b.q("Conversation", "Conversation", "typeCondition", "possibleTypes");
        List selections3 = d.f720b;
        Intrinsics.checkNotNullParameter(selections3, "selections");
        List selections4 = f0.j(mVar2, new pc.n("Conversation", q14, q0Var, selections3));
        f722b = selections4;
        pc.m mVar3 = new pc.m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        List q15 = ep.b.q("User", "User", "typeCondition", "possibleTypes");
        List selections5 = q.f773b;
        Intrinsics.checkNotNullParameter(selections5, "selections");
        List selections6 = f0.j(mVar3, new pc.n("User", q15, q0Var, selections5));
        f723c = selections6;
        pc.m mVar4 = new pc.m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        pc.m mVar5 = new pc.m("entityId", ep.b.s(eVar, "entityId", "name", "type"), null, q0Var, q0Var, q0Var);
        pc.m mVar6 = new pc.m("id", s1.g(p1.f26217a, "id", "name", "type"), null, q0Var, q0Var, q0Var);
        pc.m mVar7 = new pc.m("type", n60.o.l(eVar, "type", "name", "type"), null, q0Var, q0Var, q0Var);
        pc.m mVar8 = new pc.m("read", n60.o.m(n1.f26170a, "read", "name", "type"), null, q0Var, q0Var, q0Var);
        pc.m mVar9 = new pc.m("createdAt", n60.o.m(z0.f26479a, "createdAt", "name", "type"), null, q0Var, q0Var, q0Var);
        m0 type = c50.t.f26300a.d();
        Intrinsics.checkNotNullParameter("board", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(selections2, "selections");
        pc.m mVar10 = new pc.m("board", type, null, q0Var, q0Var, selections2);
        m0 type2 = n0.f26168a.j();
        Intrinsics.checkNotNullParameter("conversation", "name");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(selections4, "selections");
        pc.m mVar11 = new pc.m("conversation", type2, null, q0Var, q0Var, selections4);
        m0 w13 = ep.b.w(s4.f26288a, "sender", "name", "type");
        Intrinsics.checkNotNullParameter(selections6, "selections");
        f724d = f0.j(mVar4, mVar5, mVar6, mVar7, mVar8, mVar9, mVar10, mVar11, new pc.m("sender", w13, null, q0Var, q0Var, selections6));
    }
}
