package oy;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m2 extends n2 implements ey.b2 {

    /* renamed from: e, reason: collision with root package name */
    public final i2 f98143e;

    /* renamed from: f, reason: collision with root package name */
    public final String f98144f;

    /* renamed from: g, reason: collision with root package name */
    public final String f98145g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(i2 startEvent) {
        super(startEvent.h());
        Intrinsics.checkNotNullParameter(startEvent, "startEvent");
        this.f98143e = startEvent;
        this.f98144f = "video_export";
        this.f98145g = cb.i(startEvent.h(), startEvent.e());
    }

    @Override // ey.u1
    public final String b() {
        return this.f98145g;
    }

    @Override // ey.u1
    public final String e() {
        return this.f98144f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m2) && Intrinsics.d(this.f98143e, ((m2) obj).f98143e);
    }

    public final int hashCode() {
        return this.f98143e.hashCode();
    }

    public final String toString() {
        return "VideoExportStartEvent(startEvent=" + this.f98143e + ")";
    }
}
