package y1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class a extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f136514j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f136515k = new a(1);

    /* renamed from: l, reason: collision with root package name */
    public static final a f136516l = new a(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f136517i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(1);
        this.f136517i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Object invoke(Object obj) {
        switch (this.f136517i) {
            case 0:
                ((Number) obj).longValue();
                break;
            case 1:
                break;
            default:
                int i13 = ((h4.n) obj).f67594a;
                break;
        }
        return Unit.f80348a;
    }
}
