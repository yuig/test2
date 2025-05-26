package com.pinterest.api.model;

import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u001eB\t\b\u0012¢\u0006\u0004\b\u001b\u0010\u001cBA\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014¢\u0006\u0004\b\u001b\u0010\u001dR(\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@BX\u0087\u000e¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R(\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\t8\u0006@BX\u0087\u000e¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R(\u0010\u0013\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@BX\u0087\u000e¢\u0006\f\n\u0004\b\u0006\u0010\u0005\u001a\u0004\b\u0004\u0010\u0007R4\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0006@BX\u0087\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/pinterest/api/model/ji;", "", "", "<set-?>", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "imageUrl", "", "b", "Ljava/lang/Float;", "f", "()Ljava/lang/Float;", "widthHeightRatio", "", "c", "Ljava/lang/Integer;", "imageStyle", "dominantColor", "", "Lcom/pinterest/api/model/hj;", "e", "Ljava/util/List;", "()Ljava/util/List;", "thumbnails", "headerImageIcon", "<init>", "()V", "(Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V", "com/pinterest/api/model/ii", "models_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class ji {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("image_url")
    private String imageUrl;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("width_height_ratio")
    private Float widthHeightRatio;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("image_style")
    private Integer imageStyle;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @om.b("dominant_color")
    private String dominantColor;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @om.b("thumbnails")
    private List<hj> thumbnails;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @om.b("header_image_icon")
    private Integer headerImageIcon;

    static {
        new ii(null);
    }

    private ji() {
    }

    public ji(String str, Float f13, Integer num, String str2, List<hj> list) {
        this.imageUrl = str;
        this.widthHeightRatio = f13;
        this.imageStyle = num;
        this.dominantColor = str2;
        this.thumbnails = list;
    }

    /* renamed from: a, reason: from getter */
    public final String getDominantColor() {
        return this.dominantColor;
    }

    public final z32.n1 b() {
        Integer num = this.headerImageIcon;
        if (num != null) {
            int intValue = num.intValue();
            z32.n1.Companion.getClass();
            z32.n1 a13 = z32.l1.a(intValue);
            if (a13 == null) {
                a13 = z32.n1.NONE;
            }
            if (a13 != null) {
                return a13;
            }
        }
        return z32.n1.NONE;
    }

    public final z32.k1 c() {
        Integer num = this.imageStyle;
        if (num != null) {
            int intValue = num.intValue();
            z32.k1.Companion.getClass();
            z32.k1 k1Var = intValue != 0 ? intValue != 1 ? intValue != 2 ? null : z32.k1.ICON_ABOVE : z32.k1.BLUR : z32.k1.NONE;
            if (k1Var == null) {
                k1Var = z32.k1.NONE;
            }
            if (k1Var != null) {
                return k1Var;
            }
        }
        return z32.k1.NONE;
    }

    /* renamed from: d, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: e, reason: from getter */
    public final List getThumbnails() {
        return this.thumbnails;
    }

    /* renamed from: f, reason: from getter */
    public final Float getWidthHeightRatio() {
        return this.widthHeightRatio;
    }
}
