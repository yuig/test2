package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import vh.f;

@Deprecated
/* loaded from: classes3.dex */
public class RegisterRequestParams extends RequestParams {

    @NonNull
    public static final Parcelable.Creator<RegisterRequestParams> CREATOR = new f(28);

    /* renamed from: f, reason: collision with root package name */
    public final Integer f31209f;

    /* renamed from: g, reason: collision with root package name */
    public final Double f31210g;

    /* renamed from: h, reason: collision with root package name */
    public final Uri f31211h;

    /* renamed from: i, reason: collision with root package name */
    public final List f31212i;

    /* renamed from: j, reason: collision with root package name */
    public final List f31213j;

    /* renamed from: k, reason: collision with root package name */
    public final ChannelIdValue f31214k;

    /* renamed from: l, reason: collision with root package name */
    public final String f31215l;

    public RegisterRequestParams(Integer num, Double d2, Uri uri, ArrayList arrayList, ArrayList arrayList2, ChannelIdValue channelIdValue, String str) {
        this.f31209f = num;
        this.f31210g = d2;
        this.f31211h = uri;
        d.i("empty list of register requests is provided", (arrayList == null || arrayList.isEmpty()) ? false : true);
        this.f31212i = arrayList;
        this.f31213j = arrayList2;
        this.f31214k = channelIdValue;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            RegisterRequest registerRequest = (RegisterRequest) it.next();
            d.i("register request has null appId and no request appId is provided", (uri == null && registerRequest.f31208i == null) ? false : true);
            String str2 = registerRequest.f31208i;
            if (str2 != null) {
                hashSet.add(Uri.parse(str2));
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            RegisteredKey registeredKey = (RegisteredKey) it2.next();
            d.i("registered key has null appId and no request appId is provided", (uri == null && registeredKey.f31220g == null) ? false : true);
            String str3 = registeredKey.f31220g;
            if (str3 != null) {
                hashSet.add(Uri.parse(str3));
            }
        }
        d.i("Display Hint cannot be longer than 80 characters", str == null || str.length() <= 80);
        this.f31215l = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterRequestParams)) {
            return false;
        }
        RegisterRequestParams registerRequestParams = (RegisterRequestParams) obj;
        if (c.x(this.f31209f, registerRequestParams.f31209f) && c.x(this.f31210g, registerRequestParams.f31210g) && c.x(this.f31211h, registerRequestParams.f31211h) && c.x(this.f31212i, registerRequestParams.f31212i)) {
            List list = this.f31213j;
            List list2 = registerRequestParams.f31213j;
            if (((list == null && list2 == null) || (list != null && list2 != null && list.containsAll(list2) && list2.containsAll(list))) && c.x(this.f31214k, registerRequestParams.f31214k) && c.x(this.f31215l, registerRequestParams.f31215l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31209f, this.f31211h, this.f31210g, this.f31212i, this.f31213j, this.f31214k, this.f31215l});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.F2(parcel, 2, this.f31209f);
        bs1.c.C2(parcel, 3, this.f31210g);
        bs1.c.H2(parcel, 4, this.f31211h, i13, false);
        bs1.c.L2(parcel, 5, this.f31212i, false);
        bs1.c.L2(parcel, 6, this.f31213j, false);
        bs1.c.H2(parcel, 7, this.f31214k, i13, false);
        bs1.c.I2(parcel, 8, this.f31215l, false);
        bs1.c.N2(parcel, M2);
    }
}
