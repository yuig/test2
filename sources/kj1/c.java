package kj1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c extends oe.f {

    /* renamed from: c, reason: collision with root package name */
    public final Integer f79849c;

    public c(Integer num) {
        this.f79849c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.d(this.f79849c, ((c) obj).f79849c);
    }

    public final int hashCode() {
        Integer num = this.f79849c;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final Integer i1() {
        return this.f79849c;
    }

    public final String toString() {
        return "LocalBitmapBadgeIndicator(defaultAsset=" + this.f79849c + ")";
    }
}
