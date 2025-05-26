package fq2;

import eq2.e;
import hq2.f;
import java.util.Hashtable;
import java.util.Vector;
import kv0.p;
import nq2.c;

/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final Hashtable f62796a;

    /* renamed from: b, reason: collision with root package name */
    public static final Hashtable f62797b;

    /* renamed from: c, reason: collision with root package name */
    public static final Hashtable f62798c;

    /* renamed from: d, reason: collision with root package name */
    public static final Hashtable f62799d;

    /* renamed from: e, reason: collision with root package name */
    public static final Vector f62800e;

    static {
        eq2.a aVar = new eq2.a(23);
        a aVar2 = new a(4);
        a aVar3 = new a(8);
        a aVar4 = new a(9);
        a aVar5 = new a(10);
        a aVar6 = new a(11);
        a aVar7 = new a(12);
        a aVar8 = new a(13);
        a aVar9 = new a(14);
        eq2.a aVar10 = new eq2.a(13);
        eq2.a aVar11 = new eq2.a(14);
        eq2.a aVar12 = new eq2.a(15);
        eq2.a aVar13 = new eq2.a(16);
        eq2.a aVar14 = new eq2.a(17);
        eq2.a aVar15 = new eq2.a(18);
        eq2.a aVar16 = new eq2.a(19);
        eq2.a aVar17 = new eq2.a(20);
        eq2.a aVar18 = new eq2.a(21);
        eq2.a aVar19 = new eq2.a(22);
        eq2.a aVar20 = new eq2.a(24);
        eq2.a aVar21 = new eq2.a(25);
        eq2.a aVar22 = new eq2.a(26);
        eq2.a aVar23 = new eq2.a(27);
        eq2.a aVar24 = new eq2.a(28);
        eq2.a aVar25 = new eq2.a(29);
        a aVar26 = new a(0);
        a aVar27 = new a(1);
        a aVar28 = new a(2);
        a aVar29 = new a(3);
        a aVar30 = new a(5);
        a aVar31 = new a(6);
        a aVar32 = new a(7);
        Hashtable hashtable = new Hashtable();
        f62796a = hashtable;
        f62797b = new Hashtable();
        f62798c = new Hashtable();
        f62799d = new Hashtable();
        Vector vector = new Vector();
        f62800e = vector;
        vector.addElement("curve25519");
        hashtable.put(c.a("curve25519"), aVar);
        c("secp128r1", cq2.c.f53054t, aVar2);
        c("secp160k1", cq2.c.f53043i, aVar3);
        c("secp160r1", cq2.c.f53042h, aVar4);
        c("secp160r2", cq2.c.f53056v, aVar5);
        c("secp192k1", cq2.c.f53057w, aVar6);
        yp2.c cVar = cq2.c.F;
        c("secp192r1", cVar, aVar7);
        c("secp224k1", cq2.c.f53058x, aVar8);
        yp2.c cVar2 = cq2.c.f53059y;
        c("secp224r1", cVar2, aVar9);
        c("secp256k1", cq2.c.f53044j, aVar10);
        yp2.c cVar3 = cq2.c.G;
        c("secp256r1", cVar3, aVar11);
        yp2.c cVar4 = cq2.c.f53060z;
        c("secp384r1", cVar4, aVar12);
        yp2.c cVar5 = cq2.c.A;
        c("secp521r1", cVar5, aVar13);
        c("sect113r1", cq2.c.f53038d, aVar14);
        c("sect113r2", cq2.c.f53039e, aVar15);
        c("sect131r1", cq2.c.f53048n, aVar16);
        c("sect131r2", cq2.c.f53049o, aVar17);
        yp2.c cVar6 = cq2.c.f53035a;
        c("sect163k1", cVar6, aVar18);
        c("sect163r1", cq2.c.f53036b, aVar19);
        yp2.c cVar7 = cq2.c.f53045k;
        c("sect163r2", cVar7, aVar20);
        c("sect193r1", cq2.c.f53050p, aVar21);
        c("sect193r2", cq2.c.f53051q, aVar22);
        yp2.c cVar8 = cq2.c.f53052r;
        c("sect233k1", cVar8, aVar23);
        yp2.c cVar9 = cq2.c.f53053s;
        c("sect233r1", cVar9, aVar24);
        c("sect239k1", cq2.c.f53037c, aVar25);
        yp2.c cVar10 = cq2.c.f53046l;
        c("sect283k1", cVar10, aVar26);
        yp2.c cVar11 = cq2.c.f53047m;
        c("sect283r1", cVar11, aVar27);
        yp2.c cVar12 = cq2.c.B;
        c("sect409k1", cVar12, aVar28);
        yp2.c cVar13 = cq2.c.C;
        c("sect409r1", cVar13, aVar29);
        yp2.c cVar14 = cq2.c.D;
        c("sect571k1", cVar14, aVar30);
        yp2.c cVar15 = cq2.c.E;
        c("sect571r1", cVar15, aVar31);
        c("sm2p256v1", aq2.b.f20361a, aVar32);
        b("B-163", cVar7);
        b("B-233", cVar9);
        b("B-283", cVar11);
        b("B-409", cVar13);
        b("B-571", cVar15);
        b("K-163", cVar6);
        b("K-233", cVar8);
        b("K-283", cVar10);
        b("K-409", cVar12);
        b("K-571", cVar14);
        b("P-192", cVar);
        b("P-224", cVar2);
        b("P-256", cVar3);
        b("P-384", cVar4);
        b("P-521", cVar5);
    }

    public static f a(hq2.c cVar, lq2.a aVar) {
        k0.a b13 = cVar.b();
        b13.f77778b = new p(cVar, aVar);
        return b13.c();
    }

    public static void b(String str, yp2.c cVar) {
        Object obj = f62798c.get(cVar);
        if (obj == null) {
            throw new IllegalStateException();
        }
        String a13 = c.a(str);
        f62797b.put(a13, cVar);
        f62796a.put(a13, obj);
    }

    public static void c(String str, yp2.c cVar, e eVar) {
        f62800e.addElement(str);
        f62799d.put(cVar, str);
        f62798c.put(cVar, eVar);
        String a13 = c.a(str);
        f62797b.put(a13, cVar);
        f62796a.put(a13, eVar);
    }
}
