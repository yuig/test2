package av0;

import com.pinterest.api.model.tp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n extends kg.a {

    /* renamed from: f, reason: collision with root package name */
    public final tp f20514f;

    /* renamed from: g, reason: collision with root package name */
    public final String f20515g;

    public n(tp page, String path) {
        Intrinsics.checkNotNullParameter(page, "page");
        Intrinsics.checkNotNullParameter(path, "path");
        this.f20514f = page;
        this.f20515g = path;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.d(this.f20514f, nVar.f20514f) && Intrinsics.d(this.f20515g, nVar.f20515g);
    }

    public final int hashCode() {
        return this.f20515g.hashCode() + (this.f20514f.hashCode() * 31);
    }

    public final String toString() {
        return "OnPageAdjustedImageGenerated(page=" + this.f20514f + ", path=" + this.f20515g + ")";
    }
}
