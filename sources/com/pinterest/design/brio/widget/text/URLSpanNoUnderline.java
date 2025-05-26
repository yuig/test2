package com.pinterest.design.brio.widget.text;

import android.os.Parcel;
import android.text.TextPaint;
import android.text.style.URLSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/pinterest/design/brio/widget/text/URLSpanNoUnderline;", "Landroid/text/style/URLSpan;", "xa0/j", "design_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public class URLSpanNoUnderline extends URLSpan {

    /* renamed from: a, reason: collision with root package name */
    public int f44893a;

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds2) {
        Intrinsics.checkNotNullParameter(ds2, "ds");
        super.updateDrawState(ds2);
        ds2.setColor(this.f44893a);
        ds2.setUnderlineText(false);
    }

    @Override // android.text.style.URLSpan, android.os.Parcelable
    public final void writeToParcel(Parcel out, int i13) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(getURL());
        out.writeInt(this.f44893a);
    }
}
