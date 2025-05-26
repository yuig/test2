package com.pinterest.api.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002¢\u0006\u0004\b\u0010\u0010\u0011R(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR(\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0005\u001a\u0004\b\r\u0010\u0007\"\u0004\b\u000e\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/pinterest/api/model/t50;", "", "", "Lcom/pinterest/api/model/s50;", "a", "Ljava/util/List;", "getTags", "()Ljava/util/List;", "setTags", "(Ljava/util/List;)V", "tags", "Lcom/pinterest/api/model/vh;", "b", "getStory", "setStory", "story", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "models_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class t50 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("tags")
    @NotNull
    private List<? extends s50> tags;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("story")
    @NotNull
    private List<? extends vh> story;

    public t50(@NotNull List<? extends s50> tags, @NotNull List<? extends vh> story) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(story, "story");
        this.tags = tags;
        this.story = story;
    }
}
