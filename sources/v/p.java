package v;

import a.jg;
import android.hardware.camera2.CameraDevice;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes2.dex */
public final /* synthetic */ class p implements r4.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123592a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f123593b;

    public /* synthetic */ p(d0 d0Var, int i13) {
        this.f123592a = i13;
        this.f123593b = d0Var;
    }

    @Override // r4.j
    public final Object C(r4.i iVar) {
        int i13 = this.f123592a;
        d0 d0Var = this.f123593b;
        d0Var.getClass();
        switch (i13) {
            case 0:
                try {
                    d0Var.f123398c.execute(new jg(6, d0Var, iVar));
                    return "isMeteringRepeatingAttached";
                } catch (RejectedExecutionException unused) {
                    iVar.d(new RuntimeException("Unable to check if MeteringRepeating is attached. Camera executor shut down."));
                    return "isMeteringRepeatingAttached";
                }
            default:
                try {
                    ArrayList arrayList = new ArrayList(d0Var.f123396a.b().b().f16933c);
                    arrayList.add((CameraDevice.StateCallback) d0Var.f123420y.f123721f);
                    arrayList.add(new u(d0Var, iVar));
                    d0Var.f123397b.f126943a.v(d0Var.f123405j.f123489a, d0Var.f123398c, kh2.g3.K(arrayList));
                    return "configAndCloseTask";
                } catch (CameraAccessExceptionCompat | SecurityException e13) {
                    d0Var.t("Unable to open camera for configAndClose: " + e13.getMessage(), e13);
                    iVar.d(e13);
                    return "configAndCloseTask";
                }
        }
    }
}
