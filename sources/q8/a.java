package q8;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f102844a;

    /* renamed from: b, reason: collision with root package name */
    public final int f102845b;

    /* renamed from: c, reason: collision with root package name */
    public final String f102846c;

    public /* synthetic */ a(int i13, int i14, String str) {
        this.f102844a = i13;
        this.f102845b = i14;
        this.f102846c = str;
    }

    public static a a(d7.d0 d0Var) {
        String str;
        d0Var.L(2);
        int y13 = d0Var.y();
        int i13 = y13 >> 1;
        int y14 = ((d0Var.y() >> 3) & 31) | ((y13 & 1) << 5);
        if (i13 == 4 || i13 == 5 || i13 == 7 || i13 == 8) {
            str = "dvhe";
        } else if (i13 == 9) {
            str = "dvav";
        } else {
            if (i13 != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder i14 = n60.o.i(str);
        i14.append(i13 < 10 ? ".0" : ".");
        i14.append(i13);
        i14.append(y14 < 10 ? ".0" : ".");
        i14.append(y14);
        return new a(i13, y14, i14.toString());
    }
}
