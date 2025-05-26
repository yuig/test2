package v72;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class y extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f124457i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p f124458j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(p pVar, int i13) {
        super(1);
        this.f124457i = i13;
        this.f124458j = pVar;
    }

    public final i b(i it) {
        int i13 = this.f124457i;
        p pVar = this.f124458j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return i.e(it, ((m) pVar).f124444a, false, null, 6);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return i.e(it, null, ((k) pVar).f124442a, null, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f124457i) {
        }
        return b((i) obj);
    }
}
