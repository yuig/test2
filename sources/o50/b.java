package o50;

import bz.h;
import c50.b4;
import c50.c4;
import c50.q1;
import c50.r1;
import java.util.List;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import pc.m;
import pc.m0;
import pc.n;
import pc.w;

/* loaded from: classes5.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final List f92909a;

    /* renamed from: b, reason: collision with root package name */
    public static final List f92910b;

    /* renamed from: c, reason: collision with root package name */
    public static final List f92911c;

    static {
        h hVar = q1.f26239a;
        w u13 = ep.b.u(hVar, "textAlignment", "name", "type");
        q0 q0Var = q0.f80391a;
        List selections = f0.j(new m("textAlignment", u13, null, q0Var, q0Var, q0Var), new m("topCornerRadius", ep.b.u(hVar, "topCornerRadius", "name", "type"), null, q0Var, q0Var, q0Var));
        f92909a = selections;
        m0 type = c4.f25923a.c();
        Intrinsics.checkNotNullParameter("headerDisplay", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(selections, "selections");
        List selections2 = e0.b(new m("headerDisplay", type, null, q0Var, q0Var, selections));
        f92910b = selections2;
        m mVar = new m("__typename", ep.b.s(r1.f26261a, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        List q13 = ep.b.q("Story", "Story", "typeCondition", "possibleTypes");
        List selections3 = a.f92908a;
        Intrinsics.checkNotNullParameter(selections3, "selections");
        n nVar = new n("Story", q13, q0Var, selections3);
        m0 type2 = b4.f25900a.c();
        Intrinsics.checkNotNullParameter("displayOptions", "name");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(selections2, "selections");
        f92911c = f0.j(mVar, nVar, new m("displayOptions", type2, null, q0Var, q0Var, selections2));
    }

    public static List a() {
        return f92911c;
    }
}
