package ki0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f79779j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f79780k = new a(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f79781i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(1);
        this.f79781i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f79781i) {
            case 0:
                yl1.b it = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], b52.c.account_switcher_add_account), false, fm1.c.VISIBLE, null, null, null, null, null, 0, null, 1018);
            default:
                rn1.a it2 = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return rn1.a.y(it2, null, null, null, null, null, 0, null, null, null, null, true, 0, null, null, null, null, null, false, null, null, 2096127);
        }
    }
}
