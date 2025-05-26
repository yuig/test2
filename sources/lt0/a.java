package lt0;

import android.content.res.TypedArray;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import u50.f0;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f84763j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f84764k = new a(2);

    /* renamed from: l, reason: collision with root package name */
    public static final a f84765l = new a(3);

    /* renamed from: m, reason: collision with root package name */
    public static final a f84766m = new a(4);

    /* renamed from: n, reason: collision with root package name */
    public static final a f84767n = new a(5);

    /* renamed from: o, reason: collision with root package name */
    public static final a f84768o = new a(6);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f84769i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(1);
        this.f84769i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f84769i;
        switch (i13) {
            case 0:
                TypedArray $receiver = (TypedArray) obj;
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                Intrinsics.checkNotNullParameter("", "string");
                f0 f0Var = new f0("");
                Intrinsics.checkNotNullParameter("", "string");
                return new b(0, f0Var, new f0(""), false, Integer.MIN_VALUE, null, null);
            case 1:
                gm1.a it = (gm1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Unit.f80348a;
            case 2:
                b checkAndApplyDiff = (b) obj;
                switch (i13) {
                    case 2:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff.f84771b;
                    default:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff.f84772c;
                }
            case 3:
                b checkDiff = (b) obj;
                Intrinsics.checkNotNullParameter(checkDiff, "$this$checkDiff");
                return checkDiff.f84775f;
            case 4:
                b checkDiff2 = (b) obj;
                Intrinsics.checkNotNullParameter(checkDiff2, "$this$checkDiff");
                return Boolean.valueOf(checkDiff2.f84773d);
            case 5:
                b checkAndApplyDiff2 = (b) obj;
                switch (i13) {
                    case 2:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff2, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff2.f84771b;
                    default:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff2, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff2.f84772c;
                }
            default:
                b checkAndApplyDiff3 = (b) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff3, "$this$checkAndApplyDiff");
                return Integer.valueOf(checkAndApplyDiff3.f84774e);
        }
    }
}
