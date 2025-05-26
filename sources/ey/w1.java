package ey;

/* loaded from: classes.dex */
public abstract class w1 extends u1 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f60609c;

    /* renamed from: d, reason: collision with root package name */
    public final String f60610d;

    public w1(int i13) {
        this.f60609c = i13;
        if (i13 == 3) {
            this.f60610d = oy.u.f98204a;
        } else if (i13 != 4) {
            this.f60610d = oy.w1.f98229a;
        } else {
            this.f60610d = oy.d0.f98027a;
        }
    }

    @Override // ey.u1
    public String e() {
        return this.f60610d;
    }

    @Override // ey.u1
    public final String g() {
        return null;
    }

    @Override // ey.u1
    public String[] h() {
        switch (this.f60609c) {
            case 0:
                return a3.f60429a;
            case 1:
                return a3.f60432d;
            default:
                return null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w1(int i13, int i14) {
        this(2);
        this.f60609c = i13;
        if (i13 == 3) {
            this(3);
        } else if (i13 != 4) {
        } else {
            this(4);
        }
    }

    public /* synthetic */ w1(String str, int i13) {
        this.f60609c = i13;
        this.f60610d = str;
    }
}
