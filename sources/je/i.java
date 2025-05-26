package je;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    public final int f75628a;

    /* renamed from: b, reason: collision with root package name */
    public final int f75629b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f75630c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f75631d;

    /* renamed from: e, reason: collision with root package name */
    public final String f75632e;

    public i(int i13, int i14, String str, boolean z13, boolean z14) {
        this.f75628a = i13;
        this.f75629b = i14;
        this.f75630c = z13;
        this.f75631d = z14;
        this.f75632e = str;
    }

    @Override // je.h
    public final boolean a(bb.p pVar, p1 p1Var) {
        int i13;
        int i14;
        boolean z13 = this.f75631d;
        String str = this.f75632e;
        if (z13 && str == null) {
            str = p1Var.n();
        }
        n1 n1Var = p1Var.f75758b;
        if (n1Var != null) {
            Iterator it = n1Var.getChildren().iterator();
            i14 = 0;
            i13 = 0;
            while (it.hasNext()) {
                p1 p1Var2 = (p1) ((r1) it.next());
                if (p1Var2 == p1Var) {
                    i14 = i13;
                }
                if (str == null || p1Var2.n().equals(str)) {
                    i13++;
                }
            }
        } else {
            i13 = 1;
            i14 = 0;
        }
        int i15 = this.f75630c ? i14 + 1 : i13 - i14;
        int i16 = this.f75628a;
        int i17 = this.f75629b;
        if (i16 == 0) {
            return i15 == i17;
        }
        int i18 = i15 - i17;
        return i18 % i16 == 0 && (Integer.signum(i18) == 0 || Integer.signum(i18) == Integer.signum(i16));
    }

    public final String toString() {
        String str = this.f75630c ? "" : "last-";
        boolean z13 = this.f75631d;
        int i13 = this.f75629b;
        int i14 = this.f75628a;
        return z13 ? String.format("nth-%schild(%dn%+d of type <%s>)", str, Integer.valueOf(i14), Integer.valueOf(i13), this.f75632e) : String.format("nth-%schild(%dn%+d)", str, Integer.valueOf(i14), Integer.valueOf(i13));
    }
}
