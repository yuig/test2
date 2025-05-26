package iz;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.api.model.gs0;
import com.pinterest.gestalt.radioGroup.GestaltRadioGroup;
import com.pinterest.gestalt.text.GestaltText;
import h32.g0;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import r1.j0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Liz/o;", "Lhz/d;", "<init>", "()V", "anket_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class o extends a0 {

    /* renamed from: x0, reason: collision with root package name */
    public static final /* synthetic */ int f73866x0 = 0;

    /* renamed from: v0, reason: collision with root package name */
    public GestaltText f73867v0;

    /* renamed from: w0, reason: collision with root package name */
    public GestaltRadioGroup f73868w0;

    public o() {
        this.E = cz.l.view_survey_single_question;
    }

    @Override // hz.d
    public final void g8(jz.d question, cz.b bVar, om1.e eVar, g0 g0Var, List list) {
        Intrinsics.checkNotNullParameter(question, "question");
        GestaltText gestaltText = this.f73867v0;
        if (gestaltText == null) {
            Intrinsics.r("tvQuestion");
            throw null;
        }
        String c13 = question.c();
        if (c13 == null) {
            c13 = "";
        }
        pk.a0.p(gestaltText, c13);
        List list2 = question.f77742d;
        if (list2 != null) {
            GestaltRadioGroup gestaltRadioGroup = this.f73868w0;
            if (gestaltRadioGroup == null) {
                Intrinsics.r("rgAnswersGroup");
                throw null;
            }
            kh2.r.p(gestaltRadioGroup.t(new w1.g(list2, 8)), new hs.a(22, list2, this));
        }
        if (bVar == null || list2 == null) {
            return;
        }
        Iterator it = list2.iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            }
            gs0 gs0Var = (gs0) it.next();
            List list3 = bVar.f53447a;
            if (Intrinsics.d(list3 != null ? (Integer) CollectionsKt.firstOrNull(list3) : null, gs0Var.f38133f)) {
                break;
            } else {
                i13++;
            }
        }
        GestaltRadioGroup gestaltRadioGroup2 = this.f73868w0;
        if (gestaltRadioGroup2 == null) {
            Intrinsics.r("rgAnswersGroup");
            throw null;
        }
        gestaltRadioGroup2.t(new j0(i13, 10));
        Unit unit = Unit.f80348a;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(cz.k.tv_question);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f73867v0 = (GestaltText) findViewById;
        View findViewById2 = onCreateView.findViewById(cz.k.rg_answers);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f73868w0 = (GestaltRadioGroup) findViewById2;
        return onCreateView;
    }
}
