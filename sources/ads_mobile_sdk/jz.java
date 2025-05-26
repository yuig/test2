package ads_mobile_sdk;

import a.r7;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class jz extends r7 {

    /* renamed from: a, reason: collision with root package name */
    public final String f7023a;

    /* renamed from: b, reason: collision with root package name */
    public final rz0 f7024b;

    public jz(String key, rz0 imageValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(imageValue, "imageValue");
        this.f7023a = key;
        this.f7024b = imageValue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jz)) {
            return false;
        }
        jz jzVar = (jz) obj;
        return Intrinsics.d(this.f7023a, jzVar.f7023a) && Intrinsics.d(this.f7024b, jzVar.f7024b);
    }

    public final int hashCode() {
        return this.f7024b.hashCode() + (this.f7023a.hashCode() * 31);
    }

    public final String toString() {
        return "ImageCustomAsset(key=" + this.f7023a + ", imageValue=" + this.f7024b + ")";
    }
}
