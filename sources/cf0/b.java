package cf0;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class b extends ClickableSpan {
    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds2) {
        Intrinsics.checkNotNullParameter(ds2, "ds");
    }
}
