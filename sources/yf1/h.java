package yf1;

import a42.r;
import com.pinterest.gestalt.button.view.GestaltButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.x0;

/* loaded from: classes5.dex */
public final class h extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f138978i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f138979j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(i iVar, int i13) {
        super(1);
        this.f138978i = i13;
        this.f138979j = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f138978i;
        i iVar = this.f138979j;
        switch (i13) {
            case 0:
                yl1.b it = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], dq1.f.idea_pin_feedback_submit), iVar.f138980a == r.SATISFIED, fm1.c.VISIBLE, null, null, null, null, null, 0, null, 1016);
            case 1:
                i92.k kVar = iVar.f138985f;
                if (kVar == null) {
                    Intrinsics.r("toastUtils");
                    throw null;
                }
                kVar.n(dq1.f.idea_pin_submit_feedback_success);
                k kVar2 = iVar.f138982c;
                if (kVar2 != null) {
                    kVar2.postDelayed(new s81.g(iVar, 6), 500L);
                    return Unit.f80348a;
                }
                Intrinsics.r("modalView");
                throw null;
            default:
                i92.k kVar3 = iVar.f138985f;
                if (kVar3 == null) {
                    Intrinsics.r("toastUtils");
                    throw null;
                }
                kVar3.h(x0.generic_error);
                GestaltButton gestaltButton = iVar.f138983d;
                if (gestaltButton != null) {
                    gestaltButton.setEnabled(true);
                    return Unit.f80348a;
                }
                Intrinsics.r("submitButton");
                throw null;
        }
    }
}
