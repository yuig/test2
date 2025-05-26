package kb;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lkb/u0;", "", "Landroid/content/Context;", "context", "Lkb/w0;", "a", "(Landroid/content/Context;)Lkb/w0;", "Lkb/d;", "configuration", "", "b", "(Landroid/content/Context;Lkb/d;)V", "", "c", "()Z", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class u0 {
    private u0() {
    }

    public /* synthetic */ u0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public w0 a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        lb.j0 h10 = lb.j0.h(context);
        Intrinsics.checkNotNullExpressionValue(h10, "getInstance(context)");
        return h10;
    }

    public void b(@NotNull Context context, @NotNull d configuration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        lb.j0.i(context, configuration);
    }

    public boolean c() {
        lb.j0 j0Var;
        synchronized (lb.j0.f82604n) {
            try {
                j0Var = lb.j0.f82602l;
                if (j0Var == null) {
                    j0Var = lb.j0.f82603m;
                }
            } finally {
            }
        }
        return j0Var != null;
    }
}
