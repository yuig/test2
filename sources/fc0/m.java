package fc0;

import i2.o;
import i2.u;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class m extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f61717i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g4.e f61718j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f61719k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f61720l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Function2 f61721m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f61722n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f61723o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(boolean z13, g4.e eVar, boolean z14, boolean z15, Function2 function2, int i13, int i14) {
        super(2);
        this.f61717i = z13;
        this.f61718j = eVar;
        this.f61719k = z14;
        this.f61720l = z15;
        this.f61721m = function2;
        this.f61722n = i13;
        this.f61723o = i14;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p13 = u.p(this.f61722n | 1);
        boolean z13 = this.f61720l;
        Function2 function2 = this.f61721m;
        n.a(this.f61717i, this.f61718j, this.f61719k, z13, function2, (o) obj, p13, this.f61723o);
        return Unit.f80348a;
    }
}
