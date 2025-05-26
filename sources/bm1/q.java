package bm1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final q f23517j = new q(0);

    /* renamed from: k, reason: collision with root package name */
    public static final q f23518k = new q(1);

    /* renamed from: l, reason: collision with root package name */
    public static final q f23519l = new q(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f23520i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i13) {
        super(1);
        this.f23520i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f23520i) {
            case 0:
                m checkAndApplyDiff = (m) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return checkAndApplyDiff.f23511e;
            case 1:
                m checkAndApplyDiff2 = (m) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff2, "$this$checkAndApplyDiff");
                return Integer.valueOf(checkAndApplyDiff2.f23512f);
            default:
                m checkAndApplyDiff3 = (m) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff3, "$this$checkAndApplyDiff");
                return checkAndApplyDiff3.f23513g;
        }
    }
}
