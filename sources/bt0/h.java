package bt0;

import android.content.Context;
import com.pinterest.ui.components.users.LegoUserRep;
import kh2.u2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lq0.f1;
import m60.r0;

/* loaded from: classes5.dex */
public final class h extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f23872i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f23873j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(j jVar, int i13) {
        super(0);
        this.f23872i = i13;
        this.f23873j = jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f23872i;
        j jVar = this.f23873j;
        switch (i13) {
            case 0:
                Context requireContext = jVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                LegoUserRep legoUserRep = new LegoUserRep(requireContext);
                legoUserRep.y1(ze0.a.List);
                legoUserRep.t0(true);
                legoUserRep.setPaddingRelative(legoUserRep.getResources().getDimensionPixelSize(r0.margin_half), 0, legoUserRep.getResources().getDimensionPixelSize(r0.margin_half), legoUserRep.getResources().getDimensionPixelSize(eo1.c.lego_bricks_one_and_a_quarter));
                return legoUserRep;
            default:
                u6.c defaultViewModelCreationExtras = jVar.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "<get-defaultViewModelCreationExtras>(...)");
                return u2.f1(defaultViewModelCreationExtras, new f1(jVar, 16));
        }
    }
}
