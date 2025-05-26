package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class a2 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f24520i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function0 f24521j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Function0 f24522k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f24523l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f24524m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(boolean z13, Function0 function0, Function0 function02, long j13, int i13) {
        super(2);
        this.f24520i = z13;
        this.f24521j = function0;
        this.f24522k = function02;
        this.f24523l = j13;
        this.f24524m = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p13 = i2.u.p(this.f24524m | 1);
        Function0 function0 = this.f24522k;
        long j13 = this.f24523l;
        g2.b(this.f24520i, this.f24521j, function0, j13, (i2.o) obj, p13);
        return Unit.f80348a;
    }
}
