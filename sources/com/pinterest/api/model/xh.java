package com.pinterest.api.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u000fB\t\b\u0012¢\u0006\u0004\b\f\u0010\rB\u001d\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\u000eR(\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@BX\u0087\u000e¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/pinterest/api/model/xh;", "", "", "<set-?>", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "url", "", "b", "Ljava/lang/Integer;", "subSpanOnly", "<init>", "()V", "(Ljava/lang/String;Ljava/lang/Integer;)V", "com/pinterest/api/model/wh", "models_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class xh {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("url")
    private String url;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("subspan_only")
    private Integer subSpanOnly;

    static {
        new wh(null);
    }

    private xh() {
    }

    public xh(String str, Integer num) {
        this.url = str;
        this.subSpanOnly = num;
    }

    /* renamed from: a, reason: from getter */
    public final String getUrl() {
        return this.url;
    }
}
