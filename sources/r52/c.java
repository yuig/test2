package r52;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final int f106267a;

    /* renamed from: b, reason: collision with root package name */
    public final List f106268b;

    public c(int i13, ArrayList thumbnails) {
        Intrinsics.checkNotNullParameter(thumbnails, "thumbnails");
        this.f106267a = i13;
        this.f106268b = thumbnails;
    }

    @Override // r52.f
    public final List a() {
        return this.f106268b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f106267a == cVar.f106267a && Intrinsics.d(this.f106268b, cVar.f106268b);
    }

    public final int hashCode() {
        return this.f106268b.hashCode() + (Integer.hashCode(this.f106267a) * 31);
    }

    public final String toString() {
        return "LimitReached(maxPinCount=" + this.f106267a + ", thumbnails=" + this.f106268b + ")";
    }
}
