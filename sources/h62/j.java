package h62;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class j extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f67837i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k f67838j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(k kVar, int i13) {
        super(1);
        this.f67837i = i13;
        this.f67838j = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        k kVar = this.f67838j;
        int i13 = this.f67837i;
        switch (i13) {
            case 0:
                h it = (h) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it, "it");
                        kVar.a(it, false);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it, "it");
                        kVar.a(it, false);
                        break;
                }
                break;
            default:
                h it2 = (h) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        kVar.a(it2, false);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        kVar.a(it2, false);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
