package op0;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import so.oa;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final b f96912j = new b(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b f96913k = new b(1);

    /* renamed from: l, reason: collision with root package name */
    public static final b f96914l = new b(2);

    /* renamed from: m, reason: collision with root package name */
    public static final b f96915m = new b(3);

    /* renamed from: n, reason: collision with root package name */
    public static final b f96916n = new b(4);

    /* renamed from: o, reason: collision with root package name */
    public static final b f96917o = new b(5);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f96918i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13) {
        super(1);
        this.f96918i = i13;
    }

    public final void b(Throwable th3) {
        switch (this.f96918i) {
            case 1:
                Context context = kb0.a.f79058b;
                ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().i(th3.getLocalizedMessage());
                break;
            case 2:
                Context context2 = kb0.a.f79058b;
                ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().i(th3.getLocalizedMessage());
                break;
            case 3:
            default:
                Context context3 = kb0.a.f79058b;
                ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().i(th3.getLocalizedMessage());
                break;
            case 4:
                Context context4 = kb0.a.f79058b;
                ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().i(th3.getLocalizedMessage());
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f96918i) {
            case 0:
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
            default:
                b((Throwable) obj);
                break;
        }
        return Unit.f80348a;
    }
}
