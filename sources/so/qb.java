package so;

import android.app.Application;
import android.content.Context;
import com.pinterest.api.model.deserializer.IdeaPinMusicMetadataDeserializer;
import com.pinterest.api.model.deserializer.OnebarmoduleDeserializer;
import com.pinterest.api.model.deserializer.PinDeserializer;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.nux.network.serialization.NuxUseCaseDeserializer;
import com.pinterest.nux.network.serialization.NuxUseCaseFeedDeserializer;
import com.pinterest.repository.pin.PinService;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class qb implements bf2.d {

    /* renamed from: a, reason: collision with root package name */
    public final oa f114076a;

    /* renamed from: b, reason: collision with root package name */
    public final u8 f114077b;

    /* renamed from: c, reason: collision with root package name */
    public final rb f114078c;

    /* renamed from: d, reason: collision with root package name */
    public final int f114079d;

    public qb(oa oaVar, u8 u8Var, rb rbVar, int i13) {
        this.f114076a = oaVar;
        this.f114077b = u8Var;
        this.f114078c = rbVar;
        this.f114079d = i13;
    }

    public final Object a() {
        bf2.d dVar;
        h6.q qVar;
        na naVar;
        bf2.d dVar2;
        na naVar2;
        bf2.d dVar3;
        h6.q qVar2;
        bf2.d dVar4;
        bf2.d dVar5;
        bf2.d dVar6;
        bf2.d dVar7;
        bf2.d dVar8;
        h6.q qVar3;
        bf2.d dVar9;
        na naVar3;
        bf2.d dVar10;
        na naVar4;
        na naVar5;
        bf2.d dVar11;
        bf2.d dVar12;
        bf2.d dVar13;
        w60.d C2;
        bf2.d dVar14;
        h6.q qVar4;
        bf2.d dVar15;
        na naVar6;
        na naVar7;
        bf2.d dVar16;
        na naVar8;
        bf2.d dVar17;
        bf2.a aVar;
        bf2.d dVar18;
        bf2.d dVar19;
        bf2.d dVar20;
        h6.q qVar5;
        bf2.d dVar21;
        bf2.d dVar22;
        bf2.d dVar23;
        bf2.d dVar24;
        w60.d C22;
        bf2.d dVar25;
        bf2.d dVar26;
        h6.q qVar6;
        bf2.d dVar27;
        bf2.d dVar28;
        bf2.d dVar29;
        na naVar9;
        na naVar10;
        bf2.d dVar30;
        bf2.d dVar31;
        h6.q qVar7;
        bf2.d dVar32;
        bf2.d dVar33;
        bf2.d dVar34;
        h6.q qVar8;
        bf2.d dVar35;
        bf2.d dVar36;
        bf2.d dVar37;
        h6.q qVar9;
        bf2.d dVar38;
        w60.d C23;
        bf2.d dVar39;
        h6.q qVar10;
        bf2.d dVar40;
        bf2.d dVar41;
        w60.d C24;
        bf2.d dVar42;
        bf2.a aVar2;
        h6.q qVar11;
        bf2.d dVar43;
        h6.q qVar12;
        bf2.d dVar44;
        bf2.d dVar45;
        bf2.d dVar46;
        bf2.d dVar47;
        bf2.d dVar48;
        bf2.d dVar49;
        bf2.d dVar50;
        h6.q qVar13;
        bf2.d dVar51;
        h6.q qVar14;
        bf2.d dVar52;
        bf2.d dVar53;
        na naVar11;
        bf2.d dVar54;
        bf2.a aVar3;
        na naVar12;
        bf2.d dVar55;
        h6.q qVar15;
        bf2.d dVar56;
        bf2.d dVar57;
        bf2.d dVar58;
        bf2.d dVar59;
        bf2.d dVar60;
        bf2.d dVar61;
        bf2.d dVar62;
        h6.q qVar16;
        na naVar13;
        na naVar14;
        bf2.d dVar63;
        bf2.d dVar64;
        bf2.d dVar65;
        bf2.d dVar66;
        h6.q qVar17;
        bf2.d dVar67;
        bf2.d dVar68;
        bf2.d dVar69;
        bf2.d dVar70;
        w60.d C25;
        h6.q qVar18;
        bf2.d dVar71;
        bf2.d dVar72;
        bf2.d dVar73;
        h6.q qVar19;
        bf2.d dVar74;
        bf2.d dVar75;
        h6.q qVar20;
        bf2.d dVar76;
        h6.q qVar21;
        bf2.d dVar77;
        bf2.d dVar78;
        bf2.d dVar79;
        h6.q qVar22;
        bf2.d dVar80;
        na naVar15;
        na naVar16;
        na naVar17;
        na naVar18;
        bf2.d dVar81;
        na naVar19;
        na naVar20;
        int i13 = 4;
        int i14 = 3;
        int i15 = 0;
        int i16 = 1;
        oa oaVar = this.f114076a;
        rb rbVar = this.f114078c;
        int i17 = this.f114079d;
        switch (i17) {
            case 0:
                dVar = rbVar.f114104c;
                ao2.j0 j0Var = (ao2.j0) dVar.get();
                qVar = oaVar.f113603b;
                Application h10 = com.pinterest.widget.configuration.k.h(qVar);
                vs.z s13 = rb.s(rbVar);
                naVar = oaVar.P6;
                es.a aVar4 = (es.a) naVar.get();
                dVar2 = oaVar.f113735i7;
                return new vs.h0(j0Var, h10, s13, aVar4, (es.h) dVar2.get());
            case 1:
                return a02.e.z4();
            case 2:
                naVar2 = oaVar.f113902s0;
                return com.pinterest.widget.configuration.k.s((Context) naVar2.get());
            case 3:
                lt.j jVar = new lt.j(i15);
                lt.g e03 = oa.e0(oaVar);
                dVar3 = rbVar.f114104c;
                ao2.j0 j0Var2 = (ao2.j0) dVar3.get();
                qVar2 = oaVar.f113603b;
                Application h13 = com.pinterest.widget.configuration.k.h(qVar2);
                dVar4 = oaVar.f113743ig;
                return new lt.m(jVar, e03, j0Var2, h13, (lt.i) dVar4.get());
            case 4:
                PinService pinService = (PinService) oaVar.f113713h3.get();
                dl1.t tVar = (dl1.t) oaVar.G3.get();
                zf0.f fVar = (zf0.f) oaVar.f113723hd.get();
                dVar5 = oaVar.f113730i2;
                nx.d1 d1Var = (nx.d1) dVar5.get();
                m60.d0 d0Var = (m60.d0) rbVar.f114119g.get();
                dVar6 = oaVar.f113850p0;
                b60.b bVar = (b60.b) dVar6.get();
                g31.e v13 = rb.v(rbVar);
                oa oaVar2 = rbVar.f114096a;
                f31.a0 a0Var = new f31.a0(oa.L1(oaVar2), rbVar.F2(), new g31.d((m60.w) oaVar2.f113885r0.get()));
                ob obVar = (ob) rbVar.f114123h.get();
                dVar7 = rbVar.f114127i;
                o82.s1 s1Var = (o82.s1) dVar7.get();
                g31.c u13 = rb.u(rbVar);
                g31.a aVar5 = new g31.a();
                dVar8 = rbVar.f114135k;
                zy.d0 d0Var2 = (zy.d0) dVar8.get();
                nu.b U0 = rb.U0(rbVar);
                qVar3 = oaVar.f113603b;
                Application h14 = com.pinterest.widget.configuration.k.h(qVar3);
                dVar9 = rbVar.f114104c;
                ao2.j0 j0Var3 = (ao2.j0) dVar9.get();
                naVar3 = oaVar.P6;
                es.a aVar6 = (es.a) naVar3.get();
                dVar10 = oaVar.f113735i7;
                return new c31.t(pinService, tVar, fVar, d1Var, d0Var, bVar, v13, a0Var, obVar, s1Var, u13, aVar5, d0Var2, U0, h14, j0Var3, aVar6, (es.h) dVar10.get());
            case 5:
                naVar4 = oaVar.f113902s0;
                Context context = (Context) naVar4.get();
                boolean D1 = bs1.c.D1();
                Intrinsics.checkNotNullParameter(context, "context");
                return new m60.d0(context, D1);
            case 6:
                return new ob(this);
            case 7:
                return new kb(this, 2);
            case 8:
                naVar5 = oaVar.f113885r0;
                m60.w wVar = (m60.w) naVar5.get();
                dVar11 = oaVar.F3;
                return new g31.g(wVar, (x02.i2) dVar11.get(), oaVar.S2());
            case 9:
                bz.i iVar = (bz.i) oaVar.C9.get();
                rd.j L1 = oa.L1(oaVar);
                dVar12 = oaVar.f113730i2;
                return new zy.d0(iVar, L1, (nx.d1) dVar12.get(), (nx.o0) oaVar.T1.get(), (ao2.j0) oaVar.G0.get());
            case 10:
                e12.d dVar82 = (e12.d) oaVar.V3.get();
                dVar13 = oaVar.F3;
                x02.i2 i2Var = (x02.i2) dVar13.get();
                x02.z0 z0Var = (x02.z0) oaVar.B3.get();
                mm0.c w13 = rb.w(rbVar);
                pm0.o K = rb.K(rbVar);
                p70.e eVar = new p70.e(rbVar.x2(), new i60.a(oa.L1(rbVar.f114096a), 3), (k92.l) rbVar.f114147n.get());
                um0.n0 k13 = rb.k1(rbVar);
                C2 = rbVar.C2();
                dVar14 = rbVar.f114135k;
                zy.d0 d0Var3 = (zy.d0) dVar14.get();
                qb0.a Z2 = a02.e.Z2();
                qVar4 = oaVar.f113603b;
                Application h15 = com.pinterest.widget.configuration.k.h(qVar4);
                dVar15 = rbVar.f114104c;
                return new jm0.a0(dVar82, i2Var, z0Var, w13, K, eVar, k13, C2, d0Var3, Z2, h15, (ao2.j0) dVar15.get());
            case 11:
                naVar6 = oaVar.f113902s0;
                Context context2 = (Context) naVar6.get();
                pb0.a aVar7 = (pb0.a) oaVar.f113834o1.get();
                vb0.c o03 = com.pinterest.widget.configuration.k.o0();
                naVar7 = oaVar.f113797m0;
                tb0.h hVar = (tb0.h) naVar7.get();
                i20.a B0 = oa.B0(oaVar);
                dVar16 = oaVar.f113921t1;
                i92.k kVar = (i92.k) dVar16.get();
                naVar8 = oaVar.f113885r0;
                m60.w wVar2 = (m60.w) naVar8.get();
                dVar17 = oaVar.f113850p0;
                b60.b bVar2 = (b60.b) dVar17.get();
                aVar = oaVar.O0;
                lb0.q qVar23 = (lb0.q) aVar.get();
                dVar18 = oaVar.f113622c1;
                return new ap.o(context2, aVar7, o03, hVar, B0, kVar, wVar2, bVar2, qVar23, (lb0.r) dVar18.get());
            case 12:
                return new k92.l(oa.R1(oaVar));
            case 13:
                dVar19 = oaVar.Of;
                return new uc0.b((oc0.h) dVar19.get(), a02.e.a(), oa.l0(oaVar));
            case 14:
                dVar20 = rbVar.f114104c;
                return new jx1.t((ao2.j0) dVar20.get(), rb.y(rbVar), rb.x(rbVar));
            case 15:
                qVar5 = oaVar.f113603b;
                Application h16 = com.pinterest.widget.configuration.k.h(qVar5);
                dVar21 = rbVar.f114104c;
                ao2.j0 j0Var4 = (ao2.j0) dVar21.get();
                w91.f C = rb.C(rbVar);
                dVar22 = rbVar.f114147n;
                return new v91.v(h16, j0Var4, C, (k92.l) dVar22.get());
            case 16:
                e12.d dVar83 = (e12.d) oaVar.V3.get();
                dVar23 = oaVar.F3;
                x02.i2 i2Var2 = (x02.i2) dVar23.get();
                lh0.r E = rb.E(rbVar);
                dVar24 = rbVar.f114167s;
                fj0.c cVar = (fj0.c) dVar24.get();
                C22 = rbVar.C2();
                dVar25 = rbVar.f114135k;
                zy.d0 d0Var4 = (zy.d0) dVar25.get();
                dVar26 = rbVar.f114171t;
                pb pbVar = (pb) dVar26.get();
                m60.d0 d0Var5 = (m60.d0) rbVar.f114119g.get();
                dj0.k F = rb.F(rbVar);
                qVar6 = oaVar.f113603b;
                Application h17 = com.pinterest.widget.configuration.k.h(qVar6);
                dVar27 = rbVar.f114104c;
                return new cj0.e0(dVar83, i2Var2, E, cVar, C22, d0Var4, pbVar, d0Var5, F, h17, (ao2.j0) dVar27.get());
            case 17:
                dVar28 = oaVar.f113760jg;
                x02.x0 x0Var = (x02.x0) dVar28.get();
                dVar29 = oaVar.f113622c1;
                lb0.r rVar = (lb0.r) dVar29.get();
                naVar9 = oaVar.f113885r0;
                m60.w wVar3 = (m60.w) naVar9.get();
                b20.c R1 = oa.R1(oaVar);
                naVar10 = oaVar.f113797m0;
                return new fj0.c(x0Var, rVar, wVar3, R1, (ob0.a) naVar10.get());
            case 18:
                return new pb(this);
            case 19:
                dVar30 = oaVar.Of;
                return new uc0.d((oc0.h) dVar30.get(), oa.o0(oaVar), a02.e.a());
            case 20:
                dVar31 = oaVar.Of;
                return new uc0.f((oc0.h) dVar31.get(), oa.p0(oaVar), a02.e.a());
            case 21:
                qVar7 = oaVar.f113603b;
                Application h18 = com.pinterest.widget.configuration.k.h(qVar7);
                dVar32 = rbVar.f114104c;
                ao2.j0 j0Var5 = (ao2.j0) dVar32.get();
                k22.m mVar = (k22.m) oaVar.Y4.get();
                ws.q qVar24 = new ws.q(7);
                zb0.i t13 = rb.t(rbVar);
                dVar33 = rbVar.f114135k;
                zy.d0 d0Var6 = (zy.d0) dVar33.get();
                dVar34 = rbVar.f114147n;
                return new x91.l0(h18, j0Var5, mVar, qVar24, t13, d0Var6, (k92.l) dVar34.get());
            case 22:
                qVar8 = oaVar.f113603b;
                Application h19 = com.pinterest.widget.configuration.k.h(qVar8);
                dVar35 = rbVar.f114104c;
                ao2.j0 j0Var6 = (ao2.j0) dVar35.get();
                v60.d B = rb.B(rbVar);
                w60.d A = rb.A(rbVar);
                nu.a z13 = rb.z(rbVar);
                dVar36 = rbVar.f114135k;
                zy.d0 d0Var7 = (zy.d0) dVar36.get();
                ta0.v j03 = rb.j0(rbVar);
                dVar37 = rbVar.f114147n;
                return new com.pinterest.boardAutoCollages.m0(h19, j0Var6, B, A, z13, d0Var7, j03, (k92.l) dVar37.get());
            case 23:
                qVar9 = oaVar.f113603b;
                Application h23 = com.pinterest.widget.configuration.k.h(qVar9);
                dVar38 = rbVar.f114104c;
                ao2.j0 j0Var7 = (ao2.j0) dVar38.get();
                gx.e D = rb.D(rbVar);
                C23 = rbVar.C2();
                return new fk0.x(h23, j0Var7, D, C23);
            case 24:
                v60.d G = rb.G(rbVar);
                tu.d0 H = rb.H(rbVar);
                dVar39 = rbVar.f114135k;
                zy.d0 d0Var8 = (zy.d0) dVar39.get();
                qVar10 = oaVar.f113603b;
                Application h24 = com.pinterest.widget.configuration.k.h(qVar10);
                dVar40 = rbVar.f114104c;
                return new ml0.r0(G, H, d0Var8, h24, (ao2.j0) dVar40.get());
            case 25:
                tm0.i I = rb.I(rbVar);
                sm0.h J2 = rb.J(rbVar);
                p70.e eVar2 = new p70.e(rbVar.x2(), new i60.a(oa.L1(rbVar.f114096a), 3), (k92.l) rbVar.f114147n.get());
                dVar41 = rbVar.f114135k;
                zy.d0 d0Var9 = (zy.d0) dVar41.get();
                C24 = rbVar.C2();
                zb0.i t14 = rb.t(rbVar);
                dVar42 = rbVar.f114147n;
                k92.l lVar = (k92.l) dVar42.get();
                e12.d dVar84 = (e12.d) oaVar.V3.get();
                aVar2 = oaVar.f113765k3;
                x02.x0 x0Var2 = (x02.x0) aVar2.get();
                qVar11 = oaVar.f113603b;
                Application h25 = com.pinterest.widget.configuration.k.h(qVar11);
                dVar43 = rbVar.f114104c;
                return new qm0.z1(I, J2, eVar2, d0Var9, C24, t14, lVar, dVar84, x0Var2, h25, (ao2.j0) dVar43.get());
            case 26:
                qVar12 = oaVar.f113603b;
                Application h26 = com.pinterest.widget.configuration.k.h(qVar12);
                dVar44 = rbVar.f114104c;
                ao2.j0 j0Var8 = (ao2.j0) dVar44.get();
                dVar45 = oaVar.f113850p0;
                return new u52.p(h26, j0Var8, (b60.b) dVar45.get(), rb.N(rbVar), rb.M(rbVar), rb.H0(rbVar), rb.O(rbVar));
            case 27:
                dVar46 = rbVar.C;
                dl1.p pVar = (dl1.p) dVar46.get();
                dVar47 = rbVar.D;
                dl1.a0 a0Var2 = (dl1.a0) dVar47.get();
                dVar48 = rbVar.E;
                dl1.z zVar = (dl1.z) dVar48.get();
                dVar49 = rbVar.F;
                return new i12.d(pVar, a0Var2, zVar, (gl1.d) dVar49.get());
            case 28:
                return new i12.a();
            case 29:
                return new i12.b(oa.q0(oaVar));
            case 30:
                fl1.a policy = (fl1.a) oaVar.T2.get();
                Intrinsics.checkNotNullParameter(policy, "policy");
                dl2.b.I(policy);
                return policy;
            case 31:
                uj2.a0 a0Var3 = tk2.e.f118017c;
                Intrinsics.checkNotNullExpressionValue(a0Var3, "io(...)");
                return new gl1.c(a0Var3, 6);
            case 32:
                dVar50 = rbVar.f114104c;
                ao2.j0 j0Var9 = (ao2.j0) dVar50.get();
                qVar13 = oaVar.f113603b;
                Application h27 = com.pinterest.widget.configuration.k.h(qVar13);
                sk0.j x23 = rbVar.x2();
                oa oaVar3 = rbVar.f114096a;
                i60.a aVar8 = new i60.a(oa.L1(oaVar3), 3);
                p70.e A2 = rbVar.A2();
                i60.a aVar9 = new i60.a(oa.L1(oaVar3), 4);
                dVar51 = rbVar.f114147n;
                return new vn0.n(j0Var9, h27, x23, aVar8, A2, aVar9, (k92.l) dVar51.get());
            case 33:
                qVar14 = oaVar.f113603b;
                Application h28 = com.pinterest.widget.configuration.k.h(qVar14);
                dVar52 = rbVar.f114104c;
                ao2.j0 j0Var10 = (ao2.j0) dVar52.get();
                v60.d j23 = rb.j2(rbVar);
                v60.d V = rb.V(rbVar);
                v60.d Y1 = rb.Y1(rbVar);
                m7.c D0 = rb.D0(rbVar);
                p70.e u14 = rb.u1(rbVar);
                i60.a R = rb.R(rbVar);
                nu.a Q = rb.Q(rbVar);
                dVar53 = rbVar.f114135k;
                return new n70.t0(h28, j0Var10, j23, V, Y1, D0, u14, R, Q, (zy.d0) dVar53.get());
            case 34:
                zf0.f fVar2 = (zf0.f) oaVar.f113723hd.get();
                rg0.s sVar = (rg0.s) oaVar.Q5.get();
                ug0.i iVar2 = (ug0.i) oaVar.P5.get();
                naVar11 = oaVar.f113885r0;
                m60.w wVar4 = (m60.w) naVar11.get();
                dVar54 = oaVar.F3;
                x02.i2 i2Var3 = (x02.i2) dVar54.get();
                aVar3 = oaVar.f113765k3;
                x02.x0 x0Var3 = (x02.x0) aVar3.get();
                naVar12 = oaVar.R8;
                return new com.pinterest.feature.pin.j(fVar2, sVar, iVar2, wVar4, i2Var3, x0Var3, (nx.b0) naVar12.get());
            case 35:
                dVar55 = rbVar.f114104c;
                ao2.j0 j0Var11 = (ao2.j0) dVar55.get();
                qVar15 = oaVar.f113603b;
                Application h29 = com.pinterest.widget.configuration.k.h(qVar15);
                sk0.j x24 = rbVar.x2();
                oa oaVar4 = rbVar.f114096a;
                i60.a aVar10 = new i60.a(oa.L1(oaVar4), 3);
                p70.e A22 = rbVar.A2();
                i60.a aVar11 = new i60.a(oa.L1(oaVar4), 4);
                il0.u uVar = new il0.u();
                dVar56 = rbVar.f114135k;
                zy.d0 d0Var10 = (zy.d0) dVar56.get();
                dVar57 = rbVar.f114147n;
                return new il0.v(j0Var11, h29, x24, aVar10, A22, aVar11, uVar, d0Var10, (k92.l) dVar57.get());
            case 36:
                dVar58 = oaVar.Of;
                return new uc0.o((oc0.h) dVar58.get(), oa.s0(oaVar), a02.e.a());
            case 37:
                dVar59 = oaVar.Of;
                return new uc0.q((oc0.h) dVar59.get(), oa.t0(oaVar), a02.e.a());
            case 38:
                dVar60 = oaVar.Of;
                return new uc0.s((oc0.h) dVar60.get(), a02.e.a(), oa.u0(oaVar));
            case 39:
                dVar61 = oaVar.Of;
                return new uc0.u((oc0.h) dVar61.get(), oa.v0(oaVar), a02.e.a());
            case 40:
                dVar62 = rbVar.f114104c;
                ao2.j0 j0Var12 = (ao2.j0) dVar62.get();
                qVar16 = oaVar.f113603b;
                Application h33 = com.pinterest.widget.configuration.k.h(qVar16);
                ws.q qVar25 = new ws.q(i15);
                xs.d0 T = rb.T(rbVar);
                nu.b r13 = rb.r(rbVar);
                xs.f0 U = rb.U(rbVar);
                ob obVar2 = (ob) rbVar.f114123h.get();
                naVar13 = oaVar.P6;
                es.a aVar12 = (es.a) naVar13.get();
                naVar14 = oaVar.R8;
                nx.b0 b0Var = (nx.b0) naVar14.get();
                dVar63 = oaVar.Kb;
                ur.a aVar13 = (ur.a) dVar63.get();
                dVar64 = oaVar.f113735i7;
                es.h hVar2 = (es.h) dVar64.get();
                dVar65 = oaVar.f113813mg;
                return new ws.a0(j0Var12, h33, qVar25, T, r13, U, obVar2, aVar12, b0Var, aVar13, hVar2, (ws.x) dVar65.get());
            case 41:
                dVar66 = oaVar.Of;
                return new uc0.w((oc0.h) dVar66.get(), oa.w0(oaVar), a02.e.a());
            case 42:
                qVar17 = oaVar.f113603b;
                Application h34 = com.pinterest.widget.configuration.k.h(qVar17);
                dVar67 = rbVar.f114104c;
                ao2.j0 j0Var13 = (ao2.j0) dVar67.get();
                da1.c X = rb.X(rbVar);
                dVar68 = rbVar.f114135k;
                return new ca1.v(h34, j0Var13, X, (zy.d0) dVar68.get());
            case 43:
                fa1.n Y = rb.Y(rbVar);
                dVar69 = rbVar.f114147n;
                k92.l lVar2 = (k92.l) dVar69.get();
                dVar70 = rbVar.f114135k;
                zy.d0 d0Var11 = (zy.d0) dVar70.get();
                C25 = rbVar.C2();
                zb0.i t15 = rb.t(rbVar);
                lh0.m3 D2 = rbVar.D2();
                qVar18 = oaVar.f113603b;
                Application h35 = com.pinterest.widget.configuration.k.h(qVar18);
                dVar71 = rbVar.f114104c;
                return new ea1.q1(Y, lVar2, d0Var11, C25, t15, D2, h35, (ao2.j0) dVar71.get());
            case 44:
                da1.c Z = rb.Z(rbVar);
                dVar72 = rbVar.f114135k;
                zy.d0 d0Var12 = (zy.d0) dVar72.get();
                dVar73 = rbVar.f114147n;
                k92.l lVar3 = (k92.l) dVar73.get();
                lh0.m3 D22 = rbVar.D2();
                qVar19 = oaVar.f113603b;
                Application h36 = com.pinterest.widget.configuration.k.h(qVar19);
                dVar74 = rbVar.f114104c;
                return new ga1.x(Z, d0Var12, lVar3, D22, h36, (ao2.j0) dVar74.get());
            case 45:
                dVar75 = rbVar.f114104c;
                ao2.j0 j0Var14 = (ao2.j0) dVar75.get();
                qVar20 = oaVar.f113603b;
                return new z91.v(j0Var14, com.pinterest.widget.configuration.k.h(qVar20), new lt.j(17), rb.b0(rbVar));
            case 46:
                dVar76 = rbVar.f114104c;
                ao2.j0 j0Var15 = (ao2.j0) dVar76.get();
                qVar21 = oaVar.f113603b;
                return new aa1.z(j0Var15, com.pinterest.widget.configuration.k.h(qVar21), new lt.j(18), rb.c0(rbVar));
            case 47:
                lh0.d0 e04 = rb.e0(rbVar);
                zb0.i t16 = rb.t(rbVar);
                dVar77 = rbVar.X;
                z80.m mVar2 = (z80.m) dVar77.get();
                z80.b f03 = rb.f0(rbVar);
                ta0.v j04 = rb.j0(rbVar);
                z80.s v03 = rb.v0(rbVar);
                z80.x w03 = rb.w0(rbVar);
                t80.s G0 = rb.G0(rbVar);
                dVar78 = rbVar.f114135k;
                zy.d0 d0Var13 = (zy.d0) dVar78.get();
                z80.q u03 = rb.u0(rbVar);
                dVar79 = rbVar.f114097a0;
                z80.d dVar85 = (z80.d) dVar79.get();
                o22.a d03 = rb.d0(rbVar);
                qVar22 = oaVar.f113603b;
                Application h37 = com.pinterest.widget.configuration.k.h(qVar22);
                dVar80 = rbVar.f114104c;
                return new s80.p6(e04, t16, mVar2, f03, j04, v03, w03, G0, d0Var13, u03, dVar85, d03, h37, (ao2.j0) dVar80.get());
            case 48:
                naVar15 = oaVar.f113902s0;
                Context context3 = (Context) naVar15.get();
                h62.k kVar2 = (h62.k) oaVar.f113831ng.get();
                vh.a x03 = rb.x0(rbVar);
                o72.a aVar14 = (o72.a) oaVar.f113672eg.get();
                c72.b0 b0Var2 = (c72.b0) oaVar.f113846od.get();
                dv0.q z14 = oa.z1(oaVar);
                naVar16 = oaVar.f113797m0;
                return new z80.m(context3, kVar2, x03, aVar14, b0Var2, z14, (ob0.a) naVar16.get());
            case 49:
                lh0.j0 t03 = rb.t0(rbVar);
                naVar17 = oaVar.f113885r0;
                return new ab0.e(t03, (m60.w) naVar17.get());
            case 50:
                naVar18 = oaVar.f113902s0;
                return new a82.b((Context) naVar18.get(), (c72.b0) oaVar.f113846od.get(), oa.z1(oaVar), oaVar.a3(), (n72.b) oaVar.f113881qd.get());
            case 51:
                b20.c R12 = oa.R1(oaVar);
                ll.j B2 = rbVar.B2();
                dVar81 = oaVar.f113850p0;
                b60.b bVar3 = (b60.b) dVar81.get();
                naVar19 = oaVar.f113902s0;
                Context context4 = (Context) naVar19.get();
                naVar20 = oaVar.f113885r0;
                return new z80.d(R12, B2, bVar3, context4, (m60.w) naVar20.get());
            case 52:
                o12.a aVar15 = (o12.a) oaVar.Tf.get();
                o90.c g03 = rb.g0(rbVar);
                zy.d0 d0Var14 = (zy.d0) rbVar.f114135k.get();
                oa oaVar5 = rbVar.f114096a;
                return new m90.b1(aVar15, g03, d0Var14, new lh0.f0((lh0.z0) oaVar5.D0.get()), new o22.c((lh0.z0) oaVar5.D0.get()), (es.a) oaVar.P6.get(), (es.h) oaVar.f113735i7.get(), com.pinterest.widget.configuration.k.h(oaVar.f113603b), (ao2.j0) rbVar.f114104c.get());
            case 53:
                return new p90.v0(new lh0.f0((lh0.z0) rbVar.f114096a.D0.get()), (zy.d0) rbVar.f114135k.get(), rb.h0(rbVar), (sa0.j) rbVar.f114109d0.get(), new o22.c((lh0.z0) rbVar.f114096a.D0.get()), (o12.a) oaVar.Tf.get(), (x02.i2) oaVar.F3.get(), com.pinterest.widget.configuration.k.h(oaVar.f113603b), (ao2.j0) rbVar.f114104c.get(), (es.a) oaVar.P6.get(), (es.h) oaVar.f113735i7.get());
            case 54:
                return new sa0.j(rbVar.w2(), (x02.i2) oaVar.F3.get());
            case 55:
                return new v90.l1((ua0.d) rbVar.f114116f0.get(), rb.B0(rbVar), rbVar.C2(), new u90.c(rbVar.B2()), new ua0.e((i92.k) rbVar.f114096a.f113921t1.get()), (zy.d0) rbVar.f114135k.get(), rb.i0(rbVar), com.pinterest.widget.configuration.k.h(oaVar.f113603b), (ao2.j0) rbVar.f114104c.get());
            case 56:
                return new ua0.d((o12.a) oaVar.Tf.get(), (a82.b) rbVar.Z.get());
            case 57:
                return new s90.q0((sa0.j) rbVar.f114109d0.get(), (ua0.d) rbVar.f114116f0.get(), rb.B0(rbVar), rbVar.C2(), new u90.c(rbVar.B2()), new ua0.e((i92.k) rbVar.f114096a.f113921t1.get()), (zy.d0) rbVar.f114135k.get(), com.pinterest.widget.configuration.k.h(oaVar.f113603b), (ao2.j0) rbVar.f114104c.get());
            case 58:
                return new w90.h0((o12.a) oaVar.Tf.get(), rbVar.C2(), (ua0.d) rbVar.f114116f0.get(), new ua0.e((i92.k) rbVar.f114096a.f113921t1.get()), (zy.d0) rbVar.f114135k.get(), (w90.s) rbVar.f114128i0.get(), rb.k0(rbVar), rb.l0(rbVar), com.pinterest.widget.configuration.k.h(oaVar.f113603b), (ao2.j0) rbVar.f114104c.get());
            case 59:
                return new w90.s((lb0.r) oaVar.f113622c1.get());
            case 60:
                return new y90.y0((zy.d0) rbVar.f114135k.get(), rbVar.C2(), rb.o0(rbVar), rb.B0(rbVar), (k92.l) rbVar.f114147n.get(), rb.n0(rbVar), new lh0.h0((lh0.z0) oaVar.D0.get()), com.pinterest.widget.configuration.k.h(oaVar.f113603b), (ao2.j0) rbVar.f114104c.get());
            case 61:
                return new sv.g(rb.O0(rbVar), (zy.q0) oaVar.Nb.get(), rbVar.C2(), com.pinterest.widget.configuration.k.h(oaVar.f113603b), (ao2.j0) rbVar.f114104c.get());
            case 62:
                return new ca0.b1((da0.f) rbVar.f114144m0.get(), rbVar.C2(), (zy.d0) rbVar.f114135k.get(), com.pinterest.widget.configuration.k.h(oaVar.f113603b), (ao2.j0) rbVar.f114104c.get());
            case 63:
                Context context5 = (Context) oaVar.f113902s0.get();
                h62.k kVar3 = (h62.k) oaVar.f113831ng.get();
                ll.j B22 = rbVar.B2();
                x02.b1 b1Var = (x02.b1) oaVar.Xf.get();
                i92.k kVar4 = (i92.k) oaVar.f113921t1.get();
                Context context6 = oaVar.f113603b.f67746a;
                dl2.b.I(context6);
                return new da0.f(context5, kVar3, B22, b1Var, kVar4, new h72.m(context6), (x02.i2) oaVar.F3.get(), (x02.x0) oaVar.f113765k3.get(), (b60.b) oaVar.f113850p0.get(), rbVar.v2());
            case 64:
                return new la0.n1((o12.a) oaVar.Tf.get(), rb.q0(rbVar), rb.t(rbVar), rb.j0(rbVar), rb.m0(rbVar), new oa0.b(rbVar.B2()), rb.r0(rbVar), (zy.d0) rbVar.f114135k.get(), rb.s0(rbVar), (k92.l) rbVar.f114147n.get(), rb.U0(rbVar), rb.p0(rbVar), com.pinterest.widget.configuration.k.h(oaVar.f113603b), (ao2.j0) rbVar.f114104c.get());
            case 65:
                return new ka0.w(new oa0.b(rbVar.B2()), com.pinterest.widget.configuration.k.h(oaVar.f113603b), (ao2.j0) rbVar.f114104c.get());
            case 66:
                return new kd1.b((ao2.j0) rbVar.f114104c.get(), rbVar.C2(), rb.U0(rbVar), (zy.q0) oaVar.Nb.get(), (g22.b) rbVar.f114172t0.get(), rb.k2(rbVar));
            case 67:
                pq2.c1 c1Var = (pq2.c1) oaVar.f113623c2.get();
                return a02.e.m4((rz.c) oaVar.f114011y1.get(), (p00.b) rbVar.f114168s0.get(), c1Var, oaVar.J2());
            case 68:
                return a02.e.Q3((rz.e) rbVar.f114164r0.get(), new p00.d());
            case 69:
                rz.e eVar3 = (rz.e) oaVar.f113714h4.get();
                a02.e.l4(eVar3, (v12.a) rbVar.f114160q0.get());
                return eVar3;
            case 70:
                return new v12.a((IdeaPinMusicMetadataDeserializer) oaVar.H4.get());
            case 71:
                return new uc0.d0((oc0.h) oaVar.Of.get(), oa.A0(oaVar), new l82.a());
            case 72:
                return new ma1.y(rb.y0(rbVar), (k92.l) rbVar.f114147n.get(), com.pinterest.widget.configuration.k.h(oaVar.f113603b), (ao2.j0) rbVar.f114104c.get(), (cr1.a) oaVar.A2.get());
            case 73:
                return new ub1.a0(com.pinterest.widget.configuration.k.h(oaVar.f113603b), (ao2.j0) rbVar.f114104c.get(), rb.z0(rbVar), (k92.l) rbVar.f114147n.get());
            case 74:
                return new h90.j0((zy.d0) rbVar.f114135k.get(), rbVar.C2(), (o12.a) oaVar.Tf.get(), (x02.i2) oaVar.F3.get(), (x02.x2) oaVar.f113800m3.get(), com.pinterest.widget.configuration.k.h(oaVar.f113603b), (ao2.j0) rbVar.f114104c.get(), (m60.g0) oaVar.f113590a4.get(), rb.D0(rbVar), (lh0.n1) oaVar.E0.get());
            case 75:
                return new g90.c0(new ws.q(i14), rbVar.C2(), (zy.q0) oaVar.Nb.get(), com.pinterest.widget.configuration.k.h(oaVar.f113603b), (ao2.j0) rbVar.f114104c.get());
            case 76:
                return new uc0.f0((oc0.h) oaVar.Of.get(), oa.J0(oaVar), new l82.a());
            case 77:
                return new n91.c0(com.pinterest.widget.configuration.k.h(oaVar.f113603b), (ao2.j0) rbVar.f114104c.get(), rb.F0(rbVar));
            case 78:
                return new hg0.i((x10.d) oaVar.f113997x5.get(), (i92.k) oaVar.f113921t1.get(), (nx.f0) oaVar.f113747j2.get(), (ao2.j0) rbVar.f114104c.get());
            case 79:
                return new uc0.g0(new l82.a(), (oc0.h) oaVar.Of.get());
            case 80:
                return new uc0.p0((vy.o) oaVar.F1.get(), (oc0.h) oaVar.Of.get(), oa.L0(oaVar), new l82.a());
            case 81:
                return new rw1.h((ao2.j0) rbVar.f114104c.get(), rb.K0(rbVar), rb.J0(rbVar));
            case 82:
                return new u0(1);
            case 83:
                return new y0(1);
            case 84:
                return new qp1.t0((ao2.j0) rbVar.f114104c.get(), com.pinterest.widget.configuration.k.h(oaVar.f113603b), rb.N0(rbVar), rb.M0(rbVar), new lh0.o1((lh0.z0) oaVar.D0.get()));
            case 85:
                return new uc0.r0((oc0.j) oaVar.Of.get(), new l82.a(), oa.T0(oaVar));
            case 86:
                return new dt0.c0(com.pinterest.widget.configuration.k.h(oaVar.f113603b), (ao2.j0) rbVar.f114104c.get(), rb.q(rbVar), (zy.d0) rbVar.f114135k.get(), rb.J1(rbVar), rb.Q0(rbVar), rb.P0(rbVar));
            case 87:
                return new tx1.n((ao2.j0) rbVar.f114104c.get(), rb.R0(rbVar), new w60.d(rbVar.B2(), 5));
            case 88:
                return new uc0.b1((oc0.h) oaVar.Of.get(), oa.U0(oaVar), new l82.a());
            case 89:
                return new uc0.d1((oc0.h) oaVar.Of.get(), oa.Y0(oaVar), new l82.a());
            case 90:
                return new uc0.f1((oc0.h) oaVar.Of.get(), new l82.a(), oa.Z0(oaVar));
            case 91:
                return new uc0.l1((oc0.h) oaVar.Of.get(), new l82.a(), oa.a1(oaVar));
            case 92:
                return new h80.s(rb.T0(rbVar), rb.Z0(rbVar), rb.S0(rbVar), com.pinterest.widget.configuration.k.h(oaVar.f113603b), (ao2.j0) rbVar.f114104c.get());
            case 93:
                pq2.c1 c1Var2 = (pq2.c1) oaVar.f113623c2.get();
                return a02.e.X1((rz.c) oaVar.f114011y1.get(), (p00.b) rbVar.S0.get(), c1Var2, oaVar.J2());
            case 94:
                return a02.e.G3((rz.e) rbVar.R0.get(), new p00.d());
            case 95:
                return a02.e.W1((m12.a) rbVar.Q0.get(), rb.S(rbVar), new sz.a(i13));
            case 96:
                return new m12.a();
            case 97:
                return new uc0.n1((oc0.h) oaVar.Of.get(), oa.b1(oaVar), new l82.a());
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_VIDEO_CREATOR_ANALYTICS_MODULE /* 98 */:
                return new mt.s((ao2.j0) rbVar.f114104c.get(), com.pinterest.widget.configuration.k.h(oaVar.f113603b), new ws.q(i16), rb.V0(rbVar), rb.r(rbVar), rb.W0(rbVar), (ob) rbVar.f114123h.get(), (es.a) oaVar.P6.get(), (nx.b0) oaVar.R8.get(), (ur.a) oaVar.Kb.get(), (es.h) oaVar.f113735i7.get());
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_NOTE_AND_FAVORITE_MODULE /* 99 */:
                return a02.e.z1((pq2.c1) oaVar.f113623c2.get(), a02.e.v1(oaVar.b2(), oaVar.Z1()), oa.o1(oaVar), (rz.c) oaVar.f114011y1.get(), oaVar.J2());
            default:
                throw new AssertionError(i17);
        }
    }

    @Override // wk2.a
    public final Object get() {
        bf2.d dVar;
        bf2.d dVar2;
        h6.q qVar;
        bf2.d dVar3;
        bf2.d dVar4;
        h6.q qVar2;
        h6.q qVar3;
        bf2.d dVar5;
        h6.q qVar4;
        bf2.d dVar6;
        bf2.d dVar7;
        h6.q qVar5;
        bf2.d dVar8;
        na naVar;
        bf2.d dVar9;
        rq2.a J2;
        h6.q qVar6;
        bf2.d dVar10;
        h6.q qVar7;
        bf2.d dVar11;
        bf2.d dVar12;
        na naVar2;
        h6.q qVar8;
        bf2.d dVar13;
        bf2.d dVar14;
        bf2.d dVar15;
        na naVar3;
        bf2.d dVar16;
        bf2.d dVar17;
        rq2.a J22;
        bf2.d dVar18;
        bf2.d dVar19;
        int i13 = this.f114079d;
        int i14 = i13 / 100;
        if (i14 == 0) {
            return a();
        }
        int i15 = 1;
        if (i14 != 1) {
            throw new AssertionError(i13);
        }
        int i16 = 0;
        int i17 = 4;
        oa oaVar = this.f114076a;
        rb rbVar = this.f114078c;
        switch (i13) {
            case 100:
                dVar = oaVar.Of;
                return new uc0.p1((oc0.h) dVar.get(), oa.e1(oaVar), a02.e.a());
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE /* 101 */:
                dVar2 = rbVar.f114104c;
                ao2.j0 j0Var = (ao2.j0) dVar2.get();
                qVar = oaVar.f113603b;
                return new ba1.p0(j0Var, com.pinterest.widget.configuration.k.h(qVar), rb.Y0(rbVar), rb.a0(rbVar), rb.X0(rbVar));
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SHOPPING_MODULE /* 102 */:
                dVar3 = oaVar.Of;
                return new uc0.r1((oc0.j) dVar3.get(), a02.e.a(), oa.i1(oaVar));
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_TEMPLATE_DETAILS_MODULE /* 103 */:
                dVar4 = rbVar.f114104c;
                ao2.j0 j0Var2 = (ao2.j0) dVar4.get();
                qVar2 = oaVar.f113603b;
                return new eu1.l(j0Var2, com.pinterest.widget.configuration.k.h(qVar2), rb.a1(rbVar));
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PEAR_STYLES_MODULE /* 104 */:
                du1.a aVar = new du1.a((ss1.f) rbVar.f114100b.f114656f.get(), 0);
                hu1.j c13 = rb.c1(rbVar);
                qVar3 = oaVar.f113603b;
                Application h10 = com.pinterest.widget.configuration.k.h(qVar3);
                dVar5 = rbVar.f114104c;
                return new gu1.p(aVar, c13, h10, (ao2.j0) dVar5.get());
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SEE_IT_STYLED_MODULE /* 105 */:
                du1.a aVar2 = new du1.a((ss1.f) rbVar.f114100b.f114656f.get(), 0);
                hu1.j b13 = rb.b1(rbVar);
                qVar4 = oaVar.f113603b;
                Application h13 = com.pinterest.widget.configuration.k.h(qVar4);
                dVar6 = rbVar.f114104c;
                return new iu1.u(aVar2, b13, h13, (ao2.j0) dVar6.get());
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PLACEHOLDER_LOADING_GRID /* 106 */:
                dVar7 = rbVar.f114113e1;
                w12.b bVar = (w12.b) dVar7.get();
                mb0.a d13 = rb.d1(rbVar);
                mb0.a t23 = rb.t2(rbVar);
                qVar5 = oaVar.f113603b;
                Application h14 = com.pinterest.widget.configuration.k.h(qVar5);
                dVar8 = rbVar.f114104c;
                return new tx0.a0(bVar, d13, t23, h14, (ao2.j0) dVar8.get());
            case RecyclerViewTypes.VIEW_TYPE_PIN_PDP_MONOLITH_HEADER /* 107 */:
                naVar = oaVar.f113623c2;
                pq2.c1 c1Var = (pq2.c1) naVar.get();
                p00.b C3 = a02.e.C3((rz.e) oaVar.We.get(), a02.e.b4());
                dVar9 = oaVar.f114011y1;
                rz.c cVar = (rz.c) dVar9.get();
                J2 = oaVar.J2();
                return a02.e.W2(cVar, C3, c1Var, J2);
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_STL_SHOPPING_MODULE /* 108 */:
                ll.j jVar = new ll.j((r20.a) oaVar.f113794lf.get());
                qVar6 = oaVar.f113603b;
                Application h15 = com.pinterest.widget.configuration.k.h(qVar6);
                dVar10 = rbVar.f114104c;
                return new com.pinterest.feature.settings.notifications.z0(jVar, h15, (ao2.j0) dVar10.get());
            case RecyclerViewTypes.VIEW_TYPE_LIVE_SINGLE_COLUMN_UPSELL /* 109 */:
                qVar7 = oaVar.f113603b;
                Application h16 = com.pinterest.widget.configuration.k.h(qVar7);
                dVar11 = rbVar.f114104c;
                ao2.j0 j0Var3 = (ao2.j0) dVar11.get();
                ey0.g e13 = rb.e1(rbVar);
                dVar12 = rbVar.f114135k;
                zy.d0 d0Var = (zy.d0) dVar12.get();
                naVar2 = oaVar.f113797m0;
                return new dy0.o0(h16, j0Var3, e13, d0Var, (ob0.a) naVar2.get());
            case RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PICKER_CAROUSEL /* 110 */:
                qVar8 = oaVar.f113603b;
                Application h17 = com.pinterest.widget.configuration.k.h(qVar8);
                dVar13 = rbVar.f114104c;
                ao2.j0 j0Var4 = (ao2.j0) dVar13.get();
                oy0.d h18 = rb.h1(rbVar);
                dVar14 = rbVar.f114135k;
                zy.d0 d0Var2 = (zy.d0) dVar14.get();
                nu.b U0 = rb.U0(rbVar);
                ny0.e g13 = rb.g1(rbVar);
                dVar15 = oaVar.f113730i2;
                return new ny0.w0(h17, j0Var4, h18, d0Var2, U0, g13, (nx.d1) dVar15.get(), (qy0.b) this.f114077b.f114655e.get(), rbVar.y2(), rb.f1(rbVar));
            case RecyclerViewTypes.VIEW_TYPE_TV_SCHEDULE_EPISODE /* 111 */:
                naVar3 = oaVar.f113623c2;
                pq2.c1 c1Var2 = (pq2.c1) naVar3.get();
                dVar16 = rbVar.f114149n1;
                p00.b bVar2 = (p00.b) dVar16.get();
                dVar17 = oaVar.f114011y1;
                rz.c cVar2 = (rz.c) dVar17.get();
                J22 = oaVar.J2();
                return a02.e.b3(cVar2, bVar2, c1Var2, J22);
            case RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER /* 112 */:
                dVar18 = rbVar.f114145m1;
                rz.e registry = (rz.e) dVar18.get();
                p00.d bodyConverter = a02.e.b4();
                Intrinsics.checkNotNullParameter(registry, "registry");
                Intrinsics.checkNotNullParameter(bodyConverter, "bodyConverter");
                return new p00.b(registry, bodyConverter, null);
            case RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_CELL /* 113 */:
                rz.e eVar = (rz.e) oaVar.f113714h4.get();
                lv1.b bVar3 = (lv1.b) rbVar.f114133j1.get();
                dVar19 = rbVar.f114141l1;
                a02.e.a3(eVar, bVar3, (lv1.a) dVar19.get());
                return eVar;
            case RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_SECTION_HEADER /* 114 */:
                return new lv1.b((NuxUseCaseDeserializer) rbVar.f114129i1.get());
            case RecyclerViewTypes.VIEW_TYPE_ANNOUNCEMENT_MODAL_TYPE_ONE /* 115 */:
                return new NuxUseCaseDeserializer();
            case RecyclerViewTypes.VIEW_TYPE_PROFILE_CREATED_TAB_SCHEDULED_PINS_PREVIEW /* 116 */:
                return new lv1.a((NuxUseCaseFeedDeserializer) rbVar.f114137k1.get());
            case RecyclerViewTypes.VIEW_TYPE_CAROUSEL_SINGLE_COLUMN /* 117 */:
                return new NuxUseCaseFeedDeserializer();
            case RecyclerViewTypes.VIEW_TYPE_SIMPLE_IMAGE_CELL /* 118 */:
                return new yy0.e0(com.pinterest.widget.configuration.k.h(oaVar.f113603b), (ao2.j0) rbVar.f114104c.get(), rb.i1(rbVar), (zy.d0) rbVar.f114135k.get(), rbVar.y2());
            case RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL /* 119 */:
                return new bx1.s((ao2.j0) rbVar.f114104c.get(), rb.m1(rbVar), rb.l1(rbVar), (m60.w) oaVar.f113885r0.get());
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL /* 120 */:
                return new v0(this, i15);
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL /* 121 */:
                return new a1(this, i15);
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL_FULL_SPAN /* 122 */:
                return new pb1.f0(rb.n1(rbVar), rb.r1(rbVar), (zy.d0) rbVar.f114135k.get(), (k92.l) rbVar.f114147n.get(), com.pinterest.widget.configuration.k.h(oaVar.f113603b), (ao2.j0) rbVar.f114104c.get());
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL /* 123 */:
                return new rb1.x(com.pinterest.widget.configuration.k.h(oaVar.f113603b), (ao2.j0) rbVar.f114104c.get(), rbVar.C2(), (zy.d0) rbVar.f114135k.get(), (b60.b) oaVar.f113850p0.get());
            case RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER /* 124 */:
                return new jb1.o(com.pinterest.widget.configuration.k.h(oaVar.f113603b), (ao2.j0) rbVar.f114104c.get(), rbVar.C2(), (zy.d0) rbVar.f114135k.get());
            case RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED /* 125 */:
                return new kb1.u(com.pinterest.widget.configuration.k.h(oaVar.f113603b), (ao2.j0) rbVar.f114104c.get(), rb.o1(rbVar));
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL /* 126 */:
                return new sb1.t(rb.p1(rbVar), rbVar.C2(), (k92.l) rbVar.f114147n.get(), (zy.d0) rbVar.f114135k.get(), rb.q1(rbVar), com.pinterest.widget.configuration.k.h(oaVar.f113603b), (ao2.j0) rbVar.f114104c.get());
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK /* 127 */:
                return new iz0.g0(com.pinterest.widget.configuration.k.h(oaVar.f113603b), (ao2.j0) rbVar.f114104c.get(), (s20.a) rbVar.E1.get(), rbVar.C2());
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN /* 128 */:
                pq2.c1 c1Var3 = (pq2.c1) oaVar.f113623c2.get();
                return a02.e.h3((rz.c) oaVar.f114011y1.get(), (p00.b) rbVar.D1.get(), c1Var3, oaVar.J2());
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS /* 129 */:
                return a02.e.L3((rz.e) rbVar.C1.get(), new p00.d());
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS_FULL_SPAN /* 130 */:
                return a02.e.g3((a22.a) oaVar.J3.get(), (a22.b) rbVar.f114197z1.get(), (a22.c) rbVar.A1.get(), (a22.d) rbVar.B1.get(), (PinDeserializer) oaVar.W2.get(), new b22.e((d12.i) oaVar.N2.get(), 0));
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_VIDEO_GRID_CELL /* 131 */:
                return new a22.b((ke0.a) oaVar.Xe.get());
            case RecyclerViewTypes.VIEW_TYPE_FEED_SECTION_TITLE /* 132 */:
                return new a22.c((ke0.a) oaVar.Ye.get());
            case RecyclerViewTypes.VIEW_TYPE_PIN_CAROUSEL /* 133 */:
                return new a22.d();
            case RecyclerViewTypes.VIEW_TYPE_PIN_MINI_CELL /* 134 */:
                return new v21.c0(rb.A1(rbVar), rb.y1(rbVar), (zy.d0) rbVar.f114135k.get(), com.pinterest.widget.configuration.k.h(oaVar.f113603b), (ao2.j0) rbVar.f114104c.get());
            case RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_CELL /* 135 */:
                return new u21.d0(rb.z1(rbVar), rb.B1(rbVar), (zy.d0) rbVar.f114135k.get(), rbVar.C2(), com.pinterest.widget.configuration.k.h(oaVar.f113603b), (ao2.j0) rbVar.f114104c.get());
            case RecyclerViewTypes.VIEW_TYPE_SEE_MORE_ACTION_CELL /* 136 */:
                return new w21.y1(rb.t(rbVar), rb.D1(rbVar), rb.x1(rbVar), rb.C1(rbVar), (zy.d0) rbVar.f114135k.get(), com.pinterest.widget.configuration.k.h(oaVar.f113603b), (ao2.j0) rbVar.f114104c.get());
            case RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_IMAGE /* 137 */:
                pq2.c1 c1Var4 = (pq2.c1) oaVar.f113623c2.get();
                return a02.e.m3((rz.c) oaVar.f114011y1.get(), (p00.b) rbVar.J1.get(), c1Var4, oaVar.J2());
            case RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL /* 138 */:
                return a02.e.H3((rz.e) rbVar.I1.get(), new p00.d());
            case RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ITEM /* 139 */:
                return a02.e.l3();
            case RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ACTION_ITEM /* 140 */:
                return new ay1.z((ao2.j0) rbVar.f114104c.get(), rb.F1(rbVar), rb.E1(rbVar));
            case RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ITEM_HIDDEN /* 141 */:
                return new j1(this, i15);
            case RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL /* 142 */:
                return new i1(this, i15);
            case RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL_ITEM_IMAGE /* 143 */:
                return new y01.q1(com.pinterest.widget.configuration.k.h(oaVar.f113603b), (ao2.j0) rbVar.f114104c.get(), (a11.d) oaVar.f113668ec.get(), (nx.d1) oaVar.f113730i2.get(), rb.H1(rbVar), new ws.q(5), rb.L0(rbVar), rb.v1(rbVar), rbVar.C2(), new ws.q(6), rb.W(rbVar), rb.E0(rbVar), rb.j1(rbVar), (zy.d0) rbVar.f114135k.get(), (rg0.s) oaVar.Q5.get(), (nx.b0) oaVar.R8.get(), rb.G1(rbVar));
            case RecyclerViewTypes.VIEW_TYPE_VTO_CAROUSEL_ITEM /* 144 */:
                return new a11.q(rbVar.E2(), (lb0.r) oaVar.f113622c1.get(), oa.H1(oaVar));
            case RecyclerViewTypes.VIEW_TYPE_VTO_CAROUSEL_ITEM_TINTED /* 145 */:
                return new uc0.t1((oc0.h) oaVar.Of.get(), oa.A1(oaVar), new l82.a());
            case RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL_ITEM_VIDEO /* 146 */:
                return new hw1.v((ao2.j0) rbVar.f114104c.get(), rb.L1(rbVar), new ws.q(8));
            case RecyclerViewTypes.VIEW_TYPE_SEARCH_PRODUCT_COLLAGE_STORY /* 147 */:
                k22.m mVar = (k22.m) oaVar.Y4.get();
                x02.i2 i2Var = (x02.i2) oaVar.F3.get();
                nx.d1 d1Var = (nx.d1) oaVar.f113730i2.get();
                v41.a aVar3 = new v41.a();
                zy.d0 d0Var3 = (zy.d0) rbVar.f114135k.get();
                oa oaVar2 = rbVar.f114096a;
                return new w41.s1(mVar, i2Var, d1Var, aVar3, d0Var3, new f31.a0(oa.L1(oaVar2), rbVar.F2(), new g31.d((m60.w) oaVar2.f113885r0.get())), rbVar.F2(), rb.O1(rbVar), rb.N1(rbVar), rb.M1(rbVar), (zf0.f) oaVar.f113723hd.get(), com.pinterest.widget.configuration.k.h(oaVar.f113603b), (ao2.j0) rbVar.f114104c.get(), (es.a) oaVar.P6.get(), (es.h) oaVar.f113735i7.get());
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_BUBBLES_PACKAGE_GRID_MODULE /* 148 */:
                return new i51.b0((zy.d0) rbVar.f114135k.get(), rb.u2(rbVar), (ao2.j0) rbVar.f114104c.get());
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_BRAND_PACKAGE_GRID_MODULE /* 149 */:
                return new kc1.j((k22.m) oaVar.Y4.get(), (b60.b) oaVar.f113850p0.get(), com.pinterest.widget.configuration.k.h(oaVar.f113603b), (ao2.j0) rbVar.f114104c.get());
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_CATEGORY /* 150 */:
                return new hp0.f0(com.pinterest.widget.configuration.k.h(oaVar.f113603b), (ao2.j0) rbVar.f114104c.get(), new ws.q(i17), rbVar.C2(), (zy.q0) oaVar.Nb.get(), rb.P1(rbVar));
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_UNIFIED_FILTER_MULTI_SELECT_ITEM /* 151 */:
                es.a aVar4 = (es.a) oaVar.P6.get();
                nx.b0 b0Var = (nx.b0) oaVar.R8.get();
                xr.a aVar5 = (xr.a) oaVar.f113756jc.get();
                return a02.e.y1((vr.a) oaVar.Q8.get(), oaVar.X1(), aVar5, aVar4, b0Var, oa.g0(oaVar));
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_PRICE_FILTER_ITEM /* 152 */:
                return new com.pinterest.qrCodeLogin.j0(com.pinterest.widget.configuration.k.h(oaVar.f113603b), (ao2.j0) rbVar.f114104c.get(), rbVar.C2(), rb.Q1(rbVar), (k92.l) rbVar.f114147n.get(), (zy.d0) rbVar.f114135k.get());
            case RecyclerViewTypes.VIEW_TYPE_STANDARD_FILTER_ITEM /* 153 */:
                return new fz0.u(rb.s1(rbVar), rbVar.C2(), rb.t1(rbVar), com.pinterest.widget.configuration.k.h(oaVar.f113603b), (ao2.j0) rbVar.f114104c.get());
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_PRODUCT_FILTER_HEADER /* 154 */:
                return new s02.i(new l82.a(), rb.R1(rbVar));
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_COLOR_FILTER /* 155 */:
                return new s02.n((ao2.j0) rbVar.f114104c.get(), rb.S1(rbVar), (o02.a) oaVar.Jg.get());
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_CATEGORY_FILTER_ITEM /* 156 */:
                return new uc0.v1((oc0.h) oaVar.Of.get(), oa.C1(oaVar), new l82.a());
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_SORT_FILTER /* 157 */:
                return new wr1.d1(com.pinterest.widget.configuration.k.h(oaVar.f113603b), (ao2.j0) rbVar.f114104c.get(), (zy.d0) rbVar.f114135k.get(), rb.T1(rbVar), (cr1.a) oaVar.B2.get());
            case RecyclerViewTypes.VIEW_TYPE_STELA_IN_FLASHLIGHT_ONE_COLUMN /* 158 */:
                return new ea0.k0(rb.U1(rbVar), (zy.d0) rbVar.f114135k.get(), rbVar.C2(), (k92.l) rbVar.f114147n.get(), (es.h) oaVar.f113735i7.get(), (o12.a) oaVar.Tf.get(), (es.a) oaVar.P6.get(), com.pinterest.widget.configuration.k.h(oaVar.f113603b), (ao2.j0) rbVar.f114104c.get());
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_EDUCATION_HEADER /* 159 */:
                return new fa0.k0(rb.W1(rbVar), rb.V1(rbVar), (zy.d0) rbVar.f114135k.get(), rbVar.C2(), (k92.l) rbVar.f114147n.get(), (x02.i2) oaVar.F3.get(), com.pinterest.widget.configuration.k.h(oaVar.f113603b), (ao2.j0) rbVar.f114104c.get());
            case 160:
                return new t02.o(com.pinterest.widget.configuration.k.h(oaVar.f113603b), (ao2.j0) rbVar.f114104c.get(), rb.X1(rbVar));
            case RecyclerViewTypes.VIEW_TYPE_PLACEHOLDER /* 161 */:
                return new od1.o0(rb.Z1(rbVar), rb.a2(rbVar), (nx.d1) oaVar.f113730i2.get(), (zy.d0) rbVar.f114135k.get(), (pd1.e) rbVar.f114130i2.get(), new m90.z(3), (o82.s1) rbVar.f114134j2.get(), rb.b2(rbVar), (es.a) oaVar.P6.get(), (es.h) oaVar.f113735i7.get(), rb.w1(rbVar), rb.U0(rbVar), (ao2.j0) rbVar.f114104c.get());
            case RecyclerViewTypes.VIEW_TYPE_FULL_SPAN_PLACEHOLDER /* 162 */:
                return new qd1.a((m60.w) oaVar.f113885r0.get(), (x02.i2) oaVar.F3.get(), oaVar.S2());
            case RecyclerViewTypes.VIEW_TYPE_MAKEUP_CAROUSEL_ITEM /* 163 */:
                return new pd1.e((PinService) oaVar.f113713h3.get(), (PinDeserializer) oaVar.W2.get(), (OnebarmoduleDeserializer) oaVar.O4.get());
            case RecyclerViewTypes.VIEW_TYPE_MAKEUP_CAROUSEL_ITEM_LOADING /* 164 */:
                return new kb(this, i16);
            case RecyclerViewTypes.VIEW_TYPE_MAKEUP_CAROUSEL_ITEM_CLEAR /* 165 */:
                return new ou.l(com.pinterest.widget.configuration.k.h(oaVar.f113603b), (ao2.j0) rbVar.f114104c.get(), rb.r(rbVar), (es.a) oaVar.P6.get(), (nx.b0) oaVar.R8.get(), (ur.a) oaVar.Kb.get(), (es.h) oaVar.f113735i7.get());
            case RecyclerViewTypes.VIEW_TYPE_LEGO_EMPTY_STATE_MESSAGE /* 166 */:
                return new uu.k(com.pinterest.widget.configuration.k.h(oaVar.f113603b), (ao2.j0) rbVar.f114104c.get(), rb.r(rbVar), (es.a) oaVar.P6.get(), (nx.b0) oaVar.R8.get(), (ur.a) oaVar.Kb.get(), (es.h) oaVar.f113735i7.get());
            case RecyclerViewTypes.VIEW_TRY_ON_FEED_PRODUCT_CARD /* 167 */:
                return new ys0.s(com.pinterest.widget.configuration.k.h(oaVar.f113603b), (ao2.j0) rbVar.f114104c.get(), rb.P(rbVar), (zy.d0) rbVar.f114135k.get(), rb.K1(rbVar));
            case RecyclerViewTypes.VIEW_TYPE_USER_PIN_REACTION /* 168 */:
                return new bi1.b0(com.pinterest.widget.configuration.k.h(oaVar.f113603b), (ao2.j0) rbVar.f114104c.get(), rb.r2(rbVar), (x02.i2) oaVar.F3.get());
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_SPOTLIGHT /* 169 */:
                return new uc0.x1((oc0.h) oaVar.Of.get(), oa.F1(oaVar), new l82.a());
            case RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_IMAGE /* 170 */:
                return new ns.p0(rb.d2(rbVar), (k92.l) rbVar.f114147n.get(), (zy.d0) rbVar.f114135k.get(), com.pinterest.widget.configuration.k.h(oaVar.f113603b), (ao2.j0) rbVar.f114104c.get());
            case RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_VIDEO /* 171 */:
                return a02.e.u1((pq2.c1) oaVar.f113623c2.get(), a02.e.v1(oaVar.b2(), oaVar.Z1()), a02.e.N3((rz.e) oaVar.f113634cd.get(), (p00.c) oaVar.f113651dd.get()), (rz.c) oaVar.f114011y1.get(), oaVar.J2());
            case RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_IMAGE /* 172 */:
                return new c61.m1((c61.p0) oaVar.f113963v7.get(), rb.D0(rbVar), (zy.d0) rbVar.f114135k.get(), new w60.d(rbVar.B2(), 1), (o82.s1) rbVar.f114170s2.get(), rb.I1(rbVar), rb.U0(rbVar), (ob) rbVar.f114123h.get(), rb.C0(rbVar), (m60.w) oaVar.f113885r0.get(), rb.e2(rbVar), (rg0.s) oaVar.Q5.get(), com.pinterest.widget.configuration.k.h(oaVar.f113603b), (ao2.j0) rbVar.f114104c.get());
            case RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_VIDEO /* 173 */:
                return new kb(this, i15);
            case RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_IMAGE_FULL_SPAN /* 174 */:
                return new uc0.z1((oc0.h) oaVar.Of.get(), oa.G1(oaVar), new l82.a());
            case RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_VIDEO_FULL_SPAN /* 175 */:
                return new s52.s((nx.d1) oaVar.f113730i2.get(), new m90.z(i17), (zy.d0) rbVar.f114135k.get(), rb.L(rbVar), com.pinterest.widget.configuration.k.h(oaVar.f113603b), (i92.k) oaVar.f113921t1.get(), (tb0.h) oaVar.f113797m0.get(), rb.l2(rbVar), rbVar.C2(), rb.g2(rbVar), (ao2.j0) rbVar.f114104c.get());
            case RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_IMAGE_FULL_SPAN /* 176 */:
                return new y52.j0(com.pinterest.widget.configuration.k.h(oaVar.f113603b), (ao2.j0) rbVar.f114104c.get(), rb.I0(rbVar), rb.A0(rbVar), rb.m2(rbVar), rb.i2(rbVar), rb.h2(rbVar), rbVar.C2(), rb.f2(rbVar), rb.s2(rbVar), (lb0.r) oaVar.f113622c1.get());
            case RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_VIDEO_FULL_SPAN /* 177 */:
                return new uc0.b2((oc0.h) oaVar.Of.get(), new l82.a(), oa.K1(oaVar));
            case RecyclerViewTypes.VIEW_TYPE_GMA_INLINE_AD /* 178 */:
                return new s02.x(new l82.a(), rb.n2(rbVar));
            case RecyclerViewTypes.VIEW_TYPE_GMA_INLINE_AD_FULL_SPAN /* 179 */:
                return new uc0.d2((oc0.h) oaVar.Of.get(), oa.N1(oaVar), new l82.a());
            case RecyclerViewTypes.VIEW_TYPE_BUBBLE_CATEGORY_REP /* 180 */:
                return new uc0.f2((oc0.h) oaVar.Of.get(), new l82.a(), oa.O1(oaVar));
            case RecyclerViewTypes.VIEW_TYPE_BUBBLE_NAVIGATION_REP /* 181 */:
                return new d92.o0((ao2.j0) rbVar.f114104c.get(), com.pinterest.widget.configuration.k.h(oaVar.f113603b), rb.p2(rbVar), rb.o2(rbVar), new ws.q(9));
            case RecyclerViewTypes.VIEW_TYPE_BUBBLE_DEFAULT_REP /* 182 */:
                return new uc0.h2((oc0.h) oaVar.Of.get(), oa.P1(oaVar), new l82.a());
            case RecyclerViewTypes.VIEW_TYPE_BUBBLE_STYLE_REP /* 183 */:
                return new uc0.j2((oc0.h) oaVar.Of.get(), oa.Q1(oaVar), new l82.a());
            case RecyclerViewTypes.VIEW_TYPE_BUBBLE_MULTI_IMAGE_REP /* 184 */:
                return new uc0.l2((oc0.h) oaVar.Of.get(), a02.e.s4(new rc0.c1()), new l82.a());
            case RecyclerViewTypes.VIEW_TYPE_BUBBLE_IMAGE_GRID_REP /* 185 */:
                return new uc0.w2((oc0.h) oaVar.Of.get(), a02.e.t4(new org.chromium.net.y()), new l82.a());
            case RecyclerViewTypes.VIEW_TYPE_BUBBLE_MULTI_TOPIC_TILE /* 186 */:
                return new jh1.h(rb.q2(rbVar), (zy.d0) rbVar.f114135k.get(), (k92.l) rbVar.f114147n.get(), com.pinterest.widget.configuration.k.h(oaVar.f113603b), (ao2.j0) rbVar.f114104c.get());
            case RecyclerViewTypes.VIEW_TYPE_BUBBLE_EDITORIAL_CARD /* 187 */:
                oc.c cVar3 = (oc.c) oaVar.f113788l8.get();
                lh1.d dVar20 = new lh1.d((n82.b) rbVar.f114100b.f114657g.get());
                dVar20.f83526b = (lu1.b) rbVar.f114096a.f113961v5.get();
                return new com.pinterest.feature.unauth.sba.s0(cVar3, dVar20, com.pinterest.widget.configuration.k.h(oaVar.f113603b), (ao2.j0) rbVar.f114104c.get());
            case RecyclerViewTypes.VIEW_TYPE_BUBBLE_MULTI_IMAGE_EDITORIAL_CARD /* 188 */:
                Application h19 = com.pinterest.widget.configuration.k.h(oaVar.f113603b);
                ao2.j0 j0Var5 = (ao2.j0) rbVar.f114104c.get();
                b60.b bVar4 = (b60.b) oaVar.f113850p0.get();
                oa oaVar3 = rbVar.f114096a;
                return new y31.p0(h19, j0Var5, bVar4, new z31.e((m60.w) oaVar3.f113885r0.get(), (yq.e) rbVar.I2.get()), new z31.f((m60.w) oaVar3.f113885r0.get(), (x02.x2) oaVar3.f113800m3.get()), new z31.b(oa.V1(oaVar3)), new z31.g((m60.w) oaVar3.f113885r0.get(), (lu1.b) oaVar3.f113961v5.get()), rbVar.C2(), new z31.d((Context) oaVar3.f113902s0.get(), (m60.w) oaVar3.f113885r0.get(), (tb0.h) oaVar3.f113797m0.get(), (i92.k) oaVar3.f113921t1.get()), (zy.d0) rbVar.f114135k.get());
            case RecyclerViewTypes.VIEW_TYPE_BUBBLE_IMAGE_WITH_TITLE_OVERLAY /* 189 */:
                return new y1(this, i15);
            case RecyclerViewTypes.VIEW_TYPE_ICON_AND_TEXT_INLINE_BUBBLE /* 190 */:
                n82.b bVar5 = (n82.b) rbVar.f114100b.f114657g.get();
                oa oaVar4 = rbVar.f114096a;
                return new zc2.w(new gx.e(bVar5, oaVar4.j3()), new com.pinterest.widget.configuration.e((com.pinterest.widget.configuration.h) oaVar4.T8.get(), 0), rbVar.C2(), (com.pinterest.widget.configuration.h) oaVar.T8.get(), com.pinterest.widget.configuration.k.h(oaVar.f113603b), (ao2.j0) rbVar.f114104c.get());
            case RecyclerViewTypes.VIEW_TYPE_LENS_PHOTO /* 191 */:
                return new ad2.u(new t72.j((e12.e) rbVar.f114096a.X3.get()), rbVar.C2(), new com.pinterest.widget.configuration.e((com.pinterest.widget.configuration.h) rbVar.f114096a.T8.get(), 1), com.pinterest.widget.configuration.k.h(oaVar.f113603b), (ao2.j0) rbVar.f114104c.get());
            case RecyclerViewTypes.VIEW_TYPE_LENS_DIRECTORY /* 192 */:
                n82.b bVar6 = (n82.b) rbVar.f114100b.f114657g.get();
                oa oaVar5 = rbVar.f114096a;
                return new cd2.p(new gx.e(bVar6, oaVar5.j3()), new com.pinterest.widget.configuration.e((com.pinterest.widget.configuration.h) oaVar5.T8.get(), 0), rbVar.C2(), com.pinterest.widget.configuration.k.h(oaVar.f113603b), (ao2.j0) rbVar.f114104c.get());
            case RecyclerViewTypes.VIEW_TYPE_LENS_HISTORY /* 193 */:
                return new lb(this);
            case RecyclerViewTypes.VIEW_TYPE_OVERSCROLL_SEARCH_CELL /* 194 */:
                return new mb(this);
            case RecyclerViewTypes.VIEW_TYPE_USER /* 195 */:
                return new nb(this);
            default:
                throw new AssertionError(i13);
        }
    }
}
