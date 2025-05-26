package com.facebook;

import df.y;
import java.util.Random;
import kotlin.Metadata;
import le.v;
import org.json.JSONException;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0005B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/facebook/FacebookException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "<init>", "()V", "com/bugsnag/android/a0", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public class FacebookException extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f29901a = 0;

    public FacebookException() {
    }

    @Override // java.lang.Throwable
    public String toString() {
        String message = getMessage();
        return message == null ? "" : message;
    }

    public FacebookException(String str) {
        super(str);
        Random random = new Random();
        if (str == null || !v.f83119p.get() || random.nextInt(100) <= 50) {
            return;
        }
        y yVar = y.f54881a;
        y.a(new a8.v(str, 10), df.v.ErrorReport);
    }

    public FacebookException(JSONException jSONException) {
        super("An error occurred while preparing deferred app link", jSONException);
    }
}
