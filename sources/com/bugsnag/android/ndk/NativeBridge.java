package com.bugsnag.android.ndk;

import android.os.Build;
import android.util.JsonReader;
import com.airbnb.lottie.k;
import com.bugsnag.android.BreadcrumbType;
import com.bugsnag.android.NativeInterface;
import com.bugsnag.android.a0;
import com.bugsnag.android.a3;
import com.bugsnag.android.a4;
import com.bugsnag.android.b3;
import com.bugsnag.android.c3;
import com.bugsnag.android.d3;
import com.bugsnag.android.e3;
import com.bugsnag.android.f3;
import com.bugsnag.android.g3;
import com.bugsnag.android.h3;
import com.bugsnag.android.i3;
import com.bugsnag.android.j3;
import com.bugsnag.android.t2;
import com.bugsnag.android.u1;
import com.bugsnag.android.u2;
import com.bugsnag.android.v2;
import com.bugsnag.android.w2;
import com.bugsnag.android.x2;
import com.bugsnag.android.y2;
import com.bugsnag.android.z2;
import com.google.android.gms.internal.measurement.q4;
import dl2.b;
import hd.c;
import hd.m;
import hd.n;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import jd.a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.z;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u001e\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010n\u001a\u00020m¢\u0006\u0004\b}\u0010~J`\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0086 ¢\u0006\u0004\b\u0010\u0010\u0011J0\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0007H\u0086 ¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ(\u0010!\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0002H\u0086 ¢\u0006\u0004\b!\u0010\"J(\u0010$\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010 \u001a\u00020#H\u0086 ¢\u0006\u0004\b$\u0010%J(\u0010&\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\tH\u0086 ¢\u0006\u0004\b&\u0010'J(\u0010(\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0002H\u0086 ¢\u0006\u0004\b(\u0010\"J\u0010\u0010)\u001a\u00020\u000fH\u0086 ¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u000fH\u0086 ¢\u0006\u0004\b+\u0010*J\u0018\u0010,\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u0002H\u0086 ¢\u0006\u0004\b,\u0010-J \u0010.\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002H\u0086 ¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u000fH\u0086 ¢\u0006\u0004\b0\u0010*J\u0018\u00102\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\u0002H\u0086 ¢\u0006\u0004\b2\u0010-J \u00105\u001a\u00020\u000f2\u0006\u00103\u001a\u00020\t2\u0006\u00104\u001a\u00020\u0002H\u0086 ¢\u0006\u0004\b5\u00106J\u0018\u00108\u001a\u00020\u000f2\u0006\u00107\u001a\u00020\tH\u0086 ¢\u0006\u0004\b8\u00109J\u0018\u0010:\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007H\u0086 ¢\u0006\u0004\b:\u0010;J\u0018\u0010=\u001a\u00020\u000f2\u0006\u0010<\u001a\u00020\u0002H\u0086 ¢\u0006\u0004\b=\u0010-J\u0018\u0010?\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020\u0002H\u0086 ¢\u0006\u0004\b?\u0010-J\u0018\u0010@\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020\u0002H\u0086 ¢\u0006\u0004\b@\u0010-J\u0018\u0010A\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020\u0002H\u0086 ¢\u0006\u0004\bA\u0010-J\u0010\u0010C\u001a\u00020BH\u0086 ¢\u0006\u0004\bC\u0010DJ \u0010F\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020\t2\u0006\u0010E\u001a\u00020\u0002H\u0086 ¢\u0006\u0004\bF\u00106J\"\u0010H\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00022\b\u0010G\u001a\u0004\u0018\u00010\u0002H\u0086 ¢\u0006\u0004\bH\u0010/J\u0018\u0010I\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0002H\u0086 ¢\u0006\u0004\bI\u0010-J\u0010\u0010J\u001a\u00020\u000fH\u0086 ¢\u0006\u0004\bJ\u0010*J\u0010\u0010K\u001a\u00020\u000fH\u0086 ¢\u0006\u0004\bK\u0010*J$\u0010N\u001a\u00020\u000f2\u0012\u0010M\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070LH\u0086 ¢\u0006\u0004\bN\u0010OJ\u0018\u0010Q\u001a\u00020\u000f2\u0006\u0010P\u001a\u00020\u0002H\u0086 ¢\u0006\u0004\bQ\u0010-J\u0018\u0010R\u001a\u00020\u000f2\u0006\u0010P\u001a\u00020\u0002H\u0086 ¢\u0006\u0004\bR\u0010-J\u001e\u0010S\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010LH\u0086 ¢\u0006\u0004\bS\u0010TJ\u001e\u0010U\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010LH\u0086 ¢\u0006\u0004\bU\u0010TJ\u0018\u0010W\u001a\u00020\u000f2\u0006\u0010V\u001a\u00020\u0002H\u0086 ¢\u0006\u0004\bW\u0010-J\u0018\u0010Y\u001a\u00020\u000f2\u0006\u0010X\u001a\u00020\tH\u0086 ¢\u0006\u0004\bY\u00109J\u0017\u0010\\\u001a\u00020\u000f2\u0006\u0010[\u001a\u00020ZH\u0016¢\u0006\u0004\b\\\u0010]J0\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0082 ¢\u0006\u0004\b\u001d\u0010^J\u000f\u0010_\u001a\u00020\u000fH\u0002¢\u0006\u0004\b_\u0010*J\u0019\u0010a\u001a\u00020\t2\b\u0010`\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\ba\u0010bJ\u0017\u0010e\u001a\u00020\u000f2\u0006\u0010d\u001a\u00020cH\u0002¢\u0006\u0004\be\u0010fJ\u0017\u0010h\u001a\u00020\u000f2\u0006\u0010d\u001a\u00020gH\u0002¢\u0006\u0004\bh\u0010iJ\u0013\u0010k\u001a\u00020\u0007*\u00020jH\u0002¢\u0006\u0004\bk\u0010lR\u0014\u0010n\u001a\u00020m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010q\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010t\u001a\u00020s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u0014\u0010w\u001a\u00020v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u0014\u0010z\u001a\u00020y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{R\u0014\u0010\f\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010|¨\u0006\u007f"}, d2 = {"Lcom/bugsnag/android/ndk/NativeBridge;", "Lhd/m;", "", "apiKey", "reportingDirectory", "lastRunInfoPath", "eventUUID", "", "consecutiveLaunchCrashes", "", "autoDetectNdkCrashes", "apiLevel", "is32bit", "threadSendPolicy", "maxBreadcrumbs", "", "install", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZIZII)V", "sessionID", "key", "handledCount", "unhandledCount", "startedSession", "(Ljava/lang/String;Ljava/lang/String;II)V", "name", "type", "timestamp", "", "metadata", "addBreadcrumb", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "tab", "value", "addMetadataString", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "addMetadataDouble", "(Ljava/lang/String;Ljava/lang/String;D)V", "addMetadataBoolean", "(Ljava/lang/String;Ljava/lang/String;Z)V", "addMetadataOpaque", "addHandledEvent", "()V", "addUnhandledEvent", "clearMetadataTab", "(Ljava/lang/String;)V", "removeMetadata", "(Ljava/lang/String;Ljava/lang/String;)V", "pausedSession", "context", "updateContext", "inForeground", "activityName", "updateInForeground", "(ZLjava/lang/String;)V", "isLaunching", "updateIsLaunching", "(Z)V", "updateLastRunInfo", "(I)V", "orientation", "updateOrientation", "newValue", "updateUserId", "updateUserEmail", "updateUserName", "", "getSignalUnwindStackFunction", "()J", "memoryTrimLevelDescription", "updateLowMemory", "variant", "addFeatureFlag", "clearFeatureFlag", "clearFeatureFlags", "refreshSymbolTable", "", "counts", "initCallbackCounts", "(Ljava/util/Map;)V", "callback", "notifyAddCallback", "notifyRemoveCallback", "getCurrentCallbackSetCounts", "()Ljava/util/Map;", "getCurrentNativeApiCallUsage", "data", "setStaticJsonData", "enabled", "setInternalMetricsEnabled", "Lcom/bugsnag/android/j3;", "event", "onStateChange", "(Lcom/bugsnag/android/j3;)V", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Object;)V", "deliverPendingReports", "msg", "isInvalidMessage", "(Ljava/lang/Object;)Z", "Lcom/bugsnag/android/a3;", "arg", "handleInstallMessage", "(Lcom/bugsnag/android/a3;)V", "Lcom/bugsnag/android/v2;", "handleAddMetadata", "(Lcom/bugsnag/android/v2;)V", "Lcom/bugsnag/android/BreadcrumbType;", "toNativeValue", "(Lcom/bugsnag/android/BreadcrumbType;)I", "Lhd/c;", "bgTaskService", "Lhd/c;", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "installed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/io/File;", "reportDirectory", "Ljava/io/File;", "Lcom/bugsnag/android/u1;", "logger", "Lcom/bugsnag/android/u1;", "()Z", "<init>", "(Lhd/c;)V", "bugsnag-plugin-android-ndk_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class NativeBridge implements m {

    @NotNull
    private final c bgTaskService;

    @NotNull
    private final ReentrantLock lock = new ReentrantLock();

    @NotNull
    private final AtomicBoolean installed = new AtomicBoolean(false);

    @NotNull
    private final File reportDirectory = NativeInterface.getNativeReportPath();

    @NotNull
    private final u1 logger = NativeInterface.getLogger();

    public NativeBridge(@NotNull c cVar) {
        this.bgTaskService = cVar;
    }

    private final native void addBreadcrumb(String name, int type, String timestamp, Object metadata);

    private final void deliverPendingReports() {
        boolean z13;
        q4 q4Var = new q4(this.logger, 0);
        File[] listFiles = this.reportDirectory.listFiles();
        if (listFiles == null) {
            return;
        }
        int length = listFiles.length;
        int i13 = 0;
        while (i13 < length) {
            File file = listFiles[i13];
            i13++;
            if (z.h(file.getName(), ".json", false) && !z.h(file.getName(), ".static_data.json", false)) {
                try {
                    Reader inputStreamReader = new InputStreamReader(new FileInputStream(file), Charsets.UTF_8);
                    BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
                    try {
                        JsonReader jsonReader = new JsonReader(bufferedReader);
                        try {
                            z13 = q4Var.z(jsonReader);
                            b.J(jsonReader, null);
                            b.J(bufferedReader, null);
                        } finally {
                        }
                    } finally {
                    }
                } catch (Exception unused) {
                }
                if (!z13) {
                    NativeInterface.deliverReport(file);
                }
            }
            file.delete();
        }
    }

    private final void handleAddMetadata(v2 arg) {
        if (arg.f29668b != null) {
            Object r13 = a0.r(arg.f29669c);
            boolean z13 = r13 instanceof String;
            String str = arg.f29668b;
            String str2 = arg.f29667a;
            if (z13) {
                Intrinsics.f(str);
                addMetadataString(str2, str, (String) r13);
                return;
            }
            if (r13 instanceof Boolean) {
                Intrinsics.f(str);
                addMetadataBoolean(str2, str, ((Boolean) r13).booleanValue());
            } else if (r13 instanceof Number) {
                Intrinsics.f(str);
                addMetadataDouble(str2, str, ((Number) r13).doubleValue());
            } else if (r13 instanceof OpaqueValue) {
                Intrinsics.f(str);
                addMetadataOpaque(str2, str, ((OpaqueValue) r13).getJson());
            }
        }
    }

    private final void handleInstallMessage(a3 arg) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.installed.get()) {
                this.logger.f(Intrinsics.n(arg, "Received duplicate setup message with arg: "));
            } else {
                install(arg.f29147a, this.reportDirectory.getAbsolutePath(), arg.f29149c, UUID.randomUUID().toString(), arg.f29150d, arg.f29148b, Build.VERSION.SDK_INT, is32bit(), arg.f29151e.ordinal(), arg.f29152f);
                this.installed.set(true);
            }
            Unit unit = Unit.f80348a;
            reentrantLock.unlock();
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }

    private final boolean is32bit() {
        String[] cpuAbi = NativeInterface.getCpuAbi();
        int length = cpuAbi.length;
        boolean z13 = false;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                break;
            }
            String str = cpuAbi[i13];
            i13++;
            if (StringsKt.E(str, "64", false)) {
                z13 = true;
                break;
            }
        }
        return !z13;
    }

    private final boolean isInvalidMessage(Object msg) {
        if (msg == null || !(msg instanceof j3)) {
            return true;
        }
        if (this.installed.get() || (msg instanceof a3)) {
            return false;
        }
        this.logger.f(Intrinsics.n(msg, "Received message before INSTALL: "));
        return true;
    }

    private final int toNativeValue(BreadcrumbType breadcrumbType) {
        switch (a.f75478a[breadcrumbType.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void addBreadcrumb(@NotNull String name, @NotNull String type, @NotNull String timestamp, @NotNull Object metadata) {
        BreadcrumbType breadcrumbType;
        BreadcrumbType[] values = BreadcrumbType.values();
        int length = values.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                breadcrumbType = null;
                break;
            }
            breadcrumbType = values[i13];
            i13++;
            if (Intrinsics.d(breadcrumbType.getType(), type)) {
                break;
            }
        }
        if (breadcrumbType == null) {
            breadcrumbType = BreadcrumbType.MANUAL;
        }
        addBreadcrumb(name, toNativeValue(breadcrumbType), timestamp, metadata);
    }

    public final native void addFeatureFlag(@NotNull String name, String variant);

    public final native void addHandledEvent();

    public final native void addMetadataBoolean(@NotNull String tab, @NotNull String key, boolean value);

    public final native void addMetadataDouble(@NotNull String tab, @NotNull String key, double value);

    public final native void addMetadataOpaque(@NotNull String tab, @NotNull String key, @NotNull String value);

    public final native void addMetadataString(@NotNull String tab, @NotNull String key, @NotNull String value);

    public final native void addUnhandledEvent();

    public final native void clearFeatureFlag(@NotNull String name);

    public final native void clearFeatureFlags();

    public final native void clearMetadataTab(@NotNull String tab);

    public final native Map<String, Integer> getCurrentCallbackSetCounts();

    public final native Map<String, Boolean> getCurrentNativeApiCallUsage();

    public final native long getSignalUnwindStackFunction();

    public final native void initCallbackCounts(@NotNull Map<String, Integer> counts);

    public final native void install(@NotNull String apiKey, @NotNull String reportingDirectory, @NotNull String lastRunInfoPath, @NotNull String eventUUID, int consecutiveLaunchCrashes, boolean autoDetectNdkCrashes, int apiLevel, boolean is32bit, int threadSendPolicy, int maxBreadcrumbs);

    public final native void notifyAddCallback(@NotNull String callback);

    public final native void notifyRemoveCallback(@NotNull String callback);

    @Override // hd.m
    public void onStateChange(@NotNull j3 event) {
        if (isInvalidMessage(event)) {
            return;
        }
        if (event instanceof a3) {
            handleInstallMessage((a3) event);
            return;
        }
        if (event instanceof z2) {
            deliverPendingReports();
            return;
        }
        if (event instanceof v2) {
            handleAddMetadata((v2) event);
            return;
        }
        if (event instanceof x2) {
            clearMetadataTab(((x2) event).f29689a);
            return;
        }
        if (event instanceof y2) {
            y2 y2Var = (y2) event;
            String str = y2Var.f29701a;
            String str2 = y2Var.f29702b;
            removeMetadata(str, str2 != null ? str2 : "");
            return;
        }
        if (event instanceof t2) {
            t2 t2Var = (t2) event;
            addBreadcrumb(t2Var.f29644a, toNativeValue(t2Var.f29645b), t2Var.f29646c, t2Var.f29647d);
            return;
        }
        if (Intrinsics.d(event, b3.f29168a)) {
            addHandledEvent();
            return;
        }
        if (Intrinsics.d(event, b3.f29169b)) {
            addUnhandledEvent();
            return;
        }
        if (Intrinsics.d(event, b3.f29170c)) {
            pausedSession();
            return;
        }
        if (event instanceof c3) {
            c3 c3Var = (c3) event;
            startedSession(c3Var.f29180a, c3Var.f29181b, c3Var.f29182c, c3Var.f29183d);
            return;
        }
        if (event instanceof d3) {
            String str3 = ((d3) event).f29189a;
            updateContext(str3 != null ? str3 : "");
            return;
        }
        if (event instanceof e3) {
            e3 e3Var = (e3) event;
            boolean z13 = e3Var.f29213a;
            String str4 = e3Var.f29214b;
            updateInForeground(z13, str4 != null ? str4 : "");
            return;
        }
        if (event instanceof f3) {
            ((f3) event).getClass();
            updateIsLaunching(false);
            this.bgTaskService.b(n.DEFAULT, new k(this, 6));
            return;
        }
        if (event instanceof h3) {
            String str5 = ((h3) event).f29261a;
            updateOrientation(str5 != null ? str5 : "");
            return;
        }
        if (!(event instanceof i3)) {
            if (event instanceof g3) {
                g3 g3Var = (g3) event;
                updateLowMemory(g3Var.f29242a, g3Var.f29243b);
                return;
            } else if (event instanceof u2) {
                u2 u2Var = (u2) event;
                addFeatureFlag(u2Var.f29659a, u2Var.f29660b);
                return;
            } else {
                if (event instanceof w2) {
                    clearFeatureFlags();
                    return;
                }
                return;
            }
        }
        i3 i3Var = (i3) event;
        String str6 = i3Var.f29278a.f29154a;
        if (str6 == null) {
            str6 = "";
        }
        updateUserId(str6);
        a4 a4Var = i3Var.f29278a;
        String str7 = a4Var.f29156c;
        if (str7 == null) {
            str7 = "";
        }
        updateUserName(str7);
        String str8 = a4Var.f29155b;
        updateUserEmail(str8 != null ? str8 : "");
    }

    public final native void pausedSession();

    public final native void refreshSymbolTable();

    public final native void removeMetadata(@NotNull String tab, @NotNull String key);

    public final native void setInternalMetricsEnabled(boolean enabled);

    public final native void setStaticJsonData(@NotNull String data);

    public final native void startedSession(@NotNull String sessionID, @NotNull String key, int handledCount, int unhandledCount);

    public final native void updateContext(@NotNull String context);

    public final native void updateInForeground(boolean inForeground, @NotNull String activityName);

    public final native void updateIsLaunching(boolean isLaunching);

    public final native void updateLastRunInfo(int consecutiveLaunchCrashes);

    public final native void updateLowMemory(boolean newValue, @NotNull String memoryTrimLevelDescription);

    public final native void updateOrientation(@NotNull String orientation);

    public final native void updateUserEmail(@NotNull String newValue);

    public final native void updateUserId(@NotNull String newValue);

    public final native void updateUserName(@NotNull String newValue);
}
