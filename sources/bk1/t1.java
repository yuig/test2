package bk1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f23343i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ a2 f23344j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ b f23345k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t1(a2 a2Var, b bVar, int i13) {
        super(1);
        this.f23343i = i13;
        this.f23344j = a2Var;
        this.f23345k = bVar;
    }

    public final a2 b(a2 it) {
        int i13 = this.f23343i;
        a2 a2Var = this.f23344j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return a2.b(it, null, false, false, null, null, 0, false, null, this.f23345k, null, false, false, a2Var.f23173s, null, 0, false, false, false, null, null, null, false, false, false, false, false, false, null, null, null, false, false, null, false, false, null, null, false, false, false, false, -270337, 524287);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return a2.b(it, null, false, false, null, null, 0, false, null, this.f23345k, null, false, false, a2Var.f23173s, null, 0, false, false, false, null, null, null, false, false, false, false, false, false, null, null, null, false, false, null, false, false, null, null, false, false, false, false, -270337, 524287);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return a2.b(it, null, false, false, null, null, 0, false, null, this.f23345k, null, false, false, a2Var.f23173s, null, 0, false, false, false, null, null, null, false, false, false, false, false, false, null, null, null, false, false, null, false, false, null, null, false, false, false, false, -270337, 524287);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f23343i) {
        }
        return b((a2) obj);
    }
}
