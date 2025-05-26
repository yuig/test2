package ga;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final List f64580a;

    public b(ArrayList topics) {
        Intrinsics.checkNotNullParameter(topics, "topics");
        this.f64580a = topics;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        List list = this.f64580a;
        b bVar = (b) obj;
        if (list.size() != bVar.f64580a.size()) {
            return false;
        }
        return Intrinsics.d(new HashSet(list), new HashSet(bVar.f64580a));
    }

    public final int hashCode() {
        return Objects.hash(this.f64580a);
    }

    public final String toString() {
        return "Topics=" + this.f64580a;
    }
}
