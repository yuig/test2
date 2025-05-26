package dl1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f55202i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l f55203j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(l lVar, int i13) {
        super(1);
        this.f55202i = i13;
        this.f55203j = lVar;
    }

    public final Boolean b(s model) {
        int i13 = this.f55202i;
        l lVar = this.f55203j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(model, "model");
                break;
            default:
                Intrinsics.checkNotNullParameter(model, "model");
                break;
        }
        return Boolean.valueOf(lVar.f55247t.a(model));
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f55202i) {
        }
        return b((s) obj);
    }
}
