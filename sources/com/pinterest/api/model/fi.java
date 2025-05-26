package com.pinterest.api.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\fB\t\b\u0012¢\u0006\u0004\b\t\u0010\nB\u0013\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\u000bR(\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@BX\u0087\u000e¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/pinterest/api/model/fi;", "", "", "<set-?>", "a", "Ljava/lang/Integer;", "getItemStartPadding", "()Ljava/lang/Integer;", "itemStartPadding", "<init>", "()V", "(Ljava/lang/Integer;)V", "com/pinterest/api/model/ei", "models_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class fi {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("item_start_padding")
    private Integer itemStartPadding;

    static {
        new ei(null);
    }

    private fi() {
    }

    public fi(Integer num) {
        this.itemStartPadding = num;
    }

    public final z32.d0 a() {
        Integer num = this.itemStartPadding;
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        z32.d0.Companion.getClass();
        return z32.b0.a(intValue);
    }
}
