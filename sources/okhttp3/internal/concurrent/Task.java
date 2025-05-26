package okhttp3.internal.concurrent;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/concurrent/Task;", "", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public abstract class Task {

    /* renamed from: a, reason: collision with root package name */
    public final String f95840a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f95841b;

    /* renamed from: c, reason: collision with root package name */
    public TaskQueue f95842c;

    /* renamed from: d, reason: collision with root package name */
    public long f95843d;

    public Task(String name, boolean z13) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f95840a = name;
        this.f95841b = z13;
        this.f95843d = -1L;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getF95841b() {
        return this.f95841b;
    }

    public abstract long b();

    /* renamed from: toString, reason: from getter */
    public final String getF95840a() {
        return this.f95840a;
    }
}
