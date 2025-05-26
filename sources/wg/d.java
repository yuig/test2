package wg;

import ai.k;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;
import fi.i;
import xg.l;

/* loaded from: classes.dex */
public abstract class d extends k {
    @Override // ai.k
    public final boolean j(int i13, Parcel parcel) {
        if (i13 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) fi.a.a(parcel, Bundle.CREATOR);
        fi.a.b(parcel);
        l lVar = (l) this;
        i iVar = lVar.f134930c.f134917d;
        TaskCompletionSource taskCompletionSource = lVar.f134929b;
        if (iVar != null) {
            iVar.c(taskCompletionSource);
        }
        taskCompletionSource.trySetResult(bundle);
        return true;
    }
}
