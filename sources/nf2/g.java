package nf2;

import io.embrace.android.embracesdk.LogType;
import io.embrace.android.embracesdk.network.EmbraceNetworkRequest;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes4.dex */
public interface g extends l {
    boolean isAnrCaptureEnabled();

    boolean isNdkEnabled();

    boolean isNetworkSpanForwardingEnabled();

    void logComposeTap(Pair pair, String str);

    void logError(String str, Map map, String str2, boolean z13);

    void logHandledException(Throwable th3, LogType logType, Map map, StackTraceElement[] stackTraceElementArr);

    void logInfo(String str, Map map);

    void logInternalError(String str, String str2);

    void logInternalError(Throwable th3);

    void logTap(Pair pair, String str, th2.n nVar);

    void logWarning(String str, Map map, String str2);

    void recordCompletedNetworkRequest(String str, String str2, long j13, long j14, long j15, long j16, int i13, String str3, qh2.k kVar);

    void recordIncompleteNetworkRequest(String str, String str2, long j13, long j14, String str3, String str4, String str5, qh2.k kVar);

    void recordIncompleteNetworkRequest(String str, String str2, long j13, long j14, Throwable th3, String str3, qh2.k kVar);

    void recordNetworkRequest(EmbraceNetworkRequest embraceNetworkRequest);

    boolean shouldCaptureNetworkBody(String str, String str2);

    void stopSdk();
}
