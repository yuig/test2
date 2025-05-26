package wg;

import ai.k;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;
import fi.i;
import xg.n;

/* loaded from: classes3.dex */
public abstract class e extends k {
    @Override // ai.k
    public final boolean j(int i13, Parcel parcel) {
        if (i13 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) fi.a.a(parcel, Bundle.CREATOR);
        fi.a.b(parcel);
        n nVar = (n) this;
        i iVar = nVar.f134934c.f134917d;
        TaskCompletionSource taskCompletionSource = nVar.f134933b;
        if (iVar != null) {
            iVar.c(taskCompletionSource);
        }
        taskCompletionSource.trySetResult(bundle);
        return true;
    }
}
