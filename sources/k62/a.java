package k62;

import kotlin.jvm.internal.Intrinsics;
import r72.j0;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f78418a;

    /* renamed from: b, reason: collision with root package name */
    public final b f78419b;

    public a(j0 effect, b metadata) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.f78418a = effect;
        this.f78419b = metadata;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f78418a, aVar.f78418a) && Intrinsics.d(this.f78419b, aVar.f78419b);
    }

    public final int hashCode() {
        return this.f78419b.hashCode() + (this.f78418a.hashCode() * 31);
    }

    public final String toString() {
        return "EffectInfo(effect=" + this.f78418a + ", metadata=" + this.f78419b + ")";
    }
}
