package fk0;

import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.switchComponent.GestaltSwitchWithLabel;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import rc0.z0;
import u50.k0;

/* loaded from: classes5.dex */
public final /* synthetic */ class h implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f62280a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f62281b;

    public /* synthetic */ h(k kVar, int i13) {
        this.f62280a = i13;
        this.f62281b = kVar;
    }

    @Override // gm1.a
    public final void h3(gm1.c event) {
        int i13 = this.f62280a;
        int i14 = 1;
        k this$0 = this.f62281b;
        switch (i13) {
            case 0:
                int i15 = k.L0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event.j() == x60.c.create_board_button_id) {
                    lj0.a aVar = this$0.H0;
                    GestaltButton.SmallPrimaryButton smallPrimaryButton = this$0.f62301q0;
                    if (smallPrimaryButton != null) {
                        aVar.onClick(smallPrimaryButton);
                        return;
                    } else {
                        Intrinsics.r("createBtn");
                        throw null;
                    }
                }
                return;
            case 1:
                int i16 = k.L0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(event, "event");
                GestaltSwitchWithLabel gestaltSwitchWithLabel = this$0.f62295k0;
                if (gestaltSwitchWithLabel != null) {
                    gestaltSwitchWithLabel.T(new z0(i14, event));
                    return;
                } else {
                    Intrinsics.r("secretBoardToggle");
                    throw null;
                }
            case 2:
                int i17 = k.L0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                if (event instanceof xn1.f) {
                    if (((xn1.f) event).f135448c) {
                        if (this$0.f62303s0) {
                            hf0.b.t(this$0.requireContext());
                            return;
                        } else {
                            this$0.f62303s0 = true;
                            return;
                        }
                    }
                    GestaltTextField gestaltTextField = this$0.f62302r0;
                    if (gestaltTextField != null) {
                        hf0.b.k(gestaltTextField);
                        return;
                    } else {
                        Intrinsics.r("boardNameEt");
                        throw null;
                    }
                }
                return;
            default:
                int i18 = k.L0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                if (event instanceof xn1.i) {
                    xn1.i iVar = (xn1.i) event;
                    String str = iVar.f135454c;
                    boolean a13 = com.pinterest.feature.board.create.b.a(str, 50);
                    GestaltButton.SmallPrimaryButton smallPrimaryButton2 = this$0.f62301q0;
                    if (smallPrimaryButton2 == null) {
                        Intrinsics.r("createBtn");
                        throw null;
                    }
                    bs1.c.s(smallPrimaryButton2, new jc0.m(a13, 9));
                    if (this$0.f62308x0) {
                        this$0.f62308x0 = false;
                    } else {
                        ek0.h hVar = this$0.f62305u0;
                        if (hVar != null) {
                            hVar.I = -1;
                        }
                    }
                    if (a13 || iVar.f135454c.length() == 0) {
                        GestaltTextField gestaltTextField2 = this$0.f62302r0;
                        if (gestaltTextField2 == null) {
                            Intrinsics.r("boardNameEt");
                            throw null;
                        }
                        ph.a.p(gestaltTextField2, i.f62282j);
                    } else {
                        if (str.length() > 50) {
                            int i19 = x60.e.invalid_board_name_length;
                            String[] formatArgs = new String[0];
                            Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                            this$0.f8(new k0(i19, new ArrayList(0)));
                        } else {
                            int i23 = x60.e.msg_invalid_board_name_letter_number;
                            String[] formatArgs2 = new String[0];
                            Intrinsics.checkNotNullParameter(formatArgs2, "formatArgs");
                            this$0.f8(new k0(i23, new ArrayList(0)));
                        }
                        GestaltTextField gestaltTextField3 = this$0.f62302r0;
                        if (gestaltTextField3 == null) {
                            Intrinsics.r("boardNameEt");
                            throw null;
                        }
                        hf0.b.s(gestaltTextField3);
                    }
                    GestaltTextField gestaltTextField4 = this$0.f62302r0;
                    if (gestaltTextField4 != null) {
                        gestaltTextField4.requestFocus();
                        return;
                    } else {
                        Intrinsics.r("boardNameEt");
                        throw null;
                    }
                }
                return;
        }
    }
}
