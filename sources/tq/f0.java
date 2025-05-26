package tq;

import android.content.Context;
import com.pinterest.gestalt.text.GestaltText;
import df.j1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f118833i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltText f118834j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f118835k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(GestaltText gestaltText, String str, int i13) {
        super(1);
        this.f118833i = i13;
        this.f118834j = gestaltText;
        this.f118835k = str;
    }

    public final rn1.a b(rn1.a it) {
        int i13 = this.f118833i;
        GestaltText this_apply = this.f118834j;
        String str = this.f118835k;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                CharSequence a03 = j1.a0(bs1.c.g2(this_apply, n80.f.pdp_plus_merchant_disclaimer, str));
                Intrinsics.checkNotNullExpressionValue(a03, "fromHtml(...)");
                return rn1.a.y(it, bs1.c.h2(a03), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                Context context = this_apply.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                return rn1.a.y(it, bs1.c.h2(str), null, null, null, pk.a0.u(context), 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097134);
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                CharSequence a04 = j1.a0(str);
                Intrinsics.checkNotNullExpressionValue(a04, "fromHtml(...)");
                Context context2 = this_apply.getContext();
                int i14 = eo1.b.color_gray_500;
                Object obj = d5.a.f53679a;
                return rn1.a.y(it, bs1.c.h2(f0.h.l0(context2.getColor(i14), a04)), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, true, 0, null, null, null, null, null, false, null, null, 2096062);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                CharSequence a05 = j1.a0(str);
                Intrinsics.checkNotNullExpressionValue(a05, "fromHtml(...)");
                Intrinsics.checkNotNullExpressionValue(this_apply, "$this_apply");
                return rn1.a.y(it, bs1.c.h2(f0.h.l0(bs1.c.B(this_apply, eo1.b.color_themed_text_default), a05)), null, null, null, null, 0, null, null, null, null, true, 0, null, null, null, null, null, false, null, null, 2096126);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f118833i) {
        }
        return b((rn1.a) obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(String str, GestaltText gestaltText, int i13) {
        super(1);
        this.f118833i = i13;
        this.f118835k = str;
        this.f118834j = gestaltText;
    }
}
