package wx1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import rl1.q;

/* loaded from: classes4.dex */
public final class d extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f131212i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f131213j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ sx.a f131214k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(String str, sx.a aVar, int i13) {
        super(1);
        this.f131212i = i13;
        this.f131213j = str;
        this.f131214k = aVar;
    }

    public final q b(q it) {
        int i13 = this.f131212i;
        sx.a aVar = this.f131214k;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return q.e(it, this.f131213j, null, false, null, null, false, false, null, 0, new rl1.d(aVar.f115610i), null, 1534);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return q.e(it, null, this.f131213j, false, null, null, false, false, null, 0, new rl1.d(aVar.f115610i), null, 1533);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f131212i) {
        }
        return b((q) obj);
    }
}
