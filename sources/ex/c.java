package ex;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f60363i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ fx.f f60364j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(fx.f fVar, int i13) {
        super(1);
        this.f60363i = i13;
        this.f60364j = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        fx.f fVar = this.f60364j;
        int i13 = this.f60363i;
        switch (i13) {
            case 0:
                fx.f it = (fx.f) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it, "it");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it, "it");
                        break;
                }
            default:
                fx.f it2 = (fx.f) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        break;
                }
        }
        return fVar;
    }
}
