package l8;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public int f82075a;

    /* renamed from: b, reason: collision with root package name */
    public int f82076b;

    /* renamed from: c, reason: collision with root package name */
    public int f82077c;

    /* renamed from: d, reason: collision with root package name */
    public int f82078d;

    public /* synthetic */ p(int i13, int i14, int i15, int i16) {
        this.f82075a = i13;
        this.f82076b = i14;
        this.f82077c = i15;
        this.f82078d = i16;
    }

    public boolean a(int i13) {
        if (i13 == 1) {
            if (this.f82075a - this.f82076b <= 1) {
                return false;
            }
        } else if (this.f82077c - this.f82078d <= 1) {
            return false;
        }
        return true;
    }

    public p() {
        this.f82075a = -1;
        this.f82076b = -1;
        this.f82077c = -1;
        this.f82078d = -1;
    }
}
