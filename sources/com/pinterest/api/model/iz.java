package com.pinterest.api.model;

import com.appsflyer.AppsFlyerProperties;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/pinterest/api/model/iz;", "", "", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", AppsFlyerProperties.CHANNEL, "categoryKey", "c", "subcategoryKey", "", "d", "Z", "()Z", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "models_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class iz {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b(AppsFlyerProperties.CHANNEL)
    @NotNull
    private final String channel;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("category_key")
    @NotNull
    private final String categoryKey;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("subcategory_key")
    @NotNull
    private final String subcategoryKey;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @om.b("value")
    private final boolean value;

    public iz(@NotNull String channel, @NotNull String categoryKey, @NotNull String subcategoryKey, boolean z13) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(categoryKey, "categoryKey");
        Intrinsics.checkNotNullParameter(subcategoryKey, "subcategoryKey");
        this.channel = channel;
        this.categoryKey = categoryKey;
        this.subcategoryKey = subcategoryKey;
        this.value = z13;
    }

    /* renamed from: a, reason: from getter */
    public final String getCategoryKey() {
        return this.categoryKey;
    }

    /* renamed from: b, reason: from getter */
    public final String getChannel() {
        return this.channel;
    }

    /* renamed from: c, reason: from getter */
    public final String getSubcategoryKey() {
        return this.subcategoryKey;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getValue() {
        return this.value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iz)) {
            return false;
        }
        iz izVar = (iz) obj;
        return Intrinsics.d(this.channel, izVar.channel) && Intrinsics.d(this.categoryKey, izVar.categoryKey) && Intrinsics.d(this.subcategoryKey, izVar.subcategoryKey) && this.value == izVar.value;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.value) + a.cb.d(this.subcategoryKey, a.cb.d(this.categoryKey, this.channel.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        String str = this.channel;
        String str2 = this.categoryKey;
        String str3 = this.subcategoryKey;
        boolean z13 = this.value;
        StringBuilder w13 = a.a.w("NotificationChannelOptions(channel=", str, ", categoryKey=", str2, ", subcategoryKey=");
        w13.append(str3);
        w13.append(", value=");
        w13.append(z13);
        w13.append(")");
        return w13.toString();
    }
}
