package ni1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d2 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f90638i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ wa2.m f90639j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d2(wa2.m mVar, int i13) {
        super(1);
        this.f90638i = i13;
        this.f90639j = mVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f90638i) {
            case 0:
                y2 it = (y2) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return y2.b(it, this.f90639j, null, null, false, false, null, null, false, false, false, false, 0, false, false, null, null, null, null, null, null, null, -5, 4194303);
            default:
                u0 it2 = (u0) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return u0.e(it2, 0, null, null, false, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, ps0.m.d(this.f90639j), 1048575);
        }
    }
}
