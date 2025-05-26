package androidx.work;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.appcompat.app.s;
import androidx.fragment.app.c;
import com.bumptech.glide.d;
import kb.a0;
import r4.l;
import uj2.b0;

/* loaded from: classes.dex */
public abstract class RxWorker extends a0 {

    /* renamed from: e, reason: collision with root package name */
    public static final s f19995e = new s(1);

    public RxWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // kb.a0
    public final l d() {
        return d.L(new c(8, this, b0.g(new IllegalStateException("Expedited WorkRequests require a RxWorker to provide an implementation for `getForegroundInfo()`"))));
    }

    @Override // kb.a0
    public final l g() {
        return d.L(new c(8, this, i()));
    }

    public abstract b0 i();
}
