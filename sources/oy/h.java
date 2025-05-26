package oy;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class h extends ey.w1 implements ey.b2 {

    /* renamed from: e, reason: collision with root package name */
    public final j f98058e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j completeEvent) {
        super(2, 0);
        Intrinsics.checkNotNullParameter(completeEvent, "completeEvent");
        this.f98058e = completeEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Intrinsics.d(this.f98058e, ((h) obj).f98058e);
    }

    public final int hashCode() {
        return this.f98058e.hashCode();
    }

    public final j l() {
        return this.f98058e;
    }

    public final String toString() {
        return "StoryPinLoggingFailureEvent(completeEvent=" + this.f98058e + ")";
    }
}
