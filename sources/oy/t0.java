package oy;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t0 extends y0 {

    /* renamed from: e, reason: collision with root package name */
    public final s0 f98199e;

    /* renamed from: f, reason: collision with root package name */
    public final String f98200f;

    /* renamed from: g, reason: collision with root package name */
    public final String f98201g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(s0 endEvent) {
        super(endEvent.h());
        Intrinsics.checkNotNullParameter(endEvent, "endEvent");
        this.f98199e = endEvent;
        this.f98200f = "image_preupload";
        this.f98201g = cb.i(endEvent.h(), endEvent.f());
    }

    @Override // ey.u1
    public final String b() {
        return this.f98201g;
    }

    @Override // ey.u1
    public final String e() {
        return this.f98200f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t0) && Intrinsics.d(this.f98199e, ((t0) obj).f98199e);
    }

    public final int hashCode() {
        return this.f98199e.hashCode();
    }

    public final String toString() {
        return "ImagePreuploadEndEvent(endEvent=" + this.f98199e + ")";
    }
}
