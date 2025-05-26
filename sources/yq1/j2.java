package yq1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j2 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f139874i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l2 f139875j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j2(l2 l2Var, int i13) {
        super(1);
        this.f139874i = i13;
        this.f139875j = l2Var;
    }

    public final ao1.b b(ao1.b it) {
        int i13 = this.f139874i;
        l2 l2Var = this.f139875j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                String string = l2Var.f8();
                Intrinsics.checkNotNullParameter(string, "string");
                return ao1.b.e(it, null, null, null, new u50.f0(string), null, false, 0, 0, 0, false, false, false, null, false, null, null, null, null, null, 0, 4194287);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                String str = l2Var.f139915u0;
                return ao1.b.e(it, ep.b.x(str, "string", str), null, null, null, null, false, 0, 0, 0, false, false, false, null, false, null, null, null, null, null, 0, 4194302);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f139874i) {
        }
        return b((ao1.b) obj);
    }
}
