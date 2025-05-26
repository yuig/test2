package h4;

import android.os.Handler;
import android.view.inputmethod.InputConnection;

/* loaded from: classes3.dex */
public abstract class u extends t {
    @Override // h4.t
    public final void a(InputConnection inputConnection) {
        inputConnection.closeConnection();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i13, int i14) {
        InputConnection inputConnection = this.f67611b;
        if (inputConnection != null) {
            return inputConnection.deleteSurroundingTextInCodePoints(i13, i14);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        InputConnection inputConnection = this.f67611b;
        if (inputConnection != null) {
            return inputConnection.getHandler();
        }
        return null;
    }
}
