package st0;

import android.os.CountDownTimer;
import android.widget.ProgressBar;
import aq1.h;
import com.pinterest.feature.ideaPinCreation.camera.view.IdeaPinCameraToggle;
import com.pinterest.feature.ideaPinCreation.camera.view.IdeaPinCreationCameraVideoSegmentsView;
import com.pinterest.gestalt.text.GestaltText;
import fp0.d;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;
import pw0.x;
import tt0.l0;
import tt0.s;
import tt0.z;

/* loaded from: classes5.dex */
public final class b extends CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f115163a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f115164b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, int i13, long j13) {
        super(j13, 100L);
        this.f115163a = cVar;
        this.f115164b = i13;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        l0 l0Var = this.f115163a.f115165a;
        rt0.b bVar = l0Var.f119180p0;
        bVar.v(false);
        GestaltText gestaltText = l0Var.C0;
        if (gestaltText == null) {
            Intrinsics.r("countdownTextView");
            throw null;
        }
        a0.k0(gestaltText);
        ProgressBar progressBar = l0Var.D0;
        if (progressBar == null) {
            Intrinsics.r("countdownProgressBar");
            throw null;
        }
        progressBar.setVisibility(8);
        z zVar = l0Var.J0;
        if (zVar == null) {
            Intrinsics.r("cameraController");
            throw null;
        }
        d dVar = l0Var.f119189y0;
        if (dVar == null) {
            Intrinsics.r("cameraView");
            throw null;
        }
        zVar.g(dVar.k());
        if ((!(((x) l0Var.S0.getValue()) == x.IdeaPinAddMediaClip)) && bVar.f109955g) {
            z zVar2 = l0Var.J0;
            if (zVar2 == null) {
                Intrinsics.r("cameraController");
                throw null;
            }
            zVar2.w(s.PHOTO);
            l0Var.y8();
            return;
        }
        bVar.z(true);
        IdeaPinCreationCameraVideoSegmentsView ideaPinCreationCameraVideoSegmentsView = l0Var.G0;
        if (ideaPinCreationCameraVideoSegmentsView == null) {
            Intrinsics.r("cameraSegmentsView");
            throw null;
        }
        bs1.c.U1(ideaPinCreationCameraVideoSegmentsView);
        l0Var.k8();
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j13) {
        l0 l0Var = this.f115163a.f115165a;
        int i13 = (int) (j13 / 1000);
        long j14 = this.f115164b * 1000;
        int floor = (int) Math.floor(((j14 - (j13 - 1000)) / j14) * 100);
        if (l0Var.d8()) {
            IdeaPinCameraToggle ideaPinCameraToggle = l0Var.E0;
            if (ideaPinCameraToggle == null) {
                Intrinsics.r("toggleView");
                throw null;
            }
            ideaPinCameraToggle.setVisibility(8);
        }
        GestaltText gestaltText = l0Var.C0;
        if (gestaltText == null) {
            Intrinsics.r("countdownTextView");
            throw null;
        }
        a0.w1(gestaltText);
        ProgressBar progressBar = l0Var.D0;
        if (progressBar == null) {
            Intrinsics.r("countdownProgressBar");
            throw null;
        }
        progressBar.setVisibility(i13 != 0 ? 0 : 8);
        GestaltText gestaltText2 = l0Var.C0;
        if (gestaltText2 == null) {
            Intrinsics.r("countdownTextView");
            throw null;
        }
        String string = i13 == 0 ? l0Var.getResources().getString(h.f20358go) : String.valueOf(i13);
        Intrinsics.f(string);
        a0.p(gestaltText2, string);
        ProgressBar progressBar2 = l0Var.D0;
        if (progressBar2 != null) {
            progressBar2.setProgress(floor);
        } else {
            Intrinsics.r("countdownProgressBar");
            throw null;
        }
    }
}
