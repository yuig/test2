package k92;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class a extends we0.a {

    /* renamed from: d, reason: collision with root package name */
    public Function0 f78866d;

    /* renamed from: e, reason: collision with root package name */
    public Function0 f78867e;

    /* renamed from: f, reason: collision with root package name */
    public Function0 f78868f;

    @Override // we0.a
    public final void b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Function0 function0 = this.f78867e;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // we0.a
    public final void c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Function0 function0 = this.f78868f;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
