package qe2;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.google.firebase.messaging.a0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import cp1.p;
import ff0.f;
import h0.i;
import kotlin.jvm.internal.Intrinsics;
import t72.j;

/* loaded from: classes4.dex */
public final class c implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final i f103636a = new i(3);

    /* renamed from: b, reason: collision with root package name */
    public final a f103637b;

    /* renamed from: c, reason: collision with root package name */
    public SensorManager f103638c;

    /* renamed from: d, reason: collision with root package name */
    public Sensor f103639d;

    public c(a aVar) {
        this.f103637b = aVar;
    }

    public final void a(SensorManager sensorManager) {
        if (this.f103639d != null) {
            return;
        }
        Sensor defaultSensor = sensorManager.getDefaultSensor(1);
        this.f103639d = defaultSensor;
        if (defaultSensor != null) {
            this.f103638c = sensorManager;
            sensorManager.registerListener(this, defaultSensor, 2);
        }
    }

    public final void b() {
        if (this.f103639d != null) {
            this.f103636a.a();
            this.f103638c.unregisterListener(this, this.f103639d);
            this.f103638c = null;
            this.f103639d = null;
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i13) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        i iVar;
        int i13;
        b bVar;
        b bVar2;
        float[] fArr = sensorEvent.values;
        float f13 = fArr[0];
        float f14 = fArr[1];
        float f15 = fArr[2];
        boolean z13 = ((double) ((f15 * f15) + ((f14 * f14) + (f13 * f13)))) > ((double) RecyclerViewTypes.VIEW_TYPE_SHOPPING_SPOTLIGHT);
        long j13 = sensorEvent.timestamp;
        long j14 = j13 - 500000000;
        while (true) {
            iVar = this.f103636a;
            i13 = iVar.f66406a;
            if (i13 < 4 || (bVar2 = (b) iVar.f66409d) == null || j14 - bVar2.f103633a <= 0) {
                break;
            }
            if (bVar2.f103634b) {
                iVar.f66407b--;
            }
            iVar.f66406a = i13 - 1;
            b bVar3 = bVar2.f103635c;
            iVar.f66409d = bVar3;
            if (bVar3 == null) {
                iVar.f66410e = null;
            }
            j jVar = (j) iVar.f66408c;
            bVar2.f103635c = (b) jVar.f116663b;
            jVar.f116663b = bVar2;
        }
        j jVar2 = (j) iVar.f66408c;
        b bVar4 = (b) jVar2.f116663b;
        if (bVar4 == null) {
            bVar4 = new b();
        } else {
            jVar2.f116663b = bVar4.f103635c;
        }
        bVar4.f103633a = j13;
        bVar4.f103634b = z13;
        bVar4.f103635c = null;
        b bVar5 = (b) iVar.f66410e;
        if (bVar5 != null) {
            bVar5.f103635c = bVar4;
        }
        iVar.f66410e = bVar4;
        if (((b) iVar.f66409d) == null) {
            iVar.f66409d = bVar4;
        }
        iVar.f66406a = i13 + 1;
        if (z13) {
            iVar.f66407b++;
        }
        b bVar6 = (b) iVar.f66410e;
        if (bVar6 == null || (bVar = (b) iVar.f66409d) == null || bVar6.f103633a - bVar.f103633a < 250000000) {
            return;
        }
        int i14 = iVar.f66407b;
        int i15 = iVar.f66406a;
        if (i14 >= (i15 >> 1) + (i15 >> 2)) {
            iVar.a();
            p this$0 = (p) ((a0) this.f103637b).f33758b;
            cp1.b bVar7 = p.Companion;
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            ((f) ((bf2.b) this$0.getShakeModalNavigation()).get()).getClass();
        }
    }
}
