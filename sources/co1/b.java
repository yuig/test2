package co1;

import java.text.SimpleDateFormat;
import kotlin.jvm.internal.Intrinsics;
import pb0.d;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final d f28286a;

    /* renamed from: b, reason: collision with root package name */
    public final SimpleDateFormat f28287b;

    public b(d formatter) {
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        this.f28286a = formatter;
        this.f28287b = new SimpleDateFormat("MM/yy");
    }
}
