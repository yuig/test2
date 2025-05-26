package androidx.media3.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.Iterator;
import net.quikkly.android.ui.CameraPreview;

/* loaded from: classes3.dex */
public final class x {
    public boolean A;
    public boolean B;

    /* renamed from: a, reason: collision with root package name */
    public final PlayerControlView f19116a;

    /* renamed from: b, reason: collision with root package name */
    public final View f19117b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f19118c;

    /* renamed from: d, reason: collision with root package name */
    public final ViewGroup f19119d;

    /* renamed from: e, reason: collision with root package name */
    public final ViewGroup f19120e;

    /* renamed from: f, reason: collision with root package name */
    public final ViewGroup f19121f;

    /* renamed from: g, reason: collision with root package name */
    public final ViewGroup f19122g;

    /* renamed from: h, reason: collision with root package name */
    public final ViewGroup f19123h;

    /* renamed from: i, reason: collision with root package name */
    public final ViewGroup f19124i;

    /* renamed from: j, reason: collision with root package name */
    public final View f19125j;

    /* renamed from: k, reason: collision with root package name */
    public final View f19126k;

    /* renamed from: l, reason: collision with root package name */
    public final AnimatorSet f19127l;

    /* renamed from: m, reason: collision with root package name */
    public final AnimatorSet f19128m;

    /* renamed from: n, reason: collision with root package name */
    public final AnimatorSet f19129n;

    /* renamed from: o, reason: collision with root package name */
    public final AnimatorSet f19130o;

    /* renamed from: p, reason: collision with root package name */
    public final AnimatorSet f19131p;

    /* renamed from: q, reason: collision with root package name */
    public final ValueAnimator f19132q;

    /* renamed from: r, reason: collision with root package name */
    public final ValueAnimator f19133r;

    /* renamed from: s, reason: collision with root package name */
    public final s f19134s = new s(this, 0);

    /* renamed from: t, reason: collision with root package name */
    public final s f19135t = new s(this, 1);

    /* renamed from: u, reason: collision with root package name */
    public final s f19136u = new s(this, 2);

    /* renamed from: v, reason: collision with root package name */
    public final s f19137v = new s(this, 3);

    /* renamed from: w, reason: collision with root package name */
    public final s f19138w = new s(this, 4);

    /* renamed from: x, reason: collision with root package name */
    public final h f19139x = new h(this, 1);
    public boolean C = true;

    /* renamed from: z, reason: collision with root package name */
    public int f19141z = 0;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f19140y = new ArrayList();

    public x(PlayerControlView playerControlView) {
        this.f19116a = playerControlView;
        final int i13 = 0;
        final int i14 = 1;
        final int i15 = 2;
        final int i16 = 3;
        this.f19117b = playerControlView.findViewById(h0.exo_controls_background);
        this.f19118c = (ViewGroup) playerControlView.findViewById(h0.exo_center_controls);
        this.f19120e = (ViewGroup) playerControlView.findViewById(h0.exo_minimal_controls);
        ViewGroup viewGroup = (ViewGroup) playerControlView.findViewById(h0.exo_bottom_bar);
        this.f19119d = viewGroup;
        this.f19124i = (ViewGroup) playerControlView.findViewById(h0.exo_time);
        View findViewById = playerControlView.findViewById(h0.exo_progress);
        this.f19125j = findViewById;
        this.f19121f = (ViewGroup) playerControlView.findViewById(h0.exo_basic_controls);
        this.f19122g = (ViewGroup) playerControlView.findViewById(h0.exo_extra_controls);
        this.f19123h = (ViewGroup) playerControlView.findViewById(h0.exo_extra_controls_scroll_view);
        View findViewById2 = playerControlView.findViewById(h0.exo_overflow_show);
        this.f19126k = findViewById2;
        View findViewById3 = playerControlView.findViewById(h0.exo_overflow_hide);
        if (findViewById2 != null && findViewById3 != null) {
            findViewById2.setOnClickListener(new View.OnClickListener(this) { // from class: androidx.media3.ui.u

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ x f19109b;

                {
                    this.f19109b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i17 = i13;
                    x.a(this.f19109b, view);
                }
            });
            findViewById3.setOnClickListener(new View.OnClickListener(this) { // from class: androidx.media3.ui.u

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ x f19109b;

                {
                    this.f19109b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i17 = i14;
                    x.a(this.f19109b, view);
                }
            });
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: androidx.media3.ui.t

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f19107b;

            {
                this.f19107b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i17 = i15;
                x xVar = this.f19107b;
                xVar.getClass();
                switch (i17) {
                    case 0:
                        xVar.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 1:
                        xVar.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = xVar.f19117b;
                        if (view != null) {
                            view.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup2 = xVar.f19118c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup3 = xVar.f19120e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(floatValue);
                            break;
                        }
                        break;
                    default:
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = xVar.f19117b;
                        if (view2 != null) {
                            view2.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup4 = xVar.f19118c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup5 = xVar.f19120e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(floatValue2);
                            break;
                        }
                        break;
                }
            }
        });
        ofFloat.addListener(new v(this, 0));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: androidx.media3.ui.t

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f19107b;

