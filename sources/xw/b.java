package xw;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final iz1.a f136112a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f136113b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f136114c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f136115d;

    public b(iz1.a powerScoreManager) {
        Intrinsics.checkNotNullParameter(powerScoreManager, "powerScoreManager");
        this.f136112a = powerScoreManager;
    }

    public final void a(String str) {
        iz1.a aVar = this.f136112a;
        this.f136113b = aVar.b(str, "ras", false, false);
        this.f136114c = aVar.b(str, "ei", false, false);
        this.f136115d = aVar.b(str, "jscc", false, false);
    }
}
