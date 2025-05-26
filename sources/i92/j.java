package i92;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class j extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f71932i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f71933j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f71934k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f71935l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ k f71936m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str, boolean z13, int i13, boolean z14, k kVar) {
        super(0);
        this.f71932i = str;
        this.f71933j = z13;
        this.f71934k = i13;
        this.f71935l = z14;
        this.f71936m = kVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        b bVar = new b(this.f71934k, bs1.c.h2(this.f71932i), this.f71933j);
        boolean z13 = this.f71935l;
        k kVar = this.f71936m;
        if (z13) {
            kVar.f71938b.f(new h(bVar));
        } else {
            kVar.f71938b.d(new i(bVar));
        }
        return Unit.f80348a;
    }
}
