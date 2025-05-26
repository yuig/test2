package androidx.compose.foundation.lazy.layout;

/* loaded from: classes2.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final k2.e f17318a = new k2.e(new f[16]);

    /* renamed from: b, reason: collision with root package name */
    public int f17319b;

    /* renamed from: c, reason: collision with root package name */
    public f f17320c;

    public final void a(int i13, q qVar) {
        if (i13 < 0) {
            throw new IllegalArgumentException(a.a.d("size should be >=0, but was ", i13).toString());
        }
        if (i13 == 0) {
            return;
        }
        f fVar = new f(this.f17319b, qVar, i13);
        this.f17319b += i13;
        this.f17318a.b(fVar);
    }

    public final void b(int i13) {
        if (i13 < 0 || i13 >= this.f17319b) {
            StringBuilder s13 = a.a.s("Index ", i13, ", size ");
            s13.append(this.f17319b);
            throw new IndexOutOfBoundsException(s13.toString());
        }
    }

    public final f c(int i13) {
        b(i13);
        f fVar = this.f17320c;
        if (fVar != null) {
            int i14 = fVar.f17237b;
            int i15 = fVar.f17236a;
            if (i13 < i14 + i15 && i15 <= i13) {
                return fVar;
            }
        }
        k2.e eVar = this.f17318a;
        f fVar2 = (f) eVar.f78182a[o.g(i13, eVar)];
        this.f17320c = fVar2;
        return fVar2;
    }
}
