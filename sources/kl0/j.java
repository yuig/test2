package kl0;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class j extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public static final j f80096i = new j(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new Handler(Looper.getMainLooper());
    }
}
