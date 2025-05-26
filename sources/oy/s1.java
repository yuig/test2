package oy;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s1 extends t1 implements ey.b2 {

    /* renamed from: e, reason: collision with root package name */
    public final q1 f98196e;

    /* renamed from: f, reason: collision with root package name */
    public final String f98197f;

    /* renamed from: g, reason: collision with root package name */
    public final String f98198g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(q1 startEvent) {
        super(startEvent.c());
        Intrinsics.checkNotNullParameter(startEvent, "startEvent");
        this.f98196e = startEvent;
        this.f98197f = "video_upload_register";
        this.f98198g = cb.i(startEvent.c(), startEvent.b());
    }

    @Override // ey.u1
    public final String b() {
        return this.f98198g;
    }

    @Override // ey.u1
    public final String e() {
        return this.f98197f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s1) && Intrinsics.d(this.f98196e, ((s1) obj).f98196e);
    }

    public final int hashCode() {
        return this.f98196e.hashCode();
    }

    public final String toString() {
        return "UploadRegisterStartEvent(startEvent=" + this.f98196e + ")";
    }
}
