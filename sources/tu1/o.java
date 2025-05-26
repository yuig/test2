package tu1;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class o implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f119421a;

    public o(f0 engineAvailabilityRecord) {
        Intrinsics.checkNotNullParameter(engineAvailabilityRecord, "engineAvailabilityRecord");
        this.f119421a = engineAvailabilityRecord;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (task.isSuccessful()) {
            return;
        }
        this.f119421a.f119376c = false;
    }
}
