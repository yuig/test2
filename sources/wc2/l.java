package wc2;

import android.content.res.AssetManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l implements n {

    /* renamed from: a, reason: collision with root package name */
    public final AssetManager f129141a;

    public l(AssetManager assets) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        this.f129141a = assets;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Intrinsics.d(this.f129141a, ((l) obj).f129141a);
    }

    public final int hashCode() {
        return this.f129141a.hashCode();
    }

    public final String toString() {
        return "LoadJSFromAssets(assets=" + this.f129141a + ")";
    }
}
