package dv0;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.rj0;
import com.pinterest.api.model.wy0;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import kh2.m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;

/* loaded from: classes5.dex */
public final /* synthetic */ class b extends kotlin.jvm.internal.p implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        f30 pin = (f30) obj;
        Intrinsics.checkNotNullParameter(pin, "p0");
        d dVar = (d) this.receiver;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(pin, "pin");
        dVar.f56317f = pin;
        rj0 u63 = pin.u6();
        if (u63 != null) {
            av0.b bVar = (av0.b) dVar.getView();
            wy0 e13 = u63.e();
            ev0.d dVar2 = (ev0.d) bVar;
            String str = "";
            if (e13 != null) {
                GestaltText gestaltText = dVar2.f60247m0;
                if (gestaltText == null) {
                    Intrinsics.r("brandName");
                    throw null;
                }
                String Z2 = e13.Z2();
                if (Z2 == null) {
                    Z2 = "";
                }
                a0.p(gestaltText, Z2);
                GestaltAvatar gestaltAvatar = dVar2.f60248n0;
                if (gestaltAvatar == null) {
                    Intrinsics.r("brandAvatar");
                    throw null;
                }
                m0.V0(gestaltAvatar, e13);
            } else {
                dVar2.getClass();
            }
            av0.b bVar2 = (av0.b) dVar.getView();
            rj0.a f13 = u63.f();
            ev0.d dVar3 = (ev0.d) bVar2;
            GestaltText gestaltText2 = dVar3.f60249o0;
            if (gestaltText2 == null) {
                Intrinsics.r("brandStatus");
                throw null;
            }
            int i13 = f13 == null ? -1 : ev0.c.f60242a[f13.ordinal()];
            if (i13 == 1) {
                GestaltIconButton gestaltIconButton = dVar3.f60251q0;
                if (gestaltIconButton == null) {
                    Intrinsics.r("brandRemovalButton");
                    throw null;
                }
                com.bumptech.glide.c.u1(gestaltIconButton);
                str = bs1.c.b2(dq1.f.idea_pin_partner_status_approved);
            } else if (i13 == 2) {
                GestaltIconButton gestaltIconButton2 = dVar3.f60251q0;
                if (gestaltIconButton2 == null) {
                    Intrinsics.r("brandRemovalButton");
                    throw null;
                }
                com.bumptech.glide.c.u1(gestaltIconButton2);
                str = bs1.c.b2(dq1.f.idea_pin_partner_status_pending);
            } else if (i13 == 3) {
                GestaltText gestaltText3 = dVar3.f60250p0;
                if (gestaltText3 == null) {
                    Intrinsics.r("brandRejectionMessage");
                    throw null;
                }
                a0.w1(gestaltText3);
                str = bs1.c.b2(dq1.f.idea_pin_partner_status_denied);
            }
            Intrinsics.f(str);
            a0.p(gestaltText2, str);
        }
        return Unit.f80348a;
    }
}
