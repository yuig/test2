package u81;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f121025i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ rm1.q f121026j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(rm1.q qVar, int i13) {
        super(1);
        this.f121025i = i13;
        this.f121026j = qVar;
    }

    public final om1.c b(om1.c it) {
        switch (this.f121025i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, this.f121026j, null, null, null, null, false, 0, 1022);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, this.f121026j, null, null, null, null, false, 0, 1022);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, this.f121026j, null, om1.f.DEFAULT_ALWAYS_DARK, null, null, false, 0, 1018);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f121025i) {
        }
        return b((om1.c) obj);
    }
}
