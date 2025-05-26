package ag2;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.SharedPreferences;
import cd2.n;
import io.embrace.android.embracesdk.internal.config.remote.AppExitInfoConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;
import kotlin.collections.s0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.e0;
import s81.g;
import xk2.v;

/* loaded from: classes4.dex */
public final class b extends uf2.b {

    /* renamed from: d, reason: collision with root package name */
    public final ki2.a f15156d;

    /* renamed from: e, reason: collision with root package name */
    public final tg2.b f15157e;

    /* renamed from: f, reason: collision with root package name */
    public final ActivityManager f15158f;

    /* renamed from: g, reason: collision with root package name */
    public final uh2.b f15159g;

    /* renamed from: h, reason: collision with root package name */
    public final lh2.b f15160h;

    /* renamed from: i, reason: collision with root package name */
    public final ii2.d f15161i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ki2.a backgroundWorker, tg2.c appExitInfoBehavior, ActivityManager activityManager, uh2.b preferencesService, vf2.b logWriter, lh2.b logger) {
        super(logWriter, logger, new wf2.c(a.f15153j));
        ii2.a versionChecker = ii2.a.f72330a;
        Intrinsics.checkNotNullParameter(backgroundWorker, "backgroundWorker");
        Intrinsics.checkNotNullParameter(appExitInfoBehavior, "appExitInfoBehavior");
        Intrinsics.checkNotNullParameter(activityManager, "activityManager");
        Intrinsics.checkNotNullParameter(preferencesService, "preferencesService");
        Intrinsics.checkNotNullParameter(logWriter, "logWriter");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(versionChecker, "versionChecker");
        this.f15156d = backgroundWorker;
        this.f15157e = appExitInfoBehavior;
        this.f15158f = activityManager;
        this.f15159g = preferencesService;
        this.f15160h = logger;
        this.f15161i = versionChecker;
    }

    @Override // uf2.b, uf2.a
    public final void c() {
        this.f15156d.b(new g(this, 24));
    }

    public final void g() {
        List historicalProcessExitReasons;
        d dVar;
        byte[] processStateSummary;
        th2.e eVar;
        int importance;
        long pss;
        int reason;
        long rss;
        int status;
        long timestamp;
        String description;
        Integer num;
        long timestamp2;
        int pid;
        long timestamp3;
        int pid2;
        Integer num2;
        tg2.c cVar = (tg2.c) this.f15157e;
        AppExitInfoConfig appExitInfoConfig = cVar.f117597c;
        historicalProcessExitReasons = this.f15158f.getHistoricalProcessExitReasons(null, 0, (appExitInfoConfig == null || (num2 = appExitInfoConfig.f72993c) == null) ? 0 : num2.intValue());
        Intrinsics.checkNotNullExpressionValue(historicalProcessExitReasons, "activityManager.getHisto…tReasons(null, 0, maxNum)");
        List y03 = CollectionsKt.y0(historicalProcessExitReasons, 32);
        uh2.a aVar = (uh2.a) this.f15159g;
        Set<String> stringSet = aVar.f122252a.getStringSet("io.embrace.aeiHashCode", null);
        if (stringSet == null) {
            stringSet = s0.f80394a;
        }
        List list = y03;
        ArrayList arrayList = new ArrayList(g0.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo d2 = a.s0.d(it.next());
            StringBuilder sb3 = new StringBuilder();
            timestamp3 = d2.getTimestamp();
            sb3.append(timestamp3);
            sb3.append('_');
            pid2 = d2.getPid();
            sb3.append(pid2);
            arrayList.add(sb3.toString());
        }
        Set<String> value = CollectionsKt.J0(arrayList);
        Intrinsics.checkNotNullParameter(value, "value");
        SharedPreferences.Editor edit = aVar.f122252a.edit();
        edit.putStringSet("io.embrace.aeiHashCode", value);
        edit.apply();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            ApplicationExitInfo d13 = a.s0.d(obj);
            StringBuilder sb4 = new StringBuilder();
            timestamp2 = d13.getTimestamp();
            sb4.append(timestamp2);
            sb4.append('_');
            pid = d13.getPid();
            sb4.append(pid);
            if (!stringSet.contains(sb4.toString())) {
                arrayList2.add(obj);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ApplicationExitInfo d14 = a.s0.d(it2.next());
            AppExitInfoConfig appExitInfoConfig2 = cVar.f117597c;
            int intValue = (appExitInfoConfig2 == null || (num = appExitInfoConfig2.f72991a) == null) ? 2097152 : num.intValue();
            v vVar = c.f15162a;
            Intrinsics.checkNotNullParameter(d14, "<this>");
            ii2.d versionChecker = this.f15161i;
            Intrinsics.checkNotNullParameter(versionChecker, "versionChecker");
            try {
                String a13 = c.a(d14, versionChecker);
                dVar = a13 == null ? null : a13.length() > intValue ? new d(e0.C(intValue, a13), "Trace was too large, sending truncated trace") : new d(a13, null);
            } catch (IOException e13) {
                dVar = new d(null, "ioexception: " + e13.getMessage());
            } catch (OutOfMemoryError e14) {
                dVar = new d(null, "oom: " + e14.getMessage());
            } catch (Throwable th3) {
                dVar = new d(null, "error: " + th3.getMessage());
            }
            if (dVar == null) {
                eVar = null;
            } else {
                processStateSummary = d14.getProcessStateSummary();
                if (processStateSummary == null) {
                    processStateSummary = new byte[0];
                }
                String str = new String(processStateSummary, Charsets.UTF_8);
                String concat = (str.length() == 0 || ((Regex) c.f15162a.getValue()).e(str)) ? "" : "invalid session ID: ".concat(str);
                importance = d14.getImportance();
                Integer valueOf = Integer.valueOf(importance);
                pss = d14.getPss();
                Long valueOf2 = Long.valueOf(pss);
                reason = d14.getReason();
                Integer valueOf3 = Integer.valueOf(reason);
                rss = d14.getRss();
                Long valueOf4 = Long.valueOf(rss);
                status = d14.getStatus();
                Integer valueOf5 = Integer.valueOf(status);
                timestamp = d14.getTimestamp();
                Long valueOf6 = Long.valueOf(timestamp);
                description = d14.getDescription();
                eVar = new th2.e(str, concat, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, dVar.f15163a, description, dVar.f15164b);
            }
            if (eVar != null) {
                e(uf2.c.f122114k, new n(eVar, 6));
            }
        }
    }
}
