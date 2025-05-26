package com.pinterest.api.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001dBU\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u0003\u0010\fR\u001a\u0010\u0015\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, d2 = {"Lcom/pinterest/api/model/r7;", "", "", "a", "Ljava/lang/Integer;", "getId", "()Ljava/lang/Integer;", "id", "", "b", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "type", "c", "maskImage", "Lvd0/a;", "d", "Lvd0/a;", "getMaksBounds", "()Lvd0/a;", "maksBounds", "", "x", "y", "width", "height", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lvd0/a;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V", "com/pinterest/api/model/q7", "models_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class r7 {

    /* renamed from: i, reason: collision with root package name */
    public static final q7 f41487i = new q7(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("id")
    private final Integer id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("type")
    private final String type;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("mask_image")
    private final String maskImage;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @om.b("mask_bounds")
    @NotNull
    private final vd0.a maksBounds;

    /* renamed from: e, reason: collision with root package name */
    public final Float f41492e;

    /* renamed from: f, reason: collision with root package name */
    public final Float f41493f;

    /* renamed from: g, reason: collision with root package name */
    public final Float f41494g;

    /* renamed from: h, reason: collision with root package name */
    public final Float f41495h;

    public r7(Integer num, String str, String str2, @NotNull vd0.a maksBounds, Float f13, Float f14, Float f15, Float f16) {
        Intrinsics.checkNotNullParameter(maksBounds, "maksBounds");
        this.id = num;
        this.type = str;
        this.maskImage = str2;
        this.maksBounds = maksBounds;
        this.f41492e = f13;
        this.f41493f = f14;
        this.f41494g = f15;
        this.f41495h = f16;
    }

    /* renamed from: a, reason: from getter */
    public final String getMaskImage() {
        return this.maskImage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r7)) {
            return false;
        }
        r7 r7Var = (r7) obj;
        return Intrinsics.d(this.id, r7Var.id) && Intrinsics.d(this.type, r7Var.type) && Intrinsics.d(this.maskImage, r7Var.maskImage) && Intrinsics.d(this.maksBounds, r7Var.maksBounds) && Intrinsics.d(this.f41492e, r7Var.f41492e) && Intrinsics.d(this.f41493f, r7Var.f41493f) && Intrinsics.d(this.f41494g, r7Var.f41494g) && Intrinsics.d(this.f41495h, r7Var.f41495h);
    }

    public final int hashCode() {
        Integer num = this.id;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.type;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.maskImage;
        int hashCode3 = (this.maksBounds.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        Float f13 = this.f41492e;
        int hashCode4 = (hashCode3 + (f13 == null ? 0 : f13.hashCode())) * 31;
        Float f14 = this.f41493f;
        int hashCode5 = (hashCode4 + (f14 == null ? 0 : f14.hashCode())) * 31;
        Float f15 = this.f41494g;
        int hashCode6 = (hashCode5 + (f15 == null ? 0 : f15.hashCode())) * 31;
        Float f16 = this.f41495h;
        return hashCode6 + (f16 != null ? f16.hashCode() : 0);
    }

    public final String toString() {
        return "BitmapMask(id=" + this.id + ", type=" + this.type + ", maskImage=" + this.maskImage + ", maksBounds=" + this.maksBounds + ", x=" + this.f41492e + ", y=" + this.f41493f + ", width=" + this.f41494g + ", height=" + this.f41495h + ")";
    }
}
