package a50;

import c50.g5;
import c50.i5;
import c50.j5;
import c50.n1;
import c50.o0;
import c50.q1;
import c50.r1;
import c50.s4;
import c50.t0;
import java.util.List;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import pc.m0;
import pc.v0;
import pc.w;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final List f725a;

    /* renamed from: b, reason: collision with root package name */
    public static final List f726b;

    /* renamed from: c, reason: collision with root package name */
    public static final List f727c;

    /* renamed from: d, reason: collision with root package name */
    public static final List f728d;

    /* renamed from: e, reason: collision with root package name */
    public static final List f729e;

    /* renamed from: f, reason: collision with root package name */
    public static final List f730f;

    /* renamed from: g, reason: collision with root package name */
    public static final List f731g;

    /* renamed from: h, reason: collision with root package name */
    public static final List f732h;

    static {
        a10.e eVar = r1.f26261a;
        pc.r s13 = ep.b.s(eVar, "__typename", "name", "type");
        q0 q0Var = q0.f80391a;
        List selections = f0.j(new pc.m("__typename", s13, null, q0Var, q0Var, q0Var), new pc.m("time", n60.o.l(eVar, "time", "name", "type"), null, q0Var, q0Var, q0Var), new pc.m("userId", n60.o.l(eVar, "userId", "name", "type"), null, q0Var, q0Var, q0Var));
        f725a = selections;
        pc.m mVar = new pc.m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        List q13 = ep.b.q("User", "User", "typeCondition", "possibleTypes");
        List selections2 = q.f773b;
        Intrinsics.checkNotNullParameter(selections2, "selections");
        List selections3 = f0.j(mVar, new pc.n("User", q13, q0Var, selections2));
        f726b = selections3;
        m0 w13 = ep.b.w(s4.f26288a, "node", "name", "type");
        Intrinsics.checkNotNullParameter(selections3, "selections");
        List selections4 = e0.b(new pc.m("node", w13, null, q0Var, q0Var, selections3));
        f727c = selections4;
        pc.p type = pc.o.a(j5.f26089a.z());
        Intrinsics.checkNotNullParameter("edges", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(selections4, "selections");
        List selections5 = e0.b(new pc.m("edges", type, null, q0Var, q0Var, selections4));
        f728d = selections5;
        pc.m mVar2 = new pc.m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        m0 w14 = ep.b.w(g5.f26019a, "connection", "name", "type");
        Intrinsics.checkNotNullParameter(selections5, "selections");
        List selections6 = f0.j(mVar2, new pc.m("connection", w14, null, q0Var, q0Var, selections5));
        f729e = selections6;
        pc.m mVar3 = new pc.m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        List possibleTypes = e0.b("UserUsersConnectionContainer");
        Intrinsics.checkNotNullParameter("UserUsersConnectionContainer", "typeCondition");
        Intrinsics.checkNotNullParameter(possibleTypes, "possibleTypes");
        Intrinsics.checkNotNullParameter(selections6, "selections");
        List selections7 = f0.j(mVar3, new pc.n("UserUsersConnectionContainer", possibleTypes, q0Var, selections6));
        f730f = selections7;
        pc.m mVar4 = new pc.m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        List q14 = ep.b.q("ConversationMessage", "ConversationMessage", "typeCondition", "possibleTypes");
        List selections8 = g.f738f;
        Intrinsics.checkNotNullParameter(selections8, "selections");
        List selections9 = f0.j(mVar4, new pc.n("ConversationMessage", q14, q0Var, selections8));
        f731g = selections9;
        pc.m mVar5 = new pc.m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        List q15 = ep.b.q("Conversation", "Conversation", "typeCondition", "possibleTypes");
        List selections10 = h.f739a;
        Intrinsics.checkNotNullParameter(selections10, "selections");
        pc.n nVar = new pc.n("Conversation", q15, q0Var, selections10);
        pc.p type2 = pc.o.a(pc.o.b(eVar.y()));
        Intrinsics.checkNotNullParameter("emails", "name");
        Intrinsics.checkNotNullParameter(type2, "type");
        pc.m mVar6 = new pc.m("emails", type2, null, q0Var, q0Var, q0Var);
        pc.m mVar7 = new pc.m("unread", ep.b.u(q1.f26239a, "unread", "name", "type"), null, q0Var, q0Var, q0Var);
        pc.m mVar8 = new pc.m("isEligibleForThreads", n60.o.m(n1.f26170a, "isEligibleForThreads", "name", "type"), null, q0Var, q0Var, q0Var);
        w l13 = n60.o.l(eVar, "pinsubTopicId", "name", "type");
        List condition = e0.b(new pc.k());
        Intrinsics.checkNotNullParameter(condition, "condition");
        pc.m mVar9 = new pc.m("pinsubTopicId", l13, null, condition, q0Var, q0Var);
        pc.p type3 = pc.o.a(pc.o.b(t0.f26302a.d()));
        Intrinsics.checkNotNullParameter("readTimesMs", "name");
        Intrinsics.checkNotNullParameter(type3, "type");
        Intrinsics.checkNotNullParameter(selections, "selections");
        pc.m mVar10 = new pc.m("readTimesMs", type3, null, q0Var, q0Var, selections);
        v0 type4 = i5.f26065a.b();
        Intrinsics.checkNotNullParameter("users", "name");
        Intrinsics.checkNotNullParameter(type4, "type");
        Intrinsics.checkNotNullParameter(selections7, "selections");
        pc.m mVar11 = new pc.m("users", type4, null, q0Var, q0Var, selections7);
        m0 type5 = o0.f26191a.d();
        Intrinsics.checkNotNullParameter("lastMessage", "name");
        Intrinsics.checkNotNullParameter(type5, "type");
        Intrinsics.checkNotNullParameter(selections9, "selections");
        f732h = f0.j(mVar5, nVar, mVar6, mVar7, mVar8, mVar9, mVar10, mVar11, new pc.m("lastMessage", type5, null, q0Var, q0Var, selections9));
    }
}
