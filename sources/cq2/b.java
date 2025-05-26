package cq2;

import hq2.e;
import hq2.f;
import java.math.BigInteger;
import java.util.Hashtable;
import kv0.p;

/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final Hashtable f53032a;

    /* renamed from: b, reason: collision with root package name */
    public static final Hashtable f53033b;

    /* renamed from: c, reason: collision with root package name */
    public static final Hashtable f53034c;

    static {
        zp2.a aVar = new zp2.a(13);
        zp2.a aVar2 = new zp2.a(24);
        zp2.a aVar3 = new zp2.a(29);
        a aVar4 = new a(0);
        a aVar5 = new a(1);
        a aVar6 = new a(2);
        a aVar7 = new a(3);
        a aVar8 = new a(4);
        a aVar9 = new a(5);
        zp2.a aVar10 = new zp2.a(3);
        zp2.a aVar11 = new zp2.a(4);
        zp2.a aVar12 = new zp2.a(5);
        zp2.a aVar13 = new zp2.a(6);
        zp2.a aVar14 = new zp2.a(7);
        zp2.a aVar15 = new zp2.a(8);
        zp2.a aVar16 = new zp2.a(9);
        zp2.a aVar17 = new zp2.a(10);
        zp2.a aVar18 = new zp2.a(11);
        zp2.a aVar19 = new zp2.a(12);
        zp2.a aVar20 = new zp2.a(14);
        zp2.a aVar21 = new zp2.a(15);
        zp2.a aVar22 = new zp2.a(16);
        zp2.a aVar23 = new zp2.a(17);
        zp2.a aVar24 = new zp2.a(18);
        zp2.a aVar25 = new zp2.a(19);
        zp2.a aVar26 = new zp2.a(20);
        zp2.a aVar27 = new zp2.a(21);
        zp2.a aVar28 = new zp2.a(22);
        zp2.a aVar29 = new zp2.a(23);
        zp2.a aVar30 = new zp2.a(25);
        zp2.a aVar31 = new zp2.a(26);
        zp2.a aVar32 = new zp2.a(27);
        zp2.a aVar33 = new zp2.a(28);
        f53032a = new Hashtable();
        f53033b = new Hashtable();
        f53034c = new Hashtable();
        c("secp112r1", c.f53040f, aVar);
        c("secp112r2", c.f53041g, aVar2);
        c("secp128r1", c.f53054t, aVar3);
        c("secp128r2", c.f53055u, aVar4);
        c("secp160k1", c.f53043i, aVar5);
        c("secp160r1", c.f53042h, aVar6);
        c("secp160r2", c.f53056v, aVar7);
        c("secp192k1", c.f53057w, aVar8);
        c("secp192r1", c.F, aVar9);
        c("secp224k1", c.f53058x, aVar10);
        c("secp224r1", c.f53059y, aVar11);
        c("secp256k1", c.f53044j, aVar12);
        c("secp256r1", c.G, aVar13);
        c("secp384r1", c.f53060z, aVar14);
        c("secp521r1", c.A, aVar15);
        c("sect113r1", c.f53038d, aVar16);
        c("sect113r2", c.f53039e, aVar17);
        c("sect131r1", c.f53048n, aVar18);
        c("sect131r2", c.f53049o, aVar19);
        c("sect163k1", c.f53035a, aVar20);
        c("sect163r1", c.f53036b, aVar21);
        c("sect163r2", c.f53045k, aVar22);
        c("sect193r1", c.f53050p, aVar23);
        c("sect193r2", c.f53051q, aVar24);
        c("sect233k1", c.f53052r, aVar25);
        c("sect233r1", c.f53053s, aVar26);
        c("sect239k1", c.f53037c, aVar27);
        c("sect283k1", c.f53046l, aVar28);
        c("sect283r1", c.f53047m, aVar29);
        c("sect409k1", c.B, aVar30);
        c("sect409r1", c.C, aVar31);
        c("sect571k1", c.D, aVar32);
        c("sect571r1", c.E, aVar33);
    }

    public static BigInteger a(String str) {
        return new BigInteger(1, oq2.a.a(str));
    }

    public static f b(e eVar, lq2.a aVar) {
        k0.a b13 = eVar.b();
        b13.f77778b = new p(eVar, aVar);
        return b13.c();
    }

    public static void c(String str, yp2.c cVar, eq2.e eVar) {
        f53032a.put(str, cVar);
        f53034c.put(cVar, str);
        f53033b.put(cVar, eVar);
    }
}
