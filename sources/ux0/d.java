package ux0;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.pinterest.feature.newshub.feed.view.NewsHubFeedItemBaseView;
import h32.u0;
import kg.n;
import kotlin.jvm.internal.Intrinsics;
import px0.j;
import rx0.g;
import x02.w1;

/* loaded from: classes5.dex */
public final class d extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final String f123238a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f123239b;

    public d(e eVar, String textKey) {
        Intrinsics.checkNotNullParameter(textKey, "textKey");
        this.f123239b = eVar;
        this.f123238a = textKey;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        n.a(widget);
        Intrinsics.checkNotNullParameter(widget, "widget");
        g gVar = this.f123239b.f123241b;
        gVar.getClass();
        String textKey = this.f123238a;
        Intrinsics.checkNotNullParameter(textKey, "textKey");
        NewsHubFeedItemBaseView newsHubFeedItemBaseView = gVar.f110195a;
        mx0.a aVar = newsHubFeedItemBaseView.f46808i;
        if (aVar != null) {
            u0 u0Var = u0.NEWS_HUB_HEADER_TEXT;
            w1 w1Var = newsHubFeedItemBaseView.f46804e;
            if (w1Var == null) {
                Intrinsics.r("newsHubRepository");
                throw null;
            }
            ((j) aVar).p3(u0Var, w1Var.f131517a);
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds2) {
        Intrinsics.checkNotNullParameter(ds2, "ds");
    }
}
