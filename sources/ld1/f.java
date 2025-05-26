package ld1;

import com.pinterest.api.model.wy0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.u;
import pe.i;

/* loaded from: classes5.dex */
public final class f extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f82983i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ wy0 f82984j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i13, wy0 wy0Var) {
        super(0);
        this.f82983i = i13;
        this.f82984j = wy0Var;
    }

    public final String b() {
        int i13 = this.f82983i;
        wy0 wy0Var = this.f82984j;
        switch (i13) {
            case 0:
                String uid = wy0Var.getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                return uid;
            case 1:
            default:
                String uid2 = wy0Var.getUid();
                Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                return uid2;
            case 2:
                String uid3 = wy0Var.getUid();
                Intrinsics.checkNotNullExpressionValue(uid3, "getUid(...)");
                return uid3;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f82983i) {
            case 1:
                u.f85943a.d(i.x1(null, this.f82984j, r41.b.MerchantProductGridView));
                break;
        }
        return b();
    }
}
