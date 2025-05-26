package nf2;

import io.embrace.android.embracesdk.spans.ErrorCode;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public interface l {
    boolean addSpanAttribute(String str, String str2, String str3);

    boolean addSpanEvent(String str, String str2, Long l13, Map map);

    boolean recordCompletedSpan(String str, long j13, long j14, ErrorCode errorCode, String str2, Map map, List list);

    Object recordSpan(String str, String str2, Map map, List list, Function0 function0);

    String startSpan(String str, String str2, Long l13);

    boolean stopSpan(String str, ErrorCode errorCode, Long l13);
}
