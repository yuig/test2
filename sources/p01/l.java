package p01;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class l extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f98380i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n f98381j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(n nVar, int i13) {
        super(0);
        this.f98380i = i13;
        this.f98381j = nVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f98380i;
        n nVar = this.f98381j;
        switch (i13) {
            case 0:
                return nVar.f98386b.getFilteredRelatedPinsPagedList();
            default:
                return nVar.f98386b.getRelatedPinsPagedList();
        }
    }
}
