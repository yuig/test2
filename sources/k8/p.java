package k8;

import java.util.Objects;
import pk.d3;
import pk.j0;
import pk.s2;
import pk.t2;

/* loaded from: classes.dex */
public final class p extends o {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f78546e;

    /* renamed from: f, reason: collision with root package name */
    public final j f78547f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f78548g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f78549h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f78550i;

    /* renamed from: j, reason: collision with root package name */
    public final int f78551j;

    /* renamed from: k, reason: collision with root package name */
    public final int f78552k;

    /* renamed from: l, reason: collision with root package name */
    public final int f78553l;

    /* renamed from: m, reason: collision with root package name */
    public final int f78554m;

    /* renamed from: n, reason: collision with root package name */
    public final int f78555n;

    /* renamed from: o, reason: collision with root package name */
    public final int f78556o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f78557p;

    /* renamed from: q, reason: collision with root package name */
    public final int f78558q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f78559r;

    /* renamed from: s, reason: collision with root package name */
    public final int f78560s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f78561t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f78562u;

    /* renamed from: v, reason: collision with root package name */
    public final int f78563v;

    /* JADX WARN: Removed duplicated region for block: B:108:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x010d A[EDGE_INSN: B:113:0x010d->B:76:0x010d BREAK  A[LOOP:1: B:68:0x00f0->B:111:0x010a], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p(int r5, a7.c1 r6, int r7, k8.j r8, int r9, java.lang.String r10, int r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.p.<init>(int, a7.c1, int, k8.j, int, java.lang.String, int, boolean):void");
    }

    public static int c(p pVar, p pVar2) {
        t2 a13 = (pVar.f78546e && pVar.f78549h) ? q.f78564j : q.f78564j.a();
        j0 j0Var = j0.f100432a;
        boolean z13 = pVar.f78547f.B;
        int i13 = pVar.f78551j;
        if (z13) {
            j0Var = j0Var.b(Integer.valueOf(i13), Integer.valueOf(pVar2.f78551j), q.f78564j.a());
        }
        return j0Var.b(Integer.valueOf(pVar.f78552k), Integer.valueOf(pVar2.f78552k), a13).b(Integer.valueOf(i13), Integer.valueOf(pVar2.f78551j), a13).e();
    }

    public static int d(p pVar, p pVar2) {
        j0 c13 = j0.f100432a.c(pVar.f78549h, pVar2.f78549h);
        Integer valueOf = Integer.valueOf(pVar.f78554m);
        Integer valueOf2 = Integer.valueOf(pVar2.f78554m);
        s2.f100480a.getClass();
        d3 d3Var = d3.f100381a;
        j0 b13 = c13.b(valueOf, valueOf2, d3Var).a(pVar.f78555n, pVar2.f78555n).a(pVar.f78556o, pVar2.f78556o).c(pVar.f78557p, pVar2.f78557p).a(pVar.f78558q, pVar2.f78558q).c(pVar.f78550i, pVar2.f78550i).c(pVar.f78546e, pVar2.f78546e).c(pVar.f78548g, pVar2.f78548g).b(Integer.valueOf(pVar.f78553l), Integer.valueOf(pVar2.f78553l), d3Var);
        boolean z13 = pVar2.f78561t;
        boolean z14 = pVar.f78561t;
        j0 c14 = b13.c(z14, z13);
        boolean z15 = pVar2.f78562u;
        boolean z16 = pVar.f78562u;
        j0 c15 = c14.c(z16, z15);
        if (z14 && z16) {
            c15 = c15.a(pVar.f78563v, pVar2.f78563v);
        }
        return c15.e();
    }

    @Override // k8.o
    public final int a() {
        return this.f78560s;
    }

    @Override // k8.o
    public final boolean b(o oVar) {
        p pVar = (p) oVar;
        if (this.f78559r || Objects.equals(this.f78545d.f18765o, pVar.f78545d.f18765o)) {
            if (!this.f78547f.f78531J) {
                if (this.f78561t != pVar.f78561t || this.f78562u != pVar.f78562u) {
                }
            }
            return true;
        }
        return false;
    }
}
