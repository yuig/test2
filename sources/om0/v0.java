package om0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v0 implements u50.o {

    /* renamed from: c, reason: collision with root package name */
    public static final v0 f96607c = new v0(kotlin.collections.q0.f80391a);

    /* renamed from: a, reason: collision with root package name */
    public final List f96608a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f96609b;

    public v0(List previews) {
        Intrinsics.checkNotNullParameter(previews, "previews");
        this.f96608a = previews;
        this.f96609b = previews.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v0) && Intrinsics.d(this.f96608a, ((v0) obj).f96608a);
    }

    public final int hashCode() {
        return this.f96608a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("SavedContentGridState(previews="), this.f96608a, ")");
    }
}
