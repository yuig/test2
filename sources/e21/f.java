package e21;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.collections.k0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final float f56945a;

    /* renamed from: b, reason: collision with root package name */
    public float f56946b;

    /* renamed from: c, reason: collision with root package name */
    public AnimatorSet f56947c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f56948d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f56949e;

    /* renamed from: f, reason: collision with root package name */
    public e f56950f;

    /* renamed from: g, reason: collision with root package name */
    public e f56951g;

    /* renamed from: h, reason: collision with root package name */
    public final va.f f56952h;

    /* renamed from: i, reason: collision with root package name */
    public final va.f f56953i;

    /* renamed from: j, reason: collision with root package name */
    public final AppCompatImageView f56954j;

    /* renamed from: k, reason: collision with root package name */
    public final AppCompatImageView f56955k;

    /* renamed from: l, reason: collision with root package name */
    public final AppCompatImageView f56956l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, float f13, b21.a faceModel) {
        super(context);
        Drawable drawable;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(faceModel, "faceModel");
        this.f56945a = f13;
        this.f56947c = new AnimatorSet();
        va.f b13 = va.f.b(context, faceModel.f21280b);
        this.f56952h = b13;
        va.f b14 = va.f.b(context, faceModel.f21282d);
        this.f56953i = b14;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Object obj = d5.a.f53679a;
        Drawable drawable2 = context.getDrawable(faceModel.f21283e);
        Intrinsics.checkNotNullParameter(context, "context");
        if (drawable2 != null) {
            int i13 = faceModel.f21284f;
            if (i13 == 0) {
                int i14 = df0.a.f54892a;
                Object obj2 = d5.a.f53679a;
                i13 = context.getColor(i14);
            }
            drawable = drawable2.mutate();
            drawable.setTint(i13);
        } else {
            drawable = null;
        }
        appCompatImageView.setImageDrawable(drawable);
        this.f56954j = appCompatImageView;
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context, null);
        appCompatImageView2.setImageDrawable(b13);
        this.f56955k = appCompatImageView2;
        AppCompatImageView appCompatImageView3 = new AppCompatImageView(context, null);
        appCompatImageView3.setImageDrawable(b14);
        this.f56956l = appCompatImageView3;
        setClipChildren(false);
        setClipToPadding(false);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        setContentDescription(getResources().getString(faceModel.f21285g));
        addView(appCompatImageView, layoutParams);
        addView(appCompatImageView2, layoutParams);
        addView(appCompatImageView3, layoutParams);
        b(0.0f);
    }

    public final AnimatorSet a() {
        AppCompatImageView appCompatImageView = this.f56954j;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(appCompatImageView, "rotationX", 0.0f);
        Intrinsics.checkNotNullExpressionValue(ofFloat, "ofFloat(...)");
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(appCompatImageView, "rotationY", 0.0f);
        Intrinsics.checkNotNullExpressionValue(ofFloat2, "ofFloat(...)");
        ArrayList l13 = f0.l(ofFloat, ofFloat2);
        List<AppCompatImageView> j13 = f0.j(this.f56955k, this.f56956l);
        ArrayList arrayList = new ArrayList();
        for (AppCompatImageView appCompatImageView2 : j13) {
            List list = g.f56957a;
            ArrayList arrayList2 = new ArrayList(g0.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(ObjectAnimator.ofFloat(appCompatImageView2, (String) it.next(), 0.0f));
            }
            k0.u(arrayList2, arrayList);
        }
        l13.addAll(arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(l13);
        return animatorSet;
    }

    public final void b(float f13) {
        this.f56946b = f13;
        setAlpha(0.0f);
        setScaleX(0.33333334f);
        setScaleY(0.33333334f);
        setTranslationX(0.0f);
        setTranslationY(this.f56946b);
        for (AppCompatImageView appCompatImageView : f0.j(this.f56954j, this.f56955k, this.f56956l)) {
            appCompatImageView.setRotationX(0.0f);
            appCompatImageView.setRotationY(0.0f);
            appCompatImageView.setTranslationX(0.0f);
            appCompatImageView.setTranslationY(0.0f);
        }
        va.f fVar = this.f56952h;
        e eVar = new e(this, fVar, 0);
        if (fVar != null) {
            fVar.c(eVar);
        }
        if (fVar != null) {
            fVar.start();
        }
        this.f56950f = eVar;
        va.f fVar2 = this.f56953i;
        e eVar2 = new e(this, fVar2, 0);
        if (fVar2 != null) {
            fVar2.c(eVar2);
        }
        if (fVar2 != null) {
            fVar2.start();
        }
        this.f56951g = eVar2;
    }
}
