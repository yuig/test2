package androidx.compose.foundation.lazy.layout;

import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class o0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f17271i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r0 f17272j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(r0 r0Var, int i13) {
        super(0);
        this.f17271i = i13;
        this.f17272j = r0Var;
    }

    public final Float b() {
        int i13 = this.f17271i;
        r0 r0Var = this.f17272j;
        switch (i13) {
            case 0:
                return Float.valueOf(r0Var.f17281o.d() - r0Var.f17281o.a());
            case 1:
                return Float.valueOf(r0Var.f17281o.e());
            default:
                return Float.valueOf(r0Var.f17281o.b());
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f17271i) {
        }
        return b();
    }
}
