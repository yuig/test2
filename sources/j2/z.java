package j2;

import i2.y2;

/* loaded from: classes2.dex */
public final class z extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final z f74482c;

    static {
        int i13 = 0;
        f74482c = new z(i13, i13, 3);
    }

    @Override // j2.j0
    public final void a(k0 k0Var, i2.f fVar, y2 y2Var, i2.y yVar) {
        if (y2Var.f71389n != 0) {
            i2.u.i("Cannot reset when inserting");
            throw null;
        }
        y2Var.B();
        y2Var.f71395t = 0;
        y2Var.f71396u = y2Var.m() - y2Var.f71383h;
        y2Var.f71384i = 0;
        y2Var.f71385j = 0;
        y2Var.f71390o = 0;
    }
}
