package rm1;

import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class f extends g {

    /* renamed from: a, reason: collision with root package name */
    public final q f108702a;

    /* renamed from: b, reason: collision with root package name */
    public final i f108703b;

    public f(q icon, i size) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(size, "size");
        this.f108702a = icon;
        this.f108703b = size;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f108702a == fVar.f108702a && this.f108703b == fVar.f108703b;
    }

    public final int hashCode() {
        return this.f108703b.hashCode() + (this.f108702a.hashCode() * 31);
    }

    public final String toString() {
        return "Standard(icon=" + this.f108702a + ", size=" + this.f108703b + ")";
    }

    public f(q qVar) {
        this(qVar, GestaltIcon.f49403e);
    }
}
