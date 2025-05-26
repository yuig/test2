package a50;

import c50.n1;
import c50.o4;
import c50.p1;
import c50.q1;
import c50.r1;
import c50.s4;
import c50.v;
import java.util.List;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import pc.m0;
import pc.w;
import t3.s1;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final List f715a;

    /* renamed from: b, reason: collision with root package name */
    public static final List f716b;

    static {
        a10.e eVar = r1.f26261a;
        w l13 = n60.o.l(eVar, "fullName", "name", "type");
        q0 q0Var = q0.f80391a;
        List selections = e0.b(new pc.m("fullName", l13, null, q0Var, q0Var, q0Var));
        f715a = selections;
        pc.m mVar = new pc.m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        pc.m mVar2 = new pc.m("id", s1.g(p1.f26217a, "id", "name", "type"), null, q0Var, q0Var, q0Var);
        pc.m mVar3 = new pc.m("entityId", ep.b.s(eVar, "entityId", "name", "type"), null, q0Var, q0Var, q0Var);
        pc.m mVar4 = new pc.m("pinCount", ep.b.u(q1.f26239a, "pinCount", "name", "type"), null, q0Var, q0Var, q0Var);
        pc.m mVar5 = new pc.m("privacy", n60.o.m(v.f26390a, "privacy", "name", "type"), null, q0Var, q0Var, q0Var);
        pc.m mVar6 = new pc.m("name", n60.o.l(eVar, "name", "name", "type"), null, q0Var, q0Var, q0Var);
        m0 w13 = ep.b.w(s4.f26288a, "owner", "name", "type");
        Intrinsics.checkNotNullParameter(selections, "selections");
        pc.m mVar7 = new pc.m("owner", w13, null, q0Var, q0Var, selections);
        pc.p type = pc.o.a(eVar.y());
        Intrinsics.checkNotNullParameter("pinThumbnailUrls", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        pc.m mVar8 = new pc.m("pinThumbnailUrls", type, null, q0Var, q0Var, q0Var);
        a10.e eVar2 = o4.f26199a;
        f716b = f0.j(mVar, mVar2, mVar3, mVar4, mVar5, mVar6, mVar7, mVar8, new pc.m("imageCoverHdUrl", n60.o.l(eVar2, "imageCoverHdUrl", "name", "type"), null, q0Var, q0Var, q0Var), new pc.m("hasCustomCover", n60.o.m(n1.f26170a, "hasCustomCover", "name", "type"), null, q0Var, q0Var, q0Var), new pc.m("imageCoverUrl", n60.o.l(eVar2, "imageCoverUrl", "name", "type"), null, q0Var, q0Var, q0Var));
    }
}
