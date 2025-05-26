package yi1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class l implements wi1.b {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f139111a;

    /* renamed from: b, reason: collision with root package name */
    public final d f139112b;

    public l(h0 stateTransformerImageDrawableDS, d action) {
        Intrinsics.checkNotNullParameter(stateTransformerImageDrawableDS, "stateTransformerImageDrawableDS");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f139111a = stateTransformerImageDrawableDS;
        this.f139112b = action;
    }

    public static l e(l lVar, d action) {
        h0 stateTransformerImageDrawableDS = lVar.f139111a;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(stateTransformerImageDrawableDS, "stateTransformerImageDrawableDS");
        Intrinsics.checkNotNullParameter(action, "action");
        return new l(stateTransformerImageDrawableDS, action);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.d(this.f139111a, lVar.f139111a) && Intrinsics.d(this.f139112b, lVar.f139112b);
    }

    public final int hashCode() {
        return this.f139112b.hashCode() + (this.f139111a.hashCode() * 31);
    }

    public final String toString() {
        return "PinImageDisplayState(stateTransformerImageDrawableDS=" + this.f139111a + ", action=" + this.f139112b + ")";
    }
}
