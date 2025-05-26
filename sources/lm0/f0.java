package lm0;

import com.pinterest.api.model.ba;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f0 implements l82.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final ba f83862a;

    /* renamed from: b, reason: collision with root package name */
    public final int f83863b;

    /* renamed from: c, reason: collision with root package name */
    public final int f83864c;

    /* renamed from: d, reason: collision with root package name */
    public final String f83865d;

    public f0(ba section, int i13, int i14) {
        Intrinsics.checkNotNullParameter(section, "section");
        this.f83862a = section;
        this.f83863b = i13;
        this.f83864c = i14;
        String id3 = section.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        this.f83865d = id3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return Intrinsics.d(this.f83862a, f0Var.f83862a) && this.f83863b == f0Var.f83863b && this.f83864c == f0Var.f83864c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f83864c) + ep.b.b(this.f83863b, this.f83862a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AllSavesSectionItem(section=");
        sb3.append(this.f83862a);
        sb3.append(", viewType=");
        sb3.append(this.f83863b);
        sb3.append(", position=");
        return a.a.n(sb3, this.f83864c, ")");
    }
}
