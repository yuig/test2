package mq0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final c f88062j = new c(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c f88063k = new c(1);

    /* renamed from: l, reason: collision with root package name */
    public static final c f88064l = new c(2);

    /* renamed from: m, reason: collision with root package name */
    public static final c f88065m = new c(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f88066i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13) {
        super(1);
        this.f88066i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f88066i;
        switch (i13) {
            case 0:
                break;
            case 1:
                Throwable th3 = (Throwable) obj;
                switch (i13) {
                    case 1:
                        th3.getLocalizedMessage();
                        break;
                    default:
                        th3.getLocalizedMessage();
                        break;
                }
                break;
            case 2:
                break;
            default:
                Throwable th4 = (Throwable) obj;
                switch (i13) {
                    case 1:
                        th4.getLocalizedMessage();
                        break;
                    default:
                        th4.getLocalizedMessage();
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
