package wg;

import ai.k;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;
import fi.i;

/* loaded from: classes3.dex */
public abstract class f extends k {
    @Override // ai.k
    public final boolean j(int i13, Parcel parcel) {
        if (i13 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) fi.a.a(parcel, Bundle.CREATOR);
        fi.a.b(parcel);
        xg.c cVar = (xg.c) this;
        i iVar = cVar.f134909c.f134917d;
        TaskCompletionSource taskCompletionSource = cVar.f134908b;
        if (iVar != null) {
            iVar.c(taskCompletionSource);
        }
        taskCompletionSource.trySetResult(bundle);
        return true;
    }
}
