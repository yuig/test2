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

@Deprecated
/* loaded from: classes3.dex */
public class SignRequestParams extends RequestParams {

    @NonNull
    public static final Parcelable.Creator<SignRequestParams> CREATOR = new wh.a(1);

    /* renamed from: f, reason: collision with root package name */
    public final Integer f31222f;

    /* renamed from: g, reason: collision with root package name */
    public final Double f31223g;

    /* renamed from: h, reason: collision with root package name */
    public final Uri f31224h;

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f31225i;

    /* renamed from: j, reason: collision with root package name */
    public final List f31226j;

    /* renamed from: k, reason: collision with root package name */
    public final ChannelIdValue f31227k;

    /* renamed from: l, reason: collision with root package name */
    public final String f31228l;

    public SignRequestParams(Integer num, Double d2, Uri uri, byte[] bArr, ArrayList arrayList, ChannelIdValue channelIdValue, String str) {
        this.f31222f = num;
        this.f31223g = d2;
        this.f31224h = uri;
        this.f31225i = bArr;
        this.f31226j = arrayList;
        this.f31227k = channelIdValue;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                RegisteredKey registeredKey = (RegisteredKey) it.next();
                d.i("registered key has null appId and no request appId is provided", (registeredKey.f31220g == null && uri == null) ? false : true);
                String str2 = registeredKey.f31220g;
                if (str2 != null) {
                    hashSet.add(Uri.parse(str2));
                }
            }
        }
        d.i("Display Hint cannot be longer than 80 characters", str == null || str.length() <= 80);
        this.f31228l = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignRequestParams)) {
            return false;
        }
        SignRequestParams signRequestParams = (SignRequestParams) obj;
        if (c.x(this.f31222f, signRequestParams.f31222f) && c.x(this.f31223g, signRequestParams.f31223g) && c.x(this.f31224h, signRequestParams.f31224h) && Arrays.equals(this.f31225i, signRequestParams.f31225i)) {
            List list = this.f31226j;
            List list2 = signRequestParams.f31226j;
            if (list.containsAll(list2) && list2.containsAll(list) && c.x(this.f31227k, signRequestParams.f31227k) && c.x(this.f31228l, signRequestParams.f31228l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31222f, this.f31224h, this.f31223g, this.f31226j, this.f31227k, this.f31228l, Integer.valueOf(Arrays.hashCode(this.f31225i))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.F2(parcel, 2, this.f31222f);
        bs1.c.C2(parcel, 3, this.f31223g);
        bs1.c.H2(parcel, 4, this.f31224h, i13, false);
        bs1.c.B2(parcel, 5, this.f31225i, false);
        bs1.c.L2(parcel, 6, this.f31226j, false);
        bs1.c.H2(parcel, 7, this.f31227k, i13, false);
        bs1.c.I2(parcel, 8, this.f31228l, false);
        bs1.c.N2(parcel, M2);
    }
}
