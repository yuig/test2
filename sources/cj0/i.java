package cj0;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i implements l82.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f27831a;

    /* renamed from: b, reason: collision with root package name */
    public final wa2.m f27832b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27833c;

    public i(int i13, f30 pin, wa2.m featureConfig) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(featureConfig, "featureConfig");
        this.f27831a = pin;
        this.f27832b = featureConfig;
        this.f27833c = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.f27831a, iVar.f27831a) && Intrinsics.d(this.f27832b, iVar.f27832b) && this.f27833c == iVar.f27833c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f27833c) + ((this.f27832b.hashCode() + (this.f27831a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AutomagicalBoardFeedItem(pin=");
        sb3.append(this.f27831a);
        sb3.append(", featureConfig=");
        sb3.append(this.f27832b);
        sb3.append(", position=");
        return a.a.n(sb3, this.f27833c, ")");
    }
}
