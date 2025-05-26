package x02;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e extends h {

    /* renamed from: g, reason: collision with root package name */
    public final String f131341g;

    /* renamed from: h, reason: collision with root package name */
    public final String f131342h;

    /* renamed from: i, reason: collision with root package name */
    public final List f131343i;

    /* renamed from: j, reason: collision with root package name */
    public final String f131344j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f131345k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String parentModelId, String text, List textTags, String str, String str2, boolean z13) {
        super(textTags, str, null);
        Intrinsics.checkNotNullParameter(parentModelId, "parentModelId");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(textTags, "textTags");
        this.f131341g = parentModelId;
        this.f131342h = text;
        this.f131343i = textTags;
        this.f131344j = str2;
        this.f131345k = z13;
    }
}
