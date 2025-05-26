package vo;

import android.content.Context;
import android.content.Intent;
import com.pinterest.activity.PinterestActivity;
import com.pinterest.security.PlayIntegrityVerificationWorker;
import h32.f1;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import kb.c0;
import kb.e0;
import kb.f0;
import kb.u0;
import kb.w0;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.n1;
import lh0.z3;
import nx.d0;
import pk.a0;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126367a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PinterestActivity f126368b;

    public /* synthetic */ k(PinterestActivity pinterestActivity, int i13) {
        this.f126367a = i13;
        this.f126368b = pinterestActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        se2.a aVar;
        int i13 = this.f126367a;
        PinterestActivity this$0 = this.f126368b;
        switch (i13) {
            case 0:
                int i14 = PinterestActivity.D;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                d0 a13 = sh.f.a();
                Intrinsics.checkNotNullExpressionValue(a13, "get(...)");
                f1 f1Var = f1.APP_START;
                this$0.getClass();
                HashMap hashMap = new HashMap();
                HashSet hashSet = tb0.h.f117076w;
                tb0.h hVar = tb0.g.f117075a;
                tb0.o oVar = hVar.f117098v;
                if (oVar != null && oVar.f117108a) {
                    hashMap.put("last_start_crashed", "true");
                    tb0.o d2 = hVar.d();
                    if (d2.f117109b) {
                        hashMap.put("last_start_crashed_oom", "true");
                        String l13 = Long.toString(d2.f117110c);
                        Intrinsics.checkNotNullExpressionValue(l13, "toString(...)");
                        hashMap.put("last_start_crashed_oom_status_total", l13);
                        String l14 = Long.toString(d2.f117111d);
                        Intrinsics.checkNotNullExpressionValue(l14, "toString(...)");
                        hashMap.put("last_start_crashed_oom_status_used", l14);
                    }
                }
                Intrinsics.checkNotNullParameter(this$0, "<this>");
                hashMap.put("theme", a0.q0(this$0) ? "dark" : "light");
                n1 n1Var = this$0.f34813f;
                if (n1Var == null) {
                    Intrinsics.r("experiments");
                    throw null;
                }
                z3 z3Var = a4.f83298b;
                g1 g1Var = (g1) n1Var.f83439a;
                if (g1Var.o("android_pwt_powerscore", "enabled", z3Var) || g1Var.l("android_pwt_powerscore")) {
                    hashMap.put("powerscore", String.valueOf(((iz1.a) ((bf2.b) this$0.t()).get()).a()));
                } else {
                    se2.a aVar2 = this$0.f34832y;
                    if (aVar2 == null) {
                        Intrinsics.r("powerscoreCalculator");
                        throw null;
                    }
                    hashMap.put("powerscore", String.valueOf(((kz1.a) ((bf2.b) aVar2).get()).a()));
                }
                a13.g(f1Var, null, hashMap, false);
                return;
            case 1:
                int i15 = PinterestActivity.D;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intent intent = this$0.getIntent();
                if ("android.intent.action.MAIN".equals(intent.getAction()) && intent.hasCategory("android.intent.category.LAUNCHER")) {
                    se2.a aVar3 = this$0.f34818k;
                    if (aVar3 != null) {
                        ((yy.a) ((bf2.b) aVar3).get()).a();
                        return;
                    } else {
                        Intrinsics.r("serviceEntryLogging");
                        throw null;
                    }
                }
                return;
            case 2:
                int i16 = PinterestActivity.D;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                se2.a aVar4 = this$0.f34823p;
                if (aVar4 != null) {
                    ((com.pinterest.security.i) ((bf2.b) aVar4).get()).b();
                    return;
                } else {
                    Intrinsics.r("sessionVerificationHandler");
                    throw null;
                }
            default:
                int i17 = PinterestActivity.D;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                n1 n1Var2 = this$0.f34813f;
                if (n1Var2 == null) {
                    Intrinsics.r("experiments");
                    throw null;
                }
                z3 z3Var2 = a4.f83298b;
                g1 g1Var2 = (g1) n1Var2.f83439a;
                if (g1Var2.o("android_encryption_lib_decryption", "enabled", z3Var2) || g1Var2.l("android_encryption_lib_decryption")) {
                    ((lb0.r) ((bf2.b) this$0.u()).get()).j("PREF_EXP_DATA_ENCRYPTION", "just_testing", lb0.t.a());
                    ((lb0.r) ((bf2.b) this$0.u()).get()).e("PREF_EXP_DATA_ENCRYPTION");
                }
                try {
                    aVar = this$0.f34823p;
                } catch (Exception unused) {
                }
                if (aVar == null) {
                    Intrinsics.r("sessionVerificationHandler");
                    throw null;
                }
                ((com.pinterest.security.i) ((bf2.b) aVar).get()).a();
                n1 n1Var3 = this$0.f34813f;
                if (n1Var3 == null) {
                    Intrinsics.r("experiments");
                    throw null;
                }
                z3 z3Var3 = a4.f83298b;
                g1 g1Var3 = (g1) n1Var3.f83439a;
                if (g1Var3.o("android_play_integrity_killswitch", "enabled", z3Var3) || g1Var3.l("android_play_integrity_killswitch")) {
                    se2.a aVar5 = this$0.f34824q;
                    if (aVar5 == null) {
                        Intrinsics.r("securityWorkerScheduler");
                        throw null;
                    }
                    ((r42.n) ((bf2.b) aVar5).get()).getClass();
                    Intrinsics.checkNotNullParameter(PlayIntegrityVerificationWorker.class, "workerClass");
                    e0 e0Var = (e0) new e0(PlayIntegrityVerificationWorker.class).g(5L, TimeUnit.MINUTES);
                    c0 c0Var = c0.NOT_REQUIRED;
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    c0 networkType = c0.CONNECTED;
                    Intrinsics.checkNotNullParameter(networkType, "networkType");
                    f0 f0Var = (f0) ((e0) e0Var.f(new kb.g(new ub.g(null), networkType, false, false, false, false, -1L, -1L, CollectionsKt.J0(linkedHashSet)))).b();
                    u0 u0Var = w0.f79048a;
                    Context context = kb0.a.f79058b;
                    u0Var.a(m60.f0.j0()).a("PLAY_INTEGRITY_SESSION_VERIFICATION", kb.q.REPLACE, f0Var).b();
                    return;
                }
                return;
        }
    }
}
