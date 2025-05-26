package oi;

/* loaded from: classes3.dex */
public final class a4 {

    /* renamed from: a, reason: collision with root package name */
    public final int f94637a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f94638b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f94639c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y3 f94640d;

    public a4(y3 y3Var, int i13, boolean z13, boolean z14) {
        this.f94640d = y3Var;
        this.f94637a = i13;
        this.f94638b = z13;
        this.f94639c = z14;
    }

    public final void a(Object obj, Object obj2, String str) {
        this.f94640d.w(this.f94637a, this.f94638b, this.f94639c, str, obj, obj2, null);
    }

    public final void b(Object obj, String str) {
        this.f94640d.w(this.f94637a, this.f94638b, this.f94639c, str, obj, null, null);
    }

    public final void c(String str) {
        this.f94640d.w(this.f94637a, this.f94638b, this.f94639c, str, null, null, null);
    }

    public final void d(String str, Object obj, Object obj2, Object obj3) {
        this.f94640d.w(this.f94637a, this.f94638b, this.f94639c, str, obj, obj2, obj3);
    }
}
