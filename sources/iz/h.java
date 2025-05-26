package iz;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.api.model.gs0;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import h32.g0;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Liz/h;", "Lhz/d;", "<init>", "()V", "anket_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class h extends x {
    public static final /* synthetic */ int C0 = 0;
    public om1.e A0 = om1.e.LG;
    public List B0 = f0.j(Integer.valueOf(nz.b.ic_dislike_nonpds), Integer.valueOf(nz.b.ic_like_nonpds));

    /* renamed from: v0, reason: collision with root package name */
    public Integer f73847v0;

    /* renamed from: w0, reason: collision with root package name */
    public GestaltText f73848w0;

    /* renamed from: x0, reason: collision with root package name */
    public GestaltIconButton f73849x0;

    /* renamed from: y0, reason: collision with root package name */
    public GestaltIconButton f73850y0;

    /* renamed from: z0, reason: collision with root package name */
    public List f73851z0;

    public h() {
        this.E = cz.l.view_survey_like_question;
    }

    public static final void j8(h hVar, GestaltIconButton gestaltIconButton, int i13) {
        List list = hVar.f73851z0;
        Integer num = null;
        if (list == null) {
            Intrinsics.r("answerOptions");
            throw null;
        }
        int indexOf = list.indexOf(gestaltIconButton);
        Integer num2 = hVar.f73847v0;
        a aVar = a.f73818m;
        if (num2 != null && indexOf == num2.intValue()) {
            gestaltIconButton.t(aVar);
            hVar.f73847v0 = null;
        } else {
            Integer num3 = hVar.f73847v0;
            if (num3 != null) {
                int intValue = num3.intValue();
                List list2 = hVar.f73851z0;
                if (list2 == null) {
                    Intrinsics.r("answerOptions");
                    throw null;
                }
                GestaltIconButton gestaltIconButton2 = (GestaltIconButton) CollectionsKt.U(intValue, list2);
                if (gestaltIconButton2 != null) {
                    gestaltIconButton2.t(aVar);
                }
            }
            gestaltIconButton.t(a.f73817l);
            num = Integer.valueOf(i13);
            hVar.f73847v0 = Integer.valueOf(indexOf);
        }
        hVar.f8(num);
    }

    @Override // hz.d
    public final void g8(jz.d question, cz.b bVar, om1.e eVar, g0 g0Var, List list) {
        String c13;
        int i13;
        int i14;
        Intrinsics.checkNotNullParameter(question, "question");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        if (dl2.b.T1(requireContext)) {
            if (eVar != null) {
                this.A0 = eVar;
            }
        } else if (list != null) {
            this.B0 = list;
        }
        GestaltText gestaltText = this.f73848w0;
        if (gestaltText == null) {
            Intrinsics.r("tvQuestion");
            throw null;
        }
        gestaltText.i(new hs.a(20, question, this));
        GestaltText gestaltText2 = this.f73848w0;
        if (gestaltText2 == null) {
            Intrinsics.r("tvQuestion");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = gestaltText2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        int i15 = 0;
        if (g0Var != null) {
            if (g0Var != g0.ANKET_INLINE_SURVEY) {
                g0Var = null;
            }
            if (g0Var != null) {
                ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = 0;
                List<GestaltIconButton> list2 = this.f73851z0;
                if (list2 == null) {
                    Intrinsics.r("answerOptions");
                    throw null;
                }
                for (GestaltIconButton gestaltIconButton : list2) {
                    gestaltIconButton.setPaddingRelative(gestaltIconButton.getPaddingStart(), getResources().getDimensionPixelSize(eo1.c.margin), gestaltIconButton.getPaddingEnd(), gestaltIconButton.getPaddingBottom());
                }
            }
        }
        gestaltText2.setLayoutParams(layoutParams2);
        List a13 = question.a();
        if (a13 != null) {
            String c14 = ((gs0) a13.get(0)).c();
            if ((c14 == null || !kotlin.text.z.i(c14, "like", true)) && ((c13 = ((gs0) a13.get(1)).c()) == null || !kotlin.text.z.i(c13, "dislike", true))) {
                i13 = 1;
                i14 = 0;
            } else {
                i14 = 1;
                i13 = 0;
            }
            gs0 gs0Var = (gs0) a13.get(i14);
            GestaltIconButton gestaltIconButton2 = this.f73850y0;
            if (gestaltIconButton2 == null) {
                Intrinsics.r("ibAnswerOptionDislike");
                throw null;
            }
            gestaltIconButton2.t(new wt.c(this, 26));
            com.bumptech.glide.c.m(gestaltIconButton2, new g(this, gs0Var, gestaltIconButton2, 0));
            gs0 gs0Var2 = (gs0) a13.get(i13);
            GestaltIconButton gestaltIconButton3 = this.f73849x0;
            if (gestaltIconButton3 == null) {
                Intrinsics.r("ibAnswerOptionLike");
                throw null;
            }
            gestaltIconButton3.t(new wt.c(this, 26));
            com.bumptech.glide.c.m(gestaltIconButton3, new g(this, gs0Var2, gestaltIconButton3, 1));
        }
        List a14 = question.a();
        if (bVar == null || a14 == null) {
            return;
        }
        Iterator it = a14.iterator();
        while (true) {
            if (!it.hasNext()) {
                i15 = -1;
                break;
            }
            gs0 gs0Var3 = (gs0) it.next();
            List list3 = bVar.f53447a;
            if (Intrinsics.d(list3 != null ? (Integer) CollectionsKt.firstOrNull(list3) : null, gs0Var3.f38133f)) {
                break;
            } else {
                i15++;
            }
        }
        List list4 = this.f73851z0;
        if (list4 == null) {
            Intrinsics.r("answerOptions");
            throw null;
        }
        GestaltIconButton gestaltIconButton4 = (GestaltIconButton) CollectionsKt.U(i15, list4);
        if (gestaltIconButton4 != null) {
            gestaltIconButton4.t(a.f73817l);
        }
        this.f73847v0 = Integer.valueOf(i15);
        Unit unit = Unit.f80348a;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(cz.k.tv_question);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f73848w0 = (GestaltText) findViewById;
        getLayoutInflater().inflate(cz.l.vr_anket_like_buttons, (ViewGroup) onCreateView.findViewById(cz.k.ll_answers), true);
        View findViewById2 = onCreateView.findViewById(cz.k.ib_answer_option_like);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f73849x0 = (GestaltIconButton) findViewById2;
        View findViewById3 = onCreateView.findViewById(cz.k.ib_answer_option_dislike);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        GestaltIconButton gestaltIconButton = (GestaltIconButton) findViewById3;
        this.f73850y0 = gestaltIconButton;
        GestaltIconButton[] gestaltIconButtonArr = new GestaltIconButton[2];
        if (gestaltIconButton == null) {
            Intrinsics.r("ibAnswerOptionDislike");
            throw null;
        }
        gestaltIconButtonArr[0] = gestaltIconButton;
        GestaltIconButton gestaltIconButton2 = this.f73849x0;
        if (gestaltIconButton2 == null) {
            Intrinsics.r("ibAnswerOptionLike");
            throw null;
        }
        gestaltIconButtonArr[1] = gestaltIconButton2;
        this.f73851z0 = f0.j(gestaltIconButtonArr);
        return onCreateView;
    }
}
