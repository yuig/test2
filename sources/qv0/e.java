package qv0;

import android.content.Context;
import android.widget.FrameLayout;
import com.pinterest.navigation.Navigation;
import h32.d4;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nx.f0;

/* loaded from: classes5.dex */
public final class e extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f105176i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g f105177j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(g gVar, int i13) {
        super(0);
        this.f105176i = i13;
        this.f105177j = gVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f105176i;
        g gVar = this.f105177j;
        switch (i13) {
            case 0:
                f0 b73 = gVar.b7();
                ag1.h hVar = gVar.B0;
                if (hVar == null) {
                    Intrinsics.r("ideaPinSessionDataManager");
                    throw null;
                }
                d4 d4Var = d4.STORY_PIN_STICKER_PICKER;
                Navigation navigation = gVar.I;
                String v03 = navigation != null ? navigation.v0("com.pinterest.EXTRA_STORY_PIN_CREATION_ENTRY_TYPE") : null;
                Navigation navigation2 = gVar.I;
                return new du0.b(b73, hVar, d4Var, v03, navigation2 != null ? navigation2.S("com.pinterest.EXTRA_IS_STORY_PIN_DRAFT", false) : false);
            case 1:
                Context context = gVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
                Intrinsics.checkNotNullParameter(context, "context");
                n nVar = new n(context);
                nVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                return nVar;
            case 2:
                Context requireContext = gVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                ag1.b bVar = gVar.D0;
                if (bVar != null) {
                    return new t(requireContext, (com.bumptech.glide.l) bVar.f15139l.getValue());
                }
                Intrinsics.r("dataManager");
                throw null;
            case 3:
                Context requireContext2 = gVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                return new o(requireContext2);
            case 4:
                Context requireContext3 = gVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                return new l(requireContext3);
            case 5:
                Context requireContext4 = gVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
                ag1.b bVar2 = gVar.D0;
                if (bVar2 != null) {
                    return new r(requireContext4, (com.bumptech.glide.l) bVar2.f15139l.getValue());
                }
                Intrinsics.r("dataManager");
                throw null;
            case 6:
                Context requireContext5 = gVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext5, "requireContext(...)");
                return new q(requireContext5);
            case 7:
                Context requireContext6 = gVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext6, "requireContext(...)");
                return new gu0.b(requireContext6);
            case 8:
                Context requireContext7 = gVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext7, "requireContext(...)");
                ag1.b bVar3 = gVar.D0;
                if (bVar3 != null) {
                    return new m(requireContext7, (com.bumptech.glide.l) bVar3.f15139l.getValue());
                }
                Intrinsics.r("dataManager");
                throw null;
            default:
                gVar.f7().d(new yb0.c(yb0.d.CONFIRM_BUTTON_CLICK));
                return Unit.f80348a;
        }
    }
}
