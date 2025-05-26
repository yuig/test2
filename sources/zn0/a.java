package zn0;

import com.pinterest.gestalt.textfield.view.GestaltTextField;
import h32.u0;
import kotlin.jvm.internal.Intrinsics;
import xn1.i;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142261a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f142262b;

    public /* synthetic */ a(d dVar, int i13) {
        this.f142261a = i13;
        this.f142262b = dVar;
    }

    @Override // gm1.a
    public final void h3(gm1.c it) {
        int i13 = this.f142261a;
        d this$0 = this.f142262b;
        switch (i13) {
            case 0:
                int i14 = d.f142270u0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                GestaltTextField gestaltTextField = this$0.f142272k0;
                if (gestaltTextField == null) {
                    Intrinsics.r("boardSectionNameEditField");
                    throw null;
                }
                String B0 = gestaltTextField.B0();
                yn0.d dVar = this$0.f142277p0;
                if (dVar != null) {
                    dVar.r3(B0);
                }
                this$0.s7().X(u0.BOARD_SECTION_DONE_BUTTON);
                return;
            default:
                int i15 = d.f142270u0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (it instanceof i) {
                    yn0.d dVar2 = this$0.f142277p0;
                    if (dVar2 != null) {
                        dVar2.q3(((i) it).f135454c);
                    }
                    if (((i) it).f135454c.length() > 50) {
                        GestaltTextField gestaltTextField2 = this$0.f142272k0;
                        if (gestaltTextField2 == null) {
                            Intrinsics.r("boardSectionNameEditField");
                            throw null;
                        }
                        gestaltTextField2.X(c.f142266k);
                        this$0.c8(false);
                        return;
                    }
                    return;
                }
                if (it instanceof xn1.f) {
                    if (((xn1.f) it).f135448c) {
                        GestaltTextField gestaltTextField3 = this$0.f142272k0;
                        if (gestaltTextField3 != null) {
                            hf0.b.s(gestaltTextField3);
                            return;
                        } else {
                            Intrinsics.r("boardSectionNameEditField");
                            throw null;
                        }
                    }
                    GestaltTextField gestaltTextField4 = this$0.f142272k0;
                    if (gestaltTextField4 != null) {
                        hf0.b.k(gestaltTextField4);
                        return;
                    } else {
                        Intrinsics.r("boardSectionNameEditField");
                        throw null;
                    }
                }
                return;
        }
    }
}
