package zw1;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class b extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f142940i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f142941j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, int i13) {
        super(0);
        this.f142940i = i13;
        this.f142941j = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f142940i;
        Object obj = this.f142941j;
        switch (i13) {
            case 0:
                c cVar = (c) obj;
                uk1.e eVar = cVar.f142944k0;
                if (eVar != null) {
                    return uk1.e.c(eVar, cVar);
                }
                Intrinsics.r("presenterPinalyticsFactory");
                throw null;
            default:
                i iVar = (i) obj;
                return new yw1.c(iVar.f142959a, iVar.f142963e, iVar.f142964f.f136124b);
        }
    }
}
