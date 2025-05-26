package n;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MenuItem;
import androidx.appcompat.widget.c2;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import com.bugsnag.android.f2;
import com.bugsnag.android.t1;
import com.google.android.gms.internal.measurement.u0;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzo;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import fd1.f1;
import i91.k0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Date;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kh2.k3;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import oi.a7;
import oi.b7;
import oi.d6;
import oi.f7;
import oi.t3;
import q5.h1;

/* loaded from: classes2.dex */
public final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f88598a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f88599b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f88600c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f88601d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f88602e;

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, Object obj4, int i13) {
        this.f88598a = i13;
        this.f88602e = obj;
        this.f88599b = obj2;
        this.f88600c = obj3;
        this.f88601d = obj4;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x0263 -> B:83:0x026e). Please report as a decompilation issue!!! */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        t3 t3Var;
        Throwable th3;
        byte[] bArr = null;
        r2 = null;
        FileOutputStream fileOutputStream = null;
        bArr = null;
        bArr = null;
        int i13 = 1;
        switch (this.f88598a) {
            case 0:
                h hVar = (h) this.f88599b;
                if (hVar != null) {
                    gc.c cVar = (gc.c) this.f88602e;
                    ((i) cVar.f64764b).A = true;
                    hVar.f88605b.d(false);
                    ((i) cVar.f64764b).A = false;
                }
                MenuItem menuItem = (MenuItem) this.f88600c;
                if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
                    ((o) this.f88601d).r(menuItem, null, 4);
                    return;
                }
                return;
            case 1:
                Object obj2 = this.f88601d;
                Object obj3 = this.f88600c;
                Object obj4 = this.f88599b;
                try {
                    boolean booleanExtra = ((Intent) obj4).getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra2 = ((Intent) obj4).getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                    boolean booleanExtra3 = ((Intent) obj4).getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra4 = ((Intent) obj4).getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                    kb.b0.e().a(ConstraintProxyUpdateReceiver.f20013a, "Updating proxies: (BatteryNotLowProxy (" + booleanExtra + "), BatteryChargingProxy (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy (" + booleanExtra4 + "), ");
                    ub.h.a((Context) obj3, ConstraintProxy$BatteryNotLowProxy.class, booleanExtra);
                    ub.h.a((Context) obj3, ConstraintProxy$BatteryChargingProxy.class, booleanExtra2);
                    ub.h.a((Context) obj3, ConstraintProxy$StorageNotLowProxy.class, booleanExtra3);
                    ub.h.a((Context) obj3, ConstraintProxy$NetworkStateProxy.class, booleanExtra4);
                    return;
                } finally {
                    ((BroadcastReceiver.PendingResult) obj2).finish();
                }
            case 2:
                t1 t1Var = (t1) this.f88602e;
                String str = (String) this.f88599b;
                com.bugsnag.android.o oVar = (com.bugsnag.android.o) this.f88600c;
                f2 f2Var = (f2) this.f88601d;
                if (t1Var.f29642a.getAndSet(true)) {
                    return;
                }
                try {
                    System.loadLibrary(str);
                    t1Var.f29643b = true;
                    return;
                } catch (UnsatisfiedLinkError e13) {
                    oVar.d(e13, f2Var);
                    return;
                }
            case 3:
                d6 m13 = ((AppMeasurementDynamiteService) this.f88602e).f32015a.m();
                u0 u0Var = (u0) this.f88599b;
                zzbg zzbgVar = (zzbg) this.f88600c;
                String str2 = (String) this.f88601d;
                m13.p();
                m13.w();
                if (ih.d.f72259b.c(m13.o().zza(), 12451000) == 0) {
                    m13.A(new g(m13, zzbgVar, str2, u0Var, 6));
                    return;
                } else {
                    m13.zzj().f95271i.c("Not bundling data. Service unavailable or out of date");
                    m13.o().N(u0Var, new byte[0]);
                    return;
                }
            case 4:
                synchronized (((AtomicReference) this.f88599b)) {
                    try {
                        obj = this.f88602e;
                        t3Var = ((d6) obj).f94726d;
                    } catch (RemoteException e14) {
                        ((d6) this.f88602e).zzj().f95268f.b(e14, "Failed to get trigger URIs; remote exception");
                    } finally {
                        ((AtomicReference) this.f88599b).notify();
                    }
                    if (t3Var == null) {
                        ((d6) obj).zzj().f95268f.c("Failed to get trigger URIs; not connected to service");
                        return;
                    }
                    com.bumptech.glide.d.t((zzo) this.f88600c);
                    ((AtomicReference) this.f88599b).set(t3Var.a((Bundle) this.f88601d, (zzo) this.f88600c));
                    ((d6) this.f88602e).J();
                    return;
                }
            case 5:
                d6 m14 = ((AppMeasurementDynamiteService) this.f88602e).f32015a.m();
                u0 u0Var2 = (u0) this.f88599b;
                String str3 = (String) this.f88600c;
                String str4 = (String) this.f88601d;
                m14.p();
                m14.w();
                m14.A(new h1(m14, str3, str4, m14.L(false), u0Var2, 3));
                return;
            case 6:
                Object obj5 = this.f88601d;
                Object obj6 = this.f88602e;
                try {
                    t3 t3Var2 = ((d6) obj6).f94726d;
                    if (t3Var2 == null) {
                        ((d6) obj6).zzj().f95268f.c("Discarding data. Failed to send event to service to bundle");
                    } else {
                        bArr = t3Var2.s((zzbg) this.f88599b, (String) this.f88600c);
                        ((d6) obj6).J();
                        d6 d6Var = (d6) obj6;
                        u0 u0Var3 = (u0) obj5;
                        d6Var.o().N(u0Var3, bArr);
                        obj5 = u0Var3;
                        obj6 = d6Var;
                    }
                } catch (RemoteException e15) {
                    ((d6) obj6).zzj().f95268f.b(e15, "Failed to send event to the service to bundle");
                } finally {
                    ((d6) obj6).o().N((u0) obj5, bArr);
                }
                return;
            case 7:
                b7 b7Var = (b7) this.f88602e;
                f7 L = b7Var.f94703a.L();
                String str5 = (String) this.f88599b;
                String str6 = (String) this.f88600c;
                Bundle bundle = (Bundle) this.f88601d;
                ((oh.b) b7Var.f94703a.zzb()).getClass();
                zzbg B = L.B(str6, bundle, "auto", System.currentTimeMillis(), false);
                a7 a7Var = b7Var.f94703a;
                com.bumptech.glide.d.t(B);
                a7Var.k(B, str5);
                return;
            case 8:
                Object obj7 = this.f88601d;
                Object obj8 = this.f88602e;
                Object obj9 = this.f88600c;
                Image image = (Image) this.f88599b;
                ByteBuffer buffer = image.getPlanes()[0].getBuffer();
                Intrinsics.checkNotNullExpressionValue(buffer, "getBuffer(...)");
                byte[] bArr2 = new byte[buffer.remaining()];
                buffer.get(bArr2);
                try {
                    try {
                        try {
                            FileOutputStream fileOutputStream2 = new FileOutputStream((File) obj9);
                            try {
                                fileOutputStream2.write(bArr2);
                                image.close();
                                ((Function1) obj7).invoke((File) obj9);
                                fileOutputStream2.close();
                            } catch (IOException e16) {
                                e = e16;
                                fileOutputStream = fileOutputStream2;
                                ((Function1) obj8).invoke(e);
                                image.close();
                                ((Function1) obj7).invoke((File) obj9);
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                    return;
                                }
                                return;
                            } catch (Throwable th4) {
                                th3 = th4;
                                fileOutputStream = fileOutputStream2;
                                image.close();
                                ((Function1) obj7).invoke((File) obj9);
                                if (fileOutputStream == null) {
                                    throw th3;
                                }
                                try {
                                    fileOutputStream.close();
                                    throw th3;
                                } catch (IOException e17) {
                                    ((Function1) obj8).invoke(e17);
                                    throw th3;
                                }
                            }
                        } catch (Throwable th5) {
                            th3 = th5;
                        }
                    } catch (IOException e18) {
                        e = e18;
                    }
                    return;
                } catch (IOException e19) {
                    ((Function1) obj8).invoke(e19);
                    return;
                }
            case 9:
                long time = new Date().getTime();
                c2 c2Var = (c2) this.f88599b;
                int g13 = ((lz1.c) ((lz1.a) c2Var.f16534e)).f85179a.g("PREF_DOWNLOAD_UPSELL_SEEN_COUNT_2022_V1", 0);
                lz1.a aVar = (lz1.a) c2Var.f16534e;
                k0 k0Var = k0.DOWNLOAD;
                f30 f30Var = (f30) this.f88600c;
                int g14 = !((lz1.c) aVar).a(time, k0Var, f30Var) ? 0 : ((lz1.c) ((lz1.a) c2Var.f16534e)).f85179a.g("PREF_DOWNLOAD_UPSELL_SEEN_LAST_24H_COUNT_2022_V1", 0);
                boolean z13 = ((lz1.c) ((lz1.a) c2Var.f16534e)).f85179a.f("PREF_DOWNLOAD_UPSELL_SENT_LAST_UPSELL_2022_V1", false) || g14 < 2;
                ((m60.w) c2Var.f16532c).d(new jc0.s(true, 0));
                if (!z13) {
                    ((i92.k) c2Var.f16531b).k(x0.pin_image_download_success);
                    ((Function0) this.f88602e).invoke();
                    return;
                }
                wy0 f13 = ((b60.d) com.bumptech.glide.d.E()).f();
                boolean d2 = f13 != null ? Intrinsics.d(f13.s4(), Boolean.TRUE) : false;
                ((i92.k) c2Var.f16531b).k(x0.pin_image_download_success);
                c2Var.t(f30Var, y32.f.CLOSEUP.value(), f1.DOWNLOAD, d2, (m60.w) c2Var.f16532c);
                ((lz1.c) ((lz1.a) c2Var.f16534e)).f85179a.h("PREF_DOWNLOAD_UPSELL_SEEN_COUNT_2022_V1", g13 + 1);
                ((lz1.c) ((lz1.a) c2Var.f16534e)).f85179a.h("PREF_DOWNLOAD_UPSELL_SEEN_LAST_24H_COUNT_2022_V1", g14 + 1);
                ((lz1.c) ((lz1.a) c2Var.f16534e)).f85179a.c("PREF_DOWNLOAD_UPSELL_LAST_SEEN_AT_MS_2022_V1", time);
                e0.t.f56751i = true;
                ((Function0) this.f88601d).invoke();
                return;
            case 10:
                Bitmap bitmap = (Bitmap) this.f88599b;
                if (bitmap != null) {
                    ((hs1.o) this.f88601d).k(bitmap);
                }
                String str7 = (String) this.f88600c;
                hs1.m mVar = (hs1.m) this.f88602e;
                int i14 = hs1.m.f70058o;
                mVar.r(str7);
                return;
            case 11:
                ((hs1.o) this.f88599b).d();
                String str8 = (String) this.f88600c;
                if (str8 != null) {
                    hs1.m mVar2 = (hs1.m) this.f88601d;
                    Exception exc = (Exception) this.f88602e;
                    nx.g0 g0Var = mVar2.f70063m;
                    if (g0Var != null) {
                        Uri parse = Uri.parse(str8);
                        Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
                        k3.K1(g0Var.f92397a, exc, parse);
                        return;
                    }
                    return;
                }
                return;
            default:
                if (((AtomicBoolean) this.f88599b).compareAndSet(false, true)) {
                    ((xj2.b) this.f88600c).d();
                    fk2.a0 a0Var = (fk2.a0) this.f88602e;
                    uj2.f fVar = a0Var.f62410e;
                    if (fVar == null) {
                        ((uj2.d) this.f88601d).onError(new TimeoutException(pk2.h.c(a0Var.f62407b, a0Var.f62408c)));
                        return;
                    } else {
                        ((uj2.b) fVar).j(new ll0.d(this, i13));
                        return;
                    }
                }
                return;
        }
    }

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, Object obj4, int i13, int i14) {
        this.f88598a = i13;
        this.f88599b = obj;
        this.f88600c = obj2;
        this.f88601d = obj3;
        this.f88602e = obj4;
    }

    public g(Image mImage, File mFile, Function1 onComplete, Function1 onError) {
        this.f88598a = 8;
        Intrinsics.checkNotNullParameter(mImage, "mImage");
        Intrinsics.checkNotNullParameter(mFile, "mFile");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(onError, "onError");
        this.f88599b = mImage;
        this.f88600c = mFile;
        this.f88601d = onComplete;
        this.f88602e = onError;
    }
}
