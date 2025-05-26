package ek1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class k1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f59269i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ yi1.r f59270j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k1(yi1.r rVar, int i13) {
        super(1);
        this.f59269i = i13;
        this.f59270j = rVar;
    }

    public final r1 b(r1 it) {
        switch (this.f59269i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return r1.b(it, null, null, 0, null, null, null, false, false, this.f59270j, 0, null, null, false, false, null, false, false, null, null, false, false, false, false, null, null, false, false, false, null, null, false, null, false, false, false, -4097, 4194303);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return r1.b(it, null, null, 0, null, null, null, false, false, yi1.r.a(this.f59270j, false, null, 0L, 0L, false, true, null, 383), 0, null, null, false, false, null, false, false, null, null, false, false, false, false, null, null, false, false, false, null, null, false, null, false, false, false, -4097, 4194303);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return r1.b(it, null, null, 0, null, null, null, false, false, this.f59270j, 0, null, null, false, false, null, false, false, null, null, false, false, false, false, null, null, false, false, false, null, null, false, null, false, false, false, -4097, 4194303);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f59269i) {
        }
        return b((r1) obj);
    }
}
