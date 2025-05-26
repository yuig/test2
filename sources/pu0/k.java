package pu0;

import android.graphics.PointF;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final String f101396a;

    /* renamed from: b, reason: collision with root package name */
    public final PointF f101397b;

    /* renamed from: c, reason: collision with root package name */
    public final a f101398c;

    /* renamed from: d, reason: collision with root package name */
    public final b f101399d;

    public k(String overlayId, PointF pointF, a enter, b exit) {
        Intrinsics.checkNotNullParameter(overlayId, "overlayId");
        Intrinsics.checkNotNullParameter(enter, "enter");
        Intrinsics.checkNotNullParameter(exit, "exit");
        this.f101396a = overlayId;
        this.f101397b = pointF;
        this.f101398c = enter;
        this.f101399d = exit;
    }

    public static k a(k kVar, a enter, b exit, int i13) {
        String overlayId = kVar.f101396a;
        PointF pointF = kVar.f101397b;
        if ((i13 & 4) != 0) {
            enter = kVar.f101398c;
        }
        if ((i13 & 8) != 0) {
            exit = kVar.f101399d;
        }
        kVar.getClass();
        Intrinsics.checkNotNullParameter(overlayId, "overlayId");
        Intrinsics.checkNotNullParameter(enter, "enter");
        Intrinsics.checkNotNullParameter(exit, "exit");
        return new k(overlayId, pointF, enter, exit);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.d(this.f101396a, kVar.f101396a) && Intrinsics.d(this.f101397b, kVar.f101397b) && this.f101398c == kVar.f101398c && this.f101399d == kVar.f101399d;
    }

    public final int hashCode() {
        int hashCode = this.f101396a.hashCode() * 31;
        PointF pointF = this.f101397b;
        return this.f101399d.hashCode() + ((this.f101398c.hashCode() + ((hashCode + (pointF == null ? 0 : pointF.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "OverlayTransitionConfig(overlayId=" + this.f101396a + ", centerPoint=" + this.f101397b + ", enter=" + this.f101398c + ", exit=" + this.f101399d + ")";
    }

    public /* synthetic */ k(String str) {
        this(str, null, a.Instant, b.Instant);
    }
}
