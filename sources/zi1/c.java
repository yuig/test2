package zi1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c implements wi1.b {

    /* renamed from: a, reason: collision with root package name */
    public final int f142004a;

    /* renamed from: b, reason: collision with root package name */
    public final e f142005b;

    /* renamed from: c, reason: collision with root package name */
    public final cs.c f142006c;

    /* renamed from: d, reason: collision with root package name */
    public final float f142007d;

    public c(int i13, e pinChipsDrawableDisplayState, cs.c collectionDpaLayoutType, float f13) {
        Intrinsics.checkNotNullParameter(pinChipsDrawableDisplayState, "pinChipsDrawableDisplayState");
        Intrinsics.checkNotNullParameter(collectionDpaLayoutType, "collectionDpaLayoutType");
        this.f142004a = i13;
        this.f142005b = pinChipsDrawableDisplayState;
        this.f142006c = collectionDpaLayoutType;
        this.f142007d = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f142004a == cVar.f142004a && Intrinsics.d(this.f142005b, cVar.f142005b) && this.f142006c == cVar.f142006c && Float.compare(this.f142007d, cVar.f142007d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f142007d) + ((this.f142006c.hashCode() + ((this.f142005b.hashCode() + (Integer.hashCode(this.f142004a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PinChipsDisplayState(chipsSpace=" + this.f142004a + ", pinChipsDrawableDisplayState=" + this.f142005b + ", collectionDpaLayoutType=" + this.f142006c + ", chipAspectRatio=" + this.f142007d + ")";
    }
}
