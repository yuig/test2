package x91;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f134323i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f134324j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(j jVar, int i13) {
        super(1);
        this.f134323i = i13;
        this.f134324j = jVar;
    }

    public final a b(a it) {
        int i13 = this.f134323i;
        j jVar = this.f134324j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return a.e(it, null, ((c) jVar).f134310a, false, null, 13);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return a.e(it, ((e) jVar).f134313a, null, false, null, 14);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f134323i) {
        }
        return b((a) obj);
    }
}
