package z9;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class o extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f141240i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p f141241j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(p pVar, int i13) {
        super(1);
        this.f141240i = i13;
        this.f141241j = pVar;
    }

    public final Boolean b(z destination) {
        int i13 = this.f141240i;
        p pVar = this.f141241j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(destination, "destination");
                break;
            default:
                Intrinsics.checkNotNullParameter(destination, "destination");
                break;
        }
        return Boolean.valueOf(!pVar.f141266m.containsKey(Integer.valueOf(destination.f141329h)));
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f141240i) {
        }
        return b((z) obj);
    }
}
