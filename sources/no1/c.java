package no1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f91664i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ a f91665j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(a aVar, int i13) {
        super(1);
        this.f91664i = i13;
        this.f91665j = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f91664i;
        a aVar = this.f91665j;
        switch (i13) {
            case 0:
                if (aVar != null) {
                    aVar.onSuccess();
                }
                break;
            default:
                if (aVar != null) {
                    aVar.a();
                }
                break;
        }
        return Unit.f80348a;
    }
}
