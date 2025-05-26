package x02;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g0 extends j12.h {

    /* renamed from: d, reason: collision with root package name */
    public final String f131383d;

    /* renamed from: e, reason: collision with root package name */
    public final String f131384e;

    /* renamed from: f, reason: collision with root package name */
    public final List f131385f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(String uid, String str, List list) {
        super(uid, 0);
        Intrinsics.checkNotNullParameter(uid, "uid");
        this.f131383d = uid;
        this.f131384e = str;
        this.f131385f = list;
    }

    @Override // dl1.u
    public final String a() {
        return this.f131383d;
    }
}
