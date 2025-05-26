package tb0;

import android.app.Application;
import android.os.Build;
import android.util.Pair;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.bugsnag.android.g2;
import com.bugsnag.android.p2;
import com.bugsnag.android.x0;
import com.google.firebase.messaging.a0;
import df.j1;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import wd.i0;

/* loaded from: classes5.dex */
public final class b implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f117067a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f117068b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f117069c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f117070d;

    public b(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, cg2.d crashService, lh2.b logger) {
        Intrinsics.checkNotNullParameter(crashService, "crashService");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f117068b = uncaughtExceptionHandler;
        this.f117069c = crashService;
        this.f117070d = logger;
    }

    public static void a(h hVar, Throwable throwable) {
        String str;
        if (hVar.f117078b.get() && hVar.f117080d.get()) {
            Pair pair = new Pair(CredentialProviderBaseController.EXCEPTION_MESSAGE_TAG, throwable.getMessage());
            StackTraceElement[] stackTrace = throwable.getStackTrace();
            int i13 = 0;
            Pair pair2 = new Pair("EXCEPTION_FIRST_FRAME", stackTrace.length > 0 ? stackTrace[0].toString() : "No stack trace available");
            StackTraceElement[] stackTrace2 = throwable.getStackTrace();
            int length = stackTrace2.length;
            while (true) {
                if (i13 >= length) {
                    str = "No stack pinterest trace available";
                    break;
                }
                str = stackTrace2[i13].toString();
                if (str.contains("pinterest")) {
                    break;
                } else {
                    i13++;
                }
            }
            Pair pair3 = new Pair("EXCEPTION_PINTEREST_FIRST_FRAME", str);
            ArrayList arrayList = new ArrayList();
            arrayList.add(pair);
            arrayList.add(pair2);
            arrayList.add(pair3);
            arrayList.add(new Pair("ReportingTool", hVar.f117077a.toString()));
            k kVar = new k();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Pair pair4 = (Pair) it.next();
                kVar.c((String) pair4.first, (String) pair4.second);
            }
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            kVar.a(null, null, throwable);
            hVar.k("INIT_ERROR", kVar.f117102a);
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable exception) {
        int i13 = this.f117067a;
        Object obj = this.f117070d;
        Object obj2 = this.f117069c;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f117068b;
        switch (i13) {
            case 0:
                try {
                    if ((Build.VERSION.SDK_INT != 29 || exception.getMessage() == null || !exception.getMessage().contains("com.miui.phrase.AddPhraseActivity")) && !exception.getClass().getSimpleName().equals("CannotDeliverBroadcastException")) {
                        a((h) obj, exception);
                        if (((h) obj).f117078b.get() && !((h) obj).f117079c.get()) {
                            ((h) obj).g((Application) obj2);
                            bg.d dVar = ((h) obj).f117097u;
                            dVar.getClass();
                            Intrinsics.checkNotNullParameter(exception, "ex");
                            g2 d2 = dVar.d();
                            if (d2 != null) {
                                Intrinsics.checkNotNullParameter(exception, "exception");
                                d2.f(new x0(exception, d2.f29367a, p2.a(null, "unhandledException", null), d2.f29383q), null);
                            }
                        }
                        if (!((h) obj).f117081e.get()) {
                            ((h) obj).f117081e.set(true);
                            int a13 = o.a(((h) obj).f117093q, exception);
                            if (a13 >= 2) {
                                a0 a0Var = ((h) obj).f117094r;
                                if (a0Var != null) {
                                    a0Var.j();
                                }
                                ((lb0.b) lb0.n.a()).k("PREF_NUM_CRASH_PRE_EXP_INIT");
                                ((h) obj).o(j1.W("Crash loop detected. Num crashes: (%d)", Integer.valueOf(a13)), new i0(exception));
                            }
                        }
                    }
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(thread, "thread");
                Intrinsics.checkNotNullParameter(exception, "exception");
                try {
                    try {
                        ((cg2.c) ((cg2.d) obj2)).i(exception);
                        if (uncaughtExceptionHandler == null) {
                            return;
                        }
                    } catch (Exception e13) {
                        ((lh2.e) ((lh2.b) obj)).b(lh2.g.UNCAUGHT_EXC_HANDLER, e13);
                        if (uncaughtExceptionHandler == null) {
                            return;
                        }
                    }
                    return;
                } catch (Throwable th3) {
                    if (uncaughtExceptionHandler != null) {
                    }
                    throw th3;
                }
        }
    }

    public b(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Application application, h hVar) {
        this.f117068b = uncaughtExceptionHandler;
        this.f117069c = application;
        this.f117070d = hVar;
    }
}
