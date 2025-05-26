package com.pinterest.api.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0003\u0010\fR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0011\u0010\u0006¨\u0006\u0015"}, d2 = {"Lcom/pinterest/api/model/mz;", "", "", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "key", "", "Lcom/pinterest/api/model/iz;", "b", "Ljava/util/List;", "()Ljava/util/List;", "channelOptions", "c", "channelOptionsLabel", "description", "e", "label", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "models_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class mz {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("key")
    @NotNull
    private final String key;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("channel_options")
    @NotNull
    private final List<iz> channelOptions;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("channel_options_label")
    @NotNull
    private final String channelOptionsLabel;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @om.b("description")
    @NotNull
    private final String description;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @om.b("label")
    @NotNull
    private final String label;

    public mz(@NotNull String key, @NotNull List<iz> channelOptions, @NotNull String channelOptionsLabel, @NotNull String description, @NotNull String label) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(channelOptions, "channelOptions");
        Intrinsics.checkNotNullParameter(channelOptionsLabel, "channelOptionsLabel");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(label, "label");
        this.key = key;
        this.channelOptions = channelOptions;
        this.channelOptionsLabel = channelOptionsLabel;
        this.description = description;
        this.label = label;
    }

    /* renamed from: a, reason: from getter */
    public final List getChannelOptions() {
        return this.channelOptions;
    }

    /* renamed from: b, reason: from getter */
    public final String getChannelOptionsLabel() {
        return this.channelOptionsLabel;
    }

    /* renamed from: c, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: d, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: e, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mz)) {
            return false;
        }
        mz mzVar = (mz) obj;
        return Intrinsics.d(this.key, mzVar.key) && Intrinsics.d(this.channelOptions, mzVar.channelOptions) && Intrinsics.d(this.channelOptionsLabel, mzVar.channelOptionsLabel) && Intrinsics.d(this.description, mzVar.description) && Intrinsics.d(this.label, mzVar.label);
    }

    public final int hashCode() {
        return this.label.hashCode() + a.cb.d(this.description, a.cb.d(this.channelOptionsLabel, ep.b.c(this.channelOptions, this.key.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        String str = this.key;
        List<iz> list = this.channelOptions;
        String str2 = this.channelOptionsLabel;
        String str3 = this.description;
        String str4 = this.label;
        StringBuilder sb3 = new StringBuilder("NotificationsSettingSubcategory(key=");
        sb3.append(str);
        sb3.append(", channelOptions=");
        sb3.append(list);
        sb3.append(", channelOptionsLabel=");
        a.a.B(sb3, str2, ", description=", str3, ", label=");
        return a.a.p(sb3, str4, ")");
    }
}
