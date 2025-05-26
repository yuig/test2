package pu0;

import android.graphics.Bitmap;
import com.pinterest.api.model.qq;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q extends r {

    /* renamed from: f, reason: collision with root package name */
    public final boolean f101410f;

    /* renamed from: g, reason: collision with root package name */
    public final Function1 f101411g;

    /* renamed from: h, reason: collision with root package name */
    public final qq f101412h;

    /* renamed from: i, reason: collision with root package name */
    public final Bitmap f101413i;

    /* renamed from: j, reason: collision with root package name */
    public final Bitmap f101414j;

    /* renamed from: k, reason: collision with root package name */
    public final b f101415k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(boolean z13, Function1 action, qq qqVar, Bitmap bitmap, Bitmap overlayImage, b transition) {
        super(transition.getLabel(), transition.getIcon(), transition.getSpec().getDefaultAnimator(), transition.getSpec().getProperties(), action);
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(overlayImage, "overlayImage");
        Intrinsics.checkNotNullParameter(transition, "transition");
        this.f101410f = z13;
        this.f101411g = action;
        this.f101412h = qqVar;
        this.f101413i = bitmap;
        this.f101414j = overlayImage;
        this.f101415k = transition;
    }

    public static q f(q qVar, boolean z13) {
        Function1 action = qVar.f101411g;
        Intrinsics.checkNotNullParameter(action, "action");
        Bitmap overlayImage = qVar.f101414j;
        Intrinsics.checkNotNullParameter(overlayImage, "overlayImage");
        b transition = qVar.f101415k;
        Intrinsics.checkNotNullParameter(transition, "transition");
        return new q(z13, action, qVar.f101412h, qVar.f101413i, overlayImage, transition);
    }

    @Override // pu0.r
    public final Function1 a() {
        return this.f101411g;
    }

    @Override // pu0.r
    public final Bitmap b() {
        return this.f101413i;
    }

    @Override // pu0.r
    public final qq c() {
        return this.f101412h;
    }

    @Override // pu0.r
    public final Bitmap d() {
        return this.f101414j;
    }

    @Override // pu0.r
    public final boolean e() {
        return this.f101410f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f101410f == qVar.f101410f && Intrinsics.d(this.f101411g, qVar.f101411g) && Intrinsics.d(this.f101412h, qVar.f101412h) && Intrinsics.d(this.f101413i, qVar.f101413i) && Intrinsics.d(this.f101414j, qVar.f101414j) && this.f101415k == qVar.f101415k;
    }

    public final int hashCode() {
        int c13 = d7.g.c(this.f101411g, Boolean.hashCode(this.f101410f) * 31, 31);
        qq qqVar = this.f101412h;
        int hashCode = (c13 + (qqVar == null ? 0 : qqVar.hashCode())) * 31;
        Bitmap bitmap = this.f101413i;
        return this.f101415k.hashCode() + ((this.f101414j.hashCode() + ((hashCode + (bitmap != null ? bitmap.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "ExitItem(selected=" + this.f101410f + ", action=" + this.f101411g + ", block=" + this.f101412h + ", backgroundImage=" + this.f101413i + ", overlayImage=" + this.f101414j + ", transition=" + this.f101415k + ")";
    }
}
