package h4;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public abstract class t implements InputConnection {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f67610a;

    /* renamed from: b, reason: collision with root package name */
    public InputConnection f67611b;

    public t(y1.i0 i0Var, q0.e eVar) {
        this.f67610a = eVar;
        this.f67611b = i0Var;
    }

    public abstract void a(InputConnection inputConnection);

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        InputConnection inputConnection = this.f67611b;
        if (inputConnection != null) {
            return inputConnection.beginBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i13) {
        InputConnection inputConnection = this.f67611b;
        if (inputConnection != null) {
            return inputConnection.clearMetaKeyStates(i13);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        InputConnection inputConnection = this.f67611b;
        if (inputConnection != null) {
            if (inputConnection != null) {
                a(inputConnection);
                this.f67611b = null;
            }
            this.f67610a.invoke(this);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        InputConnection inputConnection = this.f67611b;
        if (inputConnection != null) {
            return inputConnection.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        InputConnection inputConnection = this.f67611b;
        if (inputConnection != null) {
            return inputConnection.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i13) {
        InputConnection inputConnection = this.f67611b;
        if (inputConnection != null) {
            return inputConnection.commitText(charSequence, i13);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i13, int i14) {
        InputConnection inputConnection = this.f67611b;
        if (inputConnection != null) {
            return inputConnection.deleteSurroundingText(i13, i14);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        InputConnection inputConnection = this.f67611b;
        if (inputConnection != null) {
            return inputConnection.endBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        InputConnection inputConnection = this.f67611b;
        if (inputConnection != null) {
            return inputConnection.finishComposingText();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i13) {
        InputConnection inputConnection = this.f67611b;
        if (inputConnection != null) {
            return inputConnection.getCursorCapsMode(i13);
        }
        return 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i13) {
        ExtractedText extractedText;
        InputConnection inputConnection = this.f67611b;
        return (inputConnection == null || (extractedText = inputConnection.getExtractedText(extractedTextRequest, i13)) == null) ? new ExtractedText() : extractedText;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i13) {
        CharSequence selectedText;
        InputConnection inputConnection = this.f67611b;
        return (inputConnection == null || (selectedText = inputConnection.getSelectedText(i13)) == null) ? "" : selectedText;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i13, int i14) {
        InputConnection inputConnection = this.f67611b;
        if (inputConnection != null) {
            return inputConnection.getTextAfterCursor(i13, i14);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i13, int i14) {
        InputConnection inputConnection = this.f67611b;
        if (inputConnection != null) {
            return inputConnection.getTextBeforeCursor(i13, i14);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i13) {
        InputConnection inputConnection = this.f67611b;
        if (inputConnection != null) {
            return inputConnection.performContextMenuAction(i13);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i13) {
        InputConnection inputConnection = this.f67611b;
        if (inputConnection != null) {
            return inputConnection.performEditorAction(i13);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        InputConnection inputConnection = this.f67611b;
        if (inputConnection != null) {
            return inputConnection.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z13) {
        InputConnection inputConnection = this.f67611b;
        if (inputConnection != null) {
            return inputConnection.reportFullscreenMode(z13);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i13) {
        InputConnection inputConnection = this.f67611b;
        if (inputConnection != null) {
            return inputConnection.requestCursorUpdates(i13);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        InputConnection inputConnection = this.f67611b;
        if (inputConnection != null) {
            return inputConnection.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i13, int i14) {
        InputConnection inputConnection = this.f67611b;
        if (inputConnection != null) {
            return inputConnection.setComposingRegion(i13, i14);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i13) {
        InputConnection inputConnection = this.f67611b;
        if (inputConnection != null) {
            return inputConnection.setComposingText(charSequence, i13);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i13, int i14) {
        InputConnection inputConnection = this.f67611b;
        if (inputConnection != null) {
            return inputConnection.setSelection(i13, i14);
        }
        return false;
    }
}
