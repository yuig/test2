package iz;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Liz/c;", "Lhz/d;", "<init>", "()V", "anket_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class c extends v {
    public static final /* synthetic */ int B0 = 0;
    public List A0;

    /* renamed from: v0, reason: collision with root package name */
    public Integer f73833v0;

    /* renamed from: w0, reason: collision with root package name */
    public GestaltText f73834w0;

    /* renamed from: x0, reason: collision with root package name */
    public GestaltIconButton f73835x0;

    /* renamed from: y0, reason: collision with root package name */
    public GestaltIconButton f73836y0;

    /* renamed from: z0, reason: collision with root package name */
    public GestaltIconButton f73837z0;

    public c() {
        this.E = cz.l.view_survey_emoji_question;
    }

    public static final void j8(c cVar, GestaltIconButton gestaltIconButton, int i13) {
        List list = cVar.A0;
        Integer num = null;
        if (list == null) {
            Intrinsics.r("answersGroup");
            throw null;
        }
        int indexOf = list.indexOf(gestaltIconButton);
        Integer num2 = cVar.f73833v0;
        a aVar = a.f73816k;
        if (num2 != null && indexOf == num2.intValue()) {
            gestaltIconButton.t(aVar);
            cVar.f73833v0 = null;
        } else {
            Integer num3 = cVar.f73833v0;
            if (num3 != null) {
                int intValue = num3.intValue();
                List list2 = cVar.A0;
                if (list2 == null) {
                    Intrinsics.r("answersGroup");
                    throw null;
                }
                GestaltIconButton gestaltIconButton2 = (GestaltIconButton) CollectionsKt.U(intValue, list2);
                if (gestaltIconButton2 != null) {
                    gestaltIconButton2.t(aVar);
                }
            }
            gestaltIconButton.t(a.f73815j);
            num = Integer.valueOf(i13);
            cVar.f73833v0 = Integer.valueOf(indexOf);
        }
        cVar.f8(num);
    }

    @Override // hz.d
    public final void g8(jz.d question, cz.b bVar, om1.e eVar, g0 g0Var, List list) {
        Intrinsics.checkNotNullParameter(question, "question");
        GestaltText gestaltText = this.f73834w0;
        if (gestaltText == null) {
            Intrinsics.r("tvQuestion");
            throw null;
        }
        gestaltText.i(new hs.a(19, question, this));
        List a13 = question.a();
        int i13 = 0;
        if (a13 != null) {
            gs0 gs0Var = (gs0) a13.get(0);
            GestaltIconButton gestaltIconButton = this.f73836y0;
            if (gestaltIconButton == null) {
                Intrinsics.r("imgAnswerOptionMeh");
                throw null;
            }
            com.bumptech.glide.c.m(gestaltIconButton, new b(this, gs0Var, 0));
            gs0 gs0Var2 = (gs0) a13.get(1);
            GestaltIconButton gestaltIconButton2 = this.f73835x0;
            if (gestaltIconButton2 == null) {
                Intrinsics.r("imgAnswerOptionSad");
                throw null;
            }
            com.bumptech.glide.c.m(gestaltIconButton2, new b(this, gs0Var2, 1));
            gs0 gs0Var3 = (gs0) a13.get(2);
            GestaltIconButton gestaltIconButton3 = this.f73837z0;
            if (gestaltIconButton3 == null) {
                Intrinsics.r("imgAnswerOptionHappy");
                throw null;
            }
            com.bumptech.glide.c.m(gestaltIconButton3, new b(this, gs0Var3, 2));
        }
        List a14 = question.a();
        if (bVar == null || a14 == null) {
            return;
        }
        Iterator it = a14.iterator();
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            }
            gs0 gs0Var4 = (gs0) it.next();
            List b13 = bVar.b();
            if (Intrinsics.d(b13 != null ? (Integer) CollectionsKt.firstOrNull(b13) : null, gs0Var4.d())) {
                break;
            } else {
                i13++;
            }
        }
        List list2 = this.A0;
        if (list2 == null) {
            Intrinsics.r("answersGroup");
            throw null;
        }
        GestaltIconButton gestaltIconButton4 = (GestaltIconButton) CollectionsKt.U(i13, list2);
        if (gestaltIconButton4 != null) {
            gestaltIconButton4.t(a.f73815j);
        }
        this.f73833v0 = Integer.valueOf(i13);
        Unit unit = Unit.f80348a;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(cz.k.tv_question);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f73834w0 = (GestaltText) findViewById;
        View findViewById2 = onCreateView.findViewById(cz.k.bt_answer_option_meh);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f73836y0 = (GestaltIconButton) findViewById2;
        View findViewById3 = onCreateView.findViewById(cz.k.bt_answer_option_sad);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f73835x0 = (GestaltIconButton) findViewById3;
        View findViewById4 = onCreateView.findViewById(cz.k.bt_answer_option_happy);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        GestaltIconButton gestaltIconButton = (GestaltIconButton) findViewById4;
        this.f73837z0 = gestaltIconButton;
        GestaltIconButton[] gestaltIconButtonArr = new GestaltIconButton[3];
        GestaltIconButton gestaltIconButton2 = this.f73836y0;
        if (gestaltIconButton2 == null) {
            Intrinsics.r("imgAnswerOptionMeh");
            throw null;
        }
        gestaltIconButtonArr[0] = gestaltIconButton2;
        GestaltIconButton gestaltIconButton3 = this.f73835x0;
        if (gestaltIconButton3 == null) {
            Intrinsics.r("imgAnswerOptionSad");
            throw null;
        }
        gestaltIconButtonArr[1] = gestaltIconButton3;
        if (gestaltIconButton == null) {
            Intrinsics.r("imgAnswerOptionHappy");
            throw null;
        }
        gestaltIconButtonArr[2] = gestaltIconButton;
        this.A0 = f0.j(gestaltIconButtonArr);
        return onCreateView;
    }
}
