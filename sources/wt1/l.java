package wt1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l extends tl1.i {

    /* renamed from: b, reason: collision with root package name */
    public final List f131122b;

    /* renamed from: c, reason: collision with root package name */
    public final int f131123c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(List inserted, int i13) {
        super(inserted.size());
        Intrinsics.checkNotNullParameter(inserted, "inserted");
        this.f131122b = inserted;
        this.f131123c = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.d(this.f131122b, lVar.f131122b) && this.f131123c == lVar.f131123c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f131123c) + (this.f131122b.hashCode() * 31);
    }

    public final String toString() {
        return "Payload(inserted=" + this.f131122b + ", position=" + this.f131123c + ")";
    }
}
