package w40;

import c50.q1;
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
import pc.t;
import pc.w;

/* loaded from: classes5.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final List f127961a;

    /* renamed from: b, reason: collision with root package name */
    public static final List f127962b;

    /* renamed from: c, reason: collision with root package name */
    public static final List f127963c;

    static {
        w u13 = ep.b.u(q1.f26239a, "followerCount", "name", "type");
        q0 q0Var = q0.f80391a;
        List selections = e0.b(new m("followerCount", u13, null, q0Var, q0Var, q0Var));
        f127961a = selections;
        m mVar = new m("__typename", ep.b.s(r1.f26261a, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        List q13 = ep.b.q("User", "User", "typeCondition", "possibleTypes");
        Intrinsics.checkNotNullParameter(selections, "selections");
        List selections2 = f0.j(mVar, new n("User", q13, q0Var, selections));
        f127962b = selections2;
        g0 type = s2.f26285a;
        Intrinsics.checkNotNullParameter("node", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        t tVar = new t("id");
        Intrinsics.checkNotNullParameter("id", "name");
        List arguments = e0.b(new j("id", tVar, false));
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(selections2, "selections");
        f127963c = e0.b(new m("node", type, null, q0Var, arguments, selections2));
    }
}
