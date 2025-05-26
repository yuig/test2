package oy;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i1 extends l1 {

    /* renamed from: f, reason: collision with root package name */
    public final h1 f98077f;

    /* renamed from: g, reason: collision with root package name */
    public final String f98078g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(h1 endEvent) {
        super(endEvent.b());
        Intrinsics.checkNotNullParameter(endEvent, "endEvent");
        this.f98077f = endEvent;
        this.f98078g = endEvent.c();
    }

    @Override // ey.u1
    public final String b() {
        return this.f98078g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i1) && Intrinsics.d(this.f98077f, ((i1) obj).f98077f);
    }

    public final int hashCode() {
        return this.f98077f.hashCode();
    }

    public final String toString() {
        return "PartUploadEndEvent(endEvent=" + this.f98077f + ")";
    }
}
