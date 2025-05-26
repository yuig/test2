package q5;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public int f102514a;

    /* renamed from: b, reason: collision with root package name */
    public int f102515b;

    public /* synthetic */ u(int i13, int i14) {
        this.f102514a = i13;
        this.f102515b = i14;
    }

    public final int a() {
        int i13 = this.f102515b;
        if (i13 == 2) {
            return 10;
        }
        if (i13 == 5) {
            return 11;
        }
        if (i13 == 29) {
            return 12;
        }
        if (i13 == 42) {
            return 16;
        }
        if (i13 != 22) {
            return i13 != 23 ? 0 : 15;
        }
        return 1073741824;
    }

    public final int b() {
        return this.f102514a | this.f102515b;
    }

    public final void c(int i13, int i14) {
        if (i14 == 1) {
            this.f102515b = i13;
        } else {
            this.f102514a = i13;
        }
    }

    public final void d(int i13) {
        if (i13 == 1) {
            this.f102515b = 0;
        } else {
            this.f102514a = 0;
        }
    }
}
