package s61;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import rm1.q;

/* loaded from: classes5.dex */
public final class d extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final d f111229j = new d(0);

    /* renamed from: k, reason: collision with root package name */
    public static final d f111230k = new d(1);

    /* renamed from: l, reason: collision with root package name */
    public static final d f111231l = new d(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f111232i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i13) {
        super(1);
        this.f111232i = i13;
    }

    public final om1.c b(om1.c it) {
        switch (this.f111232i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, q.DIRECTIONAL_ARROW_RIGHT, null, null, null, null, false, 0, 1022);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, q.CHECK, null, null, null, null, false, 0, 1022);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, q.ARROW_FORWARD, null, null, null, null, false, 0, 1022);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f111232i) {
        }
        return b((om1.c) obj);
    }
}
