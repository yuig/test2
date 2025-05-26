package t3;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final p f116116j = new p(1);

    /* renamed from: k, reason: collision with root package name */
    public static final p f116117k = new p(2);

    /* renamed from: l, reason: collision with root package name */
    public static final p f116118l = new p(4);

    /* renamed from: m, reason: collision with root package name */
    public static final p f116119m = new p(6);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f116120i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i13) {
        super(1);
        this.f116120i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f116120i) {
            case 0:
                return Boolean.valueOf(((s3.k0) obj).f110837y.d(8));
            case 1:
                return Unit.f80348a;
            case 2:
                return Boolean.FALSE;
            case 3:
                return (h4.a0) obj;
            case 4:
                return Boolean.valueOf(d1.a(obj));
            case 5:
                return null;
            default:
                ep.b.A(obj);
                return Unit.f80348a;
        }
    }
}
