package com.pinterest.following.view.lego;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import bi1.a0;
import ck2.i;
import com.pinterest.gestalt.button.view.GestaltButton;
import dl1.s;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nk1.f;
import nk1.h;
import org.jetbrains.annotations.NotNull;
import rh1.q1;
import rk1.c;
import rk1.d;
import rk1.e;
import xj2.b;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB#\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\f¨\u0006\r"}, d2 = {"Lcom/pinterest/following/view/lego/FollowButton;", "Ldl1/s;", "M", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "followingLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public abstract class FollowButton<M extends s> extends FrameLayout {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f49058h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final b f49059a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltButton f49060b;

    /* renamed from: c, reason: collision with root package name */
    public yl1.b f49061c;

    /* renamed from: d, reason: collision with root package name */
    public yl1.b f49062d;

    /* renamed from: e, reason: collision with root package name */
    public yl1.b f49063e;

    /* renamed from: f, reason: collision with root package name */
    public f f49064f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f49065g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FollowButton(Context context, rk1.f buttonSize) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(buttonSize, "buttonSize");
        this.f49059a = new b();
        rk1.f fVar = rk1.f.Small;
        this.f49061c = e.f108492c;
        this.f49062d = e.f108491b;
        this.f49063e = e.f108490a;
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.f49060b = a(fVar);
    }

    public final GestaltButton a(rk1.f fVar) {
        GestaltButton smallSecondaryButton;
        int i13 = c.f108484b[fVar.ordinal()];
        if (i13 == 1) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            smallSecondaryButton = new GestaltButton.SmallSecondaryButton(6, context, (AttributeSet) null);
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            smallSecondaryButton = new GestaltButton.LargeSecondaryButton(6, context2, (AttributeSet) null);
        }
        if (this.f49065g) {
            smallSecondaryButton.d(d.f108485j);
        }
        addView(smallSecondaryButton);
        return smallSecondaryButton;
    }

    public final void b(f fVar) {
        b bVar = this.f49059a;
        bVar.d();
        bVar.a(fVar.h().A(wj2.c.a()).F(new q1(20, new a0(this, 17)), new q1(21, d.f108486k), i.f27923c, i.f27924d));
    }

    public final void c(int i13, int i14) {
        this.f49061c = yl1.b.f(this.f49061c, bs1.c.j2(new String[0], i13), false, null, null, null, null, null, null, 0, null, 1022);
        this.f49062d = yl1.b.f(this.f49062d, bs1.c.j2(new String[0], i14), false, null, null, null, null, null, null, 0, null, 1022);
    }

    public final void d(h followState) {
        yl1.b state;
        Intrinsics.checkNotNullParameter(followState, "followState");
        int i13 = c.f108483a[followState.ordinal()];
        if (i13 == 1) {
            state = e.f108490a;
        } else if (i13 == 2) {
            state = this.f49061c;
        } else {
            if (i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            state = this.f49062d;
        }
        yl1.b bVar = e.f108490a;
        GestaltButton gestaltButton = this.f49060b;
        Intrinsics.checkNotNullParameter(gestaltButton, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        gestaltButton.d(new jw0.b(state, 1));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f fVar = this.f49064f;
        if (fVar != null) {
            b(fVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f49059a.d();
        super.onDetachedFromWindow();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FollowButton(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f49059a = new b();
        rk1.f fVar = rk1.f.Small;
        this.f49061c = e.f108492c;
        this.f49062d = e.f108491b;
        this.f49063e = e.f108490a;
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.f49060b = a(fVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FollowButton(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f49059a = new b();
        rk1.f fVar = rk1.f.Small;
        this.f49061c = e.f108492c;
        this.f49062d = e.f108491b;
        this.f49063e = e.f108490a;
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.f49060b = a(fVar);
    }
}
