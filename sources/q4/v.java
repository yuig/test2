package q4;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.i0;

/* loaded from: classes3.dex */
public final class v extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0 f102362i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ w f102363j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ n4.i f102364k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f102365l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f102366m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(i0 i0Var, w wVar, n4.i iVar, long j13, long j14) {
        super(0);
        this.f102362i = i0Var;
        this.f102363j = wVar;
        this.f102364k = iVar;
        this.f102365l = j13;
        this.f102366m = j14;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        w wVar = this.f102363j;
        y yVar = wVar.f102374n;
        n4.k kVar = wVar.f102375o;
        this.f102362i.f80432a = yVar.a(this.f102364k, this.f102365l, kVar, this.f102366m);
        return Unit.f80348a;
    }
}
