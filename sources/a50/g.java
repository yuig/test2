package a50;

import c50.i3;
import c50.p1;
import c50.r0;
import c50.r1;
import c50.s4;
import c50.t1;
import c50.v4;
import c50.z0;
import java.util.List;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import pc.m0;
import t3.s1;
import zy.b0;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final List f733a;

    /* renamed from: b, reason: collision with root package name */
    public static final List f734b;

    /* renamed from: c, reason: collision with root package name */
    public static final List f735c;

    /* renamed from: d, reason: collision with root package name */
    public static final List f736d;

    /* renamed from: e, reason: collision with root package name */
    public static final List f737e;

    /* renamed from: f, reason: collision with root package name */
    public static final List f738f;

    static {
        a10.e eVar = r1.f26261a;
        pc.r s13 = ep.b.s(eVar, "__typename", "name", "type");
        q0 q0Var = q0.f80391a;
        pc.m mVar = new pc.m("__typename", s13, null, q0Var, q0Var, q0Var);
        List q13 = ep.b.q("UserDidItData", "UserDidItData", "typeCondition", "possibleTypes");
        List selections = r.f777d;
        Intrinsics.checkNotNullParameter(selections, "selections");
        List selections2 = f0.j(mVar, new pc.n("UserDidItData", q13, q0Var, selections));
        f733a = selections2;
        pc.m mVar2 = new pc.m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        List q14 = ep.b.q("User", "User", "typeCondition", "possibleTypes");
        List selections3 = q.f773b;
        Intrinsics.checkNotNullParameter(selections3, "selections");
        List selections4 = f0.j(mVar2, new pc.n("User", q14, q0Var, selections3));
        f734b = selections4;
        pc.m mVar3 = new pc.m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        b0 b0Var = p1.f26217a;
        List selections5 = f0.j(mVar3, new pc.m("id", s1.g(b0Var, "id", "name", "type"), null, q0Var, q0Var, q0Var), new pc.m("entityId", ep.b.s(eVar, "entityId", "name", "type"), null, q0Var, q0Var, q0Var));
        f735c = selections5;
        pc.m mVar4 = new pc.m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        List q15 = ep.b.q("Board", "Board", "typeCondition", "possibleTypes");
        List selections6 = b.f716b;
        Intrinsics.checkNotNullParameter(selections6, "selections");
        List selections7 = f0.j(mVar4, new pc.n("Board", q15, q0Var, selections6));
        f736d = selections7;
        pc.m mVar5 = new pc.m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        List possibleTypes = e0.b("Pin");
        Intrinsics.checkNotNullParameter("Pin", "typeCondition");
        Intrinsics.checkNotNullParameter(possibleTypes, "possibleTypes");
        List selections8 = m.f759l;
        Intrinsics.checkNotNullParameter(selections8, "selections");
        List selections9 = f0.j(mVar5, new pc.n("Pin", possibleTypes, q0Var, selections8));
        f737e = selections9;
        pc.m mVar6 = new pc.m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        pc.m mVar7 = new pc.m("type", ep.b.u(r0.f26259a, "type", "name", "type"), null, q0Var, q0Var, q0Var);
        pc.m mVar8 = new pc.m("id", s1.g(b0Var, "id", "name", "type"), null, q0Var, q0Var, q0Var);
        pc.m mVar9 = new pc.m("entityId", ep.b.s(eVar, "entityId", "name", "type"), null, q0Var, q0Var, q0Var);
        pc.m mVar10 = new pc.m("text", n60.o.l(eVar, "text", "name", "type"), null, q0Var, q0Var, q0Var);
        pc.m mVar11 = new pc.m("createdAt", n60.o.m(z0.f26479a, "createdAt", "name", "type"), null, q0Var, q0Var, q0Var);
        m0 v13 = ep.b.v(v4.f26400a, "userDidItData", "name", "type");
        Intrinsics.checkNotNullParameter(selections2, "selections");
        pc.m mVar12 = new pc.m("userDidItData", v13, null, q0Var, q0Var, selections2);
        t1 t1Var = s4.f26288a;
        m0 w13 = ep.b.w(t1Var, "sender", "name", "type");
        Intrinsics.checkNotNullParameter(selections4, "selections");
        pc.m mVar13 = new pc.m("sender", w13, null, q0Var, q0Var, selections4);
        m0 w14 = ep.b.w(t1Var, "user", "name", "type");
        Intrinsics.checkNotNullParameter(selections5, "selections");
        pc.m mVar14 = new pc.m("user", w14, null, q0Var, q0Var, selections5);
        m0 type = c50.t.f26300a.d();
        Intrinsics.checkNotNullParameter("board", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(selections7, "selections");
        pc.m mVar15 = new pc.m("board", type, null, q0Var, q0Var, selections7);
        m0 w15 = ep.b.w(i3.f26061a, "pin", "name", "type");
        Intrinsics.checkNotNullParameter(selections9, "selections");
        f738f = f0.j(mVar6, mVar7, mVar8, mVar9, mVar10, mVar11, mVar12, mVar13, mVar14, mVar15, new pc.m("pin", w15, null, q0Var, q0Var, selections9));
    }
}
