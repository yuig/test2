package wc2;

import android.content.res.AssetManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g implements j {

    /* renamed from: a, reason: collision with root package name */
    public final AssetManager f129136a;

    public g(AssetManager assets) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        this.f129136a = assets;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.d(this.f129136a, ((g) obj).f129136a);
    }

    public final int hashCode() {
        return this.f129136a.hashCode();
    }

    public final String toString() {
        return "AttachedToWindow(assets=" + this.f129136a + ")";
    }
}
