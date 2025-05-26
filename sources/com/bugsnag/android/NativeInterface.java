package com.bugsnag.android;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import com.bugsnag.android.repackaged.dslplatform.json.ConfigurationException;
import com.bugsnag.android.repackaged.dslplatform.json.SerializationException;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class NativeInterface {
    private static Charset UTF8Charset = Charset.defaultCharset();

    @SuppressLint({"StaticFieldLeak"})
    private static o client;

    public static void addMetadata(@NonNull String str, String str2, Object obj) {
        o client2 = getClient();
        client2.getClass();
        if (str == null || str2 == null) {
            client2.c("addMetadata");
            return;
        }
        y1 y1Var = client2.f29368b;
        y1Var.f29700a.a(str, str2, obj);
        y1Var.b(str, str2, obj);
    }

    public static void clearMetadata(@NonNull String str, String str2) {
        if (str2 == null) {
            o client2 = getClient();
            if (str == null) {
                client2.c("clearMetadata");
                return;
            }
            y1 y1Var = client2.f29368b;
            y1Var.f29700a.f29687a.remove(str);
            y1Var.a(str, null);
            return;
        }
        o client3 = getClient();
        client3.getClass();
        if (str == null) {
            client3.c("clearMetadata");
            return;
        }
        y1 y1Var2 = client3.f29368b;
        Map map = y1Var2.f29700a.f29687a;
        Map map2 = (Map) map.get(str);
        if (map2 != null) {
            map2.remove(str2);
        }
        if (map2 == null || map2.isEmpty()) {
            map.remove(str);
        }
        y1Var2.a(str, str2);
    }

    @NonNull
    public static x0 createEmptyEvent() {
        o client2 = getClient();
        return new x0(new z0(null, client2.f29367a, p2.a(null, "handledException", null), client2.f29368b.f29700a.c(), new k1()), client2.f29383q);
    }

    @NonNull
    public static x0 createEvent(Throwable th3, @NonNull o oVar, @NonNull p2 p2Var) {
        return new x0(th3, oVar.f29367a, p2Var, oVar.f29368b.f29700a, oVar.f29369c.f29285a, oVar.f29383q);
    }

    private static void deepMerge(Map<String, Object> map, Map<String, Object> map2) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            Object obj = map2.get(key);
            if ((value instanceof Map) && (obj instanceof Map)) {
                deepMerge((Map) value, (Map) obj);
            } else if ((value instanceof Collection) && (obj instanceof Collection)) {
                ((Collection) obj).addAll((Collection) value);
            } else {
                map2.put(key, value);
            }
        }
    }

    public static void deliverReport(byte[] bArr, @NonNull byte[] bArr2, byte[] bArr3, @NonNull String str, boolean z13) {
        int i13;
        BufferedWriter bufferedWriter = null;
        if (bArr3 != null) {
            com.bugsnag.android.repackaged.dslplatform.json.k kVar = hd.l.f68841a;
            Map a13 = hd.l.a(new ByteArrayInputStream(bArr2));
            deepMerge(hd.l.a(new ByteArrayInputStream(bArr3)), a13);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            com.bugsnag.android.repackaged.dslplatform.json.k kVar2 = hd.l.f68841a;
            kVar2.getClass();
            if (a13 == null) {
                byteArrayOutputStream.write(com.bugsnag.android.repackaged.dslplatform.json.k.f29526t);
            } else {
                com.bugsnag.android.repackaged.dslplatform.json.v vVar = (com.bugsnag.android.repackaged.dslplatform.json.v) kVar2.f29536j.get();
                vVar.f29593a = 0;
                vVar.f29594b = byteArrayOutputStream;
                Class<?> cls = a13.getClass();
                if (kVar2.m(vVar, cls, a13)) {
                    OutputStream outputStream = vVar.f29594b;
                    if (outputStream != null && (i13 = vVar.f29593a) != 0) {
                        try {
                            outputStream.write(vVar.f29595c, 0, i13);
                            vVar.f29593a = 0;
                        } catch (IOException e13) {
                            throw new SerializationException("Unable to write to target stream.", e13);
                        }
                    }
                    vVar.f29593a = 0;
                    vVar.f29594b = null;
                } else {
                    hd.f fVar = kVar2.f29527a;
                    if (fVar == null) {
                        throw new ConfigurationException(a.a.h("Unable to serialize provided object. Failed to find serializer for: ", cls));
                    }
                    byteArrayOutputStream.write(fVar.f68796a);
                }
            }
            bArr2 = byteArrayOutputStream.toByteArray();
        }
        String str2 = new String(bArr2, UTF8Charset);
        String str3 = bArr == null ? null : new String(bArr, UTF8Charset);
        o client2 = getClient();
        hd.h hVar = client2.f29367a;
        if (str3 == null || str3.length() == 0 || !hVar.c()) {
            g1 g1Var = client2.f29380n;
            g1Var.getClass();
            u1 u1Var = g1Var.f29238k;
            eb.d dVar = y0.f29694f;
            String a14 = eb.d.h(str2, str, g1Var.f29234g).a();
            if (a14 == null) {
                a14 = "";
            }
            if (z13) {
                a14 = a14.replace(".json", "startupcrash.json");
            }
            File file = g1Var.f29324a;
            if (g1Var.g(file)) {
                g1Var.c();
                ReentrantLock reentrantLock = g1Var.f29328e;
                reentrantLock.lock();
                String absolutePath = new File(file, a14).getAbsolutePath();
                try {
                    try {
                        BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(absolutePath), "UTF-8"));
                        try {
                            bufferedWriter2.write(str2);
                        } catch (Exception e14) {
                            e = e14;
                            bufferedWriter = bufferedWriter2;
                            File file2 = new File(absolutePath);
                            m1 m1Var = g1Var.f29327d;
                            if (m1Var != null) {
                                m1Var.a(e, file2, "NDK Crash report copy");
                            }
                            try {
                                if (!file2.delete()) {
                                    file2.deleteOnExit();
                                }
                            } catch (Exception e15) {
                                u1Var.a("Failed to delete file", e15);
                            }
                            if (bufferedWriter != null) {
                                try {
                                    bufferedWriter.close();
                                } catch (Exception e16) {
                                    e = e16;
                                    u1Var.a(Intrinsics.n(a14, "Failed to close unsent payload writer: "), e);
                                    reentrantLock.unlock();
                                }
                            }
                            reentrantLock.unlock();
                        } catch (Throwable th3) {
                            th = th3;
                            bufferedWriter = bufferedWriter2;
                            if (bufferedWriter != null) {
                                try {
                                    bufferedWriter.close();
                                } catch (Exception e17) {
                                    u1Var.a(Intrinsics.n(a14, "Failed to close unsent payload writer: "), e17);
                                }
                            }
                            reentrantLock.unlock();
                            throw th;
                        }
                        try {
                            bufferedWriter2.close();
                        } catch (Exception e18) {
                            e = e18;
                            u1Var.a(Intrinsics.n(a14, "Failed to close unsent payload writer: "), e);
                            reentrantLock.unlock();
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (Exception e19) {
                    e = e19;
                }
                reentrantLock.unlock();
            }
        }
    }

    @NonNull
    public static Map<String, Object> getApp() {
        HashMap hashMap = new HashMap();
        g gVar = getClient().f29377k;
        h a13 = gVar.a();
        hashMap.put("version", a13.f29199d);
        hashMap.put("releaseStage", a13.f29198c);
        hashMap.put("id", a13.f29197b);
        hashMap.put("type", a13.f29201f);
        id.c cVar = a13.f29203h;
        hashMap.put("buildUUID", cVar == null ? null : (String) cVar.a());
        hashMap.put("duration", a13.f29244i);
        hashMap.put("durationInForeground", a13.f29245j);
        hashMap.put("versionCode", a13.f29202g);
        hashMap.put("inForeground", a13.f29246k);
        hashMap.put("isLaunching", a13.f29247l);
        hashMap.put("binaryArch", a13.f29196a);
        hashMap.putAll(gVar.b());
        return hashMap;
    }

    public static String getAppVersion() {
        getClient().f29367a.getClass();
        return null;
    }

    @NonNull
    public static List<Breadcrumb> getBreadcrumbs() {
        return getClient().f29378l.copy();
    }

    @NonNull
    private static o getClient() {
        o oVar = client;
        if (oVar != null) {
            return oVar;
        }
        if (l.f29323b == null) {
            synchronized (l.f29322a) {
                try {
                    if (l.f29323b == null) {
                        throw new IllegalStateException("You must call Bugsnag.start before any other Bugsnag methods");
                    }
                } finally {
                }
            }
        }
        return l.f29323b;
    }

    public static String getContext() {
        v vVar = getClient().f29371e;
        String str = vVar.f29662b;
        if (str == "__BUGSNAG_MANUAL_CONTEXT__") {
            str = null;
        }
        return str == null ? vVar.f29661a : str;
    }

    @NonNull
    public static String[] getCpuAbi() {
        String[] strArr = getClient().f29376j.f29303d.f29270i;
        return strArr == null ? new String[0] : strArr;
    }

    public static j2 getCurrentSession() {
        j2 j2Var = getClient().f29381o.f29359g;
        if (j2Var == null || j2Var.f29298m.get()) {
            return null;
        }
        return j2Var;
    }

    @NonNull
    public static Map<String, Object> getDevice() {
        k0 k0Var = getClient().f29376j;
        HashMap hashMap = new HashMap(k0Var.c());
        s0 b13 = k0Var.b(new Date().getTime());
        hashMap.put("freeDisk", b13.f29629j);
        hashMap.put("freeMemory", b13.f29630k);
        hashMap.put("orientation", b13.f29631l);
        hashMap.put("time", b13.f29632m);
        hashMap.put("cpuAbi", b13.f29248a);
        hashMap.put("jailbroken", b13.f29249b);
        hashMap.put("id", b13.f29250c);
        hashMap.put("locale", b13.f29251d);
        hashMap.put("manufacturer", b13.f29253f);
        hashMap.put("model", b13.f29254g);
        hashMap.put("osName", "android");
        hashMap.put("osVersion", b13.f29255h);
        hashMap.put("runtimeVersions", b13.f29256i);
        hashMap.put("totalMemory", b13.f29252e);
        return hashMap;
    }

    public static Collection<String> getEnabledReleaseStages() {
        return getClient().f29367a.f68815g;
    }

    @NonNull
    public static String getEndpoint() {
        return getClient().f29367a.f68823o.f102691b;
    }

    public static q1 getLastRunInfo() {
        return getClient().f29389w;
    }

    @NonNull
    public static u1 getLogger() {
        return getClient().f29367a.f68826r;
    }

    @NonNull
    public static Map<String, Object> getMetadata() {
        return getClient().f29368b.f29700a.d();
    }

    @NonNull
    public static File getNativeReportPath() {
        return getNativeReportPath(getPersistenceDirectory());
    }

    @NonNull
    private static File getPersistenceDirectory() {
        return (File) getClient().f29367a.f68833y.getValue();
    }

    public static String getReleaseStage() {
        return getClient().f29367a.f68818j;
    }

    @NonNull
    public static String getSessionEndpoint() {
        return getClient().f29367a.f68823o.f102692c;
    }

    @NonNull
    public static Map<String, String> getUser() {
        HashMap hashMap = new HashMap();
        a4 a4Var = ((b4) getClient().f29373g.get()).f29171a;
        hashMap.put("id", a4Var.f29154a);
        hashMap.put("name", a4Var.f29156c);
        hashMap.put("email", a4Var.f29155b);
        return hashMap;
    }

    public static boolean isDiscardErrorClass(@NonNull String str) {
        Collection collection = getClient().f29367a.f68814f;
        if (collection.isEmpty()) {
            return false;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((Pattern) it.next()).matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    public static void leaveBreadcrumb(@NonNull String str, @NonNull BreadcrumbType breadcrumbType) {
        if (str == null) {
            return;
        }
        getClient().b(breadcrumbType, str, new HashMap());
    }

    public static void markLaunchCompleted() {
        getClient().f29391y.a();
    }

    public static void notify(@NonNull byte[] bArr, @NonNull byte[] bArr2, @NonNull Severity severity, @NonNull StackTraceElement[] stackTraceElementArr) {
        if (bArr == null || bArr2 == null || stackTraceElementArr == null) {
            return;
        }
        notify(new String(bArr, UTF8Charset), new String(bArr2, UTF8Charset), severity, stackTraceElementArr);
    }

    public static void pauseSession() {
        n2 n2Var = getClient().f29381o;
        j2 j2Var = n2Var.f29359g;
        if (j2Var != null) {
            j2Var.f29298m.set(true);
            n2Var.updateState(b3.f29170c);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v4 ??, still in use, count: 1, list:
          (r12v4 ?? I:com.bugsnag.android.j2) from 0x0040: INVOKE (r11v1 ?? I:com.bugsnag.android.n2), (r12v4 ?? I:com.bugsnag.android.j2) VIRTUAL call: com.bugsnag.android.n2.d(com.bugsnag.android.j2):void A[MD:(com.bugsnag.android.j2):void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public static void registerSession(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v4 ??, still in use, count: 1, list:
          (r12v4 ?? I:com.bugsnag.android.j2) from 0x0040: INVOKE (r11v1 ?? I:com.bugsnag.android.n2), (r12v4 ?? I:com.bugsnag.android.j2) VIRTUAL call: com.bugsnag.android.n2.d(com.bugsnag.android.j2):void A[MD:(com.bugsnag.android.j2):void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r11v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:79)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        */

    public static boolean resumeSession() {
        n2 n2Var = getClient().f29381o;
        j2 j2Var = n2Var.f29359g;
        boolean z13 = false;
        if (j2Var == null) {
            j2Var = n2Var.f(false) ? null : n2Var.g(new Date(), ((b4) n2Var.f29357e.f29373g.get()).f29171a, false);
        } else {
            z13 = j2Var.f29298m.compareAndSet(true, false);
        }
        if (j2Var != null) {
            n2Var.d(j2Var);
        }
        return z13;
    }

    public static void setAutoDetectAnrs(boolean z13) {
        o client2 = getClient();
        h2 h2Var = client2.f29387u.f29277e;
        if (z13) {
            if (h2Var == null) {
                return;
            }
            h2Var.load(client2);
        } else {
            if (h2Var == null) {
                return;
            }
            h2Var.unload();
        }
    }

    public static void setAutoNotify(boolean z13) {
        o client2 = getClient();
        i2 i2Var = client2.f29387u;
        h2 h2Var = i2Var.f29277e;
        if (z13) {
            if (h2Var != null) {
                h2Var.load(client2);
            }
        } else if (h2Var != null) {
            h2Var.unload();
        }
        h2 h2Var2 = i2Var.f29276d;
        if (z13) {
            if (h2Var2 != null) {
                h2Var2.load(client2);
            }
        } else if (h2Var2 != null) {
            h2Var2.unload();
        }
        h1 h1Var = client2.A;
        if (!z13) {
            Thread.setDefaultUncaughtExceptionHandler(h1Var.f29257a);
        } else {
            h1Var.getClass();
            Thread.setDefaultUncaughtExceptionHandler(h1Var);
        }
    }

    public static void setBinaryArch(@NonNull String str) {
        getClient().f29377k.f29227h = str;
    }

    public static void setClient(@NonNull o oVar) {
        client = oVar;
    }

    public static void setContext(String str) {
        v vVar = getClient().f29371e;
        vVar.f29661a = str;
        vVar.f29662b = "__BUGSNAG_MANUAL_CONTEXT__";
        vVar.a();
    }

    public static void setUser(String str, String str2, String str3) {
        getClient().g(str, str2, str3);
    }

    public static void startSession() {
        n2 n2Var = getClient().f29381o;
        if (n2Var.f(false)) {
            return;
        }
        n2Var.g(new Date(), ((b4) n2Var.f29357e.f29373g.get()).f29171a, false);
    }

    @NonNull
    private static File getNativeReportPath(@NonNull File file) {
        return new File(file, "bugsnag/native");
    }

    public static void leaveBreadcrumb(@NonNull byte[] bArr, @NonNull BreadcrumbType breadcrumbType) {
        if (bArr == null) {
            return;
        }
        getClient().b(breadcrumbType, new String(bArr, UTF8Charset), new HashMap());
    }

    public static void setUser(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        setUser(bArr == null ? null : new String(bArr, UTF8Charset), bArr2 == null ? null : new String(bArr2, UTF8Charset), bArr3 != null ? new String(bArr3, UTF8Charset) : null);
    }

    public static void leaveBreadcrumb(@NonNull String str, @NonNull String str2, @NonNull Map<String, Object> map) {
        getClient().b(BreadcrumbType.valueOf(str2.toUpperCase(Locale.US)), str, map);
    }

    public static void notify(@NonNull String str, @NonNull String str2, @NonNull Severity severity, @NonNull StackTraceElement[] stackTraceElementArr) {
        hd.h hVar = getClient().f29367a;
        if (hVar.c() || hVar.b(str)) {
            return;
        }
        RuntimeException runtimeException = new RuntimeException();
        runtimeException.setStackTrace(stackTraceElementArr);
        getClient().d(runtimeException, new z1(severity, str, str2));
    }

    public static void addMetadata(@NonNull String str, @NonNull Map<String, ?> map) {
        o client2 = getClient();
        client2.getClass();
        if (str != null && map != null) {
            y1 y1Var = client2.f29368b;
            x1 x1Var = y1Var.f29700a;
            x1Var.b(str, map);
            Iterator<T> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!y1Var.getObservers$bugsnag_android_core_release().isEmpty()) {
                    String str2 = (String) entry.getKey();
                    String str3 = (String) entry.getKey();
                    Map map2 = (Map) x1Var.f29687a.get(str);
                    v2 v2Var = new v2(str, str2, map2 == null ? null : map2.get(str3));
                    Iterator<T> it2 = y1Var.getObservers$bugsnag_android_core_release().iterator();
                    while (it2.hasNext()) {
                        ((hd.m) it2.next()).onStateChange(v2Var);
                    }
                }
            }
            return;
        }
        client2.c("addMetadata");
    }

    public static void notify(@NonNull byte[] bArr, @NonNull byte[] bArr2, @NonNull Severity severity, @NonNull NativeStackframe[] nativeStackframeArr) {
        if (bArr == null || bArr2 == null || nativeStackframeArr == null) {
            return;
        }
        notify(new String(bArr, UTF8Charset), new String(bArr2, UTF8Charset), severity, nativeStackframeArr);
    }

    public static void notify(@NonNull String str, @NonNull String str2, @NonNull Severity severity, @NonNull NativeStackframe[] nativeStackframeArr) {
        o client2 = getClient();
        hd.h hVar = client2.f29367a;
        if (hVar.c() || hVar.b(str)) {
            return;
        }
        x0 createEmptyEvent = createEmptyEvent();
        z0 z0Var = createEmptyEvent.f29685a;
        p2 p2Var = z0Var.f29716a;
        String str3 = p2Var.f29413a;
        boolean z13 = p2Var.f29418f;
        z0Var.f29716a = new p2(str3, severity, z13, z13 != p2Var.f29419g, p2Var.f29415c, p2Var.f29414b);
        ArrayList arrayList = new ArrayList(nativeStackframeArr.length);
        for (NativeStackframe nativeStackframe : nativeStackframeArr) {
            arrayList.add(new r2(nativeStackframe));
        }
        createEmptyEvent.f29685a.f29727l.add(new t0(new u0(str, str2, new s2(arrayList), ErrorType.C), client2.f29383q));
        getClient().f(createEmptyEvent, null);
    }

    public static void deliverReport(@NonNull File file) {
        g1 g1Var = getClient().f29380n;
        if (file.renameTo(new File(g1Var.f29324a, file.getName()))) {
            g1Var.k();
        } else {
            file.delete();
        }
    }
}
