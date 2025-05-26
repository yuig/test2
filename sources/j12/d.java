package j12;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d extends g {

    /* renamed from: d, reason: collision with root package name */
    public final String f74414d;

    /* renamed from: e, reason: collision with root package name */
    public final String f74415e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String toSectionUid, String fromSectionUid) {
        super(toSectionUid);
        Intrinsics.checkNotNullParameter(toSectionUid, "toSectionUid");
        Intrinsics.checkNotNullParameter(fromSectionUid, "fromSectionUid");
        this.f74414d = toSectionUid;
        this.f74415e = fromSectionUid;
    }
}
