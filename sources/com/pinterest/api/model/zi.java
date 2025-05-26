package com.pinterest.api.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0011\u0018\u00002\u00020\u0001:\u0001\u0012B\t\b\u0012¢\u0006\u0004\b\u000f\u0010\u0010B1\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0011R(\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@BX\u0087\u000e¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006R(\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@BX\u0087\u000e¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0006R(\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@BX\u0087\u000e¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\b\u0010\u0006R(\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@BX\u0087\u000e¢\u0006\f\n\u0004\b\f\u0010\u0005\u001a\u0004\b\r\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/pinterest/api/model/zi;", "", "", "<set-?>", "a", "Ljava/lang/Float;", "()Ljava/lang/Float;", "mobile", "b", "c", "tabletPortrait", "tabletLandscape", "d", "getWeb", "web", "<init>", "()V", "(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V", "com/pinterest/api/model/yi", "models_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class zi {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("mobile")
    private Float mobile;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("tablet_portrait")
    private Float tabletPortrait;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("tablet_landscape")
    private Float tabletLandscape;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @om.b("web")
    private Float web;

    static {
        new yi(null);
    }

    private zi() {
    }

    public zi(Float f13, Float f14, Float f15, Float f16) {
        this.mobile = f13;
        this.tabletPortrait = f14;
        this.tabletLandscape = f15;
        this.web = f16;
    }

    /* renamed from: a, reason: from getter */
    public final Float getMobile() {
        return this.mobile;
    }

    /* renamed from: b, reason: from getter */
    public final Float getTabletLandscape() {
        return this.tabletLandscape;
    }

    /* renamed from: c, reason: from getter */
    public final Float getTabletPortrait() {
        return this.tabletPortrait;
    }
}
