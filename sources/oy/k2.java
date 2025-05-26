package oy;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k2 extends n2 implements ey.b2 {

    /* renamed from: e, reason: collision with root package name */
    public final i2 f98130e;

    /* renamed from: f, reason: collision with root package name */
    public final String f98131f;

    /* renamed from: g, reason: collision with root package name */
    public final String f98132g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(i2 startEvent) {
        super(startEvent.h());
        Intrinsics.checkNotNullParameter(startEvent, "startEvent");
        this.f98130e = startEvent;
        this.f98131f = "video_early_export";
        this.f98132g = cb.i(startEvent.h(), startEvent.e());
    }

    @Override // ey.u1
    public final String b() {
        return this.f98132g;
    }

    @Override // ey.u1
    public final String e() {
        return this.f98131f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k2) && Intrinsics.d(this.f98130e, ((k2) obj).f98130e);
    }

    public final int hashCode() {
        return this.f98130e.hashCode();
    }

    public final String toString() {
        return "VideoEarlyExportStartEvent(startEvent=" + this.f98130e + ")";
    }
}
