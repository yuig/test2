package com.pinterest.feature.comment.reactions.view;

import af2.c;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.api.model.az0;
import com.pinterest.api.model.z2;
import com.pinterest.gestalt.text.GestaltText;
import dl1.s;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import pp0.b;
import q5.m0;
import q5.v0;
import qp0.d;
import qp0.e;
import qp0.f;
import qp0.g;
import qp0.h;
import v32.a;
import ye2.o;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/comment/reactions/view/CommentReactionsContextMenuView;", "", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "commentReactionsLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class CommentReactionsContextMenuView extends FrameLayout implements c {

    /* renamed from: a, reason: collision with root package name */
    public o f45482a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f45483b;

    /* renamed from: c, reason: collision with root package name */
    public xj2.c f45484c;

    /* renamed from: d, reason: collision with root package name */
    public s f45485d;

    /* renamed from: e, reason: collision with root package name */
    public op0.c f45486e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f45487f;

    /* renamed from: g, reason: collision with root package name */
    public Rect f45488g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f45489h;

    /* renamed from: i, reason: collision with root package name */
    public final int f45490i;

    /* renamed from: j, reason: collision with root package name */
    public final float f45491j;

    /* renamed from: k, reason: collision with root package name */
    public float f45492k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f45493l;

    /* renamed from: m, reason: collision with root package name */
    public v32.c f45494m;

    /* renamed from: n, reason: collision with root package name */
    public final int f45495n;

    /* renamed from: o, reason: collision with root package name */
    public final int f45496o;

    /* renamed from: p, reason: collision with root package name */
    public final float f45497p;

    /* renamed from: q, reason: collision with root package name */
    public AnimatorSet f45498q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f45499r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f45500s;

    /* renamed from: t, reason: collision with root package name */
    public final AppCompatImageView f45501t;

    /* renamed from: u, reason: collision with root package name */
    public final d f45502u;

    /* renamed from: v, reason: collision with root package name */
    public final GestaltText f45503v;

    /* renamed from: w, reason: collision with root package name */
    public final FrameLayout f45504w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentReactionsContextMenuView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f45483b) {
            this.f45483b = true;
            ((h) generatedComponent()).getClass();
        }
        a aVar = v32.c.Companion;
        List list = b.f100910a;
        this.f45489h = new ArrayList(list.size());
        this.f45495n = getResources().getDimensionPixelOffset(cb0.a.comment_reaction_context_menu_width);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(cb0.a.comment_reaction_context_menu_height);
        this.f45496o = dimensionPixelOffset;
        this.f45497p = dimensionPixelOffset;
        this.f45498q = new AnimatorSet();
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext(), null);
        Context context2 = appCompatImageView.getContext();
        int i13 = cz1.b.background_lego_bottom_nav;
        Object obj = d5.a.f53679a;
        appCompatImageView.setBackground(context2.getDrawable(i13));
        this.f45501t = appCompatImageView;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        d dVar = new d(context3);
        int dimensionPixelOffset2 = dVar.getResources().getDimensionPixelOffset(cb0.a.comment_reaction_context_menu_padding);
        dVar.setPadding(dimensionPixelOffset2, dimensionPixelOffset2, dimensionPixelOffset2, dimensionPixelOffset2);
        this.f45502u = dVar;
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        GestaltText gestaltText = new GestaltText(6, context4, (AttributeSet) null);
        gestaltText.i(qp0.c.f104721k);
        dl2.b.y2(gestaltText);
        int dimensionPixelSize = gestaltText.getResources().getDimensionPixelSize(r0.margin_quarter);
        gestaltText.setPaddingRelative(gestaltText.getPaddingStart(), dimensionPixelSize, gestaltText.getPaddingEnd(), dimensionPixelSize);
        int dimensionPixelSize2 = gestaltText.getResources().getDimensionPixelSize(r0.margin_half);
        gestaltText.setPaddingRelative(dimensionPixelSize2, gestaltText.getPaddingTop(), dimensionPixelSize2, gestaltText.getPaddingBottom());
        this.f45503v = gestaltText;
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setBackgroundResource(eo1.d.pin_reactions_text_background);
        frameLayout.addView(gestaltText, new FrameLayout.LayoutParams(-2, -2, 17));
        frameLayout.setAlpha(0.0f);
        this.f45504w = frameLayout;
        setClipChildren(false);
        setClipToPadding(false);
        addView(frameLayout, -2, -2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a0.o(this.f45503v, ((pp0.a) it.next()).f100908b, new Object[0]);
            FrameLayout frameLayout2 = this.f45504w;
            frameLayout2.measure(0, 0);
            this.f45489h.add(Integer.valueOf(frameLayout2.getMeasuredWidth()));
        }
        int measuredHeight = this.f45504w.getMeasuredHeight();
        this.f45490i = measuredHeight;
        this.f45491j = measuredHeight / 4.0f;
        AppCompatImageView appCompatImageView2 = this.f45501t;
        float dimensionPixelSize3 = getResources().getDimensionPixelSize(eo1.c.bottom_nav_elevation);
        WeakHashMap weakHashMap = v0.f102521a;
        m0.l(appCompatImageView2, dimensionPixelSize3);
        View view = this.f45501t;
        view.setAlpha(0.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f45495n, this.f45496o);
        layoutParams.gravity = 1;
        Unit unit = Unit.f80348a;
        addView(view, layoutParams);
        m0.q(this.f45502u, m0.h(this.f45501t) + 1);
        addView(this.f45502u);
    }

    public final void a() {
        float height;
        Rect rect;
        String str;
        Iterator it;
        int i13 = 1;
        d dVar = this.f45502u;
        boolean z13 = dVar.f104723a != v32.c.NONE;
        if (this.f45500s && !z13) {
            this.f45500s = false;
            return;
        }
        this.f45499r = false;
        this.f45498q.cancel();
        Animator[] animatorArr = new Animator[1];
        AnimatorSet animatorSet = new AnimatorSet();
        WeakReference weakReference = this.f45487f;
        if (weakReference == null) {
            Intrinsics.r("iconsView");
            throw null;
        }
        Rect targetRect = this.f45488g;
        if (targetRect == null) {
            Intrinsics.r("buttonRect");
            throw null;
        }
        String str2 = "targetRect";
        Intrinsics.checkNotNullParameter(targetRect, "targetRect");
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(dVar.f104737o, "alpha", 0.0f));
        Iterator it2 = b.f100910a.iterator();
        while (it2.hasNext()) {
            pp0.a aVar = (pp0.a) it2.next();
            f fVar = (f) dVar.findViewWithTag(aVar);
            if (fVar == null) {
                rect = targetRect;
                str = str2;
                it = it2;
            } else if (aVar.f100909c == dVar.f104723a) {
                Intrinsics.checkNotNullParameter(targetRect, str2);
                fVar.f104742c.end();
                Rect R0 = bs1.c.R0(fVar);
                AnimatorSet animatorSet2 = new AnimatorSet();
                str = str2;
                float[] fArr = new float[i13];
                fArr[0] = 1.0f;
                rect = targetRect;
                it = it2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(fVar, "alpha", fArr), ObjectAnimator.ofFloat(fVar, "translationY", fVar.getTranslationY() + (targetRect.exactCenterY() - R0.exactCenterY())));
                animatorSet2.addListener(new e(fVar, 0));
                arrayList.add(animatorSet2);
            } else {
                rect = targetRect;
                str = str2;
                it = it2;
                fVar.f104742c.cancel();
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playTogether(ObjectAnimator.ofFloat(fVar, "alpha", 0.0f), ObjectAnimator.ofFloat(fVar, "translationY", fVar.f104741b));
                arrayList.add(animatorSet3);
            }
            str2 = str;
            targetRect = rect;
            it2 = it;
            i13 = 1;
        }
        AppCompatImageView appCompatImageView = this.f45501t;
        arrayList.add(ObjectAnimator.ofFloat(appCompatImageView, "y", this.f45492k + this.f45497p));
        arrayList.add(ObjectAnimator.ofFloat(appCompatImageView, "alpha", 0.0f));
        animatorSet.playTogether(arrayList);
        if (!z13) {
            animatorSet.addListener(new e(this, 1));
        }
        Unit unit = Unit.f80348a;
        animatorArr[0] = animatorSet;
        ArrayList l13 = f0.l(animatorArr);
        if (z13) {
            this.f45494m = null;
            v32.c cVar = dVar.f104723a;
            Iterator it3 = b.f100910a.iterator();
            int i14 = 0;
            while (true) {
                boolean hasNext = it3.hasNext();
                FrameLayout frameLayout = this.f45504w;
                int i15 = this.f45490i;
                if (hasNext) {
                    Object next = it3.next();
                    int i16 = i14 + 1;
                    if (i14 < 0) {
                        f0.p();
                        throw null;
                    }
                    pp0.a aVar2 = (pp0.a) next;
                    if (aVar2.f100909c == cVar) {
                        boolean z14 = this.f45493l;
                        float f13 = this.f45491j;
                        if (z14) {
                            if (this.f45488g == null) {
                                Intrinsics.r("buttonRect");
                                throw null;
                            }
                            height = ((-(r11.height() / 2.0f)) - i15) - f13;
                        } else {
                            if (this.f45488g == null) {
                                Intrinsics.r("buttonRect");
                                throw null;
                            }
                            height = (r8.height() / 2.0f) + f13;
                        }
                        float intValue = ((Number) this.f45489h.get(i14)).intValue();
                        a0.o(this.f45503v, aVar2.f100908b, new Object[0]);
                        Rect rect2 = this.f45488g;
                        if (rect2 == null) {
                            Intrinsics.r("buttonRect");
                            throw null;
                        }
                        frameLayout.setX(rect2.exactCenterX() - (intValue / 2.0f));
                        Rect rect3 = this.f45488g;
                        if (rect3 == null) {
                            Intrinsics.r("buttonRect");
                            throw null;
                        }
                        frameLayout.setY((rect3.exactCenterY() - hf0.b.f69007g) + height);
                    }
                    i14 = i16;
                } else {
                    float y13 = (i15 * (this.f45493l ? -0.5f : 0.5f)) + frameLayout.getY();
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(frameLayout, "alpha", 1.0f);
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    animatorSet5.setStartDelay(300L);
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(frameLayout, "alpha", 0.0f), ObjectAnimator.ofFloat(frameLayout, "y", y13));
                    animatorSet4.playSequentially(ofFloat, animatorSet5);
                    animatorSet4.addListener(new g(0, this, cVar));
                    l13.add(animatorSet4);
                }
            }
        }
        AnimatorSet animatorSet6 = new AnimatorSet();
        animatorSet6.playSequentially(l13);
        animatorSet6.start();
        this.f45498q = animatorSet6;
    }

    public final boolean b() {
        Rect rect = this.f45488g;
        if (rect == null) {
            Intrinsics.r("buttonRect");
            throw null;
        }
        float exactCenterX = rect.exactCenterX();
        Rect rect2 = this.f45488g;
        if (rect2 == null) {
            Intrinsics.r("buttonRect");
            throw null;
        }
        float exactCenterY = rect2.exactCenterY();
        if (this.f45488g == null) {
            Intrinsics.r("buttonRect");
            throw null;
        }
        float height = r4.height() / 2.0f;
        int i13 = this.f45496o;
        float f13 = (exactCenterY - height) - i13;
        float f14 = (i13 * 0.5f) + exactCenterY + height;
        d dVar = this.f45502u;
        boolean z13 = f13 > (-dVar.f104733k) - ((float) hf0.b.f69007g);
        float Z = exactCenterX - ((bs1.c.Z(this, cb0.a.comment_reaction_context_menu_icon_padding) + (dVar.getWidth() + dVar.f104731i)) / 2);
        if (!z13) {
            f13 = f14;
        }
        this.f45492k = f13 - bs1.c.Q0(this).top;
        AppCompatImageView appCompatImageView = this.f45501t;
        appCompatImageView.setAlpha(0.0f);
        appCompatImageView.setX(Z);
        appCompatImageView.setY(this.f45492k + this.f45497p);
        dVar.setX(Z + dVar.getPaddingStart());
        dVar.setY(this.f45492k);
        dVar.f104725c = null;
        dVar.f104723a = v32.c.NONE;
        this.f45504w.setAlpha(0.0f);
        return z13;
    }

    public final void c(z2 comment, op0.c commonReactionContextMenuLogicHandler, ConstraintLayout iconsView, Rect buttonRect) {
        Intrinsics.checkNotNullParameter(comment, "comment");
        Intrinsics.checkNotNullParameter(commonReactionContextMenuLogicHandler, "commonReactionContextMenuLogicHandler");
        Intrinsics.checkNotNullParameter(iconsView, "iconsView");
        Intrinsics.checkNotNullParameter(buttonRect, "buttonRect");
        xj2.c cVar = this.f45484c;
        if (cVar != null && !cVar.isDisposed()) {
            cVar.dispose();
        }
        setVisibility(0);
        this.f45485d = comment;
        this.f45486e = commonReactionContextMenuLogicHandler;
        this.f45487f = new WeakReference(iconsView);
        this.f45488g = buttonRect;
        this.f45498q.cancel();
        this.f45493l = b();
        e();
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f45482a == null) {
            this.f45482a = new o(this);
        }
        return this.f45482a;
    }

    public final void d(az0 comment, op0.c commonReactionContextMenuLogicHandler, ConstraintLayout iconsView, Rect buttonRect) {
        Intrinsics.checkNotNullParameter(comment, "comment");
        Intrinsics.checkNotNullParameter(commonReactionContextMenuLogicHandler, "commonReactionContextMenuLogicHandler");
        Intrinsics.checkNotNullParameter(iconsView, "iconsView");
        Intrinsics.checkNotNullParameter(buttonRect, "buttonRect");
        xj2.c cVar = this.f45484c;
        if (cVar != null && !cVar.isDisposed()) {
            cVar.dispose();
        }
        setVisibility(0);
        this.f45485d = comment;
        this.f45486e = commonReactionContextMenuLogicHandler;
        this.f45487f = new WeakReference(iconsView);
        this.f45488g = buttonRect;
        this.f45498q.cancel();
        this.f45493l = b();
        e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent ev2) {
        Iterator it;
        FrameLayout frameLayout;
        float f13;
        Intrinsics.checkNotNullParameter(ev2, "ev");
        if (!this.f45499r) {
            return false;
        }
        if (ev2.getAction() == 1) {
            a();
        } else if (!this.f45498q.isRunning() && (ev2.getAction() == 2 || ev2.getAction() == 0)) {
            int rawX = (int) ev2.getRawX();
            int rawY = (int) ev2.getRawY();
            d dVar = this.f45502u;
            Rect rect = dVar.f104725c;
            ArrayList arrayList = dVar.f104726d;
            if (rect == null) {
                rect = bs1.c.Q0(dVar);
                int width = rect.width() / arrayList.size();
                Iterator it2 = arrayList.iterator();
                int i13 = 0;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        f0.p();
                        throw null;
                    }
                    Rect rect2 = (Rect) next;
                    if (com.bumptech.glide.c.w0(dVar)) {
                        int i15 = rect.right - (i13 * width);
                        rect2.set(new Rect(i15 - width, rect.top, i15, rect.bottom));
                    } else {
                        int i16 = (i13 * width) + rect.left;
                        rect2.set(new Rect(i16, rect.top, i16 + width, rect.bottom));
                    }
                    i13 = i14;
                }
                dVar.f104725c = rect;
            }
            boolean contains = rect.contains(rawX, rawY);
            FrameLayout frameLayout2 = dVar.f104737o;
            float f14 = dVar.f104734l;
            if (!contains && dVar.f104724b != contains) {
                AnimatorSet animatorSet = dVar.f104735m;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(ObjectAnimator.ofFloat(frameLayout2, "alpha", 0.0f), ObjectAnimator.ofFloat(frameLayout2, "translationY", f14));
                animatorSet2.start();
                dVar.f104735m = animatorSet2;
                Iterator it3 = b.f100910a.iterator();
                while (it3.hasNext()) {
                    f fVar = (f) dVar.findViewWithTag((pp0.a) it3.next());
                    if (fVar != null && (fVar.f104743d || fVar.f104744e)) {
                        fVar.f104742c.cancel();
                        fVar.f104743d = false;
                        fVar.f104744e = false;
                        AnimatorSet animatorSet3 = new AnimatorSet();
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fVar, "translationY", 0.0f);
                        ofFloat.setDuration(150L);
                        Unit unit = Unit.f80348a;
                        animatorSet3.playTogether(ofFloat);
                        animatorSet3.start();
                        fVar.f104742c = animatorSet3;
                    }
                }
            }
            dVar.f104724b = contains;
            v32.c cVar = dVar.f104723a;
            dVar.f104723a = v32.c.NONE;
            if (contains) {
                Iterator it4 = b.f100910a.iterator();
                int i17 = 0;
                while (it4.hasNext()) {
                    Object next2 = it4.next();
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        f0.p();
                        throw null;
                    }
                    pp0.a aVar = (pp0.a) next2;
                    f fVar2 = (f) dVar.findViewWithTag(aVar);
                    if (fVar2 != null) {
                        Object obj = arrayList.get(i17);
                        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                        if (((Rect) obj).contains(rawX, rawY)) {
                            v32.c cVar2 = aVar.f100909c;
                            dVar.f104723a = cVar2;
                            if (cVar != cVar2) {
                                Object obj2 = dVar.f104727e.get(i17);
                                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                                int intValue = ((Number) obj2).intValue();
                                it = it4;
                                boolean z13 = cVar == v32.c.NONE;
                                a0.o(dVar.f104736n, aVar.f100908b, new Object[0]);
                                dVar.removeView(frameLayout2);
                                dVar.addView(frameLayout2, new FrameLayout.LayoutParams(intValue, -2, 16));
                                if (z13) {
                                    frameLayout2.setX(((fVar2.getWidth() / 2.0f) + fVar2.getX()) - (intValue / 2.0f));
                                    frameLayout2.setTranslationY(f14);
                                }
                                float width2 = ((fVar2.getWidth() / 2.0f) + fVar2.getX()) - (intValue / 2.0f);
                                AnimatorSet animatorSet4 = dVar.f104735m;
                                if (animatorSet4 != null) {
                                    animatorSet4.cancel();
                                }
                                AnimatorSet animatorSet5 = new AnimatorSet();
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(frameLayout2, "alpha", 1.0f);
                                f13 = f14;
                                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(frameLayout2, "x", width2);
                                ofFloat3.setInterpolator(new OvershootInterpolator());
                                Unit unit2 = Unit.f80348a;
                                frameLayout = frameLayout2;
                                animatorSet5.playTogether(ofFloat2, ofFloat3, ObjectAnimator.ofFloat(frameLayout2, "translationY", dVar.f104733k));
                                animatorSet5.start();
                                dVar.f104735m = animatorSet5;
                                dVar.performHapticFeedback(3);
                                fVar2.sendAccessibilityEvent(32768);
                            } else {
                                it = it4;
                                frameLayout = frameLayout2;
                                f13 = f14;
                            }
                            if (!fVar2.f104743d) {
                                fVar2.f104742c.cancel();
                                fVar2.f104743d = true;
                                fVar2.f104744e = false;
                                AnimatorSet animatorSet6 = new AnimatorSet();
                                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(fVar2, "translationY", fVar2.f104740a);
                                ofFloat4.setDuration(150L);
                                Unit unit3 = Unit.f80348a;
                                animatorSet6.playTogether(ofFloat4);
                                animatorSet6.setInterpolator(new OvershootInterpolator());
                                animatorSet6.start();
                                fVar2.f104742c = animatorSet6;
                            }
                        } else {
                            it = it4;
                            frameLayout = frameLayout2;
                            f13 = f14;
                            if (!fVar2.f104744e) {
                                fVar2.f104742c.cancel();
                                fVar2.f104743d = false;
                                fVar2.f104744e = true;
                                AnimatorSet animatorSet7 = new AnimatorSet();
                                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(fVar2, "translationY", 0.0f);
                                ofFloat5.setDuration(150L);
                                Unit unit4 = Unit.f80348a;
                                animatorSet7.playTogether(ofFloat5);
                                animatorSet7.start();
                                fVar2.f104742c = animatorSet7;
                            }
                        }
                    } else {
                        it = it4;
                        frameLayout = frameLayout2;
                        f13 = f14;
                    }
                    i17 = i18;
                    frameLayout2 = frameLayout;
                    it4 = it;
                    f14 = f13;
                }
            }
            v32.c cVar3 = dVar.f104723a;
            if (cVar != cVar3 && cVar3 != v32.c.NONE) {
                System.currentTimeMillis();
            }
            return true;
        }
        return true;
    }

    public final void e() {
        this.f45499r = true;
        Intrinsics.checkNotNullExpressionValue(getContext(), "getContext(...)");
        this.f45500s = !gh0.b.f0(r2);
        AnimatorSet animatorSet = new AnimatorSet();
        d dVar = this.f45502u;
        dVar.getClass();
        ArrayList arrayList = new ArrayList();
        int i13 = 0;
        for (Object obj : b.f100910a) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                f0.p();
                throw null;
            }
            f fVar = (f) dVar.findViewWithTag((pp0.a) obj);
            if (fVar != null) {
                fVar.f104741b = this.f45497p;
                fVar.setAlpha(0.0f);
                fVar.setTranslationY(fVar.f104741b);
                fVar.f104745f.setTranslationY(0.0f);
                AnimatorSet animatorSet2 = new AnimatorSet();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fVar, "alpha", 1.0f);
                ofFloat.setDuration(100L);
                Unit unit = Unit.f80348a;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fVar, "translationY", 0.0f);
                ofFloat2.setInterpolator(new OvershootInterpolator());
                animatorSet2.playTogether(ofFloat, ofFloat2);
                animatorSet2.setStartDelay(i13 * 50);
                arrayList.add(animatorSet2);
            }
            i13 = i14;
        }
        AppCompatImageView appCompatImageView = this.f45501t;
        arrayList.add(ObjectAnimator.ofFloat(appCompatImageView, "y", this.f45492k));
        arrayList.add(ObjectAnimator.ofFloat(appCompatImageView, "alpha", 1.0f));
        animatorSet.playTogether(arrayList);
        animatorSet.start();
        this.f45498q = animatorSet;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f45482a == null) {
            this.f45482a = new o(this);
        }
        return this.f45482a.generatedComponent();
    }

    @Override // android.view.View
    public final boolean isShown() {
        return this.f45499r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        a();
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f45499r;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i13) {
        if (i13 == 8) {
            a();
        }
        super.onWindowVisibilityChanged(i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentReactionsContextMenuView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f45483b) {
            this.f45483b = true;
            ((h) generatedComponent()).getClass();
        }
        a aVar = v32.c.Companion;
        List list = b.f100910a;
        this.f45489h = new ArrayList(list.size());
        this.f45495n = getResources().getDimensionPixelOffset(cb0.a.comment_reaction_context_menu_width);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(cb0.a.comment_reaction_context_menu_height);
        this.f45496o = dimensionPixelOffset;
        this.f45497p = dimensionPixelOffset;
        this.f45498q = new AnimatorSet();
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext(), null);
        Context context2 = appCompatImageView.getContext();
        int i14 = cz1.b.background_lego_bottom_nav;
        Object obj = d5.a.f53679a;
        appCompatImageView.setBackground(context2.getDrawable(i14));
        this.f45501t = appCompatImageView;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        d dVar = new d(context3);
        int dimensionPixelOffset2 = dVar.getResources().getDimensionPixelOffset(cb0.a.comment_reaction_context_menu_padding);
        dVar.setPadding(dimensionPixelOffset2, dimensionPixelOffset2, dimensionPixelOffset2, dimensionPixelOffset2);
        this.f45502u = dVar;
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        GestaltText gestaltText = new GestaltText(6, context4, (AttributeSet) null);
        gestaltText.i(qp0.c.f104721k);
        dl2.b.y2(gestaltText);
        int dimensionPixelSize = gestaltText.getResources().getDimensionPixelSize(r0.margin_quarter);
        gestaltText.setPaddingRelative(gestaltText.getPaddingStart(), dimensionPixelSize, gestaltText.getPaddingEnd(), dimensionPixelSize);
        int dimensionPixelSize2 = gestaltText.getResources().getDimensionPixelSize(r0.margin_half);
        gestaltText.setPaddingRelative(dimensionPixelSize2, gestaltText.getPaddingTop(), dimensionPixelSize2, gestaltText.getPaddingBottom());
        this.f45503v = gestaltText;
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setBackgroundResource(eo1.d.pin_reactions_text_background);
        frameLayout.addView(gestaltText, new FrameLayout.LayoutParams(-2, -2, 17));
        frameLayout.setAlpha(0.0f);
        this.f45504w = frameLayout;
        setClipChildren(false);
        setClipToPadding(false);
        addView(frameLayout, -2, -2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a0.o(this.f45503v, ((pp0.a) it.next()).f100908b, new Object[0]);
            FrameLayout frameLayout2 = this.f45504w;
            frameLayout2.measure(0, 0);
            this.f45489h.add(Integer.valueOf(frameLayout2.getMeasuredWidth()));
        }
        int measuredHeight = this.f45504w.getMeasuredHeight();
        this.f45490i = measuredHeight;
        this.f45491j = measuredHeight / 4.0f;
        AppCompatImageView appCompatImageView2 = this.f45501t;
        float dimensionPixelSize3 = getResources().getDimensionPixelSize(eo1.c.bottom_nav_elevation);
        WeakHashMap weakHashMap = v0.f102521a;
        m0.l(appCompatImageView2, dimensionPixelSize3);
        View view = this.f45501t;
        view.setAlpha(0.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f45495n, this.f45496o);
        layoutParams.gravity = 1;
        Unit unit = Unit.f80348a;
        addView(view, layoutParams);
        m0.q(this.f45502u, m0.h(this.f45501t) + 1);
        addView(this.f45502u);
    }
}
