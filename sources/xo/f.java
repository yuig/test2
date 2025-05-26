package xo;

import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final f f135496j = new f(0);

    /* renamed from: k, reason: collision with root package name */
    public static final f f135497k = new f(1);

    /* renamed from: l, reason: collision with root package name */
    public static final f f135498l = new f(2);

    /* renamed from: m, reason: collision with root package name */
    public static final f f135499m = new f(3);

    /* renamed from: n, reason: collision with root package name */
    public static final f f135500n = new f(4);

    /* renamed from: o, reason: collision with root package name */
    public static final f f135501o = new f(5);

    /* renamed from: p, reason: collision with root package name */
    public static final f f135502p = new f(6);

    /* renamed from: q, reason: collision with root package name */
    public static final f f135503q = new f(7);

    /* renamed from: r, reason: collision with root package name */
    public static final f f135504r = new f(8);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f135505i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i13) {
        super(1);
        this.f135505i = i13;
    }

    public final void b(Throwable error) {
        switch (this.f135505i) {
            case 6:
                Intrinsics.checkNotNullParameter(error, "error");
                HashSet hashSet = tb0.h.f117076w;
                tb0.g.f117075a.q(error, "SendShareService Fail: newMessageFlowGetContacts", tb0.p.BOARD_CREATE);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f135505i) {
            case 0:
                b((Throwable) obj);
                break;
            case 1:
                b((Throwable) obj);
                break;
            case 2:
                b((Throwable) obj);
                break;
            case 3:
                rn1.a it = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 4:
                b((Throwable) obj);
                break;
            case 5:
                b((Throwable) obj);
                break;
            case 6:
                b((Throwable) obj);
                break;
            case 7:
                b((Throwable) obj);
                break;
            default:
                b((Throwable) obj);
                break;
        }
        return Unit.f80348a;
    }
}
