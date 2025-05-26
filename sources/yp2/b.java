package yp2;

/* loaded from: classes4.dex */
public abstract class b {
    public abstract e b();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return b().equals(((b) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return b().hashCode();
    }
}
