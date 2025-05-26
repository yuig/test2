package uq0;

import com.pinterest.api.model.Feed;
import dl1.q;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class g extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final g f123048j = new g(0);

    /* renamed from: k, reason: collision with root package name */
    public static final g f123049k = new g(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f123050i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i13) {
        super(1);
        this.f123050i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f123050i) {
            case 0:
                q entry = (q) obj;
                Intrinsics.checkNotNullParameter(entry, "entry");
                return Boolean.valueOf(entry.f55265a != null);
            default:
                q entry2 = (q) obj;
                Intrinsics.checkNotNullParameter(entry2, "entry");
                dl1.s sVar = entry2.f55265a;
                Intrinsics.f(sVar);
                return (Feed) sVar;
        }
    }
}
