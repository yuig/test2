package yl;

/* loaded from: classes3.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final int f139271a;

    /* renamed from: b, reason: collision with root package name */
    public final d f139272b;

    public a(int i13, d dVar) {
        this.f139271a = i13;
        this.f139272b = dVar;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return e.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f139271a == ((a) eVar).f139271a && this.f139272b.equals(((a) eVar).f139272b);
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (14552422 ^ this.f139271a) + (this.f139272b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f139271a + "intEncoding=" + this.f139272b + ')';
    }
}
