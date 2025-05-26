package com.pinterest.component.alert;

import a.m2;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import dl2.b;
import dn.c;
import ga2.a;
import kh2.k3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ua.m0;
import yb0.d;
import yb0.q;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0006\b\t\n\u000b\f\rB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/pinterest/component/alert/AlertContainer;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "yb0/c", "yb0/d", "yb0/e", "yb0/f", "yb0/g", "yb0/h", "ui-components_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class AlertContainer extends FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f44684d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final View f44685a;

    /* renamed from: b, reason: collision with root package name */
    public q f44686b;

    /* renamed from: c, reason: collision with root package name */
    public float f44687c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertContainer(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View view = new View(context);
        int i13 = a.modal_background;
        Object obj = d5.a.f53679a;
        view.setBackgroundColor(context.getColor(i13));
        view.setAlpha(0.0f);
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.f44685a = view;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        View view2 = this.f44685a;
        if (view2 != null) {
            addView(view2, layoutParams);
        } else {
            Intrinsics.r("overlay");
            throw null;
        }
    }

    public final boolean a() {
        q qVar = this.f44686b;
        return qVar != null && qVar.d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(d dVar) {
        setClickable(false);
        q qVar = this.f44686b;
        if (qVar != 0) {
            View view = (View) qVar;
            if (view.getParent() == null) {
                return;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(qVar, "translationY", view.getTranslationY(), this.f44687c);
            ofFloat.setStartDelay(100L);
            ofFloat.setDuration(200L);
            ofFloat.addListener(new m0(this, qVar, 5));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofFloat);
            animatorSet.start();
            View view2 = this.f44685a;
            if (view2 == null) {
                Intrinsics.r("overlay");
                throw null;
            }
            c.u(view2);
            setOnTouchListener(null);
            Intrinsics.f(dVar);
            qVar.b(dVar);
            this.f44686b = null;
            Context context = getContext();
            if (context == null || !bs1.c.c1(context)) {
                return;
            }
            b.s2(bs1.c.k0(context));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(q qVar) {
        if (qVar == 0) {
            return;
        }
        if (this.f44686b != null) {
            b(d.SHOWING_ANOTHER);
        }
        this.f44686b = qVar;
        View view = (View) qVar;
        k3.J1(view);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) Math.min(getResources().getDisplayMetrics().widthPixels, qVar.e()), qVar.getLayoutHeight());
        layoutParams.gravity = qVar.a();
        view.setLayoutParams(layoutParams);
        addView(view);
        float height = getHeight() - view.getY();
        this.f44687c = height;
        view.setTranslationY(height);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(qVar, "translationY", this.f44687c, 0.0f);
        ofFloat.setDuration(200L);
        ofFloat.start();
        View view2 = this.f44685a;
        if (view2 == null) {
            Intrinsics.r("overlay");
            throw null;
        }
        c.t(view2);
        setClickable(true);
        b.Y1(getContext());
        bs1.c.s2(this, qVar.getTitle(), qVar.c());
        if (qVar.d()) {
            setOnTouchListener(new m2(this, 5));
        }
    }

    @Override // android.view.View
    public final boolean isShown() {
        return this.f44686b != null;
    }
}
