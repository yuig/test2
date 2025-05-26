package e21;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import so.oa;

/* loaded from: classes5.dex */
public final class l extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final l f56977j = new l(0);

    /* renamed from: k, reason: collision with root package name */
    public static final l f56978k = new l(1);

    /* renamed from: l, reason: collision with root package name */
    public static final l f56979l = new l(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f56980i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i13) {
        super(1);
        this.f56980i = i13;
    }

    public final void b(Throwable th3) {
        switch (this.f56980i) {
            case 0:
                break;
            default:
                Context context = kb0.a.f79058b;
                ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().i(th3.getLocalizedMessage());
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f56980i) {
            case 0:
                b((Throwable) obj);
                break;
            case 1:
                v32.c it = (v32.c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                b((Throwable) obj);
                break;
        }
        return Unit.f80348a;
    }
}
