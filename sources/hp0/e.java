package hp0;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e implements h {

    /* renamed from: a, reason: collision with root package name */
    public final List f69828a;

    public e(ArrayList carouselItems) {
        Intrinsics.checkNotNullParameter(carouselItems, "carouselItems");
        this.f69828a = carouselItems;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.d(this.f69828a, ((e) obj).f69828a);
    }

    public final int hashCode() {
        return this.f69828a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("DrawerCarouselLoaded(carouselItems="), this.f69828a, ")");
    }
}
