package tu1;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class t implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final v f119443a;

    public t(v libraryInstaller) {
        Intrinsics.checkNotNullParameter(libraryInstaller, "libraryInstaller");
        this.f119443a = libraryInstaller;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        n0 state = task.isSuccessful() ? n0.INSTALLED : n0.INSTALLATION_FAILED;
        v vVar = this.f119443a;
        ((AtomicReference) vVar.f119460c.getValue()).set(state);
        x xVar = vVar.f119459b;
        xVar.getClass();
        Intrinsics.checkNotNullParameter(state, "state");
        xVar.f119465b.set(state);
        ((lb0.b) xVar.f119464a).l("CRONET_LIBRARY_STATE", state.getValue());
    }
}
