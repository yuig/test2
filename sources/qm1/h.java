package qm1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import rm1.q;

/* loaded from: classes5.dex */
public final class h extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final h f104395j = new h(0);

    /* renamed from: k, reason: collision with root package name */
    public static final h f104396k = new h(1);

    /* renamed from: l, reason: collision with root package name */
    public static final h f104397l = new h(2);

    /* renamed from: m, reason: collision with root package name */
    public static final h f104398m = new h(3);

    /* renamed from: n, reason: collision with root package name */
    public static final h f104399n = new h(4);

    /* renamed from: o, reason: collision with root package name */
    public static final h f104400o = new h(5);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f104401i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i13) {
        super(1);
        this.f104401i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f104401i) {
            case 0:
                b checkAndApplyDiff = (b) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return checkAndApplyDiff.f104382a;
            case 1:
                b checkAndApplyDiff2 = (b) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff2, "$this$checkAndApplyDiff");
                return Boolean.valueOf(checkAndApplyDiff2.f104385d);
            case 2:
                b checkAndApplyDiff3 = (b) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff3, "$this$checkAndApplyDiff");
                return checkAndApplyDiff3.f104384c;
            case 3:
                b checkAndApplyDiff4 = (b) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff4, "$this$checkAndApplyDiff");
                return Integer.valueOf(checkAndApplyDiff4.f104386e);
            case 4:
                Intrinsics.checkNotNullParameter((k) obj, "it");
                return Unit.f80348a;
            default:
                b it = (b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                d selected = it.f104383b.inverse$iconbuttonfloating_release();
                q icon = it.f104382a;
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(selected, "selected");
                fm1.c visibility = it.f104384c;
                Intrinsics.checkNotNullParameter(visibility, "visibility");
                return new b(icon, selected, visibility, it.f104385d, it.f104386e);
        }
    }
}
