package hu;

import android.content.Context;
import android.os.Bundle;
import com.pinterest.component.modal.BaseModalViewWrapper;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import java.util.List;
import jc0.n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nt.s1;
import ps.s;
import rq.n3;

/* loaded from: classes3.dex */
public final class e extends jc0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f70388a;

    /* renamed from: b, reason: collision with root package name */
    public final List f70389b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f70390c;

    public e(int i13, List dobMonthList, s1 handleAction) {
        this.f70388a = i13;
        if (i13 != 1) {
            Intrinsics.checkNotNullParameter(dobMonthList, "countryList");
            Intrinsics.checkNotNullParameter(handleAction, "handleAction");
            this.f70389b = dobMonthList;
            this.f70390c = handleAction;
            return;
        }
        Intrinsics.checkNotNullParameter(dobMonthList, "dobMonthList");
        Intrinsics.checkNotNullParameter(handleAction, "handleAction");
        this.f70389b = dobMonthList;
        this.f70390c = handleAction;
    }

    @Override // jc0.b
    public final BaseModalViewWrapper createModalView(Context context, Bundle bundle) {
        int i13 = 4;
        int i14 = this.f70388a;
        Function1 function1 = this.f70390c;
        List list = this.f70389b;
        switch (i14) {
            case 0:
                Intrinsics.checkNotNullParameter(context, "context");
                n nVar = new n(context);
                nVar.x(new f(context, list, function1));
                nVar.l(s.country);
                nVar.q(true);
                nVar.k();
                nVar.o(true);
                GestaltIconButton gestaltIconButton = nVar.f44749a;
                if (gestaltIconButton != null) {
                    gestaltIconButton.u(new n3(i13));
                }
                nVar.Y(false);
                nVar.T(false);
                return nVar;
            default:
                Intrinsics.checkNotNullParameter(context, "context");
                n nVar2 = new n(context);
                nVar2.x(new iu.c(context, list, function1));
                nVar2.l(s.lead_gen_date_of_birth_month);
                nVar2.q(true);
                nVar2.k();
                nVar2.o(true);
                GestaltIconButton gestaltIconButton2 = nVar2.f44749a;
                if (gestaltIconButton2 != null) {
                    gestaltIconButton2.u(new n3(i13));
                }
                nVar2.Y(false);
                nVar2.T(false);
                return nVar2;
        }
    }
}
