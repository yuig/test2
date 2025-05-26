package y3;

import android.graphics.Point;
import android.view.ScrollCaptureTarget;
import android.view.View;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import i2.y3;
import java.util.function.Consumer;
import kh2.m2;
import kh2.n3;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import z3.r;

/* loaded from: classes.dex */
public final class m implements a {

    /* renamed from: a, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f136728a = bs1.c.u1(Boolean.FALSE, y3.f71400a);

    public final void a(@NotNull View view, @NotNull r rVar, @NotNull CoroutineContext coroutineContext, @NotNull Consumer<ScrollCaptureTarget> consumer) {
        k2.e eVar = new k2.e(new n[16]);
        m2.V1(rVar.a(), 0, new l(eVar, 0));
        eVar.q(al2.a.a(e.f136705k, e.f136706l));
        n nVar = (n) (eVar.l() ? null : eVar.f78182a[eVar.f78184c - 1]);
        if (nVar == null) {
            return;
        }
        g gVar = new g(nVar.b(), nVar.c(), dl2.b.b(coroutineContext), this);
        a3.d c13 = androidx.compose.ui.layout.b.c(nVar.a());
        long a13 = nVar.c().a();
        ScrollCaptureTarget b13 = w2.b.b(view, n3.M0(kh2.r.j1(c13)), new Point((int) (a13 >> 32), (int) (a13 & 4294967295L)), gVar);
        b13.setScrollBounds(n3.M0(nVar.c()));
        consumer.accept(b13);
    }
}
