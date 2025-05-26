package com.pinterest.api.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0017B\t\b\u0012¢\u0006\u0004\b\u0013\u0010\u0014B1\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0016R(\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@BX\u0087\u000e¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R(\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@BX\u0087\u000e¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007R(\u0010\u000f\u001a\u0004\u0018\u00010\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\f8\u0006@BX\u0087\u000e¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u0004\u0010\u000eR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/pinterest/api/model/zh;", "", "", "<set-?>", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "text", "b", "c", "subSpanText", "Lcom/pinterest/api/model/xh;", "Lcom/pinterest/api/model/xh;", "()Lcom/pinterest/api/model/xh;", "attributionAction", "", "Ljava/lang/Integer;", "icon", "<init>", "()V", "subspanText", "(Ljava/lang/String;Ljava/lang/String;Lcom/pinterest/api/model/xh;Ljava/lang/Integer;)V", "com/pinterest/api/model/yh", "models_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class zh {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("text")
    private String text;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("subspan_text")
    private String subSpanText;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("attribution_action")
    private xh attributionAction;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @om.b("icon")
    private Integer icon;

    static {
        new yh(null);
    }

    private zh() {
    }

    public zh(String str, String str2, xh xhVar, Integer num) {
        this.text = str;
        this.subSpanText = str2;
        this.attributionAction = xhVar;
        this.icon = num;
    }

    /* renamed from: a, reason: from getter */
    public final xh getAttributionAction() {
        return this.attributionAction;
    }

    public final z32.r b() {
        Integer num = this.icon;
        if (num == null) {
            return z32.r.NONE;
        }
        int intValue = num.intValue();
        z32.r.Companion.getClass();
        z32.r rVar = intValue != 0 ? intValue != 1 ? intValue != 2 ? intValue != 3 ? null : z32.r.ARROW_UP_RIGHT_PROMOTED : z32.r.INFO : z32.r.PINTEREST : z32.r.NONE;
        return rVar == null ? z32.r.NONE : rVar;
    }

    /* renamed from: c, reason: from getter */
    public final String getSubSpanText() {
        return this.subSpanText;
    }

    /* renamed from: d, reason: from getter */
    public final String getText() {
        return this.text;
    }
}
