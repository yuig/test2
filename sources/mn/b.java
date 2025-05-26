package mn;

import android.os.AsyncTask;
import com.google.android.gms.internal.measurement.x;
import java.util.ArrayDeque;
import java.util.concurrent.ThreadPoolExecutor;
import m.h;

/* loaded from: classes3.dex */
public abstract class b extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public h f87750a;

    /* renamed from: b, reason: collision with root package name */
    public final x f87751b;

    public b(x xVar) {
        this.f87751b = xVar;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        h hVar = this.f87750a;
        if (hVar != null) {
            hVar.f85200e = null;
            b bVar = (b) ((ArrayDeque) hVar.f85199d).poll();
            hVar.f85200e = bVar;
            if (bVar != null) {
                bVar.executeOnExecutor((ThreadPoolExecutor) hVar.f85198c, new Object[0]);
            }
        }
    }
}
