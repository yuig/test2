package oy;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c2 extends g2 {

    /* renamed from: e, reason: collision with root package name */
    public final a2 f98023e;

    /* renamed from: f, reason: collision with root package name */
    public final String f98024f;

    /* renamed from: g, reason: collision with root package name */
    public final String f98025g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(a2 endEvent) {
        super(endEvent.i());
        Intrinsics.checkNotNullParameter(endEvent, "endEvent");
        this.f98023e = endEvent;
        this.f98024f = "video_preupload";
        this.f98025g = cb.i(endEvent.i(), endEvent.g());
    }

    @Override // ey.u1
    public final String b() {
        return this.f98025g;
    }

    @Override // ey.u1
    public final String e() {
        return this.f98024f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c2) && Intrinsics.d(this.f98023e, ((c2) obj).f98023e);
    }

    public final int hashCode() {
        return this.f98023e.hashCode();
    }

    public final String toString() {
        return "VideoPreuploadEndEvent(endEvent=" + this.f98023e + ")";
    }
}
