package xm1;

import android.content.res.TypedArray;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.modalAlert.GestaltModalAlert;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import u50.f0;

/* loaded from: classes5.dex */
public final class b extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f135360i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltModalAlert f135361j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(GestaltModalAlert gestaltModalAlert, int i13) {
        super(1);
        this.f135360i = i13;
        this.f135361j = gestaltModalAlert;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f135360i;
        GestaltModalAlert gestaltModalAlert = this.f135361j;
        switch (i13) {
            case 0:
                TypedArray $receiver = (TypedArray) obj;
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                f0 f0Var = GestaltModalAlert.f49438l;
                gestaltModalAlert.getClass();
                String string = $receiver.getString(u.GestaltModalAlert_gestalt_modalAlertTitle);
                f0 p23 = string != null ? bs1.c.p2(string) : GestaltModalAlert.f49438l;
                String string2 = $receiver.getString(u.GestaltModalAlert_gestalt_modalAlertText);
                f0 p24 = string2 != null ? bs1.c.p2(string2) : GestaltModalAlert.f49439m;
                String string3 = $receiver.getString(u.GestaltModalAlert_gestalt_modalAlertActionButtonText);
                f0 p25 = string3 != null ? bs1.c.p2(string3) : GestaltModalAlert.f49440n;
                boolean z13 = $receiver.getBoolean(u.GestaltModalAlert_gestalt_modalAlertWithCancelButton, true);
                int i14 = $receiver.getInt(u.GestaltModalAlert_gestalt_modalAlertButtonOrientation, -1);
                d dVar = i14 >= 0 ? d.values()[i14] : GestaltModalAlert.f49441o;
                int i15 = $receiver.getInt(u.GestaltModalAlert_gestalt_modalAlertTitleIcon, -1);
                g gVar = i15 >= 0 ? g.values()[i15] : null;
                boolean z14 = $receiver.getBoolean(u.GestaltModalAlert_gestalt_modalAlertWithDismissIcon, false);
                String string4 = $receiver.getString(u.GestaltModalAlert_gestalt_modalAlertCheckboxLabel);
                break;
            case 1:
                e it = (e) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                f0 f0Var2 = GestaltModalAlert.f49438l;
                gestaltModalAlert.a0(it);
                break;
            default:
                Intrinsics.checkNotNullParameter((gm1.a) obj, "it");
                GestaltButton gestaltButton = gestaltModalAlert.f49452k;
                a aVar = gestaltModalAlert.f49443b;
                gestaltButton.e(aVar);
                gestaltModalAlert.f49449h.b(aVar);
                gestaltModalAlert.f49446e.u(aVar);
                gestaltModalAlert.f49448g.T(aVar);
                break;
        }
        return Unit.f80348a;
    }
}
