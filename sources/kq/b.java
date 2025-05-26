package kq;

import com.pinterest.api.model.f30;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f80627i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c f80628j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, int i13) {
        super(1);
        this.f80627i = i13;
        this.f80628j = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f80627i;
        c cVar = this.f80628j;
        switch (i13) {
            case 0:
                return cVar.J((f30) cVar.f80631p.get(((Number) obj).intValue()));
            default:
                cVar.f80634s = true;
                return Unit.f80348a;
        }
    }
}
