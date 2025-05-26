package h50;

import a10.e;
import a50.k;
import c50.r1;
import c50.s2;
import java.util.List;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import pc.g0;
import pc.j;
import pc.m;
import pc.n;
import pc.r;
import pc.t;

/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final List f67672a;

    /* renamed from: b, reason: collision with root package name */
    public static final List f67673b;

    /* renamed from: c, reason: collision with root package name */
    public static final List f67674c;

    static {
        e eVar = r1.f26261a;
        r s13 = ep.b.s(eVar, "__typename", "name", "type");
        q0 q0Var = q0.f80391a;
        m mVar = new m("__typename", s13, null, q0Var, q0Var, q0Var);
        List q13 = ep.b.q("User", "User", "typeCondition", "possibleTypes");
        List selections = k.f746d;
        Intrinsics.checkNotNullParameter(selections, "selections");
        List selections2 = f0.j(mVar, new n("User", q13, q0Var, selections));
        f67672a = selections2;
        m mVar2 = new m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        List q14 = ep.b.q("User", "User", "typeCondition", "possibleTypes");
        Intrinsics.checkNotNullParameter(selections2, "selections");
        List selections3 = f0.j(mVar2, new n("User", q14, q0Var, selections2));
        f67673b = selections3;
        g0 type = s2.f26285a;
        Intrinsics.checkNotNullParameter("node", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        t tVar = new t("id");
        Intrinsics.checkNotNullParameter("id", "name");
        List arguments = e0.b(new j("id", tVar, false));
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(selections3, "selections");
        f67674c = e0.b(new m("node", type, null, q0Var, arguments, selections3));
    }
}
