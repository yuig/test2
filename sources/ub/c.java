package ub;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.util.concurrent.TimeUnit;
import kb.b0;
import lb.j0;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final String f121646e = b0.h("ForceStopRunnable");

    /* renamed from: f, reason: collision with root package name */
    public static final long f121647f = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: a, reason: collision with root package name */
    public final Context f121648a;

    /* renamed from: b, reason: collision with root package name */
    public final j0 f121649b;

    /* renamed from: c, reason: collision with root package name */
    public final e f121650c;

    /* renamed from: d, reason: collision with root package name */
    public int f121651d = 0;

    public c(Context context, j0 j0Var) {
        this.f121648a = context.getApplicationContext();
        this.f121649b = j0Var;
        this.f121650c = j0Var.f82611h;
    }

    public static void c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i13 = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i13);
        long currentTimeMillis = System.currentTimeMillis() + f121647f;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, broadcast);
        }
    }

    public static void d(long j13) {
        try {
            Thread.sleep(j13);
        } catch (InterruptedException unused) {
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 609
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ub.c.a():void");
    }

    public final boolean b() {
        kb.d dVar = this.f121649b.f82606c;
        dVar.getClass();
        boolean isEmpty = TextUtils.isEmpty(null);
        String str = f121646e;
        if (isEmpty) {
            b0.e().a(str, "The default process name was not specified.");
            return true;
        }
        boolean a13 = i.a(this.f121648a, dVar);
        b0.e().a(str, "Is default app process = " + a13);
        return a13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13;
        Context context = this.f121648a;
        String str = f121646e;
        j0 j0Var = this.f121649b;
        try {
            if (!b()) {
                return;
            }
            while (true) {
                try {
                    com.bumptech.glide.d.j0(context);
                    b0.e().a(str, "Performing cleanup operations.");
                    try {
                        a();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteFullException | SQLiteTableLockedException e13) {
                        i13 = this.f121651d + 1;
                        this.f121651d = i13;
                        if (i13 >= 3) {
                            String str2 = b7.c.C(context) ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                            b0.e().d(str, str2, e13);
                            IllegalStateException illegalStateException = new IllegalStateException(str2, e13);
                            j0Var.f82606c.getClass();
                            throw illegalStateException;
                        }
                        b0.e().b(str, "Retrying after " + (i13 * 300), e13);
                        d(((long) this.f121651d) * 300);
                    }
                    b0.e().b(str, "Retrying after " + (i13 * 300), e13);
                    d(((long) this.f121651d) * 300);
                } catch (SQLiteException e14) {
                    b0.e().c(str, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e14);
                    j0Var.f82606c.getClass();
                    throw illegalStateException2;
                }
            }
        } finally {
            j0Var.j();
        }
    }
}
