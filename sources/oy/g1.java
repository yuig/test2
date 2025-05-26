package oy;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g1 extends r implements ey.b2 {

    /* renamed from: f, reason: collision with root package name */
    public final String f98055f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(String mediaIds) {
        super(2, 0);
        Intrinsics.checkNotNullParameter(mediaIds, "mediaIds");
        this.f98055f = mediaIds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g1) && Intrinsics.d(this.f98055f, ((g1) obj).f98055f);
    }

    public final int hashCode() {
        return this.f98055f.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("MediaUploadStatusStartEvent(mediaIds="), this.f98055f, ")");
    }
}
