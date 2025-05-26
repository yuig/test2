package nx;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import so.oa;

/* loaded from: classes.dex */
public final class p0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: j, reason: collision with root package name */
    public static final p0 f92446j = new p0(0);

    /* renamed from: k, reason: collision with root package name */
    public static final p0 f92447k = new p0(1);

    /* renamed from: l, reason: collision with root package name */
    public static final p0 f92448l = new p0(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f92449i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(int i13) {
        super(0);
        this.f92449i = i13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f92449i) {
            case 0:
                return com.bumptech.glide.d.E();
            case 1:
                Context context = kb0.a.f79058b;
                Object k03 = lb.l0.k0(m60.f0.W(), vy.n.class);
                Intrinsics.checkNotNullExpressionValue(k03, "get(...)");
                return (ox.b) ((oa) ((vy.n) k03)).M1.get();
            default:
                Context context2 = kb0.a.f79058b;
                return (d0) ((oa) ((b1) lb.l0.k0(m60.f0.j0(), b1.class))).f113817n2.get();
        }
    }
}
