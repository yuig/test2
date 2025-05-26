package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: d, reason: collision with root package name */
    public static final long f33807d = TimeUnit.DAYS.toMillis(7);

    /* renamed from: a, reason: collision with root package name */
    public final String f33808a;

    /* renamed from: b, reason: collision with root package name */
    public final String f33809b;

    /* renamed from: c, reason: collision with root package name */
    public final long f33810c;

    public r(long j13, String str, String str2) {
        this.f33808a = str;
        this.f33809b = str2;
        this.f33810c = j13;
    }

    public static String a(long j13, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j13);
            return jSONObject.toString();
        } catch (JSONException e13) {
            Log.w("FirebaseMessaging", "Failed to encode token: " + e13);
            return null;
        }
    }

    public static r b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new r(0L, str, null);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new r(jSONObject.getLong("timestamp"), jSONObject.getString("token"), jSONObject.getString("appVersion"));
        } catch (JSONException e13) {
            Log.w("FirebaseMessaging", "Failed to parse token: " + e13);
            return null;
        }
    }
}
