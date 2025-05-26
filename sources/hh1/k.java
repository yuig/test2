package hh1;

import android.content.Context;
import android.view.View;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;

/* loaded from: classes5.dex */
public final class k implements s {

    /* renamed from: a, reason: collision with root package name */
    public GestaltText f69181a;

    @Override // hh1.s
    public final View a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        View inflate = View.inflate(context, p92.c.view_idea_pin_tooltip_tag_text, null);
        View findViewById = inflate.findViewById(p92.b.title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f69181a = (GestaltText) findViewById;
        Intrinsics.checkNotNullExpressionValue(inflate, "apply(...)");
        return inflate;
    }

    @Override // hh1.s
    public final void b(l lVar) {
        r data = (r) lVar;
        Intrinsics.checkNotNullParameter(data, "data");
        GestaltText gestaltText = this.f69181a;
        if (gestaltText != null) {
            a0.p(gestaltText, data.f69214f);
        } else {
            Intrinsics.r("textView");
            throw null;
        }
    }
}
