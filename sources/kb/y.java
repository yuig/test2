package kb;

/* loaded from: classes.dex */
public final class y extends z {

    /* renamed from: a */
    public final l f79053a;

    public y(l lVar) {
        this.f79053a = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y.class != obj.getClass()) {
            return false;
        }
        return this.f79053a.equals(((y) obj).f79053a);
    }

    public final int hashCode() {
        return this.f79053a.hashCode() + (y.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.f79053a + '}';
    }
}
