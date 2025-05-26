package g50;

import a10.e;
import bz.h;
import c50.d;
import c50.f;
import c50.g;
import c50.h4;
import c50.i4;
import c50.j4;
import c50.q1;
import c50.r1;
import c50.t3;
import c50.v3;
import c50.w2;
import c50.w3;
import java.util.List;
import kotlin.collections.f0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import n60.o;
import pc.m;
import pc.m0;
import pc.p;
import pc.w;

/* loaded from: classes5.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final List f63560a;

    /* renamed from: b, reason: collision with root package name */
    public static final List f63561b;

    /* renamed from: c, reason: collision with root package name */
    public static final List f63562c;

    /* renamed from: d, reason: collision with root package name */
    public static final List f63563d;

    /* renamed from: e, reason: collision with root package name */
    public static final List f63564e;

    /* renamed from: f, reason: collision with root package name */
    public static final List f63565f;

    /* renamed from: g, reason: collision with root package name */
    public static final List f63566g;

    /* renamed from: h, reason: collision with root package name */
    public static final List f63567h;

    /* renamed from: i, reason: collision with root package name */
    public static final List f63568i;

    /* renamed from: j, reason: collision with root package name */
    public static final List f63569j;

    /* renamed from: k, reason: collision with root package name */
    public static final List f63570k;

    /* renamed from: l, reason: collision with root package name */
    public static final List f63571l;

    /* renamed from: m, reason: collision with root package name */
    public static final List f63572m;

    static {
        m0 m0Var;
        h hVar = q1.f26239a;
        w u13 = ep.b.u(hVar, "storyPinBlockId", "name", "type");
        q0 q0Var = q0.f80391a;
        List selections = f0.j(new m("storyPinBlockId", u13, null, q0Var, q0Var, q0Var), new m("storyPinPageId", ep.b.u(hVar, "storyPinPageId", "name", "type"), null, q0Var, q0Var, q0Var));
        f63560a = selections;
        m mVar = new m("length", ep.b.u(hVar, "length", "name", "type"), null, q0Var, q0Var, q0Var);
        e eVar = r1.f26261a;
        m mVar2 = new m("link", o.l(eVar, "link", "name", "type"), null, q0Var, q0Var, q0Var);
        w2 w2Var = j4.f26087a;
        m0 type = w2Var.c();
        Intrinsics.checkNotNullParameter("metadata", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(selections, "selections");
        m mVar3 = new m("metadata", type, null, q0Var, q0Var, selections);
        m mVar4 = new m("objectId", o.l(eVar, "objectId", "name", "type"), null, q0Var, q0Var, q0Var);
        m mVar5 = new m("offset", ep.b.u(hVar, "offset", "name", "type"), null, q0Var, q0Var, q0Var);
        w2 w2Var2 = h4.f26040a;
        w type2 = w2Var2.b();
        Intrinsics.checkNotNullParameter("tagType", "name");
        Intrinsics.checkNotNullParameter(type2, "type");
        List selections2 = f0.j(mVar, mVar2, mVar3, mVar4, mVar5, new m("tagType", type2, null, q0Var, q0Var, q0Var));
        f63561b = selections2;
        m mVar6 = new m("text", o.l(eVar, "text", "name", "type"), null, q0Var, q0Var, q0Var);
        w2 w2Var3 = i4.f26063a;
        p type3 = pc.o.a(pc.o.b(w2Var3.c()));
        Intrinsics.checkNotNullParameter("textTags", "name");
        Intrinsics.checkNotNullParameter(type3, "type");
        Intrinsics.checkNotNullParameter(selections2, "selections");
        List selections3 = f0.j(mVar6, new m("textTags", type3, null, q0Var, q0Var, selections2));
        f63562c = selections3;
        m mVar7 = new m("link", o.l(eVar, "link", "name", "type"), null, q0Var, q0Var, q0Var);
        w type4 = eVar.y();
        Intrinsics.checkNotNullParameter("text", "name");
        Intrinsics.checkNotNullParameter(type4, "type");
        List selections4 = f0.j(mVar7, new m("text", type4, null, q0Var, q0Var, q0Var));
        f63563d = selections4;
        List selections5 = f0.j(new m("link", o.l(eVar, "link", "name", "type"), null, q0Var, q0Var, q0Var), new m("text", o.l(eVar, "text", "name", "type"), null, q0Var, q0Var, q0Var));
        f63564e = selections5;
        m mVar8 = new m("length", ep.b.u(hVar, "length", "name", "type"), null, q0Var, q0Var, q0Var);
        m mVar9 = new m("link", o.l(eVar, "link", "name", "type"), null, q0Var, q0Var, q0Var);
        m mVar10 = new m("objectId", o.l(eVar, "objectId", "name", "type"), null, q0Var, q0Var, q0Var);
        m mVar11 = new m("offset", ep.b.u(hVar, "offset", "name", "type"), null, q0Var, q0Var, q0Var);
        w type5 = w2Var2.b();
        Intrinsics.checkNotNullParameter("tagType", "name");
        Intrinsics.checkNotNullParameter(type5, "type");
        List selections6 = f0.j(mVar8, mVar9, mVar10, mVar11, new m("tagType", type5, null, q0Var, q0Var, q0Var));
        f63565f = selections6;
        m mVar12 = new m("text", o.l(eVar, "text", "name", "type"), null, q0Var, q0Var, q0Var);
        p type6 = pc.o.a(pc.o.b(w2Var3.c()));
        Intrinsics.checkNotNullParameter("textTags", "name");
        Intrinsics.checkNotNullParameter(type6, "type");
        Intrinsics.checkNotNullParameter(selections6, "selections");
        List selections7 = f0.j(mVar12, new m("textTags", type6, null, q0Var, q0Var, selections6));
        f63566g = selections7;
        List selections8 = f0.j(new m("storyPinBlockId", ep.b.u(hVar, "storyPinBlockId", "name", "type"), null, q0Var, q0Var, q0Var), new m("storyPinPageId", ep.b.u(hVar, "storyPinPageId", "name", "type"), null, q0Var, q0Var, q0Var));
        f63567h = selections8;
        m mVar13 = new m("length", ep.b.u(hVar, "length", "name", "type"), null, q0Var, q0Var, q0Var);
        m mVar14 = new m("link", o.l(eVar, "link", "name", "type"), null, q0Var, q0Var, q0Var);
        m0 type7 = w2Var.c();
        Intrinsics.checkNotNullParameter("metadata", "name");
        Intrinsics.checkNotNullParameter(type7, "type");
        Intrinsics.checkNotNullParameter(selections8, "selections");
        m mVar15 = new m("metadata", type7, null, q0Var, q0Var, selections8);
        m mVar16 = new m("objectId", o.l(eVar, "objectId", "name", "type"), null, q0Var, q0Var, q0Var);
        m mVar17 = new m("offset", ep.b.u(hVar, "offset", "name", "type"), null, q0Var, q0Var, q0Var);
        w type8 = w2Var2.b();
        Intrinsics.checkNotNullParameter("tagType", "name");
        Intrinsics.checkNotNullParameter(type8, "type");
        List selections9 = f0.j(mVar13, mVar14, mVar15, mVar16, mVar17, new m("tagType", type8, null, q0Var, q0Var, q0Var));
        f63568i = selections9;
        m mVar18 = new m("text", o.l(eVar, "text", "name", "type"), null, q0Var, q0Var, q0Var);
        p type9 = pc.o.a(pc.o.b(w2Var3.c()));
        Intrinsics.checkNotNullParameter("textTags", "name");
        Intrinsics.checkNotNullParameter(type9, "type");
        Intrinsics.checkNotNullParameter(selections9, "selections");
        List selections10 = f0.j(mVar18, new m("textTags", type9, null, q0Var, q0Var, selections9));
        f63569j = selections10;
        m0 type10 = c50.e.f25960a.a();
        Intrinsics.checkNotNullParameter("button", "name");
        Intrinsics.checkNotNullParameter(type10, "type");
        Intrinsics.checkNotNullParameter(selections5, "selections");
        m mVar19 = new m("button", type10, null, q0Var, q0Var, selections5);
        d dVar = c50.h.f26031a;
        m0 type11 = dVar.a();
        Intrinsics.checkNotNullParameter("description", "name");
        Intrinsics.checkNotNullParameter(type11, "type");
        Intrinsics.checkNotNullParameter(selections7, "selections");
        m mVar20 = new m("description", type11, null, q0Var, q0Var, selections7);
        m0 type12 = dVar.a();
        Intrinsics.checkNotNullParameter("title", "name");
        Intrinsics.checkNotNullParameter(type12, "type");
        Intrinsics.checkNotNullParameter(selections10, "selections");
        List selections11 = f0.j(mVar19, mVar20, new m("title", type12, null, q0Var, q0Var, selections10));
        f63570k = selections11;
        w type13 = v3.f26398a.b();
        Intrinsics.checkNotNullParameter("style", "name");
        Intrinsics.checkNotNullParameter(type13, "type");
        m mVar21 = new m("style", type13, null, q0Var, q0Var, q0Var);
        m mVar22 = new m("title", o.l(eVar, "title", "name", "type"), null, q0Var, q0Var, q0Var);
        m0 type14 = dVar.a();
        Intrinsics.checkNotNullParameter("description", "name");
        Intrinsics.checkNotNullParameter(type14, "type");
        Intrinsics.checkNotNullParameter(selections3, "selections");
        m mVar23 = new m("description", type14, null, q0Var, q0Var, selections3);
        m0 type15 = f.f25984a.a();
        Intrinsics.checkNotNullParameter("footer", "name");
        Intrinsics.checkNotNullParameter(type15, "type");
        Intrinsics.checkNotNullParameter(selections4, "selections");
        m mVar24 = new m("footer", type15, null, q0Var, q0Var, selections4);
        switch (c50.c.f25914a.f133040a) {
            case 28:
                m0Var = c50.b.f25891b;
                break;
            default:
                m0Var = c50.c.f25915b;
                break;
        }
        p type16 = pc.o.a(pc.o.b(m0Var));
        Intrinsics.checkNotNullParameter("actions", "name");
        Intrinsics.checkNotNullParameter(type16, "type");
        Intrinsics.checkNotNullParameter(selections11, "selections");
        List selections12 = f0.j(mVar21, mVar22, mVar23, mVar24, new m("actions", type16, null, q0Var, q0Var, selections11));
        f63571l = selections12;
        w type17 = t3.f26307a.b();
        Intrinsics.checkNotNullParameter("advisory", "name");
        Intrinsics.checkNotNullParameter(type17, "type");
        m mVar25 = new m("advisory", type17, null, q0Var, q0Var, q0Var);
        w type18 = w3.f26419a.b();
        Intrinsics.checkNotNullParameter("severity", "name");
        Intrinsics.checkNotNullParameter(type18, "type");
        m mVar26 = new m("severity", type18, null, q0Var, q0Var, q0Var);
        p type19 = pc.o.a(pc.o.b(g.f26008a.a()));
        Intrinsics.checkNotNullParameter("notices", "name");
        Intrinsics.checkNotNullParameter(type19, "type");
        Intrinsics.checkNotNullParameter(selections12, "selections");
        f63572m = f0.j(mVar25, mVar26, new m("notices", type19, null, q0Var, q0Var, selections12));
    }

    public static List a() {
        return f63572m;
    }
}
