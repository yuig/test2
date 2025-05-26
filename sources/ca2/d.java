package ca2;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d extends Animation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f27238a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f27239b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f27240c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f27241d;

    public d(float f13, e eVar, View view, c cVar) {
        this.f27238a = f13;
        this.f27239b = eVar;
        this.f27240c = view;
        this.f27241d = cVar;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f13, Transformation t13) {
        Intrinsics.checkNotNullParameter(t13, "t");
        float f14 = this.f27239b.f27259r;
        float f15 = this.f27238a;
        float f16 = (f15 - f14) * f13;
        this.f27240c.setTranslationY(f16);
        c cVar = this.f27241d;
        if (cVar != null) {
            cVar.s(f16, f15);
        }
    }
}
