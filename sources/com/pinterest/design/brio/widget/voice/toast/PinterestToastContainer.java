package com.pinterest.design.brio.widget.voice.toast;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.RelativeLayout;
import com.pinterest.gestalt.toast.GestaltToast;
import hf0.b;
import ja.y;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import oi.o6;
import org.chromium.net.NetError;
import pk.a0;
import ua.m0;
import we0.a;
import we0.c;
import y0.r;

/* loaded from: classes5.dex */
public abstract class PinterestToastContainer extends RelativeLayout {

    /* renamed from: c */
    public static int f44919c;

    /* renamed from: d */
    public static int f44920d;

    /* renamed from: a */
    public final SparseArray f44921a;

    /* renamed from: b */
    public final ArrayList f44922b;

    public PinterestToastContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44921a = new SparseArray();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        f44919c = viewConfiguration.getScaledMinimumFlingVelocity();
        f44920d = viewConfiguration.getScaledTouchSlop();
        int L = b.q() ? a0.L(getResources(), 48.0f) : a0.L(getResources(), 16.0f);
        setPaddingRelative(L, 0, L, a0.K(16, getResources()));
        setClipChildren(false);
        setClipToPadding(false);
        this.f44922b = new ArrayList();
    }

    public static void g(View view) {
        Object tag = view.getTag();
        if (tag instanceof a) {
            ((a) tag).c(view.getContext());
        }
    }

    public final void a(View view) {
        if (view.getTag() instanceof a) {
            o6 o6Var = new o6(10, this, view);
            postDelayed(o6Var, view instanceof GestaltToast ? ((GestaltToast) view).z().f55670f : 5000);
            this.f44921a.put(view.getId(), o6Var);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        super.addView(view);
        this.f44922b.add(view);
    }

    public void b(a aVar) {
        RelativeLayout.LayoutParams layoutParams;
        int i13 = 1;
        if (aVar == null) {
            return;
        }
        GestaltToast a13 = aVar.a(this);
        a13.setTag(aVar);
        ArrayList arrayList = new ArrayList(this.f44922b);
        c eventHandler = new c(this, a13);
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        h(e() * arrayList.size(), a13, arrayList);
        a13.setTranslationY(c());
        if (aVar.f129243c) {
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
        } else {
            layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        }
        layoutParams.addRule(a13.z().f55673i ? 12 : 10);
        a13.setLayoutParams(layoutParams);
        addView(a13);
        bs1.c.s2(a13, a13.z().f55665a.a(getContext()));
    }

    public int c() {
        return NetError.ERR_INVALID_URL;
    }

    public abstract float d();

    public int e() {
        return 1500;
    }

    public final boolean f(View view) {
        if (view == null || view.getParent() == null || !(view.getTag() instanceof a)) {
            return false;
        }
        a aVar = (a) view.getTag();
        if (aVar.f129241a) {
            return false;
        }
        aVar.f129241a = true;
        i(view);
        return true;
    }

    public void h(int i13, GestaltToast gestaltToast, ArrayList arrayList) {
        gestaltToast.postDelayed(new y(this, gestaltToast, arrayList, 13), i13);
    }

    public void i(View view) {
        ObjectAnimator d03 = kg.a.d0(view, "translationY", view.getTranslationY(), c(), 0.75f, 0.25f);
        d03.setStartDelay(160L);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        ofFloat.setDuration(400L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, d03);
        animatorSet.addListener(new m0(8, this, view));
        animatorSet.start();
    }

    public void j(int i13, View view, List list) {
        ObjectAnimator d03 = kg.a.d0(view, "translationY", c(), 0.0f, 0.75f, 0.25f);
        d03.addListener(new m0(7, this, list));
        d03.start();
    }

    public final void k(View view, int i13) {
        view.postDelayed(new r(this, view, new ArrayList(this.f44922b), i13, 4), r3.size() * 1500);
        view.setTranslationY(NetError.ERR_INVALID_URL);
    }

    public final void l(View view) {
        if (view != null) {
            removeView(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        this.f44922b.remove(view);
        super.removeView(view);
    }
}
