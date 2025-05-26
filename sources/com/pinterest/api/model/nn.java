package com.pinterest.api.model;

import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0017\u0010\u0018R*\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR*\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR$\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0004\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0015\u0010\u0012¨\u0006\u001a"}, d2 = {"Lcom/pinterest/api/model/nn;", "", "", "", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "setImageUrls", "(Ljava/util/List;)V", "imageUrls", "getSwatchHexColors", "setSwatchHexColors", "swatchHexColors", "c", "Ljava/lang/String;", "()Ljava/lang/String;", "setDisplay", "(Ljava/lang/String;)V", "display", "d", "setTerm", "term", "<init>", "()V", "com/pinterest/api/model/mn", "models_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class nn {

    /* renamed from: e, reason: collision with root package name */
    public static final mn f40439e = new mn(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("image_urls")
    private List<String> imageUrls;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("swatch_hex_colors")
    private List<String> swatchHexColors;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("display")
    private String display;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @om.b("term")
    private String term;

    /* renamed from: a, reason: from getter */
    public final String getDisplay() {
        return this.display;
    }

    /* renamed from: b, reason: from getter */
    public final List getImageUrls() {
        return this.imageUrls;
    }

    /* renamed from: c, reason: from getter */
    public final String getTerm() {
        return this.term;
    }
}
