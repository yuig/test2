package wk1;

import com.pinterest.api.model.vh;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class f extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final f f130143j = new f(0);

    /* renamed from: k, reason: collision with root package name */
    public static final f f130144k = new f(1);

    /* renamed from: l, reason: collision with root package name */
    public static final f f130145l = new f(2);

    /* renamed from: m, reason: collision with root package name */
    public static final f f130146m = new f(3);

    /* renamed from: n, reason: collision with root package name */
    public static final f f130147n = new f(4);

    /* renamed from: o, reason: collision with root package name */
    public static final f f130148o = new f(5);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f130149i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i13) {
        super(1);
        this.f130149i = i13;
    }

    public final void b(Throwable th3) {
        switch (this.f130149i) {
            case 0:
                vb0.j.f125466a.F("Lost track of the other data source", tb0.p.PLATFORM, new Object[0]);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f130149i) {
            case 0:
                b((Throwable) obj);
                return Unit.f80348a;
            case 1:
                b((Throwable) obj);
                return Unit.f80348a;
            case 2:
                b((Throwable) obj);
                return Unit.f80348a;
            case 3:
                b((Throwable) obj);
                return Unit.f80348a;
            case 4:
                vh it = (vh) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return it.q() + ":" + it.f42865w.size();
            default:
                b((Throwable) obj);
                return Unit.f80348a;
        }
    }
}
