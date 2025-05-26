package sf1;

import android.widget.ImageView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f112720a;

    /* renamed from: b, reason: collision with root package name */
    public final int f112721b;

    /* renamed from: c, reason: collision with root package name */
    public final xe0.a f112722c;

    /* renamed from: d, reason: collision with root package name */
    public final x1 f112723d;

    /* renamed from: e, reason: collision with root package name */
    public final Function1 f112724e;

    /* renamed from: f, reason: collision with root package name */
    public final ImageView.ScaleType f112725f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f112726g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f112727h;

    /* renamed from: i, reason: collision with root package name */
    public final int f112728i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f112729j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f112730k;

    public s0(int i13, int i14, xe0.a cornerRadii, x1 videoViewModel, Function1 backgroundProvider, ImageView.ScaleType imageScaleType, boolean z13, boolean z14, int i15, boolean z15, boolean z16) {
        Intrinsics.checkNotNullParameter(cornerRadii, "cornerRadii");
        Intrinsics.checkNotNullParameter(videoViewModel, "videoViewModel");
        Intrinsics.checkNotNullParameter(backgroundProvider, "backgroundProvider");
        Intrinsics.checkNotNullParameter(imageScaleType, "imageScaleType");
        this.f112720a = i13;
        this.f112721b = i14;
        this.f112722c = cornerRadii;
        this.f112723d = videoViewModel;
        this.f112724e = backgroundProvider;
        this.f112725f = imageScaleType;
        this.f112726g = z13;
        this.f112727h = z14;
        this.f112728i = i15;
        this.f112729j = z15;
        this.f112730k = z16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return this.f112720a == s0Var.f112720a && this.f112721b == s0Var.f112721b && Intrinsics.d(this.f112722c, s0Var.f112722c) && Intrinsics.d(this.f112723d, s0Var.f112723d) && Intrinsics.d(this.f112724e, s0Var.f112724e) && this.f112725f == s0Var.f112725f && this.f112726g == s0Var.f112726g && this.f112727h == s0Var.f112727h && this.f112728i == s0Var.f112728i && this.f112729j == s0Var.f112729j && this.f112730k == s0Var.f112730k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f112730k) + ep.b.e(this.f112729j, ep.b.b(this.f112728i, ep.b.e(this.f112727h, ep.b.e(this.f112726g, (this.f112725f.hashCode() + d7.g.c(this.f112724e, (this.f112723d.hashCode() + ((this.f112722c.hashCode() + ep.b.b(this.f112721b, Integer.hashCode(this.f112720a) * 31, 31)) * 31)) * 31, 31)) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PageViewModel(displayWidth=");
        sb3.append(this.f112720a);
        sb3.append(", displayHeight=");
        sb3.append(this.f112721b);
        sb3.append(", cornerRadii=");
        sb3.append(this.f112722c);
        sb3.append(", videoViewModel=");
        sb3.append(this.f112723d);
        sb3.append(", backgroundProvider=");
        sb3.append(this.f112724e);
        sb3.append(", imageScaleType=");
        sb3.append(this.f112725f);
        sb3.append(", useImageOnlyRendering=");
        sb3.append(this.f112726g);
        sb3.append(", showMediaIcon=");
        sb3.append(this.f112727h);
        sb3.append(", verticalPadding=");
        sb3.append(this.f112728i);
        sb3.append(", isCloseupRedesignEnabled=");
        sb3.append(this.f112729j);
        sb3.append(", shouldLimitHeight=");
        return a.a.r(sb3, this.f112730k, ")");
    }
}
