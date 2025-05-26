package y1;

import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import b2.t0;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import t3.e4;
import w1.l1;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f136572a = new h();

    public final void a(l1 l1Var, t0 t0Var, @NotNull HandwritingGesture handwritingGesture, e4 e4Var, Executor executor, IntConsumer intConsumer, @NotNull Function1<? super h4.j, Unit> function1) {
        int i13 = l1Var != null ? u.f136603a.i(l1Var, handwritingGesture, t0Var, e4Var, function1) : 3;
        if (intConsumer == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new v.k(intConsumer, i13, 5));
        } else {
            intConsumer.accept(i13);
        }
    }

    public final boolean b(l1 l1Var, t0 t0Var, @NotNull PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        if (l1Var != null) {
            return u.f136603a.A(l1Var, previewableHandwritingGesture, t0Var, cancellationSignal);
        }
        return false;
    }
}
