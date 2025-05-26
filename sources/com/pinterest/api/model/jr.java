package com.pinterest.api.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u00002\u00020\u0001:\u0001\u0012B)\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/pinterest/api/model/jr;", "Ldl1/s;", "", "a", "Ljava/lang/String;", "getCaption", "()Ljava/lang/String;", "caption", "b", "feedType", "c", "getFeedTitle", "feedTitle", "d", "getFeedSubtitle", "feedSubtitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "com/pinterest/api/model/ir", "models_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class jr implements dl1.s {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("caption")
    @NotNull
    private final String caption;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("feed_type")
    @NotNull
    private final String feedType;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("feed_title")
    @NotNull
    private final String feedTitle;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @om.b("feed_subtitle")
    private final String feedSubtitle;

    /* renamed from: e, reason: collision with root package name */
    public v7 f39126e;

    static {
        new ir(null);
    }

    public jr(@NotNull String caption, @NotNull String feedType, @NotNull String feedTitle, String str) {
        Intrinsics.checkNotNullParameter(caption, "caption");
        Intrinsics.checkNotNullParameter(feedType, "feedType");
        Intrinsics.checkNotNullParameter(feedTitle, "feedTitle");
        this.caption = caption;
        this.feedType = feedType;
        this.feedTitle = feedTitle;
        this.feedSubtitle = str;
    }

    /* renamed from: a, reason: from getter */
    public final String getFeedType() {
        return this.feedType;
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        v7 v7Var = this.f39126e;
        if (v7Var == null) {
            Intrinsics.r("board");
            throw null;
        }
        String id3 = v7Var.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        return id3;
    }

    public final void c(v7 v7Var) {
        Intrinsics.checkNotNullParameter(v7Var, "<set-?>");
        this.f39126e = v7Var;
    }
}
