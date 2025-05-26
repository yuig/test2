package mk0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final c f87321j = new c(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c f87322k = new c(1);

    /* renamed from: l, reason: collision with root package name */
    public static final c f87323l = new c(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f87324i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13) {
        super(1);
        this.f87324i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f87324i;
        switch (i13) {
            case 0:
                Throwable it = (Throwable) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it, "it");
                        break;
                }
                break;
            case 1:
                Throwable it2 = (Throwable) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        break;
                }
                break;
            default:
                Throwable it3 = (Throwable) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it3, "it");
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
