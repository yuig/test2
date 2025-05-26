package hb;

import android.app.Activity;
import eb.p;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import l0.v;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Activity f68503a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f68504b;

    /* renamed from: c, reason: collision with root package name */
    public final p5.a f68505c;

    /* renamed from: d, reason: collision with root package name */
    public p f68506d;

    public m(Activity activity, u5.j executor, v callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f68503a = activity;
        this.f68504b = executor;
        this.f68505c = callback;
    }
}
