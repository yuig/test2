package fk1;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j0;

/* loaded from: classes2.dex */
public final class t extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f62370i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j0 f62371j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ ak1.b f62372k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(j0 j0Var, ak1.b bVar, int i13) {
        super(1);
        this.f62370i = i13;
        this.f62371j = j0Var;
        this.f62372k = bVar;
    }

    public final d b(d it) {
        int i13 = this.f62370i;
        ak1.b bVar = this.f62372k;
        j0 j0Var = this.f62371j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return d.e(CollectionsKt.m0(bVar, CollectionsKt.m0(j0Var.f80434a, it.f62348a)));
            default:
                Intrinsics.checkNotNullParameter(it, "state");
                return d.e(CollectionsKt.m0(bVar, CollectionsKt.m0(j0Var.f80434a, it.f62348a)));
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f62370i) {
        }
        return b((d) obj);
    }
}
