package vl1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rl1.c0;

/* loaded from: classes5.dex */
public final class o extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final o f126132j = new o(1);

    /* renamed from: k, reason: collision with root package name */
    public static final o f126133k = new o(2);

    /* renamed from: l, reason: collision with root package name */
    public static final o f126134l = new o(3);

    /* renamed from: m, reason: collision with root package name */
    public static final o f126135m = new o(4);

    /* renamed from: n, reason: collision with root package name */
    public static final o f126136n = new o(5);

    /* renamed from: o, reason: collision with root package name */
    public static final o f126137o = new o(6);

    /* renamed from: p, reason: collision with root package name */
    public static final o f126138p = new o(7);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f126139i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i13) {
        super(1);
        this.f126139i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f126139i;
        switch (i13) {
            case 0:
                c0 bind = (c0) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.f108536i = r.banner_avatar;
                return Unit.f80348a;
            case 1:
                cm1.i bind2 = (cm1.i) obj;
                Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                bind2.f28030g = r.banner_button_group;
                return Unit.f80348a;
            case 2:
                om1.q bind3 = (om1.q) obj;
                Intrinsics.checkNotNullParameter(bind3, "$this$bind");
                bind3.f96684i = r.banner_dismiss_icon_button;
                return Unit.f80348a;
            case 3:
                rm1.k bind4 = (rm1.k) obj;
                Intrinsics.checkNotNullParameter(bind4, "$this$bind");
                bind4.f108712d = r.banner_workflow_status_icon;
                return Unit.f80348a;
            case 4:
                rn1.k bind5 = (rn1.k) obj;
                switch (i13) {
                    case 4:
                        Intrinsics.checkNotNullParameter(bind5, "$this$bind");
                        bind5.f108897l = r.banner_message;
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(bind5, "$this$bind");
                        bind5.f108897l = r.banner_title;
                        break;
                }
                return Unit.f80348a;
            case 5:
                rn1.k bind6 = (rn1.k) obj;
                switch (i13) {
                    case 4:
                        Intrinsics.checkNotNullParameter(bind6, "$this$bind");
                        bind6.f108897l = r.banner_message;
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(bind6, "$this$bind");
                        bind6.f108897l = r.banner_title;
                        break;
                }
                return Unit.f80348a;
            case 6:
                d checkAndApplyDiff = (d) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return checkAndApplyDiff.f126117h;
            default:
                d checkAndApplyDiff2 = (d) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff2, "$this$checkAndApplyDiff");
                return Integer.valueOf(checkAndApplyDiff2.f126116g);
        }
    }
}
