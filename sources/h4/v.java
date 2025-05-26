package h4;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes3.dex */
public class v extends u {
    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i13, Bundle bundle) {
        InputConnection inputConnection = this.f67611b;
        if (inputConnection != null) {
            return inputConnection.commitContent(inputContentInfo, i13, bundle);
        }
        return false;
    }
}
