package jn1;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h extends Animation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f77106a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f77107b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f77108c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f77109d;

    public /* synthetic */ h(int i13, View view, Object obj, int i14) {
        this.f77106a = i14;
        this.f77107b = i13;
        this.f77108c = view;
        this.f77109d = obj;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f13, Transformation t13) {
        int i13 = this.f77106a;
        Object obj = this.f77109d;
        View view = this.f77108c;
        int i14 = this.f77107b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(t13, "t");
                float f14 = i14;
                float f15 = i14 - ((int) (f13 * f14));
                view.setTranslationY(f15);
                Function2 function2 = ((i) obj).f77113d;
                if (function2 != null) {
                    function2.invoke(Float.valueOf(f15), Float.valueOf(f14));
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(t13, "t");
                float f16 = i14;
                float f17 = i14 - ((int) (f13 * f16));
                view.setTranslationY(f17);
                ca2.c cVar = (ca2.c) obj;
                if (cVar != null) {
                    cVar.s(f17, f16);
                    break;
                }
                break;
        }
    }
}
