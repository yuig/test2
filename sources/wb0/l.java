package wb0;

import b4.q0;
import i2.n;
import i2.o;
import i2.s;
import i2.w3;

/* loaded from: classes5.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final j f129004a = new j(-1, "", k.f129003i);

    public static final i a(o oVar) {
        s sVar = (s) oVar;
        sVar.W(1291092876);
        sVar.W(-1621736212);
        w3 w3Var = fc0.h.f61707g;
        fc0.g gVar = (fc0.g) ((fc0.f) sVar.m(w3Var));
        int i13 = gVar.f61695a;
        sVar.W(353574316);
        long j13 = gVar.f61699e;
        boolean g13 = sVar.g(j13);
        Object J2 = sVar.J();
        am.d dVar = n.f71185a;
        if (g13 || J2 == dVar) {
            J2 = new f(72, j13, 24);
            sVar.g0(J2);
        }
        f fVar = (f) J2;
        sVar.r(false);
        sVar.r(false);
        sVar.W(-1965887892);
        fc0.g gVar2 = (fc0.g) ((fc0.f) sVar.m(w3Var));
        int i14 = gVar2.f61695a;
        sVar.W(-265275538);
        long j14 = gVar2.f61700f;
        boolean g14 = sVar.g(j14);
        Object J3 = sVar.J();
        if (g14 || J3 == dVar) {
            J3 = new g(24, j14);
            sVar.g0(J3);
        }
        sVar.r(false);
        sVar.r(false);
        sVar.W(1305706533);
        q0 q0Var = ((fc0.a) sVar.m(fc0.c.f61692i)).f61678b;
        fc0.g gVar3 = (fc0.g) ((fc0.f) sVar.m(w3Var));
        int i15 = gVar3.f61695a;
        q0 a13 = q0.a(0, 16777214, gVar3.f61697c, 0L, 0L, 0L, null, q0Var, null, null, null);
        sVar.r(false);
        i iVar = new i(fVar, (g) J3, a13, 6);
        sVar.r(false);
        return iVar;
    }
}
