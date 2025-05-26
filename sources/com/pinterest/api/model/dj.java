package com.pinterest.api.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001\u000fB\t\b\u0012¢\u0006\u0004\b\n\u0010\u000bB\u001d\b\u0016\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000eR(\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@BX\u0087\u000e¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006R(\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@BX\u0087\u000e¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\b\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/pinterest/api/model/dj;", "", "", "<set-?>", "a", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "layoutColumns", "b", "layoutRows", "<init>", "()V", "cols", "rows", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "com/pinterest/api/model/cj", "models_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class dj {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("cols")
    private Integer layoutColumns;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("rows")
    private Integer layoutRows;

    static {
        new cj(null);
    }

    private dj() {
    }

    public dj(Integer num, Integer num2) {
        this.layoutColumns = num;
        this.layoutRows = num2;
    }

    /* renamed from: a, reason: from getter */
    public final Integer getLayoutColumns() {
        return this.layoutColumns;
    }

    /* renamed from: b, reason: from getter */
    public final Integer getLayoutRows() {
        return this.layoutRows;
    }
}
