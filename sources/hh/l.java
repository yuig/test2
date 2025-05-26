package hh;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.IOException;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements Continuation {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ l f69127a = new l();

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        if (task.isSuccessful()) {
            return (Bundle) task.getResult();
        }
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(task.getException());
            StringBuilder sb3 = new StringBuilder(valueOf.length() + 22);
            sb3.append("Error making request: ");
            sb3.append(valueOf);
            Log.d("Rpc", sb3.toString());
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", task.getException());
    }
}
