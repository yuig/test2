package mm2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f87704i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o f87705j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(o oVar, int i13) {
        super(1);
        this.f87704i = i13;
        this.f87705j = oVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        o oVar = this.f87705j;
        int i13 = this.f87704i;
        switch (i13) {
            case 0:
                ym2.g it = (ym2.g) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it, "it");
                        return o.v(oVar, it);
                    default:
                        Intrinsics.checkNotNullParameter(it, "it");
                        return o.w(oVar, it);
                }
            default:
                ym2.g it2 = (ym2.g) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        return o.v(oVar, it2);
                    default:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        return o.w(oVar, it2);
                }
        }
    }
}
