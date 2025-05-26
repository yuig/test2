package br1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class w extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ f0 f23826i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f23827j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ u2.q f23828k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Function1 f23829l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f23830m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f23831n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(int i13, int i14, u2.q qVar, f0 f0Var, Function1 function1, boolean z13) {
        super(2);
        this.f23826i = f0Var;
        this.f23827j = z13;
        this.f23828k = qVar;
        this.f23829l = function1;
        this.f23830m = i13;
        this.f23831n = i14;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p13 = i2.u.p(this.f23830m | 1);
        e0.o(p13, this.f23831n, (i2.o) obj, this.f23828k, this.f23826i, this.f23829l, this.f23827j);
        return Unit.f80348a;
    }
}
