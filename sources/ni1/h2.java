package ni1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class h2 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f90698i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f90699j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f90700k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f90701l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f90702m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ wa2.m f90703n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, wa2.m mVar) {
        super(1);
        this.f90698i = z13;
        this.f90699j = z14;
        this.f90700k = z15;
        this.f90701l = z16;
        this.f90702m = z17;
        this.f90703n = mVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        y2 it = (y2) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        ek1.r1 b13 = ek1.r1.b(it.W, null, null, 0, null, null, null, false, false, null, 0, null, null, false, false, null, false, false, null, null, false, false, false, this.f90698i, null, null, false, false, false, null, null, false, null, false, this.f90699j, this.f90700k, -1, 2621438);
        bk1.a2 b14 = bk1.a2.b(it.f90904b0, null, false, false, null, null, 0, false, null, null, null, false, false, null, null, 0, this.f90698i, false, false, null, null, null, false, false, false, false, false, false, null, null, null, false, false, null, false, false, null, null, false, false, this.f90699j, this.f90700k, -2097153, 327679);
        return y2.b(it, this.f90703n, null, null, false, false, null, null, false, this.f90698i, false, false, 0, false, false, null, b13, null, null, fk1.w.b(it.Z, null, 0, null, null, false, null, null, false, false, this.f90701l, this.f90702m, null, 13631487), null, b14, -16777221, 1507327);
    }
}
