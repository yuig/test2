package j6;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import h6.m;

/* loaded from: classes.dex */
public final class k implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f74812a;

    /* renamed from: c, reason: collision with root package name */
    public j f74814c;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f74813b = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f74815d = true;

    public k(EditText editText) {
        this.f74812a = editText;
    }

    public static void a(EditText editText, int i13) {
        int length;
        if (i13 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            m a13 = m.a();
            if (editableText == null) {
                length = 0;
            } else {
                a13.getClass();
                length = editableText.length();
            }
            a13.g(0, length, editableText, 0);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
        EditText editText = this.f74812a;
        if (editText.isInEditMode() || !this.f74815d) {
            return;
        }
        if ((this.f74813b || m.c()) && i14 <= i15 && (charSequence instanceof Spannable)) {
            int b13 = m.a().b();
            if (b13 != 0) {
                if (b13 == 1) {
                    m.a().g(i13, i15 + i13, (Spannable) charSequence, 0);
                    return;
                } else if (b13 != 3) {
                    return;
                }
            }
            m a13 = m.a();
            if (this.f74814c == null) {
                this.f74814c = new j(editText);
            }
            a13.h(this.f74814c);
        }
    }
}
