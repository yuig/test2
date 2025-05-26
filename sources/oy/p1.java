package oy;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p1 extends t1 implements ey.b2 {

    /* renamed from: e, reason: collision with root package name */
    public final q1 f98167e;

    /* renamed from: f, reason: collision with root package name */
    public final String f98168f;

    /* renamed from: g, reason: collision with root package name */
    public final String f98169g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(q1 startEvent) {
        super(startEvent.c());
        Intrinsics.checkNotNullParameter(startEvent, "startEvent");
        this.f98167e = startEvent;
        this.f98168f = "video_preupload_register";
        this.f98169g = cb.i(startEvent.c(), startEvent.b());
    }

    @Override // ey.u1
    public final String b() {
        return this.f98169g;
    }

    @Override // ey.u1
    public final String e() {
        return this.f98168f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p1) && Intrinsics.d(this.f98167e, ((p1) obj).f98167e);
    }

    public final int hashCode() {
        return this.f98167e.hashCode();
    }

    public final String toString() {
        return "PreuploadRegisterStartEvent(startEvent=" + this.f98167e + ")";
    }
}
