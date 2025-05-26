package h4;

import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

/* loaded from: classes3.dex */
public final class w extends v {
    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        InputConnection inputConnection = this.f67611b;
        if (inputConnection != null) {
            inputConnection.performHandwritingGesture(handwritingGesture, executor, intConsumer);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        boolean previewHandwritingGesture;
        InputConnection inputConnection = this.f67611b;
        if (inputConnection == null) {
            return false;
        }
        previewHandwritingGesture = inputConnection.previewHandwritingGesture(previewableHandwritingGesture, cancellationSignal);
        return previewHandwritingGesture;
    }
}
