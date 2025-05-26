package oy;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f2 extends g2 implements ey.b2 {

    /* renamed from: e, reason: collision with root package name */
    public final b2 f98051e;

    /* renamed from: f, reason: collision with root package name */
    public final String f98052f;

    /* renamed from: g, reason: collision with root package name */
    public final String f98053g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(b2 startEvent) {
        super(startEvent.g());
        Intrinsics.checkNotNullParameter(startEvent, "startEvent");
        this.f98051e = startEvent;
        this.f98052f = "video_upload";
        this.f98053g = cb.i(startEvent.g(), startEvent.f());
    }

    @Override // ey.u1
    public final String b() {
        return this.f98053g;
    }

    @Override // ey.u1
    public final String e() {
        return this.f98052f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f2) && Intrinsics.d(this.f98051e, ((f2) obj).f98051e);
    }

    public final int hashCode() {
        return this.f98051e.hashCode();
    }

    public final String toString() {
        return "VideoUploadStartEvent(startEvent=" + this.f98051e + ")";
    }
}
