package rf2;

import android.app.Activity;
import io.embrace.android.embracesdk.spans.ErrorCode;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public interface a {
    void addLoadTraceChildSpan(Activity activity, String str, long j13, long j14, Map map, List list, ErrorCode errorCode);

    void addStartupTraceChildSpan(String str, long j13, long j14, Map map, List list, ErrorCode errorCode);
}
