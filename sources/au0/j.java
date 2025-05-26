package au0;

import ja.f0;
import ja.j0;
import kk2.t;
import kotlin.jvm.internal.Intrinsics;
import so.na;

/* loaded from: classes5.dex */
public final class j extends yk1.b {

    /* renamed from: a, reason: collision with root package name */
    public final wk2.a f20499a;

    /* renamed from: b, reason: collision with root package name */
    public final wk2.a f20500b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(bf2.d ideaPinFontDataProvider, na crashReporting) {
        super(0);
        Intrinsics.checkNotNullParameter(ideaPinFontDataProvider, "ideaPinFontDataProvider");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        this.f20499a = ideaPinFontDataProvider;
        this.f20500b = crashReporting;
    }

    public final void p3(String id3, boolean z13) {
        Intrinsics.checkNotNullParameter(id3, "id");
        ee0.b bVar = (ee0.b) this.f20499a.get();
        bVar.getClass();
        Intrinsics.checkNotNullParameter(id3, "id");
        zd0.d dVar = bVar.f58779a;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(id3, "id");
        f0 d2 = f0.d(1, "SELECT * FROM idea_pin_font WHERE id = ?");
        d2.c1(1, id3);
        t r13 = j0.b(new zd0.c(dVar, d2, 2)).k(new lb0.c(15, new ee0.a(bVar, 0))).r(tk2.e.f118017c);
        Intrinsics.checkNotNullExpressionValue(r13, "subscribeOn(...)");
        xj2.c o13 = r13.l(wj2.c.a()).o(new h(0, new r1.f(z13, this, 19)), new h(1, new i(this, id3)));
        Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
        addDisposable(o13);
    }
}
