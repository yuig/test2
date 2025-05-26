package com.pinterest.api.model;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@xk2.d
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB'\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/pinterest/api/model/CreatorRecommendationItemFeed;", "Lcom/pinterest/api/model/Feed;", "Lcom/pinterest/api/model/jg;", "Lvd0/c;", "obj", "", "baseUrl", "Lke0/b;", "deserializer", "<init>", "(Lvd0/c;Ljava/lang/String;Lke0/b;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "CREATOR", "com/pinterest/api/model/kg", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class CreatorRecommendationItemFeed extends Feed<jg> {

    @NotNull
    public static final kg CREATOR = new kg(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatorRecommendationItemFeed(@NotNull vd0.c obj, @NotNull String baseUrl, @NotNull ke0.b deserializer) {
        super(obj, baseUrl);
        List arrayList;
        Intrinsics.checkNotNullParameter(obj, "obj");
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        try {
            vd0.a k13 = obj.k("data");
            Intrinsics.checkNotNullExpressionValue(k13, "optJsonArray(...)");
            arrayList = deserializer.c(k13);
        } catch (Exception unused) {
            arrayList = new ArrayList();
        }
        H(arrayList);
    }

    @Override // com.pinterest.api.model.Feed
    public final List u() {
        return new ArrayList();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatorRecommendationItemFeed(@NotNull Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
