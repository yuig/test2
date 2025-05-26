package kl0;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import u50.k0;

/* loaded from: classes5.dex */
public final class b extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final b f80061j = new b(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b f80062k = new b(1);

    /* renamed from: l, reason: collision with root package name */
    public static final b f80063l = new b(2);

    /* renamed from: m, reason: collision with root package name */
    public static final b f80064m = new b(3);

    /* renamed from: n, reason: collision with root package name */
    public static final b f80065n = new b(4);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f80066i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13) {
        super(1);
        this.f80066i = i13;
    }

    public final rn1.a b(rn1.a state) {
        switch (this.f80066i) {
            case 0:
                Intrinsics.checkNotNullParameter(state, "state");
                return rn1.a.y(state, null, null, null, kotlin.collections.e0.b(vn1.e.BOLD), vn1.g.UI_400, 1, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097095);
            case 1:
                Intrinsics.checkNotNullParameter(state, "state");
                return rn1.a.y(state, null, null, null, kotlin.collections.e0.b(vn1.e.REGULAR), vn1.g.BODY_100, 1, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097095);
            default:
                Intrinsics.checkNotNullParameter(state, "state");
                return rn1.a.y(state, bs1.c.j2(new String[0], d70.g.find_more_ideas), null, null, kotlin.collections.e0.b(vn1.e.BOLD), vn1.g.UI_400, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097126);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f80066i) {
            case 0:
                return b((rn1.a) obj);
            case 1:
                return b((rn1.a) obj);
            case 2:
                return Unit.f80348a;
            case 3:
                kn1.b it = (kn1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                int i13 = y60.e.board_view_options_modal_title;
                String[] formatArgs = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                return kn1.b.e(it, false, false, hn1.q.Center, new k0(i13, new ArrayList(0)), null, null, null, 1971);
            default:
                return b((rn1.a) obj);
        }
    }
}
