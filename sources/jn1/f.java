package jn1;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f extends Animation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f77102a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f77103b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f77104c;

    public f(float f13, i iVar, View view) {
        this.f77102a = f13;
        this.f77103b = iVar;
        this.f77104c = view;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f13, Transformation t13) {
        Intrinsics.checkNotNullParameter(t13, "t");
        i iVar = this.f77103b;
        iVar.getClass();
        float f14 = this.f77102a;
        float f15 = (f14 - 0) * f13;
        this.f77104c.setTranslationY(f15);
        Function2 function2 = iVar.f77113d;
        if (function2 != null) {
            function2.invoke(Float.valueOf(f15), Float.valueOf(f14));
        }
    }
}
