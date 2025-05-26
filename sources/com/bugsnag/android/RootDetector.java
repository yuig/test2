package com.bugsnag.android;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/bugsnag/android/RootDetector;", "", "", "performNativeRootChecks", "()Z", "eb/d", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class RootDetector {

    /* renamed from: f, reason: collision with root package name */
    public static final File f29130f = new File("/system/build.prop");

    /* renamed from: g, reason: collision with root package name */
    public static final List f29131g = kotlin.collections.f0.j("/system/xbin/su", "/system/bin/su", "/system/app/Superuser.apk", "/system/app/SuperSU.apk", "/system/app/Superuser", "/system/app/SuperSU", "/system/xbin/daemonsu", "/su/bin");

    /* renamed from: a, reason: collision with root package name */
    public final i0 f29132a;

    /* renamed from: b, reason: collision with root package name */
    public final List f29133b;

    /* renamed from: c, reason: collision with root package name */
    public final File f29134c;

    /* renamed from: d, reason: collision with root package name */
    public final u1 f29135d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f29136e;

    public RootDetector(i0 i0Var, u1 u1Var) {
        List list = f29131g;
        File file = f29130f;
        this.f29132a = i0Var;
        this.f29133b = list;
        this.f29134c = file;
        this.f29135d = u1Var;
        try {
            System.loadLibrary("bugsnag-root-detection");
            this.f29136e = true;
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public static boolean b() {
        boolean z13;
        ProcessBuilder processBuilder = new ProcessBuilder(new String[0]);
        processBuilder.command(kotlin.collections.f0.j("which", "su"));
        Process process = null;
        try {
            Process start = processBuilder.start();
            try {
                Reader inputStreamReader = new InputStreamReader(start.getInputStream(), Charsets.UTF_8);
                BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
                while (true) {
                    try {
                        int read = bufferedReader.read();
                        if (read == -1) {
                            z13 = false;
                            break;
                        }
                        if (!CharsKt.c((char) read)) {
                            z13 = true;
                            break;
                        }
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            dl2.b.J(bufferedReader, th3);
                            throw th4;
                        }
                    }
                }
                dl2.b.J(bufferedReader, null);
                start.destroy();
                return z13;
            } catch (IOException unused) {
                process = start;
                if (process == null) {
                    return false;
                }
                process.destroy();
                return false;
            } catch (Throwable th5) {
                th = th5;
                process = start;
                if (process != null) {
                    process.destroy();
                }
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th6) {
            th = th6;
        }
    }

    private final native boolean performNativeRootChecks();

    public final boolean a() {
        boolean z13;
        try {
            xk2.q qVar = xk2.s.f135225b;
            Reader inputStreamReader = new InputStreamReader(new FileInputStream(this.f29134c), Charsets.UTF_8);
            BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
            try {
                Intrinsics.checkNotNullParameter(bufferedReader, "<this>");
                yn2.i j13 = yn2.c0.j(yn2.c0.p(yn2.x.d(new q5.y0(bufferedReader)), f1.f29216k), f1.f29217l);
                Intrinsics.checkNotNullParameter(j13, "<this>");
                Iterator it = j13.f139566a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z13 = false;
                        break;
                    }
                    if (((Boolean) j13.f139568c.invoke(it.next())).booleanValue() == j13.f139567b) {
                        z13 = true;
                        break;
                    }
                }
                boolean z14 = z13;
                dl2.b.J(bufferedReader, null);
                return z14;
            } finally {
            }
        } catch (Throwable th3) {
            xk2.q qVar2 = xk2.s.f135225b;
            ue.c.m(th3);
            return false;
        }
    }

    public final boolean c() {
        try {
            String str = this.f29132a.f29268g;
            if (str != null && StringsKt.E(str, "test-keys", false)) {
                return true;
            }
            if (!b() && !a()) {
                try {
                    xk2.q qVar = xk2.s.f135225b;
                    Iterator it = this.f29133b.iterator();
                    while (it.hasNext()) {
                        if (new File((String) it.next()).exists()) {
                            break;
                        }
                    }
                    Unit unit = Unit.f80348a;
                    xk2.q qVar2 = xk2.s.f135225b;
                } catch (Throwable th3) {
                    xk2.q qVar3 = xk2.s.f135225b;
                    ue.c.m(th3);
                }
                if (!this.f29136e) {
                    return false;
                }
                if (!performNativeRootChecks()) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th4) {
            this.f29135d.a("Root detection failed", th4);
            return false;
        }
    }
}
