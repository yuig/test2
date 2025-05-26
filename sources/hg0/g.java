package hg0;

import h32.h0;
import h32.u0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class g extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final g f69067j = new g(0);

    /* renamed from: k, reason: collision with root package name */
    public static final g f69068k = new g(1);

    /* renamed from: l, reason: collision with root package name */
    public static final g f69069l = new g(2);

    /* renamed from: m, reason: collision with root package name */
    public static final g f69070m = new g(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f69071i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i13) {
        super(1);
        this.f69071i = i13;
    }

    public final void b(h0 update) {
        switch (this.f69071i) {
            case 0:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.f67047f = u0.EU_PERSONALIZED_ADS_PROMPT_INTRO;
                break;
            case 1:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.f67047f = u0.EU_PERSONALIZED_ADS_PROMPT_SELECTION;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.f67047f = u0.EU_PERSONALIZED_ADS_PROMPT_INTRO;
                break;
            default:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.f67047f = u0.EU_PERSONALIZED_ADS_PROMPT_SELECTION;
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f69071i) {
            case 0:
                b((h0) obj);
                break;
            case 1:
                b((h0) obj);
                break;
            case 2:
                b((h0) obj);
                break;
            default:
                b((h0) obj);
                break;
        }
        return Unit.f80348a;
    }
}
