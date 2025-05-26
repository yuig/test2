package ads_mobile_sdk;

import a.r7;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class kz extends r7 {

    /* renamed from: a, reason: collision with root package name */
    public final String f7565a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7566b;

    public kz(String key, String stringValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(stringValue, "stringValue");
        this.f7565a = key;
        this.f7566b = stringValue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kz)) {
            return false;
        }
        kz kzVar = (kz) obj;
        return Intrinsics.d(this.f7565a, kzVar.f7565a) && Intrinsics.d(this.f7566b, kzVar.f7566b);
    }

    public final int hashCode() {
        return this.f7566b.hashCode() + (this.f7565a.hashCode() * 31);
    }

    public final String toString() {
        return a.a.m("StringCustomAsset(key=", this.f7565a, ", stringValue=", this.f7566b, ")");
    }
}
