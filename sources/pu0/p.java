package pu0;

import android.graphics.Bitmap;
import com.pinterest.api.model.qq;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p extends r {

    /* renamed from: f, reason: collision with root package name */
    public final boolean f101404f;

    /* renamed from: g, reason: collision with root package name */
    public final Function1 f101405g;

    /* renamed from: h, reason: collision with root package name */
    public final qq f101406h;

    /* renamed from: i, reason: collision with root package name */
    public final Bitmap f101407i;

    /* renamed from: j, reason: collision with root package name */
    public final Bitmap f101408j;

    /* renamed from: k, reason: collision with root package name */
    public final a f101409k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(boolean z13, Function1 action, qq qqVar, Bitmap bitmap, Bitmap overlayImage, a transition) {
        super(transition.getLabel(), transition.getIcon(), transition.getSpec().getDefaultAnimator(), transition.getSpec().getProperties(), action);
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(overlayImage, "overlayImage");
        Intrinsics.checkNotNullParameter(transition, "transition");
        this.f101404f = z13;
        this.f101405g = action;
        this.f101406h = qqVar;
        this.f101407i = bitmap;
        this.f101408j = overlayImage;
        this.f101409k = transition;
    }

    public static p f(p pVar, boolean z13) {
        Function1 action = pVar.f101405g;
        Intrinsics.checkNotNullParameter(action, "action");
        Bitmap overlayImage = pVar.f101408j;
        Intrinsics.checkNotNullParameter(overlayImage, "overlayImage");
        a transition = pVar.f101409k;
        Intrinsics.checkNotNullParameter(transition, "transition");
        return new p(z13, action, pVar.f101406h, pVar.f101407i, overlayImage, transition);
    }

    @Override // pu0.r
    public final Function1 a() {
        return this.f101405g;
    }

    @Override // pu0.r
    public final Bitmap b() {
        return this.f101407i;
    }

    @Override // pu0.r
    public final qq c() {
        return this.f101406h;
    }

    @Override // pu0.r
    public final Bitmap d() {
        return this.f101408j;
    }

    @Override // pu0.r
    public final boolean e() {
        return this.f101404f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f101404f == pVar.f101404f && Intrinsics.d(this.f101405g, pVar.f101405g) && Intrinsics.d(this.f101406h, pVar.f101406h) && Intrinsics.d(this.f101407i, pVar.f101407i) && Intrinsics.d(this.f101408j, pVar.f101408j) && this.f101409k == pVar.f101409k;
    }

    public final int hashCode() {
        int c13 = d7.g.c(this.f101405g, Boolean.hashCode(this.f101404f) * 31, 31);
        qq qqVar = this.f101406h;
        int hashCode = (c13 + (qqVar == null ? 0 : qqVar.hashCode())) * 31;
        Bitmap bitmap = this.f101407i;
        return this.f101409k.hashCode() + ((this.f101408j.hashCode() + ((hashCode + (bitmap != null ? bitmap.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "EnterItem(selected=" + this.f101404f + ", action=" + this.f101405g + ", block=" + this.f101406h + ", backgroundImage=" + this.f101407i + ", overlayImage=" + this.f101408j + ", transition=" + this.f101409k + ")";
    }
}
