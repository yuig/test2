package ym1;

import com.pinterest.gestalt.popoverMessage.GestaltPopoverMessage;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import u50.k0;

/* loaded from: classes5.dex */
public final class l extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final l f139428j = new l(0);

    /* renamed from: k, reason: collision with root package name */
    public static final l f139429k = new l(1);

    /* renamed from: l, reason: collision with root package name */
    public static final l f139430l = new l(2);

    /* renamed from: m, reason: collision with root package name */
    public static final l f139431m = new l(3);

    /* renamed from: n, reason: collision with root package name */
    public static final l f139432n = new l(4);

    /* renamed from: o, reason: collision with root package name */
    public static final l f139433o = new l(5);

    /* renamed from: p, reason: collision with root package name */
    public static final l f139434p = new l(6);

    /* renamed from: q, reason: collision with root package name */
    public static final l f139435q = new l(7);

    /* renamed from: r, reason: collision with root package name */
    public static final l f139436r = new l(8);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f139437i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i13) {
        super(1);
        this.f139437i = i13;
    }

    public final yl1.b b(yl1.b it) {
        switch (this.f139437i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                int i13 = b0.popover_educational_next_button;
                String[] formatArgs = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                return yl1.b.f(it, new k0(i13, new ArrayList(0)), false, fm1.c.VISIBLE, null, null, null, null, null, 0, null, 1018);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                int i14 = b0.popover_educational_next_button;
                String[] formatArgs2 = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs2, "formatArgs");
                return yl1.b.f(it, new k0(i14, new ArrayList(0)), false, fm1.c.VISIBLE, null, null, null, null, null, 0, null, 1018);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f139437i) {
            case 0:
                return b((yl1.b) obj);
            case 1:
                om1.q bind = (om1.q) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.e(fm1.c.VISIBLE);
                bind.a(rm1.q.CANCEL);
                bind.c(om1.e.SM);
                bind.f96684i = z.popover_dismiss_icon_button;
                bind.d(om1.f.TRANSPARENT_WHITE);
                return Unit.f80348a;
            case 2:
                yl1.l bind2 = (yl1.l) obj;
                Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                int i13 = GestaltPopoverMessage.B;
                String[] formatArgs = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                k0 text = new k0(i13, new ArrayList(0));
                bind2.getClass();
                Intrinsics.checkNotNullParameter(text, "text");
                bind2.f139348a = text;
                bind2.f139356i = z.popover_button;
                return Unit.f80348a;
            case 3:
                return b((yl1.b) obj);
            case 4:
                c checkAndApplyDiff = (c) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                return checkAndApplyDiff.f139413b;
            case 5:
                c checkAndApplyDiff2 = (c) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff2, "$this$checkAndApplyDiff");
                return Integer.valueOf(checkAndApplyDiff2.f139413b.size());
            case 6:
                c checkAndApplyDiff3 = (c) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff3, "$this$checkAndApplyDiff");
                return checkAndApplyDiff3.f139416e;
            case 7:
                c checkAndApplyDiff4 = (c) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff4, "$this$checkAndApplyDiff");
                return checkAndApplyDiff4.f139417f;
            default:
                c checkAndApplyDiff5 = (c) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff5, "$this$checkAndApplyDiff");
                return checkAndApplyDiff5.f139415d;
        }
    }
}
