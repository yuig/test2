package oy;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class u0 extends y0 implements ey.b2 {

    /* renamed from: e, reason: collision with root package name */
    public final x0 f98205e;

    /* renamed from: f, reason: collision with root package name */
    public final String f98206f;

    /* renamed from: g, reason: collision with root package name */
    public final String f98207g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(x0 startEvent) {
        super(startEvent.k());
        Intrinsics.checkNotNullParameter(startEvent, "startEvent");
        this.f98205e = startEvent;
        this.f98206f = "image_preupload";
        this.f98207g = cb.i(startEvent.k(), startEvent.j());
    }

    @Override // ey.u1
    public final String b() {
        return this.f98207g;
    }

    @Override // ey.u1
    public final String e() {
        return this.f98206f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u0) && Intrinsics.d(this.f98205e, ((u0) obj).f98205e);
    }

    public final int hashCode() {
        return this.f98205e.hashCode();
    }

    public final String toString() {
        return "ImagePreuploadStartEvent(startEvent=" + this.f98205e + ")";
    }
}
