package ni1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c2 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f90624i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f90625j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f90626k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f90627l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(boolean z13, boolean z14, boolean z15, boolean z16) {
        super(1);
        this.f90624i = z13;
        this.f90625j = z14;
        this.f90626k = z15;
        this.f90627l = z16;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        y2 it = (y2) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return y2.b(it, null, null, null, false, false, null, null, false, false, false, false, 0, false, false, null, ek1.r1.b(it.W, null, null, 0, null, null, null, false, false, null, 0, null, null, false, false, null, false, false, null, null, false, false, false, false, null, null, false, false, false, null, null, false, null, false, this.f90624i, this.f90625j, -1, 2621439), null, null, fk1.w.b(it.Z, null, 0, null, null, false, null, null, false, false, this.f90626k, this.f90627l, null, 13631487), null, bk1.a2.b(it.f90904b0, null, false, false, null, null, 0, false, null, null, null, false, false, null, null, 0, false, false, false, null, null, null, false, false, false, false, false, false, null, null, null, false, false, null, false, false, null, null, false, false, this.f90624i, this.f90625j, -1, 327679), -1, 1507327);
    }
}
