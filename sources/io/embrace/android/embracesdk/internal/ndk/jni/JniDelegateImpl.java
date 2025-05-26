package io.embrace.android.embracesdk.internal.ndk.jni;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\u0018\u0000B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJF\u0010\u000b\u001a\u00020\n2\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0096 ¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096 ¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0012\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0096 ¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096 ¢\u0006\u0004\b\u0014\u0010\u000fJ\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0015\u001a\u00020\u0001H\u0096 ¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u0096 ¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0007H\u0096 ¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lio/embrace/android/embracesdk/internal/ndk/jni/JniDelegateImpl;", "", "markerFilePath", "appState", "reportId", "", "apiLevel", "", "is32bit", "devLogging", "", "installSignalHandlers", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZZ)V", "metadata", "updateMetaData", "(Ljava/lang/String;)V", "sessionId", "reportPath", "onSessionChange", "(Ljava/lang/String;Ljava/lang/String;)V", "updateAppState", "path", "getCrashReport", "(Ljava/lang/String;)Ljava/lang/String;", "checkForOverwrittenHandlers", "()Ljava/lang/String;", "reinstallSignalHandlers", "()Z", "<init>", "()V", "embrace-android-core_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class JniDelegateImpl {
    public native String checkForOverwrittenHandlers();

    public native String getCrashReport(@NotNull String path);

    public native void installSignalHandlers(String markerFilePath, String appState, String reportId, int apiLevel, boolean is32bit, boolean devLogging);

    public native void onSessionChange(@NotNull String sessionId, @NotNull String reportPath);

    public native boolean reinstallSignalHandlers();

    public native void updateAppState(String appState);

    public native void updateMetaData(String metadata);
}
