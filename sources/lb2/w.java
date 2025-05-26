package lb2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class w extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f82820i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ qr1.u f82821j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(qr1.u uVar, int i13) {
        super(1);
        this.f82820i = i13;
        this.f82821j = uVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        qr1.u uVar = this.f82821j;
        int i13 = this.f82820i;
        switch (i13) {
            case 0:
                nm.u tags = (nm.u) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(tags, "tags");
                        tags.u("logout_reason", uVar.f105037d);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(tags, "tags");
                        tags.u("logout_reason", uVar.f105037d);
                        break;
                }
                break;
            default:
                nm.u tags2 = (nm.u) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(tags2, "tags");
                        tags2.u("logout_reason", uVar.f105037d);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(tags2, "tags");
                        tags2.u("logout_reason", uVar.f105037d);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
