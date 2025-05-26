package jq1;

import android.content.res.Resources;
import android.text.Html;
import android.text.Spanned;
import kh2.g0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import ps0.y;

/* loaded from: classes5.dex */
public final class m extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f77498i = 0;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n f77499j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f77500k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, n nVar) {
        super(1);
        this.f77500k = str;
        this.f77499j = nVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f77498i;
        String str = this.f77500k;
        n nVar = this.f77499j;
        switch (i13) {
            case 0:
                yl1.b it = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                Resources resources = nVar.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                Intrinsics.checkNotNullParameter(resources, "resources");
                y yVar = ro1.c.f108967f;
                if (str == null) {
                    str = "";
                }
                String string = resources.getString(g0.j(y.e(str)));
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                return yl1.b.f(it, bs1.c.h2(string), false, fm1.c.VISIBLE, null, null, null, null, null, 0, null, 1018);
            default:
                rn1.a it2 = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                Spanned fromHtml = Html.fromHtml(nVar.getResources().getString(fq1.d.idea_pin_list_bottom_sheet_by, str));
                Intrinsics.checkNotNullExpressionValue(fromHtml, "fromHtml(...)");
                return rn1.a.y(it2, bs1.c.h2(fromHtml), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, String str) {
        super(1);
        this.f77499j = nVar;
        this.f77500k = str;
    }
}
