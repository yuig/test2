package i2;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class t3 implements Iterable, ll2.a {

    /* renamed from: a, reason: collision with root package name */
    public final w2 f71302a;

    /* renamed from: b, reason: collision with root package name */
    public final int f71303b;

    /* renamed from: c, reason: collision with root package name */
    public final c0.d f71304c;

    public t3(w2 w2Var, int i13, y0 y0Var, e eVar) {
        this.f71302a = w2Var;
        this.f71303b = i13;
        this.f71304c = eVar;
        y0Var.getClass();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new s3(this.f71302a, this.f71303b, null, this.f71304c);
    }
}
