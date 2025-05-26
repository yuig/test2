package ec1;

import h32.f1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import va1.m1;

/* loaded from: classes5.dex */
public final class g extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j f58407i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f58408j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ m1 f58409k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f58410l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f1 f58411m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f58412n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function1 f58413o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, String str, m1 m1Var, boolean z13, f1 f1Var, int i13, Function1 function1) {
        super(0);
        this.f58407i = jVar;
        this.f58408j = str;
        this.f58409k = m1Var;
        this.f58410l = z13;
        this.f58411m = f1Var;
        this.f58412n = i13;
        this.f58413o = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        j.u3(this.f58407i, this.f58408j, this.f58409k, this.f58410l, this.f58411m, this.f58412n, null, true, this.f58413o, 32);
        return Unit.f80348a;
    }
}
