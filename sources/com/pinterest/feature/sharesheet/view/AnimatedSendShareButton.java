package com.pinterest.feature.sharesheet.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import b62.b;
import b62.c;
import i91.u;
import i91.z;
import j91.d;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lb0.q;
import lh0.a4;
import lh0.g1;
import lh0.w3;
import lh0.z3;
import org.jetbrains.annotations.NotNull;
import uq.w;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001\u000bB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/sharesheet/view/AnimatedSendShareButton;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "fd1/a", "sharesheetLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public class AnimatedSendShareButton extends w {

    /* renamed from: d, reason: collision with root package name */
    public q f48376d;

    /* renamed from: e, reason: collision with root package name */
    public w3 f48377e;

    /* renamed from: f, reason: collision with root package name */
    public z f48378f;

    /* renamed from: g, reason: collision with root package name */
    public View f48379g;

    /* renamed from: h, reason: collision with root package name */
    public d f48380h;

    /* renamed from: i, reason: collision with root package name */
    public View f48381i;

    /* renamed from: j, reason: collision with root package name */
    public final u f48382j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedSendShareButton(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 24);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f48382j = u.CLOSE_UP;
        L();
    }

    public void L() {
        View.inflate(getContext(), c.view_animated_sendshare_button, this);
        View findViewById = findViewById(b.share_button);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        Intrinsics.checkNotNullParameter(findViewById, "<set-?>");
        this.f48379g = findViewById;
        setClipChildren(false);
        X();
    }

    public final void T() {
        if (getVisibility() == 8) {
            return;
        }
        d dVar = this.f48380h;
        if (dVar != null) {
            ValueAnimator valueAnimator = dVar.f75115e;
            if (valueAnimator != null && valueAnimator.isStarted()) {
                return;
            }
            ValueAnimator valueAnimator2 = dVar.f75116f;
            if (valueAnimator2 != null && valueAnimator2.isStarted()) {
                return;
            }
        }
        q qVar = this.f48376d;
        if (qVar == null) {
            Intrinsics.r("prefsManagerPersisted");
            throw null;
        }
        long time = new Date().getTime() - qVar.a("PREF_SHARE_ICON_LAST_ANIMATED_AT", 0L);
        if (time > 500 && time < 900000) {
            return;
        }
        w3 w3Var = this.f48377e;
        if (w3Var == null) {
            Intrinsics.r("experiments");
            throw null;
        }
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) w3Var.f83501a;
        if (g1Var.o("sg_android_remove_closeup_share_icon_animation", "enabled", z3Var) || g1Var.l("sg_android_remove_closeup_share_icon_animation")) {
            return;
        }
        setVisibility(0);
        removeView(this.f48380h);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        View view = this.f48381i;
        z zVar = this.f48378f;
        if (zVar == null) {
            Intrinsics.r("preferredSharingAppTracker");
            throw null;
        }
        d dVar2 = new d(context, this.f48382j, view, zVar.f71924c);
        this.f48380h = dVar2;
        View view2 = this.f48379g;
        if (view2 == null) {
            Intrinsics.r("sendIconButton");
            throw null;
        }
        addView(dVar2, indexOfChild(view2) + 1);
        q qVar2 = this.f48376d;
        if (qVar2 != null) {
            qVar2.c("PREF_SHARE_ICON_LAST_ANIMATED_AT", new Date().getTime());
        } else {
            Intrinsics.r("prefsManagerPersisted");
            throw null;
        }
    }

    public final void X() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int preferredSize = this.f48382j.getPreferredSize(context);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = preferredSize;
            layoutParams.height = preferredSize;
        } else {
            layoutParams = new ConstraintLayout.LayoutParams(getWidth(), getHeight());
        }
        setLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeView(this.f48380h);
        super.onDetachedFromWindow();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedSendShareButton(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13, 24, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f48382j = u.CLOSE_UP;
        L();
    }
}
