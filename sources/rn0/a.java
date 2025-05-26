package rn0;

import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.navigation.Navigation;
import h32.u0;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import xn1.i;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108821a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f108822b;

    public /* synthetic */ a(e eVar, int i13) {
        this.f108821a = i13;
        this.f108822b = eVar;
    }

    @Override // gm1.a
    public final void h3(gm1.c it) {
        int i13 = this.f108821a;
        e this$0 = this.f108822b;
        switch (i13) {
            case 0:
                int i14 = e.f108830v0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                GestaltTextField gestaltTextField = this$0.f108832f0;
                if (gestaltTextField == null) {
                    Intrinsics.r("boardSectionTitleEditText");
                    throw null;
                }
                hf0.b.k(gestaltTextField);
                ln0.a aVar = this$0.f108840n0;
                if (aVar != null) {
                    GestaltTextField gestaltTextField2 = this$0.f108832f0;
                    if (gestaltTextField2 == null) {
                        Intrinsics.r("boardSectionTitleEditText");
                        throw null;
                    }
                    ((mn0.e) aVar).q3(String.valueOf(gestaltTextField2.z0()));
                }
                HashMap hashMap = new HashMap();
                com.pinterest.feature.boardsection.a aVar2 = this$0.f108841o0;
                if (aVar2 == null) {
                    Intrinsics.r("boardSectionActionMode");
                    throw null;
                }
                String value = aVar2.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                hashMap.put("reason", value);
                Navigation navigation = this$0.I;
                String v03 = navigation != null ? navigation.v0("com.pinterest.EXTRA_SESSION_ID") : null;
                if (v03 != null) {
                    hashMap.put("save_session_id", v03);
                }
                GestaltButton.SmallPrimaryButton smallPrimaryButton = this$0.f108833g0;
                if (smallPrimaryButton != null) {
                    this$0.s7().Z(Intrinsics.d(smallPrimaryButton.getText().toString(), this$0.getResources().getString(x0.done)) ? u0.BOARD_SECTION_DONE_BUTTON : u0.BOARD_SECTION_NEXT_BUTTON, hashMap);
                    return;
                } else {
                    Intrinsics.r("actionButton");
                    throw null;
                }
            default:
                int i15 = e.f108830v0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "event");
                if (it instanceof i) {
                    String str = ((i) it).f135454c;
                    ln0.a aVar3 = this$0.f108840n0;
                    if (aVar3 != null) {
                        ((mn0.e) aVar3).s3(str);
                    }
                }
                if (it instanceof xn1.f) {
                    if (((xn1.f) it).f135448c) {
                        GestaltTextField gestaltTextField3 = this$0.f108832f0;
                        if (gestaltTextField3 != null) {
                            hf0.b.s(gestaltTextField3);
                            return;
                        } else {
                            Intrinsics.r("boardSectionTitleEditText");
                            throw null;
                        }
                    }
                    GestaltTextField gestaltTextField4 = this$0.f108832f0;
                    if (gestaltTextField4 != null) {
                        hf0.b.k(gestaltTextField4);
                        return;
                    } else {
                        Intrinsics.r("boardSectionTitleEditText");
                        throw null;
                    }
                }
                return;
        }
    }
}
