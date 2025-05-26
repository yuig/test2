package eg;

import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class a implements dg.a {

    /* renamed from: a, reason: collision with root package name */
    public final Class f58842a;

    /* renamed from: b, reason: collision with root package name */
    public final int f58843b;

    public a(int i13, Object obj) {
        this.f58843b = i13;
        this.f58842a = obj == null ? null : obj.getClass();
    }

    @Override // dg.a
    public final boolean a(List list) {
        if (list == null) {
            return false;
        }
        int size = list.size();
        int i13 = this.f58843b;
        if (size <= i13) {
            return false;
        }
        Object obj = list.get(i13);
        Class<?> cls = this.f58842a;
        if (obj == null || cls == obj.getClass()) {
            return obj != null || cls == null;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return Objects.equals(this.f58842a, ((a) obj).f58842a);
        }
        return false;
    }

    public final int hashCode() {
        Class cls = this.f58842a;
        if (cls == null) {
            return 0;
        }
        return cls.hashCode();
    }

    public final String toString() {
        return "[ClassGuard: " + this.f58843b + " " + this.f58842a.getName() + "]";
    }
}
