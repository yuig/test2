package pv0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final b f101432j = new b(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b f101433k = new b(1);

    /* renamed from: l, reason: collision with root package name */
    public static final b f101434l = new b(2);

    /* renamed from: m, reason: collision with root package name */
    public static final b f101435m = new b(3);

    /* renamed from: n, reason: collision with root package name */
    public static final b f101436n = new b(4);

    /* renamed from: o, reason: collision with root package name */
    public static final b f101437o = new b(5);

    /* renamed from: p, reason: collision with root package name */
    public static final b f101438p = new b(6);

    /* renamed from: q, reason: collision with root package name */
    public static final b f101439q = new b(7);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f101440i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13) {
        super(1);
        this.f101440i = i13;
    }

    public final void b(Throwable th3) {
        switch (this.f101440i) {
            case 0:
            case 1:
                break;
            case 2:
                th3.getLocalizedMessage();
                break;
            case 3:
            default:
                th3.getLocalizedMessage();
                break;
            case 4:
                th3.getLocalizedMessage();
                break;
            case 5:
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f101440i) {
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
                break;
            case 4:
                b((Throwable) obj);
                break;
            case 5:
                b((Throwable) obj);
                break;
            case 6:
                break;
            default:
                b((Throwable) obj);
                break;
        }
        return Unit.f80348a;
    }
}
