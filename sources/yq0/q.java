package yq0;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class q extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public static final q f139723i = new q(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new Handler(Looper.getMainLooper());
    }
}
