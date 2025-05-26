package x02;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l0 extends j12.h {

    /* renamed from: d, reason: collision with root package name */
    public final String f131439d;

    /* renamed from: e, reason: collision with root package name */
    public final String f131440e;

    /* renamed from: f, reason: collision with root package name */
    public final String f131441f;

    /* renamed from: g, reason: collision with root package name */
    public final String f131442g;

    /* renamed from: h, reason: collision with root package name */
    public final List f131443h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(String uid, List selectAllExcludePinIds, String str, String destinationBoardId, String str2) {
        super(uid, 1);
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(destinationBoardId, "destinationBoardId");
        Intrinsics.checkNotNullParameter(selectAllExcludePinIds, "selectAllExcludePinIds");
        this.f131439d = uid;
        this.f131440e = str;
        this.f131441f = destinationBoardId;
        this.f131442g = str2;
        this.f131443h = selectAllExcludePinIds;
    }

    @Override // dl1.u
    public final String a() {
        return this.f131439d;
    }
}
