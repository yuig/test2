package ni1;

import com.pinterest.api.model.f30;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class j2 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n2 f90715i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f30 f90716j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ wa2.m f90717k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x2 f90718l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f90719m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l82.e f90720n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(n2 n2Var, f30 f30Var, wa2.m mVar, x2 x2Var, boolean z13, l82.e eVar) {
        super(0);
        this.f90715i = n2Var;
        this.f90716j = f30Var;
        this.f90717k = mVar;
        this.f90718l = x2Var;
        this.f90719m = z13;
        this.f90720n = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        es.h hVar = this.f90715i.f90746b;
        wa2.m mVar = this.f90717k;
        return Boolean.valueOf(((es.v) hVar).X(this.f90716j, mVar.O, mVar.N, this.f90718l.Z, new i2(1, this.f90720n, this.f90719m)));
    }
}
