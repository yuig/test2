package androidx.compose.foundation.layout;

import a.cb;
import kotlin.Metadata;
import p1.m;
import s3.e1;
import u2.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/AspectRatioElement;", "Ls3/e1;", "Lp1/m;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class AspectRatioElement extends e1 {

    /* renamed from: b, reason: collision with root package name */
    public final float f17145b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f17146c;

    public AspectRatioElement(float f13, boolean z13) {
        this.f17145b = f13;
        this.f17146c = z13;
        if (f13 <= 0.0f) {
            throw new IllegalArgumentException(cb.h("aspectRatio ", f13, " must be > 0").toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        AspectRatioElement aspectRatioElement = obj instanceof AspectRatioElement ? (AspectRatioElement) obj : null;
        if (aspectRatioElement == null) {
            return false;
        }
        if (this.f17145b == aspectRatioElement.f17145b) {
            if (this.f17146c == ((AspectRatioElement) obj).f17146c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17146c) + (Float.hashCode(this.f17145b) * 31);
    }

    @Override // s3.e1
    public final p l() {
        m mVar = new m();
        mVar.f98553n = this.f17145b;
        mVar.f98554o = this.f17146c;
        return mVar;
    }

    @Override // s3.e1
    public final void m(p pVar) {
        m mVar = (m) pVar;
        mVar.f98553n = this.f17145b;
        mVar.f98554o = this.f17146c;
    }
}
