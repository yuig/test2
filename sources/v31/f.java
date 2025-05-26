package v31;

import a.cb;
import dl1.s;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class f implements s {

    /* renamed from: a, reason: collision with root package name */
    public final b f123966a;

    /* renamed from: b, reason: collision with root package name */
    public final String f123967b;

    public f(@NotNull b displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        this.f123966a = displayState;
        this.f123967b = cb.g("toString(...)");
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        return this.f123967b;
    }
}
