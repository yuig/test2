package com.bugsnag.android;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes3.dex */
public final class r1 {

    /* renamed from: a, reason: collision with root package name */
    public final File f29463a;

    /* renamed from: b, reason: collision with root package name */
    public final u1 f29464b;

    /* renamed from: c, reason: collision with root package name */
    public final ReentrantReadWriteLock f29465c = new ReentrantReadWriteLock();

    public r1(hd.h hVar) {
        this.f29463a = new File((File) hVar.f68833y.getValue(), "bugsnag/last-run-info");
        this.f29464b = hVar.f68826r;
    }

    public final q1 a() {
        List split$default;
        File file = this.f29463a;
        if (!file.exists()) {
            return null;
        }
        split$default = StringsKt__StringsKt.split$default(il2.k.b(file), new String[]{"\n"}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : split$default) {
            if (true ^ kotlin.text.z.j((String) obj)) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        u1 u1Var = this.f29464b;
        if (size != 3) {
            u1Var.f(Intrinsics.n(arrayList, "Unexpected number of lines when loading LastRunInfo. Skipping load. "));
            return null;
        }
        try {
            String str = (String) arrayList.get(0);
            int parseInt = Integer.parseInt(StringsKt.a0(str, Intrinsics.n("=", "consecutiveLaunchCrashes"), str));
            String str2 = (String) arrayList.get(1);
            boolean parseBoolean = Boolean.parseBoolean(StringsKt.a0(str2, Intrinsics.n("=", "crashed"), str2));
            String str3 = (String) arrayList.get(2);
            q1 q1Var = new q1(parseInt, parseBoolean, Boolean.parseBoolean(StringsKt.a0(str3, Intrinsics.n("=", "crashedDuringLaunch"), str3)));
            u1Var.i(Intrinsics.n(q1Var, "Loaded: "));
            return q1Var;
        } catch (NumberFormatException e13) {
            u1Var.a("Failed to read consecutiveLaunchCrashes from saved lastRunInfo", e13);
            return null;
        }
    }

    public final void b(q1 q1Var) {
        this.f29465c.writeLock().lock();
        try {
            c(q1Var);
        } catch (Throwable th3) {
            this.f29464b.a("Unexpectedly failed to persist LastRunInfo.", th3);
        } finally {
        }
        Unit unit = Unit.f80348a;
    }

    public final void c(q1 q1Var) {
        bb.p pVar = new bb.p(2);
        pVar.d(Integer.valueOf(q1Var.f29422a), "consecutiveLaunchCrashes");
        pVar.d(Boolean.valueOf(q1Var.f29423b), "crashed");
        pVar.d(Boolean.valueOf(q1Var.f29424c), "crashedDuringLaunch");
        String pVar2 = pVar.toString();
        File file = this.f29463a;
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        il2.k.d(file, pVar2);
        this.f29464b.i(Intrinsics.n(pVar2, "Persisted: "));
    }
}
