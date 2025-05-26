package e40;

import c50.r1;
import java.util.List;
import kotlin.collections.f0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import pc.m;
import pc.o;
import pc.p;

/* loaded from: classes5.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final List f57180a;

    static {
        a10.e eVar = r1.f26261a;
        p type = o.a(o.b(eVar.y()));
        Intrinsics.checkNotNullParameter("text", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        q0 q0Var = q0.f80391a;
        f57180a = f0.j(new m("text", type, null, q0Var, q0Var, q0Var), new m("url", n60.o.l(eVar, "url", "name", "type"), null, q0Var, q0Var, q0Var), new m("key", n60.o.l(eVar, "key", "name", "type"), null, q0Var, q0Var, q0Var));
    }
}
