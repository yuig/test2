package iw0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final b f73750j = new b(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b f73751k = new b(1);

    /* renamed from: l, reason: collision with root package name */
    public static final b f73752l = new b(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f73753i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13) {
        super(1);
        this.f73753i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f73753i;
        switch (i13) {
            case 0:
                Throwable th3 = (Throwable) obj;
                switch (i13) {
                    case 0:
                        th3.getMessage();
                        break;
                }
                break;
            case 1:
                Throwable th4 = (Throwable) obj;
                switch (i13) {
                    case 0:
                        th4.getMessage();
                        break;
                }
                break;
            default:
                Throwable th5 = (Throwable) obj;
                switch (i13) {
                    case 0:
                        th5.getMessage();
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
