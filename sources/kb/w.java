package kb;

/* loaded from: classes3.dex */
public final class w extends z {

    /* renamed from: a, reason: collision with root package name */
    public final l f79047a = l.f79018b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w.class != obj.getClass()) {
            return false;
        }
        return this.f79047a.equals(((w) obj).f79047a);
    }

    public final int hashCode() {
        return this.f79047a.hashCode() + (w.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.f79047a + '}';
    }
}
