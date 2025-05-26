package com.bugsnag.android;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001'B\u0007¢\u0006\u0004\b%\u0010\bJ\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\t\u0010\bJ\u001d\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\bJ\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u0013J\u000f\u0010\u001a\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\bR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006("}, d2 = {"Lcom/bugsnag/android/AnrPlugin;", "Lcom/bugsnag/android/h2;", "", "unwindFunction", "", "setUnwindFunction", "(J)V", "enableAnrReporting", "()V", "disableAnrReporting", "", "clz", "Ljava/lang/Class;", "loadClass", "(Ljava/lang/String;)Ljava/lang/Class;", "initNativePlugin", "Lcom/bugsnag/android/o;", "client", "performOneTimeSetup", "(Lcom/bugsnag/android/o;)V", "", "Lcom/bugsnag/android/NativeStackframe;", "nativeTrace", "notifyAnrDetected", "(Ljava/util/List;)V", "load", "unload", "Lcom/bugsnag/android/t1;", "libraryLoader", "Lcom/bugsnag/android/t1;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "oneTimeSetupPerformed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lcom/bugsnag/android/o;", "Lcom/bugsnag/android/b;", "collector", "Lcom/bugsnag/android/b;", "<init>", "Companion", "com/bugsnag/android/d", "bugsnag-plugin-android-anr_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class AnrPlugin implements h2 {

    @NotNull
    private static final String ANR_ERROR_CLASS = "ANR";

    @NotNull
    private static final String ANR_ERROR_MSG = "Application did not respond to UI input";

    @NotNull
    public static final d Companion = new d();

    @NotNull
    private static final String LOAD_ERR_MSG = "Native library could not be linked. Bugsnag will not report ANRs. See https://docs.bugsnag.com/platforms/android/anr-link-errors";
    private o client;

    @NotNull
    private final t1 libraryLoader = new t1();

    @NotNull
    private final AtomicBoolean oneTimeSetupPerformed = new AtomicBoolean(false);

    @NotNull
    private final b collector = new b();

    private final native void disableAnrReporting();

    private final native void enableAnrReporting();

    /* JADX INFO: Access modifiers changed from: private */
    public final void initNativePlugin() {
        enableAnrReporting();
        o oVar = this.client;
        if (oVar != null) {
            oVar.f29383q.c("Initialised ANR Plugin");
        } else {
            Intrinsics.r("client");
            throw null;
        }
    }

    private final Class<?> loadClass(String clz) {
        try {
            return Class.forName(clz);
        } catch (Throwable unused) {
            return null;
        }
    }

    private final void notifyAnrDetected(List<NativeStackframe> nativeTrace) {
        Object obj;
        ArrayList arrayList;
        try {
            o oVar = this.client;
            if (oVar == null) {
                Intrinsics.r("client");
                throw null;
            }
            hd.h hVar = oVar.f29367a;
            if (!hVar.c() && !hVar.b(ANR_ERROR_CLASS)) {
                StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
                Companion.getClass();
                boolean isNativeMethod = stackTrace.length == 0 ? false : ((StackTraceElement) kotlin.collections.c0.B(stackTrace)).isNativeMethod();
                RuntimeException runtimeException = new RuntimeException();
                runtimeException.setStackTrace(stackTrace);
                o oVar2 = this.client;
                if (oVar2 == null) {
                    Intrinsics.r("client");
                    throw null;
                }
                x0 createEvent = NativeInterface.createEvent(runtimeException, oVar2, p2.a(null, "anrError", null));
                u0 u0Var = ((t0) createEvent.f29685a.f29727l.get(0)).f29640a;
                u0Var.f29655a = ANR_ERROR_CLASS;
                u0Var.f29656b = ANR_ERROR_MSG;
                if (isNativeMethod) {
                    List<NativeStackframe> list = nativeTrace;
                    ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new r2((NativeStackframe) it.next()));
                    }
                    u0Var.f29658d.addAll(0, arrayList2);
                    Iterator it2 = createEvent.f29685a.f29728m.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it2.next();
                            if (((s3) obj).f29637a.f29651d) {
                                break;
                            }
                        }
                    }
                    s3 s3Var = (s3) obj;
                    if (s3Var != null && (arrayList = s3Var.f29637a.f29653f) != null) {
                        arrayList.addAll(0, arrayList2);
                    }
                }
                b bVar = this.collector;
                o oVar3 = this.client;
                if (oVar3 == null) {
                    Intrinsics.r("client");
                    throw null;
                }
                bVar.getClass();
                Handler handler = new Handler(bVar.f29157a.getLooper());
                handler.post(new q5.h1(bVar, oVar3, new AtomicInteger(), handler, createEvent));
            }
        } catch (Exception e13) {
            o oVar4 = this.client;
            if (oVar4 != null) {
                oVar4.f29383q.b("Internal error reporting ANR", e13);
            } else {
                Intrinsics.r("client");
                throw null;
            }
        }
    }

    private final void performOneTimeSetup(o client) {
        Class<?> loadClass;
        Object obj;
        if (!this.libraryLoader.a("bugsnag-plugin-android-anr", client, new c(0)) || (loadClass = loadClass("com.bugsnag.android.NdkPlugin")) == null) {
            return;
        }
        Iterator it = client.f29387u.f29275c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (Intrinsics.d(((h2) obj).getClass(), loadClass)) {
                    break;
                }
            }
        }
        h2 h2Var = (h2) obj;
        if (h2Var != null) {
            Object invoke = h2Var.getClass().getMethod("getSignalUnwindStackFunction", new Class[0]).invoke(h2Var, new Object[0]);
            if (invoke == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
            }
            setUnwindFunction(((Long) invoke).longValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: performOneTimeSetup$lambda-1, reason: not valid java name */
    public static final boolean m87performOneTimeSetup$lambda1(x0 x0Var) {
        t0 t0Var = (t0) x0Var.f29685a.f29727l.get(0);
        x0Var.a("LinkError", "errorClass", t0Var.f29640a.f29655a);
        u0 u0Var = t0Var.f29640a;
        x0Var.a("LinkError", "errorMessage", u0Var.f29656b);
        u0Var.f29655a = "AnrLinkError";
        u0Var.f29656b = LOAD_ERR_MSG;
        return true;
    }

    private final native void setUnwindFunction(long unwindFunction);

    @Override // com.bugsnag.android.h2
    public void load(@NotNull o client) {
        this.client = client;
        if (!this.oneTimeSetupPerformed.getAndSet(true)) {
            performOneTimeSetup(client);
        }
        if (!this.libraryLoader.f29643b) {
            client.f29383q.h(LOAD_ERR_MSG);
            return;
        }
        Looper mainLooper = Looper.getMainLooper();
        if (Intrinsics.d(Looper.myLooper(), mainLooper)) {
            initNativePlugin();
        } else {
            new Handler(mainLooper).postAtFrontOfQueue(new com.airbnb.lottie.k(this, 4));
        }
    }

    @Override // com.bugsnag.android.h2
    public void unload() {
        if (this.libraryLoader.f29643b) {
            disableAnrReporting();
        }
    }
}
