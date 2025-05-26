package com.pinterest.feature.pin.reactions.view;

import af2.c;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import b21.a;
import b21.b;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.text.GestaltText;
import e21.e;
import e21.h;
import e21.i;
import e21.s;
import e21.t;
import e21.u;
import eo1.d;
import h32.f1;
import h32.u0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import org.jetbrains.annotations.NotNull;
import pg0.c0;
import q5.m0;
import q5.v0;
import va.f;
import ye2.o;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/pin/reactions/view/ReactionsContextMenuView;", "", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "pinReactionsLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ReactionsContextMenuView extends FrameLayout implements c {

    /* renamed from: a, reason: collision with root package name */
    public o f47295a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f47296b;

    /* renamed from: c, reason: collision with root package name */
    public long f47297c;

    /* renamed from: d, reason: collision with root package name */
    public v32.c f47298d;

    /* renamed from: e, reason: collision with root package name */
    public xj2.c f47299e;

    /* renamed from: f, reason: collision with root package name */
    public String f47300f;

    /* renamed from: g, reason: collision with root package name */
    public a21.c f47301g;

    /* renamed from: h, reason: collision with root package name */
    public WeakReference f47302h;

    /* renamed from: i, reason: collision with root package name */
    public Rect f47303i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f47304j;

    /* renamed from: k, reason: collision with root package name */
    public final int f47305k;

    /* renamed from: l, reason: collision with root package name */
    public final float f47306l;

    /* renamed from: m, reason: collision with root package name */
    public float f47307m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f47308n;

    /* renamed from: o, reason: collision with root package name */
    public v32.c f47309o;

    /* renamed from: p, reason: collision with root package name */
    public final int f47310p;

    /* renamed from: q, reason: collision with root package name */
    public final int f47311q;

    /* renamed from: r, reason: collision with root package name */
    public final float f47312r;

    /* renamed from: s, reason: collision with root package name */
    public AnimatorSet f47313s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f47314t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f47315u;

    /* renamed from: v, reason: collision with root package name */
    public final AppCompatImageView f47316v;

    /* renamed from: w, reason: collision with root package name */
    public final i f47317w;

    /* renamed from: x, reason: collision with root package name */
    public final GestaltText f47318x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactionsContextMenuView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f47296b) {
            this.f47296b = true;
            ((u) generatedComponent()).getClass();
        }
        this.f47298d = v32.c.NONE;
        List<a> list = b.f21287a;
        this.f47304j = new ArrayList(list.size());
        this.f47310p = getResources().getDimensionPixelOffset(r0.pin_reaction_context_menu_width);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(r0.pin_reaction_context_menu_height);
        this.f47311q = dimensionPixelOffset;
        this.f47312r = dimensionPixelOffset;
        this.f47313s = new AnimatorSet();
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext(), null);
        Context context2 = appCompatImageView.getContext();
        int i13 = cz1.b.background_lego_bottom_nav;
        Object obj = d5.a.f53679a;
        appCompatImageView.setBackground(context2.getDrawable(i13));
        this.f47316v = appCompatImageView;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        i iVar = new i(context3);
        int dimensionPixelOffset2 = iVar.getResources().getDimensionPixelOffset(r0.margin);
        iVar.setPadding(dimensionPixelOffset2, dimensionPixelOffset2, dimensionPixelOffset2, dimensionPixelOffset2);
        this.f47317w = iVar;
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        GestaltText gestaltText = new GestaltText(6, context4, (AttributeSet) null);
        Drawable drawable = gestaltText.getContext().getDrawable(d.pin_reactions_text_background);
        if (drawable != null) {
            gestaltText.setBackground(drawable);
        }
        gestaltText.setAlpha(0.0f);
        gestaltText.setMaxLines(1);
        gestaltText.setSingleLine(true);
        dl2.b.A2(gestaltText);
        dl2.b.y2(gestaltText);
        int dimensionPixelSize = gestaltText.getResources().getDimensionPixelSize(r0.margin_quarter);
        gestaltText.setPaddingRelative(gestaltText.getPaddingStart(), dimensionPixelSize, gestaltText.getPaddingEnd(), dimensionPixelSize);
        int dimensionPixelSize2 = gestaltText.getResources().getDimensionPixelSize(r0.margin_half);
        gestaltText.setPaddingRelative(dimensionPixelSize2, gestaltText.getPaddingTop(), dimensionPixelSize2, gestaltText.getPaddingBottom());
        this.f47318x = gestaltText;
        setClipChildren(false);
        setClipToPadding(false);
        addView(gestaltText, -2, -2);
        for (a aVar : list) {
            GestaltText gestaltText2 = this.f47318x;
            gestaltText2.i(new h(aVar, 2));
            gestaltText2.measure(0, 0);
            this.f47304j.add(Integer.valueOf(gestaltText2.getMeasuredWidth()));
        }
        int measuredHeight = this.f47318x.getMeasuredHeight();
        this.f47305k = measuredHeight;
        this.f47306l = measuredHeight / 4.0f;
        AppCompatImageView appCompatImageView2 = this.f47316v;
        float dimensionPixelSize3 = getResources().getDimensionPixelSize(eo1.c.bottom_nav_elevation);
        WeakHashMap weakHashMap = v0.f102521a;
        m0.l(appCompatImageView2, dimensionPixelSize3);
        View view = this.f47316v;
        view.setAlpha(0.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f47310p, this.f47311q);
        layoutParams.gravity = 1;
        Unit unit = Unit.f80348a;
        addView(view, layoutParams);
        m0.q(this.f47317w, m0.h(this.f47316v) + 1);
        addView(this.f47317w);
    }

    public final AnimatorSet a(v32.c cVar) {
        float height;
        Iterator it = b.f21287a.iterator();
        int i13 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            int i14 = this.f47305k;
            GestaltText gestaltText = this.f47318x;
            if (!hasNext) {
                float y13 = (i14 * (this.f47308n ? -0.5f : 0.5f)) + gestaltText.getY();
                AnimatorSet animatorSet = new AnimatorSet();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(gestaltText, "alpha", 1.0f);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.setStartDelay(300L);
                animatorSet2.playTogether(ObjectAnimator.ofFloat(gestaltText, "alpha", 0.0f), ObjectAnimator.ofFloat(gestaltText, "y", y13));
                animatorSet.playSequentially(ofFloat, animatorSet2);
                return animatorSet;
            }
            Object next = it.next();
            int i15 = i13 + 1;
            if (i13 < 0) {
                f0.p();
                throw null;
            }
            a aVar = (a) next;
            if (aVar.f21286h == cVar) {
                boolean z13 = this.f47308n;
                float f13 = this.f47306l;
                if (z13) {
                    height = ((-((this.f47303i != null ? r10.height() : 0.0f) / 2.0f)) - i14) - f13;
                } else {
                    height = ((this.f47303i != null ? r6.height() : 0.0f) / 2.0f) + f13;
                }
                float intValue = ((Number) this.f47304j.get(i13)).intValue();
                gestaltText.i(new h(aVar, 3));
                Rect rect = this.f47303i;
                gestaltText.setX(Math.max(0.0f, (rect != null ? rect.exactCenterX() : 0.0f) - (intValue / 2.0f)));
                Rect rect2 = this.f47303i;
                gestaltText.setY(((rect2 != null ? rect2.exactCenterY() : 0.0f) - hf0.b.f69007g) + height);
            }
            i13 = i15;
        }
    }

    public final void b() {
        i iVar;
        boolean z13;
        ArrayList arrayList;
        Iterator it;
        i iVar2;
        boolean z14;
        ArrayList arrayList2;
        String str;
        AnimatorSet animatorSet;
        String str2;
        f fVar;
        f fVar2;
        ReactionsContextMenuView reactionsContextMenuView = this;
        i iVar3 = reactionsContextMenuView.f47317w;
        boolean z15 = iVar3.f56960a != v32.c.NONE;
        if (reactionsContextMenuView.f47315u && !z15) {
            reactionsContextMenuView.f47315u = false;
            return;
        }
        reactionsContextMenuView.f47314t = false;
        reactionsContextMenuView.f47313s.cancel();
        ArrayList arrayList3 = new ArrayList();
        Rect targetRect = reactionsContextMenuView.f47303i;
        if (targetRect != null) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            WeakReference weakReference = reactionsContextMenuView.f47302h;
            z11.a aVar = weakReference != null ? (z11.a) weakReference.get() : null;
            String str3 = "targetRect";
            Intrinsics.checkNotNullParameter(targetRect, "targetRect");
            ArrayList arrayList4 = new ArrayList();
            String str4 = "alpha";
            arrayList4.add(ObjectAnimator.ofFloat(iVar3.f56974o, "alpha", 0.0f));
            Iterator it2 = b.f21287a.iterator();
            while (it2.hasNext()) {
                a aVar2 = (a) it2.next();
                e21.f fVar3 = (e21.f) iVar3.findViewWithTag(aVar2);
                if (fVar3 != null) {
                    v32.c cVar = aVar2.f21286h;
                    v32.c reactionType = iVar3.f56960a;
                    it = it2;
                    iVar2 = iVar3;
                    arrayList2 = arrayList3;
                    if (cVar == reactionType) {
                        Intrinsics.checkNotNullParameter(reactionType, "reactionType");
                        Intrinsics.checkNotNullParameter(targetRect, str3);
                        e eVar = fVar3.f56950f;
                        str = str3;
                        if (eVar != null && (fVar2 = fVar3.f56952h) != null) {
                            fVar2.d(eVar);
                        }
                        e eVar2 = fVar3.f56951g;
                        if (eVar2 != null && (fVar = fVar3.f56953i) != null) {
                            fVar.d(eVar2);
                        }
                        fVar3.f56947c.end();
                        Rect R0 = bs1.c.R0(fVar3);
                        z14 = z15;
                        animatorSet = animatorSet2;
                        float max = Math.max((targetRect.width() * targetRect.height()) / (R0.width() * R0.height()), 0.25f);
                        AnimatorSet animatorSet3 = new AnimatorSet();
                        animatorSet3.playTogether(ObjectAnimator.ofFloat(fVar3, str4, 1.0f), ObjectAnimator.ofFloat(fVar3, "scaleX", max), ObjectAnimator.ofFloat(fVar3, "scaleY", max), ObjectAnimator.ofFloat(fVar3, "rotationX", 0.0f), ObjectAnimator.ofFloat(fVar3, "rotationY", 0.0f), ObjectAnimator.ofFloat(fVar3, "translationX", fVar3.getTranslationX() + (targetRect.exactCenterX() - R0.exactCenterX())), ObjectAnimator.ofFloat(fVar3, "translationY", fVar3.getTranslationY() + (targetRect.exactCenterY() - R0.exactCenterY())));
                        animatorSet3.addListener(new e21.c(fVar3, aVar, reactionType));
                        arrayList4.add(animatorSet3);
                        str2 = str4;
                    } else {
                        z14 = z15;
                        str = str3;
                        animatorSet = animatorSet2;
                        fVar3.f56947c.cancel();
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        str2 = str4;
                        animatorSet4.playTogether(ObjectAnimator.ofFloat(fVar3, str2, 0.0f), ObjectAnimator.ofFloat(fVar3, "scaleX", 0.33333334f), ObjectAnimator.ofFloat(fVar3, "scaleY", 0.33333334f), ObjectAnimator.ofFloat(fVar3, "rotationX", 0.0f), ObjectAnimator.ofFloat(fVar3, "rotationY", 0.0f), ObjectAnimator.ofFloat(fVar3, "translationY", fVar3.f56946b), fVar3.a());
                        arrayList4.add(animatorSet4);
                    }
                } else {
                    it = it2;
                    iVar2 = iVar3;
                    z14 = z15;
                    arrayList2 = arrayList3;
                    str = str3;
                    animatorSet = animatorSet2;
                    str2 = str4;
                }
                reactionsContextMenuView = this;
                str4 = str2;
                it2 = it;
                iVar3 = iVar2;
                arrayList3 = arrayList2;
                str3 = str;
                z15 = z14;
                animatorSet2 = animatorSet;
            }
            iVar = iVar3;
            z13 = z15;
            ArrayList arrayList5 = arrayList3;
            AnimatorSet animatorSet5 = animatorSet2;
            float[] fArr = {reactionsContextMenuView.f47307m + reactionsContextMenuView.f47312r};
            AppCompatImageView appCompatImageView = reactionsContextMenuView.f47316v;
            arrayList4.add(ObjectAnimator.ofFloat(appCompatImageView, "y", fArr));
            arrayList4.add(ObjectAnimator.ofFloat(appCompatImageView, str4, 0.0f));
            animatorSet5.playTogether(arrayList4);
            if (!z13) {
                animatorSet5.addListener(new qp0.e(reactionsContextMenuView, 4));
            }
            arrayList = arrayList5;
            arrayList.add(animatorSet5);
        } else {
            iVar = iVar3;
            z13 = z15;
            arrayList = arrayList3;
        }
        if (z13) {
            reactionsContextMenuView.f47309o = null;
            v32.c reaction = iVar.f56960a;
            a21.c cVar2 = reactionsContextMenuView.f47301g;
            if (cVar2 == null) {
                Intrinsics.r("commonReactionContextMenuLogicHandler");
                throw null;
            }
            String str5 = reactionsContextMenuView.f47300f;
            if (str5 == null) {
                Intrinsics.r("uid");
                throw null;
            }
            Intrinsics.checkNotNullParameter(reaction, "reaction");
            if (cVar2.f472e) {
                cVar2.f471d.d(new c0(reaction, true, str5));
            }
            AnimatorSet a13 = reactionsContextMenuView.a(reaction);
            a13.addListener(new t(reactionsContextMenuView, reaction, 0));
            arrayList.add(a13);
        }
        AnimatorSet animatorSet6 = new AnimatorSet();
        animatorSet6.playSequentially(arrayList);
        animatorSet6.start();
        reactionsContextMenuView.f47313s = animatorSet6;
    }

    public final void c() {
        v32.c latestReactionType = this.f47298d;
        if (latestReactionType == v32.c.NONE) {
            return;
        }
        a21.c cVar = this.f47301g;
        if (cVar == null) {
            Intrinsics.r("commonReactionContextMenuLogicHandler");
            throw null;
        }
        String uid = this.f47300f;
        if (uid == null) {
            Intrinsics.r("uid");
            throw null;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f47297c;
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(latestReactionType, "latestReactionType");
        f1 f1Var = f1.HOVER;
        u0 u0Var = u0.PIN_REACTION_BUTTON;
        HashMap hashMap = new HashMap();
        hashMap.put("reaction_type", String.valueOf(latestReactionType.getValue()));
        hashMap.put("duration", String.valueOf(currentTimeMillis));
        Unit unit = Unit.f80348a;
        cVar.f469b.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : uid, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f47295a == null) {
            this.f47295a = new o(this);
        }
        return this.f47295a;
    }

    public final void d(String uid, a21.c commonReactionContextMenuLogicHandler, View view, Rect anchorRect, v32.c cVar) {
        char c13;
        char c14 = 2;
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(commonReactionContextMenuLogicHandler, "commonReactionContextMenuLogicHandler");
        Intrinsics.checkNotNullParameter(anchorRect, "anchorRect");
        xj2.c cVar2 = this.f47299e;
        if (cVar2 != null && !cVar2.isDisposed()) {
            cVar2.dispose();
        }
        setVisibility(0);
        this.f47300f = uid;
        this.f47301g = commonReactionContextMenuLogicHandler;
        if (view instanceof ReactionIconButton) {
            this.f47302h = new WeakReference(view);
        }
        this.f47303i = anchorRect;
        this.f47313s.cancel();
        Rect rect = this.f47303i;
        float exactCenterX = rect != null ? rect.exactCenterX() : 0.0f;
        Rect rect2 = this.f47303i;
        float exactCenterY = rect2 != null ? rect2.exactCenterY() : 0.0f;
        float height = (this.f47303i != null ? r4.height() : 0) / 2.0f;
        float f13 = (exactCenterY - height) - this.f47311q;
        float f14 = exactCenterY + height;
        i iVar = this.f47317w;
        boolean z13 = f13 > (-iVar.f56971l) - ((float) hf0.b.f69007g);
        int i13 = this.f47310p;
        float min = Math.min(Math.max(exactCenterX - (i13 / 2), 0.0f), bs1.c.Q0(this).right - i13) + getResources().getDimensionPixelOffset(r0.margin);
        if (!z13) {
            f13 = f14;
        }
        this.f47307m = f13 - bs1.c.Q0(this).top;
        AppCompatImageView appCompatImageView = this.f47316v;
        appCompatImageView.setAlpha(0.0f);
        appCompatImageView.setX(min);
        float f15 = this.f47307m;
        float f16 = this.f47312r;
        appCompatImageView.setY(f15 + f16);
        iVar.setX(min + iVar.getPaddingStart());
        iVar.setY(this.f47307m);
        iVar.f56962c = null;
        iVar.f56960a = v32.c.NONE;
        this.f47318x.setAlpha(0.0f);
        this.f47308n = z13;
        int i14 = cVar == null ? -1 : s.f56987a[cVar.ordinal()];
        float f17 = 1.0f;
        if (i14 != -1) {
            if (i14 != 1) {
                AnimatorSet a13 = a(cVar);
                a13.setStartDelay(300L);
                a13.addListener(new t(this, cVar, 2));
                a13.start();
                this.f47313s = a13;
                return;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(ValueAnimator.ofFloat(0.0f, 1.0f));
            animatorSet.addListener(new t(this, cVar, 1));
            animatorSet.start();
            this.f47313s = animatorSet;
            setVisibility(8);
            return;
        }
        this.f47314t = true;
        Intrinsics.checkNotNullExpressionValue(getContext(), "getContext(...)");
        this.f47315u = !gh0.b.f0(r5);
        AnimatorSet animatorSet2 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        int i15 = 0;
        for (Object obj : b.f21287a) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                f0.p();
                throw null;
            }
            e21.f fVar = (e21.f) iVar.findViewWithTag((a) obj);
            if (fVar != null) {
                fVar.b(f16);
                AnimatorSet animatorSet3 = new AnimatorSet();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fVar, "alpha", f17);
                int i17 = i15;
                ofFloat.setDuration(100L);
                Unit unit = Unit.f80348a;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fVar, "translationY", 0.0f);
                ofFloat2.setInterpolator(new OvershootInterpolator());
                c13 = 2;
                animatorSet3.playTogether(ofFloat, ofFloat2);
                animatorSet3.setStartDelay(i17 * 50);
                arrayList.add(animatorSet3);
            } else {
                c13 = c14;
            }
            c14 = c13;
            i15 = i16;
            f17 = 1.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(appCompatImageView, "y", this.f47307m));
        arrayList.add(ObjectAnimator.ofFloat(appCompatImageView, "alpha", 1.0f));
        animatorSet2.playTogether(arrayList);
        animatorSet2.start();
        this.f47313s = animatorSet2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent ev2) {
        float f13;
        String str;
        String str2;
        String str3;
        String str4;
        int i13;
        GestaltText gestaltText;
        float f14;
        String str5;
        String str6;
        String str7;
        ArrayList arrayList;
        String str8;
        Iterator it;
        String str9;
        String str10;
        float f15;
        Iterator it2;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        Intrinsics.checkNotNullParameter(ev2, "ev");
        if (!this.f47314t) {
            return false;
        }
        if (ev2.getAction() == 1) {
            c();
            b();
        } else if (!this.f47313s.isRunning() && (ev2.getAction() == 2 || ev2.getAction() == 0)) {
            int x13 = (int) ev2.getX();
            int y13 = (int) ev2.getY();
            i iVar = this.f47317w;
            Rect rect = iVar.f56962c;
            ArrayList arrayList2 = iVar.f56963d;
            if (rect == null) {
                rect = bs1.c.Q0(iVar);
                int width = rect.width() / arrayList2.size();
                Iterator it3 = arrayList2.iterator();
                int i14 = 0;
                while (it3.hasNext()) {
                    Object next = it3.next();
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        f0.p();
                        throw null;
                    }
                    Rect rect2 = (Rect) next;
                    if (com.bumptech.glide.c.w0(iVar)) {
                        int i16 = rect.right - (i14 * width);
                        rect2.set(new Rect(i16 - width, rect.top, i16, rect.bottom));
                    } else {
                        int i17 = (i14 * width) + rect.left;
                        rect2.set(new Rect(i17, rect.top, i17 + width, rect.bottom));
                    }
                    i14 = i15;
                }
                iVar.f56962c = rect;
            }
            boolean contains = rect.contains(x13, y13);
            float f16 = iVar.f56972m;
            String str16 = "rotationY";
            String str17 = "rotationX";
            GestaltText gestaltText2 = iVar.f56974o;
            String str18 = "scaleY";
            String str19 = "scaleX";
            String str20 = "translationY";
            if (contains || iVar.f56961b == contains) {
                f13 = f16;
                str = "rotationY";
                str2 = "rotationX";
                str3 = "translationY";
                str4 = "alpha";
            } else {
                AnimatorSet animatorSet = iVar.f56973n;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                str4 = "alpha";
                f13 = f16;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(gestaltText2, "alpha", 0.0f), ObjectAnimator.ofFloat(gestaltText2, "translationY", f16));
                animatorSet2.start();
                iVar.f56973n = animatorSet2;
                Iterator it4 = b.f21287a.iterator();
                while (it4.hasNext()) {
                    e21.f fVar = (e21.f) iVar.findViewWithTag((a) it4.next());
                    if (fVar == null || !(fVar.f56948d || fVar.f56949e)) {
                        it2 = it4;
                        str11 = str16;
                        str12 = str17;
                        str13 = str20;
                        str14 = str18;
                        str15 = str19;
                    } else {
                        fVar.f56947c.cancel();
                        fVar.f56948d = false;
                        fVar.f56949e = false;
                        AnimatorSet animatorSet3 = new AnimatorSet();
                        it2 = it4;
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fVar, str19, 0.33333334f);
                        str15 = str19;
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fVar, str18, 0.33333334f);
                        str14 = str18;
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(fVar, str17, 0.0f);
                        str12 = str17;
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(fVar, str16, 0.0f);
                        str11 = str16;
                        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(fVar, str20, 0.0f);
                        ofFloat5.setDuration(150L);
                        Unit unit = Unit.f80348a;
                        str13 = str20;
                        animatorSet3.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, fVar.a());
                        animatorSet3.start();
                        fVar.f56947c = animatorSet3;
                    }
                    it4 = it2;
                    str19 = str15;
                    str18 = str14;
                    str17 = str12;
                    str16 = str11;
                    str20 = str13;
                }
                str = str16;
                str2 = str17;
                str3 = str20;
            }
            String str21 = str18;
            String str22 = str19;
            iVar.f56961b = contains;
            v32.c cVar = iVar.f56960a;
            iVar.f56960a = v32.c.NONE;
            if (contains) {
                Iterator it5 = b.f21287a.iterator();
                int i18 = 0;
                while (it5.hasNext()) {
                    Object next2 = it5.next();
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        f0.p();
                        throw null;
                    }
                    a aVar = (a) next2;
                    e21.f fVar2 = (e21.f) iVar.findViewWithTag(aVar);
                    if (fVar2 != null) {
                        Object obj = arrayList2.get(i18);
                        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                        Rect rect3 = (Rect) obj;
                        if (rect3.contains(x13, y13)) {
                            v32.c cVar2 = aVar.f21286h;
                            iVar.f56960a = cVar2;
                            if (cVar != cVar2) {
                                Object obj2 = iVar.f56964e.get(i18);
                                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                                int intValue = ((Number) obj2).intValue();
                                boolean z13 = cVar == v32.c.NONE;
                                gestaltText2.i(new h(aVar, 1));
                                if (z13) {
                                    gestaltText2.setX(((fVar2.getWidth() / 2.0f) + fVar2.getX()) - (intValue / 2.0f));
                                    f15 = f13;
                                    gestaltText2.setTranslationY(f15);
                                } else {
                                    f15 = f13;
                                }
                                float width2 = ((fVar2.getWidth() / 2.0f) + fVar2.getX()) - (intValue / 2.0f);
                                AnimatorSet animatorSet4 = iVar.f56973n;
                                if (animatorSet4 != null) {
                                    animatorSet4.cancel();
                                }
                                AnimatorSet animatorSet5 = new AnimatorSet();
                                str10 = str4;
                                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(gestaltText2, str10, 1.0f);
                                it = it5;
                                f14 = f15;
                                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(gestaltText2, "x", width2);
                                ofFloat7.setInterpolator(new OvershootInterpolator());
                                Unit unit2 = Unit.f80348a;
                                str7 = str3;
                                i13 = i19;
                                animatorSet5.playTogether(ofFloat6, ofFloat7, ObjectAnimator.ofFloat(gestaltText2, str7, iVar.f56971l));
                                animatorSet5.start();
                                iVar.f56973n = animatorSet5;
                                iVar.performHapticFeedback(3);
                                fVar2.sendAccessibilityEvent(32768);
                            } else {
                                i13 = i19;
                                str10 = str4;
                                f14 = f13;
                                str7 = str3;
                                it = it5;
                            }
                            if (fVar2.f56948d) {
                                gestaltText = gestaltText2;
                                str9 = str22;
                                str6 = str21;
                                arrayList = arrayList2;
                                str8 = str10;
                            } else {
                                fVar2.f56947c.cancel();
                                fVar2.f56948d = true;
                                fVar2.f56949e = false;
                                AnimatorSet animatorSet6 = new AnimatorSet();
                                str9 = str22;
                                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(fVar2, str9, 1.0f);
                                gestaltText = gestaltText2;
                                str6 = str21;
                                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(fVar2, str6, 1.0f);
                                arrayList = arrayList2;
                                str8 = str10;
                                ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(fVar2, str7, fVar2.f56945a);
                                ofFloat10.setDuration(150L);
                                Unit unit3 = Unit.f80348a;
                                animatorSet6.playTogether(ofFloat8, ofFloat9, ofFloat10);
                                animatorSet6.setInterpolator(new OvershootInterpolator());
                                animatorSet6.start();
                                fVar2.f56947c = animatorSet6;
                            }
                            int centerX = rect3.centerX();
                            int centerY = rect3.centerY();
                            float width3 = rect3.width() / 2.0f;
                            float height = rect3.height() / 2.0f;
                            AppCompatImageView appCompatImageView = fVar2.f56954j;
                            AppCompatImageView appCompatImageView2 = fVar2.f56956l;
                            AppCompatImageView appCompatImageView3 = fVar2.f56955k;
                            if (x13 < centerX) {
                                float f17 = (centerX - x13) / width3;
                                appCompatImageView.setRotationY((-15) * f17);
                                float f18 = (-30) * f17;
                                appCompatImageView3.setRotationY(f18);
                                float f19 = (-f17) * width3 * 0.2f;
                                appCompatImageView3.setTranslationX(f19);
                                appCompatImageView2.setRotationY(f18);
                                appCompatImageView2.setTranslationX(f19);
                            } else if (x13 > centerX) {
                                float f23 = (x13 - centerX) / width3;
                                appCompatImageView.setRotationY(15 * f23);
                                float f24 = 30 * f23;
                                appCompatImageView3.setRotationY(f24);
                                float f25 = f23 * width3 * 0.2f;
                                appCompatImageView3.setTranslationX(f25);
                                appCompatImageView2.setRotationY(f24);
                                appCompatImageView2.setTranslationX(f25);
                            }
                            if (y13 < centerY) {
                                float f26 = (centerY - y13) / height;
                                appCompatImageView.setRotationX(15 * f26);
                                float f27 = 20 * f26;
                                appCompatImageView3.setRotationX(f27);
                                float f28 = (-f26) * height * 0.1f;
                                appCompatImageView3.setTranslationY(f28);
                                appCompatImageView2.setRotationX(f27);
                                appCompatImageView2.setTranslationY(f28);
                            } else if (y13 > centerY) {
                                float f29 = (y13 - centerY) / height;
                                appCompatImageView.setRotationX((-15) * f29);
                                float f33 = (-20) * f29;
                                appCompatImageView3.setRotationX(f33);
                                float f34 = f29 * height * 0.1f;
                                appCompatImageView3.setTranslationY(f34);
                                appCompatImageView2.setRotationX(f33);
                                appCompatImageView2.setTranslationY(f34);
                            }
                        } else {
                            i13 = i19;
                            gestaltText = gestaltText2;
                            f14 = f13;
                            str9 = str22;
                            str6 = str21;
                            str7 = str3;
                            arrayList = arrayList2;
                            str8 = str4;
                            it = it5;
                            if (!fVar2.f56949e) {
                                fVar2.f56947c.cancel();
                                fVar2.f56948d = false;
                                fVar2.f56949e = true;
                                AnimatorSet animatorSet7 = new AnimatorSet();
                                ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(fVar2, str9, 0.33333334f);
                                ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(fVar2, str6, 0.33333334f);
                                ObjectAnimator ofFloat13 = ObjectAnimator.ofFloat(fVar2, str2, 0.0f);
                                ObjectAnimator ofFloat14 = ObjectAnimator.ofFloat(fVar2, str, 0.0f);
                                ObjectAnimator ofFloat15 = ObjectAnimator.ofFloat(fVar2, str7, 0.0f);
                                str5 = str9;
                                ofFloat15.setDuration(150L);
                                Unit unit4 = Unit.f80348a;
                                animatorSet7.playTogether(ofFloat11, ofFloat12, ofFloat13, ofFloat14, ofFloat15, fVar2.a());
                                animatorSet7.start();
                                fVar2.f56947c = animatorSet7;
                            }
                        }
                        str5 = str9;
                    } else {
                        i13 = i19;
                        gestaltText = gestaltText2;
                        f14 = f13;
                        str5 = str22;
                        str6 = str21;
                        str7 = str3;
                        arrayList = arrayList2;
                        str8 = str4;
                        it = it5;
                    }
                    str3 = str7;
                    it5 = it;
                    gestaltText2 = gestaltText;
                    arrayList2 = arrayList;
                    str4 = str8;
                    f13 = f14;
                    i18 = i13;
                    str21 = str6;
                    str22 = str5;
                }
            }
            v32.c cVar3 = iVar.f56960a;
            if (cVar != cVar3) {
                if (this.f47298d != cVar3) {
                    c();
                }
                if (cVar3 != v32.c.NONE) {
                    this.f47297c = System.currentTimeMillis();
                }
                this.f47298d = cVar3;
            }
            return true;
        }
        return true;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f47295a == null) {
            this.f47295a = new o(this);
        }
        return this.f47295a.generatedComponent();
    }

    @Override // android.view.View
    public final boolean isShown() {
        return this.f47314t;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        b();
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f47314t;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i13) {
        if (i13 == 8) {
            b();
        }
        super.onWindowVisibilityChanged(i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactionsContextMenuView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f47296b) {
            this.f47296b = true;
            ((u) generatedComponent()).getClass();
        }
        this.f47298d = v32.c.NONE;
        List<a> list = b.f21287a;
        this.f47304j = new ArrayList(list.size());
        this.f47310p = getResources().getDimensionPixelOffset(r0.pin_reaction_context_menu_width);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(r0.pin_reaction_context_menu_height);
        this.f47311q = dimensionPixelOffset;
        this.f47312r = dimensionPixelOffset;
        this.f47313s = new AnimatorSet();
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext(), null);
        Context context2 = appCompatImageView.getContext();
        int i14 = cz1.b.background_lego_bottom_nav;
        Object obj = d5.a.f53679a;
        appCompatImageView.setBackground(context2.getDrawable(i14));
        this.f47316v = appCompatImageView;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        i iVar = new i(context3);
        int dimensionPixelOffset2 = iVar.getResources().getDimensionPixelOffset(r0.margin);
        iVar.setPadding(dimensionPixelOffset2, dimensionPixelOffset2, dimensionPixelOffset2, dimensionPixelOffset2);
        this.f47317w = iVar;
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        GestaltText gestaltText = new GestaltText(6, context4, (AttributeSet) null);
        Drawable drawable = gestaltText.getContext().getDrawable(d.pin_reactions_text_background);
        if (drawable != null) {
            gestaltText.setBackground(drawable);
        }
        gestaltText.setAlpha(0.0f);
        gestaltText.setMaxLines(1);
        gestaltText.setSingleLine(true);
        dl2.b.A2(gestaltText);
        dl2.b.y2(gestaltText);
        int dimensionPixelSize = gestaltText.getResources().getDimensionPixelSize(r0.margin_quarter);
        gestaltText.setPaddingRelative(gestaltText.getPaddingStart(), dimensionPixelSize, gestaltText.getPaddingEnd(), dimensionPixelSize);
        int dimensionPixelSize2 = gestaltText.getResources().getDimensionPixelSize(r0.margin_half);
        gestaltText.setPaddingRelative(dimensionPixelSize2, gestaltText.getPaddingTop(), dimensionPixelSize2, gestaltText.getPaddingBottom());
        this.f47318x = gestaltText;
        setClipChildren(false);
        setClipToPadding(false);
        addView(gestaltText, -2, -2);
        for (a aVar : list) {
            GestaltText gestaltText2 = this.f47318x;
            gestaltText2.i(new h(aVar, 2));
            gestaltText2.measure(0, 0);
            this.f47304j.add(Integer.valueOf(gestaltText2.getMeasuredWidth()));
        }
        int measuredHeight = this.f47318x.getMeasuredHeight();
        this.f47305k = measuredHeight;
        this.f47306l = measuredHeight / 4.0f;
        AppCompatImageView appCompatImageView2 = this.f47316v;
        float dimensionPixelSize3 = getResources().getDimensionPixelSize(eo1.c.bottom_nav_elevation);
        WeakHashMap weakHashMap = v0.f102521a;
        m0.l(appCompatImageView2, dimensionPixelSize3);
        View view = this.f47316v;
        view.setAlpha(0.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f47310p, this.f47311q);
        layoutParams.gravity = 1;
        Unit unit = Unit.f80348a;
        addView(view, layoutParams);
        m0.q(this.f47317w, m0.h(this.f47316v) + 1);
        addView(this.f47317w);
    }
}
