package a50;

import c50.h3;
import c50.n1;
import c50.p1;
import c50.r1;
import java.util.List;
import kotlin.collections.f0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import pc.m0;
import t3.s1;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final List f713a;

    /* renamed from: b, reason: collision with root package name */
    public static final List f714b;

    static {
        a10.e eVar = r1.f26261a;
        pc.r s13 = ep.b.s(eVar, "__typename", "name", "type");
        q0 q0Var = q0.f80391a;
        pc.m mVar = new pc.m("__typename", s13, null, q0Var, q0Var, q0Var);
        List q13 = ep.b.q("PhoneCountryCode", "PhoneCountryCode", "typeCondition", "possibleTypes");
        List selections = l.f747a;
        Intrinsics.checkNotNullParameter(selections, "selections");
        List selections2 = f0.j(mVar, new pc.n("PhoneCountryCode", q13, q0Var, selections));
        f713a = selections2;
        pc.m mVar2 = new pc.m("__typename", ep.b.s(eVar, "__typename", "name", "type"), null, q0Var, q0Var, q0Var);
        pc.m mVar3 = new pc.m("id", s1.g(p1.f26217a, "id", "name", "type"), null, q0Var, q0Var, q0Var);
        pc.m mVar4 = new pc.m("enableProfileMessage", n60.o.m(n1.f26170a, "enableProfileMessage", "name", "type"), null, q0Var, q0Var, q0Var);
        pc.m mVar5 = new pc.m("entityId", ep.b.s(eVar, "entityId", "name", "type"), null, q0Var, q0Var, q0Var);
        pc.m mVar6 = new pc.m("businessName", n60.o.l(eVar, "businessName", "name", "type"), null, q0Var, q0Var, q0Var);
        pc.m mVar7 = new pc.m("contactPhone", n60.o.l(eVar, "contactPhone", "name", "type"), null, q0Var, q0Var, q0Var);
        pc.m mVar8 = new pc.m("contactEmail", n60.o.l(eVar, "contactEmail", "name", "type"), null, q0Var, q0Var, q0Var);
        m0 v13 = ep.b.v(h3.f26038a, "contactPhoneCountry", "name", "type");
        Intrinsics.checkNotNullParameter(selections2, "selections");
        f714b = f0.j(mVar2, mVar3, mVar4, mVar5, mVar6, mVar7, mVar8, new pc.m("contactPhoneCountry", v13, null, q0Var, q0Var, selections2));
    }
}
