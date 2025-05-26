package a50;

import c50.q1;
import c50.r1;
import java.util.List;
import kotlin.collections.f0;
import kotlin.collections.q0;

/* loaded from: classes5.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final List f742a;

    static {
        a10.e eVar = r1.f26261a;
        pc.r s13 = ep.b.s(eVar, "__typename", "name", "type");
        q0 q0Var = q0.f80391a;
        pc.m mVar = new pc.m("__typename", s13, null, q0Var, q0Var, q0Var);
        pc.m mVar2 = new pc.m("type", n60.o.l(eVar, "type", "name", "type"), null, q0Var, q0Var, q0Var);
        pc.m mVar3 = new pc.m("dominantColor", n60.o.l(eVar, "dominantColor", "name", "type"), null, q0Var, q0Var, q0Var);
        bz.h hVar = q1.f26239a;
        f742a = f0.j(mVar, mVar2, mVar3, new pc.m("width", ep.b.u(hVar, "width", "name", "type"), null, q0Var, q0Var, q0Var), new pc.m("height", ep.b.u(hVar, "height", "name", "type"), null, q0Var, q0Var, q0Var), new pc.m("url", n60.o.l(eVar, "url", "name", "type"), null, q0Var, q0Var, q0Var));
    }
}
