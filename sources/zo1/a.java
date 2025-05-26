package zo1;

import android.text.Html;
import android.text.Spanned;
import bs1.c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import rg0.g;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f142325i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g f142326j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(g gVar, int i13) {
        super(1);
        this.f142325i = i13;
        this.f142326j = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f142325i;
        g gVar = this.f142326j;
        switch (i13) {
            case 0:
                rn1.a it = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                Spanned fromHtml = Html.fromHtml(gVar.f108015k);
                Intrinsics.checkNotNullExpressionValue(fromHtml, "fromHtml(...)");
                return rn1.a.y(it, c.h2(fromHtml), null, null, null, null, 0, null, null, null, null, true, 0, null, null, null, null, null, false, null, null, 2096126);
            default:
                Intrinsics.checkNotNullParameter((yl1.b) obj, "it");
                String btText2 = gVar.f108009e;
                Intrinsics.checkNotNullExpressionValue(btText2, "btText2");
                return new yl1.b(c.h2(btText2), false, null, null, null, null, null, null, 0, null, 1022);
        }
    }
}
