package dq2;

import java.util.Hashtable;
import yp2.c;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Hashtable f56142a;

    /* renamed from: b, reason: collision with root package name */
    public static final Hashtable f56143b;

    /* renamed from: c, reason: collision with root package name */
    public static final Hashtable f56144c;

    static {
        cq2.a aVar = new cq2.a(11);
        cq2.a aVar2 = new cq2.a(12);
        cq2.a aVar3 = new cq2.a(13);
        cq2.a aVar4 = new cq2.a(14);
        cq2.a aVar5 = new cq2.a(15);
        cq2.a aVar6 = new cq2.a(16);
        cq2.a aVar7 = new cq2.a(17);
        cq2.a aVar8 = new cq2.a(18);
        cq2.a aVar9 = new cq2.a(19);
        cq2.a aVar10 = new cq2.a(6);
        cq2.a aVar11 = new cq2.a(7);
        cq2.a aVar12 = new cq2.a(8);
        cq2.a aVar13 = new cq2.a(9);
        cq2.a aVar14 = new cq2.a(10);
        f56142a = new Hashtable();
        f56143b = new Hashtable();
        f56144c = new Hashtable();
        a("brainpoolp160r1", b.f56145a, aVar);
        a("brainpoolp160t1", b.f56146b, aVar2);
        a("brainpoolp192r1", b.f56147c, aVar3);
        a("brainpoolp192t1", b.f56148d, aVar4);
        a("brainpoolp224r1", b.f56149e, aVar5);
        a("brainpoolp224t1", b.f56150f, aVar6);
        a("brainpoolp256r1", b.f56151g, aVar7);
        a("brainpoolp256t1", b.f56152h, aVar8);
        a("brainpoolp320r1", b.f56153i, aVar9);
        a("brainpoolp320t1", b.f56154j, aVar10);
        a("brainpoolp384r1", b.f56155k, aVar11);
        a("brainpoolp384t1", b.f56156l, aVar12);
        a("brainpoolp512r1", b.f56157m, aVar13);
        a("brainpoolp512t1", b.f56158n, aVar14);
    }

    public static void a(String str, c cVar, cq2.a aVar) {
        f56142a.put(str, cVar);
        f56144c.put(cVar, str);
        f56143b.put(cVar, aVar);
    }
}
