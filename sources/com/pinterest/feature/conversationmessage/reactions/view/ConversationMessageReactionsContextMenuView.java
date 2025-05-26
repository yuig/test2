package com.pinterest.feature.conversationmessage.reactions.view;

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
import eo1.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import org.jetbrains.annotations.NotNull;
import q5.m0;
import q5.v0;
import qq0.a;
import yc0.b;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/conversationmessage/reactions/view/ConversationMessageReactionsContextMenuView;", "", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "conversationLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ConversationMessageReactionsContextMenuView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public String f45632a;

    /* renamed from: b, reason: collision with root package name */
    public String f45633b;

    /* renamed from: c, reason: collision with root package name */
    public final AnimatorSet f45634c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f45635d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f45636e;

    /* renamed from: f, reason: collision with root package name */
    public final a f45637f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationMessageReactionsContextMenuView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f45634c = new AnimatorSet();
        View appCompatImageView = new AppCompatImageView(getContext(), null);
        Context context2 = appCompatImageView.getContext();
        int i13 = b.background_lego_bottom_nav;
        Object obj = d5.a.f53679a;
        appCompatImageView.setBackground(context2.getDrawable(i13));
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        a aVar = new a(context3);
        int dimensionPixelOffset = aVar.getResources().getDimensionPixelOffset(r0.margin);
        aVar.setPadding(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
        this.f45637f = aVar;
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(yc0.a.message_reaction_context_menu_width);
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(yc0.a.message_reaction_context_menu_height);
        setClipChildren(false);
        setClipToPadding(false);
        float dimensionPixelSize = getResources().getDimensionPixelSize(c.bottom_nav_elevation);
        WeakHashMap weakHashMap = v0.f102521a;
        m0.l(appCompatImageView, dimensionPixelSize);
        appCompatImageView.setAlpha(0.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelOffset2, dimensionPixelOffset3);
        layoutParams.gravity = 1;
        Unit unit = Unit.f80348a;
        addView(appCompatImageView, layoutParams);
        m0.q(aVar, m0.h(appCompatImageView) + 1);
        addView(aVar);
    }

    public final void a() {
        boolean z13 = this.f45637f.f104861a != null;
        if (this.f45636e && !z13) {
            this.f45636e = false;
            return;
        }
        this.f45635d = false;
        this.f45634c.cancel();
        new AnimatorSet();
        Intrinsics.r("buttonRect");
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        if (!this.f45635d) {
            return false;
        }
        if (ev2.getAction() == 1) {
            a();
        } else if (!this.f45634c.isRunning() && (ev2.getAction() == 2 || ev2.getAction() == 0)) {
            int x13 = (int) ev2.getX();
            int y13 = (int) ev2.getY();
            a aVar = this.f45637f;
            Rect rect = aVar.f104863c;
            ArrayList arrayList = aVar.f104864d;
            if (rect == null) {
                rect = bs1.c.Q0(aVar);
                int width = rect.width() / arrayList.size();
                Iterator it = arrayList.iterator();
                int i13 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        f0.p();
                        throw null;
                    }
                    Rect rect2 = (Rect) next;
                    if (com.bumptech.glide.c.w0(aVar)) {
                        int i15 = rect.right - (i13 * width);
                        rect2.set(new Rect(i15 - width, rect.top, i15, rect.bottom));
                    } else {
                        int i16 = (i13 * width) + rect.left;
                        rect2.set(new Rect(i16, rect.top, i16 + width, rect.bottom));
                    }
                    i13 = i14;
                }
                aVar.f104863c = rect;
            }
            boolean contains = rect.contains(x13, y13);
            float f13 = 0.0f;
            if (!contains && aVar.f104862b != contains) {
                Iterator it2 = oq0.b.f97215a.iterator();
                while (it2.hasNext()) {
                    qq0.b bVar = (qq0.b) aVar.findViewWithTag((oq0.a) it2.next());
                    if (bVar != null && (bVar.f104874d || bVar.f104875e)) {
                        bVar.f104873c.cancel();
                        bVar.f104874d = false;
                        bVar.f104875e = false;
                        AnimatorSet animatorSet = new AnimatorSet();
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(bVar, "translationY", f13);
                        ofFloat.setDuration(150L);
                        Unit unit = Unit.f80348a;
                        animatorSet.playTogether(ofFloat);
                        animatorSet.start();
                        bVar.f104873c = animatorSet;
                    }
                    f13 = 0.0f;
                }
            }
            aVar.f104862b = contains;
            String str = aVar.f104861a;
            aVar.f104861a = null;
            if (contains) {
                int i17 = 0;
                for (Object obj : oq0.b.f97215a) {
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        f0.p();
                        throw null;
                    }
                    oq0.a aVar2 = (oq0.a) obj;
                    qq0.b bVar2 = (qq0.b) aVar.findViewWithTag(aVar2);
                    if (bVar2 != null) {
                        Object obj2 = arrayList.get(i17);
                        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                        if (((Rect) obj2).contains(x13, y13)) {
                            String str2 = aVar2.f97214b;
                            aVar.f104861a = str2;
                            if (!Intrinsics.d(str, str2)) {
                                aVar.performHapticFeedback(3);
                                bVar2.sendAccessibilityEvent(32768);
                            }
                            if (!bVar2.f104874d) {
                                bVar2.f104873c.cancel();
                                bVar2.f104874d = true;
                                bVar2.f104875e = false;
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(bVar2, "translationY", bVar2.f104871a);
                                ofFloat2.setDuration(150L);
                                Unit unit2 = Unit.f80348a;
                                animatorSet2.playTogether(ofFloat2);
                                animatorSet2.setInterpolator(new OvershootInterpolator());
                                animatorSet2.start();
                                bVar2.f104873c = animatorSet2;
                            }
                        } else if (!bVar2.f104875e) {
                            bVar2.f104873c.cancel();
                            bVar2.f104874d = false;
                            bVar2.f104875e = true;
                            AnimatorSet animatorSet3 = new AnimatorSet();
                            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(bVar2, "translationY", 0.0f);
                            ofFloat3.setDuration(150L);
                            Unit unit3 = Unit.f80348a;
                            animatorSet3.playTogether(ofFloat3);
                            animatorSet3.start();
                            bVar2.f104873c = animatorSet3;
                            i17 = i18;
                        }
                    }
                    i17 = i18;
                }
            }
            if (!Intrinsics.d(str, aVar.f104861a)) {
                String str3 = aVar.f104861a;
                Intrinsics.d(this.f45633b, str3);
                this.f45633b = str3;
            }
            return true;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean isShown() {
        return this.f45635d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationMessageReactionsContextMenuView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f45634c = new AnimatorSet();
        View appCompatImageView = new AppCompatImageView(getContext(), null);
        Context context2 = appCompatImageView.getContext();
        int i14 = b.background_lego_bottom_nav;
        Object obj = d5.a.f53679a;
        appCompatImageView.setBackground(context2.getDrawable(i14));
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        a aVar = new a(context3);
        int dimensionPixelOffset = aVar.getResources().getDimensionPixelOffset(r0.margin);
        aVar.setPadding(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
        this.f45637f = aVar;
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(yc0.a.message_reaction_context_menu_width);
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(yc0.a.message_reaction_context_menu_height);
        setClipChildren(false);
        setClipToPadding(false);
        float dimensionPixelSize = getResources().getDimensionPixelSize(c.bottom_nav_elevation);
        WeakHashMap weakHashMap = v0.f102521a;
        m0.l(appCompatImageView, dimensionPixelSize);
        appCompatImageView.setAlpha(0.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelOffset2, dimensionPixelOffset3);
        layoutParams.gravity = 1;
        Unit unit = Unit.f80348a;
        addView(appCompatImageView, layoutParams);
        m0.q(aVar, m0.h(appCompatImageView) + 1);
        addView(aVar);
    }
}
