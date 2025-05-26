package x;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import v.j1;

/* loaded from: classes2.dex */
public final class p implements r {

    /* renamed from: a, reason: collision with root package name */
    public final SessionConfiguration f131255a;

    /* renamed from: b, reason: collision with root package name */
    public final List f131256b;

    public p(int i13, ArrayList arrayList, Executor executor, j1 j1Var) {
        h hVar;
        SessionConfiguration sessionConfiguration = new SessionConfiguration(i13, s.a(arrayList), executor, j1Var);
        this.f131255a = sessionConfiguration;
        List<OutputConfiguration> outputConfigurations = sessionConfiguration.getOutputConfigurations();
        ArrayList arrayList2 = new ArrayList(outputConfigurations.size());
        for (OutputConfiguration outputConfiguration : outputConfigurations) {
            if (outputConfiguration == null) {
                hVar = null;
            } else {
                int i14 = Build.VERSION.SDK_INT;
                hVar = new h(i14 >= 33 ? new n(outputConfiguration) : i14 >= 28 ? new m(new l(outputConfiguration)) : new k(new j(outputConfiguration)));
            }
            arrayList2.add(hVar);
        }
        this.f131256b = Collections.unmodifiableList(arrayList2);
    }

    @Override // x.r
    public final List a() {
        return this.f131256b;
    }

    @Override // x.r
    public final void b(g gVar) {
        this.f131255a.setInputConfiguration(gVar.f131247a.f131246a);
    }

    @Override // x.r
    public final Object c() {
        return this.f131255a;
    }

    @Override // x.r
    public final g d() {
        return g.a(this.f131255a.getInputConfiguration());
    }

    @Override // x.r
    public final Executor e() {
        return this.f131255a.getExecutor();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        return Objects.equals(this.f131255a, ((p) obj).f131255a);
    }

    @Override // x.r
    public final int f() {
        return this.f131255a.getSessionType();
    }

    @Override // x.r
    public final CameraCaptureSession.StateCallback g() {
        return this.f131255a.getStateCallback();
    }

    @Override // x.r
    public final void h(CaptureRequest captureRequest) {
        this.f131255a.setSessionParameters(captureRequest);
    }

    public final int hashCode() {
        return this.f131255a.hashCode();
    }
}
