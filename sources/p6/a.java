package p6;

import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.Map;
import kb.a0;
import pk.h1;
import ue.c;

/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    public final Map f98905a;

    public a(h1 h1Var) {
        this.f98905a = h1Var;
    }

    @Override // ue.c
    public final a0 n(Context context, String str, WorkerParameters workerParameters) {
        wk2.a aVar = (wk2.a) this.f98905a.get(str);
        if (aVar == null) {
            return null;
        }
        return ((b) aVar.get()).a(context, workerParameters);
    }
}
