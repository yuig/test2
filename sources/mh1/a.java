package mh1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f87157j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f87158k = new a(1);

    /* renamed from: l, reason: collision with root package name */
    public static final a f87159l = new a(2);

    /* renamed from: m, reason: collision with root package name */
    public static final a f87160m = new a(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f87161i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(1);
        this.f87161i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f87161i;
        switch (i13) {
            case 0:
                ((Number) obj).intValue();
                break;
            case 1:
                Throwable th3 = (Throwable) obj;
                switch (i13) {
                    case 1:
                        th3.getMessage();
                        break;
                }
                break;
            case 2:
                Throwable th4 = (Throwable) obj;
                switch (i13) {
                    case 1:
                        th4.getMessage();
                        break;
                }
                break;
            default:
                Throwable th5 = (Throwable) obj;
                switch (i13) {
                    case 1:
                        th5.getMessage();
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
