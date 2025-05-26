package ea0;

import a.cb;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x implements z {

    /* renamed from: a, reason: collision with root package name */
    public final List f58005a;

    /* renamed from: b, reason: collision with root package name */
    public final String f58006b;

    /* renamed from: c, reason: collision with root package name */
    public final String f58007c;

    /* renamed from: d, reason: collision with root package name */
    public final String f58008d;

    public x(ArrayList collages, String title, String description) {
        Intrinsics.checkNotNullParameter(collages, "collages");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f58005a = collages;
        this.f58006b = title;
        this.f58007c = description;
        this.f58008d = CollectionsKt.Z(collages, null, null, null, 0, null, p.f57988l, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Intrinsics.d(this.f58005a, xVar.f58005a) && Intrinsics.d(this.f58006b, xVar.f58006b) && Intrinsics.d(this.f58007c, xVar.f58007c);
    }

    @Override // ea0.a0
    public final String getId() {
        return this.f58008d;
    }

    public final int hashCode() {
        return this.f58007c.hashCode() + cb.d(this.f58006b, this.f58005a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CollageCarousel(collages=");
        sb3.append(this.f58005a);
        sb3.append(", title=");
        sb3.append(this.f58006b);
        sb3.append(", description=");
        return a.a.p(sb3, this.f58007c, ")");
    }
}
