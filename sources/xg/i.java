package xg;

import android.os.Bundle;
import com.google.android.engage.service.AppEngageException;
import com.google.android.gms.internal.engage.zzp;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements Continuation {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ i f134921a = new i();

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        int errorCode;
        fi.b bVar = e.f134910e;
        if (task.isCanceled()) {
            return Tasks.forException(new AppEngageException(3));
        }
        if (task.isSuccessful()) {
            return Tasks.forResult(Boolean.valueOf(((Bundle) task.getResult()).getBoolean("availability", false)));
        }
        Exception exception = task.getException();
        return exception != null ? exception instanceof zzp ? Tasks.forResult(Boolean.FALSE) : ((exception instanceof AppEngageException) && ((errorCode = ((AppEngageException) exception).getErrorCode()) == 2 || errorCode == 1)) ? Tasks.forResult(Boolean.FALSE) : Tasks.forException(exception) : Tasks.forException(new AppEngageException(3));
    }
}
