package ec1;

import h32.f1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import va1.m1;

/* loaded from: classes5.dex */
public final class f extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j f58400i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f58401j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ m1 f58402k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f58403l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f1 f58404m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f58405n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function1 f58406o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, String str, m1 m1Var, boolean z13, f1 f1Var, int i13, Function1 function1) {
        super(1);
        this.f58400i = jVar;
        this.f58401j = str;
        this.f58402k = m1Var;
        this.f58403l = z13;
        this.f58404m = f1Var;
        this.f58405n = i13;
        this.f58406o = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String typedPasscode = (String) obj;
        Intrinsics.checkNotNullParameter(typedPasscode, "typedPasscode");
        j.u3(this.f58400i, this.f58401j, this.f58402k, this.f58403l, this.f58404m, this.f58405n, typedPasscode, false, this.f58406o, 64);
        return Unit.f80348a;
    }
}
