package oy;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v0 extends y0 {

    /* renamed from: e, reason: collision with root package name */
    public final s0 f98218e;

    /* renamed from: f, reason: collision with root package name */
    public final String f98219f;

    /* renamed from: g, reason: collision with root package name */
    public final String f98220g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(s0 endEvent) {
        super(endEvent.h());
        Intrinsics.checkNotNullParameter(endEvent, "endEvent");
        this.f98218e = endEvent;
        this.f98219f = "image_upload";
        this.f98220g = cb.i(endEvent.h(), endEvent.f());
    }

    @Override // ey.u1
    public final String b() {
        return this.f98220g;
    }

    @Override // ey.u1
    public final String e() {
        return this.f98219f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v0) && Intrinsics.d(this.f98218e, ((v0) obj).f98218e);
    }

    public final int hashCode() {
        return this.f98218e.hashCode();
    }

    public final String toString() {
        return "ImageUploadEndEvent(endEvent=" + this.f98218e + ")";
    }
}
