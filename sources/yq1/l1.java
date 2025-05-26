package yq1;

import android.view.View;
import com.pinterest.api.model.wy0;
import com.pinterest.identity.authentication.view.RecoverUserItemView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class l1 implements o82.c, kotlin.jvm.internal.m {

    /* renamed from: a, reason: collision with root package name */
    public static final l1 f139902a = new l1();

    @Override // kotlin.jvm.internal.m
    public final xk2.g c() {
        return new kotlin.jvm.internal.p(2, RecoverUserItemView.class, "bindDisplayState", "bindDisplayState(Lcom/pinterest/identity/recoverAccount/RecoverUserItemDisplayState;)V", 0);
    }

    @Override // o82.c
    public final void e(View view, u50.o oVar) {
        RecoverUserItemView p03 = (RecoverUserItemView) view;
        wr1.e1 state = (wr1.e1) oVar;
        Intrinsics.checkNotNullParameter(p03, "p0");
        Intrinsics.checkNotNullParameter(state, "p1");
        p03.getClass();
        Intrinsics.checkNotNullParameter(state, "state");
        wy0 wy0Var = state.f130963a;
        String Z2 = wy0Var.Z2();
        if (Z2 == null) {
            Z2 = "";
        }
        pk.a0.p(p03.f49825b, Z2);
        if (kh2.j1.m0(wy0Var)) {
            kh2.m0.V0(p03.f49824a, wy0Var);
        }
        p03.f49826c.e(new la1.k(27, state, wy0Var));
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof o82.c) && (obj instanceof kotlin.jvm.internal.m)) {
            return Intrinsics.d(c(), ((kotlin.jvm.internal.m) obj).c());
        }
        return false;
    }

    public final int hashCode() {
        return c().hashCode();
    }
}
