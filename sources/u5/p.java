package u5;

import android.content.Context;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public interface p {
    boolean isAvailableOnDevice();

    void onCreateCredential(Context context, c cVar, CancellationSignal cancellationSignal, Executor executor, m mVar);

    void onGetCredential(Context context, y yVar, CancellationSignal cancellationSignal, Executor executor, m mVar);
}
