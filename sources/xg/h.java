package xg;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.engage.service.AppEngageException;
import com.google.android.gms.internal.engage.zzp;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements Continuation {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ h f134920a = new h();

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        fi.b bVar = e.f134910e;
        if (task.isCanceled()) {
            return Tasks.forException(new AppEngageException(3));
        }
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            return exception != null ? exception instanceof zzp ? Tasks.forException(new AppEngageException(2)) : Tasks.forException(exception) : Tasks.forException(new AppEngageException(3));
        }
        Bundle bundle = (Bundle) task.getResult();
        int i13 = bundle.getInt("service_error_code", -1);
        String string = bundle.getString("service_error_message", "");
        return i13 > 0 ? !TextUtils.isEmpty(string) ? Tasks.forException(new AppEngageException(i13, string)) : Tasks.forException(new AppEngageException(i13)) : Tasks.forResult(bundle);
    }
}
