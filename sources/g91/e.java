package g91;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.pinterest.component.modal.BaseModalViewWrapper;
import com.pinterest.component.modal.ModalViewWrapper;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import h32.d4;
import h32.i0;
import j91.l;
import nx.f0;
import nx.j0;
import nx.m;
import rq.n3;

/* loaded from: classes5.dex */
public final class e extends jc0.b implements nx.a {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f64572a;

    /* renamed from: b, reason: collision with root package name */
    public final String f64573b;

    public e(String str, f0 f0Var) {
        this.f64572a = ((m) f0Var).a(this);
        this.f64573b = str;
    }

    @Override // jc0.b
    public final BaseModalViewWrapper createModalView(Context context, Bundle bundle) {
        final int i13 = 0;
        ModalViewWrapper modalViewWrapper = new ModalViewWrapper(context, false);
        final l lVar = new l(context);
        View.inflate(lVar.getContext(), x42.b.view_send_message_modal, lVar);
        final int i14 = 1;
        lVar.setOrientation(1);
        lVar.f75139f = (GestaltTextField) lVar.findViewById(x42.a.message_et);
        lVar.f75140g = (GestaltButton) lVar.findViewById(x42.a.send_btn);
        GestaltButton gestaltButton = (GestaltButton) lVar.findViewById(x42.a.send_btn_small);
        lVar.f75141h = gestaltButton;
        gestaltButton.e(new gm1.a() { // from class: j91.k
            @Override // gm1.a
            public final void h3(gm1.c cVar) {
                int i15 = i13;
                l lVar2 = lVar;
                switch (i15) {
                    case 0:
                        hf0.b.k(lVar2.f75141h);
                        lVar2.a();
                        break;
                    case 1:
                        lVar2.a();
                        break;
                    default:
                        lVar2.getClass();
                        if (cVar instanceof xn1.f) {
                            boolean z13 = ((xn1.f) cVar).f135448c;
                            lVar2.f75141h.d(new bp.d(z13, 9));
                            lVar2.f75140g.d(new bp.d(z13, 10));
                            break;
                        }
                        break;
                }
            }
        });
        lVar.f75140g.e(new gm1.a() { // from class: j91.k
            @Override // gm1.a
            public final void h3(gm1.c cVar) {
                int i15 = i14;
                l lVar2 = lVar;
                switch (i15) {
                    case 0:
                        hf0.b.k(lVar2.f75141h);
                        lVar2.a();
                        break;
                    case 1:
                        lVar2.a();
                        break;
                    default:
                        lVar2.getClass();
                        if (cVar instanceof xn1.f) {
                            boolean z13 = ((xn1.f) cVar).f135448c;
                            lVar2.f75141h.d(new bp.d(z13, 9));
                            lVar2.f75140g.d(new bp.d(z13, 10));
                            break;
                        }
                        break;
                }
            }
        });
        final int i15 = 2;
        lVar.f75139f.Z(new gm1.a() { // from class: j91.k
            @Override // gm1.a
            public final void h3(gm1.c cVar) {
                int i152 = i15;
                l lVar2 = lVar;
                switch (i152) {
                    case 0:
                        hf0.b.k(lVar2.f75141h);
                        lVar2.a();
                        break;
                    case 1:
                        lVar2.a();
                        break;
                    default:
                        lVar2.getClass();
                        if (cVar instanceof xn1.f) {
                            boolean z13 = ((xn1.f) cVar).f135448c;
                            lVar2.f75141h.d(new bp.d(z13, 9));
                            lVar2.f75140g.d(new bp.d(z13, 10));
                            break;
                        }
                        break;
                }
            }
        });
        lVar.f75136c = this.f64572a;
        lVar.f75137d = this.f64573b;
        modalViewWrapper.t(lVar);
        modalViewWrapper.l(x42.c.empty_messages_action);
        ((GestaltIconButton) modalViewWrapper.findViewById(ga2.d.modal_header_dismiss_bt)).u(new n3(10));
        return modalViewWrapper;
    }

    @Override // nx.a
    public final i0 generateLoggingContext() {
        return new i0(d4.SEND_SHARE, null, null, null, null, null);
    }

    @Override // nx.a
    public final String getUniqueScreenKey() {
        return null;
    }

    @Override // jc0.a0
    public final void onAboutToDismiss() {
    }
}
