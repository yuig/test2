package we1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.api.model.fj;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.xh;
import com.pinterest.api.model.zh;
import com.pinterest.design.components.images.ImageStack;
import com.pinterest.gestalt.badge.GestaltBadge;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.components.users.LegoUserRep;
import com.pinterest.ui.imageview.ProportionalImageView;
import java.util.ArrayList;
import java.util.List;
import kh2.k3;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import z32.x2;

/* loaded from: classes5.dex */
public final class q1 extends ConstraintLayout implements re1.w {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f129559v = 0;

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f129560a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.constraintlayout.widget.p f129561b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f129562c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltText f129563d;

    /* renamed from: e, reason: collision with root package name */
    public ProportionalImageView f129564e;

    /* renamed from: f, reason: collision with root package name */
    public ImageStack f129565f;

    /* renamed from: g, reason: collision with root package name */
    public ImageStack f129566g;

    /* renamed from: h, reason: collision with root package name */
    public ProportionalImageView f129567h;

    /* renamed from: i, reason: collision with root package name */
    public LegoUserRep f129568i;

    /* renamed from: j, reason: collision with root package name */
    public GestaltIconButton f129569j;

    /* renamed from: k, reason: collision with root package name */
    public GestaltButton.SmallSecondaryButton f129570k;

    /* renamed from: l, reason: collision with root package name */
    public GestaltBadge f129571l;

    /* renamed from: m, reason: collision with root package name */
    public String f129572m;

    /* renamed from: n, reason: collision with root package name */
    public final int f129573n;

    /* renamed from: o, reason: collision with root package name */
    public final int f129574o;

    /* renamed from: p, reason: collision with root package name */
    public final int f129575p;

    /* renamed from: q, reason: collision with root package name */
    public final int f129576q;

    /* renamed from: r, reason: collision with root package name */
    public final int f129577r;

    /* renamed from: s, reason: collision with root package name */
    public final int f129578s;

    /* renamed from: t, reason: collision with root package name */
    public final int f129579t;

