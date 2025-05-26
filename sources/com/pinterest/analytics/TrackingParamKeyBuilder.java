package com.pinterest.analytics;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import h32.a4;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nx.f1;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/analytics/TrackingParamKeyBuilder;", "Landroid/os/Parcelable;", "analytics_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class TrackingParamKeyBuilder implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TrackingParamKeyBuilder> CREATOR = new f1(0);

    /* renamed from: a, reason: collision with root package name */
    public d4 f35481a;

    /* renamed from: b, reason: collision with root package name */
    public a4 f35482b;

    /* renamed from: c, reason: collision with root package name */
    public String f35483c;

    public TrackingParamKeyBuilder(a4 a4Var, d4 viewType, String str) {
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        this.f35481a = viewType;
        this.f35482b = a4Var;
        this.f35483c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f35481a.value());
        a4 a4Var = this.f35482b;
        if (a4Var != null) {
            Intrinsics.f(a4Var);
            dest.writeInt(a4Var.value());
        } else {
            dest.writeInt(-1);
        }
        String str = this.f35483c;
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        dest.writeString(str);
    }
}
