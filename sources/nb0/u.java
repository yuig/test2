package nb0;

import androidx.datastore.core.CorruptionException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final u f90325j = new u(0);

    /* renamed from: k, reason: collision with root package name */
    public static final u f90326k = new u(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f90327i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i13) {
        super(1);
        this.f90327i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f90327i;
        switch (i13) {
            case 0:
                CorruptionException it = (CorruptionException) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it, "it");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it, "it");
                        break;
                }
            default:
                CorruptionException it2 = (CorruptionException) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        break;
                }
        }
        return new d6.b(true);
    }
}
