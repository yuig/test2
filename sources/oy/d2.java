package oy;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d2 extends g2 implements ey.b2 {

    /* renamed from: e, reason: collision with root package name */
    public final b2 f98028e;

    /* renamed from: f, reason: collision with root package name */
    public final String f98029f;

    /* renamed from: g, reason: collision with root package name */
    public final String f98030g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(b2 startEvent) {
        super(startEvent.g());
        Intrinsics.checkNotNullParameter(startEvent, "startEvent");
        this.f98028e = startEvent;
        this.f98029f = "video_preupload";
        this.f98030g = cb.i(startEvent.g(), startEvent.f());
    }

    @Override // ey.u1
    public final String b() {
        return this.f98030g;
    }

    @Override // ey.u1
    public final String e() {
        return this.f98029f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d2) && Intrinsics.d(this.f98028e, ((d2) obj).f98028e);
    }

    public final int hashCode() {
        return this.f98028e.hashCode();
    }

    public final String toString() {
        return "VideoPreuploadStartEvent(startEvent=" + this.f98028e + ")";
    }
}
