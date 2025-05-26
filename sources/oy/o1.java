package oy;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o1 extends t1 {

    /* renamed from: e, reason: collision with root package name */
    public final n1 f98159e;

    /* renamed from: f, reason: collision with root package name */
    public final String f98160f;

    /* renamed from: g, reason: collision with root package name */
    public final String f98161g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(n1 endEvent) {
        super(endEvent.e());
        Intrinsics.checkNotNullParameter(endEvent, "endEvent");
        this.f98159e = endEvent;
        this.f98160f = "video_preupload_register";
        this.f98161g = cb.i(endEvent.e(), endEvent.d());
    }

    @Override // ey.u1
    public final String b() {
        return this.f98161g;
    }

    @Override // ey.u1
    public final String e() {
        return this.f98160f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o1) && Intrinsics.d(this.f98159e, ((o1) obj).f98159e);
    }

    public final int hashCode() {
        return this.f98159e.hashCode();
    }

    public final String toString() {
        return "PreuploadRegisterEndEvent(endEvent=" + this.f98159e + ")";
    }
}
