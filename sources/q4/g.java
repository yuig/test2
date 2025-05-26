package q4;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class g extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ u2.e f102326i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f102327j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Function0 f102328k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ z f102329l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Function2 f102330m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f102331n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f102332o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(u2.e eVar, long j13, Function0 function0, z zVar, Function2 function2, int i13, int i14) {
        super(2);
        this.f102326i = eVar;
        this.f102327j = j13;
        this.f102328k = function0;
        this.f102329l = zVar;
        this.f102330m = function2;
        this.f102331n = i13;
        this.f102332o = i14;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p13 = i2.u.p(this.f102331n | 1);
        z zVar = this.f102329l;
        Function2 function2 = this.f102330m;
        l.b(this.f102326i, this.f102327j, this.f102328k, zVar, function2, (i2.o) obj, p13, this.f102332o);
        return Unit.f80348a;
    }
}
