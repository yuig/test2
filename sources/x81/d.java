package x81;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final int f134179a;

    /* renamed from: b, reason: collision with root package name */
    public final int f134180b;

    /* renamed from: c, reason: collision with root package name */
    public final f42.c[] f134181c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f134182d;

    /* renamed from: e, reason: collision with root package name */
    public final LinearLayout f134183e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltIconButton f134184f;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltIconButton f134185g;

    /* renamed from: h, reason: collision with root package name */
    public ObjectAnimator f134186h;

    /* renamed from: i, reason: collision with root package name */
    public ObjectAnimator f134187i;

    /* renamed from: j, reason: collision with root package name */
    public final xk2.v f134188j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, final e eVar) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f134179a = dl2.b.F0(context, om1.e.MD.getBackgroundSize());
        this.f134180b = getResources().getDimensionPixelSize(uc2.b.try_on_makeup_switcher_container_height);
        this.f134181c = new f42.c[]{f42.c.LIPCOLOR, f42.c.EYESHADOW};
        ImageView imageView = new ImageView(context);
        int i13 = uc2.c.ic_makeup_switcher_selector_nonpds;
        Object obj = d5.a.f53679a;
        imageView.setImageDrawable(context.getDrawable(i13));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388627;
        imageView.setLayoutParams(layoutParams);
        this.f134182d = imageView;
        LinearLayout linearLayout = new LinearLayout(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 17;
        linearLayout.setWeightSum(2.0f);
        linearLayout.setLayoutParams(layoutParams2);
        addView(linearLayout);
        this.f134183e = linearLayout;
        GestaltIconButton gestaltIconButton = new GestaltIconButton(6, context, (AttributeSet) null);
        gestaltIconButton.t(new x61.i(gestaltIconButton, 2));
        final int i14 = 0;
        gestaltIconButton.u(new gm1.a() { // from class: x81.b
            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i15 = i14;
                e eVar2 = eVar;
                switch (i15) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((it instanceof om1.l) && eVar2 != null) {
                            ((o0) eVar2).L3(f42.c.LIPCOLOR);
                            break;
                        }
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((it instanceof om1.l) && eVar2 != null) {
                            ((o0) eVar2).L3(f42.c.EYESHADOW);
                            break;
                        }
                        break;
                }
            }
        });
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 16;
        layoutParams3.weight = 1.0f;
        gestaltIconButton.setLayoutParams(layoutParams3);
        linearLayout.addView(gestaltIconButton);
        this.f134184f = gestaltIconButton;
        GestaltIconButton gestaltIconButton2 = new GestaltIconButton(6, context, (AttributeSet) null);
        final int i15 = 1;
        gestaltIconButton2.t(new x61.i(gestaltIconButton2, i15));
        gestaltIconButton2.u(new gm1.a() { // from class: x81.b
            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i152 = i15;
                e eVar2 = eVar;
                switch (i152) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((it instanceof om1.l) && eVar2 != null) {
                            ((o0) eVar2).L3(f42.c.LIPCOLOR);
                            break;
                        }
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((it instanceof om1.l) && eVar2 != null) {
                            ((o0) eVar2).L3(f42.c.EYESHADOW);
                            break;
                        }
                        break;
                }
            }
        });
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 16;
        layoutParams4.weight = 1.0f;
        gestaltIconButton2.setLayoutParams(layoutParams4);
        linearLayout.addView(gestaltIconButton2);
        this.f134185g = gestaltIconButton2;
        this.f134188j = xk2.m.b(new h81.b(this, i15));
    }

    public final void a(f42.c makeupCategory, boolean z13) {
        float b13;
        Intrinsics.checkNotNullParameter(makeupCategory, "makeupCategory");
        View view = this.f134182d;
        if (view.getParent() != null) {
            return;
        }
        if (z13) {
            int i13 = c.f134169a[makeupCategory.ordinal()];
            LinearLayout linearLayout = this.f134183e;
            View view2 = this.f134184f;
            if (i13 == 1) {
                linearLayout.removeView(this.f134185g);
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                }
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.setMarginEnd(0);
                view2.setLayoutParams(layoutParams2);
            } else if (i13 == 2) {
                linearLayout.removeView(view2);
            }
            ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
            layoutParams4.gravity = 17;
            view.setLayoutParams(layoutParams4);
        } else {
            if (kotlin.collections.c0.K(this.f134181c, makeupCategory) > 0) {
                b13 = b() + ((getWidth() / 2) * r5);
            } else {
                b13 = b();
            }
            view.setTranslationX(b13);
        }
        addView(view);
    }

    public final float b() {
        return ((Number) this.f134188j.getValue()).floatValue();
    }

    public final void c() {
        Unit unit;
        ObjectAnimator objectAnimator = this.f134187i;
        if (objectAnimator != null) {
            objectAnimator.end();
        }
        ObjectAnimator objectAnimator2 = this.f134186h;
        if (objectAnimator2 != null) {
            objectAnimator2.start();
            unit = Unit.f80348a;
        } else {
            unit = null;
        }
        if (unit == null) {
            ObjectAnimator H = kg.a.H(b(), b() + this.f134185g.getLeft(), 250L, this.f134182d);
            H.start();
            this.f134186h = H;
        }
    }

    public final void d() {
        Unit unit;
        ObjectAnimator objectAnimator = this.f134186h;
        if (objectAnimator != null) {
            objectAnimator.end();
        }
        ObjectAnimator objectAnimator2 = this.f134187i;
        if (objectAnimator2 != null) {
            objectAnimator2.start();
            unit = Unit.f80348a;
        } else {
            unit = null;
        }
        if (unit == null) {
            ObjectAnimator H = kg.a.H(b() + this.f134185g.getLeft(), b(), 250L, this.f134182d);
            H.start();
            this.f134187i = H;
        }
    }
}
