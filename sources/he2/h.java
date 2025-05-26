package he2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class h extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f68990i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ee2.e f68991j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(ee2.e eVar, int i13) {
        super(1);
        this.f68990i = i13;
        this.f68991j = eVar;
    }

    public final Boolean b(b it) {
        int i13 = this.f68990i;
        ee2.e eVar = this.f68991j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return Boolean.valueOf(Intrinsics.d(it.f68965b, eVar));
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f68990i) {
        }
        return b((b) obj);
    }
}
