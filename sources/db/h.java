package db;

import android.util.Log;
import androidx.window.core.WindowStrictModeException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.c0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class h extends j {

    /* renamed from: a, reason: collision with root package name */
    public final Object f54273a;

    /* renamed from: b, reason: collision with root package name */
    public final String f54274b;

    /* renamed from: c, reason: collision with root package name */
    public final String f54275c;

    /* renamed from: d, reason: collision with root package name */
    public final i f54276d;

    /* renamed from: e, reason: collision with root package name */
    public final l f54277e;

    /* renamed from: f, reason: collision with root package name */
    public final WindowStrictModeException f54278f;

    public h(Object value, String tag, String message, i logger, l verificationMode) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(verificationMode, "verificationMode");
        this.f54273a = value;
        this.f54274b = tag;
        this.f54275c = message;
        this.f54276d = logger;
        this.f54277e = verificationMode;
        String message2 = j.b(value, message);
        Intrinsics.checkNotNullParameter(message2, "message");
        WindowStrictModeException windowStrictModeException = new WindowStrictModeException(message2);
        StackTraceElement[] stackTrace = windowStrictModeException.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "stackTrace");
        windowStrictModeException.setStackTrace((StackTraceElement[]) c0.z(2, stackTrace).toArray(new StackTraceElement[0]));
        this.f54278f = windowStrictModeException;
    }

    @Override // db.j
    public final Object a() {
        int i13 = g.f54272a[this.f54277e.ordinal()];
        if (i13 == 1) {
            throw this.f54278f;
        }
        if (i13 != 2) {
            if (i13 == 3) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        String message = j.b(this.f54273a, this.f54275c);
        ((a) this.f54276d).getClass();
        String tag = this.f54274b;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Log.d(tag, message);
        return null;
    }

    @Override // db.j
    public final j c(String message, Function1 condition) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(condition, "condition");
        return this;
    }
}
