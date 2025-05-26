package v9;

import a7.o0;
import java.util.List;
import q8.k0;

/* loaded from: classes3.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f124641a;

    /* renamed from: b, reason: collision with root package name */
    public final k0[] f124642b;

    public j0(List list) {
        this.f124641a = list;
        this.f124642b = new k0[list.size()];
    }

    public final void a(long j13, d7.d0 d0Var) {
        if (d0Var.a() < 9) {
            return;
        }
        int k13 = d0Var.k();
        int k14 = d0Var.k();
        int y13 = d0Var.y();
        if (k13 == 434 && k14 == 1195456820 && y13 == 3) {
            f0.h.v(j13, d0Var, this.f124642b);
        }
    }

    public final void b(q8.u uVar, h0 h0Var) {
        int i13 = 0;
        while (true) {
            k0[] k0VarArr = this.f124642b;
            if (i13 >= k0VarArr.length) {
                return;
            }
            h0Var.a();
            h0Var.b();
            k0 D = uVar.D(h0Var.f124634d, 3);
            androidx.media3.common.b bVar = (androidx.media3.common.b) this.f124641a.get(i13);
            String str = bVar.f18765o;
            bf.b.h("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            a7.q qVar = new a7.q();
            h0Var.b();
            qVar.f1168a = h0Var.f124635e;
            qVar.f1180m = o0.r("video/mp2t");
            qVar.f1181n = o0.r(str);
            qVar.f1172e = bVar.f18755e;
            qVar.f1171d = bVar.f18754d;
            qVar.I = bVar.f18750J;
            qVar.f1184q = bVar.f18768r;
            D.b(new androidx.media3.common.b(qVar));
            k0VarArr[i13] = D;
            i13++;
        }
    }
}
