package li;

import android.os.Looper;
import androidx.camera.core.impl.r1;
import com.google.android.gms.common.api.internal.i0;
import com.google.android.gms.common.api.internal.j0;
import com.google.android.gms.common.api.internal.l;
import com.google.android.gms.common.api.internal.p0;
import com.google.android.gms.internal.location.zzbd;
import com.google.android.gms.internal.measurement.x;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
public final class b extends com.google.android.gms.common.api.f {
    public final void e(LocationRequest locationRequest, is1.i iVar) {
        zzbd zzbdVar = new zzbd(locationRequest, zzbd.f31247m, null, false, false, false, null);
        com.bumptech.glide.d.w("Can't create handler inside thread that has not called Looper.prepare()", Looper.myLooper() != null);
        Looper myLooper = Looper.myLooper();
        String simpleName = is1.i.class.getSimpleName();
        com.bumptech.glide.d.u(iVar, "Listener must not be null");
        com.bumptech.glide.d.u(myLooper, "Looper must not be null");
        l lVar = new l(myLooper, iVar, simpleName);
        r1 r1Var = new r1();
        r1Var.f16958b = zzbdVar;
        r1Var.f16962f = lVar;
        r1Var.f16960d = lVar;
        r1Var.f16961e = null;
        r1Var.f16959c = false;
        r1Var.f16957a = 0;
        x xVar = new x(this, lVar.f30843c);
        com.bumptech.glide.d.u(((l) r1Var.f16960d).f30843c, "Listener has already been released.");
        com.bumptech.glide.d.u((com.google.android.gms.common.api.internal.j) xVar.f31694b, "Listener has already been released.");
        com.bumptech.glide.d.i("Listener registration and unregistration methods must be constructed with the same ListenerHolder.", com.bumptech.glide.c.x(((l) r1Var.f16960d).f30843c, (com.google.android.gms.common.api.internal.j) xVar.f31694b));
        com.google.android.gms.common.api.internal.f fVar = this.f30770j;
        fVar.getClass();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        fVar.j(taskCompletionSource, r1Var.f16957a, this);
        i0 i0Var = new i0(new p0(new j0(r1Var, xVar), taskCompletionSource), fVar.f30814i.get(), this);
        bi.f fVar2 = fVar.f30819n;
        fVar2.sendMessage(fVar2.obtainMessage(8, i0Var));
        taskCompletionSource.getTask();
    }
}
