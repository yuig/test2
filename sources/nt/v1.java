package nt;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class v1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Integer f92210i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ CharSequence f92211j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ CharSequence f92212k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f92213l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f92214m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f92215n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(Integer num, CharSequence charSequence, CharSequence charSequence2, boolean z13, int i13, int i14) {
        super(1);
        this.f92210i = num;
        this.f92211j = charSequence;
        this.f92212k = charSequence2;
        this.f92213l = z13;
        this.f92214m = i13;
        this.f92215n = i14;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ao1.b state = (ao1.b) obj;
        Intrinsics.checkNotNullParameter(state, "state");
        Integer num = this.f92210i;
        int intValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        u50.f0 h23 = bs1.c.h2(this.f92211j);
        u50.f0 h24 = bs1.c.h2(this.f92212k);
        boolean z13 = this.f92213l;
        return ao1.b.e(state, null, h24, null, h23, null, !z13, 4, 4, this.f92215n, false, false, false, null, false, null, kotlin.collections.e0.b(5), kotlin.collections.e0.b(Integer.valueOf(this.f92214m)), z13 ? kotlin.collections.e0.b(1) : null, null, intValue, 1621037);
    }
}
