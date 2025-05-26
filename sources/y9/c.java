package y9;

import android.view.Choreographer;
import android.view.ViewTreeObserver;
import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class c implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f138091a = 0;

    static {
        Field declaredField = Choreographer.class.getDeclaredField("mLastFrameTimeNanos");
        Intrinsics.checkNotNullExpressionValue(declaredField, "Choreographer::class.jav…ld(\"mLastFrameTimeNanos\")");
        declaredField.setAccessible(true);
    }
}
