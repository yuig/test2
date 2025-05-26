package ey;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v0 extends z1 {

    /* renamed from: e, reason: collision with root package name */
    public final s4 f60592e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(String pinUid, s4 dataLoadedFrom) {
        super(pinUid);
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(dataLoadedFrom, "dataLoadedFrom");
        this.f60592e = dataLoadedFrom;
    }

    @Override // ey.u1
    public final String e() {
        return "idea_pin_data_loaded_from";
    }
}
