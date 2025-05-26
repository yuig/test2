package androidx.compose.foundation.lazy.layout;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f17236a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17237b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f17238c;

    public f(int i13, q qVar, int i14) {
        this.f17236a = i13;
        this.f17237b = i14;
        this.f17238c = qVar;
        if (i13 < 0) {
            throw new IllegalArgumentException(a.a.d("startIndex should be >= 0, but was ", i13).toString());
        }
        if (i14 <= 0) {
            throw new IllegalArgumentException(a.a.d("size should be >0, but was ", i14).toString());
        }
    }
}
