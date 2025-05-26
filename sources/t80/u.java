package t80;

/* loaded from: classes5.dex */
public final class u implements z {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        ((u) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (Boolean.hashCode(true) * 31);
    }

    public final String toString() {
        return "LoadContent(allowDrafts=true, allowRemixes=true)";
    }
}
