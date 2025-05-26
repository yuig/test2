package rm1;

import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e extends g {

    /* renamed from: a, reason: collision with root package name */
    public final n f108700a;

    /* renamed from: b, reason: collision with root package name */
    public final h f108701b;

    public e(n icon, h size) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(size, "size");
        this.f108700a = icon;
        this.f108701b = size;
    }

    public final n c() {
        return this.f108700a;
    }

    public final h d() {
        return this.f108701b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f108700a == eVar.f108700a && this.f108701b == eVar.f108701b;
    }

    public final int hashCode() {
        return this.f108701b.hashCode() + (this.f108700a.hashCode() * 31);
    }

    public final String toString() {
        return "Compact(icon=" + this.f108700a + ", size=" + this.f108701b + ")";
    }

    public e(n nVar) {
        this(nVar, GestaltIcon.f49404f);
    }
}
