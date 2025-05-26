package r02;

import com.pinterest.api.model.wy0;
import h32.a4;
import h32.d4;
import h32.u0;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class b0 extends kotlin.jvm.internal.s implements kl2.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e0 f105721i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(e0 e0Var) {
        super(7);
        this.f105721i = e0Var;
    }

    @Override // kl2.p
    public final Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        boolean booleanValue3 = ((Boolean) obj4).booleanValue();
        String str = (String) obj5;
        boolean booleanValue4 = ((Boolean) obj6).booleanValue();
        String str2 = (String) obj7;
        int i13 = e0.P0;
        e0 e0Var = this.f105721i;
        s02.n b93 = e0Var.b9();
        boolean d93 = e0Var.d9();
        String valueOf = String.valueOf((String) obj3);
        wy0 f13 = ((b60.d) e0Var.getActiveUserManager()).f();
        kh2.j.x2(b93, new p02.j(d93, booleanValue, booleanValue2, valueOf, f13 != null ? f13.getUid() : null, booleanValue3, str, new h32.i0(d4.REPORTS_AND_VIOLATION_CENTER, e0Var.d9() ? a4.RVC_YOUR_ACCOUNT_TAB : a4.RVC_YOUR_REPORTS_TAB, null, h32.g0.RVC_ENFORCEMENT_ACTION_ROW, null, u0.RVC_CONTEXT_MENU_BUTTON), booleanValue4, str2));
        return Unit.f80348a;
    }
}
