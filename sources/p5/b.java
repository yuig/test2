package p5;

import java.util.Objects;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f98855a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f98856b;

    public b(Object obj, Object obj2) {
        this.f98855a = obj;
        this.f98856b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Objects.equals(bVar.f98855a, this.f98855a) && Objects.equals(bVar.f98856b, this.f98856b);
    }

    public final int hashCode() {
        Object obj = this.f98855a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f98856b;
        return (obj2 != null ? obj2.hashCode() : 0) ^ hashCode;
    }

    public final String toString() {
        return "Pair{" + this.f98855a + " " + this.f98856b + "}";
    }
}
