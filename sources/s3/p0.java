package s3;

import android.graphics.drawable.Drawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class p0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f110862i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f110863j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f110864k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f110865l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(Object obj, Object obj2, long j13, int i13) {
        super(0);
        this.f110862i = i13;
        this.f110864k = obj;
        this.f110865l = obj2;
        this.f110863j = j13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f110862i) {
            case 0:
                m251invoke();
                break;
            default:
                m251invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m251invoke() {
        a1 V0;
        int i13 = this.f110862i;
        Object obj = this.f110865l;
        Object obj2 = this.f110864k;
        switch (i13) {
            case 0:
                v0 v0Var = (v0) obj2;
                q3.m0 m0Var = null;
                if (com.bumptech.glide.c.t0(v0Var.f110967a)) {
                    q1 q1Var = v0Var.b().f110901o;
                    if (q1Var != null) {
                        m0Var = q1Var.f111015i;
                    }
                } else {
                    q1 q1Var2 = v0Var.b().f110901o;
                    if (q1Var2 != null && (V0 = q1Var2.V0()) != null) {
                        m0Var = V0.f111015i;
                    }
                }
                if (m0Var == null) {
                    t3.c0 c0Var = (t3.c0) ((a2) obj);
                    c0Var.getClass();
                    int i14 = q3.e1.f102202b;
                    m0Var = new q3.m0(c0Var, 1);
                }
                a1 V02 = v0Var.b().V0();
                Intrinsics.f(V02);
                q3.b1.e(m0Var, V02, this.f110863j);
                break;
            default:
                j91.d dVar = (j91.d) obj2;
                int i15 = j91.d.f75110h;
                dVar.f75115e = dVar.f((Drawable) obj, dVar.c(), this.f110863j, 2.0f);
                break;
        }
    }
}
