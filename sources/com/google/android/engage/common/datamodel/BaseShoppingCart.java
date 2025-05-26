package com.google.android.engage.common.datamodel;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import java.util.List;
import ok.v;

@Keep
/* loaded from: classes3.dex */
public abstract class BaseShoppingCart extends BaseCluster {

    @NonNull
    public final Uri actionLinkUri;
    protected final String actionText;

    @NonNull
    public final List<String> itemLabels;
    public final int numberOfItems;

    @NonNull
    public final List<Image> posterImages;
    protected final String title;

    public BaseShoppingCart(int i13, String str, @NonNull List<Image> list, int i14, @NonNull Uri uri, @NonNull List<String> list2, String str2) {
        super(i13);
        bf.b.j("Action link Uri cannot be empty", uri != null);
        this.actionLinkUri = uri;
        bf.b.j("Number of items cannot be less than 0", i14 >= 0);
        this.numberOfItems = i14;
        this.title = str;
        this.posterImages = list;
        this.itemLabels = list2;
        this.actionText = str2;
    }

    @NonNull
    public Uri getActionLinkUri() {
        return this.actionLinkUri;
    }

    @NonNull
    public v getActionText() {
        return !TextUtils.isEmpty(this.actionText) ? v.d(this.actionText) : ok.a.f95409a;
    }

    public String getActionTextInternal() {
        return this.actionText;
    }

    @NonNull
    public List<String> getItemLabels() {
        return this.itemLabels;
    }

    public int getNumberOfItems() {
        return this.numberOfItems;
    }

    @NonNull
    public List<Image> getPosterImages() {
        return this.posterImages;
    }

    @NonNull
    public v getTitle() {
        return !TextUtils.isEmpty(this.title) ? v.d(this.title) : ok.a.f95409a;
    }

    public String getTitleInternal() {
        return this.title;
    }
}