            {
                this.f19107b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i17 = i16;
                x xVar = this.f19107b;
                xVar.getClass();
                switch (i17) {
                    case 0:
                        xVar.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 1:
                        xVar.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = xVar.f19117b;
                        if (view != null) {
                            view.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup2 = xVar.f19118c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup3 = xVar.f19120e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(floatValue);
                            break;
                        }
                        break;
                    default:
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = xVar.f19117b;
                        if (view2 != null) {
                            view2.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup4 = xVar.f19118c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup5 = xVar.f19120e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(floatValue2);
                            break;
                        }
                        break;
                }
            }
        });
        ofFloat2.addListener(new v(this, 1));
        Resources resources = playerControlView.getResources();
        float dimension = resources.getDimension(e0.exo_styled_bottom_bar_height) - resources.getDimension(e0.exo_styled_progress_bar_height);
        float dimension2 = resources.getDimension(e0.exo_styled_bottom_bar_height);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f19127l = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new w(this, playerControlView, i13));
        animatorSet.play(ofFloat).with(d(findViewById, 0.0f, dimension)).with(d(viewGroup, 0.0f, dimension));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f19128m = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new w(this, playerControlView, i14));
        animatorSet2.play(d(findViewById, dimension, dimension2)).with(d(viewGroup, dimension, dimension2));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f19129n = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new w(this, playerControlView, i15));
        animatorSet3.play(ofFloat).with(d(findViewById, 0.0f, dimension2)).with(d(viewGroup, 0.0f, dimension2));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f19130o = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new v(this, 2));
        animatorSet4.play(ofFloat2).with(d(findViewById, dimension, 0.0f)).with(d(viewGroup, dimension, 0.0f));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.f19131p = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new v(this, 3));
        animatorSet5.play(ofFloat2).with(d(findViewById, dimension2, 0.0f)).with(d(viewGroup, dimension2, 0.0f));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f19132q = ofFloat3;
        ofFloat3.setDuration(250L);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: androidx.media3.ui.t

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f19107b;

            {
                this.f19107b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i17 = i13;
                x xVar = this.f19107b;
                xVar.getClass();
                switch (i17) {
                    case 0:
                        xVar.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 1:
                        xVar.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = xVar.f19117b;
                        if (view != null) {
                            view.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup2 = xVar.f19118c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup3 = xVar.f19120e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(floatValue);
                            break;
                        }
                        break;
                    default:
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = xVar.f19117b;
                        if (view2 != null) {
                            view2.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup4 = xVar.f19118c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup5 = xVar.f19120e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(floatValue2);
                            break;
                        }
                        break;
                }
            }
        });
        ofFloat3.addListener(new v(this, 4));
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f19133r = ofFloat4;
        ofFloat4.setDuration(250L);
        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: androidx.media3.ui.t

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f19107b;

            {
                this.f19107b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i17 = i14;
                x xVar = this.f19107b;
                xVar.getClass();
                switch (i17) {
                    case 0:
                        xVar.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 1:
                        xVar.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = xVar.f19117b;
                        if (view != null) {
                            view.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup2 = xVar.f19118c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup3 = xVar.f19120e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(floatValue);
                            break;
                        }
                        break;
                    default:
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = xVar.f19117b;
                        if (view2 != null) {
                            view2.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup4 = xVar.f19118c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup5 = xVar.f19120e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(floatValue2);
                            break;
                        }
                        break;
                }
            }
        });
        ofFloat4.addListener(new v(this, 5));
    }

    public static void a(x xVar, View view) {
        xVar.g();
        if (view.getId() == h0.exo_overflow_show) {
            xVar.f19132q.start();
        } else if (view.getId() == h0.exo_overflow_hide) {
            xVar.f19133r.start();
        }
    }

    public static int c(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return width + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
    }

    public static ObjectAnimator d(View view, float f13, float f14) {
        return ObjectAnimator.ofFloat(view, "translationY", f13, f14);
    }

    public static boolean j(View view) {
        int id3 = view.getId();
        return id3 == h0.exo_bottom_bar || id3 == h0.exo_prev || id3 == h0.exo_next || id3 == h0.exo_rew || id3 == h0.exo_rew_with_amount || id3 == h0.exo_ffwd || id3 == h0.exo_ffwd_with_amount;
    }

    public final void b(float f13) {
        ViewGroup viewGroup = this.f19123h;
        if (viewGroup != null) {
            viewGroup.setTranslationX((int) ((1.0f - f13) * viewGroup.getWidth()));
        }
        ViewGroup viewGroup2 = this.f19124i;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f13);
        }
        ViewGroup viewGroup3 = this.f19121f;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f13);
        }
    }

    public final void e(s sVar, long j13) {
        if (j13 >= 0) {
            this.f19116a.postDelayed(sVar, j13);
        }
    }

    public final void f() {
        PlayerControlView playerControlView = this.f19116a;
        playerControlView.removeCallbacks(this.f19138w);
        playerControlView.removeCallbacks(this.f19135t);
        playerControlView.removeCallbacks(this.f19137v);
        playerControlView.removeCallbacks(this.f19136u);
    }

    public final void g() {
        if (this.f19141z == 3) {
            return;
        }
        f();
        int i13 = this.f19116a.Q;
        if (i13 > 0) {
            if (!this.C) {
                e(this.f19138w, i13);
            } else if (this.f19141z == 1) {
                e(this.f19136u, CameraPreview.AUTOFOCUS_INTERVAL_MILLIS);
            } else {
                e(this.f19137v, i13);
            }
        }
    }

    public final void h(View view, boolean z13) {
        if (view == null) {
            return;
        }
        ArrayList arrayList = this.f19140y;
        if (!z13) {
            view.setVisibility(8);
            arrayList.remove(view);
            return;
        }
        if (this.A && j(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        arrayList.add(view);
    }

    public final void i(int i13) {
        int i14 = this.f19141z;
        this.f19141z = i13;
        PlayerControlView playerControlView = this.f19116a;
        if (i13 == 2) {
            playerControlView.setVisibility(8);
        } else if (i14 == 2) {
            playerControlView.setVisibility(0);
        }
        if (i14 != i13) {
            Iterator it = playerControlView.f18959c.iterator();
            while (it.hasNext()) {
                b0 b0Var = (b0) it.next();
                playerControlView.getVisibility();
                b0Var.getClass();
                b0Var.f19027a.b();
            }
        }
    }

    public final void k() {
        if (!this.C) {
            i(0);
            g();
            return;
        }
        int i13 = this.f19141z;
        if (i13 == 1) {
            this.f19130o.start();
        } else if (i13 == 2) {
            this.f19131p.start();
        } else if (i13 == 3) {
            this.B = true;
        } else if (i13 == 4) {
            return;
        }
        g();
    }
}
