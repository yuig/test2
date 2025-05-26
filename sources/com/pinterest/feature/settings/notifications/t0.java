package com.pinterest.feature.settings.notifications;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t0 implements l82.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f48267a;

    /* renamed from: b, reason: collision with root package name */
    public final o82.j0 f48268b;

    public t0(String id3, o82.j0 multiSectionVMState) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(multiSectionVMState, "multiSectionVMState");
        this.f48267a = id3;
        this.f48268b = multiSectionVMState;
    }

    public static t0 b(t0 t0Var, o82.j0 multiSectionVMState) {
        String id3 = t0Var.f48267a;
        t0Var.getClass();
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(multiSectionVMState, "multiSectionVMState");
        return new t0(id3, multiSectionVMState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return Intrinsics.d(this.f48267a, t0Var.f48267a) && Intrinsics.d(this.f48268b, t0Var.f48268b);
    }

    public final int hashCode() {
        return this.f48268b.f93634a.hashCode() + (this.f48267a.hashCode() * 31);
    }

    public final String toString() {
        return "NotificationsSettingsVMState(id=" + this.f48267a + ", multiSectionVMState=" + this.f48268b + ")";
    }
}
