package sq;

import i01.i0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final nq.b f114970a;

    /* renamed from: b, reason: collision with root package name */
    public final String f114971b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f114972c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f114973d;

    public g(nq.b bVar, String str, i0 imageModuleDimensionProvider) {
        Intrinsics.checkNotNullParameter(imageModuleDimensionProvider, "imageModuleDimensionProvider");
        this.f114970a = bVar;
        this.f114971b = str;
        this.f114972c = imageModuleDimensionProvider;
        this.f114973d = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f114970a == gVar.f114970a && Intrinsics.d(this.f114971b, gVar.f114971b) && Intrinsics.d(this.f114972c, gVar.f114972c) && this.f114973d == gVar.f114973d;
    }

    public final int hashCode() {
        nq.b bVar = this.f114970a;
        int hashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        String str = this.f114971b;
        return Boolean.hashCode(this.f114973d) + ((this.f114972c.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "CloseupImpressionLoggingParams(closeupNavigationType=" + this.f114970a + ", trackingParams=" + this.f114971b + ", imageModuleDimensionProvider=" + this.f114972c + ", isBtrObserved=" + this.f114973d + ")";
    }
}
