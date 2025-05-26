package py;

import ey.b2;
import h32.d4;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f extends d implements b2 {

    /* renamed from: d, reason: collision with root package name */
    public final d4 f101722d;

    /* renamed from: e, reason: collision with root package name */
    public final int f101723e;

    /* renamed from: f, reason: collision with root package name */
    public final q92.c f101724f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String pinUid, d4 viewType, int i13, q92.c imageType) {
        super(pinUid);
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        Intrinsics.checkNotNullParameter(imageType, "imageType");
        this.f101722d = viewType;
        this.f101723e = i13;
        this.f101724f = imageType;
    }
}
