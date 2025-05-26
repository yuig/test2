package bb1;

import android.text.Html;
import android.text.Spanned;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f22534i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p f22535j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(p pVar, int i13) {
        super(1);
        this.f22534i = i13;
        this.f22535j = pVar;
    }

    public final ao1.b b(ao1.b it) {
        int i13 = this.f22534i;
        p pVar = this.f22535j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return ao1.b.e(it, bs1.c.h2(String.valueOf(pVar.f22546s0)), null, null, null, null, false, 0, 0, 0, false, false, false, null, false, null, null, null, null, null, 0, 4194302);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                yn1.f fVar = yn1.f.ERROR;
                String string = pVar.getString(l52.c.settings_enable_mfa_confirm_email_error);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                return ao1.b.e(it, null, null, bs1.c.h2(string), null, fVar, false, 0, 0, 0, false, false, false, null, false, null, null, null, null, null, 0, 4194267);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f22534i) {
            case 0:
                return b((ao1.b) obj);
            case 1:
                rn1.a it = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                Spanned fromHtml = Html.fromHtml(this.f22535j.getResources().getString(l52.c.settings_enable_mfa_confirm_email_error_with_link), 63);
                Intrinsics.checkNotNullExpressionValue(fromHtml, "fromHtml(...)");
                return rn1.a.y(it, bs1.c.h2(fromHtml), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            default:
                return b((ao1.b) obj);
        }
    }
}
