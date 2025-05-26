package k91;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final b f78805j = new b(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b f78806k = new b(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f78807i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13) {
        super(1);
        this.f78807i = i13;
    }

    public final yl1.b b(yl1.b it) {
        switch (this.f78807i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], b52.c.additional_account_banner_action_create), false, null, null, null, null, null, null, 0, null, 1022);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], b52.c.business_landing_signup_button), false, fm1.c.VISIBLE, null, null, null, null, null, 0, null, 1018);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f78807i) {
        }
        return b((yl1.b) obj);
    }
}
