package k90;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.t0;
import rl1.q;
import u50.h0;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final b f78716j = new b(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b f78717k = new b(1);

    /* renamed from: l, reason: collision with root package name */
    public static final b f78718l = new b(2);

    /* renamed from: m, reason: collision with root package name */
    public static final b f78719m = new b(3);

    /* renamed from: n, reason: collision with root package name */
    public static final b f78720n = new b(4);

    /* renamed from: o, reason: collision with root package name */
    public static final b f78721o = new b(5);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f78722i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13) {
        super(1);
        this.f78722i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        h0 text = h0.f120562a;
        switch (this.f78722i) {
            case 0:
                om1.c state = (om1.c) obj;
                Intrinsics.checkNotNullParameter(state, "state");
                break;
            case 1:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 2:
                cm1.i bind = (cm1.i) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                int i13 = t0.button_save;
                fm1.c cVar = fm1.c.GONE;
                yl1.b primaryButton = new yl1.b(text, false, cVar, null, null, null, null, null, i13, null, 762);
                bind.getClass();
                Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
                bind.f28024a = primaryButton;
                yl1.b secondaryButton = new yl1.b(text, false, cVar, null, null, null, null, null, t0.button_visit, null, 762);
                Intrinsics.checkNotNullParameter(secondaryButton, "secondaryButton");
                bind.f28025b = secondaryButton;
                yl1.c size = yl1.c.SMALL;
                Intrinsics.checkNotNullParameter(size, "size");
                bind.f28027d = size;
                cm1.e orientation = cm1.e.HORIZONTAL;
                Intrinsics.checkNotNullParameter(orientation, "orientation");
                bind.f28028e = orientation;
                break;
            case 3:
                yl1.l bind2 = (yl1.l) obj;
                Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                bind2.getClass();
                Intrinsics.checkNotNullParameter(text, "text");
                bind2.f139348a = text;
                bind2.e(fm1.c.GONE);
                bind2.f139356i = a90.c.button_collage_ad_visit;
                bind2.b(yl1.c.SMALL);
                break;
            case 4:
                break;
            default:
                break;
        }
        return Unit.f80348a;
    }
}
