package oy;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e2 extends g2 {

    /* renamed from: e, reason: collision with root package name */
    public final a2 f98039e;

    /* renamed from: f, reason: collision with root package name */
    public final String f98040f;

    /* renamed from: g, reason: collision with root package name */
    public final String f98041g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(a2 endEvent) {
        super(endEvent.i());
        Intrinsics.checkNotNullParameter(endEvent, "endEvent");
        this.f98039e = endEvent;
        this.f98040f = "video_upload";
        this.f98041g = cb.i(endEvent.i(), endEvent.g());
    }

    @Override // ey.u1
    public final String b() {
        return this.f98041g;
    }

    @Override // ey.u1
    public final String e() {
        return this.f98040f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e2) && Intrinsics.d(this.f98039e, ((e2) obj).f98039e);
    }

    public final int hashCode() {
        return this.f98039e.hashCode();
    }

    public final String toString() {
        return "VideoUploadEndEvent(endEvent=" + this.f98039e + ")";
    }
}
