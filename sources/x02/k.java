package x02;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k extends q {

    /* renamed from: e, reason: collision with root package name */
    public final String f131424e;

    /* renamed from: f, reason: collision with root package name */
    public final String f131425f;

    /* renamed from: g, reason: collision with root package name */
    public final List f131426g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f131427h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String uid, boolean z13, String text, List textTags, String str) {
        super(uid, str);
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(textTags, "textTags");
        this.f131424e = uid;
        this.f131425f = text;
        this.f131426g = textTags;
        this.f131427h = z13;
    }

    @Override // dl1.u
    public final String a() {
        return this.f131424e;
    }
}
