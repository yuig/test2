package un1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f122859j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f122860k = new a(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f122861i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(1);
        this.f122861i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f122861i) {
            case 0:
                c it = (c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return c.y(it, null, null, 0, fm1.c.GONE, false, null, null, 0, null, false, 524223);
            default:
                c checkAndApplyDiff = (c) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return Boolean.valueOf(checkAndApplyDiff.f122881y);
        }
    }
}
