package com.google.android.engage.common.datamodel;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import java.util.List;
import ok.v;

@Keep
/* loaded from: classes3.dex */
public abstract class BaseShoppingListCluster extends BaseCluster {

    @NonNull
    protected final Uri actionLinkUri;

    @NonNull
    protected final List<String> itemLabels;
    protected final int numberOfItems;
    protected final String title;

    public BaseShoppingListCluster(int i13, String str, @NonNull List<String> list, int i14, @NonNull Uri uri) {
        super(i13);
        bf.b.j("Action link Uri cannot be empty", uri != null);
        this.actionLinkUri = uri;
        bf.b.j("Number of items cannot be less than 0", i14 >= 0);
        this.numberOfItems = i14;
        this.itemLabels = list;
        if (i14 > 0) {
            bf.b.j("Item labels cannot be empty", !list.isEmpty());
        }
        this.title = str;
    }

    @NonNull
    public Uri getActionLinkUri() {
        return this.actionLinkUri;
    }

    @NonNull
    public List<String> getItemLabels() {
        return this.itemLabels;
    }

    public int getNumberOfItems() {
        return this.numberOfItems;
    }

    @NonNull
    public v getTitle() {
        return !TextUtils.isEmpty(this.title) ? v.d(this.title) : ok.a.f95409a;
    }

    public String getTitleInternal() {
        return this.title;
    }
}
