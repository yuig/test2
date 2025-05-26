package com.google.firebase.messaging;

import a7.o1;
import a7.t0;
import a7.v0;
import ac2.k0;
import ac2.m0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.z1;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.internal.recaptcha.r1;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.pinterest.engage.GoogleEngageWorker;
import com.pinterest.feature.pincarouselads.view.SingleColumnCarouselPinView;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import com.pinterest.identity.core.error.UnauthException;
import com.pinterest.security.RecaptchaException;
import com.pinterest.ui.grid.videopin.PinVideoGridCell;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l82.g0;
import l82.h0;
import lh0.a4;
import lh0.g1;
import lh0.n1;
import lh0.z0;
import lh0.z3;
import m7.l0;
import nx.h1;
import t3.s1;
import yq1.d1;

/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements OnCompleteListener, uj2.u, OnFailureListener, j5.c, d7.r, x7.u, e7.v, Continuation, uj2.e0, se0.j, h1, r5.p, g.a, qe2.a, uj2.e, g0, uj2.j, ak2.f, sl.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33757a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f33758b;

    public /* synthetic */ a0(Object obj, int i13) {
        this.f33757a = i13;
        this.f33758b = obj;
    }

    @Override // uj2.j
    public void G(gk2.l emitter) {
        final v0 this_pollPlayer = (v0) this.f33758b;
        a7.f fVar = m0.f1992a;
        Intrinsics.checkNotNullParameter(this_pollPlayer, "$this_pollPlayer");
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        final k0 k0Var = new k0(this_pollPlayer, emitter);
        bk2.a aVar = new bk2.a(new ak2.d() { // from class: ac2.f0
            @Override // ak2.d
            public final void cancel() {
                a7.v0 this_pollPlayer2 = a7.v0.this;
                Intrinsics.checkNotNullParameter(this_pollPlayer2, "$this_pollPlayer");
                k0 listener = k0Var;
                Intrinsics.checkNotNullParameter(listener, "$listener");
                this_pollPlayer2.j(listener);
            }
        });
        bk2.a aVar2 = emitter.f65491b;
        aVar2.getClass();
        bk2.c.set(aVar2, aVar);
        emitter.c(new Pair(Boolean.valueOf(this_pollPlayer.z()), Integer.valueOf(this_pollPlayer.L())));
        this_pollPlayer.M(k0Var);
    }

    @Override // e7.v
    public void a(long j13, d7.d0 d0Var) {
        f0.h.u(j13, d0Var, ((j9.i) this.f33758b).K);
    }

    @Override // ak2.f
    public Object apply(Object obj) {
        int i13 = this.f33757a;
        Object obj2 = this.f33758b;
        switch (i13) {
            case 0:
                String uncompressedFieldset = (String) obj2;
                Throwable error = (Throwable) obj;
                Intrinsics.checkNotNullParameter(uncompressedFieldset, "$uncompressedFieldset");
                Intrinsics.checkNotNullParameter(error, "error");
                return new mc.b(uncompressedFieldset, error);
            default:
                GoogleEngageWorker this$0 = (GoogleEngageWorker) obj2;
                Throwable it = (Throwable) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                return this$0.f78963b.f20000d < 3 ? new kb.x() : new kb.w();
        }
    }

    @Override // uj2.u
    public uj2.t b(uj2.q upstream) {
        int i13 = this.f33757a;
        Object obj = this.f33758b;
        switch (i13) {
            case 0:
                return (uj2.t) s1.a((Function1) obj, "$tmp0", upstream, "p0", upstream);
            case 1:
                return (uj2.t) s1.a((Function1) obj, "$tmp0", upstream, "p0", upstream);
            case 2:
                return (uj2.t) s1.a((Function1) obj, "$tmp0", upstream, "p0", upstream);
            case 3:
                return (uj2.t) s1.a((Function1) obj, "$tmp0", upstream, "p0", upstream);
            case 4:
                return (uj2.t) s1.a((Function1) obj, "$tmp0", upstream, "p0", upstream);
            case 5:
                return (uj2.t) s1.a((Function1) obj, "$tmp0", upstream, "p0", upstream);
            case 6:
                return (uj2.t) s1.a((Function1) obj, "$tmp0", upstream, "p0", upstream);
            case 7:
                return (uj2.t) s1.a((Function1) obj, "$tmp0", upstream, "p0", upstream);
            case 8:
                return (uj2.t) s1.a((Function1) obj, "$tmp0", upstream, "p0", upstream);
            default:
                uj2.a0 repositoryScheduler = (uj2.a0) obj;
                Intrinsics.checkNotNullParameter(repositoryScheduler, "$repositoryScheduler");
                Intrinsics.checkNotNullParameter(upstream, "upstream");
                TimeUnit timeUnit = TimeUnit.SECONDS;
                upstream.getClass();
                return upstream.l(1L, timeUnit, tk2.e.f118016b).H(repositoryScheduler);
        }
    }

    @Override // g.a
    public void c(Object obj) {
        nl1.d this$0 = (nl1.d) this.f33758b;
        ActivityResult activityResult = (ActivityResult) obj;
        int i13 = nl1.d.W;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (activityResult == null || activityResult.f15931a != -1) {
            this$0.h7().invoke(null);
            return;
        }
        Intent intent = activityResult.f15932b;
        this$0.V = new ll.j(intent, 27);
        this$0.h7().invoke(intent);
    }

    @Override // se0.j
    public void d(float f13) {
        yq0.t this$0 = (yq0.t) this.f33758b;
        int i13 = yq0.t.f139730t0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        RecyclerView recyclerView = this$0.g8();
        if (recyclerView != null) {
            ar0.n q83 = this$0.q8();
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            ar0.n.m(q83.f20398b, new ar0.m(recyclerView, (int) f13, 0));
        }
    }

    @Override // sl.e
    public Object e(pd.s sVar) {
        int i13 = this.f33757a;
        Object obj = this.f33758b;
        switch (i13) {
            case 0:
            case 1:
                return obj;
            default:
                return new am.c((Context) sVar.a(Context.class), ((nl.g) sVar.a(nl.g.class)).d(), sVar.b(sl.q.a(am.d.class)), sVar.f(km.b.class), (Executor) sVar.e((sl.q) obj));
        }
    }

    @Override // nx.h1
    public HashMap f() {
        HashMap startOrRestartViewModel$lambda$9;
        int i13 = this.f33757a;
        Object obj = this.f33758b;
        switch (i13) {
            case 18:
                startOrRestartViewModel$lambda$9 = SingleColumnCarouselPinView.startOrRestartViewModel$lambda$9((SingleColumnCarouselPinView) obj);
                return startOrRestartViewModel$lambda$9;
            case 19:
                uk1.d presenterPinalytics = (uk1.d) obj;
                Intrinsics.checkNotNullParameter(presenterPinalytics, "$presenterPinalytics");
                return presenterPinalytics.f122379a.f();
            default:
                PinVideoGridCell this$0 = (PinVideoGridCell) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                return this$0.getPinalytics().f();
        }
    }

    @Override // uj2.e0
    public void g(kk2.a emitter) {
        Task continueWithTask;
        int i13 = this.f33757a;
        Object obj = this.f33758b;
        switch (i13) {
            case 16:
                rd.j this_observeServiceAvailable = (rd.j) obj;
                Intrinsics.checkNotNullParameter(this_observeServiceAvailable, "$this_observeServiceAvailable");
                Intrinsics.checkNotNullParameter(emitter, "emitter");
                xg.e eVar = (xg.e) this_observeServiceAvailable.f107506b;
                if (eVar.f134914a) {
                    Bundle bundle = new Bundle();
                    bundle.putString("engage_sdk_version", eVar.f134916c);
                    bundle.putString("calling_package_name", eVar.f134915b);
                    continueWithTask = eVar.b(new qq2.c(9, eVar, bundle)).continueWithTask(com.google.common.util.concurrent.r.INSTANCE, xg.i.f134921a);
                } else {
                    continueWithTask = Tasks.forResult(Boolean.FALSE);
                }
                continueWithTask.onSuccessTask(com.google.common.util.concurrent.r.INSTANCE, yg.d.f139007a).addOnCompleteListener(new a0(emitter, 3));
                break;
            case 24:
                mr1.c this$0 = (mr1.c) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(emitter, "emitter");
                this$0.H3(new hk1.t(emitter, 22));
                break;
            default:
                Context context = (Context) obj;
                RecaptchaAction recaptchaAction = com.pinterest.security.h.f51752a;
                Intrinsics.checkNotNullParameter(context, "$context");
                Intrinsics.checkNotNullParameter(emitter, "emitter");
                try {
                    int i14 = com.google.android.gms.internal.recaptcha.e.f31748a;
                    emitter.b(new r1(context));
                    break;
                } catch (Exception unused) {
                    emitter.c(new RecaptchaException.ErrorGettingRecaptchaClient(null));
                }
        }
    }

    @Override // x7.u
    public int h(Object obj) {
        androidx.media3.common.b bVar = (androidx.media3.common.b) this.f33758b;
        x7.n nVar = (x7.n) obj;
        HashMap hashMap = x7.v.f134106a;
        nVar.getClass();
        String str = bVar.f18765o;
        String str2 = nVar.f134050b;
        return ((str2.equals(str) || str2.equals(x7.v.b(bVar))) && nVar.e(bVar, false) && nVar.f(bVar)) ? 1 : 0;
    }

    @Override // l82.g0
    public void i(l82.e resultBuilder) {
        h0 this$0 = (h0) this.f33758b;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        this$0.b(resultBuilder);
    }

    @Override // d7.r
    /* renamed from: invoke */
    public void mo0invoke(Object obj) {
        int i13 = this.f33757a;
        Object obj2 = this.f33758b;
        switch (i13) {
            case 2:
                int i14 = l0.f86250p0;
                ((t0) obj).Y3((a7.l0) obj2);
                break;
            case 3:
                int i15 = l0.f86250p0;
                ((t0) obj).R4((a7.f) obj2);
                break;
            case 4:
                ((t0) obj).z0((Throwable) obj2);
                break;
            case 5:
                ((t0) obj).t0((o1) obj2);
                break;
            default:
                ((n7.c) obj).d((n7.b) obj2);
                break;
        }
    }

    public void j() {
        m60.m this$0 = (m60.m) this.f33758b;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            lb0.g.a("MY_EXPERIMENTS");
            lb0.g.a("MY_EXPERIMENTS_MAP");
            lb0.g.a("OVERRIDDEN_EXPERIMENTS");
            lb0.g.a("EARLY_EXPERIMENTS");
            n1 j13 = this$0.j();
            z3 z3Var = a4.f83298b;
            z0 z0Var = j13.f83439a;
            if (!((g1) z0Var).o("android_disable_bridge", "enabled", z3Var) && !((g1) z0Var).l("android_disable_bridge")) {
                if (p000do.a.f55640b != null) {
                    p000do.b bVar = p000do.a.f55640b;
                    bVar.f55645d.clear();
                    bVar.f55646e.clear();
                    bVar.f55643b.execute(new androidx.appcompat.app.v(bVar, 12));
                } else {
                    p000do.a.f55639a.execute(new wn.b(this$0, 1));
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void k(h1.b r17) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.a0.k(h1.b):void");
    }

    @Override // r5.p
    public boolean l(View view) {
        boolean bindDisplayState$lambda$64$lambda$51;
        bindDisplayState$lambda$64$lambda$51 = SbaPinRep.bindDisplayState$lambda$64$lambda$51((SbaPinRep) this.f33758b, view, null);
        return bindDisplayState$lambda$64$lambda$51;
    }

    @Override // uj2.e
    public void n(fk2.f emitter) {
        Activity activity = (Activity) this.f33758b;
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        try {
            le.v.l(activity, new d1(emitter, 2));
        } catch (Exception e13) {
            emitter.d(new UnauthException.ThirdParty.Facebook.SdkInitializationError(e13));
        }
    }

    @Override // j5.c
    public void onCancel() {
        z1 this$0 = (z1) this.f33758b;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.a();
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        int i13 = this.f33757a;
        boolean z13 = false;
        Object obj = this.f33758b;
        switch (i13) {
            case 0:
                b0.b((Intent) obj);
                break;
            case 1:
                int i14 = c0.f33765b;
                ((d0) obj).f33770b.trySetResult(null);
                break;
            case 2:
                ((ScheduledFuture) obj).cancel(false);
                break;
            default:
                uj2.c0 emitter = (uj2.c0) obj;
                Intrinsics.checkNotNullParameter(emitter, "$emitter");
                Intrinsics.checkNotNullParameter(task, "task");
                if (task.isSuccessful() && Intrinsics.d(task.getResult(), Boolean.TRUE)) {
                    z13 = true;
                }
                ((kk2.a) emitter).b(Boolean.valueOf(z13));
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception e13) {
        l5.i this$0 = (l5.i) this.f33758b;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(e13, "e");
        if (e13 instanceof ApiException) {
            Log.e(this$0.f81579b, "Error saving mediaPerformanceClass", e13);
        } else if (e13 instanceof IllegalStateException) {
            Log.e(this$0.f81579b, "Error saving mediaPerformanceClass", e13);
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        ((androidx.appcompat.widget.x) this.f33758b).getClass();
        Bundle bundle = (Bundle) task.getResult(IOException.class);
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null || (string = bundle.getString("unregistered")) != null) {
            return string;
        }
        String string2 = bundle.getString("error");
        if ("RST".equals(string2)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string2 != null) {
            throw new IOException(string2);
        }
        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }
}
