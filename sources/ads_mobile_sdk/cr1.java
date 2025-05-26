package ads_mobile_sdk;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes2.dex */
public abstract class cr1 extends AsyncTask {

    /* renamed from: a */
    public a.u f4008a;

    /* renamed from: b */
    public final a.o0 f4009b;

    public cr1(an2 an2Var) {
        this.f4009b = an2Var;
    }

    public final void a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(String str) {
        a.u uVar = this.f4008a;
        if (uVar != null) {
            dr1 dr1Var = (dr1) uVar;
            dr1Var.f4417c = null;
            dr1Var.a();
        }
    }
}
