package bd;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import wo2.y;

/* loaded from: classes3.dex */
public final class j implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final List f22707a;

    /* renamed from: b, reason: collision with root package name */
    public final wo2.l f22708b;

    public j(ArrayList headers, y body) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(body, "body");
        this.f22708b = body;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f22708b.close();
    }
}
