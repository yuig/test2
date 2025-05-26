package k51;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final c f78315j = new c(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c f78316k = new c(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f78317i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13) {
        super(1);
        this.f78317i = i13;
    }

    public final o b(o it) {
        switch (this.f78317i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return o.e(it, null, bm1.n.SELECTED, 3);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return o.e(it, null, bm1.n.UNSELECTED, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f78317i) {
        }
        return b((o) obj);
    }
}