    /* renamed from: u, reason: collision with root package name */
    public int f129580u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        gestaltText.setEmojiCompatEnabled(false);
        gestaltText.setImportantForAccessibility(2);
        gestaltText.i(o.f129521v);
        this.f129560a = gestaltText;
        this.f129561b = new androidx.constraintlayout.widget.p();
        GestaltText gestaltText2 = new GestaltText(6, context, (AttributeSet) null);
        gestaltText2.setImportantForAccessibility(2);
        gestaltText2.setEmojiCompatEnabled(false);
        gestaltText2.i(o.f129520u);
        gestaltText2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f129562c = gestaltText2;
        GestaltText gestaltText3 = new GestaltText(6, context, (AttributeSet) null);
        gestaltText3.setEmojiCompatEnabled(false);
        gestaltText3.i(o.f129514o);
        gestaltText3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f129563d = gestaltText3;
        this.f129573n = View.generateViewId();
        this.f129574o = View.generateViewId();
        this.f129575p = View.generateViewId();
        this.f129576q = View.generateViewId();
        this.f129577r = View.generateViewId();
        this.f129578s = View.generateViewId();
        this.f129579t = View.generateViewId();
        int dimensionPixelSize = getResources().getDimensionPixelSize(eo1.c.space_400);
        setPaddingRelative(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, getResources().getDimensionPixelSize(eo1.c.space_200));
    }

    public final Integer L(re1.e eVar, om1.e eVar2, boolean z13) {
        kotlin.jvm.internal.j0 j0Var = new kotlin.jvm.internal.j0();
        z32.l lVar = z32.l.HEADER;
        z32.l lVar2 = eVar.f107575c;
        int i13 = 0;
        if (lVar2 == lVar || lVar2 == z32.l.HEADER_AND_END_OVERFLOW) {
            int i14 = l1.f129460b[eVar.f107574b.ordinal()];
            int i15 = 1;
            if (i14 == 1) {
                if (this.f129569j == null) {
                    Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    GestaltIconButton gestaltIconButton = new GestaltIconButton(6, context, (AttributeSet) null);
                    gestaltIconButton.t(new n1(eVar2, i13));
                    gestaltIconButton.setImportantForAccessibility(2);
                    this.f129569j = gestaltIconButton;
                }
                GestaltIconButton gestaltIconButton2 = this.f129569j;
                if ((gestaltIconButton2 != null ? gestaltIconButton2.getParent() : null) == null) {
                    addView(this.f129569j);
                    setPaddingRelative(getPaddingStart(), getPaddingTop(), getResources().getDimensionPixelSize(eo1.c.space_200), getPaddingBottom());
                }
                GestaltIconButton gestaltIconButton3 = this.f129569j;
                if (gestaltIconButton3 != null) {
                    gestaltIconButton3.u(new k1(eVar, 0));
                    com.bumptech.glide.c.u1(gestaltIconButton3);
                }
                GestaltIconButton gestaltIconButton4 = this.f129569j;
                if (gestaltIconButton4 != null) {
                    j0Var.f80434a = gestaltIconButton4;
                }
            } else {
                if (i14 != 2) {
                    return null;
                }
                if (this.f129570k == null) {
                    Context context2 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    GestaltButton.SmallSecondaryButton smallSecondaryButton = new GestaltButton.SmallSecondaryButton(6, context2, (AttributeSet) null);
                    smallSecondaryButton.d(o.f129524y);
                    this.f129570k = smallSecondaryButton;
                }
                GestaltButton.SmallSecondaryButton smallSecondaryButton2 = this.f129570k;
                if ((smallSecondaryButton2 != null ? smallSecondaryButton2.getParent() : null) == null) {
                    addView(this.f129570k);
                }
                GestaltButton.SmallSecondaryButton smallSecondaryButton3 = this.f129570k;
                if (smallSecondaryButton3 != null) {
                    smallSecondaryButton3.d(new n1(eVar, i15));
                    smallSecondaryButton3.e(new k1(eVar, 2));
                    smallSecondaryButton3.setVisibility(0);
                }
                GestaltButton.SmallSecondaryButton smallSecondaryButton4 = this.f129570k;
                if (smallSecondaryButton4 != null) {
                    j0Var.f80434a = smallSecondaryButton4;
                }
            }
        }
        View view = (View) j0Var.f80434a;
        if (view != null) {
            int id3 = view.getId();
            androidx.constraintlayout.widget.p pVar = this.f129561b;
            pVar.o(id3, -2);
            pVar.n(view.getId(), -2);
            pVar.q(view.getId());
            pVar.p(view.getId());
            pVar.f(view.getId());
            pVar.l(view.getId(), 3, 0, 3);
            pVar.l(view.getId(), 4, this.f129573n, 3);
            pVar.b(this);
        }
        if (z13) {
            GestaltText gestaltText = this.f129560a;
            Intrinsics.g(gestaltText, "null cannot be cast to non-null type android.widget.TextView");
            q5.x.a(gestaltText, new s.f(gestaltText, j0Var, this, 24, 0));
        }
        View view2 = (View) j0Var.f80434a;
        if (view2 != null) {
            return Integer.valueOf(view2.getId());
        }
        return null;
    }

    public final void T(re1.r rVar, boolean z13, int i13, int i14) {
        if (rVar.f107649k != null) {
            GestaltText gestaltText = this.f129563d;
            if (gestaltText.getParent() == null) {
                addView(gestaltText);
            }
            int id3 = gestaltText.getId();
            androidx.constraintlayout.widget.p pVar = this.f129561b;
            int i15 = 0;
            pVar.o(id3, 0);
            pVar.n(gestaltText.getId(), -2);
            pVar.q(gestaltText.getId());
            pVar.p(gestaltText.getId());
            pVar.m(gestaltText.getId(), 6, 0, 6, i13);
            pVar.m(gestaltText.getId(), 7, 0, 7, i13);
            if (z13) {
                pVar.m(gestaltText.getId(), 4, 0, 4, i14);
            }
            pVar.b(this);
            gestaltText.i(new o1(rVar, i15));
        }
    }

    public final void X(boolean z13) {
        ProportionalImageView proportionalImageView = this.f129567h;
        if (proportionalImageView != null) {
            ViewGroup.LayoutParams layoutParams = proportionalImageView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            int i13 = this.f129580u;
            if (i13 != 0) {
                if (!z13) {
                    i13 -= k3.k0(getContext());
                }
                layoutParams.height = i13;
            }
            proportionalImageView.setLayoutParams(layoutParams);
        }
        ProportionalImageView proportionalImageView2 = this.f129567h;
        if (proportionalImageView2 != null) {
            proportionalImageView2.invalidate();
        }
    }

    public final Integer Z(re1.r rVar) {
        Integer num;
        boolean z13;
        re1.s sVar = rVar.f107652n;
        int i13 = this.f129574o;
        int i14 = this.f129573n;
        androidx.constraintlayout.widget.p pVar = this.f129561b;
        boolean z14 = rVar.f107653o;
        if (sVar != null) {
            String str = sVar.f107660a;
            if (str.length() > 0) {
                int dimensionPixelSize = getResources().getDimensionPixelSize(sVar.f107665f);
                float f13 = sVar.f107663d;
                int ceil = (int) Math.ceil(dimensionPixelSize * f13);
                ProportionalImageView proportionalImageView = this.f129564e;
                int i15 = this.f129576q;
                if (proportionalImageView == null) {
                    ProportionalImageView proportionalImageView2 = new ProportionalImageView(getContext());
                    proportionalImageView2.setId(i15);
                    proportionalImageView2.f52576J = f13;
                    proportionalImageView2.U1(sVar.f107664e);
                    Context context = proportionalImageView2.getContext();
                    int i16 = r82.a.pinterest_black_transparent_3;
                    Object obj = d5.a.f53679a;
                    proportionalImageView2.setColorFilter(context.getColor(i16), PorterDuff.Mode.SRC_ATOP);
                    proportionalImageView2.setLayoutParams(new ConstraintLayout.LayoutParams(dimensionPixelSize, ceil));
                    proportionalImageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    proportionalImageView2.setVisibility(8);
                    this.f129564e = proportionalImageView2;
                }
                ProportionalImageView proportionalImageView3 = this.f129564e;
                if ((proportionalImageView3 != null ? proportionalImageView3.getParent() : null) == null) {
                    addView(this.f129564e);
                    ProportionalImageView proportionalImageView4 = this.f129564e;
                    if (proportionalImageView4 != null) {
                        proportionalImageView4.setVisibility(0);
                    }
                    pVar.o(i15, dimensionPixelSize);
                    pVar.n(i15, ceil);
                    pVar.q(i15);
                    pVar.p(i15);
                    pVar.l(i15, 3, 0, 3);
                    if (z14) {
                        pVar.l(i15, 3, i13, 4);
                    } else {
                        pVar.l(i15, 4, i14, 3);
                    }
                }
                ProportionalImageView proportionalImageView5 = this.f129564e;
                if (proportionalImageView5 != null) {
                    proportionalImageView5.loadUrl(str);
                }
                ProportionalImageView proportionalImageView6 = this.f129564e;
                if (proportionalImageView6 != null) {
                    proportionalImageView6.setOnClickListener(new lc1.b(sVar, 29));
                }
                return Integer.valueOf(i15);
            }
        } else {
            List list = rVar.f107654p;
            if (list == null) {
                re1.d dVar = rVar.f107647i;
                if (dVar != null) {
                    fj fjVar = rVar.f107640b;
                    boolean showUser = fjVar.getShowUser();
                    GestaltText gestaltText = this.f129560a;
                    int i17 = this.f129575p;
                    boolean z15 = dVar.f107571d;
                    if (showUser) {
                        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -2);
                        if (this.f129568i == null) {
                            Context context2 = getContext();
                            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                            LegoUserRep legoUserRep = new LegoUserRep(context2);
                            legoUserRep.setId(i17);
                            this.f129568i = legoUserRep;
                        }
                        LegoUserRep legoUserRep2 = this.f129568i;
                        if ((legoUserRep2 != null ? legoUserRep2.getParent() : null) == null) {
                            addView(this.f129568i);
                        }
                        LegoUserRep legoUserRep3 = this.f129568i;
                        if (legoUserRep3 != null) {
                            legoUserRep3.setVisibility(0);
                            Context context3 = legoUserRep3.getContext();
                            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                            rl1.g f14 = rl1.n.f(context3);
                            wy0 wy0Var = dVar.f107568a;
                            rl1.g c13 = rl1.n.c(f14, dl2.b.s0(wy0Var), dl2.b.M0(wy0Var), dl2.b.W1(wy0Var) && !z15);
                            int i18 = z15 ? sm1.b.ic_check_circle_gestalt : 0;
                            kh2.u2.T0(legoUserRep3, dVar.f107569b);
                            legoUserRep3.y1(ze0.a.List);
                            legoUserRep3.H0(c13);
                            oa2.t.i4(legoUserRep3, dl2.b.i1(wy0Var), i18, null, 12);
                            legoUserRep3.t0(false);
                            legoUserRep3.r0(false);
                            legoUserRep3.M1(vn1.g.UI_400);
                            legoUserRep3.setLayoutParams(layoutParams);
                        }
                        pk.a0.k0(gestaltText);
                        pk.a0.k0(this.f129562c);
                        LegoUserRep legoUserRep4 = this.f129568i;
                        if (legoUserRep4 != null) {
                            pVar.o(legoUserRep4.getId(), 0);
                            pVar.n(legoUserRep4.getId(), -2);
                            pVar.q(legoUserRep4.getId());
                            pVar.p(legoUserRep4.getId());
                            pVar.l(legoUserRep4.getId(), 3, 0, 3);
                            pVar.l(legoUserRep4.getId(), 4, i14, 3);
                        }
                        z13 = true;
                    } else {
                        LegoUserRep legoUserRep5 = this.f129568i;
                        if (legoUserRep5 != null) {
                            legoUserRep5.setVisibility(8);
                        }
                        z13 = false;
                    }
                    if (!fjVar.getShowUser() && z15 && (!kotlin.text.z.j(gestaltText.l().f108849g.toString()))) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(((Object) gestaltText.getText()) + "  ");
                        int dimensionPixelOffset = getResources().getDimensionPixelOffset(r82.b.structured_feed_header_check_mark_icon_size);
                        num = null;
                        Drawable f03 = bs1.c.f0(this, sm1.b.ic_check_circle_gestalt, Integer.valueOf(eo1.b.color_blue_500), null, 4);
                        f03.setBounds(0, 0, dimensionPixelOffset, dimensionPixelOffset);
                        spannableStringBuilder.setSpan(new ImageSpan(f03, 1), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                        pk.a0.q(gestaltText, bs1.c.h2(spannableStringBuilder));
                    } else {
                        num = null;
                    }
                    if (z13) {
                        return Integer.valueOf(i17);
                    }
                } else {
                    num = null;
                }
                return num;
            }
            if ((!list.isEmpty()) && ((re1.s) list.get(0)).f107660a.length() > 0) {
                int dimensionPixelSize2 = getResources().getDimensionPixelSize(((re1.s) list.get(0)).f107665f);
                int ceil2 = (int) Math.ceil(dimensionPixelSize2 * ((re1.s) list.get(0)).f107663d);
                ImageStack imageStack = this.f129565f;
                int i19 = this.f129577r;
                if (imageStack == null) {
                    Context context4 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                    ImageStack imageStack2 = new ImageStack(context4);
                    imageStack2.setId(i19);
                    this.f129565f = imageStack2;
                }
                ImageStack imageStack3 = this.f129565f;
                if (imageStack3 != null) {
                    ImageStack.b(imageStack3, dimensionPixelSize2, ceil2, imageStack3.getResources().getDimensionPixelSize(xe1.v.f134808w), imageStack3.getResources().getDimensionPixelSize(((re1.s) list.get(0)).f107664e), imageStack3.getResources().getDimensionPixelSize(xe1.v.f134809x), bs1.c.B(imageStack3, eo1.b.color_background_default), 0, 64);
                    List<re1.s> list2 = list;
                    ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list2, 10));
                    for (re1.s sVar2 : list2) {
                        arrayList.add(new xe0.c(sVar2.f107660a, new p1(sVar2, 1), false, 9));
                    }
                    imageStack3.a(arrayList);
                    imageStack3.setVisibility(0);
                }
                ImageStack imageStack4 = this.f129565f;
                if ((imageStack4 != null ? imageStack4.getParent() : null) == null) {
                    addView(this.f129565f);
                    ImageStack imageStack5 = this.f129565f;
                    if (imageStack5 != null) {
                        imageStack5.setVisibility(0);
                    }
                    pVar.o(i19, -2);
                    pVar.n(i19, -2);
                    pVar.q(i19);
                    pVar.p(i19);
                    pVar.l(i19, 3, 0, 3);
                    if (z14) {
                        pVar.l(i19, 3, i13, 4);
                    } else {
                        pVar.l(i19, 4, i14, 3);
                    }
                }
                return Integer.valueOf(i19);
            }
        }
        return null;
    }

    public final void a0(re1.r rVar) {
        int L;
        int min;
        String string;
        if (rVar.f107646h != null) {
            GestaltText gestaltText = this.f129562c;
            if (gestaltText.getParent() == null) {
                addView(gestaltText);
            }
            int id3 = gestaltText.getId();
            androidx.constraintlayout.widget.p pVar = this.f129561b;
            pVar.o(id3, 0);
            pVar.n(gestaltText.getId(), -2);
            pVar.q(gestaltText.getId());
            pVar.p(gestaltText.getId());
            pVar.b(this);
            gestaltText.i(new o1(rVar, 1));
            zh zhVar = rVar.f107656r;
            if (zhVar != null) {
                if (df.j1.U0(zhVar.getText()) && (string = zhVar.getText()) != null) {
                    Intrinsics.checkNotNullParameter(string, "string");
                    pk.a0.q(gestaltText, new u50.f0(string));
                }
                xh attributionAction = zhVar.getAttributionAction();
                String url = attributionAction != null ? attributionAction.getUrl() : null;
                Function1 function1 = rVar.f107657s;
                if (url != null && function1 != null) {
                    gestaltText.j(new la1.k(7, function1, url));
                }
                boolean z13 = df.j1.U0(zhVar.getText()) && df.j1.U0(zhVar.getSubSpanText());
                int i13 = l1.f129459a[zhVar.b().ordinal()];
                rm1.q qVar = i13 != 1 ? i13 != 2 ? i13 != 3 ? null : rm1.q.ARROW_UP_RIGHT : rm1.q.INFO_CIRCLE : rm1.q.PINTEREST;
                if (z13 || qVar != null) {
                    SpannableStringBuilder string2 = new SpannableStringBuilder(gestaltText.getText());
                    if (z13) {
                        String text = zhVar.getText();
                        String subSpanText = zhVar.getSubSpanText();
                        if (text != null && subSpanText != null && (L = StringsKt.L(text, subSpanText, 0, false, 6)) >= 0 && (min = Math.min(subSpanText.length() + L, text.length())) > L) {
                            string2.setSpan(new m1(zhVar, function1, te0.i.f117497d, eo1.b.color_text_default, getContext()), L, min, 17);
                        }
                    }
                    if (qVar != null) {
                        string2.insert(0, (CharSequence) " ");
                        int W = bs1.c.W(this, r82.b.structured_feed_header_attribution_icon_size);
                        Context context = getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        Drawable f03 = bs1.c.f0(this, qVar.drawableRes(context), null, null, 6);
                        Context context2 = getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                        int i14 = eo1.b.color_icon_default;
                        Intrinsics.checkNotNullParameter(f03, "<this>");
                        Intrinsics.checkNotNullParameter(context2, "context");
                        Drawable mutate = f03.mutate();
                        Intrinsics.checkNotNullExpressionValue(mutate, "mutate(...)");
                        mutate.setTint(bs1.c.A(context2, i14));
                        Resources resources = getResources();
                        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                        BitmapDrawable p03 = d7.b.p0(mutate, resources, W, W);
                        p03.setBounds(0, 0, W, W);
                        int W2 = bs1.c.W(this, eo1.c.space_100);
                        xe1.n nVar = xe1.n.END;
                        Context context3 = getContext();
                        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                        string2.setSpan(new xe1.p(p03, W2, nVar, df.j1.Y0(context3)), 0, 1, 33);
                    }
                    Intrinsics.checkNotNullParameter(string2, "string");
                    pk.a0.q(gestaltText, new u50.f0(string2));
                }
            }
        }
    }

    public final void d0(re1.r rVar, boolean z13) {
        int i13;
        if (rVar.f107642d != null) {
            GestaltText gestaltText = this.f129560a;
            if (gestaltText.getParent() == null) {
                addView(gestaltText);
            }
            int id3 = gestaltText.getId();
            androidx.constraintlayout.widget.p pVar = this.f129561b;
            pVar.o(id3, 0);
            pVar.n(gestaltText.getId(), -2);
            pVar.q(gestaltText.getId());
            pVar.p(gestaltText.getId());
            pVar.b(this);
            if (z13) {
                i13 = 3;
            } else {
                fj fjVar = rVar.f107640b;
                if (fjVar.e() == z32.u2.ONE_LINE) {
                    i13 = 1;
                } else {
                    fjVar.e();
                    i13 = 2;
                }
            }
            kotlin.jvm.internal.j0 j0Var = new kotlin.jvm.internal.j0();
            j0Var.f80434a = rVar.f107645g.f107630a;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            if (dl2.b.T1(context) && j0Var.f80434a == vn1.g.HEADING_700) {
                j0Var.f80434a = vn1.g.HEADING_600;
            }
            gestaltText.i(new rq.a0(rVar, j0Var, i13, 13));
            if (rVar.f107658t) {
                gestaltText.i(o.A);
            }
            re1.e eVar = rVar.f107641c;
            if (eVar != null) {
                gestaltText.j(new k1(eVar, 1));
            }
        }
    }

    @Override // re1.w
    public final void g(re1.p headerModel) {
        Intrinsics.checkNotNullParameter(headerModel, "headerModel");
        String str = this.f129572m;
        if (str == null) {
            str = "";
        }
        e50.s sVar = (e50.s) headerModel.f107623a;
        n(new re1.r(str, new fj(sVar.f57413a, sVar.f57414b, null, null, null, null, null, null, null, null, null, null, null), headerModel.f107628f, headerModel.f107624b, x2.TITLE_FIRST, false, headerModel.f107626d, headerModel.f107625c, headerModel.f107629g, headerModel.f107627e, null, new re1.v((vn1.b) null, (vn1.e) null, 7), false, null, false, null, null, null, null, false, false));
    }

    public final void g0(re1.r rVar, Integer num, Integer num2, int i13) {
        CharSequence text;
        androidx.constraintlayout.widget.p pVar;
        int i14;
        int i15;
        int i16;
        androidx.constraintlayout.widget.p pVar2;
        float f13;
        androidx.constraintlayout.widget.p pVar3;
        int i17;
        androidx.constraintlayout.widget.p pVar4;
        GestaltText gestaltText = this.f129562c;
        CharSequence text2 = gestaltText.getText();
        GestaltText gestaltText2 = this.f129563d;
        GestaltText gestaltText3 = this.f129560a;
        boolean z13 = (text2 == null || text2.length() == 0) && ((text = gestaltText3.getText()) == null || text.length() == 0) && df.j1.U0(gestaltText2.getText());
        int intValue = num != null ? num.intValue() : 0;
        int intValue2 = num2 != null ? num2.intValue() : 0;
        int i18 = z13 ? eo1.c.space_400 : eo1.c.space_200;
        int dimensionPixelSize = num != null ? getResources().getDimensionPixelSize(eo1.c.space_200) : i13;
        int dimensionPixelSize2 = num2 != null ? getResources().getDimensionPixelSize(i18) : i13;
        int i19 = num != null ? 7 : 6;
        int i23 = num2 != null ? 6 : 7;
        int i24 = 2;
        if (num == null && num2 == null) {
            if (rVar.f107640b.l() == z32.r2.CENTER) {
                gestaltText3.i(o.B);
            } else {
                gestaltText3.i(o.C);
            }
            gestaltText.i(new o1(rVar, i24));
        } else {
            gestaltText3.i(o.D);
            gestaltText.i(o.E);
        }
        gestaltText2.i(new o1(rVar, 3));
        int id3 = gestaltText3.getId();
        androidx.constraintlayout.widget.p pVar5 = this.f129561b;
        pVar5.w(id3).f17767e.X = 2;
        pVar5.w(gestaltText.getId()).f17767e.X = 2;
        if (num != null) {
            pVar = pVar5;
            i14 = 7;
            pVar5.m(intValue, 6, 0, 6, i13);
        } else {
            pVar = pVar5;
            i14 = 7;
        }
        if (num2 != null) {
            i15 = 6;
            pVar.m(intValue2, 7, 0, 7, i13);
        } else {
            i15 = 6;
        }
        if (rVar.f107653o) {
            ImageStack imageStack = this.f129566g;
            int i25 = this.f129579t;
            int i26 = imageStack != null ? i25 : 0;
            int i27 = imageStack != null ? i15 : i14;
            int i28 = imageStack != null ? 0 : i13;
            androidx.constraintlayout.widget.p pVar6 = pVar;
            pVar6.m(gestaltText3.getId(), 6, 0, 6, i13);
            pVar6.m(gestaltText3.getId(), 7, i26, i27, i28);
            if (this.f129566g != null) {
                pVar4 = pVar;
                pVar4.l(i25, i15, gestaltText3.getId(), i14);
            } else {
                pVar4 = pVar;
            }
            pVar4.J(gestaltText.getId(), 0.5f);
            if (this.f129567h != null) {
                pVar4.J(gestaltText3.getId(), 1.0f);
            }
            i16 = i15;
            pVar2 = pVar4;
            f13 = 1.0f;
        } else {
            androidx.constraintlayout.widget.p pVar7 = pVar;
            i16 = i15;
            pVar2 = pVar7;
            pVar7.m(gestaltText3.getId(), 6, intValue, i19, dimensionPixelSize);
            f13 = 1.0f;
            pVar2.m(gestaltText3.getId(), 7, intValue2, i23, dimensionPixelSize2);
        }
        float f14 = f13;
        pVar2.m(gestaltText.getId(), 6, intValue, i19, dimensionPixelSize);
        pVar2.m(gestaltText.getId(), 7, intValue2, i23, dimensionPixelSize2);
        if (!z13 || num2 == null) {
            pVar3 = pVar2;
            i17 = 3;
        } else {
            int intValue3 = num2.intValue();
            androidx.constraintlayout.widget.p pVar8 = pVar2;
            i17 = 3;
            pVar8.l(intValue3, 3, 0, 3);
            pVar8.l(intValue3, 4, 0, 4);
            pVar3 = pVar8;
            pVar8.m(gestaltText2.getId(), 7, intValue3, 6, dimensionPixelSize2);
            pVar3.J(intValue3, f14);
            pVar3.J(gestaltText2.getId(), f14);
        }
        pVar3.b(this);
        if (rVar.f107659u) {
            if (this.f129571l == null) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                GestaltBadge gestaltBadge = new GestaltBadge(i16, context, (AttributeSet) null);
                gestaltBadge.k(o.f129522w);
                this.f129571l = gestaltBadge;
            }
            GestaltBadge gestaltBadge2 = this.f129571l;
            if (gestaltBadge2 == null) {
                return;
            }
            if (gestaltBadge2.getParent() == null) {
                addView(gestaltBadge2);
            }
            gestaltBadge2.k(o.f129523x);
            pVar3.o(gestaltBadge2.getId(), -2);
            pVar3.n(gestaltBadge2.getId(), -2);
            pVar3.o(gestaltText3.getId(), -2);
            pVar3.l(gestaltBadge2.getId(), i17, gestaltText3.getId(), i17);
            pVar3.l(gestaltBadge2.getId(), 4, gestaltText3.getId(), 4);
            pVar3.m(gestaltBadge2.getId(), 6, gestaltText3.getId(), 7, bs1.c.W(this, eo1.c.space_100));
            pVar3.l(gestaltBadge2.getId(), 7, 0, 7);
            pVar3.l(gestaltText3.getId(), 7, gestaltBadge2.getId(), i16);
            pVar3.l(gestaltText3.getId(), i16, 0, i16);
            pVar3.w(gestaltText3.getId()).f17767e.W = 2;
            pVar3.H(gestaltText3.getId(), 0.0f);
            pVar3.b(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x02f5, code lost:
    
        r10 = 3;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x06ed  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0705  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0733  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0740  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0748  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x07a2  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x07b7  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x07c2  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x074f  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x075c  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0764  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x076b  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0778  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0780  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0786  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x070b  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x06f0  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0308  */
    @Override // re1.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(re1.r r49) {
        /*
            Method dump skipped, instructions count: 2042
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: we1.q1.n(re1.r):void");
    }
}
