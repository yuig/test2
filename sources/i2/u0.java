package i2;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class u0 extends c2 {

    /* renamed from: b, reason: collision with root package name */
    public final j3 f71313b;

    public u0(j3 j3Var, Function0 function0) {
        super(function0);
        this.f71313b = j3Var;
    }

    @Override // i2.c2
    public final d2 c(Object obj) {
        return new d2(this, obj, obj == null, this.f71313b, true);
    }
}
