package yb2;

import android.content.Context;
import ek2.j;
import kotlin.jvm.internal.Intrinsics;
import mo1.d;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f138585a;

    /* renamed from: b, reason: collision with root package name */
    public final d f138586b;

    /* renamed from: c, reason: collision with root package name */
    public j f138587c;

    public c(Context context, d intentHelper) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intentHelper, "intentHelper");
        this.f138585a = context;
        this.f138586b = intentHelper;
    }

    public final boolean a() {
        Context context = this.f138585a;
        return dl2.b.P1(context, "com.pinterest.shuffles") || dl2.b.P1(context, "com.pinterest.shuffles.dev");
    }
}
