package h80;

import a.cb;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import zy.l0;

/* loaded from: classes5.dex */
public final class r implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f68115a;

    /* renamed from: b, reason: collision with root package name */
    public final String f68116b;

    /* renamed from: c, reason: collision with root package name */
    public final String f68117c;

    /* renamed from: d, reason: collision with root package name */
    public final l0 f68118d;

    public r(String pinId, String imageSignature, l0 pinalyticsVMState) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(imageSignature, "imageSignature");
        Intrinsics.checkNotNullParameter("", "generatedImageUrl");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        this.f68115a = pinId;
        this.f68116b = imageSignature;
        this.f68117c = "";
        this.f68118d = pinalyticsVMState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Intrinsics.d(this.f68115a, rVar.f68115a) && Intrinsics.d(this.f68116b, rVar.f68116b) && Intrinsics.d(this.f68117c, rVar.f68117c) && Intrinsics.d(this.f68118d, rVar.f68118d);
    }

    public final int hashCode() {
        return this.f68118d.hashCode() + cb.d(this.f68117c, cb.d(this.f68116b, this.f68115a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "ImageVisualizationVMState(pinId=" + this.f68115a + ", imageSignature=" + this.f68116b + ", generatedImageUrl=" + this.f68117c + ", pinalyticsVMState=" + this.f68118d + ")";
    }
}
