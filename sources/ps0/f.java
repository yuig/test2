package ps0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final f f101252j = new f(0);

    /* renamed from: k, reason: collision with root package name */
    public static final f f101253k = new f(1);

    /* renamed from: l, reason: collision with root package name */
    public static final f f101254l = new f(2);

    /* renamed from: m, reason: collision with root package name */
    public static final f f101255m = new f(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f101256i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i13) {
        super(1);
        this.f101256i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f101256i;
        switch (i13) {
            case 0:
                rn1.k bind = (rn1.k) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(bind, "$this$bind");
                        bind.e(wp1.f.home_empty_state_title_calico);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(bind, "$this$bind");
                        bind.e(wp1.f.home_empty_state_message_calico);
                        break;
                }
                return Unit.f80348a;
            case 1:
                rn1.k bind2 = (rn1.k) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                        bind2.e(wp1.f.home_empty_state_title_calico);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                        bind2.e(wp1.f.home_empty_state_message_calico);
                        break;
                }
                return Unit.f80348a;
            case 2:
                String url = (String) obj;
                Intrinsics.checkNotNullParameter(url, "url");
                return Boolean.valueOf(url.length() > 0);
            default:
                return Unit.f80348a;
        }
    }
}
