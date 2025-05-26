package s1;

import kh2.p2;
import kotlin.jvm.functions.Function1;
import m1.f1;

/* loaded from: classes2.dex */
public final class d0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f110378i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.lazy.layout.c0 f110379j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f110380k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c0 f110381l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f110382m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ f1 f110383n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ u2.c f110384o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ u2.d f110385p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f110386q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f110387r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(androidx.compose.foundation.lazy.layout.c0 c0Var, long j13, c0 c0Var2, long j14, f1 f1Var, u2.c cVar, u2.d dVar, boolean z13, int i13, int i14) {
        super(1);
        this.f110378i = i14;
        this.f110379j = c0Var;
        this.f110380k = j13;
        this.f110381l = c0Var2;
        this.f110382m = j14;
        this.f110383n = f1Var;
        this.f110384o = cVar;
        this.f110385p = dVar;
        this.f110386q = z13;
        this.f110387r = i13;
    }

    public final l b(int i13) {
        switch (this.f110378i) {
            case 0:
                androidx.compose.foundation.lazy.layout.c0 c0Var = this.f110379j;
                n4.k layoutDirection = ((androidx.compose.foundation.lazy.layout.d0) c0Var).f17231b.getLayoutDirection();
                return p2.i0(c0Var, i13, this.f110380k, this.f110381l, this.f110382m, this.f110383n, this.f110384o, this.f110385p, layoutDirection, this.f110386q, this.f110387r);
            default:
                androidx.compose.foundation.lazy.layout.c0 c0Var2 = this.f110379j;
                n4.k layoutDirection2 = ((androidx.compose.foundation.lazy.layout.d0) c0Var2).f17231b.getLayoutDirection();
                return p2.i0(c0Var2, i13, this.f110380k, this.f110381l, this.f110382m, this.f110383n, this.f110384o, this.f110385p, layoutDirection2, this.f110386q, this.f110387r);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f110378i) {
        }
        return b(((Number) obj).intValue());
    }
}
