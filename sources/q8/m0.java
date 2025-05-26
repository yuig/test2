package q8;

import android.hardware.camera2.CaptureRequest;
import android.os.Looper;
import androidx.camera.camera2.internal.compat.quirk.Preview3AThreadCrashQuirk;
import androidx.camera.camera2.internal.compat.quirk.StillCaptureFlashStopRepeatingQuirk;
import androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;
import androidx.camera.camera2.internal.compat.quirk.UseTorchAsFlashQuirk;
import androidx.camera.core.impl.s0;
import androidx.camera.core.impl.z0;
import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;
import com.google.android.gms.internal.measurement.v4;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import v.c1;

/* loaded from: classes3.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f102963a;

    public m0(int i13) {
        if (i13 == 2) {
            this.f102963a = y.b.f136245a.b(TorchIsClosedAfterImageCapturingQuirk.class) != null;
        } else if (i13 == 4) {
            this.f102963a = i0.a.f70646a.b(SurfaceOrderQuirk.class) != null;
        } else if (i13 != 12) {
            this.f102963a = ((StillCaptureFlashStopRepeatingQuirk) y.b.f136245a.b(StillCaptureFlashStopRepeatingQuirk.class)) != null;
        }
    }

    public static s0 a(s0 s0Var) {
        c1 c1Var = new c1();
        c1Var.f123384a = s0Var.f16969c;
        Iterator it = Collections.unmodifiableList(s0Var.f16967a).iterator();
        while (it.hasNext()) {
            ((Set) c1Var.f123387d).add((z0) it.next());
        }
        c1Var.c(s0Var.f16968b);
        u.a aVar = new u.a(0);
        aVar.f(CaptureRequest.FLASH_MODE, 0);
        c1Var.c(aVar.c());
        return c1Var.e();
    }

    public static boolean d() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public boolean b(ArrayList arrayList, boolean z13) {
        if (!this.f102963a || !z13) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) ((CaptureRequest) it.next()).get(CaptureRequest.FLASH_MODE);
            if (num != null && num.intValue() == 2) {
                return true;
            }
        }
        return false;
    }

    public boolean c(ArrayList arrayList, boolean z13) {
        if (this.f102963a && z13) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) ((CaptureRequest) it.next()).get(CaptureRequest.CONTROL_AE_MODE)).intValue();
                if (intValue == 2 || intValue == 3) {
                    return true;
                }
            }
        }
        return false;
    }

    public m0(int i13, androidx.camera.core.impl.r rVar) {
        if (i13 != 3) {
            this.f102963a = rVar.a(Preview3AThreadCrashQuirk.class);
        } else {
            this.f102963a = rVar.a(UseTorchAsFlashQuirk.class);
        }
    }

    public /* synthetic */ m0(boolean z13) {
        this.f102963a = z13;
    }

    public m0() {
        Object obj = v4.f31663g;
        this.f102963a = false;
    }

    public m0(Object obj) {
        this.f102963a = false;
    }

    public m0(e7.t tVar, e7.s sVar) {
        int i13 = sVar.f57595a;
        bf.b.i(i13 == 6 || i13 == 3);
        ByteBuffer byteBuffer = sVar.f57596b;
        byte[] bArr = new byte[Math.min(4, byteBuffer.remaining())];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        d7.c0 c0Var = new d7.c0(bArr, 0, 0);
        kh2.s0.r(tVar.f57597a);
        if (c0Var.f()) {
            this.f102963a = false;
            return;
        }
        int g13 = c0Var.g(2);
        boolean f13 = c0Var.f();
        kh2.s0.r(tVar.f57598b);
        if (!f13) {
            this.f102963a = true;
            return;
        }
        boolean f14 = (g13 == 3 || g13 == 0) ? true : c0Var.f();
        c0Var.n();
        kh2.s0.r(!tVar.f57600d);
        if (c0Var.f()) {
            kh2.s0.r(!tVar.f57601e);
            c0Var.n();
        }
        kh2.s0.r(tVar.f57599c);
        if (g13 != 3) {
            c0Var.n();
        }
        c0Var.o(tVar.f57602f);
        if (g13 != 2 && g13 != 0 && !f14) {
            c0Var.o(3);
        }
        this.f102963a = g13 == 3 || g13 == 0 || c0Var.g(8) != 0;
    }
}
