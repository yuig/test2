package yi1;

import com.pinterest.api.model.or;
import kotlin.jvm.internal.Intrinsics;
import qa2.c1;

/* loaded from: classes2.dex */
public final class m0 implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final int f139113a;

    /* renamed from: b, reason: collision with root package name */
    public final int f139114b;

    /* renamed from: c, reason: collision with root package name */
    public final int f139115c;

    /* renamed from: d, reason: collision with root package name */
    public final c1 f139116d;

    /* renamed from: e, reason: collision with root package name */
    public final k f139117e;

    /* renamed from: f, reason: collision with root package name */
    public final or f139118f;

    public m0(int i13, int i14, int i15, c1 resizeType, k pinHeightType, or orVar) {
        Intrinsics.checkNotNullParameter(resizeType, "resizeType");
        Intrinsics.checkNotNullParameter(pinHeightType, "pinHeightType");
        this.f139113a = i13;
        this.f139114b = i14;
        this.f139115c = i15;
        this.f139116d = resizeType;
        this.f139117e = pinHeightType;
        this.f139118f = orVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return this.f139113a == m0Var.f139113a && this.f139114b == m0Var.f139114b && this.f139115c == m0Var.f139115c && this.f139116d == m0Var.f139116d && Intrinsics.d(this.f139117e, m0Var.f139117e) && Intrinsics.d(this.f139118f, m0Var.f139118f);
    }

    public final int hashCode() {
        int hashCode = (this.f139117e.hashCode() + ((this.f139116d.hashCode() + ep.b.b(this.f139115c, ep.b.b(this.f139114b, Integer.hashCode(this.f139113a) * 31, 31), 31)) * 31)) * 31;
        or orVar = this.f139118f;
        return hashCode + (orVar == null ? 0 : orVar.hashCode());
    }

    public final String toString() {
        return "ViewOnlyImageDS(pinSpecImageWidth=" + this.f139113a + ", pinSpecImageHeight=" + this.f139114b + ", modifiedPinSpecImageHeight=" + this.f139115c + ", resizeType=" + this.f139116d + ", pinHeightType=" + this.f139117e + ", finalCropToApply=" + this.f139118f + ")";
    }
}
