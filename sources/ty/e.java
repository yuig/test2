package ty;

import ey.b2;
import h32.a4;
import h32.d4;
import kotlin.jvm.internal.Intrinsics;
import oy.r0;

/* loaded from: classes.dex */
public final class e extends r0 implements b2 {

    /* renamed from: f, reason: collision with root package name */
    public final String f119696f;

    /* renamed from: g, reason: collision with root package name */
    public final d4 f119697g;

    /* renamed from: h, reason: collision with root package name */
    public final a4 f119698h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f119699i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a4 a4Var, d4 d4Var, String pinUid, String videoURL, boolean z13) {
        super(pinUid, 1, 0);
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(videoURL, "videoURL");
        this.f119696f = videoURL;
        this.f119697g = d4Var;
        this.f119698h = a4Var;
        this.f119699i = z13;
    }

    public final boolean m() {
        return this.f119699i;
    }

    public final String n() {
        return this.f119696f;
    }

    public final a4 o() {
        return this.f119698h;
    }

    public final d4 p() {
        return this.f119697g;
    }
}
