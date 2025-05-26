package androidx.work;

import android.content.Context;
import androidx.fragment.app.c;
import com.bumptech.glide.d;
import db.m;
import java.util.concurrent.Executor;
import kb.a0;
import kb.z;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r4.l;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/Worker;", "Lkb/a0;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public abstract class Worker extends a0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Worker(@NotNull Context context, @NotNull WorkerParameters workerParams) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
    }

    @Override // kb.a0
    public final l d() {
        Executor backgroundExecutor = this.f78963b.f20001e;
        Intrinsics.checkNotNullExpressionValue(backgroundExecutor, "backgroundExecutor");
        l L = d.L(new c(9, backgroundExecutor, new m(this, 1)));
        Intrinsics.checkNotNullExpressionValue(L, "getFuture {\n        val …        }\n        }\n    }");
        return L;
    }

    @Override // kb.a0
    public final l g() {
        Executor backgroundExecutor = this.f78963b.f20001e;
        Intrinsics.checkNotNullExpressionValue(backgroundExecutor, "backgroundExecutor");
        l L = d.L(new c(9, backgroundExecutor, new androidx.activity.a0(this, 25)));
        Intrinsics.checkNotNullExpressionValue(L, "getFuture {\n        val …        }\n        }\n    }");
        return L;
    }

    public abstract z i();
}
