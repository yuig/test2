package we1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.api.model.fj;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import z32.x2;

/* loaded from: classes5.dex */
public final class w1 extends LinearLayout implements re1.w {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f129672g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f129673a;

    /* renamed from: b, reason: collision with root package name */
    public ConstraintLayout f129674b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.constraintlayout.widget.p f129675c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltText f129676d;

    /* renamed from: e, reason: collision with root package name */
    public GestaltText f129677e;

    /* renamed from: f, reason: collision with root package name */
    public String f129678f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        gestaltText.i(o.f129508J);
        this.f129673a = gestaltText;
        this.f129675c = new androidx.constraintlayout.widget.p();
        GestaltText gestaltText2 = new GestaltText(6, context, (AttributeSet) null);
        gestaltText2.i(o.I);
        gestaltText2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f129676d = gestaltText2;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setOrientation(1);
        vn1.g titleTextVariant = vn1.g.UI_400;
        vn1.g subtitleTextVariant = vn1.g.BODY_100;
        int i13 = xe1.v.f134789d0;
        int i14 = xe1.v.S;
        int i15 = xe1.v.X;
        om1.e iconButtonSize = om1.e.MD;
        Intrinsics.checkNotNullParameter(titleTextVariant, "titleTextVariant");
        Intrinsics.checkNotNullParameter(subtitleTextVariant, "subtitleTextVariant");
        Intrinsics.checkNotNullParameter(iconButtonSize, "iconButtonSize");
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(i13);
        setPaddingRelative(dimensionPixelOffset, getResources().getDimensionPixelOffset(i14), dimensionPixelOffset, getResources().getDimensionPixelOffset(i15));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(w1 w1Var, re1.e eVar, String str, boolean z13, int i13) {
        GestaltButton.SmallSecondaryButton smallSecondaryButton;
        z32.r2 r2Var = z32.r2.LEFT;
        boolean z14 = (i13 & 8) != 0 ? false : z13;
        w1Var.getClass();
        w1Var.b(str, r2Var, new LinearLayout.LayoutParams(-2, -2));
        if (s1.f129602c[eVar.f107574b.ordinal()] == 1) {
            Context context = w1Var.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
            gestaltText.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
            String str2 = eVar.f107573a;
            if (!z14) {
                pk.a0.q(gestaltText, bs1.c.h2(str2 == null ? "" : str2));
            }
            gestaltText.j(new k1(eVar, 3));
            gestaltText.i(new fd1.h(str2 == null || str2.length() == 0 || z14, 10));
            smallSecondaryButton = gestaltText;
        } else {
            Context context2 = w1Var.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            GestaltButton.SmallSecondaryButton smallSecondaryButton2 = new GestaltButton.SmallSecondaryButton(6, context2, (AttributeSet) null);
            smallSecondaryButton2.d(new t1(eVar));
            smallSecondaryButton2.e(new k1(eVar, 4));
            smallSecondaryButton2.getLayoutParams();
            smallSecondaryButton2.setGravity(17);
            smallSecondaryButton = smallSecondaryButton2;
        }
        ConstraintLayout constraintLayout = new ConstraintLayout(w1Var.getContext());
        constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        w1Var.f129674b = constraintLayout;
        GestaltText gestaltText2 = w1Var.f129673a;
        constraintLayout.addView(gestaltText2);
        Unit unit = Unit.f80348a;
        int id3 = gestaltText2.getId();
        androidx.constraintlayout.widget.p pVar = w1Var.f129675c;
        pVar.o(id3, 0);
        pVar.n(gestaltText2.getId(), -2);
        pVar.q(gestaltText2.getId());
        pVar.p(gestaltText2.getId());
        pVar.l(gestaltText2.getId(), 1, 0, 1);
        pVar.l(gestaltText2.getId(), 3, 0, 3);
        pVar.l(gestaltText2.getId(), 4, 0, 4);
        pVar.m(gestaltText2.getId(), 2, smallSecondaryButton.getId(), 1, w1Var.getResources().getDimensionPixelOffset(m60.r0.margin_quarter));
        pVar.f(gestaltText2.getId());
        pVar.b(w1Var.f129674b);
        ConstraintLayout constraintLayout2 = w1Var.f129674b;
        if (constraintLayout2 != null) {
            constraintLayout2.addView(smallSecondaryButton);
        }
        pVar.o(smallSecondaryButton.getId(), -2);
        pVar.n(smallSecondaryButton.getId(), -2);
        pVar.f(smallSecondaryButton.getId());
        pVar.l(smallSecondaryButton.getId(), 3, 0, 3);
        pVar.l(smallSecondaryButton.getId(), 4, 0, 4);
        pVar.l(smallSecondaryButton.getId(), 2, 0, 2);
        pVar.l(smallSecondaryButton.getId(), 1, gestaltText2.getId(), 2);
        pVar.b(w1Var.f129674b);
        w1Var.addView(w1Var.f129674b);
        eVar.f107577e.invoke();
    }

    public static /* synthetic */ void c(w1 w1Var, String str, z32.r2 r2Var) {
        w1Var.b(str, r2Var, new LinearLayout.LayoutParams(-1, -2));
    }

