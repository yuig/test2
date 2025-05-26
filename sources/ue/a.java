package ue;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import df.c0;
import df.e0;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import le.v;
import me.r;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121935a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f121936b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f121937c;

    public /* synthetic */ a(int i13, long j13, String str) {
        this.f121935a = i13;
        this.f121936b = j13;
        this.f121937c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f121935a;
        long j13 = this.f121936b;
        switch (i13) {
            case 0:
                String activityName = this.f121937c;
                Intrinsics.checkNotNullParameter(activityName, "$activityName");
                if (b.f121943f == null) {
                    b.f121943f = new l(Long.valueOf(j13), null);
                }
                l lVar = b.f121943f;
                if (lVar != null) {
                    lVar.f121964b = Long.valueOf(j13);
                }
                int i14 = 1;
                if (b.f121942e.get() <= 0) {
                    a aVar = new a(i14, j13, activityName);
                    synchronized (b.f121941d) {
                        ScheduledExecutorService scheduledExecutorService = b.f121939b;
                        e0 e0Var = e0.f54743a;
                        b.f121940c = scheduledExecutorService.schedule(aVar, e0.b(v.b()) == null ? 60 : r7.f54727d, TimeUnit.SECONDS);
                        Unit unit = Unit.f80348a;
                    }
                }
                long j14 = b.f121946i;
                long j15 = j14 > 0 ? (j13 - j14) / 1000 : 0L;
                r rVar = g.f121953a;
                Context a13 = v.a();
                c0 f13 = e0.f(v.b(), false);
                if (f13 != null && f13.f54730g && j15 > 0) {
                    r rVar2 = new r(a13);
                    Bundle bundle = new Bundle(1);
                    bundle.putCharSequence("fb_aa_time_spent_view_name", activityName);
                    rVar2.a("fb_aa_time_spent_on_view", j15, bundle);
                }
                l lVar2 = b.f121943f;
                if (lVar2 == null) {
                    return;
                }
                lVar2.a();
                return;
            default:
                String activityName2 = this.f121937c;
                Intrinsics.checkNotNullParameter(activityName2, "$activityName");
                if (b.f121943f == null) {
                    b.f121943f = new l(Long.valueOf(j13), null);
                }
                if (b.f121942e.get() <= 0) {
                    m.d(activityName2, b.f121943f, b.f121945h);
                    SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(v.a()).edit();
                    edit.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
                    edit.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
                    edit.remove("com.facebook.appevents.SessionInfo.interruptionCount");
                    edit.remove("com.facebook.appevents.SessionInfo.sessionId");
                    edit.apply();
                    SharedPreferences.Editor edit2 = PreferenceManager.getDefaultSharedPreferences(v.a()).edit();
                    edit2.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
                    edit2.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
                    edit2.apply();
                    b.f121943f = null;
                }
                synchronized (b.f121941d) {
                    b.f121940c = null;
                    Unit unit2 = Unit.f80348a;
                }
                return;
        }
    }
}
