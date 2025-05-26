package h6;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class e0 implements TextWatcher, SpanWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final Object f67708a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f67709b = new AtomicInteger(0);

    public e0(Object obj) {
        this.f67708a = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f67708a).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
        ((TextWatcher) this.f67708a).beforeTextChanged(charSequence, i13, i14, i15);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i13, int i14) {
        if (this.f67709b.get() <= 0 || !(obj instanceof x)) {
            ((SpanWatcher) this.f67708a).onSpanAdded(spannable, obj, i13, i14);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i13, int i14, int i15, int i16) {
        int i17;
        int i18;
        if (this.f67709b.get() <= 0 || !(obj instanceof x)) {
            if (Build.VERSION.SDK_INT < 28) {
                if (i13 > i14) {
                    i13 = 0;
                }
                if (i15 > i16) {
                    i17 = i13;
                    i18 = 0;
                    ((SpanWatcher) this.f67708a).onSpanChanged(spannable, obj, i17, i14, i18, i16);
                }
            }
            i17 = i13;
            i18 = i15;
            ((SpanWatcher) this.f67708a).onSpanChanged(spannable, obj, i17, i14, i18, i16);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i13, int i14) {
        if (this.f67709b.get() <= 0 || !(obj instanceof x)) {
            ((SpanWatcher) this.f67708a).onSpanRemoved(spannable, obj, i13, i14);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
        ((TextWatcher) this.f67708a).onTextChanged(charSequence, i13, i14, i15);
    }
}
