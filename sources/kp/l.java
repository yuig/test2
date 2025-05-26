package kp;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.x0;

/* loaded from: classes3.dex */
public final class l extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final l f80543j = new l(0);

    /* renamed from: k, reason: collision with root package name */
    public static final l f80544k = new l(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f80545i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i13) {
        super(1);
        this.f80545i = i13;
    }

    public final yl1.b b(yl1.b it) {
        switch (this.f80545i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], x0.unblock), false, null, null, null, null, null, null, 0, null, 1022);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], x0.block), false, null, null, null, null, null, null, 0, null, 1022);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f80545i) {
        }
        return b((yl1.b) obj);
    }
}
