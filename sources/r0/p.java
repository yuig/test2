package r0;

/* loaded from: classes2.dex */
public final class p extends q {

    /* renamed from: b, reason: collision with root package name */
    public final d f105617b;

    public p(d dVar) {
        super(dVar);
        this.f105617b = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        return this.f105617b.equals(((p) obj).f105617b);
    }

    public final int hashCode() {
        return this.f105617b.hashCode();
    }

    public final String toString() {
        return this.f105617b.toString().replaceFirst("FileOutputOptionsInternal", "FileOutputOptions");
    }
}
