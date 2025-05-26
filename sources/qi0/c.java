package qi0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import ni1.y2;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final c f103971j = new c(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c f103972k = new c(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f103973i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13) {
        super(1);
        this.f103973i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f103973i;
        switch (i13) {
            case 0:
                y2 it = (y2) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it, "it");
                        return it;
                    default:
                        Intrinsics.checkNotNullParameter(it, "it");
                        return it;
                }
            default:
                y2 it2 = (y2) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        return it2;
                    default:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        return it2;
                }
        }
    }
}
