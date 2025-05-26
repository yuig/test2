package wt1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class x extends tl1.i {

    /* renamed from: b, reason: collision with root package name */
    public final List f131130b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(List inserted) {
        super(inserted.size());
        Intrinsics.checkNotNullParameter(inserted, "inserted");
        this.f131130b = inserted;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && Intrinsics.d(this.f131130b, ((x) obj).f131130b);
    }

    public final int hashCode() {
        return this.f131130b.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("Payload(inserted="), this.f131130b, ")");
    }
}
