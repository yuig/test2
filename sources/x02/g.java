package x02;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g extends h {

    /* renamed from: g, reason: collision with root package name */
    public final String f131378g;

    /* renamed from: h, reason: collision with root package name */
    public final String f131379h;

    /* renamed from: i, reason: collision with root package name */
    public final List f131380i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f131381j;

    /* renamed from: k, reason: collision with root package name */
    public final d f131382k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String parentModelId, String pinId, String str, List textTags, boolean z13, d dVar, String str2) {
        super(textTags, pinId, str2);
        Intrinsics.checkNotNullParameter(parentModelId, "parentModelId");
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(textTags, "textTags");
        this.f131378g = parentModelId;
        this.f131379h = str;
        this.f131380i = textTags;
        this.f131381j = z13;
        this.f131382k = dVar;
    }
}
