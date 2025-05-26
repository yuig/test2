package pp1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f100916i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n f100917j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(n nVar, int i13) {
        super(1);
        this.f100916i = i13;
        this.f100917j = nVar;
    }

    public final yl1.b b(yl1.b it) {
        int i13 = this.f100916i;
        n nVar = this.f100917j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, nVar.f100938c, false, null, null, null, null, null, null, 0, null, 1022);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, nVar.f100939d, false, null, null, null, null, null, null, 0, null, 1022);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f100916i) {
        }
        return b((yl1.b) obj);
    }
}
