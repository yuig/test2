package om0;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import i2.f2;
import i2.z1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final g f96566a;

    /* renamed from: b, reason: collision with root package name */
    public static final g f96567b;

    /* renamed from: c, reason: collision with root package name */
    public static final u50.f0 f96568c;

    static {
        g badge = new g(u50.g0.b(new String[0], d70.g.secret_board_label), rm1.q.LOCK);
        f96566a = badge;
        f96567b = new g(u50.g0.b(new String[0], ga2.f.lego_board_rep_archived_label), rm1.q.FILE_BOX);
        f96568c = u50.g0.a("  ·  ");
        sl1.i group = hm1.a.f69573b;
        Intrinsics.checkNotNullParameter(group, "group");
        o content = new o(u50.g0.a("132 Pins"), u50.g0.a("2 sections"), 4);
        m collaborators = m.f96537a;
        Intrinsics.checkNotNullParameter(badge, "badge");
        Intrinsics.checkNotNullParameter(collaborators, "collaborators");
        Intrinsics.checkNotNullParameter(content, "content");
    }

    public static final void a(g state, u2.q qVar, i2.o oVar, int i13, int i14) {
        Intrinsics.checkNotNullParameter(state, "state");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(1002280107);
        u2.q qVar2 = (i14 & 2) != 0 ? u2.n.f120041b : qVar;
        p1.g gVar = p1.l.f98543a;
        p1.e1 a13 = p1.c1.a(p1.l.g(com.bumptech.glide.d.A(eo1.c.sema_space_100, sVar)), u2.b.f120022j, sVar, 0);
        int i15 = sVar.P;
        z1 o13 = sVar.o();
        u2.q X = ao2.m0.X(sVar, qVar2);
        s3.k.Qo.getClass();
        s3.i iVar = s3.j.f110798b;
        if (!(sVar.f71265a instanceof i2.f)) {
            com.bumptech.glide.c.j0();
            throw null;
        }
        sVar.a0();
        if (sVar.O) {
            sVar.n(iVar);
        } else {
            sVar.j0();
        }
        tb.f.f0(sVar, a13, s3.j.f110801e);
        tb.f.f0(sVar, o13, s3.j.f110800d);
        s3.h hVar = s3.j.f110802f;
        if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i15))) {
            ep.b.y(i15, sVar, i15, hVar);
        }
        tb.f.f0(sVar, X, s3.j.f110799c);
        sVar.W(614047870);
        rm1.q qVar3 = state.f96498b;
        if (qVar3 != null) {
            ve.h.a(new rm1.d(new rm1.f(qVar3), rm1.c.SUBTLE, null, 0, null, 28), null, null, sVar, 8, 6);
        }
        sVar.r(false);
        dl2.b.c(new rn1.a(state.f96497a, vn1.c.SUBTLE, null, null, vn1.g.BODY_200, 1, null, null, null, null, false, 0, null, null, null, false, null, null, 2097100), null, null, null, sVar, 8, 14);
        sVar.r(true);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new q1.l(i13, i14, 24, state, qVar2);
        }
    }

    public static final void b(l state, u2.q qVar, k kVar, i2.o oVar, int i13, int i14) {
        Intrinsics.checkNotNullParameter(state, "state");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(1831612966);
        if ((i14 & 2) != 0) {
            qVar = u2.n.f120041b;
        }
        if ((i14 & 4) != 0) {
            kVar = k.f96527d;
        }
        sl1.i iVar = state.f96534a;
        sVar.W(1227296807);
        boolean z13 = (((i13 & 896) ^ 384) > 256 && sVar.h(kVar)) || (i13 & 384) == 256;
        Object J2 = sVar.J();
        if (z13 || J2 == i2.n.f71185a) {
            J2 = new yb0.b(kVar, 25);
            sVar.g0(J2);
        }
        sVar.r(false);
        hm1.a.a(iVar, qVar, (gm1.a) J2, sVar, (i13 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) | 520, 0);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new l1.p(i13, i14, 22, state, qVar, kVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [u50.i0] */
    public static final void c(o state, u2.q qVar, i2.o oVar, int i13, int i14) {
        u50.f0 f0Var;
        Intrinsics.checkNotNullParameter(state, "state");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(1320977052);
        u2.q qVar2 = (i14 & 2) != 0 ? u2.n.f120041b : qVar;
        Intrinsics.checkNotNullParameter(state, "<this>");
        sVar.W(1297086505);
        CharSequence charSequence = (CharSequence) dl2.b.u2(state.f96551a, sVar);
        CharSequence charSequence2 = (CharSequence) dl2.b.u2(state.f96552b, sVar);
        CharSequence charSequence3 = (CharSequence) dl2.b.u2(state.f96553c, sVar);
        if (kotlin.text.z.j(charSequence2)) {
            f0Var = state.f96551a;
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append((Object) charSequence);
            sb3.append((Object) charSequence3);
            sb3.append((Object) charSequence2);
            String string = sb3.toString();
            Intrinsics.checkNotNullParameter(string, "string");
            f0Var = new u50.f0(string);
        }
        sVar.r(false);
        dl2.b.c(new rn1.a(f0Var, vn1.c.SUBTLE, null, null, vn1.g.BODY_200, 1, null, null, null, null, false, 0, null, null, null, false, null, null, 2097100), qVar2, null, null, sVar, (i13 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) | 8, 12);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new q1.l(i13, i14, 25, state, qVar2);
        }
    }

    public static final void d(r state, u2.q qVar, k kVar, i2.o oVar, int i13, int i14) {
        Intrinsics.checkNotNullParameter(state, "state");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-2143114903);
        int i15 = i14 & 2;
        u2.n nVar = u2.n.f120041b;
        u2.q qVar2 = i15 != 0 ? nVar : qVar;
        k kVar2 = (i14 & 4) != 0 ? k.f96527d : kVar;
        p1.g gVar = p1.l.f98543a;
        p1.y a13 = p1.x.a(p1.l.g(com.bumptech.glide.d.A(eo1.c.sema_space_200, sVar)), u2.b.f120025m, sVar, 0);
        int i16 = sVar.P;
        z1 o13 = sVar.o();
        u2.q X = ao2.m0.X(sVar, qVar2);
        s3.k.Qo.getClass();
        s3.i iVar = s3.j.f110798b;
        boolean z13 = sVar.f71265a instanceof i2.f;
        if (!z13) {
            com.bumptech.glide.c.j0();
            throw null;
        }
        sVar.a0();
        if (sVar.O) {
            sVar.n(iVar);
        } else {
            sVar.j0();
        }
        s3.h hVar = s3.j.f110801e;
        tb.f.f0(sVar, a13, hVar);
        s3.h hVar2 = s3.j.f110800d;
        tb.f.f0(sVar, o13, hVar2);
        s3.h hVar3 = s3.j.f110802f;
        if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i16))) {
            ep.b.y(i16, sVar, i16, hVar3);
        }
        s3.h hVar4 = s3.j.f110799c;
        tb.f.f0(sVar, X, hVar4);
        p1.e1 a14 = p1.c1.a(p1.l.f98543a, u2.b.f120023k, sVar, 48);
        int i17 = sVar.P;
        z1 o14 = sVar.o();
        u2.q X2 = ao2.m0.X(sVar, nVar);
        if (!z13) {
            com.bumptech.glide.c.j0();
            throw null;
        }
        sVar.a0();
        if (sVar.O) {
            sVar.n(iVar);
        } else {
            sVar.j0();
        }
        tb.f.f0(sVar, a14, hVar);
        tb.f.f0(sVar, o14, hVar2);
        if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i17))) {
            ep.b.y(i17, sVar, i17, hVar3);
        }
        tb.f.f0(sVar, X2, hVar4);
        i iVar2 = state.f96572a;
        sVar.W(116450626);
        if (iVar2 instanceof g) {
            a((g) iVar2, null, sVar, 8, 2);
            e(null, sVar, 0, 1);
        }
        sVar.r(false);
        c(state.f96574c, null, sVar, 8, 2);
        sVar.r(true);
        n nVar2 = state.f96573b;
        if (nVar2 instanceof l) {
            b((l) nVar2, null, kVar2, sVar, (i13 & 896) | 8, 2);
        }
        sVar.r(true);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new l1.p(i13, i14, 23, state, qVar2, kVar2);
        }
    }

    public static final void e(u2.q qVar, i2.o oVar, int i13, int i14) {
        u2.q qVar2;
        int i15;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(1770345447);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            qVar2 = qVar;
        } else if ((i13 & 14) == 0) {
            qVar2 = qVar;
            i15 = (sVar.h(qVar2) ? 4 : 2) | i13;
        } else {
            qVar2 = qVar;
            i15 = i13;
        }
        if ((i15 & 11) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            u2.q qVar3 = i16 != 0 ? u2.n.f120041b : qVar2;
            dl2.b.c(new rn1.a(f96568c, vn1.c.SUBTLE, null, null, vn1.g.BODY_200, 1, null, null, null, null, false, 0, null, null, null, false, null, null, 2097100), qVar3, null, null, sVar, ((i15 << 3) & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) | 8, 12);
            qVar2 = qVar3;
        }
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new w1.c(qVar2, i13, i14, 5);
        }
    }
}
