package oy;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j2 extends n2 {

    /* renamed from: e, reason: collision with root package name */
    public final h2 f98098e;

    /* renamed from: f, reason: collision with root package name */
    public final String f98099f;

    /* renamed from: g, reason: collision with root package name */
    public final String f98100g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(h2 endEvent) {
        super(endEvent.e());
        Intrinsics.checkNotNullParameter(endEvent, "endEvent");
        this.f98098e = endEvent;
        this.f98099f = "video_early_export";
        this.f98100g = cb.i(endEvent.e(), endEvent.d());
    }

    @Override // ey.u1
    public final String b() {
        return this.f98100g;
    }

    @Override // ey.u1
    public final String e() {
        return this.f98099f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j2) && Intrinsics.d(this.f98098e, ((j2) obj).f98098e);
    }

    public final int hashCode() {
        return this.f98098e.hashCode();
    }

    public final String toString() {
        return "VideoEarlyExportEndEvent(endEvent=" + this.f98098e + ")";
    }
}
