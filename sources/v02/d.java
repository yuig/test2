package v02;

import android.view.View;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.y4;
import com.pinterest.settings.SettingsRoundHeaderView;
import com.pinterest.ui.actionbar.LegoActionBar;
import com.pinterest.ui.components.actionsheets.ActionSheetOptionView;
import kotlin.jvm.internal.Intrinsics;
import rb2.z;
import rl1.w;

/* loaded from: classes4.dex */
public final /* synthetic */ class d implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123784a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f123785b;

    public /* synthetic */ d(Object obj, int i13) {
        this.f123784a = i13;
        this.f123785b = obj;
    }

    @Override // gm1.a
    public final void h3(gm1.c event) {
        View.OnClickListener onClickListener;
        da2.h hVar;
        int i13 = this.f123784a;
        Object obj = this.f123785b;
        switch (i13) {
            case 0:
                j this$0 = (j) obj;
                int i14 = j.A0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event instanceof xl1.a) {
                    j02.b bVar = this$0.f123798m0;
                    if (bVar != null) {
                        ((n02.o) bVar).r3();
                        return;
                    } else {
                        Intrinsics.r("viewListener");
                        throw null;
                    }
                }
                return;
            case 1:
                SettingsRoundHeaderView this$02 = (SettingsRoundHeaderView) obj;
                int i15 = SettingsRoundHeaderView.f51775f;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                if (!(event instanceof om1.l) || (onClickListener = this$02.f51780e) == null) {
                    return;
                }
                GestaltIconButton gestaltIconButton = this$02.f51777b;
                if (gestaltIconButton != null) {
                    onClickListener.onClick(gestaltIconButton);
                    return;
                } else {
                    Intrinsics.r("cancelIcon");
                    throw null;
                }
            case 2:
                z92.g actionSpec = (z92.g) obj;
                int i16 = LegoActionBar.f52202h;
                Intrinsics.checkNotNullParameter(actionSpec, "$actionSpec");
                Intrinsics.checkNotNullParameter(event, "it");
                if (event instanceof om1.l) {
                    actionSpec.f141442b.invoke();
                    return;
                }
                return;
            case 3:
                xd1.e this$03 = (xd1.e) obj;
                int i17 = xd1.e.f134630e;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                if (!(event instanceof om1.l) || (hVar = (da2.h) this$03.f134632b) == null) {
                    return;
                }
                s81.p pVar = (s81.p) hVar;
                if (pVar.isBound()) {
                    pVar.U3();
                    return;
                }
                return;
            case 4:
                ha2.t option = (ha2.t) obj;
                int i18 = ActionSheetOptionView.f52250c;
                Intrinsics.checkNotNullParameter(option, "$option");
                Intrinsics.checkNotNullParameter(event, "it");
                option.f68474b.invoke();
                return;
            case 5:
                va2.n this$04 = (va2.n) obj;
                int i19 = va2.n.C;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event instanceof w) {
                    this$04.f125415l.invalidate();
                    return;
                }
                return;
            case 6:
                rb2.w this$05 = (rb2.w) obj;
                int i23 = rb2.w.f107225f;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                if (event instanceof rn1.f) {
                    this$05.getClass();
                    NavigationImpl w13 = Navigation.w1((ScreenLocation) y4.f51625d.getValue());
                    m60.w wVar = this$05.f107228c;
                    if (wVar == null) {
                        Intrinsics.r("eventManager");
                        throw null;
                    }
                    wVar.d(new kp.j());
                    m60.w wVar2 = this$05.f107228c;
                    if (wVar2 != null) {
                        wVar2.d(w13);
                        return;
                    } else {
                        Intrinsics.r("eventManager");
                        throw null;
                    }
                }
                return;
            case 7:
                z this$06 = (z) obj;
                int i24 = z.f107233f;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                if (event instanceof rn1.f) {
                    this$06.getClass();
                    NavigationImpl w14 = Navigation.w1((ScreenLocation) y4.f51622a.getValue());
                    w14.y0(Boolean.TRUE, "com.pinterest.EXTRA_IS_CONTACT_REQUEST_ON_DETAILS_PAGE");
                    m60.w wVar3 = this$06.f107236c;
                    if (wVar3 == null) {
                        Intrinsics.r("eventManager");
                        throw null;
                    }
                    wVar3.d(new kp.j());
                    m60.w wVar4 = this$06.f107236c;
                    if (wVar4 != null) {
                        wVar4.d(w14);
                        return;
                    } else {
                        Intrinsics.r("eventManager");
                        throw null;
                    }
                }
                return;
            default:
                ad2.h this$07 = (ad2.h) obj;
                int i25 = ad2.h.H0;
                Intrinsics.checkNotNullParameter(this$07, "this$0");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event instanceof cn1.q) {
                    ((ad2.u) this$07.F0.getValue()).f2120f.e().a(new ad2.d(((cn1.q) event).f28232c));
                    return;
                }
                return;
        }
    }
}
