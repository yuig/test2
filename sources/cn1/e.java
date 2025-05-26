package cn1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f28187a;

    /* renamed from: b, reason: collision with root package name */
    public final u50.i0 f28188b;

    public e(int i13, u50.i0 contentDescription) {
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        this.f28187a = i13;
        this.f28188b = contentDescription;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f28187a == eVar.f28187a && Intrinsics.d(this.f28188b, eVar.f28188b);
    }

    public final int hashCode() {
        return this.f28188b.hashCode() + (Integer.hashCode(this.f28187a) * 31);
    }

    public final String toString() {
        return "FieldTrailingAnimatedIconDisplayState(rawResAnimation=" + this.f28187a + ", contentDescription=" + this.f28188b + ")";
    }

    public /* synthetic */ e() {
        this(h0.lottie_audio_animation_loop_3_sec, u50.h0.f120562a);
    }
}
