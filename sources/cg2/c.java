package cg2;

import io.embrace.android.embracesdk.Severity;
import io.embrace.android.embracesdk.internal.payload.JsException;
import io.embrace.android.embracesdk.internal.payload.LegacyExceptionInfo;
import io.embrace.android.embracesdk.internal.payload.ThreadInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kg.p;
import kotlin.collections.c0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import rl2.g0;
import sh2.h;
import xf2.d0;
import xf2.j;
import xf2.o0;
import xf2.s0;
import xk2.k;
import xk2.v;

/* loaded from: classes4.dex */
public final class c extends uf2.b implements a {

    /* renamed from: d, reason: collision with root package name */
    public final ig2.b f27706d;

    /* renamed from: e, reason: collision with root package name */
    public final uh2.b f27707e;

    /* renamed from: f, reason: collision with root package name */
    public final vf2.b f27708f;

    /* renamed from: g, reason: collision with root package name */
    public final sg2.a f27709g;

    /* renamed from: h, reason: collision with root package name */
    public final xh2.d f27710h;

    /* renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArrayList f27711i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f27712j;

    /* renamed from: k, reason: collision with root package name */
    public JsException f27713k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ig2.b sessionPropertiesService, uh2.b preferencesService, vf2.b logWriter, sg2.a configService, xh2.d serializer, lh2.b logger) {
        super(logWriter, logger, wf2.b.f129712a);
        Intrinsics.checkNotNullParameter(sessionPropertiesService, "sessionPropertiesService");
        Intrinsics.checkNotNullParameter(preferencesService, "preferencesService");
        Intrinsics.checkNotNullParameter(logWriter, "logWriter");
        Intrinsics.checkNotNullParameter(configService, "configService");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f27706d = sessionPropertiesService;
        this.f27707e = preferencesService;
        this.f27708f = logWriter;
        this.f27709g = configService;
        this.f27710h = serializer;
        this.f27711i = new CopyOnWriteArrayList();
        if (((sg2.b) configService).f112877b.f117602c.isJvmCrashCaptureEnabled()) {
            Thread.setDefaultUncaughtExceptionHandler(new tb0.b(Thread.getDefaultUncaughtExceptionHandler(), this, logger));
        }
    }

    public static String h(String str) {
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return g0.l0(bytes);
    }

    public final void g(v handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f27711i.add(handler);
    }

    public final void i(Throwable th3) {
        Throwable throwable = th3;
        Intrinsics.checkNotNullParameter(throwable, "exception");
        if (this.f27712j) {
            return;
        }
        this.f27712j = true;
        String x13 = kh2.d.x();
        int b13 = ((uh2.a) this.f27707e).b("io.embrace.crashnumber");
        s0 s0Var = new s0(this.f27709g, new b(0, this.f27706d, ig2.b.class, "getProperties", "getProperties()Ljava/util/Map;", 0), null);
        String str = "throwable";
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        String name = th3.getClass().getName();
        String message = th3.getMessage();
        String str2 = "";
        if (message == null) {
            message = "";
        }
        StackTraceElement[] stackTrace = th3.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "throwable.stackTrace");
        ArrayList arrayList = new ArrayList(stackTrace.length);
        for (StackTraceElement stackTraceElement : stackTrace) {
            arrayList.add(stackTraceElement.toString());
        }
        Intrinsics.checkNotNullExpressionValue(name, "name");
        LegacyExceptionInfo legacyExceptionInfo = new LegacyExceptionInfo(name, message, arrayList);
        ri2.e EXCEPTION_TYPE = sj2.b.f113030c;
        Intrinsics.checkNotNullExpressionValue(EXCEPTION_TYPE, "EXCEPTION_TYPE");
        s0Var.a(EXCEPTION_TYPE, legacyExceptionInfo.f73168a, true);
        ri2.e EXCEPTION_MESSAGE = sj2.b.f113028a;
        Intrinsics.checkNotNullExpressionValue(EXCEPTION_MESSAGE, "EXCEPTION_MESSAGE");
        String str3 = legacyExceptionInfo.f73169b;
        if (str3 == null) {
            str3 = "";
        }
        s0Var.a(EXCEPTION_MESSAGE, str3, true);
        ri2.e EXCEPTION_STACKTRACE = sj2.b.f113029b;
        Intrinsics.checkNotNullExpressionValue(EXCEPTION_STACKTRACE, "EXCEPTION_STACKTRACE");
        List list = legacyExceptionInfo.f73170c;
        xh2.d dVar = this.f27710h;
        s0Var.a(EXCEPTION_STACKTRACE, h(dVar.c(List.class, list)), true);
        ri2.e LOG_RECORD_UID = tj2.d.f117929a;
        Intrinsics.checkNotNullExpressionValue(LOG_RECORD_UID, "LOG_RECORD_UID");
        s0Var.a(LOG_RECORD_UID, x13, true);
        s0Var.b(h.f112953b, String.valueOf(b13), true);
        j.f134867e.getClass();
        d0 d0Var = j.f134868f;
        ArrayList arrayList2 = new ArrayList();
        while (throwable != null && !Intrinsics.d(throwable, throwable.getCause())) {
            Intrinsics.checkNotNullParameter(throwable, str);
            String name2 = throwable.getClass().getName();
            String message2 = throwable.getMessage();
            if (message2 == null) {
                message2 = str2;
            }
            StackTraceElement[] stackTrace2 = throwable.getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace2, "throwable.stackTrace");
            String str4 = str;
            ArrayList arrayList3 = new ArrayList(stackTrace2.length);
            String str5 = str2;
            int i13 = 0;
            for (int length = stackTrace2.length; i13 < length; length = length) {
                arrayList3.add(stackTrace2[i13].toString());
                i13++;
            }
            Intrinsics.checkNotNullExpressionValue(name2, "name");
            LegacyExceptionInfo legacyExceptionInfo2 = new LegacyExceptionInfo(name2, message2, arrayList3);
            if (arrayList2.contains(legacyExceptionInfo2)) {
                break;
            }
            arrayList2.add(0, legacyExceptionInfo2);
            throwable = throwable.getCause();
            str = str4;
            str2 = str5;
        }
        s0Var.b(d0Var, h(dVar.c(List.class, arrayList2)), true);
        d0 d0Var2 = h.f112952a;
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        Intrinsics.checkNotNullExpressionValue(allStackTraces, "getAllStackTraces()");
        ArrayList arrayList4 = new ArrayList(allStackTraces.size());
        for (Map.Entry<Thread, StackTraceElement[]> entry : allStackTraces.entrySet()) {
            Thread key = entry.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "it.key");
            Thread thread = key;
            StackTraceElement[] value = entry.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "it.value");
            StackTraceElement[] stackTraceElements = value;
            Intrinsics.checkNotNullParameter(thread, "thread");
            Intrinsics.checkNotNullParameter(stackTraceElements, "stackTraceElements");
            String name3 = thread.getName();
            int priority = thread.getPriority();
            int length2 = stackTraceElements.length;
            List U = c0.U(Integer.MAX_VALUE, stackTraceElements);
            ArrayList arrayList5 = new ArrayList(kotlin.collections.g0.q(U, 10));
            Iterator it = U.iterator();
            while (it.hasNext()) {
                arrayList5.add(((StackTraceElement) it.next()).toString());
            }
            arrayList4.add(new ThreadInfo(thread.getId(), thread.getState(), name3, priority, arrayList5, length2));
        }
        s0Var.b(d0Var2, h(dVar.c(List.class, arrayList4)), true);
        JsException jsException = this.f27713k;
        if (jsException != null) {
            xf2.v.f134900e.getClass();
            s0Var.b(xf2.v.f134901f, h(dVar.c(JsException.class, jsException)), true);
        }
        xf2.v.f134900e.getClass();
        d0 key2 = xf2.v.f134901f;
        Intrinsics.checkNotNullParameter(key2, "key");
        p.k(this.f27708f, ((String) s0Var.f134897d.get(key2.f134856b)) != null ? new o0(s0Var, 4) : new o0(s0Var, 1), c0.d.T2(Severity.ERROR), "", false, null, 56);
        Iterator it2 = this.f27711i.iterator();
        while (it2.hasNext()) {
            e eVar = (e) ((k) it2.next()).getValue();
            if (eVar != null) {
                eVar.w(x13);
            }
        }
    }
}
