package wm1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final f0 f130289j = new f0(0);

    /* renamed from: k, reason: collision with root package name */
    public static final f0 f130290k = new f0(1);

    /* renamed from: l, reason: collision with root package name */
    public static final f0 f130291l = new f0(2);

    /* renamed from: m, reason: collision with root package name */
    public static final f0 f130292m = new f0(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f130293i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(int i13) {
        super(1);
        this.f130293i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f130293i;
        switch (i13) {
            case 0:
                um1.b it = (um1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return um1.b.e(it, null, null, ho1.b.list_action_indicator, 7);
            case 1:
                c checkAndApplyDiff = (c) obj;
                switch (i13) {
                    case 1:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                        return Integer.valueOf(checkAndApplyDiff.f130271e.getVisibility());
                    default:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                        return Integer.valueOf(checkAndApplyDiff.f130273g);
                }
            case 2:
                c checkAndApplyDiff2 = (c) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff2, "$this$checkAndApplyDiff");
                return checkAndApplyDiff2.f130272f;
            default:
                c checkAndApplyDiff3 = (c) obj;
                switch (i13) {
                    case 1:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff3, "$this$checkAndApplyDiff");
                        return Integer.valueOf(checkAndApplyDiff3.f130271e.getVisibility());
                    default:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff3, "$this$checkAndApplyDiff");
                        return Integer.valueOf(checkAndApplyDiff3.f130273g);
                }
        }
    }
}
