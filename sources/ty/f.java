package ty;

import kotlin.jvm.internal.Intrinsics;
import oy.r0;

/* loaded from: classes.dex */
public final class f extends r0 {

    /* renamed from: f, reason: collision with root package name */
    public final boolean f119700f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f119701g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Integer num, String pinUid, boolean z13) {
        super(pinUid, 1, 0);
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        this.f119700f = z13;
        this.f119701g = num;
    }

    public final Integer m() {
        return this.f119701g;
    }

    public final boolean n() {
        return this.f119700f;
    }
}
