package b50;

import c50.g5;
import c50.i5;
import c50.j5;
import c50.n1;
import c50.o0;
import c50.p1;
import c50.q1;
import c50.r1;
import c50.s2;
import c50.s4;
import c50.t0;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import pc.m0;
import pc.v0;
import t3.s1;

/* loaded from: classes5.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final List f21879a;

    /* renamed from: b, reason: collision with root package name */
    public static final List f21880b;

    /* renamed from: c, reason: collision with root package name */
    public static final List f21881c;

    /* renamed from: d, reason: collision with root package name */
    public static final List f21882d;

    /* renamed from: e, reason: collision with root package name */
    public static final List f21883e;

    /* renamed from: f, reason: collision with root package name */
    public static final List f21884f;

    /* renamed from: g, reason: collision with root package name */
    public static final List f21885g;

    /* renamed from: h, reason: collision with root package name */
    public static final List f21886h;

    /* renamed from: i, reason: collision with root package name */
    public static final List f21887i;

    /* renamed from: j, reason: collision with root package name */
    public static final List f21888j;

    static {
        a10.e eVar = r1.f26261a;
        pc.r s13 = ep.b.s(eVar, "__typename", "name", "type");
        q0 q0Var = q0.f80391a;
        pc.m mVar = new pc.m("__typename", s13, null, q0Var, q0Var, q0Var);
        List q13 = ep.b.q("User", "User", "typeCondition", "possibleTypes");
        List selections = a50.q.f773b;
        Intrinsics.checkNotNullParameter(selections, "selections");
        List selections2 = kotlin.collections.f0.j(mVar, new pc.n("User", q13, q0Var, selections));
        f21879a = selections2;
        m0 w13 = ep.b.w(s4.f26288a, "node", "name", "type");
        Intrinsics.checkNotNullParameter(selections2, "selections");
        List selections3 = kotlin.collections.e0.b(new pc.m("node", w13, null, q0Var, q0Var, selections2));
        f21880b = selections3;
        pc.p type = pc.o.a(j5.f26089a.z());
        Intrinsics.checkNotNullParameter("edges", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(selections3, "selections");
        List selections4 = kotlin.collections.e0.b(new pc.m("edges", type, null, q0Var, q0Var, selections3));
        f21881c = selections4;
        pc.m mVar2 = new pc.m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        m0 w14 = ep.b.w(g5.f26019a, "connection", "name", "type");
        Intrinsics.checkNotNullParameter(selections4, "selections");
        List selections5 = kotlin.collections.f0.j(mVar2, new pc.m("connection", w14, null, q0Var, q0Var, selections4));
        f21882d = selections5;
        pc.m mVar3 = new pc.m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        List q14 = ep.b.q("UserUsersConnectionContainer", "UserUsersConnectionContainer", "typeCondition", "possibleTypes");
        Intrinsics.checkNotNullParameter(selections5, "selections");
        List selections6 = kotlin.collections.f0.j(mVar3, new pc.n("UserUsersConnectionContainer", q14, q0Var, selections5));
        f21883e = selections6;
        pc.m mVar4 = new pc.m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        pc.m mVar5 = new pc.m("userId", n60.o.l(eVar, "userId", "name", "type"), null, q0Var, q0Var, q0Var);
        pc.w type2 = eVar.y();
        Intrinsics.checkNotNullParameter("time", "name");
        Intrinsics.checkNotNullParameter(type2, "type");
        List selections7 = kotlin.collections.f0.j(mVar4, mVar5, new pc.m("time", type2, null, q0Var, q0Var, q0Var));
        f21884f = selections7;
        pc.m mVar6 = new pc.m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        List q15 = ep.b.q("ConversationMessage", "ConversationMessage", "typeCondition", "possibleTypes");
        List selections8 = a50.g.f738f;
        Intrinsics.checkNotNullParameter(selections8, "selections");
        List selections9 = kotlin.collections.f0.j(mVar6, new pc.n("ConversationMessage", q15, q0Var, selections8));
        f21885g = selections9;
        pc.m mVar7 = new pc.m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        pc.m mVar8 = new pc.m("id", s1.g(p1.f26217a, "id", "name", "type"), null, q0Var, q0Var, q0Var);
        pc.m mVar9 = new pc.m("entityId", ep.b.s(eVar, "entityId", "name", "type"), null, q0Var, q0Var, q0Var);
        pc.p type3 = pc.o.a(pc.o.b(eVar.y()));
        Intrinsics.checkNotNullParameter("emails", "name");
        Intrinsics.checkNotNullParameter(type3, "type");
        pc.m mVar10 = new pc.m("emails", type3, null, q0Var, q0Var, q0Var);
        pc.m mVar11 = new pc.m("unread", ep.b.u(q1.f26239a, "unread", "name", "type"), null, q0Var, q0Var, q0Var);
        pc.m mVar12 = new pc.m("isEligibleForThreads", n60.o.m(n1.f26170a, "isEligibleForThreads", "name", "type"), null, q0Var, q0Var, q0Var);
        pc.m mVar13 = new pc.m("pinsubTopicId", n60.o.l(eVar, "pinsubTopicId", "name", "type"), null, q0Var, q0Var, q0Var);
        v0 type4 = i5.f26065a.b();
        Intrinsics.checkNotNullParameter("users", "name");
        Intrinsics.checkNotNullParameter(type4, "type");
        Intrinsics.checkNotNullParameter(selections6, "selections");
        pc.m mVar14 = new pc.m("users", type4, null, q0Var, q0Var, selections6);
        pc.p type5 = pc.o.a(pc.o.b(t0.f26302a.d()));
        Intrinsics.checkNotNullParameter("readTimesMs", "name");
        Intrinsics.checkNotNullParameter(type5, "type");
        Intrinsics.checkNotNullParameter(selections7, "selections");
        pc.m mVar15 = new pc.m("readTimesMs", type5, null, q0Var, q0Var, selections7);
        m0 type6 = o0.f26191a.d();
        Intrinsics.checkNotNullParameter("lastMessage", "name");
        Intrinsics.checkNotNullParameter(type6, "type");
        Intrinsics.checkNotNullParameter(selections9, "selections");
        List selections10 = kotlin.collections.f0.j(mVar7, mVar8, mVar9, mVar10, mVar11, mVar12, mVar13, mVar14, mVar15, new pc.m("lastMessage", type6, null, q0Var, q0Var, selections9));
        f21886h = selections10;
        pc.m mVar16 = new pc.m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        List q16 = ep.b.q("Conversation", "Conversation", "typeCondition", "possibleTypes");
        Intrinsics.checkNotNullParameter(selections10, "selections");
        List selections11 = kotlin.collections.f0.j(mVar16, new pc.n("Conversation", q16, q0Var, selections10));
        f21887i = selections11;
        pc.g0 type7 = s2.f26285a;
        Intrinsics.checkNotNullParameter("node", "name");
        Intrinsics.checkNotNullParameter(type7, "type");
        pc.t tVar = new pc.t("id");
        Intrinsics.checkNotNullParameter("id", "name");
        List arguments = kotlin.collections.e0.b(new pc.j("id", tVar, false));
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(selections11, "selections");
        f21888j = kotlin.collections.e0.b(new pc.m("node", type7, null, q0Var, arguments, selections11));
    }
}
