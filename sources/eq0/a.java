package eq0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f59907j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f59908k = new a(1);

    /* renamed from: l, reason: collision with root package name */
    public static final a f59909l = new a(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f59910i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(1);
        this.f59910i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f59910i;
        switch (i13) {
            case 0:
                Throwable th3 = (Throwable) obj;
                switch (i13) {
                    case 0:
                        c.a(th3);
                        break;
                    case 1:
                        c.a(th3);
                        break;
                    default:
                        c.a(th3);
                        break;
                }
                break;
            case 1:
                Throwable th4 = (Throwable) obj;
                switch (i13) {
                    case 0:
                        c.a(th4);
                        break;
                    case 1:
                        c.a(th4);
                        break;
                    default:
                        c.a(th4);
                        break;
                }
                break;
            default:
                Throwable th5 = (Throwable) obj;
                switch (i13) {
                    case 0:
                        c.a(th5);
                        break;
                    case 1:
                        c.a(th5);
                        break;
                    default:
                        c.a(th5);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
