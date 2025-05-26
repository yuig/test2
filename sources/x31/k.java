package x31;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f131628i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o f131629j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p f131630k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(o oVar, p pVar, int i13) {
        super(1);
        this.f131628i = i13;
        this.f131629j = oVar;
        this.f131630k = pVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        o oVar = this.f131629j;
        p pVar = this.f131630k;
        int i13 = this.f131628i;
        switch (i13) {
            case 0:
                c it = (c) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it, "it");
                        oVar.getClass();
                        return o.g(it, pVar);
                    default:
                        Intrinsics.checkNotNullParameter(it, "it");
                        oVar.getClass();
                        return o.g(it, pVar);
                }
            default:
                c it2 = (c) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        oVar.getClass();
                        return o.g(it2, pVar);
                    default:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        oVar.getClass();
                        return o.g(it2, pVar);
                }
        }
    }
}
