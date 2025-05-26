package oi;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.measurement.internal.zzad;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class d6 extends k2 {

    /* renamed from: c, reason: collision with root package name */
    public final k6 f94725c;

    /* renamed from: d, reason: collision with root package name */
    public t3 f94726d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Boolean f94727e;

    /* renamed from: f, reason: collision with root package name */
    public final e6 f94728f;

    /* renamed from: g, reason: collision with root package name */
    public final c0.x0 f94729g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f94730h;

    /* renamed from: i, reason: collision with root package name */
    public final e6 f94731i;

    public d6(u4 u4Var) {
        super(u4Var);
        this.f94730h = new ArrayList();
        this.f94729g = new c0.x0(u4Var.f95210n);
        this.f94725c = new k6(this);
        this.f94728f = new e6(this, u4Var, 0);
        this.f94731i = new e6(this, u4Var, 1);
    }

    public final void A(Runnable runnable) {
        p();
        if (G()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.f94730h;
        if (arrayList.size() >= 1000) {
            zzj().f95268f.c("Discarding data. Max runnable queue size reached");
            return;
        }
        arrayList.add(runnable);
        this.f94731i.b(60000L);
        E();
    }

    public final void B(AtomicReference atomicReference) {
        p();
        w();
        A(new s.f(this, atomicReference, L(false), 15));
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x019e A[Catch: all -> 0x00eb, SQLiteDatabaseLockedException -> 0x0140, SQLiteException -> 0x0181, SQLiteFullException -> 0x0183, TryCatch #6 {all -> 0x00eb, blocks: (B:65:0x00bb, B:68:0x00c1, B:70:0x00cf, B:73:0x00e2, B:75:0x00e7, B:84:0x0119, B:85:0x011c, B:82:0x0115, B:157:0x0120, B:160:0x0134, B:162:0x015c, B:167:0x0160, B:168:0x0163, B:165:0x0156, B:93:0x0167, B:101:0x017d, B:103:0x019e, B:107:0x023f, B:128:0x0219, B:130:0x021f, B:131:0x0222, B:118:0x0256, B:142:0x01a3, B:143:0x01a6, B:140:0x0198, B:152:0x01ac, B:154:0x01b8, B:179:0x01d0, B:182:0x01de, B:186:0x01ea, B:187:0x01fa), top: B:64:0x00bb }] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x026c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x026c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0219 A[Catch: all -> 0x00eb, TRY_ENTER, TryCatch #6 {all -> 0x00eb, blocks: (B:65:0x00bb, B:68:0x00c1, B:70:0x00cf, B:73:0x00e2, B:75:0x00e7, B:84:0x0119, B:85:0x011c, B:82:0x0115, B:157:0x0120, B:160:0x0134, B:162:0x015c, B:167:0x0160, B:168:0x0163, B:165:0x0156, B:93:0x0167, B:101:0x017d, B:103:0x019e, B:107:0x023f, B:128:0x0219, B:130:0x021f, B:131:0x0222, B:118:0x0256, B:142:0x01a3, B:143:0x01a6, B:140:0x0198, B:152:0x01ac, B:154:0x01b8, B:179:0x01d0, B:182:0x01de, B:186:0x01ea, B:187:0x01fa), top: B:64:0x00bb }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x026c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x02a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x029c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C(oi.t3 r29, com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable r30, com.google.android.gms.measurement.internal.zzo r31) {
        /*
            Method dump skipped, instructions count: 783
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oi.d6.C(oi.t3, com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable, com.google.android.gms.measurement.internal.zzo):void");
    }

    public final void D(boolean z13) {
        p();
        w();
        if (z13) {
            r().B();
        }
        if (H()) {
            A(new f6(this, L(false), 3));
        }
    }

    public final void E() {
        p();
        w();
        if (G()) {
            return;
        }
        if (K()) {
            k6 k6Var = this.f94725c;
            k6Var.f94923c.p();
            Context zza = k6Var.f94923c.zza();
            synchronized (k6Var) {
                try {
                    if (k6Var.f94921a) {
                        k6Var.f94923c.zzj().f95276n.c("Connection attempt already in progress");
                        return;
                    }
                    if (k6Var.f94922b != null && (k6Var.f94922b.isConnecting() || k6Var.f94922b.isConnected())) {
                        k6Var.f94923c.zzj().f95276n.c("Already awaiting connection attempt");
                        return;
                    }
                    k6Var.f94922b = new z3(zza, Looper.getMainLooper(), 93, k6Var, k6Var);
                    k6Var.f94923c.zzj().f95276n.c("Connecting to remote service");
                    k6Var.f94921a = true;
                    com.bumptech.glide.d.t(k6Var.f94922b);
                    k6Var.f94922b.checkAvailabilityAndConnect();
                    return;
                } finally {
                }
            }
        }
        if (l().C()) {
            return;
        }
        List<ResolveInfo> queryIntentServices = zza().getPackageManager().queryIntentServices(new Intent().setClassName(zza(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            zzj().f95268f.c("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        intent.setComponent(new ComponentName(zza(), "com.google.android.gms.measurement.AppMeasurementService"));
        k6 k6Var2 = this.f94725c;
        k6Var2.f94923c.p();
        Context zza2 = k6Var2.f94923c.zza();
        nh.a b13 = nh.a.b();
        synchronized (k6Var2) {
            try {
                if (k6Var2.f94921a) {
                    k6Var2.f94923c.zzj().f95276n.c("Connection attempt already in progress");
                    return;
                }
                k6Var2.f94923c.zzj().f95276n.c("Using local app measurement service");
                k6Var2.f94921a = true;
                b13.a(zza2, intent, k6Var2.f94923c.f94725c, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS);
            } finally {
            }
        }
    }

    public final void F() {
        p();
        w();
        k6 k6Var = this.f94725c;
        if (k6Var.f94922b != null && (k6Var.f94922b.isConnected() || k6Var.f94922b.isConnecting())) {
            k6Var.f94922b.disconnect();
        }
        k6Var.f94922b = null;
        try {
            nh.a.b().c(zza(), this.f94725c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f94726d = null;
    }

    public final boolean G() {
        p();
        w();
        return this.f94726d != null;
    }

    public final boolean H() {
        p();
        w();
        return !K() || o().r0() >= ((Integer) s.f95114n0.a(null)).intValue();
    }

    public final void I() {
        p();
        y3 zzj = zzj();
        ArrayList arrayList = this.f94730h;
        zzj.f95276n.b(Integer.valueOf(arrayList.size()), "Processing queued up service tasks");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e13) {
                zzj().f95268f.b(e13, "Task exception while flushing queue");
            }
        }
        arrayList.clear();
        this.f94731i.a();
    }

    public final void J() {
        p();
        c0.x0 x0Var = this.f94729g;
        ((oh.b) ((oh.a) x0Var.f24392b)).getClass();
        x0Var.f24391a = SystemClock.elapsedRealtime();
        this.f94728f.b(((Long) s.f95086J.a(null)).longValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean K() {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oi.d6.K():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x029e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzo L(boolean r44) {
        /*
            Method dump skipped, instructions count: 851
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oi.d6.L(boolean):com.google.android.gms.measurement.internal.zzo");
    }

    @Override // oi.k2
    public final boolean y() {
        return false;
    }

    public final void z(zzad zzadVar) {
        boolean A;
        p();
        w();
        w3 r13 = r();
        r13.o();
        byte[] d03 = f7.d0(zzadVar);
        if (d03.length > 131072) {
            r13.zzj().f95269g.c("Conditional user property too long for local database. Sending directly to service");
            A = false;
        } else {
            A = r13.A(2, d03);
        }
        boolean z13 = A;
        A(new h6(this, L(true), z13, new zzad(zzadVar), zzadVar));
    }
}
