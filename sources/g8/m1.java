package g8;

import pk.v2;

/* loaded from: classes.dex */
public final class m1 {

    /* renamed from: d, reason: collision with root package name */
    public static final m1 f64347d = new m1(new a7.c1[0]);

    /* renamed from: a, reason: collision with root package name */
    public final int f64348a;

    /* renamed from: b, reason: collision with root package name */
    public final v2 f64349b;

    /* renamed from: c, reason: collision with root package name */
    public int f64350c;

    static {
        d7.n0.Q(0);
    }

    public m1(a7.c1... c1VarArr) {
        this.f64349b = pk.c1.s(c1VarArr);
        this.f64348a = c1VarArr.length;
        int i13 = 0;
        while (true) {
            v2 v2Var = this.f64349b;
            if (i13 >= v2Var.size()) {
                return;
            }
            int i14 = i13 + 1;
            for (int i15 = i14; i15 < v2Var.size(); i15++) {
                if (((a7.c1) v2Var.get(i13)).equals(v2Var.get(i15))) {
                    d7.u.d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i13 = i14;
        }
    }

    public final a7.c1 a(int i13) {
        return (a7.c1) this.f64349b.get(i13);
    }

    public final int b(a7.c1 c1Var) {
        int indexOf = this.f64349b.indexOf(c1Var);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m1.class != obj.getClass()) {
            return false;
        }
        m1 m1Var = (m1) obj;
        return this.f64348a == m1Var.f64348a && this.f64349b.equals(m1Var.f64349b);
    }

    public final int hashCode() {
        if (this.f64350c == 0) {
            this.f64350c = this.f64349b.hashCode();
        }
        return this.f64350c;
    }

    public final String toString() {
        return this.f64349b.toString();
    }
}
