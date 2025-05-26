package j6;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import h6.m;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class e extends h6.j {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f74801a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f74802b;

    public e(TextView textView, f fVar) {
        this.f74801a = new WeakReference(textView);
        this.f74802b = new WeakReference(fVar);
    }

    @Override // h6.j
    public final void b() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f74801a.get();
        InputFilter inputFilter = (InputFilter) this.f74802b.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    m a13 = m.a();
                    if (text == null) {
                        length = 0;
                    } else {
                        a13.getClass();
                        length = text.length();
                    }
                    CharSequence g13 = a13.g(0, length, text, 0);
                    if (text == g13) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(g13);
                    int selectionEnd = Selection.getSelectionEnd(g13);
                    textView.setText(g13);
                    if (g13 instanceof Spannable) {
                        Spannable spannable = (Spannable) g13;
                        if (selectionStart >= 0 && selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionStart, selectionEnd);
                            return;
                        } else if (selectionStart >= 0) {
                            Selection.setSelection(spannable, selectionStart);
                            return;
                        } else {
                            if (selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionEnd);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }
}
