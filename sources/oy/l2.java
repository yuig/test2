package oy;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l2 extends n2 {

    /* renamed from: e, reason: collision with root package name */
    public final h2 f98139e;

    /* renamed from: f, reason: collision with root package name */
    public final String f98140f;

    /* renamed from: g, reason: collision with root package name */
    public final String f98141g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(h2 endEvent) {
        super(endEvent.e());
        Intrinsics.checkNotNullParameter(endEvent, "endEvent");
        this.f98139e = endEvent;
        this.f98140f = "video_export";
        this.f98141g = cb.i(endEvent.e(), endEvent.d());
    }

    @Override // ey.u1
    public final String b() {
        return this.f98141g;
    }

    @Override // ey.u1
    public final String e() {
        return this.f98140f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l2) && Intrinsics.d(this.f98139e, ((l2) obj).f98139e);
    }

    public final int hashCode() {
        return this.f98139e.hashCode();
    }

    public final String toString() {
        return "VideoExportEndEvent(endEvent=" + this.f98139e + ")";
    }
}
