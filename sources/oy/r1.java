package oy;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r1 extends t1 {

    /* renamed from: e, reason: collision with root package name */
    public final n1 f98178e;

    /* renamed from: f, reason: collision with root package name */
    public final String f98179f;

    /* renamed from: g, reason: collision with root package name */
    public final String f98180g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(n1 endEvent) {
        super(endEvent.e());
        Intrinsics.checkNotNullParameter(endEvent, "endEvent");
        this.f98178e = endEvent;
        this.f98179f = "video_upload_register";
        this.f98180g = cb.i(endEvent.e(), endEvent.d());
    }

    @Override // ey.u1
    public final String b() {
        return this.f98180g;
    }

    @Override // ey.u1
    public final String e() {
        return this.f98179f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r1) && Intrinsics.d(this.f98178e, ((r1) obj).f98178e);
    }

    public final int hashCode() {
        return this.f98178e.hashCode();
    }

    public final String toString() {
        return "UploadRegisterEndEvent(endEvent=" + this.f98178e + ")";
    }
}
