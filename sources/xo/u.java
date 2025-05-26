package xo;

import android.view.View;
import androidx.recyclerview.widget.y2;
import com.pinterest.activity.sendapin.model.TypeAheadItem;
import com.pinterest.api.model.b1;
import com.pinterest.api.model.v7;
import com.pinterest.feature.ideaPinCreation.closeup.view.IdeaPinCreationStickerVariantSelector;
import com.pinterest.feature.ideaPinCreation.closeup.view.IdeaPinOverlayViewColorPickerModal;
import com.pinterest.feature.ideaPinCreation.closeup.view.i1;
import com.pinterest.feature.settings.shared.view.SettingsEducationOverlay;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import h32.g0;
import h32.u0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k1.v0;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lq0.f0;
import q91.d1;
import qa2.s1;

/* loaded from: classes3.dex */
public final /* synthetic */ class u implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135560a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f135561b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f135562c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f135563d;

    public /* synthetic */ u(int i13, IdeaPinCreationStickerVariantSelector ideaPinCreationStickerVariantSelector, com.pinterest.feature.ideaPinCreation.closeup.view.w wVar) {
        this.f135560a = 3;
        this.f135561b = i13;
        this.f135562c = ideaPinCreationStickerVariantSelector;
        this.f135563d = wVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f135560a;
        int i14 = this.f135561b;
        Object obj = this.f135563d;
        Object obj2 = this.f135562c;
        switch (i13) {
            case 0:
                v this$0 = (v) obj2;
                w holder = (w) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(holder, "$holder");
                yo.a aVar = (yo.a) this$0.f135567g;
                TypeAheadItem typeAheadItem = (TypeAheadItem) this$0.f135565e.get(i14);
                d0 d0Var = (d0) aVar;
                d0Var.getClass();
                Intrinsics.checkNotNullParameter(typeAheadItem, "typeAheadItem");
                gi.m mVar = d0Var.f135481k;
                if (mVar == null) {
                    Intrinsics.r("boardInviteUtils");
                    throw null;
                }
                v7 v7Var = d0Var.f135489s;
                if (v7Var == null) {
                    Intrinsics.r("board");
                    throw null;
                }
                String uid = v7Var.getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                fk2.c l13 = mVar.F(uid, new TypeAheadItem[]{typeAheadItem}, "message", false).h(wj2.c.a()).l(tk2.e.f118017c);
                Intrinsics.checkNotNullExpressionValue(l13, "subscribeOn(...)");
                nl.b.r(l13, new v0(25, typeAheadItem, d0Var), null, 2);
                pk.a0.l0(holder.f135568u.f34844d);
                pk.a0.v1(holder.f135568u.f34845e);
                this$0.f19331a.d(i14, this$0.f135565e.get(i14), 1);
                return;
            case 1:
                u50.r rVar = (u50.r) obj2;
                b1 b1Var = (b1) obj;
                int i15 = ys.a.f140106y;
                if (rVar != null) {
                    rVar.a(new xs.x(System.currentTimeMillis() * 1000000, b1Var, i14));
                    return;
                }
                return;
            case 2:
                lq0.d0 this$02 = (lq0.d0) obj2;
                f0 holder2 = (f0) obj;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(holder2, "$holder");
                if (this$02.f84291h) {
                    return;
                }
                HashMap hashMap = oq0.b.f97216b;
                Map K = this$02.f84288e.K();
                int W = CollectionsKt.W(hashMap.get(K != null ? (String) K.get(this$02.f84289f.getUid()) : null), this$02.f84287d);
                dq0.h hVar = this$02.f84290g;
                if (i14 == W) {
                    if (hVar != null) {
                        hVar.q3(holder2.f84308u);
                    }
                    this$02.i(i14);
                    this$02.f84291h = true;
                    m60.u.f85943a.e(500L, new jc0.s(true, 0));
                    return;
                }
                if (hVar != null) {
                    hVar.q3(holder2.f84308u);
                }
                this$02.i(i14);
                this$02.i(W);
                this$02.f84291h = true;
                m60.u.f85943a.e(500L, new jc0.s(true, 0));
                return;
            case 3:
                IdeaPinCreationStickerVariantSelector this$03 = (IdeaPinCreationStickerVariantSelector) obj2;
                com.pinterest.feature.ideaPinCreation.closeup.view.w stickerOption = (com.pinterest.feature.ideaPinCreation.closeup.view.w) obj;
                int i16 = IdeaPinCreationStickerVariantSelector.f45994c;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(stickerOption, "$stickerOption");
                if (i14 != this$03.f45995a) {
                    i1 i1Var = (i1) stickerOption.f46353e;
                    int i17 = i1Var.f46198a;
                    IdeaPinOverlayViewColorPickerModal this$04 = i1Var.f46199b;
                    switch (i17) {
                        case 2:
                            int i18 = IdeaPinOverlayViewColorPickerModal.f46009u;
                            Intrinsics.checkNotNullParameter(this$04, "this$0");
                            this$04.g(com.pinterest.feature.ideaPinCreation.closeup.view.u.PRODUCT_TITLE);
                            break;
                        case 3:
                            int i19 = IdeaPinOverlayViewColorPickerModal.f46009u;
                            Intrinsics.checkNotNullParameter(this$04, "this$0");
                            this$04.g(com.pinterest.feature.ideaPinCreation.closeup.view.u.PRODUCT_THUMBNAIL);
                            break;
                        case 4:
                            int i23 = IdeaPinOverlayViewColorPickerModal.f46009u;
                            Intrinsics.checkNotNullParameter(this$04, "this$0");
                            this$04.g(com.pinterest.feature.ideaPinCreation.closeup.view.u.BOARD_DEFAULT);
                            break;
                        default:
                            int i24 = IdeaPinOverlayViewColorPickerModal.f46009u;
                            Intrinsics.checkNotNullParameter(this$04, "this$0");
                            this$04.g(com.pinterest.feature.ideaPinCreation.closeup.view.u.BOARD_ONE_LINE);
                            break;
                    }
                    this$03.f45995a = i14;
                    Iterator it = this$03.f45996b.iterator();
                    int i25 = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i26 = i25 + 1;
                        if (i25 < 0) {
                            kotlin.collections.f0.p();
                            throw null;
                        }
                        com.pinterest.feature.ideaPinCreation.closeup.view.w wVar = (com.pinterest.feature.ideaPinCreation.closeup.view.w) next;
                        if (i25 != this$03.f45995a) {
                            wVar.f46352d = false;
                        }
                        i25 = i26;
                    }
                    this$03.b();
                    return;
                }
                return;
            case 4:
                p91.o this$05 = (p91.o) obj2;
                p91.m holder3 = (p91.m) obj;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                Intrinsics.checkNotNullParameter(holder3, "$holder");
                this$05.f99315f.s7().F(g0.LANGUAGE_ADDITIONAL_MENU, u0.ADDITIONAL_LANGUAGE);
                fm1.c cVar = holder3.f99299w.w().f96642d;
                fm1.c cVar2 = fm1.c.VISIBLE;
                d1 d1Var = this$05.f99315f;
                List list = this$05.f99314e;
                GestaltText gestaltText = holder3.f99298v;
                GestaltIconButton gestaltIconButton = holder3.f99299w;
                if (cVar == cVar2) {
                    gestaltIconButton.t(p91.n.f99304n);
                    gestaltText.i(p91.n.f99305o);
                    ((m91.n) list.get(i14)).f86743c = false;
                    String codeLocale = ((m91.n) list.get(i14)).f86741a;
                    d1Var.getClass();
                    Intrinsics.checkNotNullParameter(codeLocale, "codeLocale");
                    d1Var.Z7(null, codeLocale);
                    d1Var.f103087g0.remove(codeLocale);
                    return;
                }
                ((m91.n) list.get(i14)).f86743c = true;
                gestaltIconButton.t(p91.n.f99306p);
                gestaltText.i(p91.n.f99307q);
                String codeLocale2 = ((m91.n) list.get(i14)).f86741a;
                d1Var.getClass();
                Intrinsics.checkNotNullParameter(codeLocale2, "codeLocale");
                d1Var.Z7(codeLocale2, null);
                d1Var.f103087g0.add(codeLocale2);
                return;
            case 5:
                SettingsEducationOverlay this$06 = (SettingsEducationOverlay) obj2;
                List steps = (List) obj;
                int i27 = SettingsEducationOverlay.f48329c;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                Intrinsics.checkNotNullParameter(steps, "$steps");
                this$06.b(i14 + 1, steps);
                return;
            default:
                rb2.i this$07 = (rb2.i) obj2;
                z40.f contactRequest = (z40.f) obj;
                int i28 = rb2.i.f107163x;
                Intrinsics.checkNotNullParameter(this$07, "this$0");
                Intrinsics.checkNotNullParameter(contactRequest, "$contactRequest");
                this$07.g(i14, contactRequest);
                return;
        }
    }

    public /* synthetic */ u(Object obj, Object obj2, int i13, int i14) {
        this.f135560a = i14;
        this.f135562c = obj;
        this.f135563d = obj2;
        this.f135561b = i13;
    }

    public /* synthetic */ u(s1 s1Var, int i13, y2 y2Var, int i14) {
        this.f135560a = i14;
        this.f135562c = s1Var;
        this.f135561b = i13;
        this.f135563d = y2Var;
    }
}
