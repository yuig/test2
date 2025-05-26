package z92;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.t0;

/* loaded from: classes4.dex */
public final class h extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final h f141444j = new h(0);

    /* renamed from: k, reason: collision with root package name */
    public static final h f141445k = new h(1);

    /* renamed from: l, reason: collision with root package name */
    public static final h f141446l = new h(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f141447i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i13) {
        super(1);
        this.f141447i = i13;
    }

    public final yl1.b b(yl1.b it) {
        switch (this.f141447i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, false, null, null, null, null, null, null, t0.primary_action_button_id, null, 767);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, false, fm1.c.GONE, null, null, null, null, null, t0.secondary_action_button_id, null, 763);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f141447i) {
            case 0:
                return b((yl1.b) obj);
            case 1:
                return b((yl1.b) obj);
            default:
                om1.c it = (om1.c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, null, om1.e.LG, om1.f.TRANSPARENT_DARK_GRAY, null, null, false, 0, 1017);
        }
    }
}
