package c5;

import android.app.job.JobParameters;
import android.content.Intent;
import android.os.AsyncTask;
import com.pinterest.service.DelayedStartupService;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class i extends AsyncTask {

    /* renamed from: a */
    public final /* synthetic */ i0 f25807a;

    public i(i0 i0Var) {
        this.f25807a = i0Var;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        j jVar;
        while (true) {
            i0 i0Var = this.f25807a;
            i0Var.getClass();
            try {
                jVar = i0Var.a();
            } catch (SecurityException unused) {
                jVar = null;
            }
            if (jVar == null) {
                return null;
            }
            i0 i0Var2 = this.f25807a;
            Intent intent = jVar.f25812a.getIntent();
            DelayedStartupService delayedStartupService = (DelayedStartupService) i0Var2;
            delayedStartupService.getClass();
            String action = intent.getAction();
            if (action != null) {
                if (action.equals("com.pinterest.action.CACHE_SHARE_SUGGESTIONS")) {
                    HashMap hashMap = new HashMap();
                    qz.f0 f0Var = new qz.f0();
                    hashMap.put("page_size", 15);
                    f0Var.c(15, "page_size");
                    delayedStartupService.f51766h.a(hashMap, f0Var);
                } else if (action.equals("com.pinterest.action.UPLOAD_CONTACTS")) {
                    ap.o oVar = delayedStartupService.f51767i;
                    oVar.getClass();
                    if (ny1.x.f92714f.a(oVar.f20281a) && oVar.e()) {
                        oVar.f();
                        HashMap c13 = oVar.c();
                        if (oVar.d(c13)) {
                            nl.b.k(oVar.g(c13), "Error uploading contacts in background", ap.l.f20274k);
                        }
                    }
                }
            }
            synchronized (jVar.f25813b.f25815b) {
                try {
                    JobParameters jobParameters = jVar.f25813b.f25816c;
                    if (jobParameters != null) {
                        jobParameters.completeWork(jVar.f25812a);
                    }
                } finally {
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled(Object obj) {
        this.f25807a.getClass();
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        this.f25807a.getClass();
    }
}
