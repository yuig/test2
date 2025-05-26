package b2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class f0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final f0 f21142j = new f0(0);

    /* renamed from: k, reason: collision with root package name */
    public static final f0 f21143k = new f0(1);

    /* renamed from: l, reason: collision with root package name */
    public static final f0 f21144l = new f0(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f21145i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(int i13) {
        super(1);
        this.f21145i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f21145i) {
            case 0:
                long j13 = ((a3.c) obj).f482a;
                return com.bumptech.glide.c.y0(j13) ? new j1.q(a3.c.d(j13), a3.c.e(j13)) : i0.f21164a;
            case 1:
                j1.q qVar = (j1.q) obj;
                return new a3.c(com.bumptech.glide.c.d(qVar.f74199a, qVar.f74200b));
            default:
                return Unit.f80348a;
        }
    }
}
