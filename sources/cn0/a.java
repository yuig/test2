package cn0;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f28039a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28040b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f28041c;

    public a(int i13, int i14, boolean z13) {
        this.f28039a = i13;
        this.f28040b = i14;
        this.f28041c = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f28039a == aVar.f28039a && this.f28040b == aVar.f28040b && this.f28041c == aVar.f28041c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f28041c) + ep.b.b(this.f28040b, Integer.hashCode(this.f28039a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FrameInfo(frameIndex=");
        sb3.append(this.f28039a);
        sb3.append(", maxFrameIndex=");
        sb3.append(this.f28040b);
        sb3.append(", isEndOfStream=");
        return a.a.r(sb3, this.f28041c, ")");
    }
}
