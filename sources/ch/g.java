package ch;

import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
public abstract class g extends r {

    /* renamed from: d, reason: collision with root package name */
    public TaskCompletionSource f27721d;

    public /* synthetic */ g(int i13) {
        super(null, false, i13);
    }

    @Override // com.google.android.gms.common.api.internal.r
    public final /* bridge */ /* synthetic */ void b(com.google.android.gms.common.api.c cVar, TaskCompletionSource taskCompletionSource) {
        this.f27721d = taskCompletionSource;
        c((zh.f) ((zh.c) cVar).getService());
    }

    public abstract void c(zh.f fVar);
}
