package com.pinterest.api.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\rB\u001b\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/pinterest/api/model/vf;", "", "", "a", "Ljava/lang/Double;", "getX", "()Ljava/lang/Double;", "x", "b", "getY", "y", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;)V", "com/pinterest/api/model/uf", "models_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class vf {

    /* renamed from: c, reason: collision with root package name */
    public static final uf f42836c = new uf(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("x")
    private final Double x;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("y")
    private final Double y;

    public vf(Double d2, Double d13) {
        this.x = d2;
        this.y = d13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vf)) {
            return false;
        }
        vf vfVar = (vf) obj;
        return Intrinsics.d(this.x, vfVar.x) && Intrinsics.d(this.y, vfVar.y);
    }

    public final int hashCode() {
        Double d2 = this.x;
        int hashCode = (d2 == null ? 0 : d2.hashCode()) * 31;
        Double d13 = this.y;
        return hashCode + (d13 != null ? d13.hashCode() : 0);
    }

    public final String toString() {
        return "CoverPosition(x=" + this.x + ", y=" + this.y + ")";
    }
}
