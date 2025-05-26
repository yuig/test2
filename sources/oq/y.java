package oq;

import com.pinterest.api.model.f30;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class y extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ f30 f97203i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f97204j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f97205k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f97206l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f97207m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f97208n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.j0 f97209o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(f30 f30Var, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, kotlin.jvm.internal.j0 j0Var) {
        super(1);
        this.f97203i = f30Var;
        this.f97204j = z13;
        this.f97205k = z14;
        this.f97206l = z15;
        this.f97207m = z16;
        this.f97208n = z17;
        this.f97209o = j0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        pq.b it = (pq.b) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return pq.b.e(it, this.f97203i, this.f97204j ? qq.e.IMAGE_SEARCH_WITH_CUTOUT : qq.e.IMAGE_SEARCH, null, false, this.f97205k, this.f97206l, this.f97207m, this.f97208n, (i81.b) this.f97209o.f80434a, false, false, 1548);
    }
}
