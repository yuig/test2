package com.linecorp.linesdk.auth.internal;

import android.text.TextUtils;
import com.linecorp.linesdk.LineApiError;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f34091a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f34092b;

    /* renamed from: c, reason: collision with root package name */
    public final String f34093c;

    /* renamed from: d, reason: collision with root package name */
    public final String f34094d;

    /* renamed from: e, reason: collision with root package name */
    public final String f34095e;

    public a(String str, Boolean bool, String str2, String str3, String str4) {
        this.f34091a = str;
        this.f34092b = bool;
        this.f34093c = str2;
        this.f34094d = str3;
        this.f34095e = str4;
    }

    public final LineApiError a() {
        String str = this.f34095e;
        if (!TextUtils.isEmpty(str) || (!TextUtils.isEmpty(this.f34091a))) {
            return new LineApiError(str);
        }
        try {
            return new LineApiError(new JSONObject().putOpt("error", this.f34093c).putOpt("error_description", this.f34094d).toString());
        } catch (JSONException e13) {
            return new LineApiError(e13);
        }
    }
}
