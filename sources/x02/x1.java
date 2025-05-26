package x02;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class x1 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f131528a;

    public x1(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f131528a = context;
    }

    public final File a() {
        return new File(this.f131528a.getCacheDir(), "paged_list_cache");
    }
}
