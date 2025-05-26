package rr;

import com.pinterest.api.model.ba;
import com.pinterest.api.model.v7;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class q extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f109817i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r f109818j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(r rVar, int i13) {
        super(1);
        this.f109817i = i13;
        this.f109818j = rVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        v7 u13;
        int i13 = this.f109817i;
        r rVar = this.f109818j;
        switch (i13) {
            case 0:
                ba baVar = (ba) obj;
                if (baVar == null || (u13 = baVar.u()) == null || u13.getUid() == null) {
                    rVar.f109843h.k(m60.x0.section_load_error_message);
                    rVar.f109723a.t(null);
                } else {
                    NavigationImpl z03 = Navigation.z0((ScreenLocation) com.pinterest.screens.g1.f50814d.getValue(), baVar.getUid());
                    v7 u14 = baVar.u();
                    z03.m0("com.pinterest.EXTRA_BOARD_ID", u14 != null ? u14.getUid() : null);
                    rVar.f109723a.m(z03);
                }
                break;
            default:
                rVar.f109843h.k(m60.x0.section_load_error_message);
                rVar.f109723a.t(null);
                break;
        }
        return Unit.f80348a;
    }
}
