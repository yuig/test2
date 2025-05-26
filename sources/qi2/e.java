package qi2;

import java.util.Objects;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f104007a;

    public e(String str) {
        this.f104007a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            if (Objects.equals(this.f104007a, ((e) obj).f104007a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f104007a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("ValueString{"), this.f104007a, "}");
    }
}
