package hx0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final b f70500j = new b(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b f70501k = new b(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f70502i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13) {
        super(1);
        this.f70502i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f70502i;
        switch (i13) {
            case 0:
                Throwable it = (Throwable) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it, "it");
                        break;
                }
                break;
            default:
                Throwable it2 = (Throwable) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
