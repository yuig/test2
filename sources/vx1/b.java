package vx1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f126826i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c f126827j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, int i13) {
        super(1);
        this.f126826i = i13;
        this.f126827j = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        c cVar = this.f126827j;
        int i13 = this.f126826i;
        switch (i13) {
            case 0:
                ww1.c it = (ww1.c) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it, "it");
                        cVar.V7(cy1.a.NAVIGATE_TO_GRAPH, it);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it, "it");
                        cVar.V7(cy1.a.NAVIGATE_TO_GRAPH, it);
                        break;
                }
                break;
            default:
                ww1.c it2 = (ww1.c) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        cVar.V7(cy1.a.NAVIGATE_TO_GRAPH, it2);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        cVar.V7(cy1.a.NAVIGATE_TO_GRAPH, it2);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
