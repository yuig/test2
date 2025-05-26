package x02;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f0 extends dl1.u {

    /* renamed from: d, reason: collision with root package name */
    public final String f131353d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f131354e;

    /* renamed from: f, reason: collision with root package name */
    public final z42.f f131355f;

    /* renamed from: g, reason: collision with root package name */
    public final String f131356g;

    /* renamed from: h, reason: collision with root package name */
    public final String f131357h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f131358i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f131359j;

    /* renamed from: k, reason: collision with root package name */
    public final z42.c f131360k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(String boardName, boolean z13, z42.f boardLayout, z42.c cVar) {
        super("n/a");
        Intrinsics.checkNotNullParameter(boardName, "boardName");
        Intrinsics.checkNotNullParameter(boardLayout, "boardLayout");
        Intrinsics.checkNotNullParameter("", "description");
        this.f131353d = boardName;
        this.f131354e = z13;
        this.f131355f = boardLayout;
        this.f131356g = null;
        this.f131357h = "";
        this.f131358i = true;
        this.f131359j = false;
        this.f131360k = cVar;
    }
}
