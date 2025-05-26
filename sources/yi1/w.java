package yi1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class w implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final q8.c0 f139163a;

    public w() {
        q8.c0 perfEventTime = new q8.c0(1);
        Intrinsics.checkNotNullParameter(perfEventTime, "perfEventTime");
        this.f139163a = perfEventTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && Intrinsics.d(this.f139163a, ((w) obj).f139163a);
    }

    public final int hashCode() {
        return this.f139163a.hashCode();
    }

    public final String toString() {
        return "OnBitmapLoadFailed(perfEventTime=" + this.f139163a + ")";
    }
}
