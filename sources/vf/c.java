package vf;

import sf.n;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final float f125765a;

    /* renamed from: b, reason: collision with root package name */
    public final float f125766b;

    /* renamed from: c, reason: collision with root package name */
    public final float f125767c;

    /* renamed from: d, reason: collision with root package name */
    public final float f125768d;

    /* renamed from: e, reason: collision with root package name */
    public final int f125769e;

    /* renamed from: f, reason: collision with root package name */
    public final int f125770f;

    /* renamed from: g, reason: collision with root package name */
    public final int f125771g;

    /* renamed from: h, reason: collision with root package name */
    public final n f125772h;

    /* renamed from: i, reason: collision with root package name */
    public float f125773i;

    /* renamed from: j, reason: collision with root package name */
    public float f125774j;

    public c(float f13, float f14, float f15, float f16, int i13, n nVar) {
        this.f125769e = -1;
        this.f125771g = -1;
        this.f125765a = f13;
        this.f125766b = f14;
        this.f125767c = f15;
        this.f125768d = f16;
        this.f125770f = i13;
        this.f125772h = nVar;
    }

    public final boolean a(c cVar) {
        return cVar != null && this.f125770f == cVar.f125770f && this.f125765a == cVar.f125765a && this.f125771g == cVar.f125771g && this.f125769e == cVar.f125769e;
    }

    public final String toString() {
        return "Highlight, x: " + this.f125765a + ", y: " + this.f125766b + ", dataSetIndex: " + this.f125770f + ", stackIndex (only stacked barentry): " + this.f125771g;
    }

    public c(float f13, float f14, float f15, float f16, int i13, n nVar, int i14) {
        this(f13, f14, f15, f16, i13, nVar);
        this.f125771g = -1;
    }
}
