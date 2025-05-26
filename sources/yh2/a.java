package yh2;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final lh2.b f139052a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f139053b;

    public a(lh2.b logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f139052a = logger;
        this.f139053b = new CopyOnWriteArrayList();
    }
}
