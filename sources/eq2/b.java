package eq2;

import java.util.Hashtable;

/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final Hashtable f59929a;

    /* renamed from: b, reason: collision with root package name */
    public static final Hashtable f59930b;

    /* renamed from: c, reason: collision with root package name */
    public static final Hashtable f59931c;

    static {
        a aVar = new a(0);
        a aVar2 = new a(5);
        a aVar3 = new a(6);
        a aVar4 = new a(7);
        a aVar5 = new a(8);
        a aVar6 = new a(9);
        a aVar7 = new a(10);
        a aVar8 = new a(11);
        a aVar9 = new a(12);
        cq2.a aVar10 = new cq2.a(20);
        cq2.a aVar11 = new cq2.a(21);
        cq2.a aVar12 = new cq2.a(22);
        cq2.a aVar13 = new cq2.a(23);
        cq2.a aVar14 = new cq2.a(24);
        cq2.a aVar15 = new cq2.a(25);
        cq2.a aVar16 = new cq2.a(26);
        cq2.a aVar17 = new cq2.a(27);
        cq2.a aVar18 = new cq2.a(28);
        cq2.a aVar19 = new cq2.a(29);
        a aVar20 = new a(1);
        a aVar21 = new a(2);
        a aVar22 = new a(3);
        a aVar23 = new a(4);
        f59929a = new Hashtable();
        f59930b = new Hashtable();
        f59931c = new Hashtable();
        a("prime192v1", g.f59956lo, aVar);
        a("prime192v2", g.f59957mo, aVar2);
        a("prime192v3", g.f59958no, aVar3);
        a("prime239v1", g.f59959oo, aVar4);
        a("prime239v2", g.f59960po, aVar5);
        a("prime239v3", g.qo, aVar6);
        a("prime256v1", g.f59961ro, aVar7);
        a("c2pnb163v1", g.Vn, aVar8);
        a("c2pnb163v2", g.Wn, aVar9);
        a("c2pnb163v3", g.Xn, aVar10);
        a("c2pnb176w1", g.Yn, aVar11);
        a("c2tnb191v1", g.Zn, aVar12);
        a("c2tnb191v2", g.f59946ao, aVar13);
        a("c2tnb191v3", g.f59947bo, aVar14);
        a("c2pnb208w1", g.f59948co, aVar15);
        a("c2tnb239v1", g.f1do, aVar16);
        a("c2tnb239v2", g.f59949eo, aVar17);
        a("c2tnb239v3", g.f59950fo, aVar18);
        a("c2pnb272w1", g.f59951go, aVar19);
        a("c2pnb304w1", g.f59952ho, aVar20);
        a("c2tnb359v1", g.f59953io, aVar21);
        a("c2pnb368w1", g.f59954jo, aVar22);
        a("c2tnb431r1", g.f59955ko, aVar23);
    }

    public static void a(String str, yp2.c cVar, e eVar) {
        f59929a.put(str, cVar);
        f59931c.put(cVar, str);
        f59930b.put(cVar, eVar);
    }
}
