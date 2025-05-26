package xy0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import ln1.l;
import m60.x0;

/* loaded from: classes5.dex */
public final class d extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final d f136200j = new d(0);

    /* renamed from: k, reason: collision with root package name */
    public static final d f136201k = new d(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f136202i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i13) {
        super(1);
        this.f136202i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f136202i) {
            case 0:
                yl1.b it = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], x0.next), false, null, null, null, null, null, null, 0, null, 1020);
            default:
                l bind = (l) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.a(ln1.e.LOADING);
                bind.f84048e = fm1.c.VISIBLE;
                return Unit.f80348a;
        }
    }
}
