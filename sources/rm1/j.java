package rm1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class j extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final j f108704j = new j(0);

    /* renamed from: k, reason: collision with root package name */
    public static final j f108705k = new j(1);

    /* renamed from: l, reason: collision with root package name */
    public static final j f108706l = new j(2);

    /* renamed from: m, reason: collision with root package name */
    public static final j f108707m = new j(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f108708i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i13) {
        super(1);
        this.f108708i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f108708i) {
            case 0:
                d checkAndApplyDiff = (d) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return checkAndApplyDiff.f108695a;
            case 1:
                d checkAndApplyDiff2 = (d) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff2, "$this$checkAndApplyDiff");
                return checkAndApplyDiff2.f108696b;
            case 2:
                d checkAndApplyDiff3 = (d) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff3, "$this$checkAndApplyDiff");
                return checkAndApplyDiff3.f108697c;
            default:
                d checkAndApplyDiff4 = (d) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff4, "$this$checkAndApplyDiff");
                return Integer.valueOf(checkAndApplyDiff4.f108698d);
        }
    }
}
