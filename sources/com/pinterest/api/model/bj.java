package com.pinterest.api.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u0011B\t\b\u0012¢\u0006\u0004\b\u000e\u0010\u000fB\u001d\b\u0016\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R$\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8\u0006@BX\u0087\u000e¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/pinterest/api/model/bj;", "", "", "a", "Ljava/lang/Integer;", "bottomCornerRadius", "b", "bottomPadding", "", "<set-?>", "c", "Z", "()Z", "showUser", "<init>", "()V", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "com/pinterest/api/model/aj", "models_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class bj {

    /* renamed from: a, reason: from kotlin metadata */
    @om.b("bottom_corner_radius")
    private Integer bottomCornerRadius;

    /* renamed from: b, reason: from kotlin metadata */
    @om.b("bottom_padding")
    private Integer bottomPadding;

    /* renamed from: c, reason: from kotlin metadata */
    @om.b("show_user")
    private boolean showUser;

    static {
        new aj(null);
    }

    private bj() {
    }

    public bj(Integer num, Integer num2) {
        this.bottomCornerRadius = num;
        this.bottomPadding = num2;
    }

    public final z32.s0 a() {
        Integer num = this.bottomCornerRadius;
        if (num != null) {
            int intValue = num.intValue();
            z32.s0.Companion.getClass();
            z32.s0 a13 = z32.q0.a(intValue);
            if (a13 != null) {
                return a13;
            }
        }
        return z32.s0.NONE;
    }

    public final z32.a0 b() {
        Integer num = this.bottomPadding;
        if (num != null) {
            int intValue = num.intValue();
            z32.a0.Companion.getClass();
            z32.a0 a13 = z32.y.a(intValue);
            if (a13 != null) {
                return a13;
            }
        }
        return z32.a0.MEDIUM;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getShowUser() {
        return this.showUser;
    }
}
