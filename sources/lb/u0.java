package lb;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Base64;
import android.util.Log;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.zip.GZIPOutputStream;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;

/* loaded from: classes.dex */
public final /* synthetic */ class u0 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82670a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f82671b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f82672c;

    public /* synthetic */ u0(int i13, Object obj, Object obj2) {
        this.f82670a = i13;
        this.f82671b = obj;
        this.f82672c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ServiceInfo serviceInfo;
        String str;
        int i13;
        ComponentName startService;
        dl1.q qVar;
        boolean z13 = true;
        boolean z14 = false;
        String str2 = null;
        switch (this.f82670a) {
            case 0:
                t0 t0Var = (t0) this.f82671b;
                a1 a1Var = (a1) this.f82672c;
                if (t0Var instanceof r0) {
                    kb.z zVar = ((r0) t0Var).f82666a;
                    tb.y yVar = a1Var.f82567j;
                    String str3 = a1Var.f82560c;
                    kb.s0 i14 = yVar.i(str3);
                    a1Var.f82566i.x().a(str3);
                    if (i14 != null) {
                        if (i14 == kb.s0.RUNNING) {
                            boolean z15 = zVar instanceof kb.y;
                            tb.s sVar = a1Var.f82558a;
                            String str4 = a1Var.f82570m;
                            if (z15) {
                                String str5 = b1.f82583a;
                                kb.b0.e().f(str5, "Worker result SUCCESS for " + str4);
                                if (sVar.f()) {
                                    a1Var.e();
                                } else {
                                    yVar.p(kb.s0.SUCCEEDED, str3);
                                    Intrinsics.g(zVar, "null cannot be cast to non-null type androidx.work.ListenableWorker.Result.Success");
                                    kb.l lVar = ((kb.y) zVar).f79053a;
                                    Intrinsics.checkNotNullExpressionValue(lVar, "success.outputData");
                                    yVar.o(lVar, str3);
                                    a1Var.f82564g.getClass();
                                    long currentTimeMillis = System.currentTimeMillis();
                                    tb.c cVar = a1Var.f82568k;
                                    Iterator it = cVar.e(str3).iterator();
                                    while (it.hasNext()) {
                                        String str6 = (String) it.next();
                                        if (yVar.i(str6) == kb.s0.BLOCKED && cVar.g(str6)) {
                                            kb.b0.e().f(b1.f82583a, "Setting status to enqueued for ".concat(str6));
                                            yVar.p(kb.s0.ENQUEUED, str6);
                                            yVar.n(currentTimeMillis, str6);
                                        }
                                    }
                                }
                            } else if (zVar instanceof kb.x) {
                                String str7 = b1.f82583a;
                                kb.b0.e().f(str7, "Worker result RETRY for " + str4);
                                a1Var.d(-256);
                                z14 = z13;
                            } else {
                                String str8 = b1.f82583a;
                                kb.b0.e().f(str8, "Worker result FAILURE for " + str4);
                                if (sVar.f()) {
                                    a1Var.e();
                                } else {
                                    if (zVar == null) {
                                        zVar = new kb.w();
                                    }
                                    a1Var.f(zVar);
                                }
                            }
                        } else if (!i14.isFinished()) {
                            a1Var.d(-512);
                            z14 = z13;
                        }
                    }
                    z13 = false;
                    z14 = z13;
                } else if (t0Var instanceof q0) {
                    a1Var.f(((q0) t0Var).f82661a);
                } else {
                    if (!(t0Var instanceof s0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z14 = a1.a(a1Var, ((s0) t0Var).f82668a);
                }
                return Boolean.valueOf(z14);
            case 1:
                mc.i this$0 = (mc.i) this.f82671b;
                String uncompressedFieldset = (String) this.f82672c;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(uncompressedFieldset, "$uncompressedFieldset");
                this$0.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                Charset UTF_8 = StandardCharsets.UTF_8;
                Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                Writer outputStreamWriter = new OutputStreamWriter(gZIPOutputStream, UTF_8);
                BufferedWriter bufferedWriter = outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, 8192);
                try {
                    bufferedWriter.write(uncompressedFieldset);
                    bufferedWriter.close();
                    Unit unit = Unit.f80348a;
                    dl2.b.J(bufferedWriter, null);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    String compressedFieldset = Base64.encodeToString(byteArray, 2);
                    Intrinsics.checkNotNullExpressionValue(compressedFieldset, "encodeToString(...)");
                    Intrinsics.checkNotNullParameter(compressedFieldset, "compressedFieldset");
                    return new mc.c(compressedFieldset);
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        dl2.b.J(bufferedWriter, th3);
                        throw th4;
                    }
                }
            case 2:
                tb.c this$02 = (tb.c) this.f82671b;
                Callable callable = (Callable) this.f82672c;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(callable, "$callable");
                try {
                    this$02.f116959a = callable.call();
                    return null;
                } finally {
                    CountDownLatch countDownLatch = (CountDownLatch) this$02.f116960b;
                    if (countDownLatch != null) {
                        countDownLatch.countDown();
                    }
                }
            case 3:
                Context context = (Context) this.f82671b;
                Intent intent = (Intent) this.f82672c;
                Object obj = com.google.firebase.messaging.h.f33780c;
                com.google.firebase.messaging.q n13 = com.google.firebase.messaging.q.n();
                n13.getClass();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                ((Queue) n13.f33806d).offer(intent);
                Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent2.setPackage(context.getPackageName());
                synchronized (n13) {
                    try {
                        Object obj2 = n13.f33803a;
                        if (((String) obj2) != null) {
                            str2 = (String) obj2;
                        } else {
                            ResolveInfo resolveService = context.getPackageManager().resolveService(intent2, 0);
                            if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
                                if (context.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                                    if (str.startsWith(".")) {
                                        n13.f33803a = context.getPackageName() + serviceInfo.name;
                                    } else {
                                        n13.f33803a = serviceInfo.name;
                                    }
                                    str2 = (String) n13.f33803a;
                                }
                                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                            }
                            Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                        }
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
                if (str2 != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(str2));
                    }
                    intent2.setClassName(context.getPackageName(), str2);
                }
                try {
                    if (n13.p(context)) {
                        startService = com.google.firebase.messaging.b0.c(context, intent2);
                    } else {
                        startService = context.startService(intent2);
                        Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                    }
                    if (startService == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i13 = 404;
                    } else {
                        i13 = -1;
                    }
                } catch (IllegalStateException e13) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e13);
                    i13 = 402;
                } catch (SecurityException e14) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e14);
                    i13 = 401;
                }
                return Integer.valueOf(i13);
            case 4:
                p10.m this$03 = (p10.m) this.f82671b;
                dl1.u params = (dl1.u) this.f82672c;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(params, "$params");
                return this$03.f98630a.d(params);
            case 5:
                ResponseBody body = (ResponseBody) this.f82671b;
                y20.a this$04 = (y20.a) this.f82672c;
                Intrinsics.checkNotNullParameter(body, "$body");
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                InputStream byteStream = body.byteStream();
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(byteStream));
                    try {
                        ((x92.c) this$04.f136682b).a(bufferedReader);
                        Unit unit2 = Unit.f80348a;
                        dl2.b.J(bufferedReader, null);
                        dl2.b.J(byteStream, null);
                        return Unit.f80348a;
                    } finally {
                    }
                } catch (Throwable th6) {
                    try {
                        throw th6;
                    } catch (Throwable th7) {
                        dl2.b.J(byteStream, th6);
                        throw th7;
                    }
                }
            case 6:
                dl1.r rVar = (dl1.r) this.f82671b;
                dl1.m mVar = (dl1.m) this.f82672c;
                synchronized (rVar.f55284a) {
                    try {
                        qVar = (dl1.q) rVar.f55284a.get(mVar);
                        if (qVar != null) {
                            if (dl1.q.a(qVar)) {
                                rVar.f55284a.remove(mVar);
                            }
                        }
                        z13 = false;
                    } finally {
                    }
                }
                return z13 ? uj2.q.y(qVar) : jk2.h0.f76488a;
            default:
                dl1.q0 this$05 = (dl1.q0) this.f82671b;
                dl1.m modelKey = (dl1.m) this.f82672c;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                Intrinsics.checkNotNullParameter(modelKey, "$modelKey");
                dl1.s e15 = this$05.f55268a.e(modelKey);
                return e15 != null ? uj2.q.y(e15) : jk2.h0.f76488a;
        }
    }
}
