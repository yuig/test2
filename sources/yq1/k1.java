package yq1;

import com.pinterest.api.model.wy0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f139894i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m1 f139895j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k1(m1 m1Var, int i13) {
        super(1);
        this.f139894i = i13;
        this.f139895j = m1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f139894i;
        m1 m1Var = this.f139895j;
        switch (i13) {
            case 0:
                wy0 user = (wy0) obj;
                Intrinsics.checkNotNullParameter(user, "user");
                int i14 = m1.X0;
                m1Var.d9().f130960h.e().a(new wr1.e0(user));
                return Unit.f80348a;
            default:
                ao1.b it = (ao1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                yn1.f fVar = yn1.f.ERROR;
                String string = m1Var.getString(vq1.d.please_enter_new_password);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                Intrinsics.checkNotNullParameter(string, "string");
                return ao1.b.e(it, null, null, new u50.f0(string), null, fVar, false, 0, 0, 0, false, false, false, null, false, null, null, null, null, null, 0, 4194267);
        }
    }
}
