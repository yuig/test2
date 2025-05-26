package wt1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o extends tl1.i {

    /* renamed from: b, reason: collision with root package name */
    public final List f131124b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(List inserted) {
        super(inserted.size());
        Intrinsics.checkNotNullParameter(inserted, "inserted");
        this.f131124b = inserted;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && Intrinsics.d(this.f131124b, ((o) obj).f131124b);
    }

    public final int hashCode() {
        return this.f131124b.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("Payload(inserted="), this.f131124b, ")");
    }
}
