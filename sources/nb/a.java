package nb;

import a.k1;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import kb.b0;
import kotlin.jvm.internal.Intrinsics;
import tb.j;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f90108a = b0.h("Alarms");

    public static void a(Context context, j jVar, int i13) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        String str = b.f90109f;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        b.d(intent, jVar);
        PendingIntent service = PendingIntent.getService(context, i13, intent, 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        b0.e().a(f90108a, "Cancelling existing alarm with (workSpecId, systemId) (" + jVar + ", " + i13 + ")");
        alarmManager.cancel(service);
    }

    public static void b(Context context, WorkDatabase workDatabase, j generationalId, long j13) {
        tb.i v13 = workDatabase.v();
        tb.g a13 = v13.a(generationalId);
        if (a13 != null) {
            int i13 = a13.f116974c;
            a(context, generationalId, i13);
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            String str = b.f90109f;
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_DELAY_MET");
            b.d(intent, generationalId);
            PendingIntent service = PendingIntent.getService(context, i13, intent, 201326592);
            if (alarmManager != null) {
                alarmManager.setExact(0, j13, service);
                return;
            }
            return;
        }
        ub.e eVar = new ub.e(workDatabase, 0);
        Object p13 = eVar.f121655a.p(new k1(eVar, 4));
        Intrinsics.checkNotNullExpressionValue(p13, "workDatabase.runInTransa…NAGER_ID_KEY) }\n        )");
        int intValue = ((Number) p13).intValue();
        Intrinsics.checkNotNullParameter(generationalId, "generationalId");
        v13.b(new tb.g(generationalId.f116981a, generationalId.f116982b, intValue));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        String str2 = b.f90109f;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_DELAY_MET");
        b.d(intent2, generationalId);
        PendingIntent service2 = PendingIntent.getService(context, intValue, intent2, 201326592);
        if (alarmManager2 != null) {
            alarmManager2.setExact(0, j13, service2);
        }
    }
}
