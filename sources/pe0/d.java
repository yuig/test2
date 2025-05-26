package pe0;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class d extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final String f99930a;

    /* renamed from: b, reason: collision with root package name */
    public final int f99931b;

    public d(Context context, Integer num, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f99930a = url;
        int intValue = num != null ? num.intValue() : eo1.b.color_themed_text_default;
        Object obj = d5.a.f53679a;
        this.f99931b = context.getColor(intValue);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds2) {
        Intrinsics.checkNotNullParameter(ds2, "ds");
        ds2.setColor(this.f99931b);
        ds2.setUnderlineText(true);
    }
}
