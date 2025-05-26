package jv0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class f extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final f f77622j = new f(0);

    /* renamed from: k, reason: collision with root package name */
    public static final f f77623k = new f(1);

    /* renamed from: l, reason: collision with root package name */
    public static final f f77624l = new f(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f77625i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i13) {
        super(1);
        this.f77625i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f77625i) {
            case 0:
                om1.c it = (om1.c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, null, null, om1.f.TRANSPARENT_ALWAYS_LIGHT, null, null, false, 0, 1019);
            case 1:
                ((Throwable) obj).getMessage();
                return Unit.f80348a;
            default:
                yl1.b it2 = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return yl1.b.f(it2, bs1.c.j2(new String[0], aq1.h.idea_pin_product_tagging_email_confirm_cta_text), false, null, null, null, null, null, null, 0, null, 1022);
        }
    }
}
