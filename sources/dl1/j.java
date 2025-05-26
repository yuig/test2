package dl1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f55235i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l f55236j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ s f55237k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(l lVar, s sVar, int i13) {
        super(1);
        this.f55235i = i13;
        this.f55236j = lVar;
        this.f55237k = sVar;
    }

    public final s b(s it) {
        int i13 = this.f55235i;
        s localModel = this.f55237k;
        l lVar = this.f55236j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return lVar.f55248u.a(it, localModel);
            case 1:
                Intrinsics.checkNotNullParameter(it, "remoteModel");
                fl1.e eVar = lVar.f55248u;
                Intrinsics.checkNotNullExpressionValue(localModel, "$localModel");
                return eVar.a(localModel, it);
            default:
                Intrinsics.checkNotNullParameter(it, "local");
                return lVar.f55248u.a(it, localModel);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f55235i) {
            case 0:
                return b((s) obj);
            case 1:
                return b((s) obj);
            case 2:
                s sVar = (s) obj;
                String uid = this.f55237k.getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                u uVar = new u(uid);
                Intrinsics.f(sVar);
                this.f55236j.H(uVar, sVar, true);
                return Unit.f80348a;
            default:
                return b((s) obj);
        }
    }
}
