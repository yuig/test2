package a50;

import c50.i1;
import c50.r1;
import java.util.List;
import kotlin.collections.f0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final List f717a;

    /* renamed from: b, reason: collision with root package name */
    public static final List f718b;

    static {
        a10.e eVar = r1.f26261a;
        pc.r s13 = ep.b.s(eVar, "message", "name", "type");
        q0 q0Var = q0.f80391a;
        List selections = f0.j(new pc.m("message", s13, null, q0Var, q0Var, q0Var), new pc.m("paramPath", n60.o.l(eVar, "paramPath", "name", "type"), null, q0Var, q0Var, q0Var));
        f717a = selections;
        pc.m mVar = new pc.m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        pc.r type = pc.o.b(i1.f26057a.d());
        Intrinsics.checkNotNullParameter("error", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(selections, "selections");
        f718b = f0.j(mVar, new pc.m("error", type, null, q0Var, q0Var, selections));
    }

    public static List a() {
        return f718b;
    }
}
