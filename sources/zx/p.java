package zx;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class p extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final p f143001j = new p(0);

    /* renamed from: k, reason: collision with root package name */
    public static final p f143002k = new p(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f143003i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i13) {
        super(1);
        this.f143003i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f143003i;
        switch (i13) {
            case 0:
                b it = (b) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it, "it");
                        return it.f142967a;
                    default:
                        Intrinsics.checkNotNullParameter(it, "it");
                        return it.f142967a;
                }
            default:
                b it2 = (b) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        return it2.f142967a;
                    default:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        return it2.f142967a;
                }
        }
    }
}
