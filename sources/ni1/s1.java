package ni1;

/* loaded from: classes2.dex */
public final class s1 implements z1 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1)) {
            return false;
        }
        ((s1) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true);
    }

    public final String toString() {
        return "PreventLongPressAndClickthroughEvent(isPrevented=true)";
    }
}
