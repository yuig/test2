package x02;

import com.pinterest.api.model.z2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class t extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f131486i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ z2 f131487j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ u f131488k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f131489l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(z2 z2Var, u uVar, String str, int i13) {
        super(1);
        this.f131486i = i13;
        this.f131487j = z2Var;
        this.f131488k = uVar;
        this.f131489l = str;
    }

    public final uj2.l b(z2 it) {
        int i13 = this.f131486i;
        u uVar = this.f131488k;
        String str = this.f131489l;
        z2 z2Var = this.f131487j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                Boolean Q = z2Var.Q();
                Intrinsics.checkNotNullExpressionValue(Q, "getMarkedHelpfulByMe(...)");
                if (!Q.booleanValue()) {
                    break;
                } else {
                    String uid = z2Var.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                    break;
                }
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                if (!n10.a.d(z2Var)) {
                    break;
                } else {
                    String uid2 = z2Var.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                    break;
                }
        }
        return uj2.l.d(it);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f131486i) {
        }
        return b((z2) obj);
    }
}
