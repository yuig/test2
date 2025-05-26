package yk1;

import android.content.Intent;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g implements m {

    /* renamed from: a, reason: collision with root package name */
    public boolean f139227a;

    @Override // yk1.m
    public final void activate() {
    }

    @Override // yk1.m
    public final void activityResult(int i13, int i14, Intent intent) {
    }

    @Override // yk1.m
    public final void bind(n view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f139227a = true;
    }

    @Override // yk1.m
    public final void create() {
    }

    @Override // yk1.m
    public final void deactivate() {
    }

    @Override // yk1.m
    public final void destroy() {
    }

    @Override // yk1.m
    public final boolean isBound() {
        return this.f139227a;
    }

    @Override // yk1.m
    public final void restore() {
    }

    @Override // yk1.m
    public final void restoreInstanceState(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
    }

    @Override // yk1.m
    public final void saveInstanceState(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
    }

    @Override // yk1.m
    public final void unbind() {
        this.f139227a = false;
    }
}
