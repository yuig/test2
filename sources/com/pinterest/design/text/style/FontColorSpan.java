package com.pinterest.design.text.style;

import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/design/text/style/FontColorSpan;", "Landroid/text/style/ForegroundColorSpan;", "design_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class FontColorSpan extends ForegroundColorSpan {
    @Override // android.text.style.ForegroundColorSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds2) {
        Intrinsics.checkNotNullParameter(ds2, "ds");
        super.updateDrawState(ds2);
        ds2.setTypeface(null);
    }
}
