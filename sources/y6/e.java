package y6;

import android.util.Log;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* loaded from: classes3.dex */
public final class e extends FutureTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f137908a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a aVar, d dVar) {
        super(dVar);
        this.f137908a = aVar;
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        a aVar = this.f137908a;
        try {
            Object obj = get();
            if (aVar.f137895d.get()) {
                return;
            }
            aVar.a(obj);
        } catch (InterruptedException e13) {
            Log.w("AsyncTask", e13);
        } catch (CancellationException unused) {
            if (aVar.f137895d.get()) {
                return;
            }
            aVar.a(null);
        } catch (ExecutionException e14) {
            throw new RuntimeException("An error occurred while executing doInBackground()", e14.getCause());
        } catch (Throwable th3) {
            throw new RuntimeException("An error occurred while executing doInBackground()", th3);
        }
    }
}
