package tq;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f118809i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c0 f118810j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(c0 c0Var, int i13) {
        super(0);
        this.f118809i = i13;
        this.f118810j = c0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        int i13 = this.f118809i;
        c0 c0Var = this.f118810j;
        switch (i13) {
            case 0:
                lh0.a0 a0Var = c0Var.f118816d;
                if (a0Var != null) {
                    return Boolean.valueOf(a0Var.v());
                }
                Intrinsics.r("experiments");
                throw null;
            case 1:
                lh0.a0 a0Var2 = c0Var.f118816d;
                if (a0Var2 != null) {
                    return Boolean.valueOf(a0Var2.Q());
                }
                Intrinsics.r("experiments");
                throw null;
            default:
                lh0.a0 a0Var3 = c0Var.f118816d;
                if (a0Var3 != null) {
                    return Boolean.valueOf(a0Var3.R());
                }
                Intrinsics.r("experiments");
                throw null;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f118809i) {
        }
        return invoke();
    }
}
