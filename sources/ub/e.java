package ub;

import androidx.work.impl.WorkDatabase;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase f121655a;

    public e(WorkDatabase workDatabase, int i13) {
        if (i13 == 1) {
            this.f121655a = workDatabase;
        } else {
            Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
            this.f121655a = workDatabase;
        }
    }
}
