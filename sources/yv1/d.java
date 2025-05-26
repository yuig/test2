package yv1;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c2.m4;
import com.pinterest.gestalt.searchGuide.GestaltSearchGuide;
import dl1.i0;
import en1.a0;
import en1.b0;
import en1.k0;
import fk1.u;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nx.v;
import qf1.f0;
import rm1.q;
import rq.o2;
import vv1.n;
import ye2.o;
import yq1.u1;

/* loaded from: classes4.dex */
public final class d extends FrameLayout implements vv1.i, v, af2.c {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f140223f = 0;

    /* renamed from: a, reason: collision with root package name */
    public o f140224a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f140225b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltSearchGuide f140226c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f140227d;

    /* renamed from: e, reason: collision with root package name */
    public xv1.l f140228e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f140225b) {
            this.f140225b = true;
            ((e) generatedComponent()).getClass();
        }
        GestaltSearchGuide gestaltSearchGuide = new GestaltSearchGuide(6, context, (AttributeSet) null);
        gh1.e eventHandler = new gh1.e(this, 19);
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        this.f140226c = gestaltSearchGuide;
        ImageView imageView = new ImageView(context);
        int dimensionPixelOffset = imageView.getResources().getDimensionPixelOffset(eo1.c.space_300);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelOffset, dimensionPixelOffset, 8388661));
        imageView.setImageResource(vc2.b.circle_badge);
        int i13 = eo1.b.color_themed_text_default;
        Object obj = d5.a.f53679a;
        imageView.setColorFilter(context.getColor(i13), PorterDuff.Mode.SRC_ATOP);
        imageView.setVisibility(8);
        this.f140227d = imageView;
        addView(gestaltSearchGuide);
        addView(imageView);
    }

    @Override // vv1.i
    public final void B2(boolean z13) {
    }

    @Override // vv1.i
    public final void D1(ArrayList avatarsUrlUidPairs) {
        Intrinsics.checkNotNullParameter(avatarsUrlUidPairs, "avatarsUrlUidPairs");
        this.f140226c.b(new u(avatarsUrlUidPairs, 8));
    }

    @Override // vv1.i
    public final void F(String str) {
        this.f140226c.b(new i0(str, 24));
    }

    @Override // vv1.i
    public final void F4(Integer num, Integer num2) {
    }

    @Override // vv1.i
    public final void G3(List backgroundColors, List textColors) {
        Intrinsics.checkNotNullParameter(backgroundColors, "backgroundColors");
        Intrinsics.checkNotNullParameter(textColors, "textColors");
        boolean z13 = !backgroundColors.isEmpty();
        GestaltSearchGuide gestaltSearchGuide = this.f140226c;
        if (z13) {
            gestaltSearchGuide.b(new fn1.k(backgroundColors, this, textColors, 6));
        } else {
            gestaltSearchGuide.b(c.f140220j);
        }
    }

    @Override // vv1.i
    public final void H6(boolean z13) {
        this.f140226c.b(new mm1.i(z13, 21));
    }

    @Override // vv1.i
    public final void J6(int[] iArr) {
        this.f140226c.b(new u1(iArr, 19));
    }

    @Override // vv1.i
    public final void K4(q42.c cVar) {
        String string = cVar == q42.c.FILTER ? getResources().getString(mz1.g.filter_button_label) : "";
        Intrinsics.f(string);
        i1(string);
    }

    @Override // vv1.i
    public final void Q4(a0 skinTone) {
        Intrinsics.checkNotNullParameter(skinTone, "skinTone");
        u1 init = new u1(skinTone, 21);
        GestaltSearchGuide gestaltSearchGuide = this.f140226c;
        Intrinsics.checkNotNullParameter(gestaltSearchGuide, "<this>");
        Intrinsics.checkNotNullParameter(init, "init");
        k0 k0Var = new k0((en1.d) ((u50.o) gestaltSearchGuide.f49545a.f33803a));
        init.invoke(k0Var);
        gestaltSearchGuide.b(new an1.i(k0Var, 6));
    }

    @Override // vv1.i
    public final void Z4(Integer num, Integer num2) {
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f140224a == null) {
            this.f140224a = new o(this);
        }
        return this.f140224a;
    }

    @Override // vv1.i
    public final void d1(q42.f fVar) {
        if (fVar != null) {
            this.f140226c.b(new b(fVar, 0));
        }
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f140224a == null) {
            this.f140224a = new o(this);
        }
        return this.f140224a.generatedComponent();
    }

    @Override // vv1.i
    public final void i1(String contentDescription) {
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        this.f140226c.b(new i0(contentDescription, 22));
    }

    @Override // vv1.i
    public final void l0(String displayText) {
        Intrinsics.checkNotNullParameter(displayText, "displayText");
        this.f140226c.b(new i0(displayText, 23));
    }

    @Override // vv1.i
    public final void l4() {
    }

    @Override // vv1.i
    public final void l5(xv1.l listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f140228e = listener;
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        xv1.l lVar = this.f140228e;
        if (lVar != null) {
            return lVar.s3();
        }
        return null;
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        h32.u1 t33;
        xv1.l lVar = this.f140228e;
        if (lVar == null || (t33 = lVar.t3()) == null) {
            return null;
        }
        return new n(t33, null);
    }

    @Override // vv1.i
    public final void n3(int i13, q42.c cVar, boolean z13, b0 b0Var) {
        q qVar;
        f0 f0Var = new f0(cVar, z13, 12);
        GestaltSearchGuide gestaltSearchGuide = this.f140226c;
        gestaltSearchGuide.b(f0Var);
        switch (cVar == null ? -1 : a.f140217a[cVar.ordinal()]) {
            case 1:
                qVar = q.FILTER;
                break;
            case 2:
                qVar = q.LIPS;
                break;
            case 3:
                qVar = q.ANGLED_PIN;
                break;
            case 4:
                qVar = q.SHOPPING_BAG;
                break;
            case 5:
                qVar = q.TAG;
                break;
            case 6:
                qVar = q.EYE;
                break;
            case 7:
                qVar = q.IMAGE_PORTRAIT;
                break;
            default:
                qVar = null;
                break;
        }
        if (qVar != null) {
            if (cVar != q42.c.DROPDOWN) {
                gestaltSearchGuide.b(new o2(qVar, 28));
            }
        } else if (b0Var != null) {
            gestaltSearchGuide.b(new u1(b0Var, 20));
        } else {
            if (i13 == 0 || cVar == q42.c.DROPDOWN) {
                return;
            }
            gestaltSearchGuide.b(new m4(this, i13, 29));
        }
    }

    @Override // vv1.i
    public final void n4(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.f140226c.b(new i0(tag, 25));
    }

    @Override // vv1.i
    public final void r6(boolean z13) {
        GestaltSearchGuide gestaltSearchGuide = this.f140226c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(gestaltSearchGuide, "scaleX", 1.0f, 0.95f, 1.05f, 1.0f);
        ofFloat.setDuration(600L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(gestaltSearchGuide, "scaleY", 1.0f, 0.95f, 1.05f, 1.0f);
        ofFloat2.setDuration(600L);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(gestaltSearchGuide, "rotation", 0.0f, 5.0f, 0.0f, -5.0f, 0.0f, 5.0f, 0.0f, -5.0f, 0.0f, 5.0f, 0.0f, -5.0f, 0.0f);
        ofFloat3.setDuration(2100L);
        if (z13) {
            ofFloat3.start();
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.play(ofFloat3).after(ofFloat);
        animatorSet.start();
    }

    @Override // vv1.i
    public final void s3(boolean z13, boolean z14) {
        this.f140226c.b(new mm1.i(z13, 20));
    }

    @Override // android.view.View, vv1.i
    public final void setEnabled(boolean z13) {
        GestaltSearchGuide gestaltSearchGuide = this.f140226c;
        gestaltSearchGuide.setEnabled(z13);
        gestaltSearchGuide.setAlpha(z13 ? 1.0f : 0.5f);
    }

    @Override // vv1.i
    public final void v2(int i13) {
        this.f140226c.b(new pn1.g(i13, 8));
    }

    @Override // vv1.i
    public final void y2(boolean z13) {
        bs1.c.R1(this.f140227d, z13);
    }
}
