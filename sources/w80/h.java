package w80;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final List f128294a;

    /* renamed from: b, reason: collision with root package name */
    public final List f128295b;

    /* renamed from: c, reason: collision with root package name */
    public final float f128296c;

    public h(ArrayList startActions, ArrayList endActions, float f13) {
        Intrinsics.checkNotNullParameter(startActions, "startActions");
        Intrinsics.checkNotNullParameter(endActions, "endActions");
        this.f128294a = startActions;
        this.f128295b = endActions;
        this.f128296c = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.f128294a, hVar.f128294a) && Intrinsics.d(this.f128295b, hVar.f128295b) && n4.e.a(this.f128296c, hVar.f128296c);
    }

    public final int hashCode() {
        return Float.hashCode(this.f128296c) + ep.b.c(this.f128295b, this.f128294a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "CollageComposerTopBarState(startActions=" + this.f128294a + ", endActions=" + this.f128295b + ", placeholderHeight=" + n4.e.b(this.f128296c) + ")";
    }
}
