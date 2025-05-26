package jf;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public String f75855a;

    /* renamed from: b, reason: collision with root package name */
    public String f75856b;

    /* renamed from: c, reason: collision with root package name */
    public Long f75857c;

    public a(String str) {
        Long valueOf = Long.valueOf(System.currentTimeMillis() / 1000);
        this.f75857c = valueOf;
        this.f75856b = str;
        StringBuffer stringBuffer = new StringBuffer("error_log_");
        stringBuffer.append(valueOf.longValue());
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(stringBuffer2, "StringBuffer()\n            .append(InstrumentUtility.ERROR_REPORT_PREFIX)\n            .append(timestamp as Long)\n            .append(\".json\")\n            .toString()");
        this.f75855a = stringBuffer2;
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long l13 = this.f75857c;
            if (l13 != null) {
                jSONObject.put("timestamp", l13);
            }
            jSONObject.put("error_message", this.f75856b);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return super.toString();
        }
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "params.toString()");
        return jSONObject2;
    }
}
