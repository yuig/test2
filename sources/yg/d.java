package yg;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements SuccessContinuation {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ d f139007a = new d();

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object obj) {
        return Tasks.forResult((Boolean) obj);
    }
}
