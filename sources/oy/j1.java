package oy;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j1 extends l1 implements ey.b2 {

    /* renamed from: f, reason: collision with root package name */
    public final k1 f98096f;

    /* renamed from: g, reason: collision with root package name */
    public final String f98097g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(k1 startEvent) {
        super(startEvent.a());
        Intrinsics.checkNotNullParameter(startEvent, "startEvent");
        this.f98096f = startEvent;
        this.f98097g = startEvent.b();
    }

    @Override // ey.u1
    public final String b() {
        return this.f98097g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j1) && Intrinsics.d(this.f98096f, ((j1) obj).f98096f);
    }

    public final int hashCode() {
        return this.f98096f.hashCode();
    }

    public final String toString() {
        return "PartUploadStartEvent(startEvent=" + this.f98096f + ")";
    }
}
