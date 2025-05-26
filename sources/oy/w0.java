package oy;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w0 extends y0 implements ey.b2 {

    /* renamed from: e, reason: collision with root package name */
    public final x0 f98226e;

    /* renamed from: f, reason: collision with root package name */
    public final String f98227f;

    /* renamed from: g, reason: collision with root package name */
    public final String f98228g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(x0 startEvent) {
        super(startEvent.k());
        Intrinsics.checkNotNullParameter(startEvent, "startEvent");
        this.f98226e = startEvent;
        this.f98227f = "image_upload";
        this.f98228g = cb.i(startEvent.k(), startEvent.j());
    }

    @Override // ey.u1
    public final String b() {
        return this.f98228g;
    }

    @Override // ey.u1
    public final String e() {
        return this.f98227f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w0) && Intrinsics.d(this.f98226e, ((w0) obj).f98226e);
    }

    public final int hashCode() {
        return this.f98226e.hashCode();
    }

    public final String toString() {
        return "ImageUploadStartEvent(startEvent=" + this.f98226e + ")";
    }
}
