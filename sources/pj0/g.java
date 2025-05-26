package pj0;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.v7;
import dl1.s0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f100232i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f100233j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(i iVar, int i13) {
        super(1);
        this.f100232i = i13;
        this.f100233j = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f100232i;
        i iVar = this.f100233j;
        switch (i13) {
            case 0:
                s0 it = (s0) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                v7 D3 = ((f30) it.f55286b).D3();
                return Boolean.valueOf(Intrinsics.d(D3 != null ? D3.getId() : null, iVar.f100235k));
            default:
                int i14 = h.f100234a[((s0) obj).f55285a.ordinal()];
                if (i14 == 1) {
                    i.v(iVar, 1);
                } else if (i14 == 2) {
                    i.v(iVar, -1);
                }
                return Unit.f80348a;
        }
    }
}
