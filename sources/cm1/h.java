package cm1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class h extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f28022i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f28023j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(d dVar, int i13) {
        super(1);
        this.f28022i = i13;
        this.f28023j = dVar;
    }

    public final yl1.b b(yl1.b it) {
        int i13 = this.f28022i;
        d dVar = this.f28023j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(dVar.f28012a, null, false, null, null, null, dVar.f28015d, null, null, 0, null, 991);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(dVar.f28013b, null, false, null, null, null, dVar.f28015d, null, null, 0, null, 991);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        d dVar = this.f28023j;
        int i13 = this.f28022i;
        switch (i13) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                d it = (d) obj;
                switch (i13) {
                    case 2:
                        Intrinsics.checkNotNullParameter(it, "it");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it, "it");
                        break;
                }
            default:
                d it2 = (d) obj;
                switch (i13) {
                    case 2:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        break;
                }
        }
        return dVar;
    }
}
