package hh;

import android.os.Bundle;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* loaded from: classes3.dex */
public final /* synthetic */ class n implements SuccessContinuation {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ n f69131a = new n();

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i13 = a.f69091h;
        return (bundle == null || !bundle.containsKey("google.messenger")) ? Tasks.forResult(bundle) : Tasks.forResult(null);
    }
}
