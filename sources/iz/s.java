package iz;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import h32.g0;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import rq.l2;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Liz/s;", "Lhz/d;", "<init>", "()V", "anket_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class s extends c0 {

    /* renamed from: x0, reason: collision with root package name */
    public static final /* synthetic */ int f73871x0 = 0;

    /* renamed from: v0, reason: collision with root package name */
    public GestaltText f73872v0;

    /* renamed from: w0, reason: collision with root package name */
    public GestaltTextField f73873w0;

    public s() {
        this.E = cz.l.view_survey_text_question;
    }

    @Override // hz.d
    public final void g8(jz.d question, cz.b bVar, om1.e eVar, g0 g0Var, List list) {
        List c13;
        String str;
        Intrinsics.checkNotNullParameter(question, "question");
        GestaltText gestaltText = this.f73872v0;
        if (gestaltText == null) {
            Intrinsics.r("tvQuestion");
            throw null;
        }
        gestaltText.i(new wt.c(question, 29));
        GestaltTextField gestaltTextField = this.f73873w0;
        if (gestaltTextField == null) {
            Intrinsics.r("etAnswer");
            throw null;
        }
        gestaltTextField.X(new hs.a(23, question, this));
        if (bVar == null || (c13 = bVar.c()) == null || (str = (String) CollectionsKt.firstOrNull(c13)) == null) {
            return;
        }
        GestaltTextField gestaltTextField2 = this.f73873w0;
        if (gestaltTextField2 != null) {
            gestaltTextField2.X(new l2(str, 20));
        } else {
            Intrinsics.r("etAnswer");
            throw null;
        }
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(cz.k.tv_question);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f73872v0 = (GestaltText) findViewById;
        View findViewById2 = onCreateView.findViewById(cz.k.et_message_answer);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        GestaltTextField gestaltTextField = (GestaltTextField) findViewById2;
        this.f73873w0 = gestaltTextField;
        if (gestaltTextField != null) {
            gestaltTextField.Z(new bp.j(7, onCreateView, this));
            return onCreateView;
        }
        Intrinsics.r("etAnswer");
        throw null;
    }
}
