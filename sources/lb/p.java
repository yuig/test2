package lb;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p extends ka.b {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f82650c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final Context f82651d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context) {
        super(9, 10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f82651d = context;
    }

    @Override // ka.b
    public final void a(pa.c db3) {
        int i13 = this.f82650c;
        Context context = this.f82651d;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(db3, "db");
                if (this.f78893b >= 10) {
                    db3.a("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    context.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                Intrinsics.checkNotNullParameter(db3, "db");
                db3.B("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j13 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    long j14 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                    db3.x();
                    try {
                        db3.a("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j13)});
                        db3.a("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j14)});
                        sharedPreferences.edit().clear().apply();
                        db3.c0();
                    } finally {
                    }
                }
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(db3, "sqLiteDatabase");
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i14 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i15 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    db3.x();
                    try {
                        db3.a("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i14)});
                        db3.a("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i15)});
                        sharedPreferences2.edit().clear().apply();
                        db3.c0();
                        return;
                    } finally {
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context mContext, int i13, int i14) {
        super(i13, i14);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.f82651d = mContext;
    }
}
