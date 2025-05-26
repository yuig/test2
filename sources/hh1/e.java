package hh1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f69160i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f69161j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ n f69162k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(String str, n nVar, int i13) {
        super(1);
        this.f69160i = i13;
        this.f69161j = str;
        this.f69162k = nVar;
    }

    public final rl1.q b(rl1.q it) {
        rl1.c cVar = rl1.b.f108524a;
        int i13 = this.f69160i;
        n nVar = this.f69162k;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                Integer num = nVar.f69198l;
                if (num != null) {
                    cVar = new rl1.d(num.intValue());
                }
                return rl1.q.e(it, null, this.f69161j, false, null, null, false, false, null, 0, cVar, null, 1533);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                Integer num2 = nVar.f69198l;
                if (num2 != null) {
                    cVar = new rl1.d(num2.intValue());
                }
                return rl1.q.e(it, this.f69161j, null, false, null, null, false, false, null, 0, cVar, null, 1534);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f69160i) {
            case 0:
                rn1.a it = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return b((rl1.q) obj);
    }
}
