package com.pinterest.api.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\u0018\u00002\u00020\u0001:\u0001\u001cB\t\b\u0012¢\u0006\u0004\b\u0016\u0010\u0017BO\b\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0016\u0010\u001bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/pinterest/api/model/hj;", "", "", "a", "Ljava/lang/String;", "thumbnailImageUrl", "b", "thumbnailDeeplinkUrl", "", "c", "Ljava/lang/Float;", "widthHeightRatio", "", "d", "Ljava/lang/Integer;", "thumbnailWidth", "e", "thumbnailCornerRadius", "f", "thumbnailPositioning", "g", "thumbnailOverlay", "<init>", "()V", "thumbnailImage", "thumbnailUrl", "thumbnailWidthHeightRatio", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "com/pinterest/api/model/gj", "models_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class hj {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("thumbnail_image")
    private String thumbnailImageUrl;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("thumbnail_url")
    private String thumbnailDeeplinkUrl;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("thumbnail_width_height_ratio")
    private Float widthHeightRatio;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @om.b("thumbnail_width")
    private Integer thumbnailWidth;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @om.b("thumbnail_corner_radius")
    private Integer thumbnailCornerRadius;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @om.b("thumbnail_positioning")
    private Integer thumbnailPositioning;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @om.b("thumbnail_overlay")
    private Integer thumbnailOverlay;

    static {
        new gj(null);
    }

    private hj() {
    }

    public hj(String str, String str2, Float f13, Integer num, Integer num2, Integer num3, Integer num4) {
        this.thumbnailImageUrl = str;
        this.thumbnailDeeplinkUrl = str2;
        this.widthHeightRatio = f13;
        this.thumbnailWidth = num;
        this.thumbnailCornerRadius = num2;
        this.thumbnailPositioning = num3;
        this.thumbnailOverlay = num4;
    }

    public final z32.l2 a() {
        Integer num = this.thumbnailCornerRadius;
        if (num != null) {
            int intValue = num.intValue();
            z32.l2.Companion.getClass();
            z32.l2 a13 = z32.j2.a(intValue);
            if (a13 == null) {
                a13 = z32.l2.NONE;
            }
            if (a13 != null) {
                return a13;
            }
        }
        return z32.l2.NONE;
    }

    /* renamed from: b, reason: from getter */
    public final String getThumbnailDeeplinkUrl() {
        return this.thumbnailDeeplinkUrl;
    }

    /* renamed from: c, reason: from getter */
    public final String getThumbnailImageUrl() {
        return this.thumbnailImageUrl;
    }

    public final z32.o2 d() {
        Integer num = this.thumbnailWidth;
        if (num != null) {
            int intValue = num.intValue();
            z32.o2.Companion.getClass();
            z32.o2 a13 = z32.m2.a(intValue);
            if (a13 == null) {
                a13 = z32.o2.NONE;
            }
            if (a13 != null) {
                return a13;
            }
        }
        return z32.o2.NONE;
    }

    /* renamed from: e, reason: from getter */
    public final Float getWidthHeightRatio() {
        return this.widthHeightRatio;
    }
}
