package j6;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import android.widget.TextView;
import h6.m;
import v5.x;

/* loaded from: classes3.dex */
public final class d extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f74799a;

    /* renamed from: b, reason: collision with root package name */
    public final x f74800b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        x xVar = new x(17);
        this.f74799a = editText;
        this.f74800b = xVar;
        if (m.c()) {
            m.a().j(editorInfo);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i13, int i14) {
        Editable editableText = this.f74799a.getEditableText();
        this.f74800b.getClass();
        return x.w(this, editableText, i13, i14, false) || super.deleteSurroundingText(i13, i14);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i13, int i14) {
        Editable editableText = this.f74799a.getEditableText();
        this.f74800b.getClass();
        return x.w(this, editableText, i13, i14, true) || super.deleteSurroundingTextInCodePoints(i13, i14);
    }
}
