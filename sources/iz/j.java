package iz;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import c2.m4;
import com.pinterest.api.model.gs0;
import com.pinterest.gestalt.checkbox.GestaltCheckBox;
import com.pinterest.gestalt.text.GestaltText;
import h32.g0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Liz/j;", "Lhz/d;", "<init>", "()V", "anket_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class j extends y {

    /* renamed from: y0, reason: collision with root package name */
    public static final /* synthetic */ int f73852y0 = 0;

    /* renamed from: v0, reason: collision with root package name */
    public GestaltText f73853v0;

    /* renamed from: w0, reason: collision with root package name */
    public LinearLayout f73854w0;

    /* renamed from: x0, reason: collision with root package name */
    public final LinkedHashMap f73855x0 = new LinkedHashMap();

    public j() {
        this.E = cz.l.view_survey_multiple_question;
    }

    @Override // hz.d
    public final void g8(jz.d question, cz.b bVar, om1.e eVar, g0 g0Var, List list) {
        Intrinsics.checkNotNullParameter(question, "question");
        GestaltText gestaltText = this.f73853v0;
        if (gestaltText == null) {
            Intrinsics.r("tvQuestion");
            throw null;
        }
        String c13 = question.c();
        if (c13 == null) {
            c13 = "";
        }
        pk.a0.p(gestaltText, c13);
        LinearLayout linearLayout = this.f73854w0;
        if (linearLayout == null) {
            Intrinsics.r("llAnswersBoxes");
            throw null;
        }
        linearLayout.removeAllViews();
        List a13 = question.a();
        int i13 = 0;
        if (a13 != null) {
            int i14 = 0;
            for (Object obj : a13) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    f0.p();
                    throw null;
                }
                Context requireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                GestaltCheckBox L = new GestaltCheckBox(requireContext).L(new m4((gs0) obj, i14, 4));
                c0.d.l(L, new sv.y(this, L, question, 2));
                LinearLayout linearLayout2 = this.f73854w0;
                if (linearLayout2 == null) {
                    Intrinsics.r("llAnswersBoxes");
                    throw null;
                }
                linearLayout2.addView(L);
                i14 = i15;
            }
        }
        List a14 = question.a();
        if (bVar != null) {
            LinkedHashMap linkedHashMap = this.f73855x0;
            if (a14 != null) {
                for (Object obj2 : a14) {
                    int i16 = i13 + 1;
                    if (i13 < 0) {
                        f0.p();
                        throw null;
                    }
                    gs0 gs0Var = (gs0) obj2;
                    List list2 = bVar.f53447a;
                    if (list2 != null && CollectionsKt.L(list2, gs0Var.f38133f)) {
                        linkedHashMap.put(Integer.valueOf(i13), gs0Var.f38133f);
                    }
                    i13 = i16;
                }
            }
            List list3 = a14;
            if (list3 != null && !list3.isEmpty()) {
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    LinearLayout linearLayout3 = this.f73854w0;
                    if (linearLayout3 == null) {
                        Intrinsics.r("llAnswersBoxes");
                        throw null;
                    }
                    ((GestaltCheckBox) d7.b.I(linearLayout3, ((Number) entry.getKey()).intValue())).L(a.f73819n);
                }
            }
            Unit unit = Unit.f80348a;
        }
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(cz.k.tv_question);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f73853v0 = (GestaltText) findViewById;
        View findViewById2 = onCreateView.findViewById(cz.k.ll_answers);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f73854w0 = (LinearLayout) findViewById2;
        return onCreateView;
    }
}
