package yq1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final d f139822j = new d(0);

    /* renamed from: k, reason: collision with root package name */
    public static final d f139823k = new d(1);

    /* renamed from: l, reason: collision with root package name */
    public static final d f139824l = new d(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f139825i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i13) {
        super(1);
        this.f139825i = i13;
    }

    public final void b(yl1.l bind) {
        switch (this.f139825i) {
            case 0:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.c(vq1.d.continue_gplus);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.getClass();
                bind.f139350c = fm1.c.VISIBLE;
                break;
            default:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.c(vq1.d.continue_facebook);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f139825i) {
            case 0:
                b((yl1.l) obj);
                break;
            case 1:
                b((yl1.l) obj);
                break;
            default:
                b((yl1.l) obj);
                break;
        }
        return Unit.f80348a;
    }
}
