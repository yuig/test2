package x02;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f extends h {

    /* renamed from: g, reason: collision with root package name */
    public final String f131349g;

    /* renamed from: h, reason: collision with root package name */
    public final String f131350h;

    /* renamed from: i, reason: collision with root package name */
    public final List f131351i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f131352j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String parentModelId, String text, String str, String str2, List textTags, boolean z13) {
        super(textTags, str, str2);
        Intrinsics.checkNotNullParameter(parentModelId, "parentModelId");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(textTags, "textTags");
        this.f131349g = parentModelId;
        this.f131350h = text;
        this.f131351i = textTags;
        this.f131352j = z13;
    }
}
