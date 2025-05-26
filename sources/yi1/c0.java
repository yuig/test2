package yi1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c0 implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final q8.c0 f139078a;

    public c0() {
        q8.c0 perfEventTime = new q8.c0(1);
        Intrinsics.checkNotNullParameter(perfEventTime, "perfEventTime");
        this.f139078a = perfEventTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0) && Intrinsics.d(this.f139078a, ((c0) obj).f139078a);
    }

    public final int hashCode() {
        return this.f139078a.hashCode();
    }

    public final String toString() {
        return "PlaceholderDrawn(perfEventTime=" + this.f139078a + ")";
    }
}
