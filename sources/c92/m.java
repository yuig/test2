package c92;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m extends n {

    /* renamed from: b, reason: collision with root package name */
    public final int f27016b;

    /* renamed from: c, reason: collision with root package name */
    public final List f27017c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(int i13, List sections) {
        super(true);
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f27016b = i13;
        this.f27017c = sections;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f27016b == mVar.f27016b && Intrinsics.d(this.f27017c, mVar.f27017c);
    }

    public final int hashCode() {
        return this.f27017c.hashCode() + (Integer.hashCode(this.f27016b) * 31);
    }

    public final String toString() {
        return "Variant2(layoutId=" + this.f27016b + ", sections=" + this.f27017c + ")";
    }
}
