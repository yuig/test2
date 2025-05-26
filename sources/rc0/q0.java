package rc0;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f107374i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(Enum r13, Enum r23, int i13) {
        super(1);
        this.f107374i = i13;
    }

    public final Boolean b(Context $receiver) {
        switch (this.f107374i) {
            case 0:
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                break;
            case 1:
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                break;
            default:
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                break;
        }
        return Boolean.FALSE;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f107374i) {
        }
        return b((Context) obj);
    }
}
