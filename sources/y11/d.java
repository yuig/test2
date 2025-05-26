package y11;

import android.text.Html;
import android.text.Spanned;
import com.pinterest.feature.pin.edit.view.AttributeActionView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class d extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f136642i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ AttributeActionView f136643j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Integer f136644k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(AttributeActionView attributeActionView, Integer num, int i13) {
        super(1);
        this.f136642i = i13;
        this.f136643j = attributeActionView;
        this.f136644k = num;
    }

    public final rn1.a b(rn1.a it) {
        int i13 = this.f136642i;
        AttributeActionView attributeActionView = this.f136643j;
        Integer num = this.f136644k;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                fm1.c cVar = fm1.c.VISIBLE;
                Spanned fromHtml = Html.fromHtml(bs1.c.f2(attributeActionView, num.intValue()));
                Intrinsics.checkNotNullExpressionValue(fromHtml, "fromHtml(...)");
                return rn1.a.y(it, bs1.c.h2(fromHtml), null, null, null, null, 0, cVar, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                fm1.c cVar2 = fm1.c.VISIBLE;
                Spanned fromHtml2 = Html.fromHtml(bs1.c.f2(attributeActionView, num.intValue()));
                Intrinsics.checkNotNullExpressionValue(fromHtml2, "fromHtml(...)");
                return rn1.a.y(it, bs1.c.h2(fromHtml2), null, null, null, null, 0, cVar2, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f136642i) {
        }
        return b((rn1.a) obj);
    }
}
