package h6;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public int f67753a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f67754b;

    /* renamed from: c, reason: collision with root package name */
    public d0 f67755c;

    /* renamed from: d, reason: collision with root package name */
    public d0 f67756d;

    /* renamed from: e, reason: collision with root package name */
    public int f67757e;

    /* renamed from: f, reason: collision with root package name */
    public int f67758f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f67759g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f67760h;

    public w(d0 d0Var, boolean z13, int[] iArr) {
        this.f67754b = d0Var;
        this.f67755c = d0Var;
        this.f67759g = z13;
        this.f67760h = iArr;
    }

    public final void a() {
        this.f67753a = 1;
        this.f67755c = this.f67754b;
        this.f67758f = 0;
    }

    public final boolean b() {
        int[] iArr;
        i6.a c13 = this.f67755c.f67705b.c();
        int a13 = c13.a(6);
        if ((a13 == 0 || c13.f71621b.get(a13 + c13.f71620a) == 0) && this.f67757e != 65039) {
            return this.f67759g && ((iArr = this.f67760h) == null || Arrays.binarySearch(iArr, this.f67755c.f67705b.a(0)) < 0);
        }
        return true;
    }
}
