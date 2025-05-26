package com.pinterest.api.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u000bB\t\b\u0012¢\u0006\u0004\b\b\u0010\tB\u001d\b\u0016\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\f"}, d2 = {"Lcom/pinterest/api/model/ri;", "", "", "a", "Ljava/lang/Integer;", "top", "b", "bottom", "<init>", "()V", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "com/pinterest/api/model/qi", "models_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ri {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("top")
    private Integer top;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("bottom")
    private Integer bottom;

    static {
        new qi(null);
    }

    private ri() {
    }

    public ri(Integer num, Integer num2) {
        this.top = num;
        this.bottom = num2;
    }

    public final z32.b1 a() {
        Integer num = this.bottom;
        if (num != null) {
            int intValue = num.intValue();
            z32.b1.Companion.getClass();
            z32.b1 a13 = z32.z0.a(intValue);
            if (a13 == null) {
                a13 = z32.b1.NONE;
            }
            if (a13 != null) {
                return a13;
            }
        }
        return z32.b1.NONE;
    }

    public final z32.b1 b() {
        Integer num = this.top;
        if (num != null) {
            int intValue = num.intValue();
            z32.b1.Companion.getClass();
            z32.b1 a13 = z32.z0.a(intValue);
            if (a13 == null) {
                a13 = z32.b1.NONE;
            }
            if (a13 != null) {
                return a13;
            }
        }
        return z32.b1.NONE;
    }
}
