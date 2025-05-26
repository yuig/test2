package com.pinterest.component.modal;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import com.pinterest.component.alert.AlertContainer;
import dl2.b;
import dn.c;
import h32.d4;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import jc0.a;
import jc0.a0;
import jc0.h;
import jc0.p;
import jc0.q;
import jc0.s;
import jc0.u;
import jc0.v;
import jc0.w;
import jc0.x;
import jc0.z;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tq.j;
import ua.m0;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0006\n\u000b\f\r\u000e\u000fB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/pinterest/component/modal/ModalContainer;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "vb0/e", "jc0/q", "jc0/s", "jc0/t", "jc0/u", "jc0/v", "ui-components_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ModalContainer extends h {

    /* renamed from: l, reason: collision with root package name */
    public static final p f44758l = new p();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f44759d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayDeque f44760e;

    /* renamed from: f, reason: collision with root package name */
    public z f44761f;

    /* renamed from: g, reason: collision with root package name */
    public u f44762g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f44763h;

    /* renamed from: i, reason: collision with root package name */
    public final WeakHashMap f44764i;

    /* renamed from: j, reason: collision with root package name */
    public tb0.h f44765j;

    /* renamed from: k, reason: collision with root package name */
    public final w f44766k;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ModalContainer(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void d() {
        ArrayList arrayList = this.f44763h;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            View view = (View) ((WeakReference) pair.first).get();
            if (view != null) {
                Object second = pair.second;
                Intrinsics.checkNotNullExpressionValue(second, "second");
                view.setImportantForAccessibility(((Number) second).intValue());
            }
        }
        arrayList.clear();
        this.f44762g.a();
        this.f44761f = null;
    }

    public final void e(s e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        a0 a0Var = (a0) this.f44760e.peek();
        if (a0Var == null || !a0Var.shouldOverrideDismissEvent()) {
            f(e13.f75437b, e13.f75436a);
        } else {
            f(a0Var.getOverrideAnimation(), e13.f75436a);
        }
    }

    public final boolean f(a aVar, boolean z13) {
        ObjectAnimator ofFloat;
        if (h()) {
            ArrayDeque arrayDeque = this.f44760e;
            Object pop = arrayDeque.pop();
            Intrinsics.checkNotNullExpressionValue(pop, "pop(...)");
            a0 a0Var = (a0) pop;
            tb0.h hVar = this.f44765j;
            if (hVar == null) {
                Intrinsics.r("crashReporting");
                throw null;
            }
            hVar.h("Modal being popped is ".concat(a0Var.getClass().getName()));
            String savedInstanceStateKey = a0Var.getSavedInstanceStateKey();
            if (savedInstanceStateKey != null && savedInstanceStateKey.length() != 0) {
                HashMap hashMap = this.f44759d;
                if (z13) {
                    hashMap.remove(savedInstanceStateKey);
                } else {
                    Bundle bundle = new Bundle();
                    a0Var.onSaveInstanceState(bundle);
                    hashMap.put(savedInstanceStateKey, bundle);
                }
            }
            a0Var.onAboutToDismiss();
            BaseModalViewWrapper baseModalViewWrapper = (BaseModalViewWrapper) a0Var.getModalContentContainer();
            baseModalViewWrapper.getClass();
            View modalOverlay = a0Var.getModalOverlay();
            View educationContainer = a0Var.getEducationContainer();
            if (baseModalViewWrapper.getParent() != null) {
                Object systemService = baseModalViewWrapper.getContext().getSystemService("input_method");
                Intrinsics.g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                ((InputMethodManager) systemService).hideSoftInputFromWindow(baseModalViewWrapper.getWindowToken(), 0);
                if (aVar != a.None) {
                    if (aVar == a.Bottom) {
                        ofFloat = ObjectAnimator.ofFloat(baseModalViewWrapper, "translationY", baseModalViewWrapper.getTranslationY(), getHeight() - baseModalViewWrapper.getY());
                        Intrinsics.f(ofFloat);
                    } else {
                        ofFloat = ObjectAnimator.ofFloat(baseModalViewWrapper, "translationX", baseModalViewWrapper.getTranslationX(), getWidth() - baseModalViewWrapper.getX());
                        Intrinsics.f(ofFloat);
                    }
                    ofFloat.setStartDelay(100L);
                    ofFloat.setDuration(100L);
                    ofFloat.addListener(new x(this, baseModalViewWrapper, modalOverlay, educationContainer, 0));
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator w13 = modalOverlay != null ? c.w(modalOverlay) : null;
                    if (w13 != null) {
                        animatorSet.playTogether(ofFloat, w13);
                    } else {
                        animatorSet.play(ofFloat);
                    }
                    animatorSet.start();
                } else {
                    l(baseModalViewWrapper, modalOverlay, educationContainer);
                }
                if (arrayDeque.size() == 0) {
                    Context context = getContext();
                    if (context != null && bs1.c.c1(context)) {
                        b.s2(bs1.c.k0(context));
                    }
                    d();
                }
                return true;
            }
            if (arrayDeque.size() == 0) {
                d();
            }
        }
        return false;
    }

    public final void g(q e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        while (true) {
            ArrayDeque arrayDeque = this.f44760e;
            if (arrayDeque.size() <= 0 || arrayDeque.peek() == null) {
                return;
            } else {
                f(a.Bottom, e13.f75435a);
            }
        }
    }

    public final boolean h() {
        ArrayDeque arrayDeque = this.f44760e;
        return arrayDeque.size() > 0 && arrayDeque.peek() != null;
    }

    public final boolean i() {
        if (!h()) {
            return false;
        }
        a0 a0Var = (a0) this.f44760e.peek();
        Intrinsics.f(a0Var);
        return a0Var.isDismissible();
    }

    public final boolean j() {
        if (!h()) {
            return false;
        }
        Intrinsics.f((a0) this.f44760e.peek());
        return !r0.isDismissible(true);
    }

    public final void k(v e13) {
        View view;
        ViewPropertyAnimator translationY;
        int i13;
        int i14;
        Intrinsics.checkNotNullParameter(e13, "e");
        a0 a0Var = e13.f75439a;
        if (a0Var == null) {
            return;
        }
        ArrayDeque arrayDeque = this.f44760e;
        Bundle bundle = null;
        if (e13.f75442d) {
            Context context = getContext();
            view = new FrameLayout(context);
            int i15 = ga2.a.modal_background;
            Object obj = d5.a.f53679a;
            view.setBackgroundColor(context.getColor(i15));
            view.setAlpha(0.0f);
            view.setOnClickListener(new j(this, 20));
            a0 a0Var2 = (a0) arrayDeque.peek();
            if (a0Var2 != null) {
                i13 = a0Var2.getModalHeight();
                i14 = a0Var2.getModalWidth();
            } else {
                i13 = -1;
                i14 = -1;
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i14, i13);
            layoutParams.gravity = 81;
            a0Var.setOverlay(view);
            addView(view, layoutParams);
            view.setImportantForAccessibility(2);
        } else {
            view = null;
        }
        String savedInstanceStateKey = a0Var.getSavedInstanceStateKey();
        if (savedInstanceStateKey != null && savedInstanceStateKey.length() != 0 && e13.f75440b) {
            bundle = (Bundle) this.f44759d.get(savedInstanceStateKey);
        }
        Context context2 = getContext();
        Intrinsics.f(context2);
        z createModalContentContainerInternal = a0Var.createModalContentContainerInternal(context2, bundle);
        this.f44761f = createModalContentContainerInternal;
        BaseModalViewWrapper baseModalViewWrapper = (BaseModalViewWrapper) createModalContentContainerInternal;
        baseModalViewWrapper.a(a0Var.getLayoutHeight());
        addView(baseModalViewWrapper);
        if (e13.f75441c) {
            baseModalViewWrapper.m(getWidth() - baseModalViewWrapper.e());
            translationY = baseModalViewWrapper.animate().translationX(0.0f);
        } else {
            baseModalViewWrapper.n(getHeight() - baseModalViewWrapper.g());
            translationY = baseModalViewWrapper.animate().translationY(0.0f);
        }
        Intrinsics.f(translationY);
        translationY.setDuration(e13.f75443e).setListener(new m0(this, a0Var, 6)).start();
        if (view != null) {
            c.t(view);
        }
        if (arrayDeque.size() == 0) {
            b.Y1(context2);
        }
        a0Var.onAboutToShow();
        arrayDeque.push(a0Var);
        if (arrayDeque.size() == 1) {
            String pinId = a0Var.getPinId();
            d4 viewType = a0Var.getViewType();
            ViewParent parent = getParent();
            Intrinsics.g(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) parent;
            int childCount = viewGroup.getChildCount();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt = viewGroup.getChildAt(i16);
                if (childAt != null && !(childAt instanceof ModalContainer) && !(childAt instanceof AlertContainer)) {
                    int importantForAccessibility = childAt.getImportantForAccessibility();
                    childAt.setImportantForAccessibility(4);
                    this.f44763h.add(new Pair(new WeakReference(childAt), Integer.valueOf(importantForAccessibility)));
                }
            }
            this.f44762g.b(viewType, pinId);
        } else {
            ArrayList arrayList = new ArrayList();
            int childCount2 = getChildCount();
            for (int i17 = 0; i17 < childCount2; i17++) {
                View childAt2 = getChildAt(i17);
                if (childAt2 instanceof BaseModalViewWrapper) {
                    arrayList.add(childAt2);
                }
            }
            if (arrayList.size() >= 2) {
                BaseModalViewWrapper baseModalViewWrapper2 = (BaseModalViewWrapper) ep.b.h(arrayList, 2);
                this.f44764i.put(baseModalViewWrapper2, Integer.valueOf(baseModalViewWrapper2.getImportantForAccessibility()));
                baseModalViewWrapper2.setImportantForAccessibility(4);
            }
        }
        if (view != null) {
            Object systemService = view.getContext().getSystemService("input_method");
            Intrinsics.g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        View educationContainer = a0Var.getEducationContainer();
        if (educationContainer != null) {
            addView(educationContainer);
        }
    }

    public final void l(ViewGroup viewGroup, View view, View view2) {
        Integer num;
        removeView(viewGroup);
        if (view != null) {
            removeView(view);
        }
        if (view2 != null) {
            removeView(view2);
        }
        if (getChildCount() <= 0) {
            return;
        }
        int childCount = getChildCount();
        boolean z13 = false;
        for (int i13 = 0; i13 < childCount; i13++) {
            if (getChildAt(i13) instanceof BaseModalViewWrapper) {
                View childAt = getChildAt(i13);
                Intrinsics.g(childAt, "null cannot be cast to non-null type com.pinterest.component.modal.BaseModalViewWrapper");
                this.f44761f = (BaseModalViewWrapper) childAt;
                z13 = true;
            }
        }
        if (z13 && (num = (Integer) this.f44764i.remove(this.f44761f)) != null) {
            z zVar = this.f44761f;
            Intrinsics.f(zVar);
            ((BaseModalViewWrapper) zVar).setImportantForAccessibility(num.intValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalContainer(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f44759d = new HashMap();
        this.f44760e = new ArrayDeque();
        this.f44762g = f44758l;
        this.f44763h = new ArrayList();
        this.f44764i = new WeakHashMap();
        this.f44766k = new w(this, 0);
    }
}
