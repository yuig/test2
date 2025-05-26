package xa1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final v f134486j = new v(0);

    /* renamed from: k, reason: collision with root package name */
    public static final v f134487k = new v(1);

    /* renamed from: l, reason: collision with root package name */
    public static final v f134488l = new v(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f134489i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(int i13) {
        super(1);
        this.f134489i = i13;
    }

    public final rn1.a b(rn1.a state) {
        switch (this.f134489i) {
            case 1:
                Intrinsics.checkNotNullParameter(state, "state");
                return rn1.a.y(state, null, null, null, null, vn1.g.UI_400, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097135);
            default:
                Intrinsics.checkNotNullParameter(state, "state");
                return rn1.a.y(state, null, null, null, null, vn1.g.BODY_300, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097135);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f134489i) {
            case 0:
                rl1.q it = (rl1.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return b((rn1.a) obj);
    }
}
