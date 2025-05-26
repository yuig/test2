package om0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k0 implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final List f96531a;

    /* renamed from: b, reason: collision with root package name */
    public final int f96532b;

    public k0(List imageUrls) {
        Intrinsics.checkNotNullParameter(imageUrls, "imageUrls");
        this.f96531a = imageUrls;
        this.f96532b = imageUrls.size();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k0) && Intrinsics.d(this.f96531a, ((k0) obj).f96531a);
    }

    public final int hashCode() {
        return this.f96531a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("PreviewImageStackState(imageUrls="), this.f96531a, ")");
    }
}
