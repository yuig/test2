package com.pinterest.api.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0015B%\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/pinterest/api/model/xf;", "", "Lcom/pinterest/api/model/r7;", "a", "Lcom/pinterest/api/model/r7;", "()Lcom/pinterest/api/model/r7;", "bitmapMask", "", "b", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "", "c", "Ljava/lang/Integer;", "getItemType", "()Ljava/lang/Integer;", "itemType", "<init>", "(Lcom/pinterest/api/model/r7;Ljava/lang/String;Ljava/lang/Integer;)V", "com/pinterest/api/model/wf", "models_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class xf {

    /* renamed from: d, reason: collision with root package name */
    public static final wf f43662d = new wf(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("bitmap_mask")
    private final r7 bitmapMask;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("id")
    private final String id;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("item_type")
    private final Integer itemType;

    public xf(r7 r7Var, String str, Integer num) {
        this.bitmapMask = r7Var;
        this.id = str;
        this.itemType = num;
    }

    /* renamed from: a, reason: from getter */
    public final r7 getBitmapMask() {
        return this.bitmapMask;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xf)) {
            return false;
        }
        xf xfVar = (xf) obj;
        return Intrinsics.d(this.bitmapMask, xfVar.bitmapMask) && Intrinsics.d(this.id, xfVar.id) && Intrinsics.d(this.itemType, xfVar.itemType);
    }

    public final int hashCode() {
        r7 r7Var = this.bitmapMask;
        int hashCode = (r7Var == null ? 0 : r7Var.hashCode()) * 31;
        String str = this.id;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.itemType;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        r7 r7Var = this.bitmapMask;
        String str = this.id;
        Integer num = this.itemType;
        StringBuilder sb3 = new StringBuilder("CoverShuffleAsset(bitmapMask=");
        sb3.append(r7Var);
        sb3.append(", id=");
        sb3.append(str);
        sb3.append(", itemType=");
        return a.c.i(sb3, num, ")");
    }
}
