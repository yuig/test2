package ou0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class i extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final i f97712j = new i(0);

    /* renamed from: k, reason: collision with root package name */
    public static final i f97713k = new i(1);

    /* renamed from: l, reason: collision with root package name */
    public static final i f97714l = new i(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f97715i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i13) {
        super(1);
        this.f97715i = i13;
    }

    public final om1.c b(om1.c it) {
        switch (this.f97715i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, null, null, null, null, null, false, 0, 991);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, null, null, null, null, null, false, 0, 991);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, null, null, null, null, null, true, 0, 991);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f97715i) {
        }
        return b((om1.c) obj);
    }
}
