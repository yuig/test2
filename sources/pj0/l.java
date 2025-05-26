package pj0;

import com.pinterest.api.model.ba;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class l extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f100245i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m f100246j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(m mVar, int i13) {
        super(1);
        this.f100245i = i13;
        this.f100246j = mVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f100245i;
        m mVar = this.f100246j;
        switch (i13) {
            case 0:
                String str = mVar.L;
                break;
            default:
                mVar.f100256j0 = true;
                i92.k.d(mVar.Z, new up.c(mVar.f100252f0, ((yk1.a) mVar.f100247a0).f139224a.getString(f70.c.saved_onto_board, ((ba) obj).A())));
                break;
        }
        return Unit.f80348a;
    }
}
