package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class AppCompatEmojiTextHelper {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f16303a;

    /* renamed from: b, reason: collision with root package name */
    public final h1.b f16304b;

    public AppCompatEmojiTextHelper(TextView textView) {
        this.f16303a = textView;
        this.f16304b = new h1.b(textView);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return ((e3.b) this.f16304b.f66449b).b(inputFilterArr);
    }

    public final void b(AttributeSet attributeSet, int i13) {
        TypedArray obtainStyledAttributes = this.f16303a.getContext().obtainStyledAttributes(attributeSet, i.j.AppCompatTextView, i13, 0);
        try {
            boolean z13 = obtainStyledAttributes.hasValue(i.j.AppCompatTextView_emojiCompatEnabled) ? obtainStyledAttributes.getBoolean(i.j.AppCompatTextView_emojiCompatEnabled, true) : true;
            obtainStyledAttributes.recycle();
            ((e3.b) this.f16304b.f66449b).k(z13);
        } catch (Throwable th3) {
            obtainStyledAttributes.recycle();
            throw th3;
        }
    }

    public final void c(boolean z13) {
        ((e3.b) this.f16304b.f66449b).h(z13);
    }
}
