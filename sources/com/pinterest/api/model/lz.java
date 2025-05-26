package com.pinterest.api.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001a\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\b\u0010\u0005R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0005¨\u0006\u0019"}, d2 = {"Lcom/pinterest/api/model/lz;", "", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "key", "", "b", "Z", "isBiz", "()Z", "c", "label", "", "Lcom/pinterest/api/model/mz;", "d", "Ljava/util/List;", "()Ljava/util/List;", "subcategories", "e", "getType", "type", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "models_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class lz {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("key")
    @NotNull
    private final String key;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("is_biz")
    private final boolean isBiz;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("label")
    @NotNull
    private final String label;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @om.b("subcategories")
    @NotNull
    private final List<mz> subcategories;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @om.b("type")
    @NotNull
    private final String type;

    public lz(@NotNull String key, boolean z13, @NotNull String label, @NotNull List<mz> subcategories, @NotNull String type) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(subcategories, "subcategories");
        Intrinsics.checkNotNullParameter(type, "type");
        this.key = key;
        this.isBiz = z13;
        this.label = label;
        this.subcategories = subcategories;
        this.type = type;
    }

    /* renamed from: a, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: b, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: c, reason: from getter */
    public final List getSubcategories() {
        return this.subcategories;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lz)) {
            return false;
        }
        lz lzVar = (lz) obj;
        return Intrinsics.d(this.key, lzVar.key) && this.isBiz == lzVar.isBiz && Intrinsics.d(this.label, lzVar.label) && Intrinsics.d(this.subcategories, lzVar.subcategories) && Intrinsics.d(this.type, lzVar.type);
    }

    public final int hashCode() {
        return this.type.hashCode() + ep.b.c(this.subcategories, a.cb.d(this.label, ep.b.e(this.isBiz, this.key.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        String str = this.key;
        boolean z13 = this.isBiz;
        String str2 = this.label;
        List<mz> list = this.subcategories;
        String str3 = this.type;
        StringBuilder sb3 = new StringBuilder("NotificationSettingCategory(key=");
        sb3.append(str);
        sb3.append(", isBiz=");
        sb3.append(z13);
        sb3.append(", label=");
        sb3.append(str2);
        sb3.append(", subcategories=");
        sb3.append(list);
        sb3.append(", type=");
        return a.a.p(sb3, str3, ")");
    }
}
