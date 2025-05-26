package p01;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class b extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f98351i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f98352j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(f fVar, int i13) {
        super(0);
        this.f98351i = i13;
        this.f98352j = fVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f98351i;
        f fVar = this.f98352j;
        switch (i13) {
            case 0:
                return fVar.f98362b.getFilteredRelatedPinsPagedList();
            default:
                return fVar.f98362b.getRelatedPinsPagedList();
        }
    }
}
