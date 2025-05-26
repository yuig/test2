package qa2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final wa2.m f103256a;

    public e(wa2.m pinFeatureConfig) {
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        this.f103256a = pinFeatureConfig;
    }

    public final n a() {
        return new n(new b20.c(this.f103256a.e(), 0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.d(this.f103256a, ((e) obj).f103256a);
    }

    public final int hashCode() {
        return this.f103256a.hashCode();
    }

    public final String toString() {
        return "GridFeatureConfig(pinFeatureConfig=" + this.f103256a + ")";
    }
}
