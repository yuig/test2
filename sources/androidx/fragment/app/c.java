package androidx.fragment.app;

import a.cb;
import a.sc;
import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.work.RxWorker;
import androidx.work.WorkerParameters;
import com.google.android.gms.common.Feature;
import com.google.android.gms.recaptcha.RecaptchaHandle;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.pinterest.pushnotification.PushTokenRegistrationRxWorker;
import com.pinterest.security.RecaptchaException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Request;
import uj2.c0;
import xk2.w;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements j5.c, d7.r, d7.s, d7.i, r4.j, Continuation, uj2.e, uj2.e0, OnFailureListener, ak2.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18290a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18291b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18292c;

    public /* synthetic */ c(int i13, Object obj, Object obj2) {
        this.f18290a = i13;
        this.f18291b = obj;
        this.f18292c = obj2;
    }

    @Override // r4.j
    public Object C(r4.i it) {
        int i13 = this.f18290a;
        int i14 = 0;
        Object obj = this.f18292c;
        Object obj2 = this.f18291b;
        switch (i13) {
            case 8:
                RxWorker rxWorker = (RxWorker) obj2;
                WorkerParameters workerParameters = rxWorker.f78963b;
                Executor executor = workerParameters.f20001e;
                uj2.a0 a0Var = tk2.e.f118015a;
                ((uj2.b0) obj).r(new mk2.k(executor)).l(new mk2.k(workerParameters.f20003g.f125444a)).p(new kb.q0(i14, rxWorker, it));
                return "converted single to future";
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                it.a(new androidx.activity.d(atomicBoolean, 15), kb.o.INSTANCE);
                ((Executor) obj2).execute(new h6.o(atomicBoolean, it, (Function0) obj, 7));
                return Unit.f80348a;
        }
    }

    @Override // d7.i
    public void accept(Object obj) {
        g8.h0 h0Var = (g8.h0) this.f18291b;
        ((g8.i0) obj).g(h0Var.f64276a, h0Var.f64277b, (g8.a0) this.f18292c);
    }

    @Override // ak2.f
    public Object apply(Object r13) {
        int i13 = this.f18290a;
        Object obj = this.f18292c;
        Object obj2 = this.f18291b;
        switch (i13) {
            case 0:
                f00.g this$0 = (f00.g) obj2;
                Request request = (Request) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(request, "$request");
                Intrinsics.checkNotNullParameter(r13, "r");
                this$0.g(r13, request);
                return r13;
            default:
                kl2.l fnLogEvent = (kl2.l) obj2;
                RecaptchaAction action = (RecaptchaAction) obj;
                Throwable throwable = (Throwable) r13;
                RecaptchaAction recaptchaAction = com.pinterest.security.h.f51752a;
                Intrinsics.checkNotNullParameter(fnLogEvent, "$fnLogEvent");
                Intrinsics.checkNotNullParameter(action, "$action");
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                fnLogEvent.invoke("recaptcha_error", action.getAction(), throwable instanceof RecaptchaException.PlayServicesNotAvailable ? "preinit_no_playservices" : throwable instanceof RecaptchaException.UnsupportedPlayServicesVersion ? "preinit_unsupported_playservices" : throwable instanceof RecaptchaException.ErrorGettingRecaptchaClient ? "preinit_get_recaptcha_client" : throwable instanceof RecaptchaException.ErrorGettingRecaptchaHandle ? "init" : throwable instanceof RecaptchaException.ErrorGettingRecaptchaToken ? "exec" : "unknown");
                return "default";
        }
    }

    @Override // d7.s
    public void c(Object obj, a7.p pVar) {
        n7.c cVar = (n7.c) obj;
        cVar.g((a7.v0) this.f18292c, new tb.l(pVar, ((n7.c0) this.f18291b).f89398e));
    }

    @Override // uj2.e0
    public void g(final kk2.a emitter) {
        int i13 = this.f18290a;
        Object obj = this.f18292c;
        Object obj2 = this.f18291b;
        switch (i13) {
            case 13:
                PushTokenRegistrationRxWorker this$0 = (PushTokenRegistrationRxWorker) obj2;
                String str = (String) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(emitter, "emitter");
                try {
                    this$0.f50247h.a(str, new com.pinterest.pushnotification.k(emitter));
                    break;
                } catch (Exception e13) {
                    String message = e13.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    kh2.r.g("RegistrationException", message);
                    if (emitter.isDisposed()) {
                        return;
                    }
                    emitter.a(e13);
                    return;
                }
            case 14:
                final qi.a client = (qi.a) obj2;
                final Function1 throwableWrapper = (Function1) obj;
                RecaptchaAction recaptchaAction = com.pinterest.security.h.f51752a;
                Intrinsics.checkNotNullParameter(client, "$client");
                Intrinsics.checkNotNullParameter(throwableWrapper, "$throwableWrapper");
                Intrinsics.checkNotNullParameter(emitter, "emitter");
                com.google.android.gms.internal.recaptcha.r1 r1Var = (com.google.android.gms.internal.recaptcha.r1) client;
                r1Var.getClass();
                com.google.android.gms.common.api.internal.q a13 = com.google.android.gms.common.api.internal.r.a();
                final int i14 = 0;
                a13.f30859c = new ck2.a(r1Var, "6LfgwR8lAAAAAD2GQbJHdgXWyl3W3sbn9n0c49cY", i14);
                a13.f30860d = new Feature[]{qi.b.f103965a};
                r1Var.d(0, a13.a()).addOnCompleteListener(new OnCompleteListener() { // from class: r42.l
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        Task task2;
                        RecaptchaHandle recaptchaHandle;
                        Object result;
                        int i15 = i14;
                        Function1 throwableWrapper2 = throwableWrapper;
                        c0 emitter2 = emitter;
                        Object obj3 = client;
                        switch (i15) {
                            case 0:
                                qi.a client2 = (qi.a) obj3;
                                Intrinsics.checkNotNullParameter(emitter2, "$emitter");
                                Intrinsics.checkNotNullParameter(throwableWrapper2, "$throwableWrapper");
                                Intrinsics.checkNotNullParameter(client2, "$client");
                                Intrinsics.checkNotNullParameter(task, "task");
                                task2 = task.isSuccessful() ? task : null;
                                if (task2 != null && (recaptchaHandle = (RecaptchaHandle) task2.getResult()) != null) {
                                    ((kk2.a) emitter2).b(new w(client2, recaptchaHandle, "6LfgwR8lAAAAAD2GQbJHdgXWyl3W3sbn9n0c49cY"));
                                    break;
                                } else {
                                    ((kk2.a) emitter2).c((Throwable) throwableWrapper2.invoke(task.getException()));
                                    break;
                                }
                            default:
                                Task this_asSingle = (Task) obj3;
                                Intrinsics.checkNotNullParameter(emitter2, "$emitter");
                                Intrinsics.checkNotNullParameter(throwableWrapper2, "$throwableWrapper");
                                Intrinsics.checkNotNullParameter(this_asSingle, "$this_asSingle");
                                Intrinsics.checkNotNullParameter(task, "task");
                                task2 = this_asSingle.isSuccessful() ? task : null;
                                if (task2 != null && (result = task2.getResult()) != null) {
                                    ((kk2.a) emitter2).b(result);
                                    break;
                                } else {
                                    ((kk2.a) emitter2).c((Throwable) throwableWrapper2.invoke(task.getException()));
                                    break;
                                }
                        }
                    }
                });
                break;
            default:
                final Task this_asSingle = (Task) obj2;
                final Function1 throwableWrapper2 = (Function1) obj;
                RecaptchaAction recaptchaAction2 = com.pinterest.security.h.f51752a;
                Intrinsics.checkNotNullParameter(this_asSingle, "$this_asSingle");
                Intrinsics.checkNotNullParameter(throwableWrapper2, "$throwableWrapper");
                Intrinsics.checkNotNullParameter(emitter, "emitter");
                final int i15 = 1;
                this_asSingle.addOnCompleteListener(new OnCompleteListener() { // from class: r42.l
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        Task task2;
                        RecaptchaHandle recaptchaHandle;
                        Object result;
                        int i152 = i15;
                        Function1 throwableWrapper22 = throwableWrapper2;
                        c0 emitter2 = emitter;
                        Object obj3 = this_asSingle;
                        switch (i152) {
                            case 0:
                                qi.a client2 = (qi.a) obj3;
                                Intrinsics.checkNotNullParameter(emitter2, "$emitter");
                                Intrinsics.checkNotNullParameter(throwableWrapper22, "$throwableWrapper");
                                Intrinsics.checkNotNullParameter(client2, "$client");
                                Intrinsics.checkNotNullParameter(task, "task");
                                task2 = task.isSuccessful() ? task : null;
                                if (task2 != null && (recaptchaHandle = (RecaptchaHandle) task2.getResult()) != null) {
                                    ((kk2.a) emitter2).b(new w(client2, recaptchaHandle, "6LfgwR8lAAAAAD2GQbJHdgXWyl3W3sbn9n0c49cY"));
                                    break;
                                } else {
                                    ((kk2.a) emitter2).c((Throwable) throwableWrapper22.invoke(task.getException()));
                                    break;
                                }
                            default:
                                Task this_asSingle2 = (Task) obj3;
                                Intrinsics.checkNotNullParameter(emitter2, "$emitter");
                                Intrinsics.checkNotNullParameter(throwableWrapper22, "$throwableWrapper");
                                Intrinsics.checkNotNullParameter(this_asSingle2, "$this_asSingle");
                                Intrinsics.checkNotNullParameter(task, "task");
                                task2 = this_asSingle2.isSuccessful() ? task : null;
                                if (task2 != null && (result = task2.getResult()) != null) {
                                    ((kk2.a) emitter2).b(result);
                                    break;
                                } else {
                                    ((kk2.a) emitter2).c((Throwable) throwableWrapper22.invoke(task.getException()));
                                    break;
                                }
                        }
                    }
                });
                break;
        }
    }

    @Override // d7.r
    /* renamed from: invoke */
    public void mo0invoke(Object obj) {
        int i13 = this.f18290a;
        Object obj2 = this.f18292c;
        Object obj3 = this.f18291b;
        switch (i13) {
            case 1:
                ((n7.c) obj).O((n7.b) obj3, (a7.i1) obj2);
                break;
            case 2:
                ((n7.c) obj).getClass();
                break;
            case 3:
            default:
                a7.o1 o1Var = (a7.o1) obj2;
                ((n7.c) obj).w((n7.b) obj3, o1Var);
                int i14 = o1Var.f1159a;
                break;
            case 4:
                ((n7.c) obj).n((n7.b) obj3, (a7.f) obj2);
                break;
            case 5:
                ((n7.c) obj).f((n7.b) obj3, (g8.a0) obj2);
                break;
        }
    }

    @Override // uj2.e
    public void n(fk2.f emitter) {
        com.facebook.login.x loginManager = (com.facebook.login.x) this.f18291b;
        Activity context = (Activity) this.f18292c;
        Intrinsics.checkNotNullParameter(loginManager, "$loginManager");
        Intrinsics.checkNotNullParameter(context, "$activity");
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        hr1.i responseCallback = new hr1.i(emitter);
        loginManager.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
        String applicationId = le.v.b();
        String loggerRef = cb.g("randomUUID().toString()");
        com.facebook.login.r rVar = new com.facebook.login.r(context == null ? le.v.a() : context, applicationId);
        if (!loginManager.f30080c.getBoolean("express_login_allowed", true)) {
            rVar.a(loggerRef);
            responseCallback.a();
            return;
        }
        String graphApiVersion = le.v.e();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(loggerRef, "loggerRef");
        Intrinsics.checkNotNullParameter(graphApiVersion, "graphApiVersion");
        com.facebook.login.a0 a0Var = new com.facebook.login.a0(context, applicationId, loggerRef, graphApiVersion);
        a0Var.f54704c = new d(loggerRef, rVar, responseCallback, applicationId);
        if (!p001if.a.b(rVar)) {
            try {
                rVar.f30038b.c("fb_mobile_login_status_start", wc.b.b(loggerRef));
            } catch (Throwable th3) {
                p001if.a.a(rVar, th3);
            }
        }
        if (a0Var.d()) {
            return;
        }
        rVar.a(loggerRef);
        responseCallback.a();
    }

    @Override // j5.c
    public void onCancel() {
        Animator animator = (Animator) this.f18291b;
        z1 operation = (z1) this.f18292c;
        Intrinsics.checkNotNullParameter(operation, "$operation");
        animator.end();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + operation + " has been canceled.");
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception it) {
        kl2.l logEvent = (kl2.l) this.f18291b;
        String action = (String) this.f18292c;
        RecaptchaAction recaptchaAction = com.pinterest.security.h.f51752a;
        Intrinsics.checkNotNullParameter(logEvent, "$logEvent");
        Intrinsics.checkNotNullParameter(action, "$action");
        Intrinsics.checkNotNullParameter(it, "it");
        logEvent.invoke("recaptcha_error", action, "close");
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        switch (this.f18290a) {
            case 10:
                Context context = (Context) this.f18291b;
                Intent intent = (Intent) this.f18292c;
                Object obj = com.google.firebase.messaging.h.f33780c;
                return ((Integer) task.getResult()).intValue() != 402 ? task : com.google.firebase.messaging.h.a(context, intent).continueWith(new u5.j(13), new sc(19));
            default:
                com.google.firebase.messaging.p pVar = (com.google.firebase.messaging.p) this.f18291b;
                String str = (String) this.f18292c;
                synchronized (pVar) {
                    pVar.f33801b.remove(str);
                }
                return task;
        }
    }
}
