package s52;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.Unit;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f111168i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n f111169j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(n nVar, int i13) {
        super(0);
        this.f111168i = i13;
        this.f111169j = nVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f111168i;
        n nVar = this.f111169j;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        return com.bumptech.glide.d.Z(nVar, "com.pinterest.EXTRA_BOARD_ID", "");
                    default:
                        return com.bumptech.glide.d.Z(nVar, "ARG_TEMPLATE_ID", "");
                }
            case 1:
                m255invoke();
                return Unit.f80348a;
            case 2:
                m255invoke();
                return Unit.f80348a;
            case 3:
                m255invoke();
                return Unit.f80348a;
            case 4:
                m255invoke();
                return Unit.f80348a;
            case 5:
                Context requireContext = nVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return new ho0.f(requireContext, (Integer) null);
            case 6:
                return com.bumptech.glide.d.Y(nVar, "ARG_TEMPLATE_PINS", q0.f80391a);
            case 7:
                return (FrameLayout) nVar.requireView().findViewById(o52.c.selection_state_container);
            case 8:
                return (GestaltText) nVar.requireView().findViewById(o52.c.selection_state_label);
            case 9:
                switch (i13) {
                    case 0:
                        return com.bumptech.glide.d.Z(nVar, "com.pinterest.EXTRA_BOARD_ID", "");
                    default:
                        return com.bumptech.glide.d.Z(nVar, "ARG_TEMPLATE_ID", "");
                }
            case 10:
                return Integer.valueOf(com.bumptech.glide.d.O(nVar, "ARG_TEMPLATE_MAX_PINS", 14));
            default:
                return (ConstraintLayout) nVar.requireView().findViewById(o52.c.thumbnail_tray_container);
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m255invoke() {
        r52.h hVar = r52.h.f106286a;
        int i13 = this.f111168i;
        n nVar = this.f111169j;
        switch (i13) {
            case 1:
                int i14 = n.f111189g1;
                kh2.j.x2(nVar.n9(), r52.l.f106290a);
                break;
            case 2:
                int i15 = n.f111189g1;
                kh2.j.x2(nVar.n9(), r52.i.f106287a);
                break;
            case 3:
                int i16 = n.f111189g1;
                kh2.j.x2(nVar.n9(), hVar);
                break;
            default:
                int i17 = n.f111189g1;
                kh2.j.x2(nVar.n9(), hVar);
                break;
        }
    }
}
