package m5;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public String f85833a;

    /* renamed from: b, reason: collision with root package name */
    public String f85834b;

    /* renamed from: c, reason: collision with root package name */
    public List f85835c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Objects.equals(this.f85833a, aVar.f85833a) && Objects.equals(this.f85834b, aVar.f85834b) && Objects.equals(this.f85835c, aVar.f85835c);
    }

    public final int hashCode() {
        return Objects.hash(this.f85833a, this.f85834b, this.f85835c);
    }
}
