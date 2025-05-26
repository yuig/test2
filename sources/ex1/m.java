package ex1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class m extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final m f60418j = new m(0);

    /* renamed from: k, reason: collision with root package name */
    public static final m f60419k = new m(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f60420i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i13) {
        super(1);
        this.f60420i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f60420i) {
            case 0:
                ln1.l bind = (ln1.l) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.a(ln1.e.LOADING);
                bind.d(fm1.c.VISIBLE);
                return Unit.f80348a;
            default:
                yl1.b it = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], com.pinterest.partnerAnalytics.g.see_all_pins_label), false, null, null, null, null, null, null, 0, null, 1022);
        }
    }
}
