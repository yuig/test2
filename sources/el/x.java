package el;

import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final v f59552a;

    /* renamed from: b, reason: collision with root package name */
    public final List f59553b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f59554c;

    public x(v vVar, List list, Integer num) {
        this.f59552a = vVar;
        this.f59553b = list;
        this.f59554c = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f59552a.equals(xVar.f59552a) && this.f59553b.equals(xVar.f59553b) && Objects.equals(this.f59554c, xVar.f59554c);
    }

    public final int hashCode() {
        return Objects.hash(this.f59552a, this.f59553b);
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.f59552a, this.f59553b, this.f59554c);
    }
}
