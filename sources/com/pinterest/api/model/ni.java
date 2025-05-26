package com.pinterest.api.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R(\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@BX\u0087\u000e¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/pinterest/api/model/ni;", "", "", "a", "Ljava/lang/Long;", "_itemId", "", "<set-?>", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "url", "<init>", "()V", "com/pinterest/api/model/mi", "models_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class ni {

    /* renamed from: c, reason: collision with root package name */
    public static final mi f40402c = new mi(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("item_id")
    private Long _itemId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("url")
    private String url;

    public final String a() {
        Long l13 = this._itemId;
        if (l13 != null) {
            return l13.toString();
        }
        return null;
    }

    /* renamed from: b, reason: from getter */
    public final String getUrl() {
        return this.url;
    }
}
