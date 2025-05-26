package v9;

/* loaded from: classes3.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f124631a;

    /* renamed from: b, reason: collision with root package name */
    public final int f124632b;

    /* renamed from: c, reason: collision with root package name */
    public final int f124633c;

    /* renamed from: d, reason: collision with root package name */
    public int f124634d;

    /* renamed from: e, reason: collision with root package name */
    public String f124635e;

    public h0(int i13, int i14) {
        this(Integer.MIN_VALUE, i13, i14);
    }

    public final void a() {
        int i13 = this.f124634d;
        this.f124634d = i13 == Integer.MIN_VALUE ? this.f124632b : i13 + this.f124633c;
        this.f124635e = this.f124631a + this.f124634d;
    }

    public final void b() {
        if (this.f124634d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public h0(int i13, int i14, int i15) {
        String str;
        if (i13 != Integer.MIN_VALUE) {
            str = i13 + "/";
        } else {
            str = "";
        }
        this.f124631a = str;
        this.f124632b = i14;
        this.f124633c = i15;
        this.f124634d = Integer.MIN_VALUE;
        this.f124635e = "";
    }
}
