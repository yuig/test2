package ee0;

import cw0.c;
import gk2.f1;
import gk2.r2;
import ja.f0;
import ja.j0;
import kotlin.jvm.internal.Intrinsics;
import ra0.l0;
import tk2.e;
import xa0.j;
import zd0.d;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final d f58779a;

    public b(d fontDao) {
        Intrinsics.checkNotNullParameter(fontDao, "fontDao");
        this.f58779a = fontDao;
    }

    public final r2 a() {
        d dVar = this.f58779a;
        dVar.getClass();
        c cVar = c.Creation;
        f0 d2 = f0.d(1, "SELECT * FROM idea_pin_font WHERE type = ?");
        dVar.f141668c.getClass();
        d2.u1(1, j.f(cVar));
        f1 f1Var = new f1(j0.a(dVar.f141666a, new String[]{"idea_pin_font"}, new zd0.c(dVar, d2, 1)), new lb0.c(7, new l0(dVar, 24)), 0);
        Intrinsics.checkNotNullExpressionValue(f1Var, "map(...)");
        r2 n13 = f1Var.n(e.f118017c);
        Intrinsics.checkNotNullExpressionValue(n13, "subscribeOn(...)");
        return n13;
    }
}
