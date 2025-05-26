package androidx.appcompat.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.media.MediaCodecInfo;
import android.os.IBinder;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.charts.PieRadarChartBase;
import com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public abstract class j0 implements vf.e {

    /* renamed from: a, reason: collision with root package name */
    public Object f16056a;

    /* renamed from: b, reason: collision with root package name */
    public Object f16057b;

    public j0(MediaCodecInfo mediaCodecInfo, String str) {
        this.f16056a = mediaCodecInfo;
        try {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
            Objects.requireNonNull(capabilitiesForType);
            this.f16057b = capabilitiesForType;
        } catch (RuntimeException e13) {
            throw new InvalidConfigException(a.a.j("Unable to get CodecCapabilities for mime: ", str), e13);
        }
    }

    public static float q(int i13, int i14, int i15) {
        return (i13 - i14) / i15;
    }

    @Override // vf.e
    public final vf.c A(float f13, float f14) {
        xf.b bVar;
        if (((PieRadarChartBase) this.f16056a).D(f13, f14) > ((PieRadarChartBase) this.f16056a).G()) {
            return null;
        }
        float E = ((PieRadarChartBase) this.f16056a).E(f13, f14);
        PieRadarChartBase pieRadarChartBase = (PieRadarChartBase) this.f16056a;
        if (pieRadarChartBase instanceof PieChart) {
            pieRadarChartBase.f30167s.getClass();
            E /= 1.0f;
        }
        int F = ((PieRadarChartBase) this.f16056a).F(E);
        if (F >= 0) {
            ArrayList arrayList = ((PieRadarChartBase) this.f16056a).f30149a.f117511i;
            if (arrayList == null || arrayList.isEmpty()) {
                bVar = null;
            } else {
                bVar = (xf.b) arrayList.get(0);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    xf.b bVar2 = (xf.b) it.next();
                    if (((tf.e) bVar2).f117526o.size() > ((tf.e) bVar).f117526o.size()) {
                        bVar = bVar2;
                    }
                }
            }
            if (F < ((tf.e) bVar).f117526o.size()) {
                return p(f13, f14, F);
            }
        }
        return null;
    }

    public abstract jo.a k(String str);

    public abstract void l();

    public final void m() {
        Object obj = this.f16056a;
        if (((BroadcastReceiver) obj) != null) {
            try {
                ((n0) this.f16057b).f16091k.unregisterReceiver((BroadcastReceiver) obj);
            } catch (IllegalArgumentException unused) {
            }
            this.f16056a = null;
        }
    }

    public abstract IntentFilter n();

    public abstract int o();

    public abstract vf.c p(float f13, float f14, int i13);

    public abstract jh.t r(IBinder iBinder);

    public final Object s(Context context) {
        Context context2;
        if (this.f16057b == null) {
            com.bumptech.glide.d.t(context);
            AtomicBoolean atomicBoolean = ih.f.f72261a;
            try {
                context2 = context.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
                context2 = null;
            }
            if (context2 == null) {
                throw new RemoteCreator$RemoteCreatorException("Could not get remote context.");
            }
            try {
                this.f16057b = r((IBinder) context2.getClassLoader().loadClass((String) this.f16056a).newInstance());
            } catch (ClassNotFoundException e13) {
                throw new RemoteCreator$RemoteCreatorException("Could not load creator class.", e13);
            } catch (IllegalAccessException e14) {
                throw new RemoteCreator$RemoteCreatorException("Could not access creator.", e14);
            } catch (InstantiationException e15) {
                throw new RemoteCreator$RemoteCreatorException("Could not instantiate creator.", e15);
            }
        }
        return this.f16057b;
    }

    public abstract void t();

    public abstract void u();

    public abstract void v(xj.b bVar);

    public abstract void w();

    public final void x() {
        m();
        IntentFilter n13 = n();
        if (n13.countActions() == 0) {
            return;
        }
        if (((BroadcastReceiver) this.f16056a) == null) {
            this.f16056a = new i0(this, 0);
        }
        ((n0) this.f16057b).f16091k.registerReceiver((BroadcastReceiver) this.f16056a, n13);
    }

    public abstract void y();

    public abstract void z();

    public j0(int i13) {
        this.f16057b = new ArrayList();
        for (int i14 = 0; i14 < i13; i14++) {
            ((List) this.f16057b).add(new xj.k());
        }
    }

    public j0(n0 n0Var) {
        this.f16057b = n0Var;
    }
}