    public final void b(String str, z32.r2 r2Var, LinearLayout.LayoutParams layoutParams) {
        d91.l lVar = new d91.l(str, 26);
        GestaltText gestaltText = this.f129673a;
        gestaltText.i(lVar);
        gestaltText.setLayoutParams(layoutParams);
        if (r2Var != null) {
            int i13 = s1.f129601b[r2Var.ordinal()];
            if (i13 == 1) {
                gestaltText.i(o.K);
            } else if (i13 == 2) {
                gestaltText.i(o.L);
            } else {
                if (i13 != 3) {
                    return;
                }
                gestaltText.i(o.M);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00fd, code lost:
    
        if (r1 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0037, code lost:
    
        if (r1 == null) goto L8;
     */
    @Override // re1.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(re1.p r14) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: we1.w1.g(re1.p):void");
    }

    @Override // re1.w
    public final void n(final re1.r headerModel) {
        Intrinsics.checkNotNullParameter(headerModel, "headerModel");
        String str = this.f129678f;
        String str2 = headerModel.f107639a;
        if (Intrinsics.d(str, str2)) {
            return;
        }
        removeAllViews();
        ConstraintLayout constraintLayout = this.f129674b;
        if (constraintLayout != null) {
            constraintLayout.removeAllViews();
        }
        this.f129678f = str2;
        fj fjVar = headerModel.f107640b;
        int i13 = s1.f129600a[fjVar.e().ordinal()];
        int i14 = 1;
        GestaltText gestaltText = this.f129673a;
        if (i13 == 1) {
            gestaltText.i(o.G);
        } else if (i13 == 2) {
            gestaltText.i(o.H);
        }
        gestaltText.i(new o1(headerModel, 4));
        o1 o1Var = new o1(headerModel, 5);
        GestaltText gestaltText2 = this.f129676d;
        gestaltText2.i(o1Var);
        x2 x2Var = x2.SUBTITLE_FIRST;
        re1.v vVar = headerModel.f107648j;
        x2 x2Var2 = headerModel.f107643e;
        String str3 = headerModel.f107646h;
        if (x2Var2 == x2Var && str3 != null && str3.length() != 0) {
            this.f129676d.i(new v1(str3, vVar, i14));
            addView(gestaltText2);
        }
        re1.q qVar = headerModel.f107645g;
        String str4 = headerModel.f107642d;
        re1.d dVar = headerModel.f107647i;
        if (dVar != null && fjVar.getShowUser()) {
            if (str4 != null) {
                c(this, str4, fjVar.l());
                addView(gestaltText);
            }
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            addView(pe.i.p(context, dVar));
        } else if (headerModel.f107644f) {
            pk.a0.k1(this, getResources().getDimensionPixelOffset(qVar.f107636g));
        } else if (dVar == null || fjVar.getShowUser()) {
            re1.e eVar = headerModel.f107641c;
            if (eVar != null) {
                z32.l lVar = z32.l.HEADER;
                z32.l lVar2 = eVar.f107575c;
                if (lVar2 == lVar || lVar2 == z32.l.HEADER_AND_END_OVERFLOW) {
                    if (str4 != null) {
                        a(this, eVar, str4, headerModel.f107651m, 4);
                        final int i15 = 0;
                        setOnClickListener(new View.OnClickListener() { // from class: we1.r1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i16 = i15;
                                re1.r this_with = headerModel;
                                switch (i16) {
                                    case 0:
                                        Intrinsics.checkNotNullParameter(this_with, "$this_with");
                                        this_with.f107641c.f107576d.invoke();
                                        break;
                                    default:
                                        Intrinsics.checkNotNullParameter(this_with, "$this_with");
                                        this_with.f107641c.f107576d.invoke();
                                        break;
                                }
                            }
                        });
                    }
                }
            }
            if (str4 != null) {
                c(this, str4, fjVar.l());
                addView(gestaltText);
                if (eVar != null) {
                    final int i16 = 1;
                    setOnClickListener(new View.OnClickListener() { // from class: we1.r1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i162 = i16;
                            re1.r this_with = headerModel;
                            switch (i162) {
                                case 0:
                                    Intrinsics.checkNotNullParameter(this_with, "$this_with");
                                    this_with.f107641c.f107576d.invoke();
                                    break;
                                default:
                                    Intrinsics.checkNotNullParameter(this_with, "$this_with");
                                    this_with.f107641c.f107576d.invoke();
                                    break;
                            }
                        }
                    });
                }
            }
        } else if (str4 != null) {
            c(this, str4, fjVar.l());
            addView(gestaltText);
            if (dVar.f107571d) {
                Integer valueOf = Integer.valueOf(eo1.b.color_blue_500);
                if (!kotlin.text.z.j(gestaltText.l().f108849g.toString())) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(((Object) gestaltText.getText()) + "  ");
                    int dimensionPixelOffset = getResources().getDimensionPixelOffset(r82.b.structured_feed_header_check_mark_icon_size);
                    Drawable f03 = bs1.c.f0(this, sm1.b.ic_check_circle_gestalt, valueOf, null, 4);
                    f03.setBounds(0, 0, dimensionPixelOffset, dimensionPixelOffset);
                    spannableStringBuilder.setSpan(new ImageSpan(f03, 1), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                    pk.a0.q(gestaltText, bs1.c.h2(spannableStringBuilder));
                }
            }
        }
        if (x2Var2 != x2Var && str3 != null && str3.length() != 0) {
            this.f129676d.i(new v1(str3, vVar, 1));
            addView(gestaltText2);
        }
        String str5 = headerModel.f107649k;
        if (str5 != null && str5.length() != 0) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            GestaltText gestaltText3 = new GestaltText(6, context2, (AttributeSet) null);
            gestaltText3.i(o.F);
            gestaltText3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            dl2.b.y2(gestaltText3);
            this.f129677e = gestaltText3;
            gestaltText3.i(new v1(str5, headerModel.f107650l, 0));
            View view = this.f129677e;
            if (view != null) {
                addView(view);
            }
        }
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(qVar.f107632c);
        setPaddingRelative(dimensionPixelOffset2, getResources().getDimensionPixelOffset(qVar.f107633d), dimensionPixelOffset2, getResources().getDimensionPixelOffset(qVar.f107635f));
        requestLayout();
    }
}
