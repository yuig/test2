package za2;

import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import vn1.e;

/* loaded from: classes4.dex */
public final class a extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f141479j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f141480k = new a(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f141481i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(1);
        this.f141481i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f141481i) {
            case 0:
                yl1.b it = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, false, null, null, null, null, null, null, f62.c.general_shopping_upsell_button, null, 767);
            default:
                rn1.a it2 = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return rn1.a.y(it2, null, vn1.c.LIGHT, null, e0.b(e.BOLD), null, 0, null, null, null, null, false, f62.c.general_shopping_upsell_title, null, null, null, null, null, false, null, null, 2095093);
        }
    }
}
