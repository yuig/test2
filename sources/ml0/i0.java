package ml0;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f87461i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l0 f87462j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ l82.e f87463k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(l0 l0Var, l82.e eVar, int i13) {
        super(1);
        this.f87461i = i13;
        this.f87462j = l0Var;
        this.f87463k = eVar;
    }

    public final b b(b it) {
        int i13 = this.f87461i;
        l82.e eVar = this.f87463k;
        l0 l0Var = this.f87462j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                l0Var.getClass();
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                l0Var.getClass();
                break;
        }
        return b.e(it, null, l0.i(eVar, null), null, 5);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f87461i) {
            case 0:
                return b((b) obj);
            case 1:
                m0 it = (m0) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                this.f87462j.getClass();
                t0 t0Var = (t0) CollectionsKt.firstOrNull(l0.h(this.f87463k));
                return m0.b(it, null, null, t0Var != null ? t0Var.f87503a : null, null, 55);
            default:
                return b((b) obj);
        }
    }
}
