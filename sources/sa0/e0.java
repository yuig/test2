package sa0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e0 implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f112164a;

    /* renamed from: b, reason: collision with root package name */
    public final r72.a f112165b;

    public e0(String pinId, r72.a bitmapMask) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(bitmapMask, "bitmapMask");
        this.f112164a = pinId;
        this.f112165b = bitmapMask;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return Intrinsics.d(this.f112164a, e0Var.f112164a) && Intrinsics.d(this.f112165b, e0Var.f112165b);
    }

    public final int hashCode() {
        return this.f112165b.hashCode() + (this.f112164a.hashCode() * 31);
    }

    public final String toString() {
        return "RepinPrepCutout(pinId=" + this.f112164a + ", bitmapMask=" + this.f112165b + ")";
    }
}
