package t90;

import i2.u;
import kg.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class l extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ rm1.q f116806i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function0 f116807j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ u2.q f116808k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f116809l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f116810m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f116811n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f116812o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(rm1.q qVar, Function0 function0, u2.q qVar2, boolean z13, boolean z14, int i13, int i14) {
        super(2);
        this.f116806i = qVar;
        this.f116807j = function0;
        this.f116808k = qVar2;
        this.f116809l = z13;
        this.f116810m = z14;
        this.f116811n = i13;
        this.f116812o = i14;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p13 = u.p(this.f116811n | 1);
        boolean z13 = this.f116810m;
        t.e(this.f116806i, this.f116807j, this.f116808k, this.f116809l, z13, (i2.o) obj, p13, this.f116812o);
        return Unit.f80348a;
    }
}
