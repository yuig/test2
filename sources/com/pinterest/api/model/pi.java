package com.pinterest.api.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0001\u000eB\t\b\u0012¢\u0006\u0004\b\n\u0010\u000bB'\b\u0016\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\u000f"}, d2 = {"Lcom/pinterest/api/model/pi;", "", "", "a", "Ljava/lang/Integer;", "userRepStyle", "b", "exploreArticleRepStyle", "c", "moreIdeasRepStyle", "<init>", "()V", "bubbleRepStyle", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "com/pinterest/api/model/oi", "models_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class pi {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("user_rep_style")
    private Integer userRepStyle;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("explore_article_rep_style")
    private Integer exploreArticleRepStyle;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("more_ideas_rep_style")
    private Integer moreIdeasRepStyle;

    static {
        new oi(null);
    }

    private pi() {
    }

    public pi(Integer num, Integer num2, Integer num3) {
        this.userRepStyle = num;
        this.exploreArticleRepStyle = num2;
        this.moreIdeasRepStyle = num3;
    }

    public final z32.y0 a() {
        Integer num = this.exploreArticleRepStyle;
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        z32.y0.Companion.getClass();
        return z32.w0.a(intValue);
    }

    public final z32.w1 b() {
        Integer num = this.moreIdeasRepStyle;
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        z32.w1.Companion.getClass();
        if (intValue == 1) {
            return z32.w1.LIST_ITEM_CARDS;
        }
        if (intValue == 2) {
            return z32.w1.LIST_ITEM;
        }
        if (intValue == 3) {
            return z32.w1.LIST_ITEM_CARDS_SQUARE;
        }
        if (intValue != 4) {
            return null;
        }
        return z32.w1.LIST_ITEM_CARDS_FEED;
    }

    public final z32.a3 c() {
        Integer num = this.userRepStyle;
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        z32.a3.Companion.getClass();
        return z32.y2.a(intValue);
    }
}
